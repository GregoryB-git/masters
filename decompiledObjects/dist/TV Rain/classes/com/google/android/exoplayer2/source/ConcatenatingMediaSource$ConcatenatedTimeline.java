package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.util.Util;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

final class ConcatenatingMediaSource$ConcatenatedTimeline
  extends AbstractConcatenatedTimeline
{
  private final HashMap<Object, Integer> childIndexByUid;
  private final int[] firstPeriodInChildIndices;
  private final int[] firstWindowInChildIndices;
  private final int periodCount;
  private final Timeline[] timelines;
  private final Object[] uids;
  private final int windowCount;
  
  public ConcatenatingMediaSource$ConcatenatedTimeline(Collection<ConcatenatingMediaSource.MediaSourceHolder> paramCollection, int paramInt1, int paramInt2, ShuffleOrder paramShuffleOrder, boolean paramBoolean)
  {
    super(paramBoolean, paramShuffleOrder);
    windowCount = paramInt1;
    periodCount = paramInt2;
    paramInt1 = paramCollection.size();
    firstPeriodInChildIndices = new int[paramInt1];
    firstWindowInChildIndices = new int[paramInt1];
    timelines = new Timeline[paramInt1];
    uids = new Object[paramInt1];
    childIndexByUid = new HashMap();
    paramShuffleOrder = paramCollection.iterator();
    for (paramInt1 = 0; paramShuffleOrder.hasNext(); paramInt1++)
    {
      Object localObject = (ConcatenatingMediaSource.MediaSourceHolder)paramShuffleOrder.next();
      timelines[paramInt1] = timeline;
      firstPeriodInChildIndices[paramInt1] = firstPeriodIndexInChild;
      firstWindowInChildIndices[paramInt1] = firstWindowIndexInChild;
      paramCollection = uids;
      localObject = uid;
      paramCollection[paramInt1] = localObject;
      childIndexByUid.put(localObject, Integer.valueOf(paramInt1));
    }
  }
  
  public int getChildIndexByChildUid(Object paramObject)
  {
    paramObject = (Integer)childIndexByUid.get(paramObject);
    int i;
    if (paramObject == null) {
      i = -1;
    } else {
      i = ((Integer)paramObject).intValue();
    }
    return i;
  }
  
  public int getChildIndexByPeriodIndex(int paramInt)
  {
    return Util.binarySearchFloor(firstPeriodInChildIndices, paramInt + 1, false, false);
  }
  
  public int getChildIndexByWindowIndex(int paramInt)
  {
    return Util.binarySearchFloor(firstWindowInChildIndices, paramInt + 1, false, false);
  }
  
  public Object getChildUidByChildIndex(int paramInt)
  {
    return uids[paramInt];
  }
  
  public int getFirstPeriodIndexByChildIndex(int paramInt)
  {
    return firstPeriodInChildIndices[paramInt];
  }
  
  public int getFirstWindowIndexByChildIndex(int paramInt)
  {
    return firstWindowInChildIndices[paramInt];
  }
  
  public int getPeriodCount()
  {
    return periodCount;
  }
  
  public Timeline getTimelineByChildIndex(int paramInt)
  {
    return timelines[paramInt];
  }
  
  public int getWindowCount()
  {
    return windowCount;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.ConcatenatingMediaSource.ConcatenatedTimeline
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */