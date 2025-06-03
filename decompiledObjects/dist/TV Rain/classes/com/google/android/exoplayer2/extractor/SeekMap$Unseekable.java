package com.google.android.exoplayer2.extractor;

public final class SeekMap$Unseekable
  implements SeekMap
{
  private final long durationUs;
  private final SeekMap.SeekPoints startSeekPoints;
  
  public SeekMap$Unseekable(long paramLong)
  {
    this(paramLong, 0L);
  }
  
  public SeekMap$Unseekable(long paramLong1, long paramLong2)
  {
    durationUs = paramLong1;
    SeekPoint localSeekPoint;
    if (paramLong2 == 0L) {
      localSeekPoint = SeekPoint.START;
    } else {
      localSeekPoint = new SeekPoint(0L, paramLong2);
    }
    startSeekPoints = new SeekMap.SeekPoints(localSeekPoint);
  }
  
  public long getDurationUs()
  {
    return durationUs;
  }
  
  public SeekMap.SeekPoints getSeekPoints(long paramLong)
  {
    return startSeekPoints;
  }
  
  public boolean isSeekable()
  {
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.SeekMap.Unseekable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */