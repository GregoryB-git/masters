package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;

public abstract interface SectionPayloadReader
{
  public abstract void consume(ParsableByteArray paramParsableByteArray);
  
  public abstract void init(TimestampAdjuster paramTimestampAdjuster, ExtractorOutput paramExtractorOutput, TsPayloadReader.TrackIdGenerator paramTrackIdGenerator);
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.ts.SectionPayloadReader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */