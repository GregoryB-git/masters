package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.android.exoplayer2.audio.Ac3Util.SyncFrameInfo;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;

public final class Ac3Reader
  implements ElementaryStreamReader
{
  private static final int HEADER_SIZE = 128;
  private static final int STATE_FINDING_SYNC = 0;
  private static final int STATE_READING_HEADER = 1;
  private static final int STATE_READING_SAMPLE = 2;
  private int bytesRead;
  private Format format;
  private final ParsableBitArray headerScratchBits;
  private final ParsableByteArray headerScratchBytes;
  private final String language;
  private boolean lastByteWas0B;
  private TrackOutput output;
  private long sampleDurationUs;
  private int sampleSize;
  private int state;
  private long timeUs;
  private String trackFormatId;
  
  public Ac3Reader()
  {
    this(null);
  }
  
  public Ac3Reader(String paramString)
  {
    ParsableBitArray localParsableBitArray = new ParsableBitArray(new byte['']);
    headerScratchBits = localParsableBitArray;
    headerScratchBytes = new ParsableByteArray(data);
    state = 0;
    language = paramString;
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
  
  private void parseHeader()
  {
    headerScratchBits.setPosition(0);
    Ac3Util.SyncFrameInfo localSyncFrameInfo = Ac3Util.parseAc3SyncframeInfo(headerScratchBits);
    Format localFormat = format;
    if ((localFormat == null) || (channelCount != channelCount) || (sampleRate != sampleRate) || (mimeType != sampleMimeType))
    {
      localFormat = Format.createAudioSampleFormat(trackFormatId, mimeType, null, -1, -1, channelCount, sampleRate, null, null, 0, language);
      format = localFormat;
      output.format(localFormat);
    }
    sampleSize = frameSize;
    sampleDurationUs = (sampleCount * 1000000L / format.sampleRate);
  }
  
  private boolean skipToNextSync(ParsableByteArray paramParsableByteArray)
  {
    for (;;)
    {
      int i = paramParsableByteArray.bytesLeft();
      boolean bool1 = false;
      boolean bool2 = false;
      if (i <= 0) {
        break;
      }
      if (!lastByteWas0B)
      {
        if (paramParsableByteArray.readUnsignedByte() == 11) {
          bool2 = true;
        }
        lastByteWas0B = bool2;
      }
      else
      {
        i = paramParsableByteArray.readUnsignedByte();
        if (i == 119)
        {
          lastByteWas0B = false;
          return true;
        }
        bool2 = bool1;
        if (i == 11) {
          bool2 = true;
        }
        lastByteWas0B = bool2;
      }
    }
    return false;
  }
  
  public void consume(ParsableByteArray paramParsableByteArray)
  {
    while (paramParsableByteArray.bytesLeft() > 0)
    {
      int i = state;
      if (i != 0)
      {
        if (i != 1)
        {
          if (i == 2)
          {
            i = Math.min(paramParsableByteArray.bytesLeft(), sampleSize - bytesRead);
            output.sampleData(paramParsableByteArray, i);
            int j = bytesRead + i;
            bytesRead = j;
            i = sampleSize;
            if (j == i)
            {
              output.sampleMetadata(timeUs, 1, i, 0, null);
              timeUs += sampleDurationUs;
              state = 0;
            }
          }
        }
        else if (continueRead(paramParsableByteArray, headerScratchBytes.data, 128))
        {
          parseHeader();
          headerScratchBytes.setPosition(0);
          output.sampleData(headerScratchBytes, 128);
          state = 2;
        }
      }
      else if (skipToNextSync(paramParsableByteArray))
      {
        state = 1;
        byte[] arrayOfByte = headerScratchBytes.data;
        arrayOfByte[0] = ((byte)11);
        arrayOfByte[1] = ((byte)119);
        bytesRead = 2;
      }
    }
  }
  
  public void createTracks(ExtractorOutput paramExtractorOutput, TsPayloadReader.TrackIdGenerator paramTrackIdGenerator)
  {
    paramTrackIdGenerator.generateNewId();
    trackFormatId = paramTrackIdGenerator.getFormatId();
    output = paramExtractorOutput.track(paramTrackIdGenerator.getTrackId(), 1);
  }
  
  public void packetFinished() {}
  
  public void packetStarted(long paramLong, boolean paramBoolean)
  {
    timeUs = paramLong;
  }
  
  public void seek()
  {
    state = 0;
    bytesRead = 0;
    lastByteWas0B = false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.ts.Ac3Reader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */