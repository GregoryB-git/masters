package com.google.android.exoplayer2.source;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class BaseMediaSource
  implements MediaSource
{
  private final MediaSourceEventListener.EventDispatcher eventDispatcher = new MediaSourceEventListener.EventDispatcher();
  @Nullable
  private Object manifest;
  @Nullable
  private ExoPlayer player;
  private final ArrayList<MediaSource.SourceInfoRefreshListener> sourceInfoListeners = new ArrayList(1);
  @Nullable
  private Timeline timeline;
  
  public final void addEventListener(Handler paramHandler, MediaSourceEventListener paramMediaSourceEventListener)
  {
    eventDispatcher.addEventListener(paramHandler, paramMediaSourceEventListener);
  }
  
  public final MediaSourceEventListener.EventDispatcher createEventDispatcher(int paramInt, @Nullable MediaSource.MediaPeriodId paramMediaPeriodId, long paramLong)
  {
    return eventDispatcher.withParameters(paramInt, paramMediaPeriodId, paramLong);
  }
  
  public final MediaSourceEventListener.EventDispatcher createEventDispatcher(@Nullable MediaSource.MediaPeriodId paramMediaPeriodId)
  {
    return eventDispatcher.withParameters(0, paramMediaPeriodId, 0L);
  }
  
  public final MediaSourceEventListener.EventDispatcher createEventDispatcher(MediaSource.MediaPeriodId paramMediaPeriodId, long paramLong)
  {
    boolean bool;
    if (paramMediaPeriodId != null) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkArgument(bool);
    return eventDispatcher.withParameters(0, paramMediaPeriodId, paramLong);
  }
  
  public final void prepareSource(ExoPlayer paramExoPlayer, boolean paramBoolean, MediaSource.SourceInfoRefreshListener paramSourceInfoRefreshListener)
  {
    prepareSource(paramExoPlayer, paramBoolean, paramSourceInfoRefreshListener, null);
  }
  
  public final void prepareSource(ExoPlayer paramExoPlayer, boolean paramBoolean, MediaSource.SourceInfoRefreshListener paramSourceInfoRefreshListener, @Nullable TransferListener paramTransferListener)
  {
    ExoPlayer localExoPlayer = player;
    boolean bool;
    if ((localExoPlayer != null) && (localExoPlayer != paramExoPlayer)) {
      bool = false;
    } else {
      bool = true;
    }
    Assertions.checkArgument(bool);
    sourceInfoListeners.add(paramSourceInfoRefreshListener);
    if (player == null)
    {
      player = paramExoPlayer;
      prepareSourceInternal(paramExoPlayer, paramBoolean, paramTransferListener);
    }
    else
    {
      paramExoPlayer = timeline;
      if (paramExoPlayer != null) {
        paramSourceInfoRefreshListener.onSourceInfoRefreshed(this, paramExoPlayer, manifest);
      }
    }
  }
  
  public abstract void prepareSourceInternal(ExoPlayer paramExoPlayer, boolean paramBoolean, @Nullable TransferListener paramTransferListener);
  
  public final void refreshSourceInfo(Timeline paramTimeline, @Nullable Object paramObject)
  {
    timeline = paramTimeline;
    manifest = paramObject;
    Iterator localIterator = sourceInfoListeners.iterator();
    while (localIterator.hasNext()) {
      ((MediaSource.SourceInfoRefreshListener)localIterator.next()).onSourceInfoRefreshed(this, paramTimeline, paramObject);
    }
  }
  
  public final void releaseSource(MediaSource.SourceInfoRefreshListener paramSourceInfoRefreshListener)
  {
    sourceInfoListeners.remove(paramSourceInfoRefreshListener);
    if (sourceInfoListeners.isEmpty())
    {
      player = null;
      timeline = null;
      manifest = null;
      releaseSourceInternal();
    }
  }
  
  public abstract void releaseSourceInternal();
  
  public final void removeEventListener(MediaSourceEventListener paramMediaSourceEventListener)
  {
    eventDispatcher.removeEventListener(paramMediaSourceEventListener);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.BaseMediaSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */