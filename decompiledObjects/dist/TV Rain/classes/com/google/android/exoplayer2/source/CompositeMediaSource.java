package com.google.android.exoplayer2.source;

import android.os.Handler;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import m0;

public abstract class CompositeMediaSource<T>
  extends BaseMediaSource
{
  private final HashMap<T, MediaSourceAndListener> childSources = new HashMap();
  @Nullable
  private Handler eventHandler;
  @Nullable
  private TransferListener mediaTransferListener;
  @Nullable
  private ExoPlayer player;
  
  @Nullable
  public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(T paramT, MediaSource.MediaPeriodId paramMediaPeriodId)
  {
    return paramMediaPeriodId;
  }
  
  public long getMediaTimeForChildMediaTime(@Nullable T paramT, long paramLong)
  {
    return paramLong;
  }
  
  public int getWindowIndexForChildWindowIndex(T paramT, int paramInt)
  {
    return paramInt;
  }
  
  @CallSuper
  public void maybeThrowSourceInfoRefreshError()
    throws IOException
  {
    Iterator localIterator = childSources.values().iterator();
    while (localIterator.hasNext()) {
      nextmediaSource.maybeThrowSourceInfoRefreshError();
    }
  }
  
  public abstract void onChildSourceInfoRefreshed(T paramT, MediaSource paramMediaSource, Timeline paramTimeline, @Nullable Object paramObject);
  
  public final void prepareChildSource(T paramT, MediaSource paramMediaSource)
  {
    Assertions.checkArgument(childSources.containsKey(paramT) ^ true);
    m0 localm0 = new m0(this, paramT);
    ForwardingEventListener localForwardingEventListener = new ForwardingEventListener(paramT);
    childSources.put(paramT, new MediaSourceAndListener(paramMediaSource, localm0, localForwardingEventListener));
    paramMediaSource.addEventListener((Handler)Assertions.checkNotNull(eventHandler), localForwardingEventListener);
    paramMediaSource.prepareSource((ExoPlayer)Assertions.checkNotNull(player), false, localm0, mediaTransferListener);
  }
  
  @CallSuper
  public void prepareSourceInternal(ExoPlayer paramExoPlayer, boolean paramBoolean, @Nullable TransferListener paramTransferListener)
  {
    player = paramExoPlayer;
    mediaTransferListener = paramTransferListener;
    eventHandler = new Handler();
  }
  
  public final void releaseChildSource(T paramT)
  {
    paramT = (MediaSourceAndListener)Assertions.checkNotNull(childSources.remove(paramT));
    mediaSource.releaseSource(listener);
    mediaSource.removeEventListener(eventListener);
  }
  
  @CallSuper
  public void releaseSourceInternal()
  {
    Iterator localIterator = childSources.values().iterator();
    while (localIterator.hasNext())
    {
      MediaSourceAndListener localMediaSourceAndListener = (MediaSourceAndListener)localIterator.next();
      mediaSource.releaseSource(listener);
      mediaSource.removeEventListener(eventListener);
    }
    childSources.clear();
    player = null;
  }
  
  public final class ForwardingEventListener
    implements MediaSourceEventListener
  {
    private MediaSourceEventListener.EventDispatcher eventDispatcher = createEventDispatcher(null);
    private final T id;
    
    public ForwardingEventListener()
    {
      Object localObject;
      id = localObject;
    }
    
    private boolean maybeUpdateEventDispatcher(int paramInt, @Nullable MediaSource.MediaPeriodId paramMediaPeriodId)
    {
      if (paramMediaPeriodId != null)
      {
        localObject = getMediaPeriodIdForChildMediaPeriodId(id, paramMediaPeriodId);
        paramMediaPeriodId = (MediaSource.MediaPeriodId)localObject;
        if (localObject == null) {
          return false;
        }
      }
      else
      {
        paramMediaPeriodId = null;
      }
      paramInt = getWindowIndexForChildWindowIndex(id, paramInt);
      Object localObject = eventDispatcher;
      if ((windowIndex != paramInt) || (!Util.areEqual(mediaPeriodId, paramMediaPeriodId))) {
        eventDispatcher = createEventDispatcher(paramInt, paramMediaPeriodId, 0L);
      }
      return true;
    }
    
    private MediaSourceEventListener.MediaLoadData maybeUpdateMediaLoadData(MediaSourceEventListener.MediaLoadData paramMediaLoadData)
    {
      long l1 = getMediaTimeForChildMediaTime(id, mediaStartTimeMs);
      long l2 = getMediaTimeForChildMediaTime(id, mediaEndTimeMs);
      if ((l1 == mediaStartTimeMs) && (l2 == mediaEndTimeMs)) {
        return paramMediaLoadData;
      }
      return new MediaSourceEventListener.MediaLoadData(dataType, trackType, trackFormat, trackSelectionReason, trackSelectionData, l1, l2);
    }
    
    public void onDownstreamFormatChanged(int paramInt, @Nullable MediaSource.MediaPeriodId paramMediaPeriodId, MediaSourceEventListener.MediaLoadData paramMediaLoadData)
    {
      if (maybeUpdateEventDispatcher(paramInt, paramMediaPeriodId)) {
        eventDispatcher.downstreamFormatChanged(maybeUpdateMediaLoadData(paramMediaLoadData));
      }
    }
    
    public void onLoadCanceled(int paramInt, @Nullable MediaSource.MediaPeriodId paramMediaPeriodId, MediaSourceEventListener.LoadEventInfo paramLoadEventInfo, MediaSourceEventListener.MediaLoadData paramMediaLoadData)
    {
      if (maybeUpdateEventDispatcher(paramInt, paramMediaPeriodId)) {
        eventDispatcher.loadCanceled(paramLoadEventInfo, maybeUpdateMediaLoadData(paramMediaLoadData));
      }
    }
    
    public void onLoadCompleted(int paramInt, @Nullable MediaSource.MediaPeriodId paramMediaPeriodId, MediaSourceEventListener.LoadEventInfo paramLoadEventInfo, MediaSourceEventListener.MediaLoadData paramMediaLoadData)
    {
      if (maybeUpdateEventDispatcher(paramInt, paramMediaPeriodId)) {
        eventDispatcher.loadCompleted(paramLoadEventInfo, maybeUpdateMediaLoadData(paramMediaLoadData));
      }
    }
    
    public void onLoadError(int paramInt, @Nullable MediaSource.MediaPeriodId paramMediaPeriodId, MediaSourceEventListener.LoadEventInfo paramLoadEventInfo, MediaSourceEventListener.MediaLoadData paramMediaLoadData, IOException paramIOException, boolean paramBoolean)
    {
      if (maybeUpdateEventDispatcher(paramInt, paramMediaPeriodId)) {
        eventDispatcher.loadError(paramLoadEventInfo, maybeUpdateMediaLoadData(paramMediaLoadData), paramIOException, paramBoolean);
      }
    }
    
    public void onLoadStarted(int paramInt, @Nullable MediaSource.MediaPeriodId paramMediaPeriodId, MediaSourceEventListener.LoadEventInfo paramLoadEventInfo, MediaSourceEventListener.MediaLoadData paramMediaLoadData)
    {
      if (maybeUpdateEventDispatcher(paramInt, paramMediaPeriodId)) {
        eventDispatcher.loadStarted(paramLoadEventInfo, maybeUpdateMediaLoadData(paramMediaLoadData));
      }
    }
    
    public void onMediaPeriodCreated(int paramInt, MediaSource.MediaPeriodId paramMediaPeriodId)
    {
      if (maybeUpdateEventDispatcher(paramInt, paramMediaPeriodId)) {
        eventDispatcher.mediaPeriodCreated();
      }
    }
    
    public void onMediaPeriodReleased(int paramInt, MediaSource.MediaPeriodId paramMediaPeriodId)
    {
      if (maybeUpdateEventDispatcher(paramInt, paramMediaPeriodId)) {
        eventDispatcher.mediaPeriodReleased();
      }
    }
    
    public void onReadingStarted(int paramInt, MediaSource.MediaPeriodId paramMediaPeriodId)
    {
      if (maybeUpdateEventDispatcher(paramInt, paramMediaPeriodId)) {
        eventDispatcher.readingStarted();
      }
    }
    
    public void onUpstreamDiscarded(int paramInt, @Nullable MediaSource.MediaPeriodId paramMediaPeriodId, MediaSourceEventListener.MediaLoadData paramMediaLoadData)
    {
      if (maybeUpdateEventDispatcher(paramInt, paramMediaPeriodId)) {
        eventDispatcher.upstreamDiscarded(maybeUpdateMediaLoadData(paramMediaLoadData));
      }
    }
  }
  
  public static final class MediaSourceAndListener
  {
    public final MediaSourceEventListener eventListener;
    public final MediaSource.SourceInfoRefreshListener listener;
    public final MediaSource mediaSource;
    
    public MediaSourceAndListener(MediaSource paramMediaSource, MediaSource.SourceInfoRefreshListener paramSourceInfoRefreshListener, MediaSourceEventListener paramMediaSourceEventListener)
    {
      mediaSource = paramMediaSource;
      listener = paramSourceInfoRefreshListener;
      eventListener = paramMediaSourceEventListener;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.CompositeMediaSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */