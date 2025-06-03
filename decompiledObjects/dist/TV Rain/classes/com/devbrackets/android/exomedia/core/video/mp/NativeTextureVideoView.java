package com.devbrackets.android.exomedia.core.video.mp;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnSeekCompleteListener;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import android.view.View.OnTouchListener;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.devbrackets.android.exomedia.ExoMedia.RendererType;
import com.devbrackets.android.exomedia.core.ListenerMux;
import com.devbrackets.android.exomedia.core.api.VideoViewApi;
import com.devbrackets.android.exomedia.core.exoplayer.WindowInfo;
import com.devbrackets.android.exomedia.core.listener.CaptionListener;
import com.devbrackets.android.exomedia.core.video.ResizingTextureView;
import com.google.android.exoplayer2.drm.MediaDrmCallback;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.Map;

public class NativeTextureVideoView
  extends ResizingTextureView
  implements NativeVideoDelegate.Callback, VideoViewApi
{
  public NativeVideoDelegate delegate;
  public View.OnTouchListener touchListener;
  
  public NativeTextureVideoView(Context paramContext)
  {
    super(paramContext);
    setup(paramContext, null);
  }
  
  public NativeTextureVideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setup(paramContext, paramAttributeSet);
  }
  
  public NativeTextureVideoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setup(paramContext, paramAttributeSet);
  }
  
  @TargetApi(21)
  public NativeTextureVideoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    setup(paramContext, paramAttributeSet);
  }
  
  public void clearSelectedTracks(@NonNull ExoMedia.RendererType paramRendererType) {}
  
  @Nullable
  public Map<ExoMedia.RendererType, TrackGroupArray> getAvailableTracks()
  {
    return null;
  }
  
  public int getBufferedPercent()
  {
    return delegate.getBufferPercentage();
  }
  
  public long getCurrentPosition()
  {
    return delegate.getCurrentPosition();
  }
  
  public long getDuration()
  {
    return delegate.getDuration();
  }
  
  public float getPlaybackSpeed()
  {
    return delegate.getPlaybackSpeed();
  }
  
  public int getSelectedTrackIndex(@NonNull ExoMedia.RendererType paramRendererType, int paramInt)
  {
    return -1;
  }
  
  public float getVolume()
  {
    return delegate.getVolume();
  }
  
  @Nullable
  public WindowInfo getWindowInfo()
  {
    return delegate.getWindowInfo();
  }
  
  public boolean isPlaying()
  {
    return delegate.isPlaying();
  }
  
  public boolean isRendererEnabled(@NonNull ExoMedia.RendererType paramRendererType)
  {
    return false;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    View.OnTouchListener localOnTouchListener = touchListener;
    boolean bool1 = false;
    boolean bool2;
    if (localOnTouchListener != null) {
      bool2 = localOnTouchListener.onTouch(this, paramMotionEvent);
    } else {
      bool2 = false;
    }
    if (!bool2)
    {
      bool2 = bool1;
      if (!super.onTouchEvent(paramMotionEvent)) {}
    }
    else
    {
      bool2 = true;
    }
    return bool2;
  }
  
  public void onVideoSizeChanged(int paramInt1, int paramInt2, float paramFloat)
  {
    if (updateVideoSize((int)(paramInt1 * paramFloat), paramInt2)) {
      requestLayout();
    }
  }
  
  public void pause()
  {
    delegate.pause();
  }
  
  public void release() {}
  
  public boolean restart()
  {
    return delegate.restart();
  }
  
  public void seekTo(long paramLong)
  {
    delegate.seekTo(paramLong);
  }
  
  public void setCaptionListener(@Nullable CaptionListener paramCaptionListener) {}
  
  public void setDrmCallback(@Nullable MediaDrmCallback paramMediaDrmCallback) {}
  
  public void setListenerMux(ListenerMux paramListenerMux)
  {
    delegate.setListenerMux(paramListenerMux);
  }
  
  public void setOnBufferingUpdateListener(@Nullable MediaPlayer.OnBufferingUpdateListener paramOnBufferingUpdateListener)
  {
    delegate.setOnBufferingUpdateListener(paramOnBufferingUpdateListener);
  }
  
  public void setOnCompletionListener(@Nullable MediaPlayer.OnCompletionListener paramOnCompletionListener)
  {
    delegate.setOnCompletionListener(paramOnCompletionListener);
  }
  
  public void setOnErrorListener(@Nullable MediaPlayer.OnErrorListener paramOnErrorListener)
  {
    delegate.setOnErrorListener(paramOnErrorListener);
  }
  
  public void setOnInfoListener(@Nullable MediaPlayer.OnInfoListener paramOnInfoListener)
  {
    delegate.setOnInfoListener(paramOnInfoListener);
  }
  
  public void setOnPreparedListener(@Nullable MediaPlayer.OnPreparedListener paramOnPreparedListener)
  {
    delegate.setOnPreparedListener(paramOnPreparedListener);
  }
  
  public void setOnSeekCompleteListener(@Nullable MediaPlayer.OnSeekCompleteListener paramOnSeekCompleteListener)
  {
    delegate.setOnSeekCompleteListener(paramOnSeekCompleteListener);
  }
  
  public void setOnTouchListener(View.OnTouchListener paramOnTouchListener)
  {
    touchListener = paramOnTouchListener;
    super.setOnTouchListener(paramOnTouchListener);
  }
  
  public boolean setPlaybackSpeed(float paramFloat)
  {
    return delegate.setPlaybackSpeed(paramFloat);
  }
  
  public void setRendererEnabled(@NonNull ExoMedia.RendererType paramRendererType, boolean paramBoolean) {}
  
  public void setRepeatMode(int paramInt) {}
  
  public void setTrack(@NonNull ExoMedia.RendererType paramRendererType, int paramInt) {}
  
  public void setTrack(@NonNull ExoMedia.RendererType paramRendererType, int paramInt1, int paramInt2) {}
  
  public void setVideoURI(Uri paramUri)
  {
    setVideoURI(paramUri, null);
  }
  
  public void setVideoURI(Uri paramUri, @Nullable Map<String, String> paramMap)
  {
    delegate.setVideoURI(paramUri, paramMap);
    requestLayout();
    invalidate();
  }
  
  public void setVideoUri(@Nullable Uri paramUri)
  {
    setVideoUri(paramUri, null);
  }
  
  public void setVideoUri(@Nullable Uri paramUri, @Nullable MediaSource paramMediaSource)
  {
    setVideoURI(paramUri);
  }
  
  public boolean setVolume(@FloatRange(from=0.0D, to=1.0D) float paramFloat)
  {
    return delegate.setVolume(paramFloat);
  }
  
  public void setup(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet)
  {
    delegate = new NativeVideoDelegate(paramContext, this, this);
    setSurfaceTextureListener(new TextureVideoViewSurfaceListener());
    setFocusable(true);
    setFocusableInTouchMode(true);
    requestFocus();
    updateVideoSize(0, 0);
  }
  
  public void start()
  {
    delegate.start();
    requestFocus();
  }
  
  public void stopPlayback(boolean paramBoolean)
  {
    delegate.stopPlayback(paramBoolean);
  }
  
  public void suspend()
  {
    delegate.suspend();
  }
  
  public boolean trackSelectionAvailable()
  {
    return false;
  }
  
  public void videoSizeChanged(int paramInt1, int paramInt2)
  {
    if (updateVideoSize(paramInt1, paramInt2)) {
      requestLayout();
    }
  }
  
  public class TextureVideoViewSurfaceListener
    implements TextureView.SurfaceTextureListener
  {
    public TextureVideoViewSurfaceListener() {}
    
    public void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
    {
      delegate.onSurfaceReady(new Surface(paramSurfaceTexture));
    }
    
    public boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
    {
      paramSurfaceTexture.release();
      suspend();
      return true;
    }
    
    public void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
    {
      delegate.onSurfaceSizeChanged(paramInt1, paramInt2);
    }
    
    public void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture) {}
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.core.video.mp.NativeTextureVideoView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */