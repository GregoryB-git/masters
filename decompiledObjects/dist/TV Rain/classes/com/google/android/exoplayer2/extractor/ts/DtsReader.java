package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.DtsUtil;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.ParsableByteArray;

public final class DtsReader
  implements ElementaryStreamReader
{
  private static final int HEADER_SIZE = 18;
  private static final int STATE_FINDING_SYNC = 0;
  private static final int STATE_READING_HEADER = 1;
  private static final int STATE_READING_SAMPLE = 2;
  private int bytesRead;
  private Format format;
  private String formatId;
  private final ParsableByteArray headerScratchBytes = new ParsableByteArray(new byte[18]);
  private final String language;
  private TrackOutput output;
  private long sampleDurationUs;
  private int sampleSize;
  private int state = 0;
  private int syncBytes;
  private long timeUs;
  
  public DtsReader(String paramString)
  {
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
    byte[] arrayOfByte = headerScratchBytes.data;
    if (format == null)
    {
      Format localFormat = DtsUtil.parseDtsFormat(arrayOfByte, formatId, language, null);
      format = localFormat;
      output.format(localFormat);
    }
    sampleSize = DtsUtil.getDtsFrameSize(arrayOfByte);
    sampleDurationUs = ((int)(DtsUtil.parseDtsAudioSampleCount(arrayOfByte) * 1000000L / format.sampleRate));
  }
  
  private boolean skipToNextSync(ParsableByteArray paramParsableByteArray)
  {
    while (paramParsableByteArray.bytesLeft() > 0)
    {
      int i = syncBytes << 8;
      syncBytes = i;
      i |= paramParsableByteArray.readUnsignedByte();
      syncBytes = i;
      if (DtsUtil.isSyncWord(i))
      {
        paramParsableByteArray = headerScratchBytes.data;
        i = syncBytes;
        paramParsableByteArray[0] = ((byte)(byte)(i >> 24 & 0xFF));
        paramParsableByteArray[1] = ((byte)(byte)(i >> 16 & 0xFF));
        paramParsableByteArray[2] = ((byte)(byte)(i >> 8 & 0xFF));
        paramParsableByteArray[3] = ((byte)(byte)(i & 0xFF));
        bytesRead = 4;
        syncBytes = 0;
        return true;
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
            i = bytesRead + i;
            bytesRead = i;
            int j = sampleSize;
            if (i == j)
            {
              output.sampleMetadata(timeUs, 1, j, 0, null);
              timeUs += sampleDurationUs;
              state = 0;
            }
          }
          else
          {
            throw new IllegalStateException();
          }
        }
        else if (continueRead(paramParsableByteArray, headerScratchBytes.data, 18))
        {
          parseHeader();
          headerScratchBytes.setPosition(0);
          output.sampleData(headerScratchBytes, 18);
          state = 2;
        }
      }
      else if (skipToNextSync(paramParsableByteArray)) {
        state = 1;
      }
    }
  }
  
  public void createTracks(ExtractorOutput paramExtractorOutput, TsPayloadReader.TrackIdGenerator paramTrackIdGenerator)
  {
    paramTrackIdGenerator.generateNewId();
    formatId = paramTrackIdGenerator.getFormatId();
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
    syncBytes = 0;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.ts.DtsReader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */