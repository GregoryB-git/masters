package com.google.android.exoplayer2.source;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.io.IOException;

public abstract interface MediaSource
{
  public abstract void addEventListener(Handler paramHandler, MediaSourceEventListener paramMediaSourceEventListener);
  
  public abstract MediaPeriod createPeriod(MediaPeriodId paramMediaPeriodId, Allocator paramAllocator);
  
  public abstract void maybeThrowSourceInfoRefreshError()
    throws IOException;
  
  @Deprecated
  public abstract void prepareSource(ExoPlayer paramExoPlayer, boolean paramBoolean, SourceInfoRefreshListener paramSourceInfoRefreshListener);
  
  public abstract void prepareSource(ExoPlayer paramExoPlayer, boolean paramBoolean, SourceInfoRefreshListener paramSourceInfoRefreshListener, @Nullable TransferListener paramTransferListener);
  
  public abstract void releasePeriod(MediaPeriod paramMediaPeriod);
  
  public abstract void releaseSource(SourceInfoRefreshListener paramSourceInfoRefreshListener);
  
  public abstract void removeEventListener(MediaSourceEventListener paramMediaSourceEventListener);
  
  public static final class MediaPeriodId
  {
    public final int adGroupIndex;
    public final int adIndexInAdGroup;
    public final long endPositionUs;
    public final Object periodUid;
    public final long windowSequenceNumber;
    
    public MediaPeriodId(Object paramObject)
    {
      this(paramObject, -1L);
    }
    
    public MediaPeriodId(Object paramObject, int paramInt1, int paramInt2, long paramLong)
    {
      this(paramObject, paramInt1, paramInt2, paramLong, Long.MIN_VALUE);
    }
    
    private MediaPeriodId(Object paramObject, int paramInt1, int paramInt2, long paramLong1, long paramLong2)
    {
      periodUid = paramObject;
      adGroupIndex = paramInt1;
      adIndexInAdGroup = paramInt2;
      windowSequenceNumber = paramLong1;
      endPositionUs = paramLong2;
    }
    
    public MediaPeriodId(Object paramObject, long paramLong)
    {
      this(paramObject, -1, -1, paramLong, Long.MIN_VALUE);
    }
    
    public MediaPeriodId(Object paramObject, long paramLong1, long paramLong2)
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
  
  public static abstract interface SourceInfoRefreshListener
  {
    public abstract void onSourceInfoRefreshed(MediaSource paramMediaSource, Timeline paramTimeline, @Nullable Object paramObject);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.MediaSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */