package androidx.core.location;

import android.location.LocationManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import c;

@RequiresApi(28)
class LocationManagerCompat$Api28Impl
{
  @DoNotInline
  public static String getGnssHardwareModelName(LocationManager paramLocationManager)
  {
    return c.m(paramLocationManager);
  }
  
  @DoNotInline
  public static int getGnssYearOfHardware(LocationManager paramLocationManager)
  {
    return c.b(paramLocationManager);
  }
  
  @DoNotInline
  public static boolean isLocationEnabled(LocationManager paramLocationManager)
  {
    return c.t(paramLocationManager);
  }
}

/* Location:
 * Qualified Name:     androidx.core.location.LocationManagerCompat.Api28Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */