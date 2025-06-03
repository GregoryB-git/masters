package com.appsflyer.appsflyersdk;

import E5.k;
import android.util.Log;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.deeplink.DeepLinkResult.Status;
import org.json.JSONException;
import org.json.JSONObject;

class AppsflyerSdkPlugin$6
  implements Runnable
{
  public void run()
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Calling invokeMethod with: ");
    ((StringBuilder)localObject).append(val$data);
    Log.d("Callbacks", ((StringBuilder)localObject).toString());
    localObject = new JSONObject();
    try
    {
      ((JSONObject)localObject).put("id", val$callbackName);
      if (!val$callbackName.equals("onDeepLinking")) {
        break label142;
      }
      DeepLinkResult localDeepLinkResult = (DeepLinkResult)val$data;
      ((JSONObject)localObject).put("deepLinkStatus", localDeepLinkResult.getStatus().toString());
      if (localDeepLinkResult.getError() != null) {
        ((JSONObject)localObject).put("deepLinkError", localDeepLinkResult.getError().toString());
      }
    }
    catch (JSONException localJSONException)
    {
      break label178;
    }
    if (localJSONException.getStatus() == DeepLinkResult.Status.FOUND)
    {
      ((JSONObject)localObject).put("deepLinkObj", localJSONException.getDeepLink().getClickEvent());
      break label182;
      label142:
      JSONObject localJSONObject = (JSONObject)val$data;
      ((JSONObject)localObject).put("status", val$status);
      ((JSONObject)localObject).put("data", val$data.toString());
      break label182;
      label178:
      localJSONObject.printStackTrace();
    }
    label182:
    AppsflyerSdkPlugin.access$1500(this$0).c("callListener", ((JSONObject)localObject).toString());
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.appsflyersdk.AppsflyerSdkPlugin.6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */