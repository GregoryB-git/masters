package com.devbrackets.android.exomedia.core.video.exo;

import androidx.annotation.IntRange;
import com.devbrackets.android.exomedia.core.ListenerMux;
import com.devbrackets.android.exomedia.core.listener.MetadataListener;
import com.devbrackets.android.exomedia.listener.OnBufferUpdateListener;
import com.google.android.exoplayer2.metadata.Metadata;

public class ExoVideoDelegate$InternalListeners
  implements MetadataListener, OnBufferUpdateListener
{
  public ExoVideoDelegate$InternalListeners(ExoVideoDelegate paramExoVideoDelegate) {}
  
  public void onBufferingUpdate(@IntRange(from=0L, to=100L) int paramInt)
  {
    this$0.listenerMux.onBufferingUpdate(paramInt);
  }
  
  public void onMetadata(Metadata paramMetadata)
  {
    this$0.listenerMux.onMetadata(paramMetadata);
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.core.video.exo.ExoVideoDelegate.InternalListeners
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */