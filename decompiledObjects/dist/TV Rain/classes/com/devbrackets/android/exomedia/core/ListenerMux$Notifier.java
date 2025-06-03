package com.devbrackets.android.exomedia.core;

import com.devbrackets.android.exomedia.core.exoplayer.ExoMediaPlayer;

public abstract class ListenerMux$Notifier
{
  public void onBufferUpdated(int paramInt) {}
  
  public abstract void onExoPlayerError(ExoMediaPlayer paramExoMediaPlayer, Exception paramException);
  
  public abstract void onMediaPlaybackEnded();
  
  public void onPrepared() {}
  
  public void onPreviewImageStateChanged(boolean paramBoolean) {}
  
  public void onSeekComplete() {}
  
  public void onVideoSizeChanged(int paramInt1, int paramInt2, int paramInt3, float paramFloat) {}
  
  public abstract boolean shouldNotifyCompletion(long paramLong);
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.core.ListenerMux.Notifier
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */