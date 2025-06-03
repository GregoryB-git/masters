package androidx.core.location;

import android.location.GnssMeasurementsEvent.Callback;
import android.location.GnssStatus.Callback;
import android.location.LocationManager;
import android.os.Handler;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Preconditions;
import java.util.concurrent.Executor;

@RequiresApi(24)
class LocationManagerCompat$Api24Impl
{
  @DoNotInline
  @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
  public static boolean registerGnssMeasurementsCallback(@NonNull LocationManager paramLocationManager, @NonNull GnssMeasurementsEvent.Callback paramCallback, @NonNull Handler paramHandler)
  {
    return paramLocationManager.registerGnssMeasurementsCallback(paramCallback, paramHandler);
  }
  
  @DoNotInline
  @RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
  public static boolean registerGnssStatusCallback(LocationManager paramLocationManager, Handler paramHandler, Executor paramExecutor, GnssStatusCompat.Callback paramCallback)
  {
    boolean bool;
    if (paramHandler != null) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool);
    synchronized (LocationManagerCompat.GnssListenersHolder.sGnssStatusListeners)
    {
      LocationManagerCompat.PreRGnssStatusTransport localPreRGnssStatusTransport = (LocationManagerCompat.PreRGnssStatusTransport)???.get(paramCallback);
      if (localPreRGnssStatusTransport == null)
      {
        localPreRGnssStatusTransport = new androidx/core/location/LocationManagerCompat$PreRGnssStatusTransport;
        localPreRGnssStatusTransport.<init>(paramCallback);
      }
      else
      {
        localPreRGnssStatusTransport.unregister();
      }
      localPreRGnssStatusTransport.register(paramExecutor);
      if (paramLocationManager.registerGnssStatusCallback(localPreRGnssStatusTransport, paramHandler))
      {
        ???.put(paramCallback, localPreRGnssStatusTransport);
        return true;
      }
      return false;
    }
  }
  
  @DoNotInline
  public static void unregisterGnssMeasurementsCallback(@NonNull LocationManager paramLocationManager, @NonNull GnssMeasurementsEvent.Callback paramCallback)
  {
    paramLocationManager.unregisterGnssMeasurementsCallback(paramCallback);
  }
  
  @DoNotInline
  public static void unregisterGnssStatusCallback(LocationManager paramLocationManager, Object paramObject)
  {
    if ((paramObject instanceof LocationManagerCompat.PreRGnssStatusTransport)) {
      ((LocationManagerCompat.PreRGnssStatusTransport)paramObject).unregister();
    }
    paramLocationManager.unregisterGnssStatusCallback((GnssStatus.Callback)paramObject);
  }
}

/* Location:
 * Qualified Name:     androidx.core.location.LocationManagerCompat.Api24Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */