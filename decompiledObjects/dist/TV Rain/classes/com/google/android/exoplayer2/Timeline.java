package com.google.android.exoplayer2;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup;
import com.google.android.exoplayer2.util.Assertions;

public abstract class Timeline
{
  public static final Timeline EMPTY = new Timeline()
  {
    public int getIndexOfPeriod(Object paramAnonymousObject)
    {
      return -1;
    }
    
    public Timeline.Period getPeriod(int paramAnonymousInt, Timeline.Period paramAnonymousPeriod, boolean paramAnonymousBoolean)
    {
      throw new IndexOutOfBoundsException();
    }
    
    public int getPeriodCount()
    {
      return 0;
    }
    
    public Object getUidOfPeriod(int paramAnonymousInt)
    {
      throw new IndexOutOfBoundsException();
    }
    
    public Timeline.Window getWindow(int paramAnonymousInt, Timeline.Window paramAnonymousWindow, boolean paramAnonymousBoolean, long paramAnonymousLong)
    {
      throw new IndexOutOfBoundsException();
    }
    
    public int getWindowCount()
    {
      return 0;
    }
  };
  
  public int getFirstWindowIndex(boolean paramBoolean)
  {
    int i;
    if (isEmpty()) {
      i = -1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public abstract int getIndexOfPeriod(Object paramObject);
  
  public int getLastWindowIndex(boolean paramBoolean)
  {
    int i;
    if (isEmpty()) {
      i = -1;
    } else {
      i = getWindowCount() - 1;
    }
    return i;
  }
  
  public final int getNextPeriodIndex(int paramInt1, Period paramPeriod, Window paramWindow, int paramInt2, boolean paramBoolean)
  {
    int i = getPeriodwindowIndex;
    if (getWindowlastPeriodIndex == paramInt1)
    {
      paramInt1 = getNextWindowIndex(i, paramInt2, paramBoolean);
      if (paramInt1 == -1) {
        return -1;
      }
      return getWindowfirstPeriodIndex;
    }
    return paramInt1 + 1;
  }
  
  public int getNextWindowIndex(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramInt2 != 0)
    {
      if (paramInt2 != 1)
      {
        if (paramInt2 == 2)
        {
          if (paramInt1 == getLastWindowIndex(paramBoolean)) {
            paramInt1 = getFirstWindowIndex(paramBoolean);
          } else {
            paramInt1++;
          }
          return paramInt1;
        }
        throw new IllegalStateException();
      }
      return paramInt1;
    }
    if (paramInt1 == getLastWindowIndex(paramBoolean)) {
      paramInt1 = -1;
    } else {
      paramInt1++;
    }
    return paramInt1;
  }
  
  public final Period getPeriod(int paramInt, Period paramPeriod)
  {
    return getPeriod(paramInt, paramPeriod, false);
  }
  
  public abstract Period getPeriod(int paramInt, Period paramPeriod, boolean paramBoolean);
  
  public Period getPeriodByUid(Object paramObject, Period paramPeriod)
  {
    return getPeriod(getIndexOfPeriod(paramObject), paramPeriod, true);
  }
  
  public abstract int getPeriodCount();
  
  public final Pair<Object, Long> getPeriodPosition(Window paramWindow, Period paramPeriod, int paramInt, long paramLong)
  {
    return getPeriodPosition(paramWindow, paramPeriod, paramInt, paramLong, 0L);
  }
  
  public final Pair<Object, Long> getPeriodPosition(Window paramWindow, Period paramPeriod, int paramInt, long paramLong1, long paramLong2)
  {
    Assertions.checkIndex(paramInt, 0, getWindowCount());
    getWindow(paramInt, paramWindow, false, paramLong2);
    paramLong2 = paramLong1;
    if (paramLong1 == -9223372036854775807L)
    {
      paramLong1 = paramWindow.getDefaultPositionUs();
      paramLong2 = paramLong1;
      if (paramLong1 == -9223372036854775807L) {
        return null;
      }
    }
    paramInt = firstPeriodIndex;
    paramLong2 = paramWindow.getPositionInFirstPeriodUs() + paramLong2;
    for (paramLong1 = getPeriod(paramInt, paramPeriod, true).getDurationUs(); (paramLong1 != -9223372036854775807L) && (paramLong2 >= paramLong1) && (paramInt < lastPeriodIndex); paramLong1 = getPeriod(paramInt, paramPeriod, true).getDurationUs())
    {
      paramLong2 -= paramLong1;
      paramInt++;
    }
    return Pair.create(uid, Long.valueOf(paramLong2));
  }
  
  public int getPreviousWindowIndex(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramInt2 != 0)
    {
      if (paramInt2 != 1)
      {
        if (paramInt2 == 2)
        {
          if (paramInt1 == getFirstWindowIndex(paramBoolean)) {
            paramInt1 = getLastWindowIndex(paramBoolean);
          } else {
            paramInt1--;
          }
          return paramInt1;
        }
        throw new IllegalStateException();
      }
      return paramInt1;
    }
    if (paramInt1 == getFirstWindowIndex(paramBoolean)) {
      paramInt1 = -1;
    } else {
      paramInt1--;
    }
    return paramInt1;
  }
  
  public abstract Object getUidOfPeriod(int paramInt);
  
  public final Window getWindow(int paramInt, Window paramWindow)
  {
    return getWindow(paramInt, paramWindow, false);
  }
  
  public final Window getWindow(int paramInt, Window paramWindow, boolean paramBoolean)
  {
    return getWindow(paramInt, paramWindow, paramBoolean, 0L);
  }
  
  public abstract Window getWindow(int paramInt, Window paramWindow, boolean paramBoolean, long paramLong);
  
  public abstract int getWindowCount();
  
  public final boolean isEmpty()
  {
    boolean bool;
    if (getWindowCount() == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean isLastPeriod(int paramInt1, Period paramPeriod, Window paramWindow, int paramInt2, boolean paramBoolean)
  {
    if (getNextPeriodIndex(paramInt1, paramPeriod, paramWindow, paramInt2, paramBoolean) == -1) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    return paramBoolean;
  }
  
  public static final class Period
  {
    private AdPlaybackState adPlaybackState;
    public long durationUs;
    public Object id;
    private long positionInWindowUs;
    public Object uid;
    public int windowIndex;
    
    public int getAdCountInAdGroup(int paramInt)
    {
      return adPlaybackState.adGroups[paramInt].count;
    }
    
    public long getAdDurationUs(int paramInt1, int paramInt2)
    {
      AdPlaybackState.AdGroup localAdGroup = adPlaybackState.adGroups[paramInt1];
      long l;
      if (count != -1) {
        l = durationsUs[paramInt2];
      } else {
        l = -9223372036854775807L;
      }
      return l;
    }
    
    public int getAdGroupCount()
    {
      return adPlaybackState.adGroupCount;
    }
    
    public int getAdGroupIndexAfterPositionUs(long paramLong)
    {
      return adPlaybackState.getAdGroupIndexAfterPositionUs(paramLong);
    }
    
    public int getAdGroupIndexForPositionUs(long paramLong)
    {
      return adPlaybackState.getAdGroupIndexForPositionUs(paramLong);
    }
    
    public long getAdGroupTimeUs(int paramInt)
    {
      return adPlaybackState.adGroupTimesUs[paramInt];
    }
    
    public long getAdResumePositionUs()
    {
      return adPlaybackState.adResumePositionUs;
    }
    
    public long getDurationMs()
    {
      return C.usToMs(durationUs);
    }
    
    public long getDurationUs()
    {
      return durationUs;
    }
    
    public int getFirstAdIndexToPlay(int paramInt)
    {
      return adPlaybackState.adGroups[paramInt].getFirstAdIndexToPlay();
    }
    
    public int getNextAdIndexToPlay(int paramInt1, int paramInt2)
    {
      return adPlaybackState.adGroups[paramInt1].getNextAdIndexToPlay(paramInt2);
    }
    
    public long getPositionInWindowMs()
    {
      return C.usToMs(positionInWindowUs);
    }
    
    public long getPositionInWindowUs()
    {
      return positionInWindowUs;
    }
    
    public boolean hasPlayedAdGroup(int paramInt)
    {
      return adPlaybackState.adGroups[paramInt].hasUnplayedAds() ^ true;
    }
    
    public boolean isAdAvailable(int paramInt1, int paramInt2)
    {
      AdPlaybackState.AdGroup localAdGroup = adPlaybackState.adGroups[paramInt1];
      boolean bool;
      if ((count != -1) && (states[paramInt2] != 0)) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public Period set(Object paramObject1, Object paramObject2, int paramInt, long paramLong1, long paramLong2)
    {
      return set(paramObject1, paramObject2, paramInt, paramLong1, paramLong2, AdPlaybackState.NONE);
    }
    
    public Period set(Object paramObject1, Object paramObject2, int paramInt, long paramLong1, long paramLong2, AdPlaybackState paramAdPlaybackState)
    {
      id = paramObject1;
      uid = paramObject2;
      windowIndex = paramInt;
      durationUs = paramLong1;
      positionInWindowUs = paramLong2;
      adPlaybackState = paramAdPlaybackState;
      return this;
    }
  }
  
  public static final class Window
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
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.Timeline
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */