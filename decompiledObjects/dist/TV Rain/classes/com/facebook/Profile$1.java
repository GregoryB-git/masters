package com.facebook;

import android.net.Uri;
import android.util.Log;
import com.facebook.internal.Utility.GraphMeRequestWithCacheCallback;
import org.json.JSONObject;

final class Profile$1
  implements Utility.GraphMeRequestWithCacheCallback
{
  public void onFailure(FacebookException paramFacebookException)
  {
    String str = Profile.access$000();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Got unexpected exception: ");
    localStringBuilder.append(paramFacebookException);
    Log.e(str, localStringBuilder.toString());
  }
  
  public void onSuccess(JSONObject paramJSONObject)
  {
    String str1 = paramJSONObject.optString("id");
    if (str1 == null)
    {
      Log.w(Profile.access$000(), "No user ID returned on Me request");
      return;
    }
    String str2 = paramJSONObject.optString("link");
    String str3 = paramJSONObject.optString("first_name");
    String str4 = paramJSONObject.optString("middle_name");
    String str5 = paramJSONObject.optString("last_name");
    String str6 = paramJSONObject.optString("name");
    if (str2 != null) {
      paramJSONObject = Uri.parse(str2);
    } else {
      paramJSONObject = null;
    }
    Profile.setCurrentProfile(new Profile(str1, str3, str4, str5, str6, paramJSONObject));
  }
}

/* Location:
 * Qualified Name:     com.facebook.Profile.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */