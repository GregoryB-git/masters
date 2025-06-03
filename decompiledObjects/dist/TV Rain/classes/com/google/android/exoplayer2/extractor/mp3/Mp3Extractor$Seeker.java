package com.google.android.exoplayer2.extractor.mp3;

import com.google.android.exoplayer2.extractor.SeekMap;

abstract interface Mp3Extractor$Seeker
  extends SeekMap
{
  public abstract long getDataEndPosition();
  
  public abstract long getTimeUs(long paramLong);
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.mp3.Mp3Extractor.Seeker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */