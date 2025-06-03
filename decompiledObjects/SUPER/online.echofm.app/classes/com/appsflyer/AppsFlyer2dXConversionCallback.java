package com.appsflyer;

import androidx.annotation.NonNull;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.share.LinkGenerator.ResponseListener;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class AppsFlyer2dXConversionCallback
  implements AppsFlyerConversionListener, DeepLinkListener, LinkGenerator.ResponseListener
{
  private void AFInAppEventParameterName(String paramString1, String paramString2)
  {
    JSONObject localJSONObject;
    int i;
    try
    {
      localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localJSONObject.put("status", "failure");
      localJSONObject.put("data", paramString2);
      i = paramString1.hashCode();
      if (i != -1390007222)
      {
        if ((i != 1050716216) || (!paramString1.equals("onInstallConversionFailure"))) {
          break label82;
        }
        i = 0;
      }
    }
    catch (JSONException paramString1)
    {
      break label111;
    }
    if (paramString1.equals("onAttributionFailure")) {
      i = 1;
    } else {
      label82:
      i = -1;
    }
    if (i != 0)
    {
      if (i == 1) {
        onAttributionFailureNative(localJSONObject);
      }
      return;
    }
    onInstallConversionFailureNative(localJSONObject);
    return;
    label111:
    AFLogger.afErrorLogForExcManagerOnly("2dx error", paramString1);
    paramString1.printStackTrace();
  }
  
  public void onAppOpenAttribution(Map<String, String> paramMap)
  {
    onAppOpenAttributionNative(paramMap);
  }
  
  public native void onAppOpenAttributionNative(Object paramObject);
  
  public void onAttributionFailure(String paramString)
  {
    AFInAppEventParameterName("onInstallConversionFailure", paramString);
  }
  
  public native void onAttributionFailureNative(Object paramObject);
  
  public void onConversionDataFail(String paramString)
  {
    AFInAppEventParameterName("onAttributionFailure", paramString);
  }
  
  public void onConversionDataSuccess(Map<String, Object> paramMap)
  {
    onInstallConversionDataLoadedNative(paramMap);
  }
  
  public void onDeepLinking(@NonNull DeepLinkResult paramDeepLinkResult)
  {
    onDeepLinkingNative(paramDeepLinkResult);
  }
  
  public native void onDeepLinkingNative(@NonNull DeepLinkResult paramDeepLinkResult);
  
  public native void onInstallConversionDataLoadedNative(Object paramObject);
  
  public native void onInstallConversionFailureNative(Object paramObject);
  
  public void onResponse(String paramString)
  {
    onResponseNative(paramString);
  }
  
  public void onResponseError(String paramString)
  {
    onResponseErrorNative(paramString);
  }
  
  public native void onResponseErrorNative(String paramString);
  
  public native void onResponseNative(String paramString);
}

/* Location:
 * Qualified Name:     com.appsflyer.AppsFlyer2dXConversionCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */