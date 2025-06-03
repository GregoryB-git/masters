package com.devbrackets.android.exomedia.core.video.exo;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.devbrackets.android.exomedia.ExoMedia.RendererType;
import com.devbrackets.android.exomedia.core.ListenerMux;
import com.devbrackets.android.exomedia.core.exoplayer.ExoMediaPlayer;
import com.devbrackets.android.exomedia.core.exoplayer.WindowInfo;
import com.devbrackets.android.exomedia.core.listener.CaptionListener;
import com.devbrackets.android.exomedia.core.listener.MetadataListener;
import com.devbrackets.android.exomedia.core.video.ClearableSurface;
import com.devbrackets.android.exomedia.listener.OnBufferUpdateListener;
import com.google.android.exoplayer2.drm.MediaDrmCallback;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.Map;

public class ExoVideoDelegate
{
  public ClearableSurface clearableSurface;
  public Context context;
  public ExoMediaPlayer exoMediaPlayer;
  @NonNull
  public InternalListeners internalListeners = new InternalListeners();
  public ListenerMux listenerMux;
  public boolean playRequested = false;
  
  public ExoVideoDelegate(@NonNull Context paramContext, @NonNull ClearableSurface paramClearableSurface)
  {
    context = paramContext.getApplicationContext();
    clearableSurface = paramClearableSurface;
    setup();
  }
  
  public void clearSelectedTracks(@NonNull ExoMedia.RendererType paramRendererType)
  {
    exoMediaPlayer.clearSelectedTracks(paramRendererType);
  }
  
  @Nullable
  public Map<ExoMedia.RendererType, TrackGroupArray> getAvailableTracks()
  {
    return exoMediaPlayer.getAvailableTracks();
  }
  
  public int getBufferedPercent()
  {
    return exoMediaPlayer.getBufferedPercentage();
  }
  
  public long getCurrentPosition()
  {
    if (!listenerMux.isPrepared()) {
      return 0L;
    }
    return exoMediaPlayer.getCurrentPosition();
  }
  
  public long getDuration()
  {
    if (!listenerMux.isPrepared()) {
      return 0L;
    }
    return exoMediaPlayer.getDuration();
  }
  
  public float getPlaybackSpeed()
  {
    return exoMediaPlayer.getPlaybackSpeed();
  }
  
  public int getSelectedTrackIndex(@NonNull ExoMedia.RendererType paramRendererType, int paramInt)
  {
    return exoMediaPlayer.getSelectedTrackIndex(paramRendererType, paramInt);
  }
  
  @FloatRange(from=0.0D, to=1.0D)
  public float getVolume()
  {
    return exoMediaPlayer.getVolume();
  }
  
  @Nullable
  public WindowInfo getWindowInfo()
  {
    return exoMediaPlayer.getWindowInfo();
  }
  
  public void initExoPlayer()
  {
    ExoMediaPlayer localExoMediaPlayer = new ExoMediaPlayer(context);
    exoMediaPlayer = localExoMediaPlayer;
    localExoMediaPlayer.setMetadataListener(internalListeners);
    exoMediaPlayer.setBufferUpdateListener(internalListeners);
  }
  
  public boolean isPlaying()
  {
    return exoMediaPlayer.getPlayWhenReady();
  }
  
  public boolean isRendererEnabled(@NonNull ExoMedia.RendererType paramRendererType)
  {
    return exoMediaPlayer.isRendererEnabled(paramRendererType);
  }
  
  public void onSurfaceDestroyed()
  {
    exoMediaPlayer.clearSurface();
  }
  
  public void onSurfaceReady(Surface paramSurface)
  {
    exoMediaPlayer.setSurface(paramSurface);
    if (playRequested) {
      exoMediaPlayer.setPlayWhenReady(true);
    }
  }
  
  public void pause()
  {
    exoMediaPlayer.setPlayWhenReady(false);
    playRequested = false;
  }
  
  public void release()
  {
    exoMediaPlayer.release();
  }
  
  public boolean restart()
  {
    if (!exoMediaPlayer.restart()) {
      return false;
    }
    listenerMux.setNotifiedPrepared(false);
    listenerMux.setNotifiedCompleted(false);
    return true;
  }
  
  public void seekTo(@IntRange(from=0L) long paramLong)
  {
    exoMediaPlayer.seekTo(paramLong);
  }
  
  public void setCaptionListener(@Nullable CaptionListener paramCaptionListener)
  {
    exoMediaPlayer.setCaptionListener(paramCaptionListener);
  }
  
  public void setDrmCallback(@Nullable MediaDrmCallback paramMediaDrmCallback)
  {
    exoMediaPlayer.setDrmCallback(paramMediaDrmCallback);
  }
  
  public void setListenerMux(ListenerMux paramListenerMux)
  {
    ListenerMux localListenerMux = listenerMux;
    if (localListenerMux != null)
    {
      exoMediaPlayer.removeListener(localListenerMux);
      exoMediaPlayer.removeAnalyticsListener(listenerMux);
    }
    listenerMux = paramListenerMux;
    exoMediaPlayer.addListener(paramListenerMux);
    exoMediaPlayer.addAnalyticsListener(paramListenerMux);
  }
  
  public boolean setPlaybackSpeed(float paramFloat)
  {
    return exoMediaPlayer.setPlaybackSpeed(paramFloat);
  }
  
  public void setRendererEnabled(@NonNull ExoMedia.RendererType paramRendererType, boolean paramBoolean)
  {
    exoMediaPlayer.setRendererEnabled(paramRendererType, paramBoolean);
  }
  
  public void setRepeatMode(int paramInt)
  {
    exoMediaPlayer.setRepeatMode(paramInt);
  }
  
  @Deprecated
  public void setTrack(ExoMedia.RendererType paramRendererType, int paramInt)
  {
    exoMediaPlayer.setSelectedTrack(paramRendererType, paramInt);
  }
  
  public void setTrack(@NonNull ExoMedia.RendererType paramRendererType, int paramInt1, int paramInt2)
  {
    exoMediaPlayer.setSelectedTrack(paramRendererType, paramInt1, paramInt2);
  }
  
  public void setVideoUri(@Nullable Uri paramUri)
  {
    setVideoUri(paramUri, null);
  }
  
  public void setVideoUri(@Nullable Uri paramUri, @Nullable MediaSource paramMediaSource)
  {
    listenerMux.setNotifiedPrepared(false);
    exoMediaPlayer.seekTo(0L);
    if (paramMediaSource != null)
    {
      exoMediaPlayer.setMediaSource(paramMediaSource);
      listenerMux.setNotifiedCompleted(false);
    }
    else if (paramUri != null)
    {
      exoMediaPlayer.setUri(paramUri);
      listenerMux.setNotifiedCompleted(false);
    }
    else
    {
      exoMediaPlayer.setMediaSource(null);
    }
  }
  
  public boolean setVolume(@FloatRange(from=0.0D, to=1.0D) float paramFloat)
  {
    exoMediaPlayer.setVolume(paramFloat);
    return true;
  }
  
  public void setup()
  {
    initExoPlayer();
  }
  
  public void start()
  {
    exoMediaPlayer.setPlayWhenReady(true);
    listenerMux.setNotifiedCompleted(false);
    playRequested = true;
  }
  
  public void stopPlayback(boolean paramBoolean)
  {
    exoMediaPlayer.stop();
    playRequested = false;
    if (paramBoolean) {
      listenerMux.clearSurfaceWhenReady(clearableSurface);
    }
  }
  
  public void suspend()
  {
    exoMediaPlayer.release();
    playRequested = false;
  }
  
  public boolean trackSelectionAvailable()
  {
    return true;
  }
  
  public class InternalListeners
    implements MetadataListener, OnBufferUpdateListener
  {
    public InternalListeners() {}
    
    public void onBufferingUpdate(@IntRange(from=0L, to=100L) int paramInt)
    {
      listenerMux.onBufferingUpdate(paramInt);
    }
    
    public void onMetadata(Metadata paramMetadata)
    {
      listenerMux.onMetadata(paramMetadata);
    }
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.core.video.exo.ExoVideoDelegate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */