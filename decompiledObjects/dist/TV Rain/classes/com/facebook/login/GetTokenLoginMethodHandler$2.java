package com.facebook.login;

import android.os.BaseBundle;
import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.internal.Utility.GraphMeRequestWithCacheCallback;
import org.json.JSONException;
import org.json.JSONObject;

class GetTokenLoginMethodHandler$2
  implements Utility.GraphMeRequestWithCacheCallback
{
  public GetTokenLoginMethodHandler$2(GetTokenLoginMethodHandler paramGetTokenLoginMethodHandler, Bundle paramBundle, LoginClient.Request paramRequest) {}
  
  public void onFailure(FacebookException paramFacebookException)
  {
    LoginClient localLoginClient = this$0.loginClient;
    localLoginClient.complete(LoginClient.Result.createErrorResult(localLoginClient.getPendingRequest(), "Caught exception", paramFacebookException.getMessage()));
  }
  
  public void onSuccess(JSONObject paramJSONObject)
  {
    try
    {
      paramJSONObject = paramJSONObject.getString("id");
      val$result.putString("com.facebook.platform.extra.USER_ID", paramJSONObject);
      this$0.onComplete(val$request, val$result);
    }
    catch (JSONException localJSONException)
    {
      paramJSONObject = this$0.loginClient;
      paramJSONObject.complete(LoginClient.Result.createErrorResult(paramJSONObject.getPendingRequest(), "Caught exception", localJSONException.getMessage()));
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.login.GetTokenLoginMethodHandler.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */