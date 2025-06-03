package androidx.core.location;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.ObjectsCompat;
import java.util.List;
import java.util.concurrent.Executor;

class LocationManagerCompat$LocationListenerTransport
  implements LocationListener
{
  public final Executor mExecutor;
  @Nullable
  public volatile LocationManagerCompat.LocationListenerKey mKey;
  
  public LocationManagerCompat$LocationListenerTransport(@Nullable LocationManagerCompat.LocationListenerKey paramLocationListenerKey, Executor paramExecutor)
  {
    mKey = paramLocationListenerKey;
    mExecutor = paramExecutor;
  }
  
  public LocationManagerCompat.LocationListenerKey getKey()
  {
    return (LocationManagerCompat.LocationListenerKey)ObjectsCompat.requireNonNull(mKey);
  }
  
  public void onFlushComplete(int paramInt)
  {
    if (mKey == null) {
      return;
    }
    mExecutor.execute(new h(this, paramInt));
  }
  
  public void onLocationChanged(@NonNull Location paramLocation)
  {
    if (mKey == null) {
      return;
    }
    mExecutor.execute(new i(this, paramLocation, 1));
  }
  
  public void onLocationChanged(@NonNull List<Location> paramList)
  {
    if (mKey == null) {
      return;
    }
    mExecutor.execute(new i(this, paramList, 0));
  }
  
  public void onProviderDisabled(@NonNull String paramString)
  {
    if (mKey == null) {
      return;
    }
    mExecutor.execute(new g(this, paramString, 1));
  }
  
  public void onProviderEnabled(@NonNull String paramString)
  {
    if (mKey == null) {
      return;
    }
    mExecutor.execute(new g(this, paramString, 0));
  }
  
  public void onStatusChanged(String paramString, int paramInt, Bundle paramBundle)
  {
    if (mKey == null) {
      return;
    }
    mExecutor.execute(new j(this, paramString, paramInt, paramBundle));
  }
  
  public void unregister()
  {
    mKey = null;
  }
}

/* Location:
 * Qualified Name:     androidx.core.location.LocationManagerCompat.LocationListenerTransport
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */