package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.PermissionChecker;
import java.util.Calendar;

class TwilightManager
{
  private static final int SUNRISE = 6;
  private static final int SUNSET = 22;
  private static final String TAG = "TwilightManager";
  private static TwilightManager sInstance;
  private final Context mContext;
  private final LocationManager mLocationManager;
  private final TwilightState mTwilightState = new TwilightState();
  
  @VisibleForTesting
  public TwilightManager(@NonNull Context paramContext, @NonNull LocationManager paramLocationManager)
  {
    mContext = paramContext;
    mLocationManager = paramLocationManager;
  }
  
  public static TwilightManager getInstance(@NonNull Context paramContext)
  {
    if (sInstance == null)
    {
      paramContext = paramContext.getApplicationContext();
      sInstance = new TwilightManager(paramContext, (LocationManager)paramContext.getSystemService("location"));
    }
    return sInstance;
  }
  
  @SuppressLint({"MissingPermission"})
  private Location getLastKnownLocation()
  {
    int i = PermissionChecker.checkSelfPermission(mContext, "android.permission.ACCESS_COARSE_LOCATION");
    Location localLocation1 = null;
    Location localLocation2;
    if (i == 0) {
      localLocation2 = getLastKnownLocationForProvider("network");
    } else {
      localLocation2 = null;
    }
    if (PermissionChecker.checkSelfPermission(mContext, "android.permission.ACCESS_FINE_LOCATION") == 0) {
      localLocation1 = getLastKnownLocationForProvider("gps");
    }
    if ((localLocation1 != null) && (localLocation2 != null))
    {
      Location localLocation3 = localLocation2;
      if (localLocation1.getTime() > localLocation2.getTime()) {
        localLocation3 = localLocation1;
      }
      return localLocation3;
    }
    if (localLocation1 != null) {
      localLocation2 = localLocation1;
    }
    return localLocation2;
  }
  
  @RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
  private Location getLastKnownLocationForProvider(String paramString)
  {
    try
    {
      if (mLocationManager.isProviderEnabled(paramString))
      {
        paramString = mLocationManager.getLastKnownLocation(paramString);
        return paramString;
      }
    }
    catch (Exception paramString)
    {
      Log.d("TwilightManager", "Failed to get last known location", paramString);
    }
    return null;
  }
  
  private boolean isStateValid()
  {
    boolean bool;
    if (mTwilightState.nextUpdate > System.currentTimeMillis()) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @VisibleForTesting
  public static void setInstance(TwilightManager paramTwilightManager)
  {
    sInstance = paramTwilightManager;
  }
  
  private void updateState(@NonNull Location paramLocation)
  {
    TwilightState localTwilightState = mTwilightState;
    long l1 = System.currentTimeMillis();
    TwilightCalculator localTwilightCalculator = TwilightCalculator.getInstance();
    localTwilightCalculator.calculateTwilight(l1 - 86400000L, paramLocation.getLatitude(), paramLocation.getLongitude());
    long l2 = sunset;
    localTwilightCalculator.calculateTwilight(l1, paramLocation.getLatitude(), paramLocation.getLongitude());
    int i = state;
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    long l3 = sunrise;
    long l4 = sunset;
    localTwilightCalculator.calculateTwilight(86400000L + l1, paramLocation.getLatitude(), paramLocation.getLongitude());
    long l5 = sunrise;
    if ((l3 != -1L) && (l4 != -1L))
    {
      if (l1 > l4) {
        l1 = 0L + l5;
      } else if (l1 > l3) {
        l1 = 0L + l4;
      } else {
        l1 = 0L + l3;
      }
      l1 += 60000L;
    }
    else
    {
      l1 = 43200000L + l1;
    }
    isNight = bool;
    yesterdaySunset = l2;
    todaySunrise = l3;
    todaySunset = l4;
    tomorrowSunrise = l5;
    nextUpdate = l1;
  }
  
  public boolean isNight()
  {
    TwilightState localTwilightState = mTwilightState;
    if (isStateValid()) {
      return isNight;
    }
    Location localLocation = getLastKnownLocation();
    if (localLocation != null)
    {
      updateState(localLocation);
      return isNight;
    }
    Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
    int i = Calendar.getInstance().get(11);
    boolean bool;
    if ((i >= 6) && (i < 22)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static class TwilightState
  {
    public boolean isNight;
    public long nextUpdate;
    public long todaySunrise;
    public long todaySunset;
    public long tomorrowSunrise;
    public long yesterdaySunset;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.TwilightManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */