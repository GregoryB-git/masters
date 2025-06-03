package androidx.core.location;

import androidx.annotation.RequiresApi;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RequiresApi(19)
class LocationRequestCompat$Api19Impl
{
  private static Method sCreateFromDeprecatedProviderMethod;
  private static Class<?> sLocationRequestClass;
  private static Method sSetExpireInMethod;
  private static Method sSetFastestIntervalMethod;
  private static Method sSetNumUpdatesMethod;
  private static Method sSetQualityMethod;
  
  public static Object toLocationRequest(LocationRequestCompat paramLocationRequestCompat, String paramString)
  {
    try
    {
      if (sLocationRequestClass == null) {
        sLocationRequestClass = Class.forName("android.location.LocationRequest");
      }
      Method localMethod;
      if (sCreateFromDeprecatedProviderMethod == null)
      {
        localMethod = sLocationRequestClass.getDeclaredMethod("createFromDeprecatedProvider", new Class[] { String.class, Long.TYPE, Float.TYPE, Boolean.TYPE });
        sCreateFromDeprecatedProviderMethod = localMethod;
        localMethod.setAccessible(true);
      }
      paramString = sCreateFromDeprecatedProviderMethod.invoke(null, new Object[] { paramString, Long.valueOf(paramLocationRequestCompat.getIntervalMillis()), Float.valueOf(paramLocationRequestCompat.getMinUpdateDistanceMeters()), Boolean.FALSE });
      if (paramString == null) {
        return null;
      }
      if (sSetQualityMethod == null)
      {
        localMethod = sLocationRequestClass.getDeclaredMethod("setQuality", new Class[] { Integer.TYPE });
        sSetQualityMethod = localMethod;
        localMethod.setAccessible(true);
      }
      sSetQualityMethod.invoke(paramString, new Object[] { Integer.valueOf(paramLocationRequestCompat.getQuality()) });
      if (sSetFastestIntervalMethod == null)
      {
        localMethod = sLocationRequestClass.getDeclaredMethod("setFastestInterval", new Class[] { Long.TYPE });
        sSetFastestIntervalMethod = localMethod;
        localMethod.setAccessible(true);
      }
      sSetFastestIntervalMethod.invoke(paramString, new Object[] { Long.valueOf(paramLocationRequestCompat.getMinUpdateIntervalMillis()) });
      if (paramLocationRequestCompat.getMaxUpdates() < Integer.MAX_VALUE)
      {
        if (sSetNumUpdatesMethod == null)
        {
          localMethod = sLocationRequestClass.getDeclaredMethod("setNumUpdates", new Class[] { Integer.TYPE });
          sSetNumUpdatesMethod = localMethod;
          localMethod.setAccessible(true);
        }
        sSetNumUpdatesMethod.invoke(paramString, new Object[] { Integer.valueOf(paramLocationRequestCompat.getMaxUpdates()) });
      }
      if (paramLocationRequestCompat.getDurationMillis() < Long.MAX_VALUE)
      {
        if (sSetExpireInMethod == null)
        {
          localMethod = sLocationRequestClass.getDeclaredMethod("setExpireIn", new Class[] { Long.TYPE });
          sSetExpireInMethod = localMethod;
          localMethod.setAccessible(true);
        }
        sSetExpireInMethod.invoke(paramString, new Object[] { Long.valueOf(paramLocationRequestCompat.getDurationMillis()) });
      }
      return paramString;
    }
    catch (NoSuchMethodException|InvocationTargetException|IllegalAccessException|ClassNotFoundException paramLocationRequestCompat) {}
    return null;
  }
}

/* Location:
 * Qualified Name:     androidx.core.location.LocationRequestCompat.Api19Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */