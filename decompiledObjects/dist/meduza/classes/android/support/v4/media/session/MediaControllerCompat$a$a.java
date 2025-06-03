package android.support.v4.media.session;

import android.media.MediaMetadata;
import android.media.session.MediaController.Callback;
import android.media.session.MediaController.PlaybackInfo;
import android.media.session.MediaSession.QueueItem;
import android.media.session.PlaybackState;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.media.MediaMetadataCompat;
import androidx.media.AudioAttributesCompat;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.List;

public final class MediaControllerCompat$a$a
  extends MediaController.Callback
{
  public final WeakReference<MediaControllerCompat.a> a;
  
  public MediaControllerCompat$a$a(MediaControllerCompat.a parama)
  {
    a = new WeakReference(parama);
  }
  
  public final void onAudioInfoChanged(MediaController.PlaybackInfo paramPlaybackInfo)
  {
    if ((MediaControllerCompat.a)a.get() != null)
    {
      paramPlaybackInfo.getPlaybackType();
      paramPlaybackInfo.getAudioAttributes();
      int i = Build.VERSION.SDK_INT;
      AudioAttributesCompat localAudioAttributesCompat = new androidx/media/AudioAttributesCompat;
      paramPlaybackInfo.getVolumeControl();
      paramPlaybackInfo.getMaxVolume();
      paramPlaybackInfo.getCurrentVolume();
    }
  }
  
  public final void onExtrasChanged(Bundle paramBundle)
  {
    MediaSessionCompat.a(paramBundle);
    paramBundle = (MediaControllerCompat.a)a.get();
  }
  
  public final void onMetadataChanged(MediaMetadata paramMediaMetadata)
  {
    if ((MediaControllerCompat.a)a.get() != null)
    {
      Object localObject = MediaMetadataCompat.d;
      if (paramMediaMetadata != null)
      {
        localObject = Parcel.obtain();
        paramMediaMetadata.writeToParcel((Parcel)localObject, 0);
        ((Parcel)localObject).setDataPosition(0);
        MediaMetadataCompat localMediaMetadataCompat = (MediaMetadataCompat)MediaMetadataCompat.CREATOR.createFromParcel((Parcel)localObject);
        ((Parcel)localObject).recycle();
        b = paramMediaMetadata;
      }
    }
  }
  
  public final void onPlaybackStateChanged(PlaybackState paramPlaybackState)
  {
    MediaControllerCompat.a locala = (MediaControllerCompat.a)a.get();
    if ((locala != null) && (c == null)) {
      PlaybackStateCompat.a(paramPlaybackState);
    }
  }
  
  public final void onQueueChanged(List<MediaSession.QueueItem> paramList)
  {
    if ((MediaControllerCompat.a)a.get() != null) {
      MediaSessionCompat.QueueItem.a(paramList);
    }
  }
  
  public final void onQueueTitleChanged(CharSequence paramCharSequence)
  {
    paramCharSequence = (MediaControllerCompat.a)a.get();
  }
  
  public final void onSessionDestroyed()
  {
    MediaControllerCompat.a locala = (MediaControllerCompat.a)a.get();
  }
  
  public final void onSessionEvent(String paramString, Bundle paramBundle)
  {
    MediaSessionCompat.a(paramBundle);
    paramString = (MediaControllerCompat.a)a.get();
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaControllerCompat.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */