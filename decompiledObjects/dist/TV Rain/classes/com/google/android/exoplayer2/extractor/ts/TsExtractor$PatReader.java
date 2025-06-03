package com.google.android.exoplayer2.extractor.ts;

import android.util.SparseArray;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;

class TsExtractor$PatReader
  implements SectionPayloadReader
{
  private final ParsableBitArray patScratch = new ParsableBitArray(new byte[4]);
  
  public TsExtractor$PatReader(TsExtractor paramTsExtractor) {}
  
  public void consume(ParsableByteArray paramParsableByteArray)
  {
    if (paramParsableByteArray.readUnsignedByte() != 0) {
      return;
    }
    paramParsableByteArray.skipBytes(7);
    int i = paramParsableByteArray.bytesLeft() / 4;
    for (int j = 0; j < i; j++)
    {
      paramParsableByteArray.readBytes(patScratch, 4);
      int k = patScratch.readBits(16);
      patScratch.skipBits(3);
      if (k == 0)
      {
        patScratch.skipBits(13);
      }
      else
      {
        k = patScratch.readBits(13);
        TsExtractor.access$000(this$0).put(k, new SectionReader(new TsExtractor.PmtReader(this$0, k)));
        TsExtractor.access$108(this$0);
      }
    }
    if (TsExtractor.access$200(this$0) != 2) {
      TsExtractor.access$000(this$0).remove(0);
    }
  }
  
  public void init(TimestampAdjuster paramTimestampAdjuster, ExtractorOutput paramExtractorOutput, TsPayloadReader.TrackIdGenerator paramTrackIdGenerator) {}
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.ts.TsExtractor.PatReader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */