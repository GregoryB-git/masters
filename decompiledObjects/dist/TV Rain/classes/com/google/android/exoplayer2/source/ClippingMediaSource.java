package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Timeline.Period;
import com.google.android.exoplayer2.Timeline.Window;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

public final class ClippingMediaSource
  extends CompositeMediaSource<Void>
{
  private final boolean allowDynamicClippingUpdates;
  private IllegalClippingException clippingError;
  private ClippingTimeline clippingTimeline;
  private final boolean enableInitialDiscontinuity;
  private final long endUs;
  @Nullable
  private Object manifest;
  private final ArrayList<ClippingMediaPeriod> mediaPeriods;
  private final MediaSource mediaSource;
  private long periodEndUs;
  private long periodStartUs;
  private final boolean relativeToDefaultPosition;
  private final long startUs;
  private final Timeline.Window window;
  
  public ClippingMediaSource(MediaSource paramMediaSource, long paramLong)
  {
    this(paramMediaSource, 0L, paramLong, true, false, true);
  }
  
  public ClippingMediaSource(MediaSource paramMediaSource, long paramLong1, long paramLong2)
  {
    this(paramMediaSource, paramLong1, paramLong2, true, false, false);
  }
  
  @Deprecated
  public ClippingMediaSource(MediaSource paramMediaSource, long paramLong1, long paramLong2, boolean paramBoolean)
  {
    this(paramMediaSource, paramLong1, paramLong2, paramBoolean, false, false);
  }
  
  public ClippingMediaSource(MediaSource paramMediaSource, long paramLong1, long paramLong2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    boolean bool;
    if (paramLong1 >= 0L) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkArgument(bool);
    mediaSource = ((MediaSource)Assertions.checkNotNull(paramMediaSource));
    startUs = paramLong1;
    endUs = paramLong2;
    enableInitialDiscontinuity = paramBoolean1;
    allowDynamicClippingUpdates = paramBoolean2;
    relativeToDefaultPosition = paramBoolean3;
    mediaPeriods = new ArrayList();
    window = new Timeline.Window();
  }
  
  private void refreshClippedTimeline(Timeline paramTimeline)
  {
    Object localObject = window;
    int i = 0;
    paramTimeline.getWindow(0, (Timeline.Window)localObject);
    long l1 = window.getPositionInFirstPeriodUs();
    localObject = clippingTimeline;
    long l2 = Long.MIN_VALUE;
    long l3;
    long l4;
    if ((localObject != null) && (!mediaPeriods.isEmpty()) && (!allowDynamicClippingUpdates))
    {
      l3 = periodStartUs;
      if (endUs == Long.MIN_VALUE) {
        l4 = l2;
      } else {
        l4 = periodEndUs - l1;
      }
      l3 -= l1;
    }
    else
    {
      long l5 = startUs;
      long l6 = endUs;
      l3 = l5;
      l4 = l6;
      if (relativeToDefaultPosition)
      {
        l4 = window.getDefaultPositionUs();
        l3 = l5 + l4;
        l4 = l6 + l4;
      }
      periodStartUs = (l1 + l3);
      if (endUs != Long.MIN_VALUE) {
        l2 = l1 + l4;
      }
      periodEndUs = l2;
      int j = mediaPeriods.size();
      while (i < j)
      {
        ((ClippingMediaPeriod)mediaPeriods.get(i)).updateClipping(periodStartUs, periodEndUs);
        i++;
      }
    }
    try
    {
      localObject = new com/google/android/exoplayer2/source/ClippingMediaSource$ClippingTimeline;
      ((ClippingTimeline)localObject).<init>(paramTimeline, l3, l4);
      clippingTimeline = ((ClippingTimeline)localObject);
      refreshSourceInfo((Timeline)localObject, manifest);
      return;
    }
    catch (IllegalClippingException paramTimeline)
    {
      clippingError = paramTimeline;
    }
  }
  
  public MediaPeriod createPeriod(MediaSource.MediaPeriodId paramMediaPeriodId, Allocator paramAllocator)
  {
    paramMediaPeriodId = new ClippingMediaPeriod(mediaSource.createPeriod(paramMediaPeriodId, paramAllocator), enableInitialDiscontinuity, periodStartUs, periodEndUs);
    mediaPeriods.add(paramMediaPeriodId);
    return paramMediaPeriodId;
  }
  
  public long getMediaTimeForChildMediaTime(Void paramVoid, long paramLong)
  {
    if (paramLong == -9223372036854775807L) {
      return -9223372036854775807L;
    }
    long l1 = C.usToMs(startUs);
    long l2 = Math.max(0L, paramLong - l1);
    long l3 = endUs;
    paramLong = l2;
    if (l3 != Long.MIN_VALUE) {
      paramLong = Math.min(C.usToMs(l3) - l1, l2);
    }
    return paramLong;
  }
  
  public void maybeThrowSourceInfoRefreshError()
    throws IOException
  {
    IllegalClippingException localIllegalClippingException = clippingError;
    if (localIllegalClippingException == null)
    {
      super.maybeThrowSourceInfoRefreshError();
      return;
    }
    throw localIllegalClippingException;
  }
  
  public void onChildSourceInfoRefreshed(Void paramVoid, MediaSource paramMediaSource, Timeline paramTimeline, @Nullable Object paramObject)
  {
    if (clippingError != null) {
      return;
    }
    manifest = paramObject;
    refreshClippedTimeline(paramTimeline);
  }
  
  public void prepareSourceInternal(ExoPlayer paramExoPlayer, boolean paramBoolean, @Nullable TransferListener paramTransferListener)
  {
    super.prepareSourceInternal(paramExoPlayer, paramBoolean, paramTransferListener);
    prepareChildSource(null, mediaSource);
  }
  
  public void releasePeriod(MediaPeriod paramMediaPeriod)
  {
    Assertions.checkState(mediaPeriods.remove(paramMediaPeriod));
    mediaSource.releasePeriod(mediaPeriod);
    if ((mediaPeriods.isEmpty()) && (!allowDynamicClippingUpdates)) {
      refreshClippedTimeline(clippingTimeline.timeline);
    }
  }
  
  public void releaseSourceInternal()
  {
    super.releaseSourceInternal();
    clippingError = null;
    clippingTimeline = null;
  }
  
  public static final class ClippingTimeline
    extends ForwardingTimeline
  {
    private final long durationUs;
    private final long endUs;
    private final boolean isDynamic;
    private final long startUs;
    
    public ClippingTimeline(Timeline paramTimeline, long paramLong1, long paramLong2)
      throws ClippingMediaSource.IllegalClippingException
    {
      super();
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
  
  public static final class IllegalClippingException
    extends IOException
  {
    public static final int REASON_INVALID_PERIOD_COUNT = 0;
    public static final int REASON_NOT_SEEKABLE_TO_START = 1;
    public static final int REASON_START_EXCEEDS_END = 2;
    public final int reason;
    
    public IllegalClippingException(int paramInt)
    {
      super();
      reason = paramInt;
    }
    
    private static String getReasonDescription(int paramInt)
    {
      if (paramInt != 0)
      {
        if (paramInt != 1)
        {
          if (paramInt != 2) {
            return "unknown";
          }
          return "start exceeds end";
        }
        return "not seekable to start";
      }
      return "invalid period count";
    }
    
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public static @interface Reason {}
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.ClippingMediaSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */