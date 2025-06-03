package com.appsflyer.internal;

import android.util.Base64;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.net.MalformedURLException;
import java.net.URL;

public final class AFd1jSDK
  extends AFd1oSDK<String>
{
  private final AFe1fSDK afInfoLog;
  
  public AFd1jSDK(@NonNull AFe1fSDK paramAFe1fSDK, @NonNull AFc1xSDK paramAFc1xSDK)
  {
    super(localAFd1vSDK1, new AFd1vSDK[] { localAFd1vSDK2 }, paramAFc1xSDK, str, (String)localObject);
    afInfoLog = paramAFe1fSDK;
  }
  
  private static String valueOf(AFe1fSDK paramAFe1fSDK)
  {
    try
    {
      URL localURL = new java/net/URL;
      localURL.<init>(afRDLog);
      paramAFe1fSDK = localURL.getHost();
      return paramAFe1fSDK;
    }
    catch (MalformedURLException paramAFe1fSDK) {}
    return "";
  }
  
  public final boolean AFInAppEventParameterName()
  {
    Object localObject = afInfoLog.AFLogger$LogLevel;
    if (localObject == null) {
      localObject = AFd1vSDK.AFKeystoreWrapper;
    }
    if (localObject == AFd1vSDK.AppsFlyer2dXConversionCallback)
    {
      localObject = afErrorLog;
      if ((localObject != null) && (((AFc1gSDK)localObject).getStatusCode() == 424)) {
        break label55;
      }
    }
    label55:
    return super.AFInAppEventParameterName();
  }
  
  public final boolean afInfoLog()
  {
    return false;
  }
  
  public final AppsFlyerRequestListener afRDLog()
  {
    return afInfoLog.AFInAppEventParameterName;
  }
  
  public final AFc1qSDK<String> values(@NonNull String paramString)
  {
    paramString = Base64.encodeToString(afInfoLog.AFKeystoreWrapper(), 2);
    AFLogger.afInfoLog("cached data: ".concat(String.valueOf(paramString)));
    afRDLog.valueOf(afInfoLog.afRDLog, paramString);
    return AFLogger.values(afInfoLog);
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFd1jSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */