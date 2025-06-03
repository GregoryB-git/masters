package com.google.android.exoplayer2;

public final class IllegalSeekPositionException
  extends IllegalStateException
{
  public final long positionMs;
  public final Timeline timeline;
  public final int windowIndex;
  
  public IllegalSeekPositionException(Timeline paramTimeline, int paramInt, long paramLong)
  {
    timeline = paramTimeline;
    windowIndex = paramInt;
    positionMs = paramLong;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.IllegalSeekPositionException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */