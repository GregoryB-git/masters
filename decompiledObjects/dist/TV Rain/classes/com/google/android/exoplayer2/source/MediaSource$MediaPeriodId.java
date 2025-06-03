package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;

public final class MediaSource$MediaPeriodId
{
  public final int adGroupIndex;
  public final int adIndexInAdGroup;
  public final long endPositionUs;
  public final Object periodUid;
  public final long windowSequenceNumber;
  
  public MediaSource$MediaPeriodId(Object paramObject)
  {
    this(paramObject, -1L);
  }
  
  public MediaSource$MediaPeriodId(Object paramObject, int paramInt1, int paramInt2, long paramLong)
  {
    this(paramObject, paramInt1, paramInt2, paramLong, Long.MIN_VALUE);
  }
  
  private MediaSource$MediaPeriodId(Object paramObject, int paramInt1, int paramInt2, long paramLong1, long paramLong2)
  {
    periodUid = paramObject;
    adGroupIndex = paramInt1;
    adIndexInAdGroup = paramInt2;
    windowSequenceNumber = paramLong1;
    endPositionUs = paramLong2;
  }
  
  public MediaSource$MediaPeriodId(Object paramObject, long paramLong)
  {
    this(paramObject, -1, -1, paramLong, Long.MIN_VALUE);
  }
  
  public MediaSource$MediaPeriodId(Object paramObject, long paramLong1, long paramLong2)
  {
    this(paramObject, -1, -1, paramLong1, paramLong2);
  }
  
  public MediaPeriodId copyWithPeriodUid(Object paramObject)
  {
    if (periodUid.equals(paramObject)) {
      paramObject = this;
    } else {
      paramObject = new MediaPeriodId(paramObject, adGroupIndex, adIndexInAdGroup, windowSequenceNumber, endPositionUs);
    }
    return (MediaPeriodId)paramObject;
  }
  
  public boolean equals(@Nullable Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (MediaPeriodId.class == paramObject.getClass()))
    {
      paramObject = (MediaPeriodId)paramObject;
      if ((!periodUid.equals(periodUid)) || (adGroupIndex != adGroupIndex) || (adIndexInAdGroup != adIndexInAdGroup) || (windowSequenceNumber != windowSequenceNumber) || (endPositionUs != endPositionUs)) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    return ((((periodUid.hashCode() + 527) * 31 + adGroupIndex) * 31 + adIndexInAdGroup) * 31 + (int)windowSequenceNumber) * 31 + (int)endPositionUs;
  }
  
  public boolean isAd()
  {
    boolean bool;
    if (adGroupIndex != -1) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.MediaSource.MediaPeriodId
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */