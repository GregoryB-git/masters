package androidx.mediarouter.app;

import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaControllerCompat.Callback;
import android.support.v4.media.session.PlaybackStateCompat;

final class MediaRouteControllerDialog$MediaControllerCallback
  extends MediaControllerCompat.Callback
{
  public MediaRouteControllerDialog$MediaControllerCallback(MediaRouteControllerDialog paramMediaRouteControllerDialog) {}
  
  public void onMetadataChanged(MediaMetadataCompat paramMediaMetadataCompat)
  {
    MediaRouteControllerDialog localMediaRouteControllerDialog = this$0;
    if (paramMediaMetadataCompat == null) {
      paramMediaMetadataCompat = null;
    } else {
      paramMediaMetadataCompat = paramMediaMetadataCompat.getDescription();
    }
    mDescription = paramMediaMetadataCompat;
    this$0.updateArtIconIfNeeded();
    this$0.update(false);
  }
  
  public void onPlaybackStateChanged(PlaybackStateCompat paramPlaybackStateCompat)
  {
    MediaRouteControllerDialog localMediaRouteControllerDialog = this$0;
    mState = paramPlaybackStateCompat;
    localMediaRouteControllerDialog.update(false);
  }
  
  public void onSessionDestroyed()
  {
    MediaRouteControllerDialog localMediaRouteControllerDialog = this$0;
    MediaControllerCompat localMediaControllerCompat = mMediaController;
    if (localMediaControllerCompat != null)
    {
      localMediaControllerCompat.unregisterCallback(mControllerCallback);
      this$0.mMediaController = null;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteControllerDialog.MediaControllerCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */