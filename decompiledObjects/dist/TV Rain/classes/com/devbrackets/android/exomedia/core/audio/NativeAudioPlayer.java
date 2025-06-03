package com.devbrackets.android.exomedia.core.audio;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.PlaybackParams;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.devbrackets.android.exomedia.ExoMedia.RendererType;
import com.devbrackets.android.exomedia.core.ListenerMux;
import com.devbrackets.android.exomedia.core.api.AudioPlayerApi;
import com.devbrackets.android.exomedia.core.exoplayer.WindowInfo;
import com.google.android.exoplayer2.drm.MediaDrmCallback;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.Map;

public class NativeAudioPlayer
  implements AudioPlayerApi
{
  private static final String TAG = "NativeMediaPlayer";
  @NonNull
  public final Context context;
  public int currentBufferPercent = 0;
  @NonNull
  public InternalListeners internalListeners = new InternalListeners();
  public ListenerMux listenerMux;
  @NonNull
  public final MediaPlayer mediaPlayer;
  public long requestedSeek;
  @FloatRange(from=0.0D, to=1.0D)
  public float volumeLeft = 1.0F;
  @FloatRange(from=0.0D, to=1.0D)
  public float volumeRight = 1.0F;
  
  public NativeAudioPlayer(@NonNull Context paramContext)
  {
    context = paramContext;
    paramContext = new MediaPlayer();
    mediaPlayer = paramContext;
    paramContext.setOnBufferingUpdateListener(internalListeners);
  }
  
  public int getAudioSessionId()
  {
    return mediaPlayer.getAudioSessionId();
  }
  
  @Nullable
  public Map<ExoMedia.RendererType, TrackGroupArray> getAvailableTracks()
  {
    return null;
  }
  
  public int getBufferedPercent()
  {
    return currentBufferPercent;
  }
  
  public long getCurrentPosition()
  {
    ListenerMux localListenerMux = listenerMux;
    if ((localListenerMux != null) && (localListenerMux.isPrepared())) {
      return mediaPlayer.getCurrentPosition();
    }
    return 0L;
  }
  
  public long getDuration()
  {
    ListenerMux localListenerMux = listenerMux;
    if ((localListenerMux != null) && (localListenerMux.isPrepared())) {
      return mediaPlayer.getDuration();
    }
    return 0L;
  }
  
  public float getPlaybackSpeed()
  {
    return mediaPlayer.getPlaybackParams().getSpeed();
  }
  
  public int getSelectedTrackIndex(@NonNull ExoMedia.RendererType paramRendererType, int paramInt)
  {
    return -1;
  }
  
  public float getVolumeLeft()
  {
    return volumeLeft;
  }
  
  public float getVolumeRight()
  {
    return volumeRight;
  }
  
  @Nullable
  public WindowInfo getWindowInfo()
  {
    return null;
  }
  
  public boolean isPlaying()
  {
    return mediaPlayer.isPlaying();
  }
  
  public void onMediaPrepared()
  {
    long l = requestedSeek;
    if (l != 0L) {
      seekTo(l);
    }
  }
  
  public void pause()
  {
    mediaPlayer.pause();
  }
  
  public void prepareAsync()
  {
    try
    {
      mediaPlayer.prepareAsync();
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public void release()
  {
    mediaPlayer.release();
  }
  
  public void reset()
  {
    mediaPlayer.reset();
  }
  
  public boolean restart()
  {
    ListenerMux localListenerMux = listenerMux;
    if ((localListenerMux != null) && (localListenerMux.isPrepared()))
    {
      mediaPlayer.seekTo(0);
      mediaPlayer.start();
      listenerMux.setNotifiedCompleted(false);
      return true;
    }
    return false;
  }
  
  public void seekTo(@IntRange(from=0L) long paramLong)
  {
    ListenerMux localListenerMux = listenerMux;
    if ((localListenerMux != null) && (localListenerMux.isPrepared()))
    {
      mediaPlayer.seekTo((int)paramLong);
      requestedSeek = 0L;
    }
    else
    {
      requestedSeek = paramLong;
    }
  }
  
  public void setAudioStreamType(int paramInt)
  {
    mediaPlayer.setAudioStreamType(paramInt);
  }
  
  public void setDataSource(@Nullable Uri paramUri)
  {
    setDataSource(paramUri, null);
  }
  
  public void setDataSource(@Nullable Uri paramUri, @Nullable MediaSource paramMediaSource)
  {
    try
    {
      requestedSeek = 0L;
      mediaPlayer.setDataSource(context, paramUri);
    }
    catch (Exception paramUri)
    {
      Log.d("NativeMediaPlayer", "MediaPlayer: error setting data source", paramUri);
    }
  }
  
  public void setDrmCallback(@Nullable MediaDrmCallback paramMediaDrmCallback) {}
  
  public void setListenerMux(ListenerMux paramListenerMux)
  {
    listenerMux = paramListenerMux;
    mediaPlayer.setOnCompletionListener(paramListenerMux);
    mediaPlayer.setOnPreparedListener(paramListenerMux);
    mediaPlayer.setOnBufferingUpdateListener(paramListenerMux);
    mediaPlayer.setOnSeekCompleteListener(paramListenerMux);
    mediaPlayer.setOnErrorListener(paramListenerMux);
  }
  
  public boolean setPlaybackSpeed(float paramFloat)
  {
    PlaybackParams localPlaybackParams = new PlaybackParams();
    localPlaybackParams.setSpeed(paramFloat);
    mediaPlayer.setPlaybackParams(localPlaybackParams);
    return true;
  }
  
  public void setRepeatMode(int paramInt) {}
  
  public void setTrack(@NonNull ExoMedia.RendererType paramRendererType, int paramInt) {}
  
  public void setTrack(@NonNull ExoMedia.RendererType paramRendererType, int paramInt1, int paramInt2) {}
  
  public void setVolume(@FloatRange(from=0.0D, to=1.0D) float paramFloat1, @FloatRange(from=0.0D, to=1.0D) float paramFloat2)
  {
    volumeLeft = paramFloat1;
    volumeRight = paramFloat2;
    mediaPlayer.setVolume(paramFloat1, paramFloat2);
  }
  
  public void setWakeMode(@NonNull Context paramContext, int paramInt)
  {
    mediaPlayer.setWakeMode(paramContext, paramInt);
  }
  
  public void start()
  {
    mediaPlayer.start();
    ListenerMux localListenerMux = listenerMux;
    if (localListenerMux != null) {
      localListenerMux.setNotifiedCompleted(false);
    }
  }
  
  public void stopPlayback()
  {
    mediaPlayer.stop();
  }
  
  public boolean trackSelectionAvailable()
  {
    return false;
  }
  
  public class InternalListeners
    implements MediaPlayer.OnBufferingUpdateListener
  {
    public InternalListeners() {}
    
    public void onBufferingUpdate(MediaPlayer paramMediaPlayer, int paramInt)
    {
      listenerMux.onBufferingUpdate(paramInt);
      currentBufferPercent = paramInt;
    }
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.core.audio.NativeAudioPlayer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */