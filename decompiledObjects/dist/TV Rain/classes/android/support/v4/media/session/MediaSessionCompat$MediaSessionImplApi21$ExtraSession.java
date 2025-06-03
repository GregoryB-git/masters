package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.view.KeyEvent;
import androidx.media.MediaSessionManager.RemoteUserInfo;
import java.util.List;

class MediaSessionCompat$MediaSessionImplApi21$ExtraSession
  extends IMediaSession.Stub
{
  public MediaSessionCompat$MediaSessionImplApi21$ExtraSession(MediaSessionCompat.MediaSessionImplApi21 paramMediaSessionImplApi21) {}
  
  public void addQueueItem(MediaDescriptionCompat paramMediaDescriptionCompat)
  {
    throw new AssertionError();
  }
  
  public void addQueueItemAt(MediaDescriptionCompat paramMediaDescriptionCompat, int paramInt)
  {
    throw new AssertionError();
  }
  
  public void adjustVolume(int paramInt1, int paramInt2, String paramString)
  {
    throw new AssertionError();
  }
  
  public void fastForward()
    throws RemoteException
  {
    throw new AssertionError();
  }
  
  public Bundle getExtras()
  {
    throw new AssertionError();
  }
  
  public long getFlags()
  {
    throw new AssertionError();
  }
  
  public PendingIntent getLaunchPendingIntent()
  {
    throw new AssertionError();
  }
  
  public MediaMetadataCompat getMetadata()
  {
    throw new AssertionError();
  }
  
  public String getPackageName()
  {
    throw new AssertionError();
  }
  
  public PlaybackStateCompat getPlaybackState()
  {
    MediaSessionCompat.MediaSessionImplApi21 localMediaSessionImplApi21 = this$0;
    return MediaSessionCompat.getStateWithUpdatedPosition(mPlaybackState, mMetadata);
  }
  
  public List<MediaSessionCompat.QueueItem> getQueue()
  {
    return null;
  }
  
  public CharSequence getQueueTitle()
  {
    throw new AssertionError();
  }
  
  public int getRatingType()
  {
    return this$0.mRatingType;
  }
  
  public int getRepeatMode()
  {
    return this$0.mRepeatMode;
  }
  
  public Bundle getSessionInfo()
  {
    Bundle localBundle;
    if (this$0.mSessionInfo == null) {
      localBundle = null;
    } else {
      localBundle = new Bundle(this$0.mSessionInfo);
    }
    return localBundle;
  }
  
  public int getShuffleMode()
  {
    return this$0.mShuffleMode;
  }
  
  public String getTag()
  {
    throw new AssertionError();
  }
  
  public ParcelableVolumeInfo getVolumeAttributes()
  {
    throw new AssertionError();
  }
  
  public boolean isCaptioningEnabled()
  {
    return this$0.mCaptioningEnabled;
  }
  
  public boolean isShuffleModeEnabledRemoved()
  {
    return false;
  }
  
  public boolean isTransportControlEnabled()
  {
    throw new AssertionError();
  }
  
  public void next()
    throws RemoteException
  {
    throw new AssertionError();
  }
  
  public void pause()
    throws RemoteException
  {
    throw new AssertionError();
  }
  
  public void play()
    throws RemoteException
  {
    throw new AssertionError();
  }
  
  public void playFromMediaId(String paramString, Bundle paramBundle)
    throws RemoteException
  {
    throw new AssertionError();
  }
  
  public void playFromSearch(String paramString, Bundle paramBundle)
    throws RemoteException
  {
    throw new AssertionError();
  }
  
  public void playFromUri(Uri paramUri, Bundle paramBundle)
    throws RemoteException
  {
    throw new AssertionError();
  }
  
  public void prepare()
    throws RemoteException
  {
    throw new AssertionError();
  }
  
  public void prepareFromMediaId(String paramString, Bundle paramBundle)
    throws RemoteException
  {
    throw new AssertionError();
  }
  
  public void prepareFromSearch(String paramString, Bundle paramBundle)
    throws RemoteException
  {
    throw new AssertionError();
  }
  
  public void prepareFromUri(Uri paramUri, Bundle paramBundle)
    throws RemoteException
  {
    throw new AssertionError();
  }
  
  public void previous()
    throws RemoteException
  {
    throw new AssertionError();
  }
  
  public void rate(RatingCompat paramRatingCompat)
    throws RemoteException
  {
    throw new AssertionError();
  }
  
  public void rateWithExtras(RatingCompat paramRatingCompat, Bundle paramBundle)
    throws RemoteException
  {
    throw new AssertionError();
  }
  
  public void registerCallbackListener(IMediaControllerCallback arg1)
  {
    if (this$0.mDestroyed) {
      return;
    }
    int i = Binder.getCallingPid();
    int j = Binder.getCallingUid();
    Object localObject1 = new MediaSessionManager.RemoteUserInfo("android.media.session.MediaController", i, j);
    this$0.mExtraControllerCallbacks.register(???, localObject1);
    synchronized (this$0.mLock)
    {
      localObject1 = this$0.mRegistrationCallbackHandler;
      if (localObject1 != null) {
        ((MediaSessionCompat.RegistrationCallbackHandler)localObject1).postCallbackRegistered(i, j);
      }
      return;
    }
  }
  
  public void removeQueueItem(MediaDescriptionCompat paramMediaDescriptionCompat)
  {
    throw new AssertionError();
  }
  
  public void removeQueueItemAt(int paramInt)
  {
    throw new AssertionError();
  }
  
  public void rewind()
    throws RemoteException
  {
    throw new AssertionError();
  }
  
  public void seekTo(long paramLong)
    throws RemoteException
  {
    throw new AssertionError();
  }
  
  public void sendCommand(String paramString, Bundle paramBundle, MediaSessionCompat.ResultReceiverWrapper paramResultReceiverWrapper)
  {
    throw new AssertionError();
  }
  
  public void sendCustomAction(String paramString, Bundle paramBundle)
    throws RemoteException
  {
    throw new AssertionError();
  }
  
  public boolean sendMediaButton(KeyEvent paramKeyEvent)
  {
    throw new AssertionError();
  }
  
  public void setCaptioningEnabled(boolean paramBoolean)
    throws RemoteException
  {
    throw new AssertionError();
  }
  
  public void setPlaybackSpeed(float paramFloat)
    throws RemoteException
  {
    throw new AssertionError();
  }
  
  public void setRepeatMode(int paramInt)
    throws RemoteException
  {
    throw new AssertionError();
  }
  
  public void setShuffleMode(int paramInt)
    throws RemoteException
  {
    throw new AssertionError();
  }
  
  public void setShuffleModeEnabledRemoved(boolean paramBoolean)
    throws RemoteException
  {}
  
  public void setVolumeTo(int paramInt1, int paramInt2, String paramString)
  {
    throw new AssertionError();
  }
  
  public void skipToQueueItem(long paramLong)
  {
    throw new AssertionError();
  }
  
  public void stop()
    throws RemoteException
  {
    throw new AssertionError();
  }
  
  public void unregisterCallbackListener(IMediaControllerCallback arg1)
  {
    this$0.mExtraControllerCallbacks.unregister(???);
    int i = Binder.getCallingPid();
    int j = Binder.getCallingUid();
    synchronized (this$0.mLock)
    {
      MediaSessionCompat.RegistrationCallbackHandler localRegistrationCallbackHandler = this$0.mRegistrationCallbackHandler;
      if (localRegistrationCallbackHandler != null) {
        localRegistrationCallbackHandler.postCallbackUnregistered(i, j);
      }
      return;
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21.ExtraSession
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */