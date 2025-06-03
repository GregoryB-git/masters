package androidx.core.location;

import android.location.GnssMeasurementsEvent.Callback;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationRequest;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import d;
import g;
import java.util.concurrent.Executor;

@RequiresApi(31)
class LocationManagerCompat$Api31Impl
{
  @DoNotInline
  public static boolean hasProvider(LocationManager paramLocationManager, @NonNull String paramString)
  {
    return g.r(paramLocationManager, paramString);
  }
  
  @DoNotInline
  @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
  public static boolean registerGnssMeasurementsCallback(@NonNull LocationManager paramLocationManager, @NonNull Executor paramExecutor, @NonNull GnssMeasurementsEvent.Callback paramCallback)
  {
    return d.A(paramLocationManager, paramExecutor, paramCallback);
  }
  
  @DoNotInline
  @RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
  public static void requestLocationUpdates(LocationManager paramLocationManager, @NonNull String paramString, @NonNull LocationRequest paramLocationRequest, @NonNull Executor paramExecutor, @NonNull LocationListener paramLocationListener)
  {
    g.m(paramLocationManager, paramString, paramLocationRequest, paramExecutor, paramLocationListener);
  }
}

/* Location:
 * Qualified Name:     androidx.core.location.LocationManagerCompat.Api31Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */