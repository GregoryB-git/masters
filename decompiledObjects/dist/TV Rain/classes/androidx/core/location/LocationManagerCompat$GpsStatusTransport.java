package androidx.core.location;

import android.location.GpsStatus;
import android.location.GpsStatus.Listener;
import android.location.LocationManager;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.core.util.Preconditions;
import java.util.concurrent.Executor;

class LocationManagerCompat$GpsStatusTransport
  implements GpsStatus.Listener
{
  public final GnssStatusCompat.Callback mCallback;
  @Nullable
  public volatile Executor mExecutor;
  private final LocationManager mLocationManager;
  
  public LocationManagerCompat$GpsStatusTransport(LocationManager paramLocationManager, GnssStatusCompat.Callback paramCallback)
  {
    boolean bool;
    if (paramCallback != null) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool, "invalid null callback");
    mLocationManager = paramLocationManager;
    mCallback = paramCallback;
  }
  
  @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
  public void onGpsStatusChanged(int paramInt)
  {
    Executor localExecutor = mExecutor;
    if (localExecutor == null) {
      return;
    }
    if (paramInt != 1)
    {
      if (paramInt != 2)
      {
        GpsStatus localGpsStatus;
        if (paramInt != 3)
        {
          if (paramInt == 4)
          {
            localGpsStatus = mLocationManager.getGpsStatus(null);
            if (localGpsStatus != null) {
              localExecutor.execute(new f(this, localExecutor, GnssStatusCompat.wrap(localGpsStatus), 0));
            }
          }
        }
        else
        {
          localGpsStatus = mLocationManager.getGpsStatus(null);
          if (localGpsStatus != null) {
            localExecutor.execute(new e(this, localExecutor, localGpsStatus.getTimeToFirstFix(), 0));
          }
        }
      }
      else
      {
        localExecutor.execute(new d(this, localExecutor, 1));
      }
    }
    else {
      localExecutor.execute(new d(this, localExecutor, 0));
    }
  }
  
  public void register(Executor paramExecutor)
  {
    boolean bool;
    if (mExecutor == null) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkState(bool);
    mExecutor = paramExecutor;
  }
  
  public void unregister()
  {
    mExecutor = null;
  }
}

/* Location:
 * Qualified Name:     androidx.core.location.LocationManagerCompat.GpsStatusTransport
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */