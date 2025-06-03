package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import java.io.IOException;

public abstract class DefaultMediaSourceEventListener
  implements MediaSourceEventListener
{
  public void onDownstreamFormatChanged(int paramInt, @Nullable MediaSource.MediaPeriodId paramMediaPeriodId, MediaSourceEventListener.MediaLoadData paramMediaLoadData) {}
  
  public void onLoadCanceled(int paramInt, @Nullable MediaSource.MediaPeriodId paramMediaPeriodId, MediaSourceEventListener.LoadEventInfo paramLoadEventInfo, MediaSourceEventListener.MediaLoadData paramMediaLoadData) {}
  
  public void onLoadCompleted(int paramInt, @Nullable MediaSource.MediaPeriodId paramMediaPeriodId, MediaSourceEventListener.LoadEventInfo paramLoadEventInfo, MediaSourceEventListener.MediaLoadData paramMediaLoadData) {}
  
  public void onLoadError(int paramInt, @Nullable MediaSource.MediaPeriodId paramMediaPeriodId, MediaSourceEventListener.LoadEventInfo paramLoadEventInfo, MediaSourceEventListener.MediaLoadData paramMediaLoadData, IOException paramIOException, boolean paramBoolean) {}
  
  public void onLoadStarted(int paramInt, @Nullable MediaSource.MediaPeriodId paramMediaPeriodId, MediaSourceEventListener.LoadEventInfo paramLoadEventInfo, MediaSourceEventListener.MediaLoadData paramMediaLoadData) {}
  
  public void onMediaPeriodCreated(int paramInt, MediaSource.MediaPeriodId paramMediaPeriodId) {}
  
  public void onMediaPeriodReleased(int paramInt, MediaSource.MediaPeriodId paramMediaPeriodId) {}
  
  public void onReadingStarted(int paramInt, MediaSource.MediaPeriodId paramMediaPeriodId) {}
  
  public void onUpstreamDiscarded(int paramInt, @Nullable MediaSource.MediaPeriodId paramMediaPeriodId, MediaSourceEventListener.MediaLoadData paramMediaLoadData) {}
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.DefaultMediaSourceEventListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */