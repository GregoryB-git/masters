package android.support.v4.media.session;

import android.media.MediaMetadata;
import android.media.session.MediaController.Callback;
import android.media.session.MediaController.PlaybackInfo;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import androidx.media.AudioAttributesCompat;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.List;

public class MediaControllerCompat$a$a
  extends MediaController.Callback
{
  public final WeakReference a;
  
  public MediaControllerCompat$a$a(MediaControllerCompat.a parama)
  {
    a = new WeakReference(parama);
  }
  
  public void onAudioInfoChanged(MediaController.PlaybackInfo paramPlaybackInfo)
  {
    MediaControllerCompat.a locala = (MediaControllerCompat.a)a.get();
    if (locala != null) {
      locala.a(new MediaControllerCompat.d(paramPlaybackInfo.getPlaybackType(), AudioAttributesCompat.f(paramPlaybackInfo.getAudioAttributes()), paramPlaybackInfo.getVolumeControl(), paramPlaybackInfo.getMaxVolume(), paramPlaybackInfo.getCurrentVolume()));
    }
  }
  
  public void onExtrasChanged(Bundle paramBundle)
  {
    MediaSessionCompat.a(paramBundle);
    MediaControllerCompat.a locala = (MediaControllerCompat.a)a.get();
    if (locala != null) {
      locala.c(paramBundle);
    }
  }
  
  public void onMetadataChanged(MediaMetadata paramMediaMetadata)
  {
    MediaControllerCompat.a locala = (MediaControllerCompat.a)a.get();
    if (locala != null) {
      locala.d(MediaMetadataCompat.b(paramMediaMetadata));
    }
  }
  
  public void onPlaybackStateChanged(PlaybackState paramPlaybackState)
  {
    MediaControllerCompat.a locala = (MediaControllerCompat.a)a.get();
    if ((locala != null) && (c == null)) {
      locala.e(PlaybackStateCompat.a(paramPlaybackState));
    }
  }
  
  public void onQueueChanged(List paramList)
  {
    MediaControllerCompat.a locala = (MediaControllerCompat.a)a.get();
    if (locala != null) {
      locala.f(MediaSessionCompat.QueueItem.b(paramList));
    }
  }
  
  public void onQueueTitleChanged(CharSequence paramCharSequence)
  {
    MediaControllerCompat.a locala = (MediaControllerCompat.a)a.get();
    if (locala != null) {
      locala.g(paramCharSequence);
    }
  }
  
  public void onSessionDestroyed()
  {
    MediaControllerCompat.a locala = (MediaControllerCompat.a)a.get();
    if (locala != null) {
      locala.i();
    }
  }
  
  public void onSessionEvent(String paramString, Bundle paramBundle)
  {
    MediaSessionCompat.a(paramBundle);
    MediaControllerCompat.a locala = (MediaControllerCompat.a)a.get();
    if (locala != null) {
      locala.j(paramString, paramBundle);
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaControllerCompat.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */