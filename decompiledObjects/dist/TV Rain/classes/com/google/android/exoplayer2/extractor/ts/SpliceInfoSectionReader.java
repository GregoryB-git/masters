package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;

public final class SpliceInfoSectionReader
  implements SectionPayloadReader
{
  private boolean formatDeclared;
  private TrackOutput output;
  private TimestampAdjuster timestampAdjuster;
  
  public void consume(ParsableByteArray paramParsableByteArray)
  {
    if (!formatDeclared)
    {
      if (timestampAdjuster.getTimestampOffsetUs() == -9223372036854775807L) {
        return;
      }
      output.format(Format.createSampleFormat(null, "application/x-scte35", timestampAdjuster.getTimestampOffsetUs()));
      formatDeclared = true;
    }
    int i = paramParsableByteArray.bytesLeft();
    output.sampleData(paramParsableByteArray, i);
    output.sampleMetadata(timestampAdjuster.getLastAdjustedTimestampUs(), 1, i, 0, null);
  }
  
  public void init(TimestampAdjuster paramTimestampAdjuster, ExtractorOutput paramExtractorOutput, TsPayloadReader.TrackIdGenerator paramTrackIdGenerator)
  {
    timestampAdjuster = paramTimestampAdjuster;
    paramTrackIdGenerator.generateNewId();
    paramTimestampAdjuster = paramExtractorOutput.track(paramTrackIdGenerator.getTrackId(), 4);
    output = paramTimestampAdjuster;
    paramTimestampAdjuster.format(Format.createSampleFormat(paramTrackIdGenerator.getFormatId(), "application/x-scte35", null, -1, null));
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.ts.SpliceInfoSectionReader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */