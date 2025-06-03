package com.devbrackets.android.exomedia.ui.widget;

import android.widget.ProgressBar;

public class VideoControlsLeanback$LeanbackInternalListener
  extends VideoControls.InternalListener
{
  public VideoControlsLeanback$LeanbackInternalListener(VideoControlsLeanback paramVideoControlsLeanback)
  {
    super(paramVideoControlsLeanback);
  }
  
  public boolean onFastForwardClicked()
  {
    VideoView localVideoView = this$0.videoView;
    if (localVideoView == null) {
      return false;
    }
    long l1 = localVideoView.getCurrentPosition() + 10000L;
    long l2 = l1;
    if (l1 > this$0.progressBar.getMax()) {
      l2 = this$0.progressBar.getMax();
    }
    this$0.performSeek(l2);
    return true;
  }
  
  public boolean onRewindClicked()
  {
    VideoView localVideoView = this$0.videoView;
    if (localVideoView == null) {
      return false;
    }
    long l1 = localVideoView.getCurrentPosition() - 10000L;
    long l2 = l1;
    if (l1 < 0L) {
      l2 = 0L;
    }
    this$0.performSeek(l2);
    return true;
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.ui.widget.VideoControlsLeanback.LeanbackInternalListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */