package com.appsflyer.appsflyersdk;

import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import org.json.JSONException;
import org.json.JSONObject;

class AppsflyerSdkPlugin$7
  implements AppsFlyerInAppPurchaseValidatorListener
{
  public AppsflyerSdkPlugin$7(AppsflyerSdkPlugin paramAppsflyerSdkPlugin) {}
  
  public void onValidateInApp()
  {
    if (AppsflyerSdkPlugin.access$1600(this$0).booleanValue()) {
      AppsflyerSdkPlugin.access$500(this$0, new JSONObject(), "validatePurchase", "success");
    }
  }
  
  public void onValidateInAppFailure(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localJSONObject.put("error", paramString);
      if (AppsflyerSdkPlugin.access$1600(this$0).booleanValue()) {
        AppsflyerSdkPlugin.access$500(this$0, localJSONObject, "validatePurchase", "failure");
      }
    }
    catch (JSONException paramString)
    {
      paramString.printStackTrace();
    }
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.appsflyersdk.AppsflyerSdkPlugin.7
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */