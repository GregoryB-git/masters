package com.google.android.exoplayer2;

import androidx.annotation.Nullable;

public final class Timeline$Window
{
  public long defaultPositionUs;
  public long durationUs;
  public int firstPeriodIndex;
  public boolean isDynamic;
  public boolean isSeekable;
  public int lastPeriodIndex;
  public long positionInFirstPeriodUs;
  public long presentationStartTimeMs;
  @Nullable
  public Object tag;
  public long windowStartTimeMs;
  
  public long getDefaultPositionMs()
  {
    return C.usToMs(defaultPositionUs);
  }
  
  public long getDefaultPositionUs()
  {
    return defaultPositionUs;
  }
  
  public long getDurationMs()
  {
    return C.usToMs(durationUs);
  }
  
  public long getDurationUs()
  {
    return durationUs;
  }
  
  public long getPositionInFirstPeriodMs()
  {
    return C.usToMs(positionInFirstPeriodUs);
  }
  
  public long getPositionInFirstPeriodUs()
  {
    return positionInFirstPeriodUs;
  }
  
  public Window set(@Nullable Object paramObject, long paramLong1, long paramLong2, boolean paramBoolean1, boolean paramBoolean2, long paramLong3, long paramLong4, int paramInt1, int paramInt2, long paramLong5)
  {
    tag = paramObject;
    presentationStartTimeMs = paramLong1;
    windowStartTimeMs = paramLong2;
    isSeekable = paramBoolean1;
    isDynamic = paramBoolean2;
    defaultPositionUs = paramLong3;
    durationUs = paramLong4;
    firstPeriodIndex = paramInt1;
    lastPeriodIndex = paramInt2;
    positionInFirstPeriodUs = paramLong5;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.Timeline.Window
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */