package com.google.android.exoplayer2.extractor.rawcc;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap.Unseekable;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import z2;

public final class RawCcExtractor
  implements Extractor
{
  private static final int HEADER_ID = Util.getIntegerCodeForString("RCC\001");
  private static final int HEADER_SIZE = 8;
  private static final int SCRATCH_SIZE = 9;
  private static final int STATE_READING_HEADER = 0;
  private static final int STATE_READING_SAMPLES = 2;
  private static final int STATE_READING_TIMESTAMP_AND_COUNT = 1;
  private static final int TIMESTAMP_SIZE_V0 = 4;
  private static final int TIMESTAMP_SIZE_V1 = 8;
  private final ParsableByteArray dataScratch;
  private final Format format;
  private int parserState;
  private int remainingSampleCount;
  private int sampleBytesWritten;
  private long timestampUs;
  private TrackOutput trackOutput;
  private int version;
  
  public RawCcExtractor(Format paramFormat)
  {
    format = paramFormat;
    dataScratch = new ParsableByteArray(9);
    parserState = 0;
  }
  
  private boolean parseHeader(ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException
  {
    dataScratch.reset();
    if (paramExtractorInput.readFully(dataScratch.data, 0, 8, true))
    {
      if (dataScratch.readInt() == HEADER_ID)
      {
        version = dataScratch.readUnsignedByte();
        return true;
      }
      throw new IOException("Input not RawCC");
    }
    return false;
  }
  
  private void parseSamples(ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException
  {
    while (remainingSampleCount > 0)
    {
      dataScratch.reset();
      paramExtractorInput.readFully(dataScratch.data, 0, 3);
      trackOutput.sampleData(dataScratch, 3);
      sampleBytesWritten += 3;
      remainingSampleCount -= 1;
    }
    int i = sampleBytesWritten;
    if (i > 0) {
      trackOutput.sampleMetadata(timestampUs, 1, i, 0, null);
    }
  }
  
  private boolean parseTimestampAndSampleCount(ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException
  {
    dataScratch.reset();
    int i = version;
    if (i == 0)
    {
      if (!paramExtractorInput.readFully(dataScratch.data, 0, 5, true)) {
        return false;
      }
      timestampUs = (dataScratch.readUnsignedInt() * 1000L / 45L);
    }
    else
    {
      if (i != 1) {
        break label115;
      }
      if (!paramExtractorInput.readFully(dataScratch.data, 0, 9, true)) {
        return false;
      }
      timestampUs = dataScratch.readLong();
    }
    remainingSampleCount = dataScratch.readUnsignedByte();
    sampleBytesWritten = 0;
    return true;
    label115:
    paramExtractorInput = z2.t("Unsupported version number: ");
    paramExtractorInput.append(version);
    throw new ParserException(paramExtractorInput.toString());
  }
  
  public void init(ExtractorOutput paramExtractorOutput)
  {
    paramExtractorOutput.seekMap(new SeekMap.Unseekable(-9223372036854775807L));
    trackOutput = paramExtractorOutput.track(0, 3);
    paramExtractorOutput.endTracks();
    trackOutput.format(format);
  }
  
  public int read(ExtractorInput paramExtractorInput, PositionHolder paramPositionHolder)
    throws IOException, InterruptedException
  {
    for (;;)
    {
      int i = parserState;
      if (i != 0)
      {
        if (i != 1)
        {
          if (i == 2)
          {
            parseSamples(paramExtractorInput);
            parserState = 1;
            return 0;
          }
          throw new IllegalStateException();
        }
        if (parseTimestampAndSampleCount(paramExtractorInput))
        {
          parserState = 2;
        }
        else
        {
          parserState = 0;
          return -1;
        }
      }
      else
      {
        if (!parseHeader(paramExtractorInput)) {
          break;
        }
        parserState = 1;
      }
    }
    return -1;
  }
  
  public void release() {}
  
  public void seek(long paramLong1, long paramLong2)
  {
    parserState = 0;
  }
  
  public boolean sniff(ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException
  {
    dataScratch.reset();
    byte[] arrayOfByte = dataScratch.data;
    boolean bool = false;
    paramExtractorInput.peekFully(arrayOfByte, 0, 8);
    if (dataScratch.readInt() == HEADER_ID) {
      bool = true;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.rawcc.RawCcExtractor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */