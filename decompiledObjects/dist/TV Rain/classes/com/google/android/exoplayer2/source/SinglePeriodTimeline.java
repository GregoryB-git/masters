package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Timeline.Period;
import com.google.android.exoplayer2.Timeline.Window;
import com.google.android.exoplayer2.util.Assertions;

public final class SinglePeriodTimeline
  extends Timeline
{
  private static final Object UID = new Object();
  private final boolean isDynamic;
  private final boolean isSeekable;
  private final long periodDurationUs;
  private final long presentationStartTimeMs;
  @Nullable
  private final Object tag;
  private final long windowDefaultStartPositionUs;
  private final long windowDurationUs;
  private final long windowPositionInPeriodUs;
  private final long windowStartTimeMs;
  
  public SinglePeriodTimeline(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, boolean paramBoolean1, boolean paramBoolean2, @Nullable Object paramObject)
  {
    presentationStartTimeMs = paramLong1;
    windowStartTimeMs = paramLong2;
    periodDurationUs = paramLong3;
    windowDurationUs = paramLong4;
    windowPositionInPeriodUs = paramLong5;
    windowDefaultStartPositionUs = paramLong6;
    isSeekable = paramBoolean1;
    isDynamic = paramBoolean2;
    tag = paramObject;
  }
  
  public SinglePeriodTimeline(long paramLong1, long paramLong2, long paramLong3, long paramLong4, boolean paramBoolean1, boolean paramBoolean2, @Nullable Object paramObject)
  {
    this(-9223372036854775807L, -9223372036854775807L, paramLong1, paramLong2, paramLong3, paramLong4, paramBoolean1, paramBoolean2, paramObject);
  }
  
  public SinglePeriodTimeline(long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    this(paramLong, paramBoolean1, paramBoolean2, null);
  }
  
  public SinglePeriodTimeline(long paramLong, boolean paramBoolean1, boolean paramBoolean2, @Nullable Object paramObject)
  {
    this(paramLong, paramLong, 0L, 0L, paramBoolean1, paramBoolean2, paramObject);
  }
  
  public int getIndexOfPeriod(Object paramObject)
  {
    int i;
    if (UID.equals(paramObject)) {
      i = 0;
    } else {
      i = -1;
    }
    return i;
  }
  
  public Timeline.Period getPeriod(int paramInt, Timeline.Period paramPeriod, boolean paramBoolean)
  {
    Assertions.checkIndex(paramInt, 0, 1);
    Object localObject;
    if (paramBoolean) {
      localObject = UID;
    } else {
      localObject = null;
    }
    return paramPeriod.set(null, localObject, 0, periodDurationUs, -windowPositionInPeriodUs);
  }
  
  public int getPeriodCount()
  {
    return 1;
  }
  
  public Object getUidOfPeriod(int paramInt)
  {
    Assertions.checkIndex(paramInt, 0, 1);
    return UID;
  }
  
  public Timeline.Window getWindow(int paramInt, Timeline.Window paramWindow, boolean paramBoolean, long paramLong)
  {
    Assertions.checkIndex(paramInt, 0, 1);
    Object localObject;
    if (paramBoolean) {
      localObject = tag;
    } else {
      localObject = null;
    }
    long l1 = windowDefaultStartPositionUs;
    paramBoolean = isDynamic;
    long l2 = l1;
    if (paramBoolean)
    {
      l2 = l1;
      if (paramLong != 0L)
      {
        long l3 = windowDurationUs;
        if (l3 == -9223372036854775807L) {}
        do
        {
          paramLong = -9223372036854775807L;
          break;
          paramLong = l1 + paramLong;
          l2 = paramLong;
        } while (paramLong > l3);
      }
    }
    paramLong = l2;
    return paramWindow.set(localObject, presentationStartTimeMs, windowStartTimeMs, isSeekable, paramBoolean, paramLong, windowDurationUs, 0, 0, windowPositionInPeriodUs);
  }
  
  public int getWindowCount()
  {
    return 1;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.SinglePeriodTimeline
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */