package android.support.v4.media.session;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.media.RatingCompat;
import android.util.Log;

class MediaControllerCompat$TransportControlsBase
  extends MediaControllerCompat.TransportControls
{
  private IMediaSession mBinder;
  
  public MediaControllerCompat$TransportControlsBase(IMediaSession paramIMediaSession)
  {
    mBinder = paramIMediaSession;
  }
  
  public void fastForward()
  {
    try
    {
      mBinder.fastForward();
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("MediaControllerCompat", "Dead object in fastForward.", localRemoteException);
    }
  }
  
  public void pause()
  {
    try
    {
      mBinder.pause();
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("MediaControllerCompat", "Dead object in pause.", localRemoteException);
    }
  }
  
  public void play()
  {
    try
    {
      mBinder.play();
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("MediaControllerCompat", "Dead object in play.", localRemoteException);
    }
  }
  
  public void playFromMediaId(String paramString, Bundle paramBundle)
  {
    try
    {
      mBinder.playFromMediaId(paramString, paramBundle);
    }
    catch (RemoteException paramString)
    {
      Log.e("MediaControllerCompat", "Dead object in playFromMediaId.", paramString);
    }
  }
  
  public void playFromSearch(String paramString, Bundle paramBundle)
  {
    try
    {
      mBinder.playFromSearch(paramString, paramBundle);
    }
    catch (RemoteException paramString)
    {
      Log.e("MediaControllerCompat", "Dead object in playFromSearch.", paramString);
    }
  }
  
  public void playFromUri(Uri paramUri, Bundle paramBundle)
  {
    try
    {
      mBinder.playFromUri(paramUri, paramBundle);
    }
    catch (RemoteException paramUri)
    {
      Log.e("MediaControllerCompat", "Dead object in playFromUri.", paramUri);
    }
  }
  
  public void prepare()
  {
    try
    {
      mBinder.prepare();
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("MediaControllerCompat", "Dead object in prepare.", localRemoteException);
    }
  }
  
  public void prepareFromMediaId(String paramString, Bundle paramBundle)
  {
    try
    {
      mBinder.prepareFromMediaId(paramString, paramBundle);
    }
    catch (RemoteException paramString)
    {
      Log.e("MediaControllerCompat", "Dead object in prepareFromMediaId.", paramString);
    }
  }
  
  public void prepareFromSearch(String paramString, Bundle paramBundle)
  {
    try
    {
      mBinder.prepareFromSearch(paramString, paramBundle);
    }
    catch (RemoteException paramString)
    {
      Log.e("MediaControllerCompat", "Dead object in prepareFromSearch.", paramString);
    }
  }
  
  public void prepareFromUri(Uri paramUri, Bundle paramBundle)
  {
    try
    {
      mBinder.prepareFromUri(paramUri, paramBundle);
    }
    catch (RemoteException paramUri)
    {
      Log.e("MediaControllerCompat", "Dead object in prepareFromUri.", paramUri);
    }
  }
  
  public void rewind()
  {
    try
    {
      mBinder.rewind();
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("MediaControllerCompat", "Dead object in rewind.", localRemoteException);
    }
  }
  
  public void seekTo(long paramLong)
  {
    try
    {
      mBinder.seekTo(paramLong);
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("MediaControllerCompat", "Dead object in seekTo.", localRemoteException);
    }
  }
  
  public void sendCustomAction(PlaybackStateCompat.CustomAction paramCustomAction, Bundle paramBundle)
  {
    sendCustomAction(paramCustomAction.getAction(), paramBundle);
  }
  
  public void sendCustomAction(String paramString, Bundle paramBundle)
  {
    MediaControllerCompat.validateCustomAction(paramString, paramBundle);
    try
    {
      mBinder.sendCustomAction(paramString, paramBundle);
    }
    catch (RemoteException paramString)
    {
      Log.e("MediaControllerCompat", "Dead object in sendCustomAction.", paramString);
    }
  }
  
  public void setCaptioningEnabled(boolean paramBoolean)
  {
    try
    {
      mBinder.setCaptioningEnabled(paramBoolean);
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("MediaControllerCompat", "Dead object in setCaptioningEnabled.", localRemoteException);
    }
  }
  
  public void setPlaybackSpeed(float paramFloat)
  {
    if (paramFloat != 0.0F)
    {
      try
      {
        mBinder.setPlaybackSpeed(paramFloat);
      }
      catch (RemoteException localRemoteException)
      {
        Log.e("MediaControllerCompat", "Dead object in setPlaybackSpeed.", localRemoteException);
      }
      return;
    }
    throw new IllegalArgumentException("speed must not be zero");
  }
  
  public void setRating(RatingCompat paramRatingCompat)
  {
    try
    {
      mBinder.rate(paramRatingCompat);
    }
    catch (RemoteException paramRatingCompat)
    {
      Log.e("MediaControllerCompat", "Dead object in setRating.", paramRatingCompat);
    }
  }
  
  public void setRating(RatingCompat paramRatingCompat, Bundle paramBundle)
  {
    try
    {
      mBinder.rateWithExtras(paramRatingCompat, paramBundle);
    }
    catch (RemoteException paramRatingCompat)
    {
      Log.e("MediaControllerCompat", "Dead object in setRating.", paramRatingCompat);
    }
  }
  
  public void setRepeatMode(int paramInt)
  {
    try
    {
      mBinder.setRepeatMode(paramInt);
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("MediaControllerCompat", "Dead object in setRepeatMode.", localRemoteException);
    }
  }
  
  public void setShuffleMode(int paramInt)
  {
    try
    {
      mBinder.setShuffleMode(paramInt);
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("MediaControllerCompat", "Dead object in setShuffleMode.", localRemoteException);
    }
  }
  
  public void skipToNext()
  {
    try
    {
      mBinder.next();
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("MediaControllerCompat", "Dead object in skipToNext.", localRemoteException);
    }
  }
  
  public void skipToPrevious()
  {
    try
    {
      mBinder.previous();
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("MediaControllerCompat", "Dead object in skipToPrevious.", localRemoteException);
    }
  }
  
  public void skipToQueueItem(long paramLong)
  {
    try
    {
      mBinder.skipToQueueItem(paramLong);
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("MediaControllerCompat", "Dead object in skipToQueueItem.", localRemoteException);
    }
  }
  
  public void stop()
  {
    try
    {
      mBinder.stop();
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("MediaControllerCompat", "Dead object in stop.", localRemoteException);
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaControllerCompat.TransportControlsBase
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */