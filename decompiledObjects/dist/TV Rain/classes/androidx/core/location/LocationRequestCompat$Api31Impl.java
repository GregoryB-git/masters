package androidx.core.location;

import android.location.LocationRequest;
import android.location.LocationRequest.Builder;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(31)
class LocationRequestCompat$Api31Impl
{
  @DoNotInline
  public static LocationRequest toLocationRequest(LocationRequestCompat paramLocationRequestCompat)
  {
    return new LocationRequest.Builder(paramLocationRequestCompat.getIntervalMillis()).setQuality(paramLocationRequestCompat.getQuality()).setMinUpdateIntervalMillis(paramLocationRequestCompat.getMinUpdateIntervalMillis()).setDurationMillis(paramLocationRequestCompat.getDurationMillis()).setMaxUpdates(paramLocationRequestCompat.getMaxUpdates()).setMinUpdateDistanceMeters(paramLocationRequestCompat.getMinUpdateDistanceMeters()).setMaxUpdateDelayMillis(paramLocationRequestCompat.getMaxUpdateDelayMillis()).build();
  }
}

/* Location:
 * Qualified Name:     androidx.core.location.LocationRequestCompat.Api31Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */