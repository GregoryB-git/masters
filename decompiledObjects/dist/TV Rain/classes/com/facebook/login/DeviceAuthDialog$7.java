package com.facebook.login;

import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest.Callback;
import com.facebook.GraphResponse;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.SmartLoginOption;
import com.facebook.internal.Utility;
import java.util.AbstractCollection;
import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

class DeviceAuthDialog$7
  implements GraphRequest.Callback
{
  public DeviceAuthDialog$7(DeviceAuthDialog paramDeviceAuthDialog, String paramString, Date paramDate1, Date paramDate2) {}
  
  public void onCompleted(GraphResponse paramGraphResponse)
  {
    if (DeviceAuthDialog.access$300(this$0).get()) {
      return;
    }
    if (paramGraphResponse.getError() != null)
    {
      this$0.onError(paramGraphResponse.getError().getException());
      return;
    }
    try
    {
      Object localObject = paramGraphResponse.getJSONObject();
      String str = ((JSONObject)localObject).getString("id");
      paramGraphResponse = Utility.handlePermissionResponse((JSONObject)localObject);
      localObject = ((JSONObject)localObject).getString("name");
      DeviceRequestsHelper.cleanUpAdvertisementService(DeviceAuthDialog.access$500(this$0).getUserCode());
      if ((FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId()).getSmartLoginOptions().contains(SmartLoginOption.RequireConfirm)) && (!DeviceAuthDialog.access$1000(this$0)))
      {
        DeviceAuthDialog.access$1002(this$0, true);
        DeviceAuthDialog.access$1100(this$0, str, paramGraphResponse, val$accessToken, (String)localObject, val$expirationTime, val$dataAccessExpirationTimeDate);
        return;
      }
      DeviceAuthDialog.access$900(this$0, str, paramGraphResponse, val$accessToken, val$expirationTime, val$dataAccessExpirationTimeDate);
      return;
    }
    catch (JSONException paramGraphResponse)
    {
      this$0.onError(new FacebookException(paramGraphResponse));
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.login.DeviceAuthDialog.7
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */