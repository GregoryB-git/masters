package com.facebook.login;

import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.Utility;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import z2;

abstract class LoginMethodHandler
  implements Parcelable
{
  public LoginClient loginClient;
  public Map<String, String> methodLoggingExtras;
  
  public LoginMethodHandler(Parcel paramParcel)
  {
    methodLoggingExtras = Utility.readStringMapFromParcel(paramParcel);
  }
  
  public LoginMethodHandler(LoginClient paramLoginClient)
  {
    loginClient = paramLoginClient;
  }
  
  public static AccessToken createAccessTokenFromNativeLogin(Bundle paramBundle, AccessTokenSource paramAccessTokenSource, String paramString)
  {
    Date localDate1 = Utility.getBundleLongAsDate(paramBundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
    ArrayList localArrayList = paramBundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
    String str1 = paramBundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
    Date localDate2 = Utility.getBundleLongAsDate(paramBundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0L));
    if (Utility.isNullOrEmpty(str1)) {
      return null;
    }
    String str2 = paramBundle.getString("com.facebook.platform.extra.USER_ID");
    paramBundle = paramBundle.getString("graph_domain");
    return new AccessToken(str1, paramString, str2, localArrayList, null, null, paramAccessTokenSource, localDate1, new Date(), localDate2, paramBundle);
  }
  
  public static AccessToken createAccessTokenFromWebBundle(Collection<String> paramCollection, Bundle paramBundle, AccessTokenSource paramAccessTokenSource, String paramString)
    throws FacebookException
  {
    Date localDate1 = Utility.getBundleLongAsDate(paramBundle, "expires_in", new Date());
    String str1 = paramBundle.getString("access_token");
    Date localDate2 = Utility.getBundleLongAsDate(paramBundle, "data_access_expiration_time", new Date(0L));
    Object localObject1 = paramBundle.getString("granted_scopes");
    if (!Utility.isNullOrEmpty((String)localObject1)) {
      paramCollection = new ArrayList(Arrays.asList(((String)localObject1).split(",")));
    }
    localObject1 = paramBundle.getString("denied_scopes");
    if (!Utility.isNullOrEmpty((String)localObject1)) {
      localObject1 = new ArrayList(Arrays.asList(((String)localObject1).split(",")));
    } else {
      localObject1 = null;
    }
    Object localObject2 = paramBundle.getString("expired_scopes");
    if (!Utility.isNullOrEmpty((String)localObject2)) {
      localObject2 = new ArrayList(Arrays.asList(((String)localObject2).split(",")));
    } else {
      localObject2 = null;
    }
    if (Utility.isNullOrEmpty(str1)) {
      return null;
    }
    String str2 = paramBundle.getString("graph_domain");
    return new AccessToken(str1, paramString, getUserIDFromSignedRequest(paramBundle.getString("signed_request")), paramCollection, (Collection)localObject1, (Collection)localObject2, paramAccessTokenSource, localDate1, new Date(), localDate2, str2);
  }
  
  public static String getUserIDFromSignedRequest(String paramString)
    throws FacebookException
  {
    if ((paramString != null) && (!paramString.isEmpty())) {}
    try
    {
      paramString = paramString.split("\\.");
      if (paramString.length == 2)
      {
        Object localObject = Base64.decode(paramString[1], 0);
        paramString = new java/lang/String;
        paramString.<init>((byte[])localObject, "UTF-8");
        localObject = new org/json/JSONObject;
        ((JSONObject)localObject).<init>(paramString);
        paramString = ((JSONObject)localObject).getString("user_id");
        return paramString;
      }
    }
    catch (UnsupportedEncodingException|JSONException paramString)
    {
      for (;;) {}
    }
    throw new FacebookException("Failed to retrieve user_id from signed_request");
    throw new FacebookException("Authorization response does not contain the signed_request");
  }
  
  public void addLoggingExtra(String paramString, Object paramObject)
  {
    if (methodLoggingExtras == null) {
      methodLoggingExtras = new HashMap();
    }
    Map localMap = methodLoggingExtras;
    if (paramObject == null) {
      paramObject = null;
    } else {
      paramObject = paramObject.toString();
    }
    localMap.put(paramString, paramObject);
  }
  
  public void cancel() {}
  
  public String getClientState(String paramString)
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("0_auth_logger_id", paramString);
      localJSONObject.put("3_method", getNameForLogging());
      putChallengeParam(localJSONObject);
    }
    catch (JSONException localJSONException)
    {
      paramString = z2.t("Error creating client state json: ");
      paramString.append(localJSONException.getMessage());
      Log.w("LoginMethodHandler", paramString.toString());
    }
    return localJSONObject.toString();
  }
  
  public abstract String getNameForLogging();
  
  public void logWebLoginCompleted(String paramString)
  {
    String str = loginClient.getPendingRequest().getApplicationId();
    InternalAppEventsLogger localInternalAppEventsLogger = new InternalAppEventsLogger(loginClient.getActivity(), str);
    paramString = z2.d("fb_web_login_e2e", paramString);
    paramString.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
    paramString.putString("app_id", str);
    localInternalAppEventsLogger.logEventImplicitly("fb_dialogs_web_login_dialog_complete", null, paramString);
  }
  
  public boolean needsInternetPermission()
  {
    return false;
  }
  
  public boolean onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    return false;
  }
  
  public void putChallengeParam(JSONObject paramJSONObject)
    throws JSONException
  {}
  
  public void setLoginClient(LoginClient paramLoginClient)
  {
    if (loginClient == null)
    {
      loginClient = paramLoginClient;
      return;
    }
    throw new FacebookException("Can't set LoginClient if it is already set.");
  }
  
  public boolean shouldKeepTrackOfMultipleIntents()
  {
    return false;
  }
  
  public abstract int tryAuthorize(LoginClient.Request paramRequest);
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Utility.writeStringMapToParcel(paramParcel, methodLoggingExtras);
  }
}

/* Location:
 * Qualified Name:     com.facebook.login.LoginMethodHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */