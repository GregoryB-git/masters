package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Timeline.Period;
import com.google.android.exoplayer2.Timeline.Window;

final class ClippingMediaSource$ClippingTimeline
  extends ForwardingTimeline
{
  private final long durationUs;
  private final long endUs;
  private final boolean isDynamic;
  private final long startUs;
  
  public ClippingMediaSource$ClippingTimeline(Timeline paramTimeline, long paramLong1, long paramLong2)
    throws ClippingMediaSource.IllegalClippingException
  {
    super(paramTimeline);
    int i = paramTimeline.getPeriodCount();
    boolean bool2 = false;
    if (i == 1)
    {
      paramTimeline = paramTimeline.getWindow(0, new Timeline.Window());
      long l1 = Math.max(0L, paramLong1);
      if (paramLong2 == Long.MIN_VALUE) {
        paramLong1 = durationUs;
      } else {
        paramLong1 = Math.max(0L, paramLong2);
      }
      long l2 = durationUs;
      paramLong2 = paramLong1;
      if (l2 != -9223372036854775807L)
      {
        paramLong2 = paramLong1;
        if (paramLong1 > l2) {
          paramLong2 = l2;
        }
        if ((l1 != 0L) && (!isSeekable)) {
          throw new ClippingMediaSource.IllegalClippingException(1);
        }
        if (l1 > paramLong2) {
          throw new ClippingMediaSource.IllegalClippingException(2);
        }
      }
      startUs = l1;
      endUs = paramLong2;
      boolean bool1 = paramLong2 < -9223372036854775807L;
      if (!bool1) {
        paramLong1 = -9223372036854775807L;
      } else {
        paramLong1 = paramLong2 - l1;
      }
      durationUs = paramLong1;
      boolean bool3 = bool2;
      if (isDynamic) {
        if (bool1)
        {
          bool3 = bool2;
          if (l2 != -9223372036854775807L)
          {
            bool3 = bool2;
            if (paramLong2 != l2) {}
          }
        }
        else
        {
          bool3 = true;
        }
      }
      isDynamic = bool3;
      return;
    }
    throw new ClippingMediaSource.IllegalClippingException(0);
  }
  
  public Timeline.Period getPeriod(int paramInt, Timeline.Period paramPeriod, boolean paramBoolean)
  {
    timeline.getPeriod(0, paramPeriod, paramBoolean);
    long l1 = paramPeriod.getPositionInWindowUs() - startUs;
    long l2 = durationUs;
    if (l2 == -9223372036854775807L) {
      l2 = -9223372036854775807L;
    } else {
      l2 -= l1;
    }
    return paramPeriod.set(id, uid, 0, l2, l1);
  }
  
  public Timeline.Window getWindow(int paramInt, Timeline.Window paramWindow, boolean paramBoolean, long paramLong)
  {
    timeline.getWindow(0, paramWindow, paramBoolean, 0L);
    long l = positionInFirstPeriodUs;
    paramLong = startUs;
    positionInFirstPeriodUs = (l + paramLong);
    durationUs = durationUs;
    isDynamic = isDynamic;
    l = defaultPositionUs;
    if (l != -9223372036854775807L)
    {
      paramLong = Math.max(l, paramLong);
      defaultPositionUs = paramLong;
      l = endUs;
      if (l != -9223372036854775807L) {
        paramLong = Math.min(paramLong, l);
      }
      defaultPositionUs = (paramLong - startUs);
    }
    paramLong = C.usToMs(startUs);
    l = presentationStartTimeMs;
    if (l != -9223372036854775807L) {
      presentationStartTimeMs = (l + paramLong);
    }
    l = windowStartTimeMs;
    if (l != -9223372036854775807L) {
      windowStartTimeMs = (l + paramLong);
    }
    return paramWindow;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.ClippingMediaSource.ClippingTimeline
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */