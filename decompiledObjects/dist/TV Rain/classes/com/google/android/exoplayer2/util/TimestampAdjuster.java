package com.google.android.exoplayer2.util;

public final class TimestampAdjuster
{
  public static final long DO_NOT_OFFSET = Long.MAX_VALUE;
  private static final long MAX_PTS_PLUS_ONE = 8589934592L;
  private long firstSampleTimestampUs;
  private volatile long lastSampleTimestampUs = -9223372036854775807L;
  private long timestampOffsetUs;
  
  public TimestampAdjuster(long paramLong)
  {
    setFirstSampleTimestampUs(paramLong);
  }
  
  public static long ptsToUs(long paramLong)
  {
    return paramLong * 1000000L / 90000L;
  }
  
  public static long usToPts(long paramLong)
  {
    return paramLong * 90000L / 1000000L;
  }
  
  public long adjustSampleTimestamp(long paramLong)
  {
    if (paramLong == -9223372036854775807L) {
      return -9223372036854775807L;
    }
    if (lastSampleTimestampUs != -9223372036854775807L)
    {
      lastSampleTimestampUs = paramLong;
    }
    else
    {
      long l = firstSampleTimestampUs;
      if (l != Long.MAX_VALUE) {
        timestampOffsetUs = (l - paramLong);
      }
    }
    try
    {
      lastSampleTimestampUs = paramLong;
      notifyAll();
      return paramLong + timestampOffsetUs;
    }
    finally {}
  }
  
  public long adjustTsTimestamp(long paramLong)
  {
    if (paramLong == -9223372036854775807L) {
      return -9223372036854775807L;
    }
    long l1 = paramLong;
    if (lastSampleTimestampUs != -9223372036854775807L)
    {
      long l2 = usToPts(lastSampleTimestampUs);
      long l3 = (4294967296L + l2) / 8589934592L;
      l1 = (l3 - 1L) * 8589934592L + paramLong;
      paramLong = l3 * 8589934592L + paramLong;
      if (Math.abs(l1 - l2) >= Math.abs(paramLong - l2)) {
        l1 = paramLong;
      }
    }
    return adjustSampleTimestamp(ptsToUs(l1));
  }
  
  public long getFirstSampleTimestampUs()
  {
    return firstSampleTimestampUs;
  }
  
  public long getLastAdjustedTimestampUs()
  {
    long l1 = lastSampleTimestampUs;
    long l2 = -9223372036854775807L;
    if (l1 != -9223372036854775807L)
    {
      l2 = lastSampleTimestampUs;
      l2 = timestampOffsetUs + l2;
    }
    else
    {
      l1 = firstSampleTimestampUs;
      if (l1 != Long.MAX_VALUE) {
        l2 = l1;
      }
    }
    return l2;
  }
  
  public long getTimestampOffsetUs()
  {
    long l1 = firstSampleTimestampUs;
    long l2 = -9223372036854775807L;
    if (l1 == Long.MAX_VALUE) {
      l2 = 0L;
    } else if (lastSampleTimestampUs != -9223372036854775807L) {
      l2 = timestampOffsetUs;
    }
    return l2;
  }
  
  public void reset()
  {
    lastSampleTimestampUs = -9223372036854775807L;
  }
  
  public void setFirstSampleTimestampUs(long paramLong)
  {
    try
    {
      boolean bool;
      if (lastSampleTimestampUs == -9223372036854775807L) {
        bool = true;
      } else {
        bool = false;
      }
      Assertions.checkState(bool);
      firstSampleTimestampUs = paramLong;
      return;
    }
    finally {}
  }
  
  public void waitUntilInitialized()
    throws InterruptedException
  {
    try
    {
      while (lastSampleTimestampUs == -9223372036854775807L) {
        wait();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.util.TimestampAdjuster
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */