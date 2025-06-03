package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerConversionListener;
import java.util.Map;

public final class AFe1sSDK
{
  public final double AFInAppEventType;
  
  public AFe1sSDK() {}
  
  public AFe1sSDK(double paramDouble)
  {
    AFInAppEventType = paramDouble;
  }
  
  public static void AFInAppEventType(String paramString)
  {
    AppsFlyerConversionListener localAppsFlyerConversionListener = valueOfAFInAppEventParameterName;
    if (localAppsFlyerConversionListener != null)
    {
      AFLogger.afDebugLog("[GCD-A02] Calling onConversionFailure with:\n".concat(String.valueOf(paramString)));
      localAppsFlyerConversionListener.onConversionDataFail(paramString);
    }
  }
  
  public static void values(Map<String, Object> paramMap)
  {
    AppsFlyerConversionListener localAppsFlyerConversionListener = valueOfAFInAppEventParameterName;
    if (localAppsFlyerConversionListener != null)
    {
      StringBuilder localStringBuilder = new StringBuilder("[GCD-A02] Calling onConversionDataSuccess with:\n");
      localStringBuilder.append(paramMap.toString());
      AFLogger.afDebugLog(localStringBuilder.toString());
      localAppsFlyerConversionListener.onConversionDataSuccess(paramMap);
    }
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFe1sSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */