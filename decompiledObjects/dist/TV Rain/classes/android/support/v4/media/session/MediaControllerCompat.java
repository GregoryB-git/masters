package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaController;
import android.media.session.MediaController.Callback;
import android.media.session.MediaController.PlaybackInfo;
import android.media.session.MediaController.TransportControls;
import android.media.session.MediaSession.QueueItem;
import android.media.session.MediaSession.Token;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.app.BundleCompat;
import androidx.media.AudioAttributesCompat;
import androidx.media.AudioAttributesCompat.Builder;
import androidx.media.R.id;
import androidx.versionedparcelable.ParcelUtils;
import androidx.versionedparcelable.VersionedParcelable;
import e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import z2;

public final class MediaControllerCompat
{
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static final String COMMAND_ADD_QUEUE_ITEM = "android.support.v4.media.session.command.ADD_QUEUE_ITEM";
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static final String COMMAND_ADD_QUEUE_ITEM_AT = "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT";
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static final String COMMAND_ARGUMENT_INDEX = "android.support.v4.media.session.command.ARGUMENT_INDEX";
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static final String COMMAND_ARGUMENT_MEDIA_DESCRIPTION = "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION";
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static final String COMMAND_GET_EXTRA_BINDER = "android.support.v4.media.session.command.GET_EXTRA_BINDER";
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static final String COMMAND_REMOVE_QUEUE_ITEM = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM";
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static final String COMMAND_REMOVE_QUEUE_ITEM_AT = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT";
  public static final String TAG = "MediaControllerCompat";
  private final MediaControllerImpl mImpl;
  @SuppressLint({"BanConcurrentHashMap"})
  private final ConcurrentHashMap<Callback, Boolean> mRegisteredCallbacks = new ConcurrentHashMap();
  private final MediaSessionCompat.Token mToken;
  
  public MediaControllerCompat(Context paramContext, @NonNull MediaSessionCompat.Token paramToken)
  {
    if (paramToken != null)
    {
      mToken = paramToken;
      mImpl = new MediaControllerImplApi21(paramContext, paramToken);
      return;
    }
    throw new IllegalArgumentException("sessionToken must not be null");
  }
  
  public MediaControllerCompat(Context paramContext, @NonNull MediaSessionCompat paramMediaSessionCompat)
  {
    if (paramMediaSessionCompat != null)
    {
      paramMediaSessionCompat = paramMediaSessionCompat.getSessionToken();
      mToken = paramMediaSessionCompat;
      if (Build.VERSION.SDK_INT >= 29) {
        mImpl = new MediaControllerImplApi29(paramContext, paramMediaSessionCompat);
      } else {
        mImpl = new MediaControllerImplApi21(paramContext, paramMediaSessionCompat);
      }
      return;
    }
    throw new IllegalArgumentException("session must not be null");
  }
  
  public static MediaControllerCompat getMediaController(@NonNull Activity paramActivity)
  {
    Object localObject = paramActivity.getWindow().getDecorView().getTag(R.id.media_controller_compat_view_tag);
    if ((localObject instanceof MediaControllerCompat)) {
      return (MediaControllerCompat)localObject;
    }
    return MediaControllerImplApi21.getMediaController(paramActivity);
  }
  
  public static void setMediaController(@NonNull Activity paramActivity, MediaControllerCompat paramMediaControllerCompat)
  {
    paramActivity.getWindow().getDecorView().setTag(R.id.media_controller_compat_view_tag, paramMediaControllerCompat);
    MediaControllerImplApi21.setMediaController(paramActivity, paramMediaControllerCompat);
  }
  
  public static void validateCustomAction(String paramString, Bundle paramBundle)
  {
    if (paramString == null) {
      return;
    }
    if (((!paramString.equals("android.support.v4.media.session.action.FOLLOW")) && (!paramString.equals("android.support.v4.media.session.action.UNFOLLOW"))) || ((paramBundle != null) && (paramBundle.containsKey("android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE")))) {
      return;
    }
    throw new IllegalArgumentException(z2.p("An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action ", paramString, "."));
  }
  
  public void addQueueItem(MediaDescriptionCompat paramMediaDescriptionCompat)
  {
    mImpl.addQueueItem(paramMediaDescriptionCompat);
  }
  
  public void addQueueItem(MediaDescriptionCompat paramMediaDescriptionCompat, int paramInt)
  {
    mImpl.addQueueItem(paramMediaDescriptionCompat, paramInt);
  }
  
  public void adjustVolume(int paramInt1, int paramInt2)
  {
    mImpl.adjustVolume(paramInt1, paramInt2);
  }
  
  public boolean dispatchMediaButtonEvent(KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent != null) {
      return mImpl.dispatchMediaButtonEvent(paramKeyEvent);
    }
    throw new IllegalArgumentException("KeyEvent may not be null");
  }
  
  public Bundle getExtras()
  {
    return mImpl.getExtras();
  }
  
  public long getFlags()
  {
    return mImpl.getFlags();
  }
  
  public Object getMediaController()
  {
    return mImpl.getMediaController();
  }
  
  public MediaMetadataCompat getMetadata()
  {
    return mImpl.getMetadata();
  }
  
  public String getPackageName()
  {
    return mImpl.getPackageName();
  }
  
  public PlaybackInfo getPlaybackInfo()
  {
    return mImpl.getPlaybackInfo();
  }
  
  public PlaybackStateCompat getPlaybackState()
  {
    return mImpl.getPlaybackState();
  }
  
  public List<MediaSessionCompat.QueueItem> getQueue()
  {
    return mImpl.getQueue();
  }
  
  public CharSequence getQueueTitle()
  {
    return mImpl.getQueueTitle();
  }
  
  public int getRatingType()
  {
    return mImpl.getRatingType();
  }
  
  public int getRepeatMode()
  {
    return mImpl.getRepeatMode();
  }
  
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public VersionedParcelable getSession2Token()
  {
    return mToken.getSession2Token();
  }
  
  public PendingIntent getSessionActivity()
  {
    return mImpl.getSessionActivity();
  }
  
  @NonNull
  public Bundle getSessionInfo()
  {
    return mImpl.getSessionInfo();
  }
  
  public MediaSessionCompat.Token getSessionToken()
  {
    return mToken;
  }
  
  public int getShuffleMode()
  {
    return mImpl.getShuffleMode();
  }
  
  public TransportControls getTransportControls()
  {
    return mImpl.getTransportControls();
  }
  
  public boolean isCaptioningEnabled()
  {
    return mImpl.isCaptioningEnabled();
  }
  
  public boolean isSessionReady()
  {
    return mImpl.isSessionReady();
  }
  
  public void registerCallback(@NonNull Callback paramCallback)
  {
    registerCallback(paramCallback, null);
  }
  
  public void registerCallback(@NonNull Callback paramCallback, Handler paramHandler)
  {
    if (paramCallback != null)
    {
      if (mRegisteredCallbacks.putIfAbsent(paramCallback, Boolean.TRUE) != null)
      {
        Log.w("MediaControllerCompat", "the callback has already been registered");
        return;
      }
      Handler localHandler = paramHandler;
      if (paramHandler == null) {
        localHandler = new Handler();
      }
      paramCallback.setHandler(localHandler);
      mImpl.registerCallback(paramCallback, localHandler);
      return;
    }
    throw new IllegalArgumentException("callback must not be null");
  }
  
  public void removeQueueItem(MediaDescriptionCompat paramMediaDescriptionCompat)
  {
    mImpl.removeQueueItem(paramMediaDescriptionCompat);
  }
  
  @Deprecated
  public void removeQueueItemAt(int paramInt)
  {
    Object localObject = getQueue();
    if ((localObject != null) && (paramInt >= 0) && (paramInt < ((List)localObject).size()))
    {
      localObject = (MediaSessionCompat.QueueItem)((List)localObject).get(paramInt);
      if (localObject != null) {
        removeQueueItem(((MediaSessionCompat.QueueItem)localObject).getDescription());
      }
    }
  }
  
  public void sendCommand(@NonNull String paramString, @Nullable Bundle paramBundle, @Nullable ResultReceiver paramResultReceiver)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      mImpl.sendCommand(paramString, paramBundle, paramResultReceiver);
      return;
    }
    throw new IllegalArgumentException("command must neither be null nor empty");
  }
  
  public void setVolumeTo(int paramInt1, int paramInt2)
  {
    mImpl.setVolumeTo(paramInt1, paramInt2);
  }
  
  public void unregisterCallback(@NonNull Callback paramCallback)
  {
    if (paramCallback != null)
    {
      if (mRegisteredCallbacks.remove(paramCallback) == null)
      {
        Log.w("MediaControllerCompat", "the callback has never been registered");
        return;
      }
      try
      {
        mImpl.unregisterCallback(paramCallback);
        return;
      }
      finally
      {
        paramCallback.setHandler(null);
      }
    }
    throw new IllegalArgumentException("callback must not be null");
  }
  
  public static abstract class Callback
    implements IBinder.DeathRecipient
  {
    public final MediaController.Callback mCallbackFwk = new MediaControllerCallbackApi21(this);
    public MessageHandler mHandler;
    public IMediaControllerCallback mIControllerCallback;
    
    public void binderDied()
    {
      postToHandler(8, null, null);
    }
    
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public IMediaControllerCallback getIControllerCallback()
    {
      return mIControllerCallback;
    }
    
    public void onAudioInfoChanged(MediaControllerCompat.PlaybackInfo paramPlaybackInfo) {}
    
    public void onCaptioningEnabledChanged(boolean paramBoolean) {}
    
    public void onExtrasChanged(Bundle paramBundle) {}
    
    public void onMetadataChanged(MediaMetadataCompat paramMediaMetadataCompat) {}
    
    public void onPlaybackStateChanged(PlaybackStateCompat paramPlaybackStateCompat) {}
    
    public void onQueueChanged(List<MediaSessionCompat.QueueItem> paramList) {}
    
    public void onQueueTitleChanged(CharSequence paramCharSequence) {}
    
    public void onRepeatModeChanged(int paramInt) {}
    
    public void onSessionDestroyed() {}
    
    public void onSessionEvent(String paramString, Bundle paramBundle) {}
    
    public void onSessionReady() {}
    
    public void onShuffleModeChanged(int paramInt) {}
    
    public void postToHandler(int paramInt, Object paramObject, Bundle paramBundle)
    {
      MessageHandler localMessageHandler = mHandler;
      if (localMessageHandler != null)
      {
        paramObject = localMessageHandler.obtainMessage(paramInt, paramObject);
        ((Message)paramObject).setData(paramBundle);
        ((Message)paramObject).sendToTarget();
      }
    }
    
    public void setHandler(Handler paramHandler)
    {
      if (paramHandler == null)
      {
        paramHandler = mHandler;
        if (paramHandler != null)
        {
          mRegistered = false;
          paramHandler.removeCallbacksAndMessages(null);
          mHandler = null;
        }
      }
      else
      {
        paramHandler = new MessageHandler(paramHandler.getLooper());
        mHandler = paramHandler;
        mRegistered = true;
      }
    }
    
    @RequiresApi(21)
    public static class MediaControllerCallbackApi21
      extends MediaController.Callback
    {
      private final WeakReference<MediaControllerCompat.Callback> mCallback;
      
      public MediaControllerCallbackApi21(MediaControllerCompat.Callback paramCallback)
      {
        mCallback = new WeakReference(paramCallback);
      }
      
      public void onAudioInfoChanged(MediaController.PlaybackInfo paramPlaybackInfo)
      {
        MediaControllerCompat.Callback localCallback = (MediaControllerCompat.Callback)mCallback.get();
        if (localCallback != null) {
          localCallback.onAudioInfoChanged(new MediaControllerCompat.PlaybackInfo(paramPlaybackInfo.getPlaybackType(), AudioAttributesCompat.wrap(paramPlaybackInfo.getAudioAttributes()), paramPlaybackInfo.getVolumeControl(), paramPlaybackInfo.getMaxVolume(), paramPlaybackInfo.getCurrentVolume()));
        }
      }
      
      public void onExtrasChanged(Bundle paramBundle)
      {
        MediaSessionCompat.ensureClassLoader(paramBundle);
        MediaControllerCompat.Callback localCallback = (MediaControllerCompat.Callback)mCallback.get();
        if (localCallback != null) {
          localCallback.onExtrasChanged(paramBundle);
        }
      }
      
      public void onMetadataChanged(MediaMetadata paramMediaMetadata)
      {
        MediaControllerCompat.Callback localCallback = (MediaControllerCompat.Callback)mCallback.get();
        if (localCallback != null) {
          localCallback.onMetadataChanged(MediaMetadataCompat.fromMediaMetadata(paramMediaMetadata));
        }
      }
      
      public void onPlaybackStateChanged(PlaybackState paramPlaybackState)
      {
        MediaControllerCompat.Callback localCallback = (MediaControllerCompat.Callback)mCallback.get();
        if ((localCallback != null) && (mIControllerCallback == null)) {
          localCallback.onPlaybackStateChanged(PlaybackStateCompat.fromPlaybackState(paramPlaybackState));
        }
      }
      
      public void onQueueChanged(List<MediaSession.QueueItem> paramList)
      {
        MediaControllerCompat.Callback localCallback = (MediaControllerCompat.Callback)mCallback.get();
        if (localCallback != null) {
          localCallback.onQueueChanged(MediaSessionCompat.QueueItem.fromQueueItemList(paramList));
        }
      }
      
      public void onQueueTitleChanged(CharSequence paramCharSequence)
      {
        MediaControllerCompat.Callback localCallback = (MediaControllerCompat.Callback)mCallback.get();
        if (localCallback != null) {
          localCallback.onQueueTitleChanged(paramCharSequence);
        }
      }
      
      public void onSessionDestroyed()
      {
        MediaControllerCompat.Callback localCallback = (MediaControllerCompat.Callback)mCallback.get();
        if (localCallback != null) {
          localCallback.onSessionDestroyed();
        }
      }
      
      public void onSessionEvent(String paramString, Bundle paramBundle)
      {
        MediaSessionCompat.ensureClassLoader(paramBundle);
        MediaControllerCompat.Callback localCallback = (MediaControllerCompat.Callback)mCallback.get();
        if (localCallback != null)
        {
          IMediaControllerCallback localIMediaControllerCallback = mIControllerCallback;
          localCallback.onSessionEvent(paramString, paramBundle);
        }
      }
    }
    
    public class MessageHandler
      extends Handler
    {
      private static final int MSG_DESTROYED = 8;
      private static final int MSG_EVENT = 1;
      private static final int MSG_SESSION_READY = 13;
      private static final int MSG_UPDATE_CAPTIONING_ENABLED = 11;
      private static final int MSG_UPDATE_EXTRAS = 7;
      private static final int MSG_UPDATE_METADATA = 3;
      private static final int MSG_UPDATE_PLAYBACK_STATE = 2;
      private static final int MSG_UPDATE_QUEUE = 5;
      private static final int MSG_UPDATE_QUEUE_TITLE = 6;
      private static final int MSG_UPDATE_REPEAT_MODE = 9;
      private static final int MSG_UPDATE_SHUFFLE_MODE = 12;
      private static final int MSG_UPDATE_VOLUME = 4;
      public boolean mRegistered = false;
      
      public MessageHandler(Looper paramLooper)
      {
        super();
      }
      
      public void handleMessage(Message paramMessage)
      {
        if (!mRegistered) {
          return;
        }
        switch (what)
        {
        case 10: 
        default: 
          break;
        case 13: 
          onSessionReady();
          break;
        case 12: 
          onShuffleModeChanged(((Integer)obj).intValue());
          break;
        case 11: 
          onCaptioningEnabledChanged(((Boolean)obj).booleanValue());
          break;
        case 9: 
          onRepeatModeChanged(((Integer)obj).intValue());
          break;
        case 8: 
          onSessionDestroyed();
          break;
        case 7: 
          paramMessage = (Bundle)obj;
          MediaSessionCompat.ensureClassLoader(paramMessage);
          onExtrasChanged(paramMessage);
          break;
        case 6: 
          onQueueTitleChanged((CharSequence)obj);
          break;
        case 5: 
          onQueueChanged((List)obj);
          break;
        case 4: 
          onAudioInfoChanged((MediaControllerCompat.PlaybackInfo)obj);
          break;
        case 3: 
          onMetadataChanged((MediaMetadataCompat)obj);
          break;
        case 2: 
          onPlaybackStateChanged((PlaybackStateCompat)obj);
          break;
        case 1: 
          Bundle localBundle = paramMessage.getData();
          MediaSessionCompat.ensureClassLoader(localBundle);
          onSessionEvent((String)obj, localBundle);
        }
      }
    }
    
    public static class StubCompat
      extends IMediaControllerCallback.Stub
    {
      private final WeakReference<MediaControllerCompat.Callback> mCallback;
      
      public StubCompat(MediaControllerCompat.Callback paramCallback)
      {
        mCallback = new WeakReference(paramCallback);
      }
      
      public void onCaptioningEnabledChanged(boolean paramBoolean)
        throws RemoteException
      {
        MediaControllerCompat.Callback localCallback = (MediaControllerCompat.Callback)mCallback.get();
        if (localCallback != null) {
          localCallback.postToHandler(11, Boolean.valueOf(paramBoolean), null);
        }
      }
      
      public void onEvent(String paramString, Bundle paramBundle)
        throws RemoteException
      {
        MediaControllerCompat.Callback localCallback = (MediaControllerCompat.Callback)mCallback.get();
        if (localCallback != null) {
          localCallback.postToHandler(1, paramString, paramBundle);
        }
      }
      
      public void onExtrasChanged(Bundle paramBundle)
        throws RemoteException
      {
        MediaControllerCompat.Callback localCallback = (MediaControllerCompat.Callback)mCallback.get();
        if (localCallback != null) {
          localCallback.postToHandler(7, paramBundle, null);
        }
      }
      
      public void onMetadataChanged(MediaMetadataCompat paramMediaMetadataCompat)
        throws RemoteException
      {
        MediaControllerCompat.Callback localCallback = (MediaControllerCompat.Callback)mCallback.get();
        if (localCallback != null) {
          localCallback.postToHandler(3, paramMediaMetadataCompat, null);
        }
      }
      
      public void onPlaybackStateChanged(PlaybackStateCompat paramPlaybackStateCompat)
        throws RemoteException
      {
        MediaControllerCompat.Callback localCallback = (MediaControllerCompat.Callback)mCallback.get();
        if (localCallback != null) {
          localCallback.postToHandler(2, paramPlaybackStateCompat, null);
        }
      }
      
      public void onQueueChanged(List<MediaSessionCompat.QueueItem> paramList)
        throws RemoteException
      {
        MediaControllerCompat.Callback localCallback = (MediaControllerCompat.Callback)mCallback.get();
        if (localCallback != null) {
          localCallback.postToHandler(5, paramList, null);
        }
      }
      
      public void onQueueTitleChanged(CharSequence paramCharSequence)
        throws RemoteException
      {
        MediaControllerCompat.Callback localCallback = (MediaControllerCompat.Callback)mCallback.get();
        if (localCallback != null) {
          localCallback.postToHandler(6, paramCharSequence, null);
        }
      }
      
      public void onRepeatModeChanged(int paramInt)
        throws RemoteException
      {
        MediaControllerCompat.Callback localCallback = (MediaControllerCompat.Callback)mCallback.get();
        if (localCallback != null) {
          localCallback.postToHandler(9, Integer.valueOf(paramInt), null);
        }
      }
      
      public void onSessionDestroyed()
        throws RemoteException
      {
        MediaControllerCompat.Callback localCallback = (MediaControllerCompat.Callback)mCallback.get();
        if (localCallback != null) {
          localCallback.postToHandler(8, null, null);
        }
      }
      
      public void onSessionReady()
        throws RemoteException
      {
        MediaControllerCompat.Callback localCallback = (MediaControllerCompat.Callback)mCallback.get();
        if (localCallback != null) {
          localCallback.postToHandler(13, null, null);
        }
      }
      
      public void onShuffleModeChanged(int paramInt)
        throws RemoteException
      {
        MediaControllerCompat.Callback localCallback = (MediaControllerCompat.Callback)mCallback.get();
        if (localCallback != null) {
          localCallback.postToHandler(12, Integer.valueOf(paramInt), null);
        }
      }
      
      public void onShuffleModeChangedRemoved(boolean paramBoolean)
        throws RemoteException
      {}
      
      public void onVolumeInfoChanged(ParcelableVolumeInfo paramParcelableVolumeInfo)
        throws RemoteException
      {
        MediaControllerCompat.Callback localCallback = (MediaControllerCompat.Callback)mCallback.get();
        if (localCallback != null)
        {
          if (paramParcelableVolumeInfo != null) {
            paramParcelableVolumeInfo = new MediaControllerCompat.PlaybackInfo(volumeType, audioStream, controlType, maxVolume, currentVolume);
          } else {
            paramParcelableVolumeInfo = null;
          }
          localCallback.postToHandler(4, paramParcelableVolumeInfo, null);
        }
      }
    }
  }
  
  public static abstract interface MediaControllerImpl
  {
    public abstract void addQueueItem(MediaDescriptionCompat paramMediaDescriptionCompat);
    
    public abstract void addQueueItem(MediaDescriptionCompat paramMediaDescriptionCompat, int paramInt);
    
    public abstract void adjustVolume(int paramInt1, int paramInt2);
    
    public abstract boolean dispatchMediaButtonEvent(KeyEvent paramKeyEvent);
    
    public abstract Bundle getExtras();
    
    public abstract long getFlags();
    
    public abstract Object getMediaController();
    
    public abstract MediaMetadataCompat getMetadata();
    
    public abstract String getPackageName();
    
    public abstract MediaControllerCompat.PlaybackInfo getPlaybackInfo();
    
    public abstract PlaybackStateCompat getPlaybackState();
    
    public abstract List<MediaSessionCompat.QueueItem> getQueue();
    
    public abstract CharSequence getQueueTitle();
    
    public abstract int getRatingType();
    
    public abstract int getRepeatMode();
    
    public abstract PendingIntent getSessionActivity();
    
    public abstract Bundle getSessionInfo();
    
    public abstract int getShuffleMode();
    
    public abstract MediaControllerCompat.TransportControls getTransportControls();
    
    public abstract boolean isCaptioningEnabled();
    
    public abstract boolean isSessionReady();
    
    public abstract void registerCallback(MediaControllerCompat.Callback paramCallback, Handler paramHandler);
    
    public abstract void removeQueueItem(MediaDescriptionCompat paramMediaDescriptionCompat);
    
    public abstract void sendCommand(String paramString, Bundle paramBundle, ResultReceiver paramResultReceiver);
    
    public abstract void setVolumeTo(int paramInt1, int paramInt2);
    
    public abstract void unregisterCallback(MediaControllerCompat.Callback paramCallback);
  }
  
  @RequiresApi(21)
  public static class MediaControllerImplApi21
    implements MediaControllerCompat.MediaControllerImpl
  {
    private HashMap<MediaControllerCompat.Callback, ExtraCallback> mCallbackMap = new HashMap();
    public final MediaController mControllerFwk;
    public final Object mLock = new Object();
    @GuardedBy("mLock")
    private final List<MediaControllerCompat.Callback> mPendingCallbacks = new ArrayList();
    public Bundle mSessionInfo;
    public final MediaSessionCompat.Token mSessionToken;
    
    public MediaControllerImplApi21(Context paramContext, MediaSessionCompat.Token paramToken)
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
  
  @RequiresApi(29)
  public static class MediaControllerImplApi29
    extends MediaControllerCompat.MediaControllerImplApi21
  {
    public MediaControllerImplApi29(Context paramContext, MediaSessionCompat.Token paramToken)
    {
      super(paramToken);
    }
    
    public Bundle getSessionInfo()
    {
      if (mSessionInfo != null) {
        return new Bundle(mSessionInfo);
      }
      Bundle localBundle = e.f(mControllerFwk);
      mSessionInfo = localBundle;
      localBundle = MediaSessionCompat.unparcelWithClassLoader(localBundle);
      mSessionInfo = localBundle;
      if (localBundle == null) {
        localBundle = Bundle.EMPTY;
      } else {
        localBundle = new Bundle(mSessionInfo);
      }
      return localBundle;
    }
  }
  
  public static class MediaControllerImplBase
    implements MediaControllerCompat.MediaControllerImpl
  {
    private IMediaSession mBinder;
    private Bundle mSessionInfo;
    private MediaControllerCompat.TransportControls mTransportControls;
    
    public MediaControllerImplBase(MediaSessionCompat.Token paramToken)
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
  
  public static final class PlaybackInfo
  {
    public static final int PLAYBACK_TYPE_LOCAL = 1;
    public static final int PLAYBACK_TYPE_REMOTE = 2;
    private final AudioAttributesCompat mAudioAttrsCompat;
    private final int mCurrentVolume;
    private final int mMaxVolume;
    private final int mPlaybackType;
    private final int mVolumeControl;
    
    public PlaybackInfo(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
    {
      this(paramInt1, new AudioAttributesCompat.Builder().setLegacyStreamType(paramInt2).build(), paramInt3, paramInt4, paramInt5);
    }
    
    public PlaybackInfo(int paramInt1, @NonNull AudioAttributesCompat paramAudioAttributesCompat, int paramInt2, int paramInt3, int paramInt4)
    {
      mPlaybackType = paramInt1;
      mAudioAttrsCompat = paramAudioAttributesCompat;
      mVolumeControl = paramInt2;
      mMaxVolume = paramInt3;
      mCurrentVolume = paramInt4;
    }
    
    @NonNull
    public AudioAttributesCompat getAudioAttributes()
    {
      return mAudioAttrsCompat;
    }
    
    @Deprecated
    public int getAudioStream()
    {
      return mAudioAttrsCompat.getLegacyStreamType();
    }
    
    public int getCurrentVolume()
    {
      return mCurrentVolume;
    }
    
    public int getMaxVolume()
    {
      return mMaxVolume;
    }
    
    public int getPlaybackType()
    {
      return mPlaybackType;
    }
    
    public int getVolumeControl()
    {
      return mVolumeControl;
    }
  }
  
  public static abstract class TransportControls
  {
    @Deprecated
    public static final String EXTRA_LEGACY_STREAM_TYPE = "android.media.session.extra.LEGACY_STREAM_TYPE";
    
    public abstract void fastForward();
    
    public abstract void pause();
    
    public abstract void play();
    
    public abstract void playFromMediaId(String paramString, Bundle paramBundle);
    
    public abstract void playFromSearch(String paramString, Bundle paramBundle);
    
    public abstract void playFromUri(Uri paramUri, Bundle paramBundle);
    
    public abstract void prepare();
    
    public abstract void prepareFromMediaId(String paramString, Bundle paramBundle);
    
    public abstract void prepareFromSearch(String paramString, Bundle paramBundle);
    
    public abstract void prepareFromUri(Uri paramUri, Bundle paramBundle);
    
    public abstract void rewind();
    
    public abstract void seekTo(long paramLong);
    
    public abstract void sendCustomAction(PlaybackStateCompat.CustomAction paramCustomAction, Bundle paramBundle);
    
    public abstract void sendCustomAction(String paramString, Bundle paramBundle);
    
    public abstract void setCaptioningEnabled(boolean paramBoolean);
    
    public void setPlaybackSpeed(float paramFloat) {}
    
    public abstract void setRating(RatingCompat paramRatingCompat);
    
    public abstract void setRating(RatingCompat paramRatingCompat, Bundle paramBundle);
    
    public abstract void setRepeatMode(int paramInt);
    
    public abstract void setShuffleMode(int paramInt);
    
    public abstract void skipToNext();
    
    public abstract void skipToPrevious();
    
    public abstract void skipToQueueItem(long paramLong);
    
    public abstract void stop();
  }
  
  @RequiresApi(21)
  public static class TransportControlsApi21
    extends MediaControllerCompat.TransportControls
  {
    public final MediaController.TransportControls mControlsFwk;
    
    public TransportControlsApi21(MediaController.TransportControls paramTransportControls)
    {
      mControlsFwk = paramTransportControls;
    }
    
    public void fastForward()
    {
      mControlsFwk.fastForward();
    }
    
    public void pause()
    {
      mControlsFwk.pause();
    }
    
    public void play()
    {
      mControlsFwk.play();
    }
    
    public void playFromMediaId(String paramString, Bundle paramBundle)
    {
      mControlsFwk.playFromMediaId(paramString, paramBundle);
    }
    
    public void playFromSearch(String paramString, Bundle paramBundle)
    {
      mControlsFwk.playFromSearch(paramString, paramBundle);
    }
    
    public void playFromUri(Uri paramUri, Bundle paramBundle)
    {
      if ((paramUri != null) && (!Uri.EMPTY.equals(paramUri)))
      {
        Bundle localBundle = new Bundle();
        localBundle.putParcelable("android.support.v4.media.session.action.ARGUMENT_URI", paramUri);
        localBundle.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", paramBundle);
        sendCustomAction("android.support.v4.media.session.action.PLAY_FROM_URI", localBundle);
        return;
      }
      throw new IllegalArgumentException("You must specify a non-empty Uri for playFromUri.");
    }
    
    public void prepare()
    {
      sendCustomAction("android.support.v4.media.session.action.PREPARE", null);
    }
    
    public void prepareFromMediaId(String paramString, Bundle paramBundle)
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID", paramString);
      localBundle.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", paramBundle);
      sendCustomAction("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID", localBundle);
    }
    
    public void prepareFromSearch(String paramString, Bundle paramBundle)
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("android.support.v4.media.session.action.ARGUMENT_QUERY", paramString);
      localBundle.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", paramBundle);
      sendCustomAction("android.support.v4.media.session.action.PREPARE_FROM_SEARCH", localBundle);
    }
    
    public void prepareFromUri(Uri paramUri, Bundle paramBundle)
    {
      Bundle localBundle = new Bundle();
      localBundle.putParcelable("android.support.v4.media.session.action.ARGUMENT_URI", paramUri);
      localBundle.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", paramBundle);
      sendCustomAction("android.support.v4.media.session.action.PREPARE_FROM_URI", localBundle);
    }
    
    public void rewind()
    {
      mControlsFwk.rewind();
    }
    
    public void seekTo(long paramLong)
    {
      mControlsFwk.seekTo(paramLong);
    }
    
    public void sendCustomAction(PlaybackStateCompat.CustomAction paramCustomAction, Bundle paramBundle)
    {
      MediaControllerCompat.validateCustomAction(paramCustomAction.getAction(), paramBundle);
      mControlsFwk.sendCustomAction(paramCustomAction.getAction(), paramBundle);
    }
    
    public void sendCustomAction(String paramString, Bundle paramBundle)
    {
      MediaControllerCompat.validateCustomAction(paramString, paramBundle);
      mControlsFwk.sendCustomAction(paramString, paramBundle);
    }
    
    public void setCaptioningEnabled(boolean paramBoolean)
    {
      Bundle localBundle = new Bundle();
      localBundle.putBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED", paramBoolean);
      sendCustomAction("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED", localBundle);
    }
    
    public void setPlaybackSpeed(float paramFloat)
    {
      if (paramFloat != 0.0F)
      {
        Bundle localBundle = new Bundle();
        localBundle.putFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", paramFloat);
        sendCustomAction("android.support.v4.media.session.action.SET_PLAYBACK_SPEED", localBundle);
        return;
      }
      throw new IllegalArgumentException("speed must not be zero");
    }
    
    public void setRating(RatingCompat paramRatingCompat)
    {
      MediaController.TransportControls localTransportControls = mControlsFwk;
      if (paramRatingCompat != null) {
        paramRatingCompat = (Rating)paramRatingCompat.getRating();
      } else {
        paramRatingCompat = null;
      }
      localTransportControls.setRating(paramRatingCompat);
    }
    
    public void setRating(RatingCompat paramRatingCompat, Bundle paramBundle)
    {
      Bundle localBundle = new Bundle();
      localBundle.putParcelable("android.support.v4.media.session.action.ARGUMENT_RATING", paramRatingCompat);
      localBundle.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", paramBundle);
      sendCustomAction("android.support.v4.media.session.action.SET_RATING", localBundle);
    }
    
    public void setRepeatMode(int paramInt)
    {
      Bundle localBundle = new Bundle();
      localBundle.putInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE", paramInt);
      sendCustomAction("android.support.v4.media.session.action.SET_REPEAT_MODE", localBundle);
    }
    
    public void setShuffleMode(int paramInt)
    {
      Bundle localBundle = new Bundle();
      localBundle.putInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE", paramInt);
      sendCustomAction("android.support.v4.media.session.action.SET_SHUFFLE_MODE", localBundle);
    }
    
    public void skipToNext()
    {
      mControlsFwk.skipToNext();
    }
    
    public void skipToPrevious()
    {
      mControlsFwk.skipToPrevious();
    }
    
    public void skipToQueueItem(long paramLong)
    {
      mControlsFwk.skipToQueueItem(paramLong);
    }
    
    public void stop()
    {
      mControlsFwk.stop();
    }
  }
  
  @RequiresApi(23)
  public static class TransportControlsApi23
    extends MediaControllerCompat.TransportControlsApi21
  {
    public TransportControlsApi23(MediaController.TransportControls paramTransportControls)
    {
      super();
    }
    
    public void playFromUri(Uri paramUri, Bundle paramBundle)
    {
      mControlsFwk.playFromUri(paramUri, paramBundle);
    }
  }
  
  @RequiresApi(24)
  public static class TransportControlsApi24
    extends MediaControllerCompat.TransportControlsApi23
  {
    public TransportControlsApi24(MediaController.TransportControls paramTransportControls)
    {
      super();
    }
    
    public void prepare()
    {
      mControlsFwk.prepare();
    }
    
    public void prepareFromMediaId(String paramString, Bundle paramBundle)
    {
      mControlsFwk.prepareFromMediaId(paramString, paramBundle);
    }
    
    public void prepareFromSearch(String paramString, Bundle paramBundle)
    {
      mControlsFwk.prepareFromSearch(paramString, paramBundle);
    }
    
    public void prepareFromUri(Uri paramUri, Bundle paramBundle)
    {
      mControlsFwk.prepareFromUri(paramUri, paramBundle);
    }
  }
  
  @RequiresApi(29)
  public static class TransportControlsApi29
    extends MediaControllerCompat.TransportControlsApi24
  {
    public TransportControlsApi29(MediaController.TransportControls paramTransportControls)
    {
      super();
    }
    
    public void setPlaybackSpeed(float paramFloat)
    {
      if (paramFloat != 0.0F)
      {
        e.n(mControlsFwk, paramFloat);
        return;
      }
      throw new IllegalArgumentException("speed must not be zero");
    }
  }
  
  public static class TransportControlsBase
    extends MediaControllerCompat.TransportControls
  {
    private IMediaSession mBinder;
    
    public TransportControlsBase(IMediaSession paramIMediaSession)
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
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaControllerCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */