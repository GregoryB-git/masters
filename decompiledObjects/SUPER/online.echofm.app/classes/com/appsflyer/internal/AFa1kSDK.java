package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;

public final class AFa1kSDK
{
  private static boolean values(NetworkInfo paramNetworkInfo)
  {
    return (paramNetworkInfo != null) && (paramNetworkInfo.isConnectedOrConnecting());
  }
  
  public final AFa1zSDK AFInAppEventParameterName(@NonNull Context paramContext)
  {
    String str = "unknown";
    Object localObject3 = null;
    Object localObject6 = null;
    Object localObject7 = str;
    Object localObject8;
    Object localObject9;
    for (;;)
    {
      int j;
      try
      {
        localObject8 = (ConnectivityManager)paramContext.getSystemService("connectivity");
        localObject9 = str;
        if (localObject8 == null) {
          break;
        }
        localObject7 = str;
        Network[] arrayOfNetwork = ((ConnectivityManager)localObject8).getAllNetworks();
        localObject7 = str;
        int i = arrayOfNetwork.length;
        j = 0;
        localObject9 = str;
        if (j >= i) {
          break;
        }
        localObject7 = str;
        localObject10 = ((ConnectivityManager)localObject8).getNetworkInfo(arrayOfNetwork[j]);
        localObject7 = str;
        if (!values((NetworkInfo)localObject10)) {
          break label144;
        }
        localObject7 = str;
        if (1 == ((NetworkInfo)localObject10).getType()) {
          localObject9 = "WIFI";
        }
      }
      finally
      {
        localObject6 = null;
        localObject9 = localObject7;
        paramContext = (Context)localObject3;
        localObject7 = localObject6;
        break label260;
      }
      localObject7 = localObject1;
      localObject9 = localObject1;
      if (((NetworkInfo)localObject10).getType() != 0) {
        break;
      }
      localObject9 = "MOBILE";
      break;
      label144:
      j++;
    }
    localObject7 = localObject9;
    Object localObject10 = (TelephonyManager)paramContext.getSystemService("phone");
    localObject7 = localObject9;
    Object localObject2 = ((TelephonyManager)localObject10).getSimOperatorName();
    paramContext = (Context)localObject6;
    try
    {
      localObject8 = ((TelephonyManager)localObject10).getNetworkOperatorName();
      if (localObject8 != null)
      {
        paramContext = (Context)localObject8;
        localObject6 = localObject9;
        localObject7 = localObject8;
        localObject3 = localObject2;
        if (!((String)localObject8).isEmpty()) {
          break label272;
        }
      }
    }
    finally
    {
      localObject7 = paramContext;
      paramContext = (Context)localObject2;
      localObject2 = localObject4;
      break label260;
    }
    paramContext = (Context)localObject8;
    localObject6 = localObject9;
    localObject7 = localObject8;
    Object localObject5 = localObject2;
    if (2 == ((TelephonyManager)localObject10).getPhoneType())
    {
      localObject7 = "CDMA";
      localObject6 = localObject9;
      localObject5 = localObject2;
      break label272;
      label260:
      AFLogger.afErrorLog("Exception while collecting network info. ", (Throwable)localObject2);
      localObject5 = paramContext;
      localObject6 = localObject9;
    }
    label272:
    return new AFa1zSDK((String)localObject6, (String)localObject7, (String)localObject5);
  }
  
  public static final class AFa1zSDK
  {
    public final String AFInAppEventParameterName;
    public final String AFInAppEventType;
    public final String valueOf;
    
    public AFa1zSDK(@NonNull String paramString1, String paramString2, String paramString3)
    {
      AFInAppEventParameterName = paramString1;
      AFInAppEventType = paramString2;
      valueOf = paramString3;
    }
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFa1kSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */