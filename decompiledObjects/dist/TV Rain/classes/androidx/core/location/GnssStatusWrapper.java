package androidx.core.location;

import android.location.GnssStatus;
import android.os.Build.VERSION;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import d;
import f0;

@RequiresApi(24)
@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
class GnssStatusWrapper
  extends GnssStatusCompat
{
  private final GnssStatus mWrapped;
  
  public GnssStatusWrapper(Object paramObject)
  {
    mWrapped = ((GnssStatus)Preconditions.checkNotNull((GnssStatus)paramObject));
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof GnssStatusWrapper)) {
      return false;
    }
    paramObject = (GnssStatusWrapper)paramObject;
    return mWrapped.equals(mWrapped);
  }
  
  public float getAzimuthDegrees(int paramInt)
  {
    return mWrapped.getAzimuthDegrees(paramInt);
  }
  
  public float getBasebandCn0DbHz(int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 30) {
      return Api30Impl.getBasebandCn0DbHz(mWrapped, paramInt);
    }
    throw new UnsupportedOperationException();
  }
  
  public float getCarrierFrequencyHz(int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return Api26Impl.getCarrierFrequencyHz(mWrapped, paramInt);
    }
    throw new UnsupportedOperationException();
  }
  
  public float getCn0DbHz(int paramInt)
  {
    return mWrapped.getCn0DbHz(paramInt);
  }
  
  public int getConstellationType(int paramInt)
  {
    return mWrapped.getConstellationType(paramInt);
  }
  
  public float getElevationDegrees(int paramInt)
  {
    return mWrapped.getElevationDegrees(paramInt);
  }
  
  public int getSatelliteCount()
  {
    return mWrapped.getSatelliteCount();
  }
  
  public int getSvid(int paramInt)
  {
    return mWrapped.getSvid(paramInt);
  }
  
  public boolean hasAlmanacData(int paramInt)
  {
    return mWrapped.hasAlmanacData(paramInt);
  }
  
  public boolean hasBasebandCn0DbHz(int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 30) {
      return Api30Impl.hasBasebandCn0DbHz(mWrapped, paramInt);
    }
    return false;
  }
  
  public boolean hasCarrierFrequencyHz(int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return Api26Impl.hasCarrierFrequencyHz(mWrapped, paramInt);
    }
    return false;
  }
  
  public boolean hasEphemerisData(int paramInt)
  {
    return mWrapped.hasEphemerisData(paramInt);
  }
  
  public int hashCode()
  {
    return mWrapped.hashCode();
  }
  
  public boolean usedInFix(int paramInt)
  {
    return mWrapped.usedInFix(paramInt);
  }
  
  @RequiresApi(26)
  public static class Api26Impl
  {
    @DoNotInline
    public static float getCarrierFrequencyHz(GnssStatus paramGnssStatus, int paramInt)
    {
      return f0.c(paramGnssStatus, paramInt);
    }
    
    @DoNotInline
    public static boolean hasCarrierFrequencyHz(GnssStatus paramGnssStatus, int paramInt)
    {
      return f0.x(paramGnssStatus, paramInt);
    }
  }
  
  @RequiresApi(30)
  public static class Api30Impl
  {
    @DoNotInline
    public static float getBasebandCn0DbHz(GnssStatus paramGnssStatus, int paramInt)
    {
      return d.a(paramGnssStatus, paramInt);
    }
    
    @DoNotInline
    public static boolean hasBasebandCn0DbHz(GnssStatus paramGnssStatus, int paramInt)
    {
      return d.z(paramGnssStatus, paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.location.GnssStatusWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */