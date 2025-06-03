package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

final class CompositeMediaSource$ForwardingEventListener
  implements MediaSourceEventListener
{
  private MediaSourceEventListener.EventDispatcher eventDispatcher;
  private final T id;
  
  public CompositeMediaSource$ForwardingEventListener(T paramT)
  {
    eventDispatcher = paramT.createEventDispatcher(null);
    Object localObject;
    id = localObject;
  }
  
  private boolean maybeUpdateEventDispatcher(int paramInt, @Nullable MediaSource.MediaPeriodId paramMediaPeriodId)
  {
    if (paramMediaPeriodId != null)
    {
      localObject = this$0.getMediaPeriodIdForChildMediaPeriodId(id, paramMediaPeriodId);
      paramMediaPeriodId = (MediaSource.MediaPeriodId)localObject;
      if (localObject == null) {
        return false;
      }
    }
    else
    {
      paramMediaPeriodId = null;
    }
    paramInt = this$0.getWindowIndexForChildWindowIndex(id, paramInt);
    Object localObject = eventDispatcher;
    if ((windowIndex != paramInt) || (!Util.areEqual(mediaPeriodId, paramMediaPeriodId))) {
      eventDispatcher = this$0.createEventDispatcher(paramInt, paramMediaPeriodId, 0L);
    }
    return true;
  }
  
  private MediaSourceEventListener.MediaLoadData maybeUpdateMediaLoadData(MediaSourceEventListener.MediaLoadData paramMediaLoadData)
  {
    long l1 = this$0.getMediaTimeForChildMediaTime(id, mediaStartTimeMs);
    long l2 = this$0.getMediaTimeForChildMediaTime(id, mediaEndTimeMs);
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

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.CompositeMediaSource.ForwardingEventListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */