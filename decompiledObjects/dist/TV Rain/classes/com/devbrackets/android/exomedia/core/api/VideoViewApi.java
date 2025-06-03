package com.devbrackets.android.exomedia.core.api;

import android.net.Uri;
import android.view.View.OnTouchListener;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.devbrackets.android.exomedia.ExoMedia.RendererType;
import com.devbrackets.android.exomedia.core.ListenerMux;
import com.devbrackets.android.exomedia.core.exoplayer.WindowInfo;
import com.devbrackets.android.exomedia.core.listener.CaptionListener;
import com.devbrackets.android.exomedia.core.video.scale.ScaleType;
import com.google.android.exoplayer2.drm.MediaDrmCallback;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.Map;

public abstract interface VideoViewApi
{
  public abstract void clearSelectedTracks(@NonNull ExoMedia.RendererType paramRendererType);
  
  @Nullable
  public abstract Map<ExoMedia.RendererType, TrackGroupArray> getAvailableTracks();
  
  @IntRange(from=0L, to=100L)
  public abstract int getBufferedPercent();
  
  @IntRange(from=0L)
  public abstract long getCurrentPosition();
  
  @IntRange(from=0L)
  public abstract long getDuration();
  
  public abstract int getHeight();
  
  public abstract float getPlaybackSpeed();
  
  @NonNull
  public abstract ScaleType getScaleType();
  
  public abstract int getSelectedTrackIndex(@NonNull ExoMedia.RendererType paramRendererType, int paramInt);
  
  @FloatRange(from=0.0D, to=1.0D)
  public abstract float getVolume();
  
  public abstract int getWidth();
  
  @Nullable
  public abstract WindowInfo getWindowInfo();
  
  public abstract boolean isPlaying();
  
  public abstract boolean isRendererEnabled(@NonNull ExoMedia.RendererType paramRendererType);
  
  public abstract void onVideoSizeChanged(int paramInt1, int paramInt2, float paramFloat);
  
  public abstract void pause();
  
  public abstract void release();
  
  public abstract boolean restart();
  
  public abstract void seekTo(@IntRange(from=0L) long paramLong);
  
  public abstract void setCaptionListener(@Nullable CaptionListener paramCaptionListener);
  
  public abstract void setDrmCallback(@Nullable MediaDrmCallback paramMediaDrmCallback);
  
  public abstract void setListenerMux(ListenerMux paramListenerMux);
  
  public abstract void setMeasureBasedOnAspectRatioEnabled(boolean paramBoolean);
  
  public abstract void setOnTouchListener(View.OnTouchListener paramOnTouchListener);
  
  public abstract boolean setPlaybackSpeed(float paramFloat);
  
  public abstract void setRendererEnabled(@NonNull ExoMedia.RendererType paramRendererType, boolean paramBoolean);
  
  public abstract void setRepeatMode(int paramInt);
  
  public abstract void setScaleType(@NonNull ScaleType paramScaleType);
  
  @Deprecated
  public abstract void setTrack(@NonNull ExoMedia.RendererType paramRendererType, int paramInt);
  
  public abstract void setTrack(@NonNull ExoMedia.RendererType paramRendererType, int paramInt1, int paramInt2);
  
  public abstract void setVideoRotation(@IntRange(from=0L, to=359L) int paramInt, boolean paramBoolean);
  
  public abstract void setVideoUri(@Nullable Uri paramUri);
  
  public abstract void setVideoUri(@Nullable Uri paramUri, @Nullable MediaSource paramMediaSource);
  
  public abstract boolean setVolume(@FloatRange(from=0.0D, to=1.0D) float paramFloat);
  
  public abstract void start();
  
  public abstract void stopPlayback(boolean paramBoolean);
  
  public abstract void suspend();
  
  public abstract boolean trackSelectionAvailable();
  
  public static abstract interface OnSurfaceSizeChanged
  {
    public abstract void onSurfaceSizeChanged(int paramInt1, int paramInt2);
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.core.api.VideoViewApi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */