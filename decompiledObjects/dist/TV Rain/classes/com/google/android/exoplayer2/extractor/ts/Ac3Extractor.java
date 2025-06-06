package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap.Unseekable;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import z3;

public final class Ac3Extractor
  implements Extractor
{
  private static final int AC3_SYNC_WORD = 2935;
  public static final ExtractorsFactory FACTORY = new z3(20);
  private static final int ID3_TAG = Util.getIntegerCodeForString("ID3");
  private static final int MAX_SNIFF_BYTES = 8192;
  private static final int MAX_SYNC_FRAME_SIZE = 2786;
  private final long firstSampleTimestampUs;
  private final Ac3Reader reader;
  private final ParsableByteArray sampleData;
  private boolean startedPacket;
  
  public Ac3Extractor()
  {
    this(0L);
  }
  
  public Ac3Extractor(long paramLong)
  {
    firstSampleTimestampUs = paramLong;
    reader = new Ac3Reader();
    sampleData = new ParsableByteArray(2786);
  }
  
  public void init(ExtractorOutput paramExtractorOutput)
  {
    reader.createTracks(paramExtractorOutput, new TsPayloadReader.TrackIdGenerator(0, 1));
    paramExtractorOutput.endTracks();
    paramExtractorOutput.seekMap(new SeekMap.Unseekable(-9223372036854775807L));
  }
  
  public int read(ExtractorInput paramExtractorInput, PositionHolder paramPositionHolder)
    throws IOException, InterruptedException
  {
    int i = paramExtractorInput.read(sampleData.data, 0, 2786);
    if (i == -1) {
      return -1;
    }
    sampleData.setPosition(0);
    sampleData.setLimit(i);
    if (!startedPacket)
    {
      reader.packetStarted(firstSampleTimestampUs, true);
      startedPacket = true;
    }
    reader.consume(sampleData);
    return 0;
  }
  
  public void release() {}
  
  public void seek(long paramLong1, long paramLong2)
  {
    startedPacket = false;
    reader.seek();
  }
  
  public boolean sniff(ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException
  {
    ParsableByteArray localParsableByteArray = new ParsableByteArray(10);
    int i = 0;
    for (;;)
    {
      paramExtractorInput.peekFully(data, 0, 10);
      localParsableByteArray.setPosition(0);
      if (localParsableByteArray.readUnsignedInt24() != ID3_TAG)
      {
        paramExtractorInput.resetPeekPosition();
        paramExtractorInput.advancePeekPosition(i);
        j = 0;
        int k = i;
        for (;;)
        {
          paramExtractorInput.peekFully(data, 0, 6);
          localParsableByteArray.setPosition(0);
          if (localParsableByteArray.readUnsignedShort() != 2935)
          {
            paramExtractorInput.resetPeekPosition();
            k++;
            if (k - i >= 8192) {
              return false;
            }
            paramExtractorInput.advancePeekPosition(k);
            j = 0;
          }
          else
          {
            j++;
            if (j >= 4) {
              return true;
            }
            int m = Ac3Util.parseAc3SyncframeSize(data);
            if (m == -1) {
              return false;
            }
            paramExtractorInput.advancePeekPosition(m - 6);
          }
        }
      }
      localParsableByteArray.skipBytes(3);
      int j = localParsableByteArray.readSynchSafeInt();
      i += j + 10;
      paramExtractorInput.advancePeekPosition(j);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.ts.Ac3Extractor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */