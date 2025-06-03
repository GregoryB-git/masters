package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import org.json.JSONObject;

final class AFa1gSDK$2
  implements AppsFlyerRequestListener
{
  public AFa1gSDK$2(AFa1gSDK paramAFa1gSDK, AFd1hSDK paramAFd1hSDK) {}
  
  public final void onError(int paramInt, @NonNull String paramString)
  {
    String str = paramString;
    if (paramInt == 50)
    {
      AFc1gSDK localAFc1gSDK = AFInAppEventParameterName.afErrorLog;
      str = paramString;
      if (localAFc1gSDK != null) {
        str = localAFc1gSDK.toString();
      }
    }
    AFa1gSDK.AFKeystoreWrapper(false, AFa1gSDK.valueOf(AFKeystoreWrapper), AFa1gSDK.AFInAppEventType(AFKeystoreWrapper), AFa1gSDK.values(AFKeystoreWrapper), str);
  }
  
  public final void onSuccess()
  {
    Object localObject = AFInAppEventParameterName.afErrorLog;
    try
    {
      localObject = (String)((AFc1gSDK)localObject).getBody();
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>((String)localObject);
      AFLogger.afInfoLog("Validate response ok: ".concat(String.valueOf(localJSONObject)));
      AFa1gSDK.AFKeystoreWrapper(localJSONObject.optBoolean("result"), AFa1gSDK.valueOf(AFKeystoreWrapper), AFa1gSDK.AFInAppEventType(AFKeystoreWrapper), AFa1gSDK.values(AFKeystoreWrapper), localJSONObject.toString());
      return;
    }
    catch (Exception localException)
    {
      AFLogger.afErrorLog("Failed Validate request: ".concat(String.valueOf(localException)), localException);
      AFa1gSDK.AFKeystoreWrapper(false, AFa1gSDK.valueOf(AFKeystoreWrapper), AFa1gSDK.AFInAppEventType(AFKeystoreWrapper), AFa1gSDK.values(AFKeystoreWrapper), localException.getMessage());
    }
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFa1gSDK.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */