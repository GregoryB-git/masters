package android.support.v4.media.session;

import android.media.session.MediaController.TransportControls;
import androidx.annotation.RequiresApi;
import e;

@RequiresApi(29)
class MediaControllerCompat$TransportControlsApi29
  extends MediaControllerCompat.TransportControlsApi24
{
  public MediaControllerCompat$TransportControlsApi29(MediaController.TransportControls paramTransportControls)
  {
    super(paramTransportControls);
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

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaControllerCompat.TransportControlsApi29
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */