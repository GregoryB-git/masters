package androidx.core.location;

import android.location.Location;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;
import f0;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import u2;

public final class LocationCompat
{
  public static final String EXTRA_BEARING_ACCURACY = "bearingAccuracy";
  public static final String EXTRA_IS_MOCK = "mockLocation";
  public static final String EXTRA_MSL_ALTITUDE = "androidx.core.location.extra.MSL_ALTITUDE";
  public static final String EXTRA_MSL_ALTITUDE_ACCURACY = "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY";
  public static final String EXTRA_SPEED_ACCURACY = "speedAccuracy";
  public static final String EXTRA_VERTICAL_ACCURACY = "verticalAccuracy";
  @Nullable
  private static Method sSetIsFromMockProviderMethod;
  
  private static boolean containsExtra(@NonNull Location paramLocation, String paramString)
  {
    paramLocation = paramLocation.getExtras();
    boolean bool;
    if ((paramLocation != null) && (paramLocation.containsKey(paramString))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static float getBearingAccuracyDegrees(@NonNull Location paramLocation)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return Api26Impl.getBearingAccuracyDegrees(paramLocation);
    }
    paramLocation = paramLocation.getExtras();
    if (paramLocation == null) {
      return 0.0F;
    }
    return paramLocation.getFloat("bearingAccuracy", 0.0F);
  }
  
  public static long getElapsedRealtimeMillis(@NonNull Location paramLocation)
  {
    return TimeUnit.NANOSECONDS.toMillis(Api17Impl.getElapsedRealtimeNanos(paramLocation));
  }
  
  public static long getElapsedRealtimeNanos(@NonNull Location paramLocation)
  {
    return Api17Impl.getElapsedRealtimeNanos(paramLocation);
  }
  
  @FloatRange(from=0.0D)
  public static float getMslAltitudeAccuracyMeters(@NonNull Location paramLocation)
  {
    Preconditions.checkState(hasMslAltitudeAccuracy(paramLocation), "The Mean Sea Level altitude accuracy of the location is not set.");
    return getOrCreateExtras(paramLocation).getFloat("androidx.core.location.extra.MSL_ALTITUDE_ACCURACY");
  }
  
  public static double getMslAltitudeMeters(@NonNull Location paramLocation)
  {
    Preconditions.checkState(hasMslAltitude(paramLocation), "The Mean Sea Level altitude of the location is not set.");
    return getOrCreateExtras(paramLocation).getDouble("androidx.core.location.extra.MSL_ALTITUDE");
  }
  
  private static Bundle getOrCreateExtras(@NonNull Location paramLocation)
  {
    Bundle localBundle1 = paramLocation.getExtras();
    Bundle localBundle2 = localBundle1;
    if (localBundle1 == null)
    {
      paramLocation.setExtras(new Bundle());
      localBundle2 = paramLocation.getExtras();
    }
    return localBundle2;
  }
  
  private static Method getSetIsFromMockProviderMethod()
    throws NoSuchMethodException
  {
    if (sSetIsFromMockProviderMethod == null)
    {
      Method localMethod = Location.class.getDeclaredMethod("setIsFromMockProvider", new Class[] { Boolean.TYPE });
      sSetIsFromMockProviderMethod = localMethod;
      localMethod.setAccessible(true);
    }
    return sSetIsFromMockProviderMethod;
  }
  
  public static float getSpeedAccuracyMetersPerSecond(@NonNull Location paramLocation)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return Api26Impl.getSpeedAccuracyMetersPerSecond(paramLocation);
    }
    paramLocation = paramLocation.getExtras();
    if (paramLocation == null) {
      return 0.0F;
    }
    return paramLocation.getFloat("speedAccuracy", 0.0F);
  }
  
  public static float getVerticalAccuracyMeters(@NonNull Location paramLocation)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return Api26Impl.getVerticalAccuracyMeters(paramLocation);
    }
    paramLocation = paramLocation.getExtras();
    if (paramLocation == null) {
      return 0.0F;
    }
    return paramLocation.getFloat("verticalAccuracy", 0.0F);
  }
  
  public static boolean hasBearingAccuracy(@NonNull Location paramLocation)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return Api26Impl.hasBearingAccuracy(paramLocation);
    }
    return containsExtra(paramLocation, "bearingAccuracy");
  }
  
  public static boolean hasMslAltitude(@NonNull Location paramLocation)
  {
    return containsExtra(paramLocation, "androidx.core.location.extra.MSL_ALTITUDE");
  }
  
  public static boolean hasMslAltitudeAccuracy(@NonNull Location paramLocation)
  {
    return containsExtra(paramLocation, "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY");
  }
  
  public static boolean hasSpeedAccuracy(@NonNull Location paramLocation)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return Api26Impl.hasSpeedAccuracy(paramLocation);
    }
    return containsExtra(paramLocation, "speedAccuracy");
  }
  
  public static boolean hasVerticalAccuracy(@NonNull Location paramLocation)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return Api26Impl.hasVerticalAccuracy(paramLocation);
    }
    return containsExtra(paramLocation, "verticalAccuracy");
  }
  
  public static boolean isMock(@NonNull Location paramLocation)
  {
    return Api18Impl.isMock(paramLocation);
  }
  
  private static void removeExtra(@NonNull Location paramLocation, String paramString)
  {
    Bundle localBundle = paramLocation.getExtras();
    if (localBundle != null)
    {
      localBundle.remove(paramString);
      if (localBundle.isEmpty()) {
        paramLocation.setExtras(null);
      }
    }
  }
  
  public static void removeMslAltitude(@NonNull Location paramLocation)
  {
    removeExtra(paramLocation, "androidx.core.location.extra.MSL_ALTITUDE");
  }
  
  public static void removeMslAltitudeAccuracy(@NonNull Location paramLocation)
  {
    removeExtra(paramLocation, "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY");
  }
  
  public static void setBearingAccuracyDegrees(@NonNull Location paramLocation, float paramFloat)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      Api26Impl.setBearingAccuracyDegrees(paramLocation, paramFloat);
    } else {
      getOrCreateExtras(paramLocation).putFloat("bearingAccuracy", paramFloat);
    }
  }
  
  public static void setMock(@NonNull Location paramLocation, boolean paramBoolean)
  {
    try
    {
      getSetIsFromMockProviderMethod().invoke(paramLocation, new Object[] { Boolean.valueOf(paramBoolean) });
      return;
    }
    catch (InvocationTargetException paramLocation)
    {
      throw new RuntimeException(paramLocation);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      paramLocation = new IllegalAccessError();
      paramLocation.initCause(localIllegalAccessException);
      throw paramLocation;
    }
    catch (NoSuchMethodException paramLocation)
    {
      NoSuchMethodError localNoSuchMethodError = new NoSuchMethodError();
      localNoSuchMethodError.initCause(paramLocation);
      throw localNoSuchMethodError;
    }
  }
  
  public static void setMslAltitudeAccuracyMeters(@NonNull Location paramLocation, @FloatRange(from=0.0D) float paramFloat)
  {
    getOrCreateExtras(paramLocation).putFloat("androidx.core.location.extra.MSL_ALTITUDE_ACCURACY", paramFloat);
  }
  
  public static void setMslAltitudeMeters(@NonNull Location paramLocation, double paramDouble)
  {
    getOrCreateExtras(paramLocation).putDouble("androidx.core.location.extra.MSL_ALTITUDE", paramDouble);
  }
  
  public static void setSpeedAccuracyMetersPerSecond(@NonNull Location paramLocation, float paramFloat)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      Api26Impl.setSpeedAccuracyMetersPerSecond(paramLocation, paramFloat);
    } else {
      getOrCreateExtras(paramLocation).putFloat("speedAccuracy", paramFloat);
    }
  }
  
  public static void setVerticalAccuracyMeters(@NonNull Location paramLocation, float paramFloat)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      Api26Impl.setVerticalAccuracyMeters(paramLocation, paramFloat);
    } else {
      getOrCreateExtras(paramLocation).putFloat("verticalAccuracy", paramFloat);
    }
  }
  
  @RequiresApi(17)
  public static class Api17Impl
  {
    @DoNotInline
    public static long getElapsedRealtimeNanos(Location paramLocation)
    {
      return paramLocation.getElapsedRealtimeNanos();
    }
  }
  
  @RequiresApi(18)
  public static class Api18Impl
  {
    @DoNotInline
    public static boolean isMock(Location paramLocation)
    {
      return paramLocation.isFromMockProvider();
    }
  }
  
  @RequiresApi(26)
  public static class Api26Impl
  {
    @DoNotInline
    public static float getBearingAccuracyDegrees(Location paramLocation)
    {
      return f0.A(paramLocation);
    }
    
    @DoNotInline
    public static float getSpeedAccuracyMetersPerSecond(Location paramLocation)
    {
      return f0.d(paramLocation);
    }
    
    @DoNotInline
    public static float getVerticalAccuracyMeters(Location paramLocation)
    {
      return u2.a(paramLocation);
    }
    
    @DoNotInline
    public static boolean hasBearingAccuracy(Location paramLocation)
    {
      return f0.D(paramLocation);
    }
    
    @DoNotInline
    public static boolean hasSpeedAccuracy(Location paramLocation)
    {
      return u2.v(paramLocation);
    }
    
    @DoNotInline
    public static boolean hasVerticalAccuracy(Location paramLocation)
    {
      return f0.y(paramLocation);
    }
    
    @DoNotInline
    public static void setBearingAccuracyDegrees(Location paramLocation, float paramFloat)
    {
      u2.u(paramLocation, paramFloat);
    }
    
    @DoNotInline
    public static void setSpeedAccuracyMetersPerSecond(Location paramLocation, float paramFloat)
    {
      f0.t(paramLocation, paramFloat);
    }
    
    @DoNotInline
    public static void setVerticalAccuracyMeters(Location paramLocation, float paramFloat)
    {
      f0.C(paramLocation, paramFloat);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.location.LocationCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */