package com.devbrackets.android.exomedia;

import com.devbrackets.android.exomedia.core.ListenerMux.Notifier;
import com.devbrackets.android.exomedia.core.api.AudioPlayerApi;
import com.devbrackets.android.exomedia.core.exoplayer.ExoMediaPlayer;

class AudioPlayer$MuxNotifier
  extends ListenerMux.Notifier
{
  private AudioPlayer$MuxNotifier(AudioPlayer paramAudioPlayer) {}
  
  public void onExoPlayerError(ExoMediaPlayer paramExoMediaPlayer, Exception paramException)
  {
    this$0.stopPlayback();
    if (paramExoMediaPlayer != null) {
      paramExoMediaPlayer.forcePrepare();
    }
  }
  
  public void onMediaPlaybackEnded()
  {
    AudioPlayer.access$100(this$0);
  }
  
  public void onPrepared()
  {
    this$0.audioPlayerImpl.onMediaPrepared();
  }
  
  public boolean shouldNotifyCompletion(long paramLong)
  {
    long l1 = this$0.getCurrentPosition();
    long l2 = this$0.getDuration();
    boolean bool;
    if ((l1 > 0L) && (l2 > 0L) && (l1 + paramLong >= l2)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.AudioPlayer.MuxNotifier
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */