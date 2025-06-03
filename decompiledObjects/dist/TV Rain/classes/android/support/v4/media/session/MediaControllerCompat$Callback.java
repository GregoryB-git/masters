package android.support.v4.media.session;

import android.media.MediaMetadata;
import android.media.session.MediaController.Callback;
import android.media.session.MediaController.PlaybackInfo;
import android.media.session.MediaSession.QueueItem;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder.DeathRecipient;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.media.AudioAttributesCompat;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.List;

public abstract class MediaControllerCompat$Callback
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

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaControllerCompat.Callback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */