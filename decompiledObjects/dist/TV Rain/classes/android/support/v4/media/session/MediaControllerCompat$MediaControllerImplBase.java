package android.support.v4.media.session;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Log;
import android.view.KeyEvent;
import java.util.List;

class MediaControllerCompat$MediaControllerImplBase
  implements MediaControllerCompat.MediaControllerImpl
{
  private IMediaSession mBinder;
  private Bundle mSessionInfo;
  private MediaControllerCompat.TransportControls mTransportControls;
  
  public MediaControllerCompat$MediaControllerImplBase(MediaSessionCompat.Token paramToken)
  {
    mBinder = IMediaSession.Stub.asInterface((IBinder)paramToken.getToken());
  }
  
  public void addQueueItem(MediaDescriptionCompat paramMediaDescriptionCompat)
  {
    try
    {
      if ((mBinder.getFlags() & 0x4) != 0L)
      {
        mBinder.addQueueItem(paramMediaDescriptionCompat);
      }
      else
      {
        paramMediaDescriptionCompat = new java/lang/UnsupportedOperationException;
        paramMediaDescriptionCompat.<init>("This session doesn't support queue management operations");
        throw paramMediaDescriptionCompat;
      }
    }
    catch (RemoteException paramMediaDescriptionCompat)
    {
      Log.e("MediaControllerCompat", "Dead object in addQueueItem.", paramMediaDescriptionCompat);
    }
  }
  
  public void addQueueItem(MediaDescriptionCompat paramMediaDescriptionCompat, int paramInt)
  {
    try
    {
      if ((mBinder.getFlags() & 0x4) != 0L)
      {
        mBinder.addQueueItemAt(paramMediaDescriptionCompat, paramInt);
      }
      else
      {
        paramMediaDescriptionCompat = new java/lang/UnsupportedOperationException;
        paramMediaDescriptionCompat.<init>("This session doesn't support queue management operations");
        throw paramMediaDescriptionCompat;
      }
    }
    catch (RemoteException paramMediaDescriptionCompat)
    {
      Log.e("MediaControllerCompat", "Dead object in addQueueItemAt.", paramMediaDescriptionCompat);
    }
  }
  
  public void adjustVolume(int paramInt1, int paramInt2)
  {
    try
    {
      mBinder.adjustVolume(paramInt1, paramInt2, null);
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("MediaControllerCompat", "Dead object in adjustVolume.", localRemoteException);
    }
  }
  
  public boolean dispatchMediaButtonEvent(KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent != null)
    {
      try
      {
        mBinder.sendMediaButton(paramKeyEvent);
      }
      catch (RemoteException paramKeyEvent)
      {
        Log.e("MediaControllerCompat", "Dead object in dispatchMediaButtonEvent.", paramKeyEvent);
      }
      return false;
    }
    throw new IllegalArgumentException("event may not be null.");
  }
  
  public Bundle getExtras()
  {
    try
    {
      Bundle localBundle = mBinder.getExtras();
      return localBundle;
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("MediaControllerCompat", "Dead object in getExtras.", localRemoteException);
    }
    return null;
  }
  
  public long getFlags()
  {
    try
    {
      long l = mBinder.getFlags();
      return l;
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("MediaControllerCompat", "Dead object in getFlags.", localRemoteException);
    }
    return 0L;
  }
  
  public Object getMediaController()
  {
    return null;
  }
  
  public MediaMetadataCompat getMetadata()
  {
    try
    {
      MediaMetadataCompat localMediaMetadataCompat = mBinder.getMetadata();
      return localMediaMetadataCompat;
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("MediaControllerCompat", "Dead object in getMetadata.", localRemoteException);
    }
    return null;
  }
  
  public String getPackageName()
  {
    try
    {
      String str = mBinder.getPackageName();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("MediaControllerCompat", "Dead object in getPackageName.", localRemoteException);
    }
    return null;
  }
  
  public MediaControllerCompat.PlaybackInfo getPlaybackInfo()
  {
    try
    {
      Object localObject = mBinder.getVolumeAttributes();
      localObject = new MediaControllerCompat.PlaybackInfo(volumeType, audioStream, controlType, maxVolume, currentVolume);
      return (MediaControllerCompat.PlaybackInfo)localObject;
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("MediaControllerCompat", "Dead object in getPlaybackInfo.", localRemoteException);
    }
    return null;
  }
  
  public PlaybackStateCompat getPlaybackState()
  {
    try
    {
      PlaybackStateCompat localPlaybackStateCompat = mBinder.getPlaybackState();
      return localPlaybackStateCompat;
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", localRemoteException);
    }
    return null;
  }
  
  public List<MediaSessionCompat.QueueItem> getQueue()
  {
    try
    {
      List localList = mBinder.getQueue();
      return localList;
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("MediaControllerCompat", "Dead object in getQueue.", localRemoteException);
    }
    return null;
  }
  
  public CharSequence getQueueTitle()
  {
    try
    {
      CharSequence localCharSequence = mBinder.getQueueTitle();
      return localCharSequence;
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("MediaControllerCompat", "Dead object in getQueueTitle.", localRemoteException);
    }
    return null;
  }
  
  public int getRatingType()
  {
    try
    {
      int i = mBinder.getRatingType();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("MediaControllerCompat", "Dead object in getRatingType.", localRemoteException);
    }
    return 0;
  }
  
  public int getRepeatMode()
  {
    try
    {
      int i = mBinder.getRepeatMode();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("MediaControllerCompat", "Dead object in getRepeatMode.", localRemoteException);
    }
    return -1;
  }
  
  public PendingIntent getSessionActivity()
  {
    try
    {
      PendingIntent localPendingIntent = mBinder.getLaunchPendingIntent();
      return localPendingIntent;
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("MediaControllerCompat", "Dead object in getSessionActivity.", localRemoteException);
    }
    return null;
  }
  
  public Bundle getSessionInfo()
  {
    try
    {
      mSessionInfo = mBinder.getSessionInfo();
    }
    catch (RemoteException localRemoteException)
    {
      Log.d("MediaControllerCompat", "Dead object in getSessionInfo.", localRemoteException);
    }
    Bundle localBundle = MediaSessionCompat.unparcelWithClassLoader(mSessionInfo);
    mSessionInfo = localBundle;
    if (localBundle == null) {
      localBundle = Bundle.EMPTY;
    } else {
      localBundle = new Bundle(mSessionInfo);
    }
    return localBundle;
  }
  
  public int getShuffleMode()
  {
    try
    {
      int i = mBinder.getShuffleMode();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("MediaControllerCompat", "Dead object in getShuffleMode.", localRemoteException);
    }
    return -1;
  }
  
  public MediaControllerCompat.TransportControls getTransportControls()
  {
    if (mTransportControls == null) {
      mTransportControls = new MediaControllerCompat.TransportControlsBase(mBinder);
    }
    return mTransportControls;
  }
  
  public boolean isCaptioningEnabled()
  {
    try
    {
      boolean bool = mBinder.isCaptioningEnabled();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("MediaControllerCompat", "Dead object in isCaptioningEnabled.", localRemoteException);
    }
    return false;
  }
  
  public boolean isSessionReady()
  {
    return true;
  }
  
  public void registerCallback(MediaControllerCompat.Callback paramCallback, Handler paramHandler)
  {
    if (paramCallback != null)
    {
      try
      {
        mBinder.asBinder().linkToDeath(paramCallback, 0);
        mBinder.registerCallbackListener(mIControllerCallback);
        paramCallback.postToHandler(13, null, null);
      }
      catch (RemoteException paramHandler)
      {
        Log.e("MediaControllerCompat", "Dead object in registerCallback.", paramHandler);
        paramCallback.postToHandler(8, null, null);
      }
      return;
    }
    throw new IllegalArgumentException("callback may not be null.");
  }
  
  public void removeQueueItem(MediaDescriptionCompat paramMediaDescriptionCompat)
  {
    try
    {
      if ((mBinder.getFlags() & 0x4) != 0L)
      {
        mBinder.removeQueueItem(paramMediaDescriptionCompat);
      }
      else
      {
        paramMediaDescriptionCompat = new java/lang/UnsupportedOperationException;
        paramMediaDescriptionCompat.<init>("This session doesn't support queue management operations");
        throw paramMediaDescriptionCompat;
      }
    }
    catch (RemoteException paramMediaDescriptionCompat)
    {
      Log.e("MediaControllerCompat", "Dead object in removeQueueItem.", paramMediaDescriptionCompat);
    }
  }
  
  public void sendCommand(String paramString, Bundle paramBundle, ResultReceiver paramResultReceiver)
  {
    try
    {
      IMediaSession localIMediaSession = mBinder;
      if (paramResultReceiver == null) {
        paramResultReceiver = null;
      } else {
        paramResultReceiver = new MediaSessionCompat.ResultReceiverWrapper(paramResultReceiver);
      }
      localIMediaSession.sendCommand(paramString, paramBundle, paramResultReceiver);
    }
    catch (RemoteException paramString)
    {
      Log.e("MediaControllerCompat", "Dead object in sendCommand.", paramString);
    }
  }
  
  public void setVolumeTo(int paramInt1, int paramInt2)
  {
    try
    {
      mBinder.setVolumeTo(paramInt1, paramInt2, null);
    }
    catch (RemoteException localRemoteException)
    {
      Log.e("MediaControllerCompat", "Dead object in setVolumeTo.", localRemoteException);
    }
  }
  
  public void unregisterCallback(MediaControllerCompat.Callback paramCallback)
  {
    if (paramCallback != null)
    {
      try
      {
        mBinder.unregisterCallbackListener(mIControllerCallback);
        mBinder.asBinder().unlinkToDeath(paramCallback, 0);
      }
      catch (RemoteException paramCallback)
      {
        Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", paramCallback);
      }
      return;
    }
    throw new IllegalArgumentException("callback may not be null.");
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaControllerCompat.MediaControllerImplBase
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */