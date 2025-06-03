package android.support.v4.media.session;

import android.media.session.MediaController.TransportControls;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
class MediaControllerCompat$TransportControlsApi23
  extends MediaControllerCompat.TransportControlsApi21
{
  public MediaControllerCompat$TransportControlsApi23(MediaController.TransportControls paramTransportControls)
  {
    super(paramTransportControls);
  }
  
  public void playFromUri(Uri paramUri, Bundle paramBundle)
  {
    mControlsFwk.playFromUri(paramUri, paramBundle);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaControllerCompat.TransportControlsApi23
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */