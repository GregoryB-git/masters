package com.google.android.exoplayer2.source.hls;

import android.util.SparseArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;

public final class TimestampAdjusterProvider
{
  private final SparseArray<TimestampAdjuster> timestampAdjusters = new SparseArray();
  
  public TimestampAdjuster getAdjuster(int paramInt)
  {
    TimestampAdjuster localTimestampAdjuster1 = (TimestampAdjuster)timestampAdjusters.get(paramInt);
    TimestampAdjuster localTimestampAdjuster2 = localTimestampAdjuster1;
    if (localTimestampAdjuster1 == null)
    {
      localTimestampAdjuster2 = new TimestampAdjuster(Long.MAX_VALUE);
      timestampAdjusters.put(paramInt, localTimestampAdjuster2);
    }
    return localTimestampAdjuster2;
  }
  
  public void reset()
  {
    timestampAdjusters.clear();
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.hls.TimestampAdjusterProvider
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */