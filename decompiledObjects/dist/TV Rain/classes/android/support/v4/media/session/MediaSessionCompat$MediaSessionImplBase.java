package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.media.RemoteControlClient;
import android.media.RemoteControlClient.MetadataEditor;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.MediaMetadataCompat.Builder;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media.MediaSessionManager.RemoteUserInfo;
import androidx.media.VolumeProviderCompat;
import androidx.media.VolumeProviderCompat.Callback;
import androidx.versionedparcelable.VersionedParcelable;
import java.util.List;

class MediaSessionCompat$MediaSessionImplBase
  implements MediaSessionCompat.MediaSessionImpl
{
  public static final int RCC_PLAYSTATE_NONE = 0;
  public final AudioManager mAudioManager;
  public volatile MediaSessionCompat.Callback mCallback;
  public boolean mCaptioningEnabled;
  private final Context mContext;
  public final RemoteCallbackList<IMediaControllerCallback> mControllerCallbacks = new RemoteCallbackList();
  public boolean mDestroyed = false;
  public Bundle mExtras;
  public int mFlags = 3;
  private MessageHandler mHandler;
  public boolean mIsActive = false;
  public int mLocalStream;
  public final Object mLock = new Object();
  private final ComponentName mMediaButtonReceiverComponentName;
  private final PendingIntent mMediaButtonReceiverIntent;
  public MediaMetadataCompat mMetadata;
  public final String mPackageName;
  public List<MediaSessionCompat.QueueItem> mQueue;
  public CharSequence mQueueTitle;
  public int mRatingType;
  public final RemoteControlClient mRcc;
  public MediaSessionCompat.RegistrationCallbackHandler mRegistrationCallbackHandler;
  private MediaSessionManager.RemoteUserInfo mRemoteUserInfo;
  public int mRepeatMode;
  public PendingIntent mSessionActivity;
  public final Bundle mSessionInfo;
  public int mShuffleMode;
  public PlaybackStateCompat mState;
  private final MediaSessionStub mStub;
  public final String mTag;
  private final MediaSessionCompat.Token mToken;
  private VolumeProviderCompat.Callback mVolumeCallback = new VolumeProviderCompat.Callback()
  {
    public void onVolumeChanged(VolumeProviderCompat paramAnonymousVolumeProviderCompat)
    {
      if (mVolumeProvider != paramAnonymousVolumeProviderCompat) {
        return;
      }
      MediaSessionCompat.MediaSessionImplBase localMediaSessionImplBase = MediaSessionCompat.MediaSessionImplBase.this;
      paramAnonymousVolumeProviderCompat = new ParcelableVolumeInfo(mVolumeType, mLocalStream, paramAnonymousVolumeProviderCompat.getVolumeControl(), paramAnonymousVolumeProviderCompat.getMaxVolume(), paramAnonymousVolumeProviderCompat.getCurrentVolume());
      sendVolumeInfoChanged(paramAnonymousVolumeProviderCompat);
    }
  };
  public VolumeProviderCompat mVolumeProvider;
  public int mVolumeType;
  
  public MediaSessionCompat$MediaSessionImplBase(Context paramContext, String paramString, ComponentName paramComponentName, PendingIntent paramPendingIntent, VersionedParcelable paramVersionedParcelable, Bundle paramBundle)
  {
    if (paramComponentName != null)
    {
      mContext = paramContext;
      mPackageName = paramContext.getPackageName();
      mSessionInfo = paramBundle;
      mAudioManager = ((AudioManager)paramContext.getSystemService("audio"));
      mTag = paramString;
      mMediaButtonReceiverComponentName = paramComponentName;
      mMediaButtonReceiverIntent = paramPendingIntent;
      paramContext = new MediaSessionStub();
      mStub = paramContext;
      mToken = new MediaSessionCompat.Token(paramContext, null, paramVersionedParcelable);
      mRatingType = 0;
      mVolumeType = 1;
      mLocalStream = 3;
      mRcc = new RemoteControlClient(paramPendingIntent);
      return;
    }
    throw new IllegalArgumentException("MediaButtonReceiver component may not be null");
  }
  
  private void sendCaptioningEnabled(boolean paramBoolean)
  {
    for (;;)
    {
      int i;
      IMediaControllerCallback localIMediaControllerCallback;
      synchronized (mLock)
      {
        i = mControllerCallbacks.beginBroadcast() - 1;
        if (i >= 0) {
          localIMediaControllerCallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
        }
      }
      try
      {
        localIMediaControllerCallback.onCaptioningEnabledChanged(paramBoolean);
        i--;
        continue;
        mControllerCallbacks.finishBroadcast();
        return;
        localObject2 = finally;
        throw ((Throwable)localObject2);
      }
      catch (RemoteException localRemoteException)
      {
        for (;;) {}
      }
    }
  }
  
  private void sendEvent(String paramString, Bundle paramBundle)
  {
    for (;;)
    {
      int i;
      IMediaControllerCallback localIMediaControllerCallback;
      synchronized (mLock)
      {
        i = mControllerCallbacks.beginBroadcast() - 1;
        if (i >= 0) {
          localIMediaControllerCallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
        }
      }
      try
      {
        localIMediaControllerCallback.onEvent(paramString, paramBundle);
        i--;
        continue;
        mControllerCallbacks.finishBroadcast();
        return;
        paramString = finally;
        throw paramString;
      }
      catch (RemoteException localRemoteException)
      {
        for (;;) {}
      }
    }
  }
  
  private void sendExtras(Bundle paramBundle)
  {
    for (;;)
    {
      int i;
      IMediaControllerCallback localIMediaControllerCallback;
      synchronized (mLock)
      {
        i = mControllerCallbacks.beginBroadcast() - 1;
        if (i >= 0) {
          localIMediaControllerCallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
        }
      }
      try
      {
        localIMediaControllerCallback.onExtrasChanged(paramBundle);
        i--;
        continue;
        mControllerCallbacks.finishBroadcast();
        return;
        paramBundle = finally;
        throw paramBundle;
      }
      catch (RemoteException localRemoteException)
      {
        for (;;) {}
      }
    }
  }
  
  private void sendMetadata(MediaMetadataCompat paramMediaMetadataCompat)
  {
    for (;;)
    {
      int i;
      IMediaControllerCallback localIMediaControllerCallback;
      synchronized (mLock)
      {
        i = mControllerCallbacks.beginBroadcast() - 1;
        if (i >= 0) {
          localIMediaControllerCallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
        }
      }
      try
      {
        localIMediaControllerCallback.onMetadataChanged(paramMediaMetadataCompat);
        i--;
        continue;
        mControllerCallbacks.finishBroadcast();
        return;
        paramMediaMetadataCompat = finally;
        throw paramMediaMetadataCompat;
      }
      catch (RemoteException localRemoteException)
      {
        for (;;) {}
      }
    }
  }
  
  private void sendQueue(List<MediaSessionCompat.QueueItem> paramList)
  {
    for (;;)
    {
      int i;
      IMediaControllerCallback localIMediaControllerCallback;
      synchronized (mLock)
      {
        i = mControllerCallbacks.beginBroadcast() - 1;
        if (i >= 0) {
          localIMediaControllerCallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
        }
      }
      try
      {
        localIMediaControllerCallback.onQueueChanged(paramList);
        i--;
        continue;
        mControllerCallbacks.finishBroadcast();
        return;
        paramList = finally;
        throw paramList;
      }
      catch (RemoteException localRemoteException)
      {
        for (;;) {}
      }
    }
  }
  
  private void sendQueueTitle(CharSequence paramCharSequence)
  {
    for (;;)
    {
      int i;
      IMediaControllerCallback localIMediaControllerCallback;
      synchronized (mLock)
      {
        i = mControllerCallbacks.beginBroadcast() - 1;
        if (i >= 0) {
          localIMediaControllerCallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
        }
      }
      try
      {
        localIMediaControllerCallback.onQueueTitleChanged(paramCharSequence);
        i--;
        continue;
        mControllerCallbacks.finishBroadcast();
        return;
        paramCharSequence = finally;
        throw paramCharSequence;
      }
      catch (RemoteException localRemoteException)
      {
        for (;;) {}
      }
    }
  }
  
  private void sendRepeatMode(int paramInt)
  {
    for (;;)
    {
      int i;
      IMediaControllerCallback localIMediaControllerCallback;
      synchronized (mLock)
      {
        i = mControllerCallbacks.beginBroadcast() - 1;
        if (i >= 0) {
          localIMediaControllerCallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
        }
      }
      try
      {
        localIMediaControllerCallback.onRepeatModeChanged(paramInt);
        i--;
        continue;
        mControllerCallbacks.finishBroadcast();
        return;
        localObject2 = finally;
        throw ((Throwable)localObject2);
      }
      catch (RemoteException localRemoteException)
      {
        for (;;) {}
      }
    }
  }
  
  private void sendSessionDestroyed()
  {
    for (;;)
    {
      int i;
      IMediaControllerCallback localIMediaControllerCallback;
      synchronized (mLock)
      {
        i = mControllerCallbacks.beginBroadcast() - 1;
        if (i >= 0) {
          localIMediaControllerCallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
        }
      }
      try
      {
        localIMediaControllerCallback.onSessionDestroyed();
        i--;
        continue;
        mControllerCallbacks.finishBroadcast();
        mControllerCallbacks.kill();
        return;
        localObject2 = finally;
        throw ((Throwable)localObject2);
      }
      catch (RemoteException localRemoteException)
      {
        for (;;) {}
      }
    }
  }
  
  private void sendShuffleMode(int paramInt)
  {
    for (;;)
    {
      int i;
      IMediaControllerCallback localIMediaControllerCallback;
      synchronized (mLock)
      {
        i = mControllerCallbacks.beginBroadcast() - 1;
        if (i >= 0) {
          localIMediaControllerCallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
        }
      }
      try
      {
        localIMediaControllerCallback.onShuffleModeChanged(paramInt);
        i--;
        continue;
        mControllerCallbacks.finishBroadcast();
        return;
        localObject2 = finally;
        throw ((Throwable)localObject2);
      }
      catch (RemoteException localRemoteException)
      {
        for (;;) {}
      }
    }
  }
  
  private void sendState(PlaybackStateCompat paramPlaybackStateCompat)
  {
    for (;;)
    {
      int i;
      IMediaControllerCallback localIMediaControllerCallback;
      synchronized (mLock)
      {
        i = mControllerCallbacks.beginBroadcast() - 1;
        if (i >= 0) {
          localIMediaControllerCallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
        }
      }
      try
      {
        localIMediaControllerCallback.onPlaybackStateChanged(paramPlaybackStateCompat);
        i--;
        continue;
        mControllerCallbacks.finishBroadcast();
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
  
  public void adjustVolume(int paramInt1, int paramInt2)
  {
    if (mVolumeType == 2)
    {
      VolumeProviderCompat localVolumeProviderCompat = mVolumeProvider;
      if (localVolumeProviderCompat != null) {
        localVolumeProviderCompat.onAdjustVolume(paramInt1);
      }
    }
    else
    {
      mAudioManager.adjustStreamVolume(mLocalStream, paramInt1, paramInt2);
    }
  }
  
  public RemoteControlClient.MetadataEditor buildRccMetadata(Bundle paramBundle)
  {
    RemoteControlClient.MetadataEditor localMetadataEditor = mRcc.editMetadata(true);
    if (paramBundle == null) {
      return localMetadataEditor;
    }
    Bitmap localBitmap1;
    Bitmap localBitmap2;
    if (paramBundle.containsKey("android.media.metadata.ART"))
    {
      localBitmap1 = (Bitmap)paramBundle.getParcelable("android.media.metadata.ART");
      localBitmap2 = localBitmap1;
      if (localBitmap1 != null) {
        localBitmap2 = localBitmap1.copy(localBitmap1.getConfig(), false);
      }
      localMetadataEditor.putBitmap(100, localBitmap2);
    }
    else if (paramBundle.containsKey("android.media.metadata.ALBUM_ART"))
    {
      localBitmap1 = (Bitmap)paramBundle.getParcelable("android.media.metadata.ALBUM_ART");
      localBitmap2 = localBitmap1;
      if (localBitmap1 != null) {
        localBitmap2 = localBitmap1.copy(localBitmap1.getConfig(), false);
      }
      localMetadataEditor.putBitmap(100, localBitmap2);
    }
    if (paramBundle.containsKey("android.media.metadata.ALBUM")) {
      localMetadataEditor.putString(1, paramBundle.getString("android.media.metadata.ALBUM"));
    }
    if (paramBundle.containsKey("android.media.metadata.ALBUM_ARTIST")) {
      localMetadataEditor.putString(13, paramBundle.getString("android.media.metadata.ALBUM_ARTIST"));
    }
    if (paramBundle.containsKey("android.media.metadata.ARTIST")) {
      localMetadataEditor.putString(2, paramBundle.getString("android.media.metadata.ARTIST"));
    }
    if (paramBundle.containsKey("android.media.metadata.AUTHOR")) {
      localMetadataEditor.putString(3, paramBundle.getString("android.media.metadata.AUTHOR"));
    }
    if (paramBundle.containsKey("android.media.metadata.COMPILATION")) {
      localMetadataEditor.putString(15, paramBundle.getString("android.media.metadata.COMPILATION"));
    }
    if (paramBundle.containsKey("android.media.metadata.COMPOSER")) {
      localMetadataEditor.putString(4, paramBundle.getString("android.media.metadata.COMPOSER"));
    }
    if (paramBundle.containsKey("android.media.metadata.DATE")) {
      localMetadataEditor.putString(5, paramBundle.getString("android.media.metadata.DATE"));
    }
    if (paramBundle.containsKey("android.media.metadata.DISC_NUMBER")) {
      localMetadataEditor.putLong(14, paramBundle.getLong("android.media.metadata.DISC_NUMBER"));
    }
    if (paramBundle.containsKey("android.media.metadata.DURATION")) {
      localMetadataEditor.putLong(9, paramBundle.getLong("android.media.metadata.DURATION"));
    }
    if (paramBundle.containsKey("android.media.metadata.GENRE")) {
      localMetadataEditor.putString(6, paramBundle.getString("android.media.metadata.GENRE"));
    }
    if (paramBundle.containsKey("android.media.metadata.TITLE")) {
      localMetadataEditor.putString(7, paramBundle.getString("android.media.metadata.TITLE"));
    }
    if (paramBundle.containsKey("android.media.metadata.TRACK_NUMBER")) {
      localMetadataEditor.putLong(0, paramBundle.getLong("android.media.metadata.TRACK_NUMBER"));
    }
    if (paramBundle.containsKey("android.media.metadata.WRITER")) {
      localMetadataEditor.putString(11, paramBundle.getString("android.media.metadata.WRITER"));
    }
    return localMetadataEditor;
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
    return null;
  }
  
  public String getPackageNameForUid(int paramInt)
  {
    String str1 = mContext.getPackageManager().getNameForUid(paramInt);
    String str2 = str1;
    if (TextUtils.isEmpty(str1)) {
      str2 = "android.media.session.MediaController";
    }
    return str2;
  }
  
  public PlaybackStateCompat getPlaybackState()
  {
    synchronized (mLock)
    {
      PlaybackStateCompat localPlaybackStateCompat = mState;
      return localPlaybackStateCompat;
    }
  }
  
  public int getRccStateFromState(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return -1;
    case 10: 
    case 11: 
      return 6;
    case 9: 
      return 7;
    case 7: 
      return 9;
    case 6: 
    case 8: 
      return 8;
    case 5: 
      return 5;
    case 4: 
      return 4;
    case 3: 
      return 3;
    case 2: 
      return 2;
    case 1: 
      return 1;
    }
    return 0;
  }
  
  public int getRccTransportControlFlagsFromActions(long paramLong)
  {
    if ((1L & paramLong) != 0L) {
      i = 32;
    } else {
      i = 0;
    }
    int j = i;
    if ((0x2 & paramLong) != 0L) {
      j = i | 0x10;
    }
    int k = j;
    if ((0x4 & paramLong) != 0L) {
      k = j | 0x4;
    }
    int i = k;
    if ((0x8 & paramLong) != 0L) {
      i = k | 0x2;
    }
    j = i;
    if ((0x10 & paramLong) != 0L) {
      j = i | 0x1;
    }
    i = j;
    if ((0x20 & paramLong) != 0L) {
      i = j | 0x80;
    }
    j = i;
    if ((0x40 & paramLong) != 0L) {
      j = i | 0x40;
    }
    i = j;
    if ((paramLong & 0x200) != 0L) {
      i = j | 0x8;
    }
    return i;
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
    return mIsActive;
  }
  
  public void postToHandler(int paramInt1, int paramInt2, int paramInt3, Object paramObject, Bundle paramBundle)
  {
    synchronized (mLock)
    {
      Object localObject2 = mHandler;
      if (localObject2 != null)
      {
        localObject2 = ((Handler)localObject2).obtainMessage(paramInt1, paramInt2, paramInt3, paramObject);
        paramObject = new android/os/Bundle;
        ((Bundle)paramObject).<init>();
        paramInt1 = Binder.getCallingUid();
        ((BaseBundle)paramObject).putInt("data_calling_uid", paramInt1);
        ((BaseBundle)paramObject).putString("data_calling_pkg", getPackageNameForUid(paramInt1));
        paramInt1 = Binder.getCallingPid();
        if (paramInt1 > 0) {
          ((BaseBundle)paramObject).putInt("data_calling_pid", paramInt1);
        } else {
          ((BaseBundle)paramObject).putInt("data_calling_pid", -1);
        }
        if (paramBundle != null) {
          ((Bundle)paramObject).putBundle("data_extras", paramBundle);
        }
        ((Message)localObject2).setData((Bundle)paramObject);
        ((Message)localObject2).sendToTarget();
      }
      return;
    }
  }
  
  public void registerMediaButtonEventReceiver(PendingIntent paramPendingIntent, ComponentName paramComponentName)
  {
    mAudioManager.registerMediaButtonEventReceiver(paramComponentName);
  }
  
  public void release()
  {
    mIsActive = false;
    mDestroyed = true;
    updateMbrAndRcc();
    sendSessionDestroyed();
    setCallback(null, null);
  }
  
  public void sendSessionEvent(String paramString, Bundle paramBundle)
  {
    sendEvent(paramString, paramBundle);
  }
  
  public void sendVolumeInfoChanged(ParcelableVolumeInfo paramParcelableVolumeInfo)
  {
    for (;;)
    {
      int i;
      IMediaControllerCallback localIMediaControllerCallback;
      synchronized (mLock)
      {
        i = mControllerCallbacks.beginBroadcast() - 1;
        if (i >= 0) {
          localIMediaControllerCallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
        }
      }
      try
      {
        localIMediaControllerCallback.onVolumeInfoChanged(paramParcelableVolumeInfo);
        i--;
        continue;
        mControllerCallbacks.finishBroadcast();
        return;
        paramParcelableVolumeInfo = finally;
        throw paramParcelableVolumeInfo;
      }
      catch (RemoteException localRemoteException)
      {
        for (;;) {}
      }
    }
  }
  
  public void setActive(boolean paramBoolean)
  {
    if (paramBoolean == mIsActive) {
      return;
    }
    mIsActive = paramBoolean;
    updateMbrAndRcc();
  }
  
  public void setCallback(MediaSessionCompat.Callback paramCallback, Handler paramHandler)
  {
    synchronized (mLock)
    {
      MessageHandler localMessageHandler = mHandler;
      if (localMessageHandler != null) {
        localMessageHandler.removeCallbacksAndMessages(null);
      }
      if ((paramCallback != null) && (paramHandler != null)) {
        localMessageHandler = new MessageHandler(paramHandler.getLooper());
      } else {
        localMessageHandler = null;
      }
      mHandler = localMessageHandler;
      if ((mCallback != paramCallback) && (mCallback != null)) {
        mCallback.setSessionImpl(null, null);
      }
      mCallback = paramCallback;
      if (mCallback != null) {
        mCallback.setSessionImpl(this, paramHandler);
      }
      return;
    }
  }
  
  public void setCaptioningEnabled(boolean paramBoolean)
  {
    if (mCaptioningEnabled != paramBoolean)
    {
      mCaptioningEnabled = paramBoolean;
      sendCaptioningEnabled(paramBoolean);
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
    mExtras = paramBundle;
    sendExtras(paramBundle);
  }
  
  public void setFlags(int paramInt)
  {
    synchronized (mLock)
    {
      mFlags = (paramInt | 0x1 | 0x2);
      return;
    }
  }
  
  public void setMediaButtonReceiver(PendingIntent paramPendingIntent) {}
  
  public void setMetadata(MediaMetadataCompat arg1)
  {
    MediaMetadataCompat localMediaMetadataCompat = ???;
    if (??? != null) {
      localMediaMetadataCompat = new MediaMetadataCompat.Builder(???, MediaSessionCompat.sMaxBitmapSize).build();
    }
    synchronized (mLock)
    {
      mMetadata = localMediaMetadataCompat;
      sendMetadata(localMediaMetadataCompat);
      if (!mIsActive) {
        return;
      }
      if (localMediaMetadataCompat == null) {
        ??? = null;
      } else {
        ??? = localMediaMetadataCompat.getBundle();
      }
      buildRccMetadata(???).apply();
      return;
    }
  }
  
  public void setPlaybackState(PlaybackStateCompat paramPlaybackStateCompat)
  {
    synchronized (mLock)
    {
      mState = paramPlaybackStateCompat;
      sendState(paramPlaybackStateCompat);
      if (!mIsActive) {
        return;
      }
      if (paramPlaybackStateCompat == null)
      {
        mRcc.setPlaybackState(0);
        mRcc.setTransportControlFlags(0);
      }
      else
      {
        setRccState(paramPlaybackStateCompat);
        mRcc.setTransportControlFlags(getRccTransportControlFlagsFromActions(paramPlaybackStateCompat.getActions()));
      }
      return;
    }
  }
  
  public void setPlaybackToLocal(int paramInt)
  {
    VolumeProviderCompat localVolumeProviderCompat = mVolumeProvider;
    if (localVolumeProviderCompat != null) {
      localVolumeProviderCompat.setCallback(null);
    }
    mLocalStream = paramInt;
    mVolumeType = 1;
    int i = mVolumeType;
    paramInt = mLocalStream;
    sendVolumeInfoChanged(new ParcelableVolumeInfo(i, paramInt, 2, mAudioManager.getStreamMaxVolume(paramInt), mAudioManager.getStreamVolume(mLocalStream)));
  }
  
  public void setPlaybackToRemote(VolumeProviderCompat paramVolumeProviderCompat)
  {
    if (paramVolumeProviderCompat != null)
    {
      VolumeProviderCompat localVolumeProviderCompat = mVolumeProvider;
      if (localVolumeProviderCompat != null) {
        localVolumeProviderCompat.setCallback(null);
      }
      mVolumeType = 2;
      mVolumeProvider = paramVolumeProviderCompat;
      sendVolumeInfoChanged(new ParcelableVolumeInfo(mVolumeType, mLocalStream, mVolumeProvider.getVolumeControl(), mVolumeProvider.getMaxVolume(), mVolumeProvider.getCurrentVolume()));
      paramVolumeProviderCompat.setCallback(mVolumeCallback);
      return;
    }
    throw new IllegalArgumentException("volumeProvider may not be null");
  }
  
  public void setQueue(List<MediaSessionCompat.QueueItem> paramList)
  {
    mQueue = paramList;
    sendQueue(paramList);
  }
  
  public void setQueueTitle(CharSequence paramCharSequence)
  {
    mQueueTitle = paramCharSequence;
    sendQueueTitle(paramCharSequence);
  }
  
  public void setRatingType(int paramInt)
  {
    mRatingType = paramInt;
  }
  
  public void setRccState(PlaybackStateCompat paramPlaybackStateCompat)
  {
    mRcc.setPlaybackState(getRccStateFromState(paramPlaybackStateCompat.getState()));
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
    if (mRepeatMode != paramInt)
    {
      mRepeatMode = paramInt;
      sendRepeatMode(paramInt);
    }
  }
  
  public void setSessionActivity(PendingIntent paramPendingIntent)
  {
    synchronized (mLock)
    {
      mSessionActivity = paramPendingIntent;
      return;
    }
  }
  
  public void setShuffleMode(int paramInt)
  {
    if (mShuffleMode != paramInt)
    {
      mShuffleMode = paramInt;
      sendShuffleMode(paramInt);
    }
  }
  
  public void setVolumeTo(int paramInt1, int paramInt2)
  {
    if (mVolumeType == 2)
    {
      VolumeProviderCompat localVolumeProviderCompat = mVolumeProvider;
      if (localVolumeProviderCompat != null) {
        localVolumeProviderCompat.onSetVolumeTo(paramInt1);
      }
    }
    else
    {
      mAudioManager.setStreamVolume(mLocalStream, paramInt1, paramInt2);
    }
  }
  
  public void unregisterMediaButtonEventReceiver(PendingIntent paramPendingIntent, ComponentName paramComponentName)
  {
    mAudioManager.unregisterMediaButtonEventReceiver(paramComponentName);
  }
  
  public void updateMbrAndRcc()
  {
    if (mIsActive)
    {
      registerMediaButtonEventReceiver(mMediaButtonReceiverIntent, mMediaButtonReceiverComponentName);
      mAudioManager.registerRemoteControlClient(mRcc);
      setMetadata(mMetadata);
      setPlaybackState(mState);
    }
    else
    {
      unregisterMediaButtonEventReceiver(mMediaButtonReceiverIntent, mMediaButtonReceiverComponentName);
      mRcc.setPlaybackState(0);
      mAudioManager.unregisterRemoteControlClient(mRcc);
    }
  }
  
  public static final class Command
  {
    public final String command;
    public final Bundle extras;
    public final ResultReceiver stub;
    
    public Command(String paramString, Bundle paramBundle, ResultReceiver paramResultReceiver)
    {
      command = paramString;
      extras = paramBundle;
      stub = paramResultReceiver;
    }
  }
  
  public class MediaSessionStub
    extends IMediaSession.Stub
  {
    public MediaSessionStub() {}
    
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
      adjustVolume(paramInt1, paramInt2);
    }
    
    public void fastForward()
      throws RemoteException
    {
      postToHandler(16);
    }
    
    public Bundle getExtras()
    {
      synchronized (mLock)
      {
        Bundle localBundle = mExtras;
        return localBundle;
      }
    }
    
    public long getFlags()
    {
      synchronized (mLock)
      {
        long l = mFlags;
        return l;
      }
    }
    
    public PendingIntent getLaunchPendingIntent()
    {
      synchronized (mLock)
      {
        PendingIntent localPendingIntent = mSessionActivity;
        return localPendingIntent;
      }
    }
    
    public MediaMetadataCompat getMetadata()
    {
      return mMetadata;
    }
    
    public String getPackageName()
    {
      return mPackageName;
    }
    
    public PlaybackStateCompat getPlaybackState()
    {
      synchronized (mLock)
      {
        Object localObject2 = MediaSessionCompat.MediaSessionImplBase.this;
        PlaybackStateCompat localPlaybackStateCompat = mState;
        localObject2 = mMetadata;
        return MediaSessionCompat.getStateWithUpdatedPosition(localPlaybackStateCompat, (MediaMetadataCompat)localObject2);
      }
    }
    
    public List<MediaSessionCompat.QueueItem> getQueue()
    {
      synchronized (mLock)
      {
        List localList = mQueue;
        return localList;
      }
    }
    
    public CharSequence getQueueTitle()
    {
      return mQueueTitle;
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
      return mTag;
    }
    
    public ParcelableVolumeInfo getVolumeAttributes()
    {
      synchronized (mLock)
      {
        MediaSessionCompat.MediaSessionImplBase localMediaSessionImplBase = MediaSessionCompat.MediaSessionImplBase.this;
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
          n = mAudioManager.getStreamVolume(j);
        }
        return new ParcelableVolumeInfo(i, j, k, m, n);
      }
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
      postToHandler(paramInt, 0, 0, null, null);
    }
    
    public void postToHandler(int paramInt1, int paramInt2)
    {
      postToHandler(paramInt1, paramInt2, 0, null, null);
    }
    
    public void postToHandler(int paramInt1, int paramInt2, int paramInt3)
    {
      postToHandler(paramInt1, paramInt2, paramInt3, null, null);
    }
    
    public void postToHandler(int paramInt, Object paramObject)
    {
      postToHandler(paramInt, 0, 0, paramObject, null);
    }
    
    public void postToHandler(int paramInt1, Object paramObject, int paramInt2)
    {
      postToHandler(paramInt1, paramInt2, 0, paramObject, null);
    }
    
    public void postToHandler(int paramInt, Object paramObject, Bundle paramBundle)
    {
      postToHandler(paramInt, 0, 0, paramObject, paramBundle);
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
      if (mDestroyed) {}
      try
      {
        ???.onSessionDestroyed();
        return;
        int i = Binder.getCallingPid();
        int j = Binder.getCallingUid();
        Object localObject1 = new MediaSessionManager.RemoteUserInfo(getPackageNameForUid(j), i, j);
        mControllerCallbacks.register(???, localObject1);
        synchronized (mLock)
        {
          localObject1 = mRegistrationCallbackHandler;
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
      setVolumeTo(paramInt1, paramInt2);
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
      mControllerCallbacks.unregister(???);
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
  
  public class MessageHandler
    extends Handler
  {
    private static final int KEYCODE_MEDIA_PAUSE = 127;
    private static final int KEYCODE_MEDIA_PLAY = 126;
    private static final int MSG_ADD_QUEUE_ITEM = 25;
    private static final int MSG_ADD_QUEUE_ITEM_AT = 26;
    private static final int MSG_ADJUST_VOLUME = 2;
    private static final int MSG_COMMAND = 1;
    private static final int MSG_CUSTOM_ACTION = 20;
    private static final int MSG_FAST_FORWARD = 16;
    private static final int MSG_MEDIA_BUTTON = 21;
    private static final int MSG_NEXT = 14;
    private static final int MSG_PAUSE = 12;
    private static final int MSG_PLAY = 7;
    private static final int MSG_PLAY_MEDIA_ID = 8;
    private static final int MSG_PLAY_SEARCH = 9;
    private static final int MSG_PLAY_URI = 10;
    private static final int MSG_PREPARE = 3;
    private static final int MSG_PREPARE_MEDIA_ID = 4;
    private static final int MSG_PREPARE_SEARCH = 5;
    private static final int MSG_PREPARE_URI = 6;
    private static final int MSG_PREVIOUS = 15;
    private static final int MSG_RATE = 19;
    private static final int MSG_RATE_EXTRA = 31;
    private static final int MSG_REMOVE_QUEUE_ITEM = 27;
    private static final int MSG_REMOVE_QUEUE_ITEM_AT = 28;
    private static final int MSG_REWIND = 17;
    private static final int MSG_SEEK_TO = 18;
    private static final int MSG_SET_CAPTIONING_ENABLED = 29;
    private static final int MSG_SET_PLAYBACK_SPEED = 32;
    private static final int MSG_SET_REPEAT_MODE = 23;
    private static final int MSG_SET_SHUFFLE_MODE = 30;
    private static final int MSG_SET_VOLUME = 22;
    private static final int MSG_SKIP_TO_ITEM = 11;
    private static final int MSG_STOP = 13;
    
    public MessageHandler(Looper paramLooper)
    {
      super();
    }
    
    private void onMediaButtonEvent(KeyEvent paramKeyEvent, MediaSessionCompat.Callback paramCallback)
    {
      if ((paramKeyEvent != null) && (paramKeyEvent.getAction() == 0))
      {
        PlaybackStateCompat localPlaybackStateCompat = mState;
        long l;
        if (localPlaybackStateCompat == null) {
          l = 0L;
        } else {
          l = localPlaybackStateCompat.getActions();
        }
        int i = paramKeyEvent.getKeyCode();
        if (i != 79)
        {
          if (i != 126) {
            if (i == 127) {}
          }
          switch (i)
          {
          default: 
            break;
          case 90: 
            if ((l & 0x40) == 0L) {
              break;
            }
            paramCallback.onFastForward();
            break;
          case 89: 
            if ((l & 0x8) == 0L) {
              break;
            }
            paramCallback.onRewind();
            break;
          case 88: 
            if ((l & 0x10) == 0L) {
              break;
            }
            paramCallback.onSkipToPrevious();
            break;
          case 87: 
            if ((l & 0x20) == 0L) {
              break;
            }
            paramCallback.onSkipToNext();
            break;
          case 86: 
            if ((l & 1L) == 0L) {
              break;
            }
            paramCallback.onStop();
            break;
            if ((l & 0x2) == 0L) {
              break;
            }
            paramCallback.onPause();
            break;
            if ((l & 0x4) == 0L) {
              break;
            }
            paramCallback.onPlay();
            break;
          }
        }
        else
        {
          Log.w("MediaSessionCompat", "KEYCODE_MEDIA_PLAY_PAUSE and KEYCODE_HEADSETHOOK are handled already");
        }
      }
    }
    
    public void handleMessage(Message paramMessage)
    {
      MediaSessionCompat.Callback localCallback = mCallback;
      if (localCallback == null) {
        return;
      }
      Object localObject = paramMessage.getData();
      MediaSessionCompat.ensureClassLoader((Bundle)localObject);
      setCurrentControllerInfo(new MediaSessionManager.RemoteUserInfo(((BaseBundle)localObject).getString("data_calling_pkg"), ((BaseBundle)localObject).getInt("data_calling_pid"), ((BaseBundle)localObject).getInt("data_calling_uid")));
      localObject = ((Bundle)localObject).getBundle("data_extras");
      MediaSessionCompat.ensureClassLoader((Bundle)localObject);
      try
      {
        switch (what)
        {
        case 24: 
        default: 
          break;
        case 32: 
          localCallback.onSetPlaybackSpeed(((Float)obj).floatValue());
          break;
        case 31: 
          localCallback.onSetRating((RatingCompat)obj, (Bundle)localObject);
          break;
        case 30: 
          localCallback.onSetShuffleMode(arg1);
          break;
        case 29: 
          localCallback.onSetCaptioningEnabled(((Boolean)obj).booleanValue());
          break;
        case 28: 
          localObject = mQueue;
          if (localObject != null)
          {
            int i = arg1;
            if ((i >= 0) && (i < ((List)localObject).size())) {
              paramMessage = (MediaSessionCompat.QueueItem)mQueue.get(arg1);
            } else {
              paramMessage = null;
            }
            if (paramMessage != null) {
              localCallback.onRemoveQueueItem(paramMessage.getDescription());
            }
          }
          break;
        case 27: 
          localCallback.onRemoveQueueItem((MediaDescriptionCompat)obj);
          break;
        case 26: 
          localCallback.onAddQueueItem((MediaDescriptionCompat)obj, arg1);
          break;
        case 25: 
          localCallback.onAddQueueItem((MediaDescriptionCompat)obj);
          break;
        case 23: 
          localCallback.onSetRepeatMode(arg1);
          break;
        case 22: 
          setVolumeTo(arg1, 0);
          break;
        case 21: 
          localObject = (KeyEvent)obj;
          paramMessage = new android/content/Intent;
          paramMessage.<init>("android.intent.action.MEDIA_BUTTON");
          paramMessage.putExtra("android.intent.extra.KEY_EVENT", (Parcelable)localObject);
          if (!localCallback.onMediaButtonEvent(paramMessage)) {
            onMediaButtonEvent((KeyEvent)localObject, localCallback);
          }
          break;
        case 20: 
          localCallback.onCustomAction((String)obj, (Bundle)localObject);
          break;
        case 19: 
          localCallback.onSetRating((RatingCompat)obj);
          break;
        case 18: 
          localCallback.onSeekTo(((Long)obj).longValue());
          break;
        case 17: 
          localCallback.onRewind();
          break;
        case 16: 
          localCallback.onFastForward();
          break;
        case 15: 
          localCallback.onSkipToPrevious();
          break;
        case 14: 
          localCallback.onSkipToNext();
          break;
        case 13: 
          localCallback.onStop();
          break;
        case 12: 
          localCallback.onPause();
          break;
        case 11: 
          localCallback.onSkipToQueueItem(((Long)obj).longValue());
          break;
        case 10: 
          localCallback.onPlayFromUri((Uri)obj, (Bundle)localObject);
          break;
        case 9: 
          localCallback.onPlayFromSearch((String)obj, (Bundle)localObject);
          break;
        case 8: 
          localCallback.onPlayFromMediaId((String)obj, (Bundle)localObject);
          break;
        case 7: 
          localCallback.onPlay();
          break;
        case 6: 
          localCallback.onPrepareFromUri((Uri)obj, (Bundle)localObject);
          break;
        case 5: 
          localCallback.onPrepareFromSearch((String)obj, (Bundle)localObject);
          break;
        case 4: 
          localCallback.onPrepareFromMediaId((String)obj, (Bundle)localObject);
          break;
        case 3: 
          localCallback.onPrepare();
          break;
        case 2: 
          adjustVolume(arg1, 0);
          break;
        case 1: 
          paramMessage = (MediaSessionCompat.MediaSessionImplBase.Command)obj;
          localCallback.onCommand(command, extras, stub);
        }
        return;
      }
      finally
      {
        setCurrentControllerInfo(null);
      }
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat.MediaSessionImplBase
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */