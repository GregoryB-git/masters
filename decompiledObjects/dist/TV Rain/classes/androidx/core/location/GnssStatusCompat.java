package androidx.core.location;

import android.annotation.SuppressLint;
import android.location.GnssStatus;
import android.location.GpsStatus;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class GnssStatusCompat
{
  @SuppressLint({"InlinedApi"})
  public static final int CONSTELLATION_BEIDOU = 5;
  @SuppressLint({"InlinedApi"})
  public static final int CONSTELLATION_GALILEO = 6;
  @SuppressLint({"InlinedApi"})
  public static final int CONSTELLATION_GLONASS = 3;
  @SuppressLint({"InlinedApi"})
  public static final int CONSTELLATION_GPS = 1;
  @SuppressLint({"InlinedApi"})
  public static final int CONSTELLATION_IRNSS = 7;
  @SuppressLint({"InlinedApi"})
  public static final int CONSTELLATION_QZSS = 4;
  @SuppressLint({"InlinedApi"})
  public static final int CONSTELLATION_SBAS = 2;
  @SuppressLint({"InlinedApi"})
  public static final int CONSTELLATION_UNKNOWN = 0;
  
  @NonNull
  @RequiresApi(24)
  public static GnssStatusCompat wrap(@NonNull GnssStatus paramGnssStatus)
  {
    return new GnssStatusWrapper(paramGnssStatus);
  }
  
  @SuppressLint({"ReferencesDeprecated"})
  @NonNull
  public static GnssStatusCompat wrap(@NonNull GpsStatus paramGpsStatus)
  {
    return new GpsStatusWrapper(paramGpsStatus);
  }
  
  @FloatRange(from=0.0D, to=360.0D)
  public abstract float getAzimuthDegrees(@IntRange(from=0L) int paramInt);
  
  @FloatRange(from=0.0D, to=63.0D)
  public abstract float getBasebandCn0DbHz(@IntRange(from=0L) int paramInt);
  
  @FloatRange(from=0.0D)
  public abstract float getCarrierFrequencyHz(@IntRange(from=0L) int paramInt);
  
  @FloatRange(from=0.0D, to=63.0D)
  public abstract float getCn0DbHz(@IntRange(from=0L) int paramInt);
  
  public abstract int getConstellationType(@IntRange(from=0L) int paramInt);
  
  @FloatRange(from=-90.0D, to=90.0D)
  public abstract float getElevationDegrees(@IntRange(from=0L) int paramInt);
  
  @IntRange(from=0L)
  public abstract int getSatelliteCount();
  
  @IntRange(from=1L, to=200L)
  public abstract int getSvid(@IntRange(from=0L) int paramInt);
  
  public abstract boolean hasAlmanacData(@IntRange(from=0L) int paramInt);
  
  public abstract boolean hasBasebandCn0DbHz(@IntRange(from=0L) int paramInt);
  
  public abstract boolean hasCarrierFrequencyHz(@IntRange(from=0L) int paramInt);
  
  public abstract boolean hasEphemerisData(@IntRange(from=0L) int paramInt);
  
  public abstract boolean usedInFix(@IntRange(from=0L) int paramInt);
  
  public static abstract class Callback
  {
    public void onFirstFix(@IntRange(from=0L) int paramInt) {}
    
    public void onSatelliteStatusChanged(@NonNull GnssStatusCompat paramGnssStatusCompat) {}
    
    public void onStarted() {}
    
    public void onStopped() {}
  }
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static @interface ConstellationType {}
}

/* Location:
 * Qualified Name:     androidx.core.location.GnssStatusCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */