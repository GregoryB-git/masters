package com.google.android.exoplayer2.extractor.ts;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.CodecSpecificDataUtil;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.Collections;

public final class LatmReader
  implements ElementaryStreamReader
{
  private static final int INITIAL_BUFFER_SIZE = 1024;
  private static final int STATE_FINDING_SYNC_1 = 0;
  private static final int STATE_FINDING_SYNC_2 = 1;
  private static final int STATE_READING_HEADER = 2;
  private static final int STATE_READING_SAMPLE = 3;
  private static final int SYNC_BYTE_FIRST = 86;
  private static final int SYNC_BYTE_SECOND = 224;
  private int audioMuxVersionA;
  private int bytesRead;
  private int channelCount;
  private Format format;
  private String formatId;
  private int frameLengthType;
  private final String language;
  private int numSubframes;
  private long otherDataLenBits;
  private boolean otherDataPresent;
  private TrackOutput output;
  private final ParsableBitArray sampleBitArray;
  private final ParsableByteArray sampleDataBuffer;
  private long sampleDurationUs;
  private int sampleRateHz;
  private int sampleSize;
  private int secondHeaderByte;
  private int state;
  private boolean streamMuxRead;
  private long timeUs;
  
  public LatmReader(@Nullable String paramString)
  {
    language = paramString;
    paramString = new ParsableByteArray(1024);
    sampleDataBuffer = paramString;
    sampleBitArray = new ParsableBitArray(data);
  }
  
  private static long latmGetValue(ParsableBitArray paramParsableBitArray)
  {
    return paramParsableBitArray.readBits((paramParsableBitArray.readBits(2) + 1) * 8);
  }
  
  private void parseAudioMuxElement(ParsableBitArray paramParsableBitArray)
    throws ParserException
  {
    if (!paramParsableBitArray.readBit())
    {
      streamMuxRead = true;
      parseStreamMuxConfig(paramParsableBitArray);
    }
    else if (!streamMuxRead)
    {
      return;
    }
    if (audioMuxVersionA == 0)
    {
      if (numSubframes == 0)
      {
        parsePayloadMux(paramParsableBitArray, parsePayloadLengthInfo(paramParsableBitArray));
        if (otherDataPresent) {
          paramParsableBitArray.skipBits((int)otherDataLenBits);
        }
        return;
      }
      throw new ParserException();
    }
    throw new ParserException();
  }
  
  private int parseAudioSpecificConfig(ParsableBitArray paramParsableBitArray)
    throws ParserException
  {
    int i = paramParsableBitArray.bitsLeft();
    Pair localPair = CodecSpecificDataUtil.parseAacAudioSpecificConfig(paramParsableBitArray, true);
    sampleRateHz = ((Integer)first).intValue();
    channelCount = ((Integer)second).intValue();
    return i - paramParsableBitArray.bitsLeft();
  }
  
  private void parseFrameLength(ParsableBitArray paramParsableBitArray)
  {
    int i = paramParsableBitArray.readBits(3);
    frameLengthType = i;
    if (i != 0)
    {
      if (i != 1)
      {
        if ((i != 3) && (i != 4) && (i != 5))
        {
          if ((i != 6) && (i != 7)) {
            throw new IllegalStateException();
          }
          paramParsableBitArray.skipBits(1);
        }
        else
        {
          paramParsableBitArray.skipBits(6);
        }
      }
      else {
        paramParsableBitArray.skipBits(9);
      }
    }
    else {
      paramParsableBitArray.skipBits(8);
    }
  }
  
  private int parsePayloadLengthInfo(ParsableBitArray paramParsableBitArray)
    throws ParserException
  {
    if (frameLengthType == 0)
    {
      int i = 0;
      int j;
      int k;
      do
      {
        j = paramParsableBitArray.readBits(8);
        k = i + j;
        i = k;
      } while (j == 255);
      return k;
    }
    throw new ParserException();
  }
  
  private void parsePayloadMux(ParsableBitArray paramParsableBitArray, int paramInt)
  {
    int i = paramParsableBitArray.getPosition();
    if ((i & 0x7) == 0)
    {
      sampleDataBuffer.setPosition(i >> 3);
    }
    else
    {
      paramParsableBitArray.readBits(sampleDataBuffer.data, 0, paramInt * 8);
      sampleDataBuffer.setPosition(0);
    }
    output.sampleData(sampleDataBuffer, paramInt);
    output.sampleMetadata(timeUs, 1, paramInt, 0, null);
    timeUs += sampleDurationUs;
  }
  
  private void parseStreamMuxConfig(ParsableBitArray paramParsableBitArray)
    throws ParserException
  {
    int i = paramParsableBitArray.readBits(1);
    int j;
    if (i == 1) {
      j = paramParsableBitArray.readBits(1);
    } else {
      j = 0;
    }
    audioMuxVersionA = j;
    if (j == 0)
    {
      if (i == 1) {
        latmGetValue(paramParsableBitArray);
      }
      if (paramParsableBitArray.readBit())
      {
        numSubframes = paramParsableBitArray.readBits(6);
        j = paramParsableBitArray.readBits(4);
        int k = paramParsableBitArray.readBits(3);
        if ((j == 0) && (k == 0))
        {
          if (i == 0)
          {
            j = paramParsableBitArray.getPosition();
            k = parseAudioSpecificConfig(paramParsableBitArray);
            paramParsableBitArray.setPosition(j);
            Object localObject = new byte[(k + 7) / 8];
            paramParsableBitArray.readBits((byte[])localObject, 0, k);
            localObject = Format.createAudioSampleFormat(formatId, "audio/mp4a-latm", null, -1, -1, channelCount, sampleRateHz, Collections.singletonList(localObject), null, 0, language);
            if (!((Format)localObject).equals(format))
            {
              format = ((Format)localObject);
              sampleDurationUs = (1024000000L / sampleRate);
              output.format((Format)localObject);
            }
          }
          else
          {
            paramParsableBitArray.skipBits((int)latmGetValue(paramParsableBitArray) - parseAudioSpecificConfig(paramParsableBitArray));
          }
          parseFrameLength(paramParsableBitArray);
          boolean bool = paramParsableBitArray.readBit();
          otherDataPresent = bool;
          otherDataLenBits = 0L;
          if (bool) {
            if (i == 1) {
              otherDataLenBits = latmGetValue(paramParsableBitArray);
            } else {
              do
              {
                bool = paramParsableBitArray.readBit();
                otherDataLenBits = ((otherDataLenBits << 8) + paramParsableBitArray.readBits(8));
              } while (bool);
            }
          }
          if (paramParsableBitArray.readBit()) {
            paramParsableBitArray.skipBits(8);
          }
          return;
        }
        throw new ParserException();
      }
      throw new ParserException();
    }
    throw new ParserException();
  }
  
  private void resetBufferForSize(int paramInt)
  {
    sampleDataBuffer.reset(paramInt);
    sampleBitArray.reset(sampleDataBuffer.data);
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
            if (i == 3)
            {
              i = Math.min(paramParsableByteArray.bytesLeft(), sampleSize - bytesRead);
              paramParsableByteArray.readBytes(sampleBitArray.data, bytesRead, i);
              i = bytesRead + i;
              bytesRead = i;
              if (i == sampleSize)
              {
                sampleBitArray.setPosition(0);
                parseAudioMuxElement(sampleBitArray);
                state = 0;
              }
            }
            else
            {
              throw new IllegalStateException();
            }
          }
          else
          {
            i = (secondHeaderByte & 0xFF1F) << 8 | paramParsableByteArray.readUnsignedByte();
            sampleSize = i;
            if (i > sampleDataBuffer.data.length) {
              resetBufferForSize(i);
            }
            bytesRead = 0;
            state = 3;
          }
        }
        else
        {
          i = paramParsableByteArray.readUnsignedByte();
          if ((i & 0xE0) == 224)
          {
            secondHeaderByte = i;
            state = 2;
          }
          else if (i != 86)
          {
            state = 0;
          }
        }
      }
      else if (paramParsableByteArray.readUnsignedByte() == 86) {
        state = 1;
      }
    }
  }
  
  public void createTracks(ExtractorOutput paramExtractorOutput, TsPayloadReader.TrackIdGenerator paramTrackIdGenerator)
  {
    paramTrackIdGenerator.generateNewId();
    output = paramExtractorOutput.track(paramTrackIdGenerator.getTrackId(), 1);
    formatId = paramTrackIdGenerator.getFormatId();
  }
  
  public void packetFinished() {}
  
  public void packetStarted(long paramLong, boolean paramBoolean)
  {
    timeUs = paramLong;
  }
  
  public void seek()
  {
    state = 0;
    streamMuxRead = false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.ts.LatmReader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */