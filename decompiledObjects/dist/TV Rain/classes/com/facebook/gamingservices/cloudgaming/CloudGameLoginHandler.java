package com.facebook.gamingservices.cloudgaming;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import androidx.annotation.Nullable;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphResponse;
import com.facebook.Profile;
import com.facebook.gamingservices.cloudgaming.internal.SDKLogger;
import com.facebook.gamingservices.cloudgaming.internal.SDKMessageEnum;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CloudGameLoginHandler
{
  private static final int DEFAULT_TIMEOUT_IN_SEC = 5;
  private static boolean IS_RUNNING_IN_CLOUD = false;
  private static SDKLogger mLogger;
  
  private static List<String> convertPermissionsStringIntoPermissionsList(String paramString)
    throws JSONException
  {
    ArrayList localArrayList = new ArrayList();
    if (!paramString.isEmpty())
    {
      paramString = new JSONArray(paramString);
      for (int i = 0; i < paramString.length(); i++) {
        localArrayList.add(paramString.get(i).toString());
      }
    }
    return localArrayList;
  }
  
  @Nullable
  public static AccessToken init(Context paramContext)
    throws FacebookException
  {
    try
    {
      paramContext = init(paramContext, 5);
      return paramContext;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
  
  @Nullable
  public static AccessToken init(Context paramContext, int paramInt)
    throws FacebookException
  {
    int i = paramInt;
    if (paramInt <= 0) {
      i = 5;
    }
    try
    {
      if (isCloudEnvReady(paramContext, i))
      {
        mLogger = SDKLogger.getInstance(paramContext);
        Object localObject = DaemonRequest.executeAndWait(paramContext, null, SDKMessageEnum.GET_ACCESS_TOKEN, i);
        if ((localObject != null) && (((GraphResponse)localObject).getJSONObject() != null))
        {
          if (((GraphResponse)localObject).getError() == null)
          {
            setPackageName(((GraphResponse)localObject).getJSONObject(), paramContext);
            try
            {
              paramContext = setCurrentAccessToken(((GraphResponse)localObject).getJSONObject());
              Profile.fetchProfileForCurrentAccessToken();
              IS_RUNNING_IN_CLOUD = true;
              mLogger.logLoginSuccess();
              return paramContext;
            }
            catch (JSONException paramContext)
            {
              localObject = new com/facebook/FacebookException;
              ((FacebookException)localObject).<init>("Cannot properly handle response.", paramContext);
              throw ((Throwable)localObject);
            }
          }
          paramContext = new com/facebook/FacebookException;
          paramContext.<init>(((GraphResponse)localObject).getError().getErrorMessage());
          throw paramContext;
        }
        paramContext = new com/facebook/FacebookException;
        paramContext.<init>("Cannot receive response.");
        throw paramContext;
      }
      paramContext = new com/facebook/FacebookException;
      paramContext.<init>("Not running in Cloud environment.");
      throw paramContext;
    }
    finally {}
  }
  
  private static boolean isCloudEnvReady(Context paramContext, int paramInt)
  {
    paramContext = DaemonRequest.executeAndWait(paramContext, null, SDKMessageEnum.IS_ENV_READY, paramInt);
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (paramContext != null) {
      if (paramContext.getJSONObject() == null)
      {
        bool2 = bool1;
      }
      else
      {
        bool2 = bool1;
        if (paramContext.getError() == null) {
          bool2 = true;
        }
      }
    }
    return bool2;
  }
  
  public static boolean isRunningInCloud()
  {
    return IS_RUNNING_IN_CLOUD;
  }
  
  @Nullable
  private static AccessToken setCurrentAccessToken(JSONObject paramJSONObject)
    throws JSONException
  {
    String str1 = paramJSONObject.optString("accessToken");
    String str2 = paramJSONObject.optString("accessTokenSource");
    String str3 = paramJSONObject.optString("appID");
    Object localObject1 = paramJSONObject.optString("declinedPermissions");
    Object localObject2 = paramJSONObject.optString("expiredPermissions");
    Object localObject3 = paramJSONObject.optString("expirationTime");
    Object localObject4 = paramJSONObject.optString("dataAccessExpirationTime");
    String str4 = paramJSONObject.optString("graphDomain");
    Object localObject5 = paramJSONObject.optString("lastRefreshTime");
    Object localObject6 = paramJSONObject.optString("permissions");
    String str5 = paramJSONObject.optString("userID");
    String str6 = paramJSONObject.optString("sessionID");
    boolean bool = str1.isEmpty();
    String str7 = null;
    if ((!bool) && (!str3.isEmpty()) && (!str5.isEmpty()))
    {
      paramJSONObject = mLogger;
      if (paramJSONObject != null)
      {
        paramJSONObject.setAppID(str3);
        mLogger.setUserID(str5);
        mLogger.setSessionID(str6);
      }
      localObject6 = convertPermissionsStringIntoPermissionsList((String)localObject6);
      localObject1 = convertPermissionsStringIntoPermissionsList((String)localObject1);
      localObject2 = convertPermissionsStringIntoPermissionsList((String)localObject2);
      if (!str2.isEmpty()) {
        paramJSONObject = AccessTokenSource.valueOf(str2);
      } else {
        paramJSONObject = null;
      }
      if (!((String)localObject3).isEmpty()) {
        localObject3 = new Date(Integer.parseInt((String)localObject3) * 1000L);
      } else {
        localObject3 = null;
      }
      if (!((String)localObject5).isEmpty()) {
        localObject5 = new Date(Integer.parseInt((String)localObject5) * 1000L);
      } else {
        localObject5 = null;
      }
      if (!((String)localObject4).isEmpty()) {
        localObject4 = new Date(Integer.parseInt((String)localObject4) * 1000L);
      } else {
        localObject4 = null;
      }
      if (!str4.isEmpty()) {
        str7 = str4;
      }
      paramJSONObject = new AccessToken(str1, str3, str5, (Collection)localObject6, (Collection)localObject1, (Collection)localObject2, paramJSONObject, (Date)localObject3, (Date)localObject5, (Date)localObject4, str7);
      AccessToken.setCurrentAccessToken(paramJSONObject);
      return paramJSONObject;
    }
    return null;
  }
  
  private static void setPackageName(JSONObject paramJSONObject, Context paramContext)
  {
    paramJSONObject = paramJSONObject.optString("daemonPackageName");
    if (!paramJSONObject.isEmpty())
    {
      paramContext = paramContext.getSharedPreferences("com.facebook.gamingservices.cloudgaming:preferences", 0).edit();
      paramContext.putString("daemonPackageName", paramJSONObject);
      paramContext.commit();
      return;
    }
    throw new FacebookException("Could not establish a secure connection.");
  }
}

/* Location:
 * Qualified Name:     com.facebook.gamingservices.cloudgaming.CloudGameLoginHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */