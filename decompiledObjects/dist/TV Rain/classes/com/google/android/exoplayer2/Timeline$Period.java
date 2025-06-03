package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup;

public final class Timeline$Period
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

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.Timeline.Period
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */