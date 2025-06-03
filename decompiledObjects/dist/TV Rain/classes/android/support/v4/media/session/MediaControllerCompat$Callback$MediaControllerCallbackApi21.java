package android.support.v4.media.session;

import android.media.MediaMetadata;
import android.media.session.MediaController.Callback;
import android.media.session.MediaController.PlaybackInfo;
import android.media.session.MediaSession.QueueItem;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import androidx.annotation.RequiresApi;
import androidx.media.AudioAttributesCompat;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.List;

@RequiresApi(21)
class MediaControllerCompat$Callback$MediaControllerCallbackApi21
  extends MediaController.Callback
{
  private final WeakReference<MediaControllerCompat.Callback> mCallback;
  
  public MediaControllerCompat$Callback$MediaControllerCallbackApi21(MediaControllerCompat.Callback paramCallback)
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

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaControllerCompat.Callback.MediaControllerCallbackApi21
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */