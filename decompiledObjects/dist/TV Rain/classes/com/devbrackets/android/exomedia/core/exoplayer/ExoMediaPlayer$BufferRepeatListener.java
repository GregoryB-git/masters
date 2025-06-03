package com.devbrackets.android.exomedia.core.exoplayer;

import com.devbrackets.android.exomedia.listener.OnBufferUpdateListener;
import com.devbrackets.android.exomedia.util.Repeater.RepeatListener;

class ExoMediaPlayer$BufferRepeatListener
  implements Repeater.RepeatListener
{
  private ExoMediaPlayer$BufferRepeatListener(ExoMediaPlayer paramExoMediaPlayer) {}
  
  public void onRepeat()
  {
    if (ExoMediaPlayer.access$500(this$0) != null) {
      ExoMediaPlayer.access$500(this$0).onBufferingUpdate(this$0.getBufferedPercentage());
    }
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.core.exoplayer.ExoMediaPlayer.BufferRepeatListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */