package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.util.Assertions;

final class LoopingMediaSource$LoopingTimeline
  extends AbstractConcatenatedTimeline
{
  private final int childPeriodCount;
  private final Timeline childTimeline;
  private final int childWindowCount;
  private final int loopCount;
  
  public LoopingMediaSource$LoopingTimeline(Timeline paramTimeline, int paramInt)
  {
    super(false, localUnshuffledShuffleOrder);
    childTimeline = paramTimeline;
    int i = paramTimeline.getPeriodCount();
    childPeriodCount = i;
    childWindowCount = paramTimeline.getWindowCount();
    loopCount = paramInt;
    if (i > 0)
    {
      if (paramInt <= Integer.MAX_VALUE / i) {
        bool = true;
      }
      Assertions.checkState(bool, "LoopingMediaSource contains too many periods");
    }
  }
  
  public int getChildIndexByChildUid(Object paramObject)
  {
    if (!(paramObject instanceof Integer)) {
      return -1;
    }
    return ((Integer)paramObject).intValue();
  }
  
  public int getChildIndexByPeriodIndex(int paramInt)
  {
    return paramInt / childPeriodCount;
  }
  
  public int getChildIndexByWindowIndex(int paramInt)
  {
    return paramInt / childWindowCount;
  }
  
  public Object getChildUidByChildIndex(int paramInt)
  {
    return Integer.valueOf(paramInt);
  }
  
  public int getFirstPeriodIndexByChildIndex(int paramInt)
  {
    return paramInt * childPeriodCount;
  }
  
  public int getFirstWindowIndexByChildIndex(int paramInt)
  {
    return paramInt * childWindowCount;
  }
  
  public int getPeriodCount()
  {
    return childPeriodCount * loopCount;
  }
  
  public Timeline getTimelineByChildIndex(int paramInt)
  {
    return childTimeline;
  }
  
  public int getWindowCount()
  {
    return childWindowCount * loopCount;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.LoopingMediaSource.LoopingTimeline
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */