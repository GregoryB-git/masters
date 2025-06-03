package com.devbrackets.android.exomedia.core.api;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.devbrackets.android.exomedia.ExoMedia.RendererType;
import com.devbrackets.android.exomedia.core.ListenerMux;
import com.devbrackets.android.exomedia.core.exoplayer.WindowInfo;
import com.google.android.exoplayer2.drm.MediaDrmCallback;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.Map;

public abstract interface AudioPlayerApi
{
  public abstract int getAudioSessionId();
  
  @Nullable
  public abstract Map<ExoMedia.RendererType, TrackGroupArray> getAvailableTracks();
  
  @IntRange(from=0L, to=100L)
  public abstract int getBufferedPercent();
  
  @IntRange(from=0L)
  public abstract long getCurrentPosition();
  
  @IntRange(from=0L)
  public abstract long getDuration();
  
  public abstract float getPlaybackSpeed();
  
  public abstract int getSelectedTrackIndex(@NonNull ExoMedia.RendererType paramRendererType, int paramInt);
  
  @FloatRange(from=0.0D, to=1.0D)
  public abstract float getVolumeLeft();
  
  @FloatRange(from=0.0D, to=1.0D)
  public abstract float getVolumeRight();
  
  @Nullable
  public abstract WindowInfo getWindowInfo();
  
  public abstract boolean isPlaying();
  
  public abstract void onMediaPrepared();
  
  public abstract void pause();
  
  public abstract void prepareAsync();
  
  public abstract void release();
  
  public abstract void reset();
  
  public abstract boolean restart();
  
  public abstract void seekTo(@IntRange(from=0L) long paramLong);
  
  public abstract void setAudioStreamType(int paramInt);
  
  public abstract void setDataSource(@Nullable Uri paramUri);
  
  public abstract void setDataSource(@Nullable Uri paramUri, @Nullable MediaSource paramMediaSource);
  
  public abstract void setDrmCallback(@Nullable MediaDrmCallback paramMediaDrmCallback);
  
  public abstract void setListenerMux(ListenerMux paramListenerMux);
  
  public abstract boolean setPlaybackSpeed(float paramFloat);
  
  public abstract void setRepeatMode(int paramInt);
  
  @Deprecated
  public abstract void setTrack(@NonNull ExoMedia.RendererType paramRendererType, int paramInt);
  
  public abstract void setTrack(@NonNull ExoMedia.RendererType paramRendererType, int paramInt1, int paramInt2);
  
  public abstract void setVolume(@FloatRange(from=0.0D, to=1.0D) float paramFloat1, @FloatRange(from=0.0D, to=1.0D) float paramFloat2);
  
  public abstract void setWakeMode(@NonNull Context paramContext, int paramInt);
  
  public abstract void start();
  
  public abstract void stopPlayback();
  
  public abstract boolean trackSelectionAvailable();
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.core.api.AudioPlayerApi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */