package androidx.core.location;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build.VERSION;
import android.os.Handler;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Consumer;
import d;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.concurrent.Executor;
import v2;

@RequiresApi(30)
class LocationManagerCompat$Api30Impl
{
  private static Class<?> sLocationRequestClass;
  private static Method sRequestLocationUpdatesExecutorMethod;
  
  @DoNotInline
  @RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
  public static void getCurrentLocation(LocationManager paramLocationManager, @NonNull String paramString, @Nullable androidx.core.os.CancellationSignal paramCancellationSignal, @NonNull Executor paramExecutor, @NonNull Consumer<Location> paramConsumer)
  {
    if (paramCancellationSignal != null) {
      paramCancellationSignal = (android.os.CancellationSignal)paramCancellationSignal.getCancellationSignalObject();
    } else {
      paramCancellationSignal = null;
    }
    Objects.requireNonNull(paramConsumer);
    d.s(paramLocationManager, paramString, paramCancellationSignal, paramExecutor, new v2(paramConsumer));
  }
  
  @DoNotInline
  @RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
  public static boolean registerGnssStatusCallback(LocationManager paramLocationManager, Handler paramHandler, Executor paramExecutor, GnssStatusCompat.Callback paramCallback)
  {
    synchronized (LocationManagerCompat.GnssListenersHolder.sGnssStatusListeners)
    {
      LocationManagerCompat.GnssStatusTransport localGnssStatusTransport = (LocationManagerCompat.GnssStatusTransport)???.get(paramCallback);
      paramHandler = localGnssStatusTransport;
      if (localGnssStatusTransport == null)
      {
        paramHandler = new androidx/core/location/LocationManagerCompat$GnssStatusTransport;
        paramHandler.<init>(paramCallback);
      }
      if (d.B(paramLocationManager, paramExecutor, paramHandler))
      {
        ???.put(paramCallback, paramHandler);
        return true;
      }
      return false;
    }
  }
  
  @DoNotInline
  public static boolean tryRequestLocationUpdates(LocationManager paramLocationManager, String paramString, LocationRequestCompat paramLocationRequestCompat, Executor paramExecutor, LocationListenerCompat paramLocationListenerCompat)
  {
    if (Build.VERSION.SDK_INT >= 30) {}
    try
    {
      if (sLocationRequestClass == null) {
        sLocationRequestClass = Class.forName("android.location.LocationRequest");
      }
      if (sRequestLocationUpdatesExecutorMethod == null)
      {
        Method localMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", new Class[] { sLocationRequestClass, Executor.class, LocationListener.class });
        sRequestLocationUpdatesExecutorMethod = localMethod;
        localMethod.setAccessible(true);
      }
      paramString = paramLocationRequestCompat.toLocationRequest(paramString);
      if (paramString != null)
      {
        sRequestLocationUpdatesExecutorMethod.invoke(paramLocationManager, new Object[] { paramString, paramExecutor, paramLocationListenerCompat });
        return true;
      }
    }
    catch (NoSuchMethodException|InvocationTargetException|IllegalAccessException|ClassNotFoundException|UnsupportedOperationException paramLocationManager)
    {
      for (;;) {}
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     androidx.core.location.LocationManagerCompat.Api30Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */