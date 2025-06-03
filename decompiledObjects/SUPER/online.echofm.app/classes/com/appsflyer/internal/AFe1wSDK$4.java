package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

final class AFe1wSDK$4
  implements AFe1xSDK.AFa1vSDK
{
  public AFe1wSDK$4(AFe1wSDK paramAFe1wSDK, long paramLong) {}
  
  public final void AFInAppEventParameterName(String paramString, Exception paramException)
  {
    AFKeystoreWrapper.valueOf = new ConcurrentHashMap();
    String str1 = paramException.getMessage();
    String str2 = str1;
    if (str1 == null) {
      str2 = "unknown";
    }
    AFKeystoreWrapper.valueOf.put("error", str2);
    AFLogger.afErrorLog(paramString, paramException, true, true, false);
  }
  
  public final void AFInAppEventParameterName(@NonNull String paramString1, @NonNull String paramString2)
  {
    AFKeystoreWrapper.valueOf = new ConcurrentHashMap();
    AFKeystoreWrapper.valueOf.put("signedData", paramString1);
    AFKeystoreWrapper.valueOf.put("signature", paramString2);
    long l1 = System.currentTimeMillis();
    long l2 = AFInAppEventType;
    AFKeystoreWrapper.valueOf.put("ttr", Long.valueOf(l1 - l2));
    AFLogger.afInfoLog("Successfully retrieved Google LVL data.");
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFe1wSDK.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */