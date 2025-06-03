package androidx.core.location;

import android.location.Location;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import f0;
import u2;

@RequiresApi(26)
class LocationCompat$Api26Impl
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

/* Location:
 * Qualified Name:     androidx.core.location.LocationCompat.Api26Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */