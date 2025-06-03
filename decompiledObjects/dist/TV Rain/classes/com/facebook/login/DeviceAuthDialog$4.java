package com.facebook.login;

import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest.Callback;
import com.facebook.GraphResponse;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

class DeviceAuthDialog$4
  implements GraphRequest.Callback
{
  public DeviceAuthDialog$4(DeviceAuthDialog paramDeviceAuthDialog) {}
  
  public void onCompleted(GraphResponse paramGraphResponse)
  {
    if (DeviceAuthDialog.access$300(this$0).get()) {
      return;
    }
    FacebookRequestError localFacebookRequestError = paramGraphResponse.getError();
    if (localFacebookRequestError != null)
    {
      int i = localFacebookRequestError.getSubErrorCode();
      if (i != 1349152)
      {
        switch (i)
        {
        default: 
          this$0.onError(paramGraphResponse.getError().getException());
          break;
        case 1349173: 
          this$0.onCancel();
          break;
        case 1349172: 
        case 1349174: 
          DeviceAuthDialog.access$400(this$0);
          break;
        }
      }
      else
      {
        if (DeviceAuthDialog.access$500(this$0) != null) {
          DeviceRequestsHelper.cleanUpAdvertisementService(DeviceAuthDialog.access$500(this$0).getUserCode());
        }
        if (DeviceAuthDialog.access$600(this$0) != null)
        {
          paramGraphResponse = this$0;
          paramGraphResponse.startLogin(DeviceAuthDialog.access$600(paramGraphResponse));
        }
        else
        {
          this$0.onCancel();
        }
      }
      return;
    }
    try
    {
      paramGraphResponse = paramGraphResponse.getJSONObject();
      DeviceAuthDialog.access$700(this$0, paramGraphResponse.getString("access_token"), Long.valueOf(paramGraphResponse.getLong("expires_in")), Long.valueOf(paramGraphResponse.optLong("data_access_expiration_time")));
    }
    catch (JSONException paramGraphResponse)
    {
      this$0.onError(new FacebookException(paramGraphResponse));
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.login.DeviceAuthDialog.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */