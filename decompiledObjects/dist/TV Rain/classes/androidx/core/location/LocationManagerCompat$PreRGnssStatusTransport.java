package androidx.core.location;

import android.location.GnssStatus;
import android.location.GnssStatus.Callback;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;
import java.util.concurrent.Executor;

@RequiresApi(24)
class LocationManagerCompat$PreRGnssStatusTransport
  extends GnssStatus.Callback
{
  public final GnssStatusCompat.Callback mCallback;
  @Nullable
  public volatile Executor mExecutor;
  
  public LocationManagerCompat$PreRGnssStatusTransport(GnssStatusCompat.Callback paramCallback)
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
    Executor localExecutor = mExecutor;
    if (localExecutor == null) {
      return;
    }
    localExecutor.execute(new e(this, localExecutor, paramInt, 1));
  }
  
  public void onSatelliteStatusChanged(GnssStatus paramGnssStatus)
  {
    Executor localExecutor = mExecutor;
    if (localExecutor == null) {
      return;
    }
    localExecutor.execute(new f(this, localExecutor, paramGnssStatus, 1));
  }
  
  public void onStarted()
  {
    Executor localExecutor = mExecutor;
    if (localExecutor == null) {
      return;
    }
    localExecutor.execute(new k(this, localExecutor, 0));
  }
  
  public void onStopped()
  {
    Executor localExecutor = mExecutor;
    if (localExecutor == null) {
      return;
    }
    localExecutor.execute(new k(this, localExecutor, 1));
  }
  
  public void register(Executor paramExecutor)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramExecutor != null) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    Preconditions.checkArgument(bool2, "invalid null executor");
    if (mExecutor == null) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    Preconditions.checkState(bool2);
    mExecutor = paramExecutor;
  }
  
  public void unregister()
  {
    mExecutor = null;
  }
}

/* Location:
 * Qualified Name:     androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */