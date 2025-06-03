package com.google.android.exoplayer2.source;

import android.util.Pair;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Timeline.Period;
import com.google.android.exoplayer2.Timeline.Window;

abstract class AbstractConcatenatedTimeline
  extends Timeline
{
  private final int childCount;
  private final boolean isAtomic;
  private final ShuffleOrder shuffleOrder;
  
  public AbstractConcatenatedTimeline(boolean paramBoolean, ShuffleOrder paramShuffleOrder)
  {
    isAtomic = paramBoolean;
    shuffleOrder = paramShuffleOrder;
    childCount = paramShuffleOrder.getLength();
  }
  
  public static Object getChildPeriodUidFromConcatenatedUid(Object paramObject)
  {
    return second;
  }
  
  public static Object getChildTimelineUidFromConcatenatedUid(Object paramObject)
  {
    return first;
  }
  
  public static Object getConcatenatedUid(Object paramObject1, Object paramObject2)
  {
    return Pair.create(paramObject1, paramObject2);
  }
  
  private int getNextChildIndex(int paramInt, boolean paramBoolean)
  {
    if (paramBoolean) {
      paramInt = shuffleOrder.getNextIndex(paramInt);
    } else if (paramInt < childCount - 1) {
      paramInt++;
    } else {
      paramInt = -1;
    }
    return paramInt;
  }
  
  private int getPreviousChildIndex(int paramInt, boolean paramBoolean)
  {
    if (paramBoolean) {
      paramInt = shuffleOrder.getPreviousIndex(paramInt);
    } else if (paramInt > 0) {
      paramInt--;
    } else {
      paramInt = -1;
    }
    return paramInt;
  }
  
  public abstract int getChildIndexByChildUid(Object paramObject);
  
  public abstract int getChildIndexByPeriodIndex(int paramInt);
  
  public abstract int getChildIndexByWindowIndex(int paramInt);
  
  public abstract Object getChildUidByChildIndex(int paramInt);
  
  public abstract int getFirstPeriodIndexByChildIndex(int paramInt);
  
  public int getFirstWindowIndex(boolean paramBoolean)
  {
    if (childCount == 0) {
      return -1;
    }
    boolean bool = isAtomic;
    int i = 0;
    if (bool) {
      paramBoolean = false;
    }
    if (paramBoolean) {
      i = shuffleOrder.getFirstIndex();
    }
    while (getTimelineByChildIndex(i).isEmpty())
    {
      j = getNextChildIndex(i, paramBoolean);
      i = j;
      if (j == -1) {
        return -1;
      }
    }
    int j = getFirstWindowIndexByChildIndex(i);
    return getTimelineByChildIndex(i).getFirstWindowIndex(paramBoolean) + j;
  }
  
  public abstract int getFirstWindowIndexByChildIndex(int paramInt);
  
  public final int getIndexOfPeriod(Object paramObject)
  {
    boolean bool = paramObject instanceof Pair;
    int i = -1;
    if (!bool) {
      return -1;
    }
    Object localObject = getChildTimelineUidFromConcatenatedUid(paramObject);
    paramObject = getChildPeriodUidFromConcatenatedUid(paramObject);
    int j = getChildIndexByChildUid(localObject);
    if (j == -1) {
      return -1;
    }
    int k = getTimelineByChildIndex(j).getIndexOfPeriod(paramObject);
    if (k != -1) {
      i = getFirstPeriodIndexByChildIndex(j) + k;
    }
    return i;
  }
  
  public int getLastWindowIndex(boolean paramBoolean)
  {
    int i = childCount;
    if (i == 0) {
      return -1;
    }
    if (isAtomic) {
      paramBoolean = false;
    }
    if (paramBoolean) {
      i = shuffleOrder.getLastIndex();
    } else {
      i--;
    }
    while (getTimelineByChildIndex(i).isEmpty())
    {
      j = getPreviousChildIndex(i, paramBoolean);
      i = j;
      if (j == -1) {
        return -1;
      }
    }
    int j = getFirstWindowIndexByChildIndex(i);
    return getTimelineByChildIndex(i).getLastWindowIndex(paramBoolean) + j;
  }
  
  public int getNextWindowIndex(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    boolean bool = isAtomic;
    int i = 0;
    int j = paramInt2;
    if (bool)
    {
      j = paramInt2;
      if (paramInt2 == 1) {
        j = 2;
      }
      paramBoolean = false;
    }
    int k = getChildIndexByWindowIndex(paramInt1);
    int m = getFirstWindowIndexByChildIndex(k);
    Timeline localTimeline = getTimelineByChildIndex(k);
    if (j == 2) {
      paramInt2 = i;
    } else {
      paramInt2 = j;
    }
    paramInt1 = localTimeline.getNextWindowIndex(paramInt1 - m, paramInt2, paramBoolean);
    if (paramInt1 != -1) {
      return m + paramInt1;
    }
    for (paramInt1 = getNextChildIndex(k, paramBoolean); (paramInt1 != -1) && (getTimelineByChildIndex(paramInt1).isEmpty()); paramInt1 = getNextChildIndex(paramInt1, paramBoolean)) {}
    if (paramInt1 != -1)
    {
      paramInt2 = getFirstWindowIndexByChildIndex(paramInt1);
      return getTimelineByChildIndex(paramInt1).getFirstWindowIndex(paramBoolean) + paramInt2;
    }
    if (j == 2) {
      return getFirstWindowIndex(paramBoolean);
    }
    return -1;
  }
  
  public final Timeline.Period getPeriod(int paramInt, Timeline.Period paramPeriod, boolean paramBoolean)
  {
    int i = getChildIndexByPeriodIndex(paramInt);
    int j = getFirstWindowIndexByChildIndex(i);
    int k = getFirstPeriodIndexByChildIndex(i);
    getTimelineByChildIndex(i).getPeriod(paramInt - k, paramPeriod, paramBoolean);
    windowIndex += j;
    if (paramBoolean) {
      uid = getConcatenatedUid(getChildUidByChildIndex(i), uid);
    }
    return paramPeriod;
  }
  
  public final Timeline.Period getPeriodByUid(Object paramObject, Timeline.Period paramPeriod)
  {
    Object localObject1 = getChildTimelineUidFromConcatenatedUid(paramObject);
    Object localObject2 = getChildPeriodUidFromConcatenatedUid(paramObject);
    int i = getChildIndexByChildUid(localObject1);
    int j = getFirstWindowIndexByChildIndex(i);
    getTimelineByChildIndex(i).getPeriodByUid(localObject2, paramPeriod);
    windowIndex += j;
    uid = paramObject;
    return paramPeriod;
  }
  
  public int getPreviousWindowIndex(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    boolean bool = isAtomic;
    int i = 0;
    int j = paramInt2;
    if (bool)
    {
      j = paramInt2;
      if (paramInt2 == 1) {
        j = 2;
      }
      paramBoolean = false;
    }
    int k = getChildIndexByWindowIndex(paramInt1);
    int m = getFirstWindowIndexByChildIndex(k);
    Timeline localTimeline = getTimelineByChildIndex(k);
    if (j == 2) {
      paramInt2 = i;
    } else {
      paramInt2 = j;
    }
    paramInt1 = localTimeline.getPreviousWindowIndex(paramInt1 - m, paramInt2, paramBoolean);
    if (paramInt1 != -1) {
      return m + paramInt1;
    }
    for (paramInt1 = getPreviousChildIndex(k, paramBoolean); (paramInt1 != -1) && (getTimelineByChildIndex(paramInt1).isEmpty()); paramInt1 = getPreviousChildIndex(paramInt1, paramBoolean)) {}
    if (paramInt1 != -1)
    {
      paramInt2 = getFirstWindowIndexByChildIndex(paramInt1);
      return getTimelineByChildIndex(paramInt1).getLastWindowIndex(paramBoolean) + paramInt2;
    }
    if (j == 2) {
      return getLastWindowIndex(paramBoolean);
    }
    return -1;
  }
  
  public abstract Timeline getTimelineByChildIndex(int paramInt);
  
  public final Object getUidOfPeriod(int paramInt)
  {
    int i = getChildIndexByPeriodIndex(paramInt);
    int j = getFirstPeriodIndexByChildIndex(i);
    Object localObject = getTimelineByChildIndex(i).getUidOfPeriod(paramInt - j);
    return getConcatenatedUid(getChildUidByChildIndex(i), localObject);
  }
  
  public final Timeline.Window getWindow(int paramInt, Timeline.Window paramWindow, boolean paramBoolean, long paramLong)
  {
    int i = getChildIndexByWindowIndex(paramInt);
    int j = getFirstWindowIndexByChildIndex(i);
    int k = getFirstPeriodIndexByChildIndex(i);
    getTimelineByChildIndex(i).getWindow(paramInt - j, paramWindow, paramBoolean, paramLong);
    firstPeriodIndex += k;
    lastPeriodIndex += k;
    return paramWindow;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.AbstractConcatenatedTimeline
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */