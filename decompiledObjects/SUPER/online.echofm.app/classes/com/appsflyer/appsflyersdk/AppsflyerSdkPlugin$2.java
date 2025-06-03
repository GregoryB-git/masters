package com.appsflyer.appsflyersdk;

import com.appsflyer.AppsFlyerConversionListener;
import java.util.Map;
import org.json.JSONObject;

class AppsflyerSdkPlugin$2
  implements AppsFlyerConversionListener
{
  public AppsflyerSdkPlugin$2(AppsflyerSdkPlugin paramAppsflyerSdkPlugin) {}
  
  public void onAppOpenAttribution(Map<String, String> paramMap)
  {
    if (AppsflyerSdkPlugin.access$100())
    {
      AppsflyerSdkPlugin.access$802(paramMap);
      return;
    }
    if (AppsflyerSdkPlugin.access$900(this$0).booleanValue())
    {
      paramMap = new JSONObject(AppsflyerSdkPlugin.access$400(this$0, paramMap));
      AppsflyerSdkPlugin.access$500(this$0, paramMap, "onAppOpenAttribution", "success");
    }
  }
  
  public void onAttributionFailure(String paramString)
  {
    if (AppsflyerSdkPlugin.access$100())
    {
      AppsflyerSdkPlugin.access$1002(paramString);
      return;
    }
    if (AppsflyerSdkPlugin.access$900(this$0).booleanValue())
    {
      paramString = AppsflyerSdkPlugin.access$700(this$0, paramString, "failure");
      AppsflyerSdkPlugin.access$500(this$0, paramString, "onAppOpenAttribution", "failure");
    }
  }
  
  public void onConversionDataFail(String paramString)
  {
    if (AppsflyerSdkPlugin.access$100())
    {
      AppsflyerSdkPlugin.access$602(paramString);
      return;
    }
    if (AppsflyerSdkPlugin.access$300(this$0).booleanValue())
    {
      paramString = AppsflyerSdkPlugin.access$700(this$0, paramString, "failure");
      AppsflyerSdkPlugin.access$500(this$0, paramString, "onInstallConversionData", "failure");
    }
  }
  
  public void onConversionDataSuccess(Map<String, Object> paramMap)
  {
    if (AppsflyerSdkPlugin.access$100())
    {
      AppsflyerSdkPlugin.access$202(paramMap);
      return;
    }
    if (AppsflyerSdkPlugin.access$300(this$0).booleanValue())
    {
      paramMap = new JSONObject(AppsflyerSdkPlugin.access$400(this$0, paramMap));
      AppsflyerSdkPlugin.access$500(this$0, paramMap, "onInstallConversionData", "success");
    }
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.appsflyersdk.AppsflyerSdkPlugin.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */