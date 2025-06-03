package com.devbrackets.android.exomedia.ui.widget;

import com.devbrackets.android.exomedia.listener.VideoControlsButtonListener;
import com.devbrackets.android.exomedia.listener.VideoControlsSeekListener;

public class VideoControls$InternalListener
  implements VideoControlsSeekListener, VideoControlsButtonListener
{
  public boolean pausedForSeek = false;
  
  public VideoControls$InternalListener(VideoControls paramVideoControls) {}
  
  public boolean onFastForwardClicked()
  {
    return false;
  }
  
  public boolean onNextClicked()
  {
    return false;
  }
  
  public boolean onPlayPauseClicked()
  {
    VideoView localVideoView = this$0.videoView;
    if (localVideoView == null) {
      return false;
    }
    if (localVideoView.isPlaying()) {
      this$0.videoView.pause();
    } else {
      this$0.videoView.start();
    }
    return true;
  }
  
  public boolean onPreviousClicked()
  {
    return false;
  }
  
  public boolean onRewindClicked()
  {
    return false;
  }
  
  public boolean onSeekEnded(long paramLong)
  {
    VideoView localVideoView = this$0.videoView;
    if (localVideoView == null) {
      return false;
    }
    localVideoView.seekTo(paramLong);
    if (pausedForSeek)
    {
      pausedForSeek = false;
      this$0.videoView.start();
      this$0.hideDelayed();
    }
    return true;
  }
  
  public boolean onSeekStarted()
  {
    VideoView localVideoView = this$0.videoView;
    if (localVideoView == null) {
      return false;
    }
    if (localVideoView.isPlaying())
    {
      pausedForSeek = true;
      this$0.videoView.pause(true);
    }
    this$0.show();
    return true;
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.ui.widget.VideoControls.InternalListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */