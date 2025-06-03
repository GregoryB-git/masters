package com.devbrackets.android.exomedia.core.audio;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.devbrackets.android.exomedia.ExoMedia.RendererType;
import com.devbrackets.android.exomedia.core.ListenerMux;
import com.devbrackets.android.exomedia.core.api.AudioPlayerApi;
import com.devbrackets.android.exomedia.core.exoplayer.ExoMediaPlayer;
import com.devbrackets.android.exomedia.core.exoplayer.WindowInfo;
import com.devbrackets.android.exomedia.core.listener.MetadataListener;
import com.devbrackets.android.exomedia.listener.OnBufferUpdateListener;
import com.google.android.exoplayer2.drm.MediaDrmCallback;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.Map;

@TargetApi(16)
public class ExoAudioPlayer
  implements AudioPlayerApi
{
  @NonNull
  public final Context context;
  @NonNull
  public final ExoMediaPlayer exoMediaPlayer;
  @NonNull
  public InternalListeners internalListeners = new InternalListeners();
  public ListenerMux listenerMux;
  public boolean playRequested = false;
  
  public ExoAudioPlayer(@NonNull Context paramContext)
  {
    context = paramContext;
    paramContext = new ExoMediaPlayer(paramContext);
    exoMediaPlayer = paramContext;
    paramContext.setMetadataListener(internalListeners);
    paramContext.setBufferUpdateListener(internalListeners);
  }
  
  public int getAudioSessionId()
  {
    return exoMediaPlayer.getAudioSessionId();
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
  
  public float getVolumeLeft()
  {
    return exoMediaPlayer.getVolume();
  }
  
  public float getVolumeRight()
  {
    return exoMediaPlayer.getVolume();
  }
  
  @Nullable
  public WindowInfo getWindowInfo()
  {
    return exoMediaPlayer.getWindowInfo();
  }
  
  public boolean isPlaying()
  {
    return exoMediaPlayer.getPlayWhenReady();
  }
  
  public void onMediaPrepared() {}
  
  public void pause()
  {
    exoMediaPlayer.setPlayWhenReady(false);
    playRequested = false;
  }
  
  public void prepareAsync()
  {
    exoMediaPlayer.prepare();
  }
  
  public void release()
  {
    exoMediaPlayer.release();
  }
  
  public void reset() {}
  
  public boolean restart()
  {
    if (!exoMediaPlayer.restart()) {
      return false;
    }
    listenerMux.setNotifiedCompleted(false);
    listenerMux.setNotifiedPrepared(false);
    return true;
  }
  
  public void seekTo(@IntRange(from=0L) long paramLong)
  {
    exoMediaPlayer.seekTo(paramLong);
  }
  
  public void setAudioStreamType(int paramInt)
  {
    exoMediaPlayer.setAudioStreamType(paramInt);
  }
  
  public void setDataSource(@Nullable Uri paramUri)
  {
    setDataSource(paramUri, null);
  }
  
  public void setDataSource(@Nullable Uri paramUri, @Nullable MediaSource paramMediaSource)
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
  
  public void setRepeatMode(int paramInt)
  {
    exoMediaPlayer.setRepeatMode(paramInt);
  }
  
  public void setTrack(@NonNull ExoMedia.RendererType paramRendererType, int paramInt)
  {
    exoMediaPlayer.setSelectedTrack(paramRendererType, paramInt);
  }
  
  public void setTrack(@NonNull ExoMedia.RendererType paramRendererType, int paramInt1, int paramInt2)
  {
    exoMediaPlayer.setSelectedTrack(paramRendererType, paramInt1, paramInt2);
  }
  
  public void setVolume(@FloatRange(from=0.0D, to=1.0D) float paramFloat1, @FloatRange(from=0.0D, to=1.0D) float paramFloat2)
  {
    exoMediaPlayer.setVolume((paramFloat1 + paramFloat2) / 2.0F);
  }
  
  public void setWakeMode(@NonNull Context paramContext, int paramInt)
  {
    exoMediaPlayer.setWakeMode(paramContext, paramInt);
  }
  
  public void start()
  {
    exoMediaPlayer.setPlayWhenReady(true);
    listenerMux.setNotifiedCompleted(false);
    playRequested = true;
  }
  
  public void stopPlayback()
  {
    exoMediaPlayer.stop();
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
 * Qualified Name:     com.devbrackets.android.exomedia.core.audio.ExoAudioPlayer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */