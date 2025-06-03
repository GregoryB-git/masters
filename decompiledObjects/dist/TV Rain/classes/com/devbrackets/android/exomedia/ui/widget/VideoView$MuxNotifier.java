package com.devbrackets.android.exomedia.ui.widget;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.devbrackets.android.exomedia.core.ListenerMux.Notifier;
import com.devbrackets.android.exomedia.core.api.VideoViewApi;
import com.devbrackets.android.exomedia.core.exoplayer.ExoMediaPlayer;
import com.devbrackets.android.exomedia.listener.OnVideoSizeChangedListener;

public class VideoView$MuxNotifier
  extends ListenerMux.Notifier
{
  @Nullable
  public OnVideoSizeChangedListener videoSizeChangedListener;
  
  public VideoView$MuxNotifier(VideoView paramVideoView) {}
  
  public void onExoPlayerError(ExoMediaPlayer paramExoMediaPlayer, Exception paramException)
  {
    this$0.stopPlayback();
    if (paramExoMediaPlayer != null) {
      paramExoMediaPlayer.forcePrepare();
    }
  }
  
  public void onMediaPlaybackEnded()
  {
    this$0.setKeepScreenOn(false);
    this$0.onPlaybackEnded();
  }
  
  public void onPrepared()
  {
    VideoView localVideoView = this$0;
    VideoControlsCore localVideoControlsCore = videoControls;
    if (localVideoControlsCore != null)
    {
      localVideoControlsCore.setDuration(localVideoView.getDuration());
      this$0.videoControls.finishLoading();
    }
  }
  
  public void onPreviewImageStateChanged(boolean paramBoolean)
  {
    ImageView localImageView = this$0.previewImageView;
    if (localImageView != null)
    {
      int i;
      if (paramBoolean) {
        i = 0;
      } else {
        i = 8;
      }
      localImageView.setVisibility(i);
    }
  }
  
  public void onSeekComplete()
  {
    VideoControlsCore localVideoControlsCore = this$0.videoControls;
    if (localVideoControlsCore != null) {
      localVideoControlsCore.finishLoading();
    }
  }
  
  public void onVideoSizeChanged(int paramInt1, int paramInt2, int paramInt3, float paramFloat)
  {
    this$0.videoViewImpl.setVideoRotation(paramInt3, false);
    this$0.videoViewImpl.onVideoSizeChanged(paramInt1, paramInt2, paramFloat);
    OnVideoSizeChangedListener localOnVideoSizeChangedListener = videoSizeChangedListener;
    if (localOnVideoSizeChangedListener != null) {
      localOnVideoSizeChangedListener.onVideoSizeChanged(paramInt1, paramInt2, paramFloat);
    }
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
 * Qualified Name:     com.devbrackets.android.exomedia.ui.widget.VideoView.MuxNotifier
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */