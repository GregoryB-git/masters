package com.devbrackets.android.exomedia.core.video.exo;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
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

@TargetApi(16)
public class ExoTextureVideoView
  extends ResizingTextureView
  implements VideoViewApi
{
  public ExoVideoDelegate delegate;
  
  public ExoTextureVideoView(Context paramContext)
  {
    super(paramContext);
    setup();
  }
  
  public ExoTextureVideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setup();
  }
  
  public ExoTextureVideoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setup();
  }
  
  public ExoTextureVideoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    setup();
  }
  
  public void clearSelectedTracks(@NonNull ExoMedia.RendererType paramRendererType)
  {
    delegate.clearSelectedTracks(paramRendererType);
  }
  
  @Nullable
  public Map<ExoMedia.RendererType, TrackGroupArray> getAvailableTracks()
  {
    return delegate.getAvailableTracks();
  }
  
  public int getBufferedPercent()
  {
    return delegate.getBufferedPercent();
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
    return delegate.getSelectedTrackIndex(paramRendererType, paramInt);
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
    return delegate.isRendererEnabled(paramRendererType);
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
  
  public void release()
  {
    delegate.release();
  }
  
  public boolean restart()
  {
    return delegate.restart();
  }
  
  public void seekTo(@IntRange(from=0L) long paramLong)
  {
    delegate.seekTo(paramLong);
  }
  
  public void setCaptionListener(@Nullable CaptionListener paramCaptionListener)
  {
    delegate.setCaptionListener(paramCaptionListener);
  }
  
  public void setDrmCallback(@Nullable MediaDrmCallback paramMediaDrmCallback)
  {
    delegate.setDrmCallback(paramMediaDrmCallback);
  }
  
  public void setListenerMux(ListenerMux paramListenerMux)
  {
    delegate.setListenerMux(paramListenerMux);
  }
  
  public boolean setPlaybackSpeed(float paramFloat)
  {
    return delegate.setPlaybackSpeed(paramFloat);
  }
  
  public void setRendererEnabled(@NonNull ExoMedia.RendererType paramRendererType, boolean paramBoolean)
  {
    delegate.setRendererEnabled(paramRendererType, paramBoolean);
  }
  
  public void setRepeatMode(int paramInt)
  {
    delegate.setRepeatMode(paramInt);
  }
  
  public void setTrack(@NonNull ExoMedia.RendererType paramRendererType, int paramInt)
  {
    delegate.setTrack(paramRendererType, paramInt);
  }
  
  public void setTrack(@NonNull ExoMedia.RendererType paramRendererType, int paramInt1, int paramInt2)
  {
    delegate.setTrack(paramRendererType, paramInt1, paramInt2);
  }
  
  public void setVideoUri(@Nullable Uri paramUri)
  {
    delegate.setVideoUri(paramUri);
  }
  
  public void setVideoUri(@Nullable Uri paramUri, @Nullable MediaSource paramMediaSource)
  {
    delegate.setVideoUri(paramUri, paramMediaSource);
  }
  
  public boolean setVolume(@FloatRange(from=0.0D, to=1.0D) float paramFloat)
  {
    return delegate.setVolume(paramFloat);
  }
  
  public void setup()
  {
    delegate = new ExoVideoDelegate(getContext(), this);
    setSurfaceTextureListener(new ExoMediaVideoSurfaceTextureListener());
    updateVideoSize(0, 0);
  }
  
  public void start()
  {
    delegate.start();
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
    return delegate.trackSelectionAvailable();
  }
  
  public class ExoMediaVideoSurfaceTextureListener
    implements TextureView.SurfaceTextureListener
  {
    public ExoMediaVideoSurfaceTextureListener() {}
    
    public void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
    {
      delegate.onSurfaceReady(new Surface(paramSurfaceTexture));
    }
    
    public boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
    {
      delegate.onSurfaceDestroyed();
      paramSurfaceTexture.release();
      return true;
    }
    
    public void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2) {}
    
    public void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture) {}
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.core.video.exo.ExoTextureVideoView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */