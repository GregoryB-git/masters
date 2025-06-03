package androidx.mediarouter.app;

import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaControllerCompat.Callback;

final class MediaRouteDynamicControllerDialog$MediaControllerCallback
  extends MediaControllerCompat.Callback
{
  public MediaRouteDynamicControllerDialog$MediaControllerCallback(MediaRouteDynamicControllerDialog paramMediaRouteDynamicControllerDialog) {}
  
  public void onMetadataChanged(MediaMetadataCompat paramMediaMetadataCompat)
  {
    MediaRouteDynamicControllerDialog localMediaRouteDynamicControllerDialog = this$0;
    if (paramMediaMetadataCompat == null) {
      paramMediaMetadataCompat = null;
    } else {
      paramMediaMetadataCompat = paramMediaMetadataCompat.getDescription();
    }
    mDescription = paramMediaMetadataCompat;
    this$0.reloadIconIfNeeded();
    this$0.updateMetadataViews();
  }
  
  public void onSessionDestroyed()
  {
    MediaRouteDynamicControllerDialog localMediaRouteDynamicControllerDialog = this$0;
    MediaControllerCompat localMediaControllerCompat = mMediaController;
    if (localMediaControllerCompat != null)
    {
      localMediaControllerCompat.unregisterCallback(mControllerCallback);
      this$0.mMediaController = null;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteDynamicControllerDialog.MediaControllerCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */