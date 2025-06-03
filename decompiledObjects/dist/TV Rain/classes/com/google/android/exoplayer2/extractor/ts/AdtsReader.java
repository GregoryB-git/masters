package com.google.android.exoplayer2.extractor.ts;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.DummyTrackOutput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.CodecSpecificDataUtil;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.Arrays;
import java.util.Collections;

public final class AdtsReader
  implements ElementaryStreamReader
{
  private static final int CRC_SIZE = 2;
  private static final int HEADER_SIZE = 5;
  private static final int ID3_HEADER_SIZE = 10;
  private static final byte[] ID3_IDENTIFIER = { 73, 68, 51 };
  private static final int ID3_SIZE_OFFSET = 6;
  private static final int MATCH_STATE_FF = 512;
  private static final int MATCH_STATE_I = 768;
  private static final int MATCH_STATE_ID = 1024;
  private static final int MATCH_STATE_START = 256;
  private static final int MATCH_STATE_VALUE_SHIFT = 8;
  private static final int STATE_CHECKING_ADTS_HEADER = 1;
  private static final int STATE_FINDING_SAMPLE = 0;
  private static final int STATE_READING_ADTS_HEADER = 3;
  private static final int STATE_READING_ID3_HEADER = 2;
  private static final int STATE_READING_SAMPLE = 4;
  private static final String TAG = "AdtsReader";
  private static final int VERSION_UNSET = -1;
  private final ParsableBitArray adtsScratch = new ParsableBitArray(new byte[7]);
  private int bytesRead;
  private int currentFrameVersion;
  private TrackOutput currentOutput;
  private long currentSampleDuration;
  private final boolean exposeId3;
  private int firstFrameSampleRateIndex;
  private int firstFrameVersion;
  private String formatId;
  private boolean foundFirstFrame;
  private boolean hasCrc;
  private boolean hasOutputFormat;
  private final ParsableByteArray id3HeaderBuffer = new ParsableByteArray(Arrays.copyOf(ID3_IDENTIFIER, 10));
  private TrackOutput id3Output;
  private final String language;
  private int matchState;
  private TrackOutput output;
  private long sampleDurationUs;
  private int sampleSize;
  private int state;
  private long timeUs;
  
  public AdtsReader(boolean paramBoolean)
  {
    this(paramBoolean, null);
  }
  
  public AdtsReader(boolean paramBoolean, String paramString)
  {
    setFindingSampleState();
    firstFrameVersion = -1;
    firstFrameSampleRateIndex = -1;
    sampleDurationUs = -9223372036854775807L;
    exposeId3 = paramBoolean;
    language = paramString;
  }
  
  private void checkAdtsHeader(ParsableByteArray paramParsableByteArray)
  {
    if (paramParsableByteArray.bytesLeft() == 0) {
      return;
    }
    adtsScratch.data[0] = ((byte)data[paramParsableByteArray.getPosition()]);
    adtsScratch.setPosition(2);
    int i = adtsScratch.readBits(4);
    int j = firstFrameSampleRateIndex;
    if ((j != -1) && (i != j))
    {
      resetSync();
      return;
    }
    if (!foundFirstFrame)
    {
      foundFirstFrame = true;
      firstFrameVersion = currentFrameVersion;
      firstFrameSampleRateIndex = i;
    }
    setReadingAdtsHeaderState();
  }
  
  private boolean checkSyncPositionValid(ParsableByteArray paramParsableByteArray, int paramInt)
  {
    paramParsableByteArray.setPosition(paramInt + 1);
    byte[] arrayOfByte = adtsScratch.data;
    boolean bool1 = true;
    if (!tryRead(paramParsableByteArray, arrayOfByte, 1)) {
      return false;
    }
    adtsScratch.setPosition(4);
    int i = adtsScratch.readBits(1);
    int j = firstFrameVersion;
    if ((j != -1) && (i != j)) {
      return false;
    }
    if (firstFrameSampleRateIndex != -1)
    {
      if (!tryRead(paramParsableByteArray, adtsScratch.data, 1)) {
        return true;
      }
      adtsScratch.setPosition(2);
      if (adtsScratch.readBits(4) != firstFrameSampleRateIndex) {
        return false;
      }
      paramParsableByteArray.setPosition(paramInt + 2);
    }
    if (!tryRead(paramParsableByteArray, adtsScratch.data, 4)) {
      return true;
    }
    adtsScratch.setPosition(14);
    j = adtsScratch.readBits(13);
    if (j <= 6) {
      return false;
    }
    j = paramInt + j;
    paramInt = j + 1;
    if (paramInt >= paramParsableByteArray.limit()) {
      return true;
    }
    arrayOfByte = data;
    if (isAdtsSyncBytes(arrayOfByte[j], arrayOfByte[paramInt]))
    {
      bool2 = bool1;
      if (firstFrameVersion == -1) {
        break label252;
      }
      if ((data[paramInt] & 0x8) >> 3 == i)
      {
        bool2 = bool1;
        break label252;
      }
    }
    boolean bool2 = false;
    label252:
    return bool2;
  }
  
  private boolean continueRead(ParsableByteArray paramParsableByteArray, byte[] paramArrayOfByte, int paramInt)
  {
    int i = Math.min(paramParsableByteArray.bytesLeft(), paramInt - bytesRead);
    paramParsableByteArray.readBytes(paramArrayOfByte, bytesRead, i);
    i = bytesRead + i;
    bytesRead = i;
    boolean bool;
    if (i == paramInt) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void findNextSample(ParsableByteArray paramParsableByteArray)
  {
    byte[] arrayOfByte = data;
    int i = paramParsableByteArray.getPosition();
    int j = paramParsableByteArray.limit();
    while (i < j)
    {
      int k = i + 1;
      i = arrayOfByte[i] & 0xFF;
      if ((matchState == 512) && (isAdtsSyncBytes((byte)-1, (byte)i)) && ((foundFirstFrame) || (checkSyncPositionValid(paramParsableByteArray, k - 2))))
      {
        currentFrameVersion = ((i & 0x8) >> 3);
        boolean bool = true;
        if ((i & 0x1) != 0) {
          bool = false;
        }
        hasCrc = bool;
        if (!foundFirstFrame) {
          setCheckingAdtsHeaderState();
        } else {
          setReadingAdtsHeaderState();
        }
        paramParsableByteArray.setPosition(k);
        return;
      }
      int m = matchState;
      i |= m;
      if (i != 329)
      {
        if (i != 511)
        {
          if (i != 836)
          {
            if (i != 1075)
            {
              i = k;
              if (m != 256)
              {
                matchState = 256;
                i = k - 1;
              }
            }
            else
            {
              setReadingId3HeaderState();
              paramParsableByteArray.setPosition(k);
            }
          }
          else
          {
            matchState = 1024;
            i = k;
          }
        }
        else
        {
          matchState = 512;
          i = k;
        }
      }
      else
      {
        matchState = 768;
        i = k;
      }
    }
    paramParsableByteArray.setPosition(i);
  }
  
  private boolean isAdtsSyncBytes(byte paramByte1, byte paramByte2)
  {
    return isAdtsSyncWord((paramByte1 & 0xFF) << 8 | paramByte2 & 0xFF);
  }
  
  public static boolean isAdtsSyncWord(int paramInt)
  {
    boolean bool;
    if ((paramInt & 0xFFF6) == 65520) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void parseAdtsHeader()
    throws ParserException
  {
    adtsScratch.setPosition(0);
    if (!hasOutputFormat)
    {
      i = adtsScratch.readBits(2) + 1;
      j = i;
      if (i != 2)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Detected audio object type: ");
        ((StringBuilder)localObject).append(i);
        ((StringBuilder)localObject).append(", but assuming AAC LC.");
        Log.w("AdtsReader", ((StringBuilder)localObject).toString());
        j = 2;
      }
      adtsScratch.skipBits(5);
      i = adtsScratch.readBits(3);
      byte[] arrayOfByte = CodecSpecificDataUtil.buildAacAudioSpecificConfig(j, firstFrameSampleRateIndex, i);
      Object localObject = CodecSpecificDataUtil.parseAacAudioSpecificConfig(arrayOfByte);
      localObject = Format.createAudioSampleFormat(formatId, "audio/mp4a-latm", null, -1, -1, ((Integer)second).intValue(), ((Integer)first).intValue(), Collections.singletonList(arrayOfByte), null, 0, language);
      sampleDurationUs = (1024000000L / sampleRate);
      output.format((Format)localObject);
      hasOutputFormat = true;
    }
    else
    {
      adtsScratch.skipBits(10);
    }
    adtsScratch.skipBits(4);
    int i = adtsScratch.readBits(13) - 2 - 5;
    int j = i;
    if (hasCrc) {
      j = i - 2;
    }
    setReadingSampleState(output, sampleDurationUs, 0, j);
  }
  
  private void parseId3Header()
  {
    id3Output.sampleData(id3HeaderBuffer, 10);
    id3HeaderBuffer.setPosition(6);
    setReadingSampleState(id3Output, 0L, 10, id3HeaderBuffer.readSynchSafeInt() + 10);
  }
  
  private void readSample(ParsableByteArray paramParsableByteArray)
  {
    int i = Math.min(paramParsableByteArray.bytesLeft(), sampleSize - bytesRead);
    currentOutput.sampleData(paramParsableByteArray, i);
    int j = bytesRead + i;
    bytesRead = j;
    i = sampleSize;
    if (j == i)
    {
      currentOutput.sampleMetadata(timeUs, 1, i, 0, null);
      timeUs += currentSampleDuration;
      setFindingSampleState();
    }
  }
  
  private void resetSync()
  {
    foundFirstFrame = false;
    setFindingSampleState();
  }
  
  private void setCheckingAdtsHeaderState()
  {
    state = 1;
    bytesRead = 0;
  }
  
  private void setFindingSampleState()
  {
    state = 0;
    bytesRead = 0;
    matchState = 256;
  }
  
  private void setReadingAdtsHeaderState()
  {
    state = 3;
    bytesRead = 0;
  }
  
  private void setReadingId3HeaderState()
  {
    state = 2;
    bytesRead = ID3_IDENTIFIER.length;
    sampleSize = 0;
    id3HeaderBuffer.setPosition(0);
  }
  
  private void setReadingSampleState(TrackOutput paramTrackOutput, long paramLong, int paramInt1, int paramInt2)
  {
    state = 4;
    bytesRead = paramInt1;
    currentOutput = paramTrackOutput;
    currentSampleDuration = paramLong;
    sampleSize = paramInt2;
  }
  
  private boolean tryRead(ParsableByteArray paramParsableByteArray, byte[] paramArrayOfByte, int paramInt)
  {
    if (paramParsableByteArray.bytesLeft() < paramInt) {
      return false;
    }
    paramParsableByteArray.readBytes(paramArrayOfByte, 0, paramInt);
    return true;
  }
  
  public void consume(ParsableByteArray paramParsableByteArray)
    throws ParserException
  {
    while (paramParsableByteArray.bytesLeft() > 0)
    {
      int i = state;
      if (i != 0)
      {
        if (i != 1)
        {
          if (i != 2)
          {
            if (i != 3)
            {
              if (i == 4) {
                readSample(paramParsableByteArray);
              } else {
                throw new IllegalStateException();
              }
            }
            else
            {
              if (hasCrc) {
                i = 7;
              } else {
                i = 5;
              }
              if (continueRead(paramParsableByteArray, adtsScratch.data, i)) {
                parseAdtsHeader();
              }
            }
          }
          else if (continueRead(paramParsableByteArray, id3HeaderBuffer.data, 10)) {
            parseId3Header();
          }
        }
        else {
          checkAdtsHeader(paramParsableByteArray);
        }
      }
      else {
        findNextSample(paramParsableByteArray);
      }
    }
  }
  
  public void createTracks(ExtractorOutput paramExtractorOutput, TsPayloadReader.TrackIdGenerator paramTrackIdGenerator)
  {
    paramTrackIdGenerator.generateNewId();
    formatId = paramTrackIdGenerator.getFormatId();
    output = paramExtractorOutput.track(paramTrackIdGenerator.getTrackId(), 1);
    if (exposeId3)
    {
      paramTrackIdGenerator.generateNewId();
      paramExtractorOutput = paramExtractorOutput.track(paramTrackIdGenerator.getTrackId(), 4);
      id3Output = paramExtractorOutput;
      paramExtractorOutput.format(Format.createSampleFormat(paramTrackIdGenerator.getFormatId(), "application/id3", null, -1, null));
    }
    else
    {
      id3Output = new DummyTrackOutput();
    }
  }
  
  public long getSampleDurationUs()
  {
    return sampleDurationUs;
  }
  
  public void packetFinished() {}
  
  public void packetStarted(long paramLong, boolean paramBoolean)
  {
    timeUs = paramLong;
  }
  
  public void seek()
  {
    resetSync();
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.ts.AdtsReader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */