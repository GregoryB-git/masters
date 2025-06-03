package androidx.core.location;

import android.location.Location;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(17)
class LocationCompat$Api17Impl
{
  @DoNotInline
  public static long getElapsedRealtimeNanos(Location paramLocation)
  {
    return paramLocation.getElapsedRealtimeNanos();
  }
}

/* Location:
 * Qualified Name:     androidx.core.location.LocationCompat.Api17Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */