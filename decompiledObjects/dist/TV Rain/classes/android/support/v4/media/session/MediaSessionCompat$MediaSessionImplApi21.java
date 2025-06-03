package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.media.AudioAttributes.Builder;
import android.media.MediaMetadata;
import android.media.VolumeProvider;
import android.media.session.MediaSession;
import android.media.session.MediaSession.Callback;
import android.media.session.MediaSession.QueueItem;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.util.Log;
import android.view.KeyEvent;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media.MediaSessionManager.RemoteUserInfo;
import androidx.media.VolumeProviderCompat;
import androidx.versionedparcelable.VersionedParcelable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RequiresApi(21)
class MediaSessionCompat$MediaSessionImplApi21
  implements MediaSessionCompat.MediaSessionImpl
{
  @GuardedBy("mLock")
  public MediaSessionCompat.Callback mCallback;
  public boolean mCaptioningEnabled;
  public boolean mDestroyed = false;
  public final RemoteCallbackList<IMediaControllerCallback> mExtraControllerCallbacks = new RemoteCallbackList();
  public final Object mLock = new Object();
  public MediaMetadataCompat mMetadata;
  public PlaybackStateCompat mPlaybackState;
  public List<MediaSessionCompat.QueueItem> mQueue;
  public int mRatingType;
  @GuardedBy("mLock")
  public MediaSessionCompat.RegistrationCallbackHandler mRegistrationCallbackHandler;
  @GuardedBy("mLock")
  public MediaSessionManager.RemoteUserInfo mRemoteUserInfo;
  public int mRepeatMode;
  public final MediaSession mSessionFwk;
  public Bundle mSessionInfo;
  public int mShuffleMode;
  public final MediaSessionCompat.Token mToken;
  
  public MediaSessionCompat$MediaSessionImplApi21(Context paramContext, String paramString, VersionedParcelable paramVersionedParcelable, Bundle paramBundle)
  {
    paramContext = createFwkMediaSession(paramContext, paramString, paramBundle);
    mSessionFwk = paramContext;
    mToken = new MediaSessionCompat.Token(paramContext.getSessionToken(), new ExtraSession(), paramVersionedParcelable);
    mSessionInfo = paramBundle;
    setFlags(3);
  }
  
  public MediaSessionCompat$MediaSessionImplApi21(Object paramObject)
  {
    if ((paramObject instanceof MediaSession))
    {
      paramObject = (MediaSession)paramObject;
      mSessionFwk = ((MediaSession)paramObject);
      mToken = new MediaSessionCompat.Token(((MediaSession)paramObject).getSessionToken(), new ExtraSession());
      mSessionInfo = null;
      setFlags(3);
      return;
    }
    throw new IllegalArgumentException("mediaSession is not a valid MediaSession object");
  }
  
  public MediaSession createFwkMediaSession(Context paramContext, String paramString, Bundle paramBundle)
  {
    return new MediaSession(paramContext, paramString);
  }
  
  public MediaSessionCompat.Callback getCallback()
  {
    synchronized (mLock)
    {
      MediaSessionCompat.Callback localCallback = mCallback;
      return localCallback;
    }
  }
  
  public String getCallingPackage()
  {
    try
    {
      String str = (String)mSessionFwk.getClass().getMethod("getCallingPackage", new Class[0]).invoke(mSessionFwk, new Object[0]);
      return str;
    }
    catch (Exception localException)
    {
      Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", localException);
    }
    return null;
  }
  
  public MediaSessionManager.RemoteUserInfo getCurrentControllerInfo()
  {
    synchronized (mLock)
    {
      MediaSessionManager.RemoteUserInfo localRemoteUserInfo = mRemoteUserInfo;
      return localRemoteUserInfo;
    }
  }
  
  public Object getMediaSession()
  {
    return mSessionFwk;
  }
  
  public PlaybackStateCompat getPlaybackState()
  {
    return mPlaybackState;
  }
  
  public Object getRemoteControlClient()
  {
    return null;
  }
  
  public MediaSessionCompat.Token getSessionToken()
  {
    return mToken;
  }
  
  public boolean isActive()
  {
    return mSessionFwk.isActive();
  }
  
  public void release()
  {
    mDestroyed = true;
    mExtraControllerCallbacks.kill();
    if (Build.VERSION.SDK_INT == 27) {
      try
      {
        Object localObject = mSessionFwk.getClass().getDeclaredField("mCallback");
        ((AccessibleObject)localObject).setAccessible(true);
        localObject = (Handler)((Field)localObject).get(mSessionFwk);
        if (localObject != null) {
          ((Handler)localObject).removeCallbacksAndMessages(null);
        }
      }
      catch (Exception localException)
      {
        Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", localException);
      }
    }
    mSessionFwk.setCallback(null);
    mSessionFwk.release();
  }
  
  public void sendSessionEvent(String paramString, Bundle paramBundle)
  {
    mSessionFwk.sendSessionEvent(paramString, paramBundle);
  }
  
  public void setActive(boolean paramBoolean)
  {
    mSessionFwk.setActive(paramBoolean);
  }
  
  public void setCallback(MediaSessionCompat.Callback paramCallback, Handler paramHandler)
  {
    synchronized (mLock)
    {
      mCallback = paramCallback;
      MediaSession localMediaSession = mSessionFwk;
      MediaSession.Callback localCallback;
      if (paramCallback == null) {
        localCallback = null;
      } else {
        localCallback = mCallbackFwk;
      }
      localMediaSession.setCallback(localCallback, paramHandler);
      if (paramCallback != null) {
        paramCallback.setSessionImpl(this, paramHandler);
      }
      return;
    }
  }
  
  public void setCaptioningEnabled(boolean paramBoolean)
  {
    if (mCaptioningEnabled != paramBoolean) {
      mCaptioningEnabled = paramBoolean;
    }
    for (;;)
    {
      int i;
      IMediaControllerCallback localIMediaControllerCallback;
      synchronized (mLock)
      {
        i = mExtraControllerCallbacks.beginBroadcast() - 1;
        if (i >= 0) {
          localIMediaControllerCallback = (IMediaControllerCallback)mExtraControllerCallbacks.getBroadcastItem(i);
        }
      }
      try
      {
        localIMediaControllerCallback.onCaptioningEnabledChanged(paramBoolean);
        i--;
        continue;
        mExtraControllerCallbacks.finishBroadcast();
        break label80;
        localObject2 = finally;
        throw ((Throwable)localObject2);
        label80:
        return;
      }
      catch (RemoteException localRemoteException)
      {
        for (;;) {}
      }
    }
  }
  
  public void setCurrentControllerInfo(MediaSessionManager.RemoteUserInfo paramRemoteUserInfo)
  {
    synchronized (mLock)
    {
      mRemoteUserInfo = paramRemoteUserInfo;
      return;
    }
  }
  
  public void setExtras(Bundle paramBundle)
  {
    mSessionFwk.setExtras(paramBundle);
  }
  
  @SuppressLint({"WrongConstant"})
  public void setFlags(int paramInt)
  {
    mSessionFwk.setFlags(paramInt | 0x1 | 0x2);
  }
  
  public void setMediaButtonReceiver(PendingIntent paramPendingIntent)
  {
    mSessionFwk.setMediaButtonReceiver(paramPendingIntent);
  }
  
  public void setMetadata(MediaMetadataCompat paramMediaMetadataCompat)
  {
    mMetadata = paramMediaMetadataCompat;
    MediaSession localMediaSession = mSessionFwk;
    if (paramMediaMetadataCompat == null) {
      paramMediaMetadataCompat = null;
    } else {
      paramMediaMetadataCompat = (MediaMetadata)paramMediaMetadataCompat.getMediaMetadata();
    }
    localMediaSession.setMetadata(paramMediaMetadataCompat);
  }
  
  public void setPlaybackState(PlaybackStateCompat paramPlaybackStateCompat)
  {
    mPlaybackState = paramPlaybackStateCompat;
    for (;;)
    {
      int i;
      IMediaControllerCallback localIMediaControllerCallback;
      synchronized (mLock)
      {
        i = mExtraControllerCallbacks.beginBroadcast() - 1;
        if (i >= 0) {
          localIMediaControllerCallback = (IMediaControllerCallback)mExtraControllerCallbacks.getBroadcastItem(i);
        }
      }
      try
      {
        localIMediaControllerCallback.onPlaybackStateChanged(paramPlaybackStateCompat);
        i--;
        continue;
        mExtraControllerCallbacks.finishBroadcast();
        ??? = mSessionFwk;
        if (paramPlaybackStateCompat == null) {
          paramPlaybackStateCompat = null;
        } else {
          paramPlaybackStateCompat = (PlaybackState)paramPlaybackStateCompat.getPlaybackState();
        }
        ((MediaSession)???).setPlaybackState(paramPlaybackStateCompat);
        return;
        paramPlaybackStateCompat = finally;
        throw paramPlaybackStateCompat;
      }
      catch (RemoteException localRemoteException)
      {
        for (;;) {}
      }
    }
  }
  
  public void setPlaybackToLocal(int paramInt)
  {
    AudioAttributes.Builder localBuilder = new AudioAttributes.Builder();
    localBuilder.setLegacyStreamType(paramInt);
    mSessionFwk.setPlaybackToLocal(localBuilder.build());
  }
  
  public void setPlaybackToRemote(VolumeProviderCompat paramVolumeProviderCompat)
  {
    mSessionFwk.setPlaybackToRemote((VolumeProvider)paramVolumeProviderCompat.getVolumeProvider());
  }
  
  public void setQueue(List<MediaSessionCompat.QueueItem> paramList)
  {
    mQueue = paramList;
    if (paramList == null)
    {
      mSessionFwk.setQueue(null);
      return;
    }
    ArrayList localArrayList = new ArrayList(paramList.size());
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localArrayList.add((MediaSession.QueueItem)((MediaSessionCompat.QueueItem)paramList.next()).getQueueItem());
    }
    mSessionFwk.setQueue(localArrayList);
  }
  
  public void setQueueTitle(CharSequence paramCharSequence)
  {
    mSessionFwk.setQueueTitle(paramCharSequence);
  }
  
  public void setRatingType(int paramInt)
  {
    mRatingType = paramInt;
  }
  
  public void setRegistrationCallback(@Nullable MediaSessionCompat.RegistrationCallback paramRegistrationCallback, @NonNull Handler paramHandler)
  {
    synchronized (mLock)
    {
      MediaSessionCompat.RegistrationCallbackHandler localRegistrationCallbackHandler = mRegistrationCallbackHandler;
      if (localRegistrationCallbackHandler != null) {
        localRegistrationCallbackHandler.removeCallbacksAndMessages(null);
      }
      if (paramRegistrationCallback != null)
      {
        localRegistrationCallbackHandler = new android/support/v4/media/session/MediaSessionCompat$RegistrationCallbackHandler;
        localRegistrationCallbackHandler.<init>(paramHandler.getLooper(), paramRegistrationCallback);
        mRegistrationCallbackHandler = localRegistrationCallbackHandler;
      }
      else
      {
        mRegistrationCallbackHandler = null;
      }
      return;
    }
  }
  
  public void setRepeatMode(int paramInt)
  {
    if (mRepeatMode != paramInt) {
      mRepeatMode = paramInt;
    }
    for (;;)
    {
      int i;
      IMediaControllerCallback localIMediaControllerCallback;
      synchronized (mLock)
      {
        i = mExtraControllerCallbacks.beginBroadcast() - 1;
        if (i >= 0) {
          localIMediaControllerCallback = (IMediaControllerCallback)mExtraControllerCallbacks.getBroadcastItem(i);
        }
      }
      try
      {
        localIMediaControllerCallback.onRepeatModeChanged(paramInt);
        i--;
        continue;
        mExtraControllerCallbacks.finishBroadcast();
        break label80;
        localObject2 = finally;
        throw ((Throwable)localObject2);
        label80:
        return;
      }
      catch (RemoteException localRemoteException)
      {
        for (;;) {}
      }
    }
  }
  
  public void setSessionActivity(PendingIntent paramPendingIntent)
  {
    mSessionFwk.setSessionActivity(paramPendingIntent);
  }
  
  public void setShuffleMode(int paramInt)
  {
    if (mShuffleMode != paramInt) {
      mShuffleMode = paramInt;
    }
    for (;;)
    {
      int i;
      IMediaControllerCallback localIMediaControllerCallback;
      synchronized (mLock)
      {
        i = mExtraControllerCallbacks.beginBroadcast() - 1;
        if (i >= 0) {
          localIMediaControllerCallback = (IMediaControllerCallback)mExtraControllerCallbacks.getBroadcastItem(i);
        }
      }
      try
      {
        localIMediaControllerCallback.onShuffleModeChanged(paramInt);
        i--;
        continue;
        mExtraControllerCallbacks.finishBroadcast();
        break label80;
        localObject2 = finally;
        throw ((Throwable)localObject2);
        label80:
        return;
      }
      catch (RemoteException localRemoteException)
      {
        for (;;) {}
      }
    }
  }
  
  public class ExtraSession
    extends IMediaSession.Stub
  {
    public ExtraSession() {}
    
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
      MediaSessionCompat.MediaSessionImplApi21 localMediaSessionImplApi21 = MediaSessionCompat.MediaSessionImplApi21.this;
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
      return mRatingType;
    }
    
    public int getRepeatMode()
    {
      return mRepeatMode;
    }
    
    public Bundle getSessionInfo()
    {
      Bundle localBundle;
      if (mSessionInfo == null) {
        localBundle = null;
      } else {
        localBundle = new Bundle(mSessionInfo);
      }
      return localBundle;
    }
    
    public int getShuffleMode()
    {
      return mShuffleMode;
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
      return mCaptioningEnabled;
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
      if (mDestroyed) {
        return;
      }
      int i = Binder.getCallingPid();
      int j = Binder.getCallingUid();
      Object localObject1 = new MediaSessionManager.RemoteUserInfo("android.media.session.MediaController", i, j);
      mExtraControllerCallbacks.register(???, localObject1);
      synchronized (mLock)
      {
        localObject1 = mRegistrationCallbackHandler;
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
      mExtraControllerCallbacks.unregister(???);
      int i = Binder.getCallingPid();
      int j = Binder.getCallingUid();
      synchronized (mLock)
      {
        MediaSessionCompat.RegistrationCallbackHandler localRegistrationCallbackHandler = mRegistrationCallbackHandler;
        if (localRegistrationCallbackHandler != null) {
          localRegistrationCallbackHandler.postCallbackUnregistered(i, j);
        }
        return;
      }
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */