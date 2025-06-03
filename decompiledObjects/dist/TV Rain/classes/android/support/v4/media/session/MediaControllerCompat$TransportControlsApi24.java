package android.support.v4.media.session;

import android.media.session.MediaController.TransportControls;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.RequiresApi;

@RequiresApi(24)
class MediaControllerCompat$TransportControlsApi24
  extends MediaControllerCompat.TransportControlsApi23
{
  public MediaControllerCompat$TransportControlsApi24(MediaController.TransportControls paramTransportControls)
  {
    super(paramTransportControls);
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

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaControllerCompat.TransportControlsApi24
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */