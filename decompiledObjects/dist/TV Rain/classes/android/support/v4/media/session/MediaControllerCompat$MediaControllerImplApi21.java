package android.support.v4.media.session;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaController.PlaybackInfo;
import android.media.session.MediaController.TransportControls;
import android.media.session.MediaSession.Token;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Log;
import android.view.KeyEvent;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.app.BundleCompat;
import androidx.media.AudioAttributesCompat;
import androidx.versionedparcelable.ParcelUtils;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

@RequiresApi(21)
class MediaControllerCompat$MediaControllerImplApi21
  implements MediaControllerCompat.MediaControllerImpl
{
  private HashMap<MediaControllerCompat.Callback, ExtraCallback> mCallbackMap = new HashMap();
  public final MediaController mControllerFwk;
  public final Object mLock = new Object();
  @GuardedBy("mLock")
  private final List<MediaControllerCompat.Callback> mPendingCallbacks = new ArrayList();
  public Bundle mSessionInfo;
  public final MediaSessionCompat.Token mSessionToken;
  
  public MediaControllerCompat$MediaControllerImplApi21(Context paramContext, MediaSessionCompat.Token paramToken)
  {
    mSessionToken = paramToken;
    mControllerFwk = new MediaController(paramContext, (MediaSession.Token)paramToken.getToken());
    if (paramToken.getExtraBinder() == null) {
      requestExtraBinder();
    }
  }
  
  @Nullable
  public static MediaControllerCompat getMediaController(@NonNull Activity paramActivity)
  {
    MediaController localMediaController = paramActivity.getMediaController();
    if (localMediaController == null) {
      return null;
    }
    return new MediaControllerCompat(paramActivity, MediaSessionCompat.Token.fromToken(localMediaController.getSessionToken()));
  }
  
  private void requestExtraBinder()
  {
    sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
  }
  
  public static void setMediaController(@NonNull Activity paramActivity, @Nullable MediaControllerCompat paramMediaControllerCompat)
  {
    if (paramMediaControllerCompat != null) {
      paramMediaControllerCompat = new MediaController(paramActivity, (MediaSession.Token)paramMediaControllerCompat.getSessionToken().getToken());
    } else {
      paramMediaControllerCompat = null;
    }
    paramActivity.setMediaController(paramMediaControllerCompat);
  }
  
  public void addQueueItem(MediaDescriptionCompat paramMediaDescriptionCompat)
  {
    if ((getFlags() & 0x4) != 0L)
    {
      Bundle localBundle = new Bundle();
      localBundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", paramMediaDescriptionCompat);
      sendCommand("android.support.v4.media.session.command.ADD_QUEUE_ITEM", localBundle, null);
      return;
    }
    throw new UnsupportedOperationException("This session doesn't support queue management operations");
  }
  
  public void addQueueItem(MediaDescriptionCompat paramMediaDescriptionCompat, int paramInt)
  {
    if ((getFlags() & 0x4) != 0L)
    {
      Bundle localBundle = new Bundle();
      localBundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", paramMediaDescriptionCompat);
      localBundle.putInt("android.support.v4.media.session.command.ARGUMENT_INDEX", paramInt);
      sendCommand("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT", localBundle, null);
      return;
    }
    throw new UnsupportedOperationException("This session doesn't support queue management operations");
  }
  
  public void adjustVolume(int paramInt1, int paramInt2)
  {
    mControllerFwk.adjustVolume(paramInt1, paramInt2);
  }
  
  public boolean dispatchMediaButtonEvent(KeyEvent paramKeyEvent)
  {
    return mControllerFwk.dispatchMediaButtonEvent(paramKeyEvent);
  }
  
  public Bundle getExtras()
  {
    return mControllerFwk.getExtras();
  }
  
  public long getFlags()
  {
    return mControllerFwk.getFlags();
  }
  
  public Object getMediaController()
  {
    return mControllerFwk;
  }
  
  public MediaMetadataCompat getMetadata()
  {
    Object localObject = mControllerFwk.getMetadata();
    if (localObject != null) {
      localObject = MediaMetadataCompat.fromMediaMetadata(localObject);
    } else {
      localObject = null;
    }
    return (MediaMetadataCompat)localObject;
  }
  
  public String getPackageName()
  {
    return mControllerFwk.getPackageName();
  }
  
  public MediaControllerCompat.PlaybackInfo getPlaybackInfo()
  {
    Object localObject = mControllerFwk.getPlaybackInfo();
    if (localObject != null) {
      localObject = new MediaControllerCompat.PlaybackInfo(((MediaController.PlaybackInfo)localObject).getPlaybackType(), AudioAttributesCompat.wrap(((MediaController.PlaybackInfo)localObject).getAudioAttributes()), ((MediaController.PlaybackInfo)localObject).getVolumeControl(), ((MediaController.PlaybackInfo)localObject).getMaxVolume(), ((MediaController.PlaybackInfo)localObject).getCurrentVolume());
    } else {
      localObject = null;
    }
    return (MediaControllerCompat.PlaybackInfo)localObject;
  }
  
  public PlaybackStateCompat getPlaybackState()
  {
    if (mSessionToken.getExtraBinder() != null) {
      try
      {
        PlaybackStateCompat localPlaybackStateCompat = mSessionToken.getExtraBinder().getPlaybackState();
        return localPlaybackStateCompat;
      }
      catch (RemoteException localRemoteException)
      {
        Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", localRemoteException);
      }
    }
    Object localObject = mControllerFwk.getPlaybackState();
    if (localObject != null) {
      localObject = PlaybackStateCompat.fromPlaybackState(localObject);
    } else {
      localObject = null;
    }
    return (PlaybackStateCompat)localObject;
  }
  
  public List<MediaSessionCompat.QueueItem> getQueue()
  {
    List localList = mControllerFwk.getQueue();
    if (localList != null) {
      localList = MediaSessionCompat.QueueItem.fromQueueItemList(localList);
    } else {
      localList = null;
    }
    return localList;
  }
  
  public CharSequence getQueueTitle()
  {
    return mControllerFwk.getQueueTitle();
  }
  
  public int getRatingType()
  {
    return mControllerFwk.getRatingType();
  }
  
  public int getRepeatMode()
  {
    if (mSessionToken.getExtraBinder() != null) {
      try
      {
        int i = mSessionToken.getExtraBinder().getRepeatMode();
        return i;
      }
      catch (RemoteException localRemoteException)
      {
        Log.e("MediaControllerCompat", "Dead object in getRepeatMode.", localRemoteException);
      }
    }
    return -1;
  }
  
  public PendingIntent getSessionActivity()
  {
    return mControllerFwk.getSessionActivity();
  }
  
  public Bundle getSessionInfo()
  {
    if (mSessionInfo != null) {
      return new Bundle(mSessionInfo);
    }
    if (mSessionToken.getExtraBinder() != null) {
      try
      {
        mSessionInfo = mSessionToken.getExtraBinder().getSessionInfo();
      }
      catch (RemoteException localRemoteException)
      {
        Log.e("MediaControllerCompat", "Dead object in getSessionInfo.", localRemoteException);
        mSessionInfo = Bundle.EMPTY;
      }
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
    if (mSessionToken.getExtraBinder() != null) {
      try
      {
        int i = mSessionToken.getExtraBinder().getShuffleMode();
        return i;
      }
      catch (RemoteException localRemoteException)
      {
        Log.e("MediaControllerCompat", "Dead object in getShuffleMode.", localRemoteException);
      }
    }
    return -1;
  }
  
  public MediaControllerCompat.TransportControls getTransportControls()
  {
    MediaController.TransportControls localTransportControls = mControllerFwk.getTransportControls();
    if (Build.VERSION.SDK_INT >= 29) {
      return new MediaControllerCompat.TransportControlsApi29(localTransportControls);
    }
    return new MediaControllerCompat.TransportControlsApi24(localTransportControls);
  }
  
  public boolean isCaptioningEnabled()
  {
    if (mSessionToken.getExtraBinder() != null) {
      try
      {
        boolean bool = mSessionToken.getExtraBinder().isCaptioningEnabled();
        return bool;
      }
      catch (RemoteException localRemoteException)
      {
        Log.e("MediaControllerCompat", "Dead object in isCaptioningEnabled.", localRemoteException);
      }
    }
    return false;
  }
  
  public boolean isSessionReady()
  {
    boolean bool;
    if (mSessionToken.getExtraBinder() != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @GuardedBy("mLock")
  public void processPendingCallbacksLocked()
  {
    if (mSessionToken.getExtraBinder() == null) {
      return;
    }
    Iterator localIterator = mPendingCallbacks.iterator();
    while (localIterator.hasNext())
    {
      MediaControllerCompat.Callback localCallback = (MediaControllerCompat.Callback)localIterator.next();
      ExtraCallback localExtraCallback = new ExtraCallback(localCallback);
      mCallbackMap.put(localCallback, localExtraCallback);
      mIControllerCallback = localExtraCallback;
      try
      {
        mSessionToken.getExtraBinder().registerCallbackListener(localExtraCallback);
        localCallback.postToHandler(13, null, null);
      }
      catch (RemoteException localRemoteException)
      {
        Log.e("MediaControllerCompat", "Dead object in registerCallback.", localRemoteException);
      }
    }
    mPendingCallbacks.clear();
  }
  
  public final void registerCallback(MediaControllerCompat.Callback paramCallback, Handler arg2)
  {
    mControllerFwk.registerCallback(mCallbackFwk, ???);
    synchronized (mLock)
    {
      if (mSessionToken.getExtraBinder() != null)
      {
        ExtraCallback localExtraCallback = new android/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21$ExtraCallback;
        localExtraCallback.<init>(paramCallback);
        mCallbackMap.put(paramCallback, localExtraCallback);
        mIControllerCallback = localExtraCallback;
        try
        {
          mSessionToken.getExtraBinder().registerCallbackListener(localExtraCallback);
          paramCallback.postToHandler(13, null, null);
        }
        catch (RemoteException paramCallback)
        {
          Log.e("MediaControllerCompat", "Dead object in registerCallback.", paramCallback);
        }
      }
      else
      {
        mIControllerCallback = null;
        mPendingCallbacks.add(paramCallback);
      }
      return;
    }
  }
  
  public void removeQueueItem(MediaDescriptionCompat paramMediaDescriptionCompat)
  {
    if ((getFlags() & 0x4) != 0L)
    {
      Bundle localBundle = new Bundle();
      localBundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", paramMediaDescriptionCompat);
      sendCommand("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM", localBundle, null);
      return;
    }
    throw new UnsupportedOperationException("This session doesn't support queue management operations");
  }
  
  public void sendCommand(String paramString, Bundle paramBundle, ResultReceiver paramResultReceiver)
  {
    mControllerFwk.sendCommand(paramString, paramBundle, paramResultReceiver);
  }
  
  public void setVolumeTo(int paramInt1, int paramInt2)
  {
    mControllerFwk.setVolumeTo(paramInt1, paramInt2);
  }
  
  public final void unregisterCallback(MediaControllerCompat.Callback paramCallback)
  {
    mControllerFwk.unregisterCallback(mCallbackFwk);
    synchronized (mLock)
    {
      Object localObject2 = mSessionToken.getExtraBinder();
      if (localObject2 != null) {
        try
        {
          localObject2 = (ExtraCallback)mCallbackMap.remove(paramCallback);
          if (localObject2 == null) {
            break label92;
          }
          mIControllerCallback = null;
          mSessionToken.getExtraBinder().unregisterCallbackListener((IMediaControllerCallback)localObject2);
        }
        catch (RemoteException paramCallback)
        {
          Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", paramCallback);
        }
      } else {
        mPendingCallbacks.remove(paramCallback);
      }
      label92:
      return;
    }
  }
  
  public static class ExtraBinderRequestResultReceiver
    extends ResultReceiver
  {
    private WeakReference<MediaControllerCompat.MediaControllerImplApi21> mMediaControllerImpl;
    
    public ExtraBinderRequestResultReceiver(MediaControllerCompat.MediaControllerImplApi21 paramMediaControllerImplApi21)
    {
      super();
      mMediaControllerImpl = new WeakReference(paramMediaControllerImplApi21);
    }
    
    public void onReceiveResult(int paramInt, Bundle paramBundle)
    {
      MediaControllerCompat.MediaControllerImplApi21 localMediaControllerImplApi21 = (MediaControllerCompat.MediaControllerImplApi21)mMediaControllerImpl.get();
      if ((localMediaControllerImplApi21 != null) && (paramBundle != null)) {
        synchronized (mLock)
        {
          mSessionToken.setExtraBinder(IMediaSession.Stub.asInterface(BundleCompat.getBinder(paramBundle, "android.support.v4.media.session.EXTRA_BINDER")));
          mSessionToken.setSession2Token(ParcelUtils.getVersionedParcelable(paramBundle, "android.support.v4.media.session.SESSION_TOKEN2"));
          localMediaControllerImplApi21.processPendingCallbacksLocked();
          return;
        }
      }
    }
  }
  
  public static class ExtraCallback
    extends MediaControllerCompat.Callback.StubCompat
  {
    public ExtraCallback(MediaControllerCompat.Callback paramCallback)
    {
      super();
    }
    
    public void onExtrasChanged(Bundle paramBundle)
      throws RemoteException
    {
      throw new AssertionError();
    }
    
    public void onMetadataChanged(MediaMetadataCompat paramMediaMetadataCompat)
      throws RemoteException
    {
      throw new AssertionError();
    }
    
    public void onQueueChanged(List<MediaSessionCompat.QueueItem> paramList)
      throws RemoteException
    {
      throw new AssertionError();
    }
    
    public void onQueueTitleChanged(CharSequence paramCharSequence)
      throws RemoteException
    {
      throw new AssertionError();
    }
    
    public void onSessionDestroyed()
      throws RemoteException
    {
      throw new AssertionError();
    }
    
    public void onVolumeInfoChanged(ParcelableVolumeInfo paramParcelableVolumeInfo)
      throws RemoteException
    {
      throw new AssertionError();
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */