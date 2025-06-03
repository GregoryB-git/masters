package androidx.core.location;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

public abstract interface LocationListenerCompat
  extends LocationListener
{
  public void onFlushComplete(int paramInt) {}
  
  public void onLocationChanged(@NonNull List<Location> paramList)
  {
    int i = paramList.size();
    for (int j = 0; j < i; j++) {
      onLocationChanged((Location)paramList.get(j));
    }
  }
  
  public void onProviderDisabled(@NonNull String paramString) {}
  
  public void onProviderEnabled(@NonNull String paramString) {}
  
  public void onStatusChanged(@NonNull String paramString, int paramInt, @Nullable Bundle paramBundle) {}
}

/* Location:
 * Qualified Name:     androidx.core.location.LocationListenerCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */