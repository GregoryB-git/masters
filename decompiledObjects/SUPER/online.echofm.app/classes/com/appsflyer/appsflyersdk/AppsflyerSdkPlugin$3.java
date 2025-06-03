package com.appsflyer.appsflyersdk;

import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;

class AppsflyerSdkPlugin$3
  implements DeepLinkListener
{
  public AppsflyerSdkPlugin$3(AppsflyerSdkPlugin paramAppsflyerSdkPlugin) {}
  
  public void onDeepLinking(DeepLinkResult paramDeepLinkResult)
  {
    if (AppsflyerSdkPlugin.access$100())
    {
      AppsflyerSdkPlugin.access$1102(paramDeepLinkResult);
      return;
    }
    if (AppsflyerSdkPlugin.access$1200(this$0).booleanValue()) {
      AppsflyerSdkPlugin.access$500(this$0, paramDeepLinkResult, "onDeepLinking", "success");
    }
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.appsflyersdk.AppsflyerSdkPlugin.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */