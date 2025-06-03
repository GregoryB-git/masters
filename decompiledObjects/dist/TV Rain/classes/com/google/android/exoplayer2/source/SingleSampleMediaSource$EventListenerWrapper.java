package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;

@Deprecated
final class SingleSampleMediaSource$EventListenerWrapper
  extends DefaultMediaSourceEventListener
{
  private final SingleSampleMediaSource.EventListener eventListener;
  private final int eventSourceId;
  
  public SingleSampleMediaSource$EventListenerWrapper(SingleSampleMediaSource.EventListener paramEventListener, int paramInt)
  {
    eventListener = ((SingleSampleMediaSource.EventListener)Assertions.checkNotNull(paramEventListener));
    eventSourceId = paramInt;
  }
  
  public void onLoadError(int paramInt, @Nullable MediaSource.MediaPeriodId paramMediaPeriodId, MediaSourceEventListener.LoadEventInfo paramLoadEventInfo, MediaSourceEventListener.MediaLoadData paramMediaLoadData, IOException paramIOException, boolean paramBoolean)
  {
    eventListener.onLoadError(eventSourceId, paramIOException);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.SingleSampleMediaSource.EventListenerWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */