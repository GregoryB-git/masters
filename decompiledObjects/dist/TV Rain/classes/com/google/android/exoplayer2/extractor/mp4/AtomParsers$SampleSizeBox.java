package com.google.android.exoplayer2.extractor.mp4;

abstract interface AtomParsers$SampleSizeBox
{
  public abstract int getSampleCount();
  
  public abstract boolean isFixedSampleSize();
  
  public abstract int readNextSampleSize();
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */