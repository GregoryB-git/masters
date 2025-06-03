package com.devbrackets.android.exomedia.core.audio;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import com.devbrackets.android.exomedia.core.ListenerMux;

public class NativeAudioPlayer$InternalListeners
  implements MediaPlayer.OnBufferingUpdateListener
{
  public NativeAudioPlayer$InternalListeners(NativeAudioPlayer paramNativeAudioPlayer) {}
  
  public void onBufferingUpdate(MediaPlayer paramMediaPlayer, int paramInt)
  {
    this$0.listenerMux.onBufferingUpdate(paramInt);
    this$0.currentBufferPercent = paramInt;
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.core.audio.NativeAudioPlayer.InternalListeners
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */