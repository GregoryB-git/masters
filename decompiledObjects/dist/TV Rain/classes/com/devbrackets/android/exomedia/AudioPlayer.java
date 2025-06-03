package com.devbrackets.android.exomedia;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.devbrackets.android.exomedia.core.ListenerMux;
import com.devbrackets.android.exomedia.core.ListenerMux.Notifier;
import com.devbrackets.android.exomedia.core.api.AudioPlayerApi;
import com.devbrackets.android.exomedia.core.audio.ExoAudioPlayer;
import com.devbrackets.android.exomedia.core.audio.NativeAudioPlayer;
import com.devbrackets.android.exomedia.core.exoplayer.ExoMediaPlayer;
import com.devbrackets.android.exomedia.core.exoplayer.WindowInfo;
import com.devbrackets.android.exomedia.core.listener.MetadataListener;
import com.devbrackets.android.exomedia.listener.OnBufferUpdateListener;
import com.devbrackets.android.exomedia.listener.OnCompletionListener;
import com.devbrackets.android.exomedia.listener.OnErrorListener;
import com.devbrackets.android.exomedia.listener.OnPreparedListener;
import com.devbrackets.android.exomedia.listener.OnSeekCompletionListener;
import com.devbrackets.android.exomedia.util.DeviceUtil;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.drm.MediaDrmCallback;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.Map;

public class AudioPlayer
{
  public AudioPlayerApi audioPlayerImpl;
  public ListenerMux listenerMux;
  public long overriddenDuration = -1L;
  
  public AudioPlayer(@NonNull Context paramContext)
  {
    this(paramContext, new DeviceUtil());
  }
  
  public AudioPlayer(@NonNull Context paramContext, @NonNull DeviceUtil paramDeviceUtil)
  {
    if (paramDeviceUtil.supportsExoPlayer(paramContext)) {
      paramContext = new ExoAudioPlayer(paramContext);
    } else {
      paramContext = new NativeAudioPlayer(paramContext);
    }
    init(paramContext);
  }
  
  public AudioPlayer(AudioPlayerApi paramAudioPlayerApi)
  {
    init(paramAudioPlayerApi);
  }
  
  private void onPlaybackEnded()
  {
    pause();
  }
  
  public int getAudioSessionId()
  {
    return audioPlayerImpl.getAudioSessionId();
  }
  
  @Nullable
  public Map<ExoMedia.RendererType, TrackGroupArray> getAvailableTracks()
  {
    return audioPlayerImpl.getAvailableTracks();
  }
  
  public int getBufferPercentage()
  {
    return audioPlayerImpl.getBufferedPercent();
  }
  
  public long getCurrentPosition()
  {
    return audioPlayerImpl.getCurrentPosition();
  }
  
  public long getDuration()
  {
    long l = overriddenDuration;
    if (l >= 0L) {
      return l;
    }
    return audioPlayerImpl.getDuration();
  }
  
  public float getPlaybackSpeed()
  {
    return audioPlayerImpl.getPlaybackSpeed();
  }
  
  public int getSelectedTrackIndex(@NonNull ExoMedia.RendererType paramRendererType, int paramInt)
  {
    return audioPlayerImpl.getSelectedTrackIndex(paramRendererType, paramInt);
  }
  
  @FloatRange(from=0.0D, to=1.0D)
  public float getVolumeLeft()
  {
    return audioPlayerImpl.getVolumeLeft();
  }
  
  @FloatRange(from=0.0D, to=1.0D)
  public float getVolumeRight()
  {
    return audioPlayerImpl.getVolumeRight();
  }
  
  @Nullable
  public WindowInfo getWindowInfo()
  {
    return audioPlayerImpl.getWindowInfo();
  }
  
  public void init(AudioPlayerApi paramAudioPlayerApi)
  {
    audioPlayerImpl = paramAudioPlayerApi;
    ListenerMux localListenerMux = new ListenerMux(new MuxNotifier(null));
    listenerMux = localListenerMux;
    paramAudioPlayerApi.setListenerMux(localListenerMux);
  }
  
  public boolean isPlaying()
  {
    return audioPlayerImpl.isPlaying();
  }
  
  public void overrideDuration(long paramLong)
  {
    overriddenDuration = paramLong;
  }
  
  public void pause()
  {
    audioPlayerImpl.pause();
  }
  
  public void prepareAsync()
  {
    audioPlayerImpl.prepareAsync();
  }
  
  public void release()
  {
    audioPlayerImpl.release();
  }
  
  public void reset()
  {
    stopPlayback();
    setDataSource(null, null);
    audioPlayerImpl.reset();
  }
  
  public void seekTo(long paramLong)
  {
    audioPlayerImpl.seekTo(paramLong);
  }
  
  public void setAnalyticsListener(@Nullable AnalyticsListener paramAnalyticsListener)
  {
    listenerMux.setAnalyticsListener(paramAnalyticsListener);
  }
  
  public void setAudioStreamType(int paramInt)
  {
    audioPlayerImpl.setAudioStreamType(paramInt);
  }
  
  public void setDataSource(@Nullable Uri paramUri)
  {
    audioPlayerImpl.setDataSource(paramUri);
    overrideDuration(-1L);
  }
  
  public void setDataSource(@Nullable Uri paramUri, @Nullable MediaSource paramMediaSource)
  {
    audioPlayerImpl.setDataSource(paramUri, paramMediaSource);
    overrideDuration(-1L);
  }
  
  public void setDrmCallback(@Nullable MediaDrmCallback paramMediaDrmCallback)
  {
    audioPlayerImpl.setDrmCallback(paramMediaDrmCallback);
  }
  
  public void setMetadataListener(@Nullable MetadataListener paramMetadataListener)
  {
    listenerMux.setMetadataListener(paramMetadataListener);
  }
  
  public void setOnBufferUpdateListener(@Nullable OnBufferUpdateListener paramOnBufferUpdateListener)
  {
    listenerMux.setOnBufferUpdateListener(paramOnBufferUpdateListener);
  }
  
  public void setOnCompletionListener(@Nullable OnCompletionListener paramOnCompletionListener)
  {
    listenerMux.setOnCompletionListener(paramOnCompletionListener);
  }
  
  public void setOnErrorListener(@Nullable OnErrorListener paramOnErrorListener)
  {
    listenerMux.setOnErrorListener(paramOnErrorListener);
  }
  
  public void setOnPreparedListener(@Nullable OnPreparedListener paramOnPreparedListener)
  {
    listenerMux.setOnPreparedListener(paramOnPreparedListener);
  }
  
  public void setOnSeekCompletionListener(@Nullable OnSeekCompletionListener paramOnSeekCompletionListener)
  {
    listenerMux.setOnSeekCompletionListener(paramOnSeekCompletionListener);
  }
  
  public boolean setPlaybackSpeed(float paramFloat)
  {
    return audioPlayerImpl.setPlaybackSpeed(paramFloat);
  }
  
  public void setRepeatMode(int paramInt)
  {
    audioPlayerImpl.setRepeatMode(paramInt);
  }
  
  @Deprecated
  public void setTrack(ExoMedia.RendererType paramRendererType, int paramInt)
  {
    audioPlayerImpl.setTrack(paramRendererType, paramInt);
  }
  
  public void setTrack(ExoMedia.RendererType paramRendererType, int paramInt1, int paramInt2)
  {
    audioPlayerImpl.setTrack(paramRendererType, paramInt1, paramInt2);
  }
  
  public void setVolume(@FloatRange(from=0.0D, to=1.0D) float paramFloat1, @FloatRange(from=0.0D, to=1.0D) float paramFloat2)
  {
    audioPlayerImpl.setVolume(paramFloat1, paramFloat2);
  }
  
  public void setWakeMode(Context paramContext, int paramInt)
  {
    audioPlayerImpl.setWakeMode(paramContext, paramInt);
  }
  
  public void start()
  {
    audioPlayerImpl.start();
  }
  
  public void stopPlayback()
  {
    audioPlayerImpl.stopPlayback();
  }
  
  public boolean trackSelectionAvailable()
  {
    return audioPlayerImpl.trackSelectionAvailable();
  }
  
  public class MuxNotifier
    extends ListenerMux.Notifier
  {
    private MuxNotifier() {}
    
    public void onExoPlayerError(ExoMediaPlayer paramExoMediaPlayer, Exception paramException)
    {
      stopPlayback();
      if (paramExoMediaPlayer != null) {
        paramExoMediaPlayer.forcePrepare();
      }
    }
    
    public void onMediaPlaybackEnded()
    {
      AudioPlayer.access$100(AudioPlayer.this);
    }
    
    public void onPrepared()
    {
      audioPlayerImpl.onMediaPrepared();
    }
    
    public boolean shouldNotifyCompletion(long paramLong)
    {
      long l1 = getCurrentPosition();
      long l2 = getDuration();
      boolean bool;
      if ((l1 > 0L) && (l2 > 0L) && (l1 + paramLong >= l2)) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.AudioPlayer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */