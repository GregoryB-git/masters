package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Timeline.Period;
import com.google.android.exoplayer2.util.Util;

final class ConcatenatingMediaSource$DeferredTimeline
  extends ForwardingTimeline
{
  private static final Object DUMMY_ID = new Object();
  private static final ConcatenatingMediaSource.DummyTimeline DUMMY_TIMELINE = new ConcatenatingMediaSource.DummyTimeline(null);
  private final Object replacedId;
  
  public ConcatenatingMediaSource$DeferredTimeline()
  {
    this(DUMMY_TIMELINE, DUMMY_ID);
  }
  
  private ConcatenatingMediaSource$DeferredTimeline(Timeline paramTimeline, Object paramObject)
  {
    super(paramTimeline);
    replacedId = paramObject;
  }
  
  public static DeferredTimeline createWithRealTimeline(Timeline paramTimeline, Object paramObject)
  {
    return new DeferredTimeline(paramTimeline, paramObject);
  }
  
  public DeferredTimeline cloneWithUpdatedTimeline(Timeline paramTimeline)
  {
    return new DeferredTimeline(paramTimeline, replacedId);
  }
  
  public int getIndexOfPeriod(Object paramObject)
  {
    Timeline localTimeline = timeline;
    Object localObject = paramObject;
    if (DUMMY_ID.equals(paramObject)) {
      localObject = replacedId;
    }
    return localTimeline.getIndexOfPeriod(localObject);
  }
  
  public Timeline.Period getPeriod(int paramInt, Timeline.Period paramPeriod, boolean paramBoolean)
  {
    timeline.getPeriod(paramInt, paramPeriod, paramBoolean);
    if (Util.areEqual(uid, replacedId)) {
      uid = DUMMY_ID;
    }
    return paramPeriod;
  }
  
  public Timeline getTimeline()
  {
    return timeline;
  }
  
  public Object getUidOfPeriod(int paramInt)
  {
    Object localObject1 = timeline.getUidOfPeriod(paramInt);
    Object localObject2 = localObject1;
    if (Util.areEqual(localObject1, replacedId)) {
      localObject2 = DUMMY_ID;
    }
    return localObject2;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.ConcatenatingMediaSource.DeferredTimeline
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */