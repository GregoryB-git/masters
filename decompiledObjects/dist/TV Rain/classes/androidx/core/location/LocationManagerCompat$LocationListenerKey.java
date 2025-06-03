package androidx.core.location;

import androidx.core.util.ObjectsCompat;

class LocationManagerCompat$LocationListenerKey
{
  public final LocationListenerCompat mListener;
  public final String mProvider;
  
  public LocationManagerCompat$LocationListenerKey(String paramString, LocationListenerCompat paramLocationListenerCompat)
  {
    mProvider = ((String)ObjectsCompat.requireNonNull(paramString, "invalid null provider"));
    mListener = ((LocationListenerCompat)ObjectsCompat.requireNonNull(paramLocationListenerCompat, "invalid null listener"));
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof LocationListenerKey;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (LocationListenerKey)paramObject;
    bool1 = bool2;
    if (mProvider.equals(mProvider))
    {
      bool1 = bool2;
      if (mListener.equals(mListener)) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public int hashCode()
  {
    return ObjectsCompat.hash(new Object[] { mProvider, mListener });
  }
}

/* Location:
 * Qualified Name:     androidx.core.location.LocationManagerCompat.LocationListenerKey
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */