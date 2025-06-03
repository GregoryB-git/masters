package androidx.core.location;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;

public abstract class GnssStatusCompat$Callback
{
  public void onFirstFix(@IntRange(from=0L) int paramInt) {}
  
  public void onSatelliteStatusChanged(@NonNull GnssStatusCompat paramGnssStatusCompat) {}
  
  public void onStarted() {}
  
  public void onStopped() {}
}

/* Location:
 * Qualified Name:     androidx.core.location.GnssStatusCompat.Callback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */