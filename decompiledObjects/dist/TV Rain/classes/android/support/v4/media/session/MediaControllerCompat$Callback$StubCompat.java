package android.support.v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.List;

class MediaControllerCompat$Callback$StubCompat
  extends IMediaControllerCallback.Stub
{
  private final WeakReference<MediaControllerCompat.Callback> mCallback;
  
  public MediaControllerCompat$Callback$StubCompat(MediaControllerCompat.Callback paramCallback)
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

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaControllerCompat.Callback.StubCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */