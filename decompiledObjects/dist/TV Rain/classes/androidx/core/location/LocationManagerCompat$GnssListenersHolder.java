package androidx.core.location;

import androidx.annotation.GuardedBy;
import androidx.collection.SimpleArrayMap;

class LocationManagerCompat$GnssListenersHolder
{
  @GuardedBy("sGnssStatusListeners")
  public static final SimpleArrayMap<Object, Object> sGnssStatusListeners = new SimpleArrayMap();
}

/* Location:
 * Qualified Name:     androidx.core.location.LocationManagerCompat.GnssListenersHolder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */