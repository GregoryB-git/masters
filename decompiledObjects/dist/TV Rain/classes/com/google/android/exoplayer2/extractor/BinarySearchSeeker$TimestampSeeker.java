package com.google.android.exoplayer2.extractor;

import java.io.IOException;

public abstract interface BinarySearchSeeker$TimestampSeeker
{
  public abstract BinarySearchSeeker.TimestampSearchResult searchForTimestamp(ExtractorInput paramExtractorInput, long paramLong, BinarySearchSeeker.OutputFrameHolder paramOutputFrameHolder)
    throws IOException, InterruptedException;
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSeeker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */