package androidx.core.location;

import android.annotation.SuppressLint;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.core.util.Consumer;
import java.util.concurrent.Executor;

final class LocationManagerCompat$CancellableLocationListener
  implements LocationListener
{
  private Consumer<Location> mConsumer;
  private final Executor mExecutor;
  private final LocationManager mLocationManager;
  private final Handler mTimeoutHandler;
  @Nullable
  public Runnable mTimeoutRunnable;
  @GuardedBy("this")
  private boolean mTriggered;
  
  public LocationManagerCompat$CancellableLocationListener(LocationManager paramLocationManager, Executor paramExecutor, Consumer<Location> paramConsumer)
  {
    mLocationManager = paramLocationManager;
    mExecutor = paramExecutor;
    mTimeoutHandler = new Handler(Looper.getMainLooper());
    mConsumer = paramConsumer;
  }
  
  @RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
  private void cleanup()
  {
    mConsumer = null;
    mLocationManager.removeUpdates(this);
    Runnable localRunnable = mTimeoutRunnable;
    if (localRunnable != null)
    {
      mTimeoutHandler.removeCallbacks(localRunnable);
      mTimeoutRunnable = null;
    }
  }
  
  @RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
  public void cancel()
  {
    try
    {
      if (mTriggered) {
        return;
      }
      mTriggered = true;
      cleanup();
      return;
    }
    finally {}
  }
  
  @RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
  public void onLocationChanged(@Nullable Location paramLocation)
  {
    try
    {
      if (mTriggered) {
        return;
      }
      mTriggered = true;
      Consumer localConsumer = mConsumer;
      mExecutor.execute(new c(localConsumer, paramLocation, 0));
      cleanup();
      return;
    }
    finally {}
  }
  
  @RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
  public void onProviderDisabled(@NonNull String paramString)
  {
    onLocationChanged(null);
  }
  
  public void onProviderEnabled(@NonNull String paramString) {}
  
  public void onStatusChanged(String paramString, int paramInt, Bundle paramBundle) {}
  
  @SuppressLint({"MissingPermission"})
  public void startTimeout(long paramLong)
  {
    try
    {
      if (mTriggered) {
        return;
      }
      b localb = new androidx/core/location/b;
      localb.<init>(this);
      mTimeoutRunnable = localb;
      mTimeoutHandler.postDelayed(localb, paramLong);
      return;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     androidx.core.location.LocationManagerCompat.CancellableLocationListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */