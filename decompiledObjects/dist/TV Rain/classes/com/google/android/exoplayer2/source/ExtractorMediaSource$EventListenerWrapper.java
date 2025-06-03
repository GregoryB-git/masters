package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;

@Deprecated
final class ExtractorMediaSource$EventListenerWrapper
  extends DefaultMediaSourceEventListener
{
  private final ExtractorMediaSource.EventListener eventListener;
  
  public ExtractorMediaSource$EventListenerWrapper(ExtractorMediaSource.EventListener paramEventListener)
  {
    eventListener = ((ExtractorMediaSource.EventListener)Assertions.checkNotNull(paramEventListener));
  }
  
  public void onLoadError(int paramInt, @Nullable MediaSource.MediaPeriodId paramMediaPeriodId, MediaSourceEventListener.LoadEventInfo paramLoadEventInfo, MediaSourceEventListener.MediaLoadData paramMediaLoadData, IOException paramIOException, boolean paramBoolean)
  {
    eventListener.onLoadError(paramIOException);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.ExtractorMediaSource.EventListenerWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */