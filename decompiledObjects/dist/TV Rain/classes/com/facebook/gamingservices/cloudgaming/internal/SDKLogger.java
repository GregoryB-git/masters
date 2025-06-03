package com.facebook.gamingservices.cloudgaming.internal;

import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.facebook.FacebookRequestError;
import com.facebook.appevents.InternalAppEventsLogger;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public class SDKLogger
{
  private static SDKLogger instance;
  private String appID = null;
  private final InternalAppEventsLogger logger;
  private ConcurrentHashMap<String, String> requestIDToFunctionTypeMap;
  private String sessionID = null;
  private String userID = null;
  
  private SDKLogger(Context paramContext)
  {
    logger = new InternalAppEventsLogger(paramContext);
    requestIDToFunctionTypeMap = new ConcurrentHashMap();
  }
  
  private Bundle getInitParameters()
  {
    Bundle localBundle = new Bundle();
    String str = appID;
    if (str != null) {
      localBundle.putString("app_id", str);
    }
    str = sessionID;
    if (str != null) {
      localBundle.putString("session_id", str);
    }
    return localBundle;
  }
  
  public static SDKLogger getInstance(Context paramContext)
  {
    try
    {
      if (instance == null)
      {
        SDKLogger localSDKLogger = new com/facebook/gamingservices/cloudgaming/internal/SDKLogger;
        localSDKLogger.<init>(paramContext);
        instance = localSDKLogger;
      }
      paramContext = instance;
      return paramContext;
    }
    finally {}
  }
  
  private Bundle getParametersWithRequestIDAndFunctionType(@Nullable String paramString)
  {
    Bundle localBundle = getInitParameters();
    if (paramString != null)
    {
      String str = (String)requestIDToFunctionTypeMap.getOrDefault(paramString, null);
      localBundle.putString("request_id", paramString);
      if (str != null)
      {
        localBundle.putString("function_type", str);
        requestIDToFunctionTypeMap.remove(paramString);
      }
    }
    return localBundle;
  }
  
  private Bundle getParametersWithRequestIDAndFunctionType(String paramString1, String paramString2)
  {
    Bundle localBundle = getInitParameters();
    localBundle.putString("request_id", paramString1);
    localBundle.putString("function_type", paramString2);
    return localBundle;
  }
  
  public void logLoginSuccess()
  {
    Bundle localBundle = getInitParameters();
    logger.logEventImplicitly("cloud_games_login_success", localBundle);
  }
  
  public void logPreparingRequest(String paramString1, String paramString2, JSONObject paramJSONObject)
  {
    paramString1 = getParametersWithRequestIDAndFunctionType(paramString2, paramString1);
    paramString1.putString("payload", paramJSONObject.toString());
    logger.logEventImplicitly("cloud_games_preparing_request", paramString1);
  }
  
  public void logSendingErrorResponse(FacebookRequestError paramFacebookRequestError, @Nullable String paramString)
  {
    paramString = getParametersWithRequestIDAndFunctionType(paramString);
    paramString.putString("error_code", Integer.toString(paramFacebookRequestError.getErrorCode()));
    paramString.putString("error_type", paramFacebookRequestError.getErrorType());
    paramString.putString("error_message", paramFacebookRequestError.getErrorMessage());
    logger.logEventImplicitly("cloud_games_sending_error_response", paramString);
  }
  
  public void logSendingSuccessResponse(String paramString)
  {
    paramString = getParametersWithRequestIDAndFunctionType(paramString);
    logger.logEventImplicitly("cloud_games_sending_success_response", paramString);
  }
  
  public void logSentRequest(String paramString1, String paramString2, JSONObject paramJSONObject)
  {
    Bundle localBundle = getParametersWithRequestIDAndFunctionType(paramString2, paramString1);
    requestIDToFunctionTypeMap.put(paramString2, paramString1);
    localBundle.putString("payload", paramJSONObject.toString());
    logger.logEventImplicitly("cloud_games_sent_request", localBundle);
  }
  
  public void setAppID(String paramString)
  {
    appID = paramString;
  }
  
  public void setSessionID(String paramString)
  {
    sessionID = paramString;
  }
  
  public void setUserID(String paramString)
  {
    userID = paramString;
  }
}

/* Location:
 * Qualified Name:     com.facebook.gamingservices.cloudgaming.internal.SDKLogger
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */