package androidx.core.location;

import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RequiresApi(19)
class LocationManagerCompat$Api19Impl
{
  private static Class<?> sLocationRequestClass;
  private static Method sRequestLocationUpdatesLooperMethod;
  
  @DoNotInline
  public static boolean tryRequestLocationUpdates(LocationManager paramLocationManager, String paramString, LocationRequestCompat paramLocationRequestCompat, LocationListenerCompat paramLocationListenerCompat, Looper paramLooper)
  {
    try
    {
      if (sLocationRequestClass == null) {
        sLocationRequestClass = Class.forName("android.location.LocationRequest");
      }
      if (sRequestLocationUpdatesLooperMethod == null)
      {
        Method localMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", new Class[] { sLocationRequestClass, LocationListener.class, Looper.class });
        sRequestLocationUpdatesLooperMethod = localMethod;
        localMethod.setAccessible(true);
      }
      paramString = paramLocationRequestCompat.toLocationRequest(paramString);
      if (paramString != null)
      {
        sRequestLocationUpdatesLooperMethod.invoke(paramLocationManager, new Object[] { paramString, paramLocationListenerCompat, paramLooper });
        return true;
      }
    }
    catch (NoSuchMethodException|InvocationTargetException|IllegalAccessException|ClassNotFoundException|UnsupportedOperationException paramLocationManager)
    {
      for (;;) {}
    }
    return false;
  }
  
  @DoNotInline
  @RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
  public static boolean tryRequestLocationUpdates(LocationManager paramLocationManager, String arg1, LocationRequestCompat paramLocationRequestCompat, LocationManagerCompat.LocationListenerTransport paramLocationListenerTransport)
  {
    try
    {
      if (sLocationRequestClass == null) {
        sLocationRequestClass = Class.forName("android.location.LocationRequest");
      }
      if (sRequestLocationUpdatesLooperMethod == null)
      {
        Method localMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", new Class[] { sLocationRequestClass, LocationListener.class, Looper.class });
        sRequestLocationUpdatesLooperMethod = localMethod;
        localMethod.setAccessible(true);
      }
      paramLocationRequestCompat = paramLocationRequestCompat.toLocationRequest(???);
      if (paramLocationRequestCompat != null) {
        synchronized (LocationManagerCompat.sLocationListeners)
        {
          sRequestLocationUpdatesLooperMethod.invoke(paramLocationManager, new Object[] { paramLocationRequestCompat, paramLocationListenerTransport, Looper.getMainLooper() });
          LocationManagerCompat.registerLocationListenerTransport(paramLocationManager, paramLocationListenerTransport);
          return true;
        }
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
 * Qualified Name:     androidx.core.location.LocationManagerCompat.Api19Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */