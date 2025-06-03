package androidx.core.location;

import android.location.Location;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(18)
class LocationCompat$Api18Impl
{
  @DoNotInline
  public static boolean isMock(Location paramLocation)
  {
    return paramLocation.isFromMockProvider();
  }
}

/* Location:
 * Qualified Name:     androidx.core.location.LocationCompat.Api18Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */