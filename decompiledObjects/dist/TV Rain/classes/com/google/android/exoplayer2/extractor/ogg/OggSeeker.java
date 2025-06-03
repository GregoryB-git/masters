package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.SeekMap;
import java.io.IOException;

abstract interface OggSeeker
{
  public abstract SeekMap createSeekMap();
  
  public abstract long read(ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException;
  
  public abstract long startSeek(long paramLong);
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.ogg.OggSeeker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */