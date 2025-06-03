package com.facebook;

import com.facebook.internal.Utility;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
import z2;

class AccessTokenManager$2
  implements GraphRequest.Callback
{
  public AccessTokenManager$2(AccessTokenManager paramAccessTokenManager, AtomicBoolean paramAtomicBoolean, Set paramSet1, Set paramSet2, Set paramSet3) {}
  
  public void onCompleted(GraphResponse paramGraphResponse)
  {
    paramGraphResponse = paramGraphResponse.getJSONObject();
    if (paramGraphResponse == null) {
      return;
    }
    JSONArray localJSONArray = paramGraphResponse.optJSONArray("data");
    if (localJSONArray == null) {
      return;
    }
    val$permissionsCallSucceeded.set(true);
    for (int i = 0; i < localJSONArray.length(); i++)
    {
      Object localObject = localJSONArray.optJSONObject(i);
      if (localObject != null)
      {
        paramGraphResponse = ((JSONObject)localObject).optString("permission");
        localObject = ((JSONObject)localObject).optString("status");
        if ((!Utility.isNullOrEmpty(paramGraphResponse)) && (!Utility.isNullOrEmpty((String)localObject)))
        {
          localObject = ((String)localObject).toLowerCase(Locale.US);
          if (((String)localObject).equals("granted")) {
            val$permissions.add(paramGraphResponse);
          } else if (((String)localObject).equals("declined")) {
            val$declinedPermissions.add(paramGraphResponse);
          } else if (((String)localObject).equals("expired")) {
            val$expiredPermissions.add(paramGraphResponse);
          } else {
            z2.A("Unexpected status: ", (String)localObject, "AccessTokenManager");
          }
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.AccessTokenManager.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */