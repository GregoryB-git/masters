package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Timeline.Period;
import com.google.android.exoplayer2.Timeline.Window;

final class ConcatenatingMediaSource$DummyTimeline
  extends Timeline
{
  public int getIndexOfPeriod(Object paramObject)
  {
    int i;
    if (paramObject == ConcatenatingMediaSource.DeferredTimeline.access$100()) {
      i = 0;
    } else {
      i = -1;
    }
    return i;
  }
  
  public Timeline.Period getPeriod(int paramInt, Timeline.Period paramPeriod, boolean paramBoolean)
  {
    return paramPeriod.set(Integer.valueOf(0), ConcatenatingMediaSource.DeferredTimeline.access$100(), 0, -9223372036854775807L, 0L);
  }
  
  public int getPeriodCount()
  {
    return 1;
  }
  
  public Object getUidOfPeriod(int paramInt)
  {
    return ConcatenatingMediaSource.DeferredTimeline.access$100();
  }
  
  public Timeline.Window getWindow(int paramInt, Timeline.Window paramWindow, boolean paramBoolean, long paramLong)
  {
    return paramWindow.set(null, -9223372036854775807L, -9223372036854775807L, false, true, 0L, -9223372036854775807L, 0, 0, 0L);
  }
  
  public int getWindowCount()
  {
    return 1;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.ConcatenatingMediaSource.DummyTimeline
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */