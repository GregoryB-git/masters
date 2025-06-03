package com.appsflyer.appsflyersdk;

import com.appsflyer.share.LinkGenerator.ResponseListener;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

class AppsflyerSdkPlugin$5
  implements LinkGenerator.ResponseListener
{
  final JSONObject obj = new JSONObject();
  
  public AppsflyerSdkPlugin$5(AppsflyerSdkPlugin paramAppsflyerSdkPlugin) {}
  
  public void onResponse(String paramString)
  {
    if (AppsflyerSdkPlugin.access$1400(this$0).containsKey("generateInviteLinkSuccess")) {
      try
      {
        obj.put("userInviteURL", paramString);
        AppsflyerSdkPlugin.access$500(this$0, obj, "generateInviteLinkSuccess", "success");
      }
      catch (JSONException paramString)
      {
        paramString.printStackTrace();
      }
    }
  }
  
  public void onResponseError(String paramString)
  {
    if (AppsflyerSdkPlugin.access$1400(this$0).containsKey("generateInviteLinkFailure")) {
      try
      {
        obj.put("error", paramString);
        AppsflyerSdkPlugin.access$500(this$0, paramString, "generateInviteLinkFailure", "failure");
      }
      catch (JSONException paramString)
      {
        paramString.printStackTrace();
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.appsflyersdk.AppsflyerSdkPlugin.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */