package com.facebook.login;

import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest.Callback;
import com.facebook.GraphResponse;
import org.json.JSONException;
import org.json.JSONObject;

class DeviceAuthDialog$1
  implements GraphRequest.Callback
{
  public DeviceAuthDialog$1(DeviceAuthDialog paramDeviceAuthDialog) {}
  
  public void onCompleted(GraphResponse paramGraphResponse)
  {
    if (DeviceAuthDialog.access$000(this$0)) {
      return;
    }
    if (paramGraphResponse.getError() != null)
    {
      this$0.onError(paramGraphResponse.getError().getException());
      return;
    }
    paramGraphResponse = paramGraphResponse.getJSONObject();
    DeviceAuthDialog.RequestState localRequestState = new DeviceAuthDialog.RequestState();
    try
    {
      localRequestState.setUserCode(paramGraphResponse.getString("user_code"));
      localRequestState.setRequestCode(paramGraphResponse.getString("code"));
      localRequestState.setInterval(paramGraphResponse.getLong("interval"));
      DeviceAuthDialog.access$100(this$0, localRequestState);
      return;
    }
    catch (JSONException paramGraphResponse)
    {
      this$0.onError(new FacebookException(paramGraphResponse));
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.login.DeviceAuthDialog.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */