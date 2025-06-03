package androidx.core.location;

import android.location.GnssStatus;
import android.location.GnssStatus.Callback;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;

@RequiresApi(30)
class LocationManagerCompat$GnssStatusTransport
  extends GnssStatus.Callback
{
  public final GnssStatusCompat.Callback mCallback;
  
  public LocationManagerCompat$GnssStatusTransport(GnssStatusCompat.Callback paramCallback)
  {
    boolean bool;
    if (paramCallback != null) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool, "invalid null callback");
    mCallback = paramCallback;
  }
  
  public void onFirstFix(int paramInt)
  {
    mCallback.onFirstFix(paramInt);
  }
  
  public void onSatelliteStatusChanged(GnssStatus paramGnssStatus)
  {
    mCallback.onSatelliteStatusChanged(GnssStatusCompat.wrap(paramGnssStatus));
  }
  
  public void onStarted()
  {
    mCallback.onStarted();
  }
  
  public void onStopped()
  {
    mCallback.onStopped();
  }
}

/* Location:
 * Qualified Name:     androidx.core.location.LocationManagerCompat.GnssStatusTransport
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */