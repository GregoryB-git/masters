package android.support.v4.media.session;

import android.app.PendingIntent;
import android.media.AudioManager;
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
import androidx.media.VolumeProviderCompat;
import java.util.List;

class MediaSessionCompat$MediaSessionImplBase$MediaSessionStub
  extends IMediaSession.Stub
{
  public MediaSessionCompat$MediaSessionImplBase$MediaSessionStub(MediaSessionCompat.MediaSessionImplBase paramMediaSessionImplBase) {}
  
  public void addQueueItem(MediaDescriptionCompat paramMediaDescriptionCompat)
  {
    postToHandler(25, paramMediaDescriptionCompat);
  }
  
  public void addQueueItemAt(MediaDescriptionCompat paramMediaDescriptionCompat, int paramInt)
  {
    postToHandler(26, paramMediaDescriptionCompat, paramInt);
  }
  
  public void adjustVolume(int paramInt1, int paramInt2, String paramString)
  {
    this$0.adjustVolume(paramInt1, paramInt2);
  }
  
  public void fastForward()
    throws RemoteException
  {
    postToHandler(16);
  }
  
  public Bundle getExtras()
  {
    synchronized (this$0.mLock)
    {
      Bundle localBundle = this$0.mExtras;
      return localBundle;
    }
  }
  
  public long getFlags()
  {
    synchronized (this$0.mLock)
    {
      long l = this$0.mFlags;
      return l;
    }
  }
  
  public PendingIntent getLaunchPendingIntent()
  {
    synchronized (this$0.mLock)
    {
      PendingIntent localPendingIntent = this$0.mSessionActivity;
      return localPendingIntent;
    }
  }
  
  public MediaMetadataCompat getMetadata()
  {
    return this$0.mMetadata;
  }
  
  public String getPackageName()
  {
    return this$0.mPackageName;
  }
  
  public PlaybackStateCompat getPlaybackState()
  {
    synchronized (this$0.mLock)
    {
      Object localObject2 = this$0;
      PlaybackStateCompat localPlaybackStateCompat = mState;
      localObject2 = mMetadata;
      return MediaSessionCompat.getStateWithUpdatedPosition(localPlaybackStateCompat, (MediaMetadataCompat)localObject2);
    }
  }
  
  public List<MediaSessionCompat.QueueItem> getQueue()
  {
    synchronized (this$0.mLock)
    {
      List localList = this$0.mQueue;
      return localList;
    }
  }
  
  public CharSequence getQueueTitle()
  {
    return this$0.mQueueTitle;
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
    return this$0.mTag;
  }
  
  public ParcelableVolumeInfo getVolumeAttributes()
  {
    synchronized (this$0.mLock)
    {
      MediaSessionCompat.MediaSessionImplBase localMediaSessionImplBase = this$0;
      int i = mVolumeType;
      int j = mLocalStream;
      VolumeProviderCompat localVolumeProviderCompat = mVolumeProvider;
      int k = 2;
      int m;
      int n;
      if (i == 2)
      {
        k = localVolumeProviderCompat.getVolumeControl();
        m = localVolumeProviderCompat.getMaxVolume();
        n = localVolumeProviderCompat.getCurrentVolume();
      }
      else
      {
        m = mAudioManager.getStreamMaxVolume(j);
        n = this$0.mAudioManager.getStreamVolume(j);
      }
      return new ParcelableVolumeInfo(i, j, k, m, n);
    }
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
    return true;
  }
  
  public void next()
    throws RemoteException
  {
    postToHandler(14);
  }
  
  public void pause()
    throws RemoteException
  {
    postToHandler(12);
  }
  
  public void play()
    throws RemoteException
  {
    postToHandler(7);
  }
  
  public void playFromMediaId(String paramString, Bundle paramBundle)
    throws RemoteException
  {
    postToHandler(8, paramString, paramBundle);
  }
  
  public void playFromSearch(String paramString, Bundle paramBundle)
    throws RemoteException
  {
    postToHandler(9, paramString, paramBundle);
  }
  
  public void playFromUri(Uri paramUri, Bundle paramBundle)
    throws RemoteException
  {
    postToHandler(10, paramUri, paramBundle);
  }
  
  public void postToHandler(int paramInt)
  {
    this$0.postToHandler(paramInt, 0, 0, null, null);
  }
  
  public void postToHandler(int paramInt1, int paramInt2)
  {
    this$0.postToHandler(paramInt1, paramInt2, 0, null, null);
  }
  
  public void postToHandler(int paramInt1, int paramInt2, int paramInt3)
  {
    this$0.postToHandler(paramInt1, paramInt2, paramInt3, null, null);
  }
  
  public void postToHandler(int paramInt, Object paramObject)
  {
    this$0.postToHandler(paramInt, 0, 0, paramObject, null);
  }
  
  public void postToHandler(int paramInt1, Object paramObject, int paramInt2)
  {
    this$0.postToHandler(paramInt1, paramInt2, 0, paramObject, null);
  }
  
  public void postToHandler(int paramInt, Object paramObject, Bundle paramBundle)
  {
    this$0.postToHandler(paramInt, 0, 0, paramObject, paramBundle);
  }
  
  public void prepare()
    throws RemoteException
  {
    postToHandler(3);
  }
  
  public void prepareFromMediaId(String paramString, Bundle paramBundle)
    throws RemoteException
  {
    postToHandler(4, paramString, paramBundle);
  }
  
  public void prepareFromSearch(String paramString, Bundle paramBundle)
    throws RemoteException
  {
    postToHandler(5, paramString, paramBundle);
  }
  
  public void prepareFromUri(Uri paramUri, Bundle paramBundle)
    throws RemoteException
  {
    postToHandler(6, paramUri, paramBundle);
  }
  
  public void previous()
    throws RemoteException
  {
    postToHandler(15);
  }
  
  public void rate(RatingCompat paramRatingCompat)
    throws RemoteException
  {
    postToHandler(19, paramRatingCompat);
  }
  
  public void rateWithExtras(RatingCompat paramRatingCompat, Bundle paramBundle)
    throws RemoteException
  {
    postToHandler(31, paramRatingCompat, paramBundle);
  }
  
  public void registerCallbackListener(IMediaControllerCallback arg1)
  {
    if (this$0.mDestroyed) {}
    try
    {
      ???.onSessionDestroyed();
      return;
      int i = Binder.getCallingPid();
      int j = Binder.getCallingUid();
      Object localObject1 = new MediaSessionManager.RemoteUserInfo(this$0.getPackageNameForUid(j), i, j);
      this$0.mControllerCallbacks.register(???, localObject1);
      synchronized (this$0.mLock)
      {
        localObject1 = this$0.mRegistrationCallbackHandler;
        if (localObject1 != null) {
          ((MediaSessionCompat.RegistrationCallbackHandler)localObject1).postCallbackRegistered(i, j);
        }
        return;
      }
    }
    catch (Exception ???)
    {
      for (;;) {}
    }
  }
  
  public void removeQueueItem(MediaDescriptionCompat paramMediaDescriptionCompat)
  {
    postToHandler(27, paramMediaDescriptionCompat);
  }
  
  public void removeQueueItemAt(int paramInt)
  {
    postToHandler(28, paramInt);
  }
  
  public void rewind()
    throws RemoteException
  {
    postToHandler(17);
  }
  
  public void seekTo(long paramLong)
    throws RemoteException
  {
    postToHandler(18, Long.valueOf(paramLong));
  }
  
  public void sendCommand(String paramString, Bundle paramBundle, MediaSessionCompat.ResultReceiverWrapper paramResultReceiverWrapper)
  {
    if (paramResultReceiverWrapper == null) {
      paramResultReceiverWrapper = null;
    } else {
      paramResultReceiverWrapper = mResultReceiver;
    }
    postToHandler(1, new MediaSessionCompat.MediaSessionImplBase.Command(paramString, paramBundle, paramResultReceiverWrapper));
  }
  
  public void sendCustomAction(String paramString, Bundle paramBundle)
    throws RemoteException
  {
    postToHandler(20, paramString, paramBundle);
  }
  
  public boolean sendMediaButton(KeyEvent paramKeyEvent)
  {
    postToHandler(21, paramKeyEvent);
    return true;
  }
  
  public void setCaptioningEnabled(boolean paramBoolean)
    throws RemoteException
  {
    postToHandler(29, Boolean.valueOf(paramBoolean));
  }
  
  public void setPlaybackSpeed(float paramFloat)
    throws RemoteException
  {
    postToHandler(32, Float.valueOf(paramFloat));
  }
  
  public void setRepeatMode(int paramInt)
    throws RemoteException
  {
    postToHandler(23, paramInt);
  }
  
  public void setShuffleMode(int paramInt)
    throws RemoteException
  {
    postToHandler(30, paramInt);
  }
  
  public void setShuffleModeEnabledRemoved(boolean paramBoolean)
    throws RemoteException
  {}
  
  public void setVolumeTo(int paramInt1, int paramInt2, String paramString)
  {
    this$0.setVolumeTo(paramInt1, paramInt2);
  }
  
  public void skipToQueueItem(long paramLong)
  {
    postToHandler(11, Long.valueOf(paramLong));
  }
  
  public void stop()
    throws RemoteException
  {
    postToHandler(13);
  }
  
  public void unregisterCallbackListener(IMediaControllerCallback arg1)
  {
    this$0.mControllerCallbacks.unregister(???);
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
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase.MediaSessionStub
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */