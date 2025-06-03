package com.devbrackets.android.exomedia.core.video.mp;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnSeekCompleteListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.util.Log;

public class NativeVideoDelegate$InternalListeners
  implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnInfoListener, MediaPlayer.OnVideoSizeChangedListener
{
  public NativeVideoDelegate$InternalListeners(NativeVideoDelegate paramNativeVideoDelegate) {}
  
  public void onBufferingUpdate(MediaPlayer paramMediaPlayer, int paramInt)
  {
    Object localObject = this$0;
    currentBufferPercent = paramInt;
    localObject = onBufferingUpdateListener;
    if (localObject != null) {
      ((MediaPlayer.OnBufferingUpdateListener)localObject).onBufferingUpdate(paramMediaPlayer, paramInt);
    }
  }
  
  public void onCompletion(MediaPlayer paramMediaPlayer)
  {
    paramMediaPlayer = this$0;
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
    paramMediaPlayer = this$0;
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
    MediaPlayer.OnInfoListener localOnInfoListener = this$0.onInfoListener;
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
    NativeVideoDelegate localNativeVideoDelegate = this$0;
    currentState = NativeVideoDelegate.State.PREPARED;
    MediaPlayer.OnPreparedListener localOnPreparedListener = onPreparedListener;
    if (localOnPreparedListener != null) {
      localOnPreparedListener.onPrepared(mediaPlayer);
    }
    this$0.callback.videoSizeChanged(paramMediaPlayer.getVideoWidth(), paramMediaPlayer.getVideoHeight());
    paramMediaPlayer = this$0;
    long l = requestedSeek;
    if (l != 0L) {
      paramMediaPlayer.seekTo(l);
    }
    paramMediaPlayer = this$0;
    if (playRequested) {
      paramMediaPlayer.start();
    }
  }
  
  public void onSeekComplete(MediaPlayer paramMediaPlayer)
  {
    MediaPlayer.OnSeekCompleteListener localOnSeekCompleteListener = this$0.onSeekCompleteListener;
    if (localOnSeekCompleteListener != null) {
      localOnSeekCompleteListener.onSeekComplete(paramMediaPlayer);
    }
  }
  
  public void onVideoSizeChanged(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    this$0.callback.videoSizeChanged(paramMediaPlayer.getVideoWidth(), paramMediaPlayer.getVideoHeight());
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.core.video.mp.NativeVideoDelegate.InternalListeners
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */