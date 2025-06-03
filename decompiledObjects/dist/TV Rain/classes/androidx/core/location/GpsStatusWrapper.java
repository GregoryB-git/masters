package androidx.core.location;

import android.location.GpsSatellite;
import android.location.GpsStatus;
import androidx.annotation.GuardedBy;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import java.util.Iterator;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
class GpsStatusWrapper
  extends GnssStatusCompat
{
  private static final int BEIDOU_PRN_COUNT = 35;
  private static final int BEIDOU_PRN_OFFSET = 200;
  private static final int GLONASS_PRN_COUNT = 24;
  private static final int GLONASS_PRN_OFFSET = 64;
  private static final int GPS_PRN_COUNT = 32;
  private static final int GPS_PRN_OFFSET = 0;
  private static final int QZSS_SVID_MAX = 200;
  private static final int QZSS_SVID_MIN = 193;
  private static final int SBAS_PRN_MAX = 64;
  private static final int SBAS_PRN_MIN = 33;
  private static final int SBAS_PRN_OFFSET = -87;
  @GuardedBy("mWrapped")
  private Iterator<GpsSatellite> mCachedIterator;
  @GuardedBy("mWrapped")
  private int mCachedIteratorPosition;
  @GuardedBy("mWrapped")
  private GpsSatellite mCachedSatellite;
  @GuardedBy("mWrapped")
  private int mCachedSatelliteCount;
  private final GpsStatus mWrapped;
  
  public GpsStatusWrapper(GpsStatus paramGpsStatus)
  {
    paramGpsStatus = (GpsStatus)Preconditions.checkNotNull(paramGpsStatus);
    mWrapped = paramGpsStatus;
    mCachedSatelliteCount = -1;
    mCachedIterator = paramGpsStatus.getSatellites().iterator();
    mCachedIteratorPosition = -1;
    mCachedSatellite = null;
  }
  
  private static int getConstellationFromPrn(int paramInt)
  {
    if ((paramInt > 0) && (paramInt <= 32)) {
      return 1;
    }
    if ((paramInt >= 33) && (paramInt <= 64)) {
      return 2;
    }
    if ((paramInt > 64) && (paramInt <= 88)) {
      return 3;
    }
    if ((paramInt > 200) && (paramInt <= 235)) {
      return 5;
    }
    if ((paramInt >= 193) && (paramInt <= 200)) {
      return 4;
    }
    return 0;
  }
  
  private GpsSatellite getSatellite(int paramInt)
  {
    synchronized (mWrapped)
    {
      if (paramInt < mCachedIteratorPosition)
      {
        mCachedIterator = mWrapped.getSatellites().iterator();
        mCachedIteratorPosition = -1;
      }
      for (;;)
      {
        int i = mCachedIteratorPosition;
        if (i >= paramInt) {
          break;
        }
        mCachedIteratorPosition = (i + 1);
        if (!mCachedIterator.hasNext())
        {
          mCachedSatellite = null;
          break;
        }
        mCachedSatellite = ((GpsSatellite)mCachedIterator.next());
      }
      GpsSatellite localGpsSatellite = mCachedSatellite;
      return (GpsSatellite)Preconditions.checkNotNull(localGpsSatellite);
    }
  }
  
  private static int getSvidFromPrn(int paramInt)
  {
    int i = getConstellationFromPrn(paramInt);
    if (i != 2)
    {
      if (i != 3)
      {
        if (i == 5) {
          paramInt -= 200;
        }
      }
      else {
        paramInt -= 64;
      }
    }
    else {
      paramInt += 87;
    }
    return paramInt;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof GpsStatusWrapper)) {
      return false;
    }
    paramObject = (GpsStatusWrapper)paramObject;
    return mWrapped.equals(mWrapped);
  }
  
  public float getAzimuthDegrees(int paramInt)
  {
    return getSatellite(paramInt).getAzimuth();
  }
  
  public float getBasebandCn0DbHz(int paramInt)
  {
    throw new UnsupportedOperationException();
  }
  
  public float getCarrierFrequencyHz(int paramInt)
  {
    throw new UnsupportedOperationException();
  }
  
  public float getCn0DbHz(int paramInt)
  {
    return getSatellite(paramInt).getSnr();
  }
  
  public int getConstellationType(int paramInt)
  {
    return getConstellationFromPrn(getSatellite(paramInt).getPrn());
  }
  
  public float getElevationDegrees(int paramInt)
  {
    return getSatellite(paramInt).getElevation();
  }
  
  public int getSatelliteCount()
  {
    synchronized (mWrapped)
    {
      if (mCachedSatelliteCount == -1)
      {
        Iterator localIterator = mWrapped.getSatellites().iterator();
        while (localIterator.hasNext())
        {
          GpsSatellite localGpsSatellite = (GpsSatellite)localIterator.next();
          mCachedSatelliteCount += 1;
        }
        mCachedSatelliteCount += 1;
      }
      int i = mCachedSatelliteCount;
      return i;
    }
  }
  
  public int getSvid(int paramInt)
  {
    return getSvidFromPrn(getSatellite(paramInt).getPrn());
  }
  
  public boolean hasAlmanacData(int paramInt)
  {
    return getSatellite(paramInt).hasAlmanac();
  }
  
  public boolean hasBasebandCn0DbHz(int paramInt)
  {
    return false;
  }
  
  public boolean hasCarrierFrequencyHz(int paramInt)
  {
    return false;
  }
  
  public boolean hasEphemerisData(int paramInt)
  {
    return getSatellite(paramInt).hasEphemeris();
  }
  
  public int hashCode()
  {
    return mWrapped.hashCode();
  }
  
  public boolean usedInFix(int paramInt)
  {
    return getSatellite(paramInt).usedInFix();
  }
}

/* Location:
 * Qualified Name:     androidx.core.location.GpsStatusWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */