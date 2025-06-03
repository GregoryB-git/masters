package com.devbrackets.android.exomedia.core.video.mp;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnSeekCompleteListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.media.PlaybackParams;
import android.net.Uri;
import android.util.Log;
import android.view.Surface;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.devbrackets.android.exomedia.core.ListenerMux;
import com.devbrackets.android.exomedia.core.exoplayer.WindowInfo;
import com.devbrackets.android.exomedia.core.video.ClearableSurface;
import java.io.IOException;
import java.util.Map;

public class NativeVideoDelegate
{
  public Callback callback;
  public ClearableSurface clearableSurface;
  public Context context;
  public int currentBufferPercent;
  public State currentState;
  public Map<String, String> headers;
  @NonNull
  public InternalListeners internalListeners;
  public ListenerMux listenerMux;
  public MediaPlayer mediaPlayer;
  @Nullable
  public MediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener;
  @Nullable
  public MediaPlayer.OnCompletionListener onCompletionListener;
  @Nullable
  public MediaPlayer.OnErrorListener onErrorListener;
  @Nullable
  public MediaPlayer.OnInfoListener onInfoListener;
  @Nullable
  public MediaPlayer.OnPreparedListener onPreparedListener;
  @Nullable
  public MediaPlayer.OnSeekCompleteListener onSeekCompleteListener;
  public boolean playRequested;
  public long requestedSeek;
  @FloatRange(from=0.0D, to=1.0D)
  public float requestedVolume;
  
  public NativeVideoDelegate(@NonNull Context paramContext, @NonNull Callback paramCallback, @NonNull ClearableSurface paramClearableSurface)
  {
    State localState = State.IDLE;
    currentState = localState;
    playRequested = false;
    requestedVolume = 1.0F;
    internalListeners = new InternalListeners();
    context = paramContext;
    callback = paramCallback;
    clearableSurface = paramClearableSurface;
    initMediaPlayer();
    currentState = localState;
  }
  
  public int getBufferPercentage()
  {
    if (mediaPlayer != null) {
      return currentBufferPercent;
    }
    return 0;
  }
  
  public long getCurrentPosition()
  {
    if ((listenerMux.isPrepared()) && (isReady())) {
      return mediaPlayer.getCurrentPosition();
    }
    return 0L;
  }
  
  public long getDuration()
  {
    if ((listenerMux.isPrepared()) && (isReady())) {
      return mediaPlayer.getDuration();
    }
    return 0L;
  }
  
  public float getPlaybackSpeed()
  {
    return mediaPlayer.getPlaybackParams().getSpeed();
  }
  
  @FloatRange(from=0.0D, to=1.0D)
  public float getVolume()
  {
    return requestedVolume;
  }
  
  @Nullable
  public WindowInfo getWindowInfo()
  {
    return null;
  }
  
  public void initMediaPlayer()
  {
    MediaPlayer localMediaPlayer = new MediaPlayer();
    mediaPlayer = localMediaPlayer;
    localMediaPlayer.setOnInfoListener(internalListeners);
    mediaPlayer.setOnErrorListener(internalListeners);
    mediaPlayer.setOnPreparedListener(internalListeners);
    mediaPlayer.setOnCompletionListener(internalListeners);
    mediaPlayer.setOnSeekCompleteListener(internalListeners);
    mediaPlayer.setOnBufferingUpdateListener(internalListeners);
    mediaPlayer.setOnVideoSizeChangedListener(internalListeners);
    mediaPlayer.setAudioStreamType(3);
    mediaPlayer.setScreenOnWhilePlaying(true);
  }
  
  public boolean isPlaying()
  {
    boolean bool;
    if ((isReady()) && (mediaPlayer.isPlaying())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isReady()
  {
    State localState = currentState;
    boolean bool;
    if ((localState != State.ERROR) && (localState != State.IDLE) && (localState != State.PREPARING)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void onSurfaceReady(Surface paramSurface)
  {
    mediaPlayer.setSurface(paramSurface);
    if (playRequested) {
      start();
    }
  }
  
  public void onSurfaceSizeChanged(int paramInt1, int paramInt2)
  {
    if ((mediaPlayer != null) && (paramInt1 > 0) && (paramInt2 > 0))
    {
      long l = requestedSeek;
      if (l != 0L) {
        seekTo(l);
      }
      if (playRequested) {
        start();
      }
    }
  }
  
  public void openVideo(@Nullable Uri paramUri)
  {
    if (paramUri == null) {
      return;
    }
    currentBufferPercent = 0;
    try
    {
      mediaPlayer.reset();
      mediaPlayer.setDataSource(context.getApplicationContext(), paramUri, headers);
      mediaPlayer.prepareAsync();
      currentState = State.PREPARING;
    }
    catch (IllegalArgumentException localIllegalArgumentException) {}catch (IOException localIOException) {}
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Unable to open content: ");
    localStringBuilder.append(paramUri);
    Log.w("ContentValues", localStringBuilder.toString(), localIOException);
    currentState = State.ERROR;
    internalListeners.onError(mediaPlayer, 1, 0);
  }
  
  public void pause()
  {
    if ((isReady()) && (mediaPlayer.isPlaying()))
    {
      mediaPlayer.pause();
      currentState = State.PAUSED;
    }
    playRequested = false;
  }
  
  public boolean restart()
  {
    if (currentState != State.COMPLETED) {
      return false;
    }
    seekTo(0L);
    start();
    listenerMux.setNotifiedPrepared(false);
    listenerMux.setNotifiedCompleted(false);
    return true;
  }
  
  public void seekTo(long paramLong)
  {
    if (isReady())
    {
      mediaPlayer.seekTo((int)paramLong);
      requestedSeek = 0L;
    }
    else
    {
      requestedSeek = paramLong;
    }
  }
  
  public void setListenerMux(ListenerMux paramListenerMux)
  {
    listenerMux = paramListenerMux;
    setOnCompletionListener(paramListenerMux);
    setOnPreparedListener(paramListenerMux);
    setOnBufferingUpdateListener(paramListenerMux);
    setOnSeekCompleteListener(paramListenerMux);
    setOnErrorListener(paramListenerMux);
  }
  
  public void setOnBufferingUpdateListener(@Nullable MediaPlayer.OnBufferingUpdateListener paramOnBufferingUpdateListener)
  {
    onBufferingUpdateListener = paramOnBufferingUpdateListener;
  }
  
  public void setOnCompletionListener(@Nullable MediaPlayer.OnCompletionListener paramOnCompletionListener)
  {
    onCompletionListener = paramOnCompletionListener;
  }
  
  public void setOnErrorListener(@Nullable MediaPlayer.OnErrorListener paramOnErrorListener)
  {
    onErrorListener = paramOnErrorListener;
  }
  
  public void setOnInfoListener(@Nullable MediaPlayer.OnInfoListener paramOnInfoListener)
  {
    onInfoListener = paramOnInfoListener;
  }
  
  public void setOnPreparedListener(@Nullable MediaPlayer.OnPreparedListener paramOnPreparedListener)
  {
    onPreparedListener = paramOnPreparedListener;
  }
  
  public void setOnSeekCompleteListener(@Nullable MediaPlayer.OnSeekCompleteListener paramOnSeekCompleteListener)
  {
    onSeekCompleteListener = paramOnSeekCompleteListener;
  }
  
  public boolean setPlaybackSpeed(float paramFloat)
  {
    PlaybackParams localPlaybackParams = new PlaybackParams();
    localPlaybackParams.setSpeed(paramFloat);
    mediaPlayer.setPlaybackParams(localPlaybackParams);
    return true;
  }
  
  public void setVideoURI(Uri paramUri, @Nullable Map<String, String> paramMap)
  {
    headers = paramMap;
    requestedSeek = 0L;
    playRequested = false;
    openVideo(paramUri);
  }
  
  public boolean setVolume(@FloatRange(from=0.0D, to=1.0D) float paramFloat)
  {
    requestedVolume = paramFloat;
    mediaPlayer.setVolume(paramFloat, paramFloat);
    return true;
  }
  
  public void start()
  {
    if (isReady())
    {
      mediaPlayer.start();
      currentState = State.PLAYING;
    }
    playRequested = true;
    listenerMux.setNotifiedCompleted(false);
  }
  
  public void stopPlayback(boolean paramBoolean)
  {
    currentState = State.IDLE;
    if (isReady()) {
      try
      {
        mediaPlayer.stop();
      }
      catch (Exception localException)
      {
        Log.d("ContentValues", "stopPlayback: error calling mediaPlayer.stop()", localException);
      }
    }
    playRequested = false;
    if (paramBoolean) {
      listenerMux.clearSurfaceWhenReady(clearableSurface);
    }
  }
  
  public void suspend()
  {
    currentState = State.IDLE;
    try
    {
      mediaPlayer.reset();
      mediaPlayer.release();
    }
    catch (Exception localException)
    {
      Log.d("ContentValues", "stopPlayback: error calling mediaPlayer.reset() or mediaPlayer.release()", localException);
    }
    playRequested = false;
  }
  
  public static abstract interface Callback
  {
    public abstract void videoSizeChanged(int paramInt1, int paramInt2);
  }
  
  public class InternalListeners
    implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnInfoListener, MediaPlayer.OnVideoSizeChangedListener
  {
    public InternalListeners() {}
    
    public void onBufferingUpdate(MediaPlayer paramMediaPlayer, int paramInt)
    {
      Object localObject = NativeVideoDelegate.this;
      currentBufferPercent = paramInt;
      localObject = onBufferingUpdateListener;
      if (localObject != null) {
        ((MediaPlayer.OnBufferingUpdateListener)localObject).onBufferingUpdate(paramMediaPlayer, paramInt);
      }
    }
    
    public void onCompletion(MediaPlayer paramMediaPlayer)
    {
      paramMediaPlayer = NativeVideoDelegate.this;
      currentState = NativeVideoDelegate.State.COMPLETED;
      MediaPlayer.OnCompletionListener localOnCompletionListener = onCompletionListener;
      if (localOnCompletionListener != null) {
        localOnCompletionListener.onCompletion(mediaPlayer);
      }
    }
    
    public boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
    {
      paramMediaPlayer = new StringBuilder();
      paramMediaPlayer.append("Error: ");
      paramMediaPlayer.append(paramInt1);
      paramMediaPlayer.append(",");
      paramMediaPlayer.append(paramInt2);
      Log.d("ContentValues", paramMediaPlayer.toString());
      paramMediaPlayer = NativeVideoDelegate.this;
      currentState = NativeVideoDelegate.State.ERROR;
      MediaPlayer.OnErrorListener localOnErrorListener = onErrorListener;
      boolean bool;
      if ((localOnErrorListener != null) && (!localOnErrorListener.onError(mediaPlayer, paramInt1, paramInt2))) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public boolean onInfo(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
    {
      MediaPlayer.OnInfoListener localOnInfoListener = onInfoListener;
      boolean bool;
      if ((localOnInfoListener != null) && (!localOnInfoListener.onInfo(paramMediaPlayer, paramInt1, paramInt2))) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public void onPrepared(MediaPlayer paramMediaPlayer)
    {
      NativeVideoDelegate localNativeVideoDelegate = NativeVideoDelegate.this;
      currentState = NativeVideoDelegate.State.PREPARED;
      MediaPlayer.OnPreparedListener localOnPreparedListener = onPreparedListener;
      if (localOnPreparedListener != null) {
        localOnPreparedListener.onPrepared(mediaPlayer);
      }
      callback.videoSizeChanged(paramMediaPlayer.getVideoWidth(), paramMediaPlayer.getVideoHeight());
      paramMediaPlayer = NativeVideoDelegate.this;
      long l = requestedSeek;
      if (l != 0L) {
        paramMediaPlayer.seekTo(l);
      }
      paramMediaPlayer = NativeVideoDelegate.this;
      if (playRequested) {
        paramMediaPlayer.start();
      }
    }
    
    public void onSeekComplete(MediaPlayer paramMediaPlayer)
    {
      MediaPlayer.OnSeekCompleteListener localOnSeekCompleteListener = onSeekCompleteListener;
      if (localOnSeekCompleteListener != null) {
        localOnSeekCompleteListener.onSeekComplete(paramMediaPlayer);
      }
    }
    
    public void onVideoSizeChanged(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
    {
      callback.videoSizeChanged(paramMediaPlayer.getVideoWidth(), paramMediaPlayer.getVideoHeight());
    }
  }
  
  public static enum State
  {
    static
    {
      State localState1 = new State("ERROR", 0);
      ERROR = localState1;
      State localState2 = new State("IDLE", 1);
      IDLE = localState2;
      State localState3 = new State("PREPARING", 2);
      PREPARING = localState3;
      State localState4 = new State("PREPARED", 3);
      PREPARED = localState4;
      State localState5 = new State("PLAYING", 4);
      PLAYING = localState5;
      State localState6 = new State("PAUSED", 5);
      PAUSED = localState6;
      State localState7 = new State("COMPLETED", 6);
      COMPLETED = localState7;
      $VALUES = new State[] { localState1, localState2, localState3, localState4, localState5, localState6, localState7 };
    }
    
    private State() {}
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.core.video.mp.NativeVideoDelegate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */