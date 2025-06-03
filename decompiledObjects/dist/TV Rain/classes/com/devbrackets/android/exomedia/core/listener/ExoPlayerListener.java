package com.devbrackets.android.exomedia.core.listener;

import com.devbrackets.android.exomedia.core.exoplayer.ExoMediaPlayer;
import com.devbrackets.android.exomedia.listener.OnSeekCompletionListener;

public abstract interface ExoPlayerListener
  extends OnSeekCompletionListener
{
  public abstract void onError(ExoMediaPlayer paramExoMediaPlayer, Exception paramException);
  
  public abstract void onStateChanged(boolean paramBoolean, int paramInt);
  
  public abstract void onVideoSizeChanged(int paramInt1, int paramInt2, int paramInt3, float paramFloat);
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.core.listener.ExoPlayerListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */