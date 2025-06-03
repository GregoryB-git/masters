package com.google.android.exoplayer2.scheduler;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.PowerManager;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class Requirements
{
  private static final int DEVICE_CHARGING = 16;
  private static final int DEVICE_IDLE = 8;
  public static final int NETWORK_TYPE_ANY = 1;
  private static final int NETWORK_TYPE_MASK = 7;
  public static final int NETWORK_TYPE_METERED = 4;
  public static final int NETWORK_TYPE_NONE = 0;
  public static final int NETWORK_TYPE_NOT_ROAMING = 3;
  private static final String[] NETWORK_TYPE_STRINGS;
  public static final int NETWORK_TYPE_UNMETERED = 2;
  private static final String TAG = "Requirements";
  private final int requirements;
  
  public Requirements(int paramInt)
  {
    requirements = paramInt;
  }
  
  public Requirements(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    this(paramInt | j | i);
  }
  
  private boolean checkChargingRequirement(Context paramContext)
  {
    boolean bool1 = isChargingRequired();
    boolean bool2 = true;
    if (!bool1) {
      return true;
    }
    paramContext = paramContext.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    if (paramContext == null) {
      return false;
    }
    int i = paramContext.getIntExtra("status", -1);
    bool1 = bool2;
    if (i != 2) {
      if (i == 5) {
        bool1 = bool2;
      } else {
        bool1 = false;
      }
    }
    return bool1;
  }
  
  private boolean checkIdleRequirement(Context paramContext)
  {
    boolean bool1 = isIdleRequired();
    boolean bool2 = true;
    if (!bool1) {
      return true;
    }
    paramContext = (PowerManager)paramContext.getSystemService("power");
    int i = Util.SDK_INT;
    if (i >= 23) {
      bool2 = paramContext.isDeviceIdleMode();
    } else if (i >= 20 ? paramContext.isInteractive() : paramContext.isScreenOn()) {
      bool2 = false;
    }
    return bool2;
  }
  
  private static boolean checkInternetConnectivity(ConnectivityManager paramConnectivityManager)
  {
    if (Util.SDK_INT < 23) {
      return true;
    }
    Network localNetwork = paramConnectivityManager.getActiveNetwork();
    boolean bool = false;
    if (localNetwork == null)
    {
      logd("No active network.");
      return false;
    }
    paramConnectivityManager = paramConnectivityManager.getNetworkCapabilities(localNetwork);
    if ((paramConnectivityManager == null) || (!paramConnectivityManager.hasCapability(16))) {
      bool = true;
    }
    paramConnectivityManager = new StringBuilder();
    paramConnectivityManager.append("Network capability validated: ");
    paramConnectivityManager.append(bool);
    logd(paramConnectivityManager.toString());
    return bool ^ true;
  }
  
  private boolean checkNetworkRequirements(Context paramContext)
  {
    int i = getRequiredNetworkType();
    if (i == 0) {
      return true;
    }
    ConnectivityManager localConnectivityManager = (ConnectivityManager)paramContext.getSystemService("connectivity");
    paramContext = localConnectivityManager.getActiveNetworkInfo();
    if ((paramContext != null) && (paramContext.isConnected()))
    {
      if (!checkInternetConnectivity(localConnectivityManager)) {
        return false;
      }
      if (i == 1) {
        return true;
      }
      if (i == 3)
      {
        bool = paramContext.isRoaming();
        paramContext = new StringBuilder();
        paramContext.append("Roaming: ");
        paramContext.append(bool);
        logd(paramContext.toString());
        return bool ^ true;
      }
      boolean bool = isActiveNetworkMetered(localConnectivityManager, paramContext);
      paramContext = new StringBuilder();
      paramContext.append("Metered network: ");
      paramContext.append(bool);
      logd(paramContext.toString());
      if (i == 2) {
        return bool ^ true;
      }
      if (i == 4) {
        return bool;
      }
      throw new IllegalStateException();
    }
    logd("No network info or no connection.");
    return false;
  }
  
  private static boolean isActiveNetworkMetered(ConnectivityManager paramConnectivityManager, NetworkInfo paramNetworkInfo)
  {
    if (Util.SDK_INT >= 16) {
      return paramConnectivityManager.isActiveNetworkMetered();
    }
    int i = paramNetworkInfo.getType();
    boolean bool = true;
    if ((i == 1) || (i == 7) || (i == 9)) {
      bool = false;
    }
    return bool;
  }
  
  private static void logd(String paramString) {}
  
  public boolean checkRequirements(Context paramContext)
  {
    boolean bool;
    if ((checkNetworkRequirements(paramContext)) && (checkChargingRequirement(paramContext)) && (checkIdleRequirement(paramContext))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int getRequiredNetworkType()
  {
    return requirements & 0x7;
  }
  
  public int getRequirementsData()
  {
    return requirements;
  }
  
  public boolean isChargingRequired()
  {
    boolean bool;
    if ((requirements & 0x10) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isIdleRequired()
  {
    boolean bool;
    if ((requirements & 0x8) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public String toString()
  {
    return super.toString();
  }
  
  @Documented
  @Retention(RetentionPolicy.SOURCE)
  public static @interface NetworkType {}
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.scheduler.Requirements
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */