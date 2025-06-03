package com.facebook.login;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.BaseBundle;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

class LoginLogger
{
  public static final String EVENT_EXTRAS_DEFAULT_AUDIENCE = "default_audience";
  public static final String EVENT_EXTRAS_FACEBOOK_VERSION = "facebookVersion";
  public static final String EVENT_EXTRAS_FAILURE = "failure";
  public static final String EVENT_EXTRAS_IS_REAUTHORIZE = "isReauthorize";
  public static final String EVENT_EXTRAS_LOGIN_BEHAVIOR = "login_behavior";
  public static final String EVENT_EXTRAS_MISSING_INTERNET_PERMISSION = "no_internet_permission";
  public static final String EVENT_EXTRAS_NEW_PERMISSIONS = "new_permissions";
  public static final String EVENT_EXTRAS_NOT_TRIED = "not_tried";
  public static final String EVENT_EXTRAS_PERMISSIONS = "permissions";
  public static final String EVENT_EXTRAS_REQUEST_CODE = "request_code";
  public static final String EVENT_EXTRAS_TRY_LOGIN_ACTIVITY = "try_login_activity";
  public static final String EVENT_NAME_LOGIN_COMPLETE = "fb_mobile_login_complete";
  public static final String EVENT_NAME_LOGIN_HEARTBEAT = "fb_mobile_login_heartbeat";
  public static final String EVENT_NAME_LOGIN_METHOD_COMPLETE = "fb_mobile_login_method_complete";
  public static final String EVENT_NAME_LOGIN_METHOD_NOT_TRIED = "fb_mobile_login_method_not_tried";
  public static final String EVENT_NAME_LOGIN_METHOD_START = "fb_mobile_login_method_start";
  public static final String EVENT_NAME_LOGIN_START = "fb_mobile_login_start";
  public static final String EVENT_NAME_LOGIN_STATUS_COMPLETE = "fb_mobile_login_status_complete";
  public static final String EVENT_NAME_LOGIN_STATUS_START = "fb_mobile_login_status_start";
  public static final String EVENT_PARAM_AUTH_LOGGER_ID = "0_auth_logger_id";
  public static final String EVENT_PARAM_CHALLENGE = "7_challenge";
  public static final String EVENT_PARAM_ERROR_CODE = "4_error_code";
  public static final String EVENT_PARAM_ERROR_MESSAGE = "5_error_message";
  public static final String EVENT_PARAM_EXTRAS = "6_extras";
  public static final String EVENT_PARAM_LOGIN_RESULT = "2_result";
  public static final String EVENT_PARAM_METHOD = "3_method";
  public static final String EVENT_PARAM_METHOD_RESULT_SKIPPED = "skipped";
  public static final String EVENT_PARAM_TIMESTAMP = "1_timestamp_ms";
  public static final String FACEBOOK_PACKAGE_NAME = "com.facebook.katana";
  private static final ScheduledExecutorService worker = ;
  private String applicationId;
  private String facebookVersion;
  private final InternalAppEventsLogger logger;
  
  public LoginLogger(Context paramContext, String paramString)
  {
    applicationId = paramString;
    logger = new InternalAppEventsLogger(paramContext, paramString);
    try
    {
      paramContext = paramContext.getPackageManager();
      if (paramContext != null)
      {
        paramContext = paramContext.getPackageInfo("com.facebook.katana", 0);
        if (paramContext != null) {
          facebookVersion = versionName;
        }
      }
      return;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;) {}
    }
  }
  
  private void logHeartbeatEvent(String paramString)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      paramString = newAuthorizationLoggingBundle(paramString);
      Runnable local1 = new com/facebook/login/LoginLogger$1;
      local1.<init>(this, paramString);
      worker.schedule(local1, 5L, TimeUnit.SECONDS);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, this);
    }
  }
  
  public static Bundle newAuthorizationLoggingBundle(String paramString)
  {
    if (CrashShieldHandler.isObjectCrashing(LoginLogger.class)) {
      return null;
    }
    try
    {
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      localBundle.putLong("1_timestamp_ms", System.currentTimeMillis());
      localBundle.putString("0_auth_logger_id", paramString);
      localBundle.putString("3_method", "");
      localBundle.putString("2_result", "");
      localBundle.putString("5_error_message", "");
      localBundle.putString("4_error_code", "");
      localBundle.putString("6_extras", "");
      return localBundle;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, LoginLogger.class);
    }
    return null;
  }
  
  public String getApplicationId()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return null;
    }
    try
    {
      String str = applicationId;
      return str;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
    return null;
  }
  
  public void logAuthorizationMethodComplete(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, Map<String, String> paramMap)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      paramString1 = newAuthorizationLoggingBundle(paramString1);
      if (paramString3 != null) {
        paramString1.putString("2_result", paramString3);
      }
      if (paramString4 != null) {
        paramString1.putString("5_error_message", paramString4);
      }
      if (paramString5 != null) {
        paramString1.putString("4_error_code", paramString5);
      }
      if ((paramMap != null) && (!paramMap.isEmpty()))
      {
        paramString3 = new org/json/JSONObject;
        paramString3.<init>(paramMap);
        paramString1.putString("6_extras", paramString3.toString());
      }
      paramString1.putString("3_method", paramString2);
      logger.logEventImplicitly("fb_mobile_login_method_complete", paramString1);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString1, this);
    }
  }
  
  public void logAuthorizationMethodNotTried(String paramString1, String paramString2)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      paramString1 = newAuthorizationLoggingBundle(paramString1);
      paramString1.putString("3_method", paramString2);
      logger.logEventImplicitly("fb_mobile_login_method_not_tried", paramString1);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString1, this);
    }
  }
  
  public void logAuthorizationMethodStart(String paramString1, String paramString2)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      paramString1 = newAuthorizationLoggingBundle(paramString1);
      paramString1.putString("3_method", paramString2);
      logger.logEventImplicitly("fb_mobile_login_method_start", paramString1);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString1, this);
    }
  }
  
  public void logCompleteLogin(String paramString, Map<String, String> paramMap1, LoginClient.Result.Code paramCode, Map<String, String> paramMap2, Exception paramException)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    for (;;)
    {
      Object localObject;
      try
      {
        localBundle = newAuthorizationLoggingBundle(paramString);
        if (paramCode != null) {
          localBundle.putString("2_result", paramCode.getLoggingValue());
        }
        if ((paramException != null) && (paramException.getMessage() != null)) {
          localBundle.putString("5_error_message", paramException.getMessage());
        }
        paramException = null;
        if (!paramMap1.isEmpty())
        {
          paramException = new org/json/JSONObject;
          paramException.<init>(paramMap1);
        }
        localObject = paramException;
        if (paramMap2 != null)
        {
          paramMap1 = paramException;
          if (paramException == null)
          {
            paramMap1 = new org/json/JSONObject;
            paramMap1.<init>();
          }
        }
      }
      finally
      {
        Bundle localBundle;
        CrashShieldHandler.handleThrowable(paramString, this);
        return;
      }
      try
      {
        paramMap2 = paramMap2.entrySet().iterator();
        localObject = paramMap1;
        if (paramMap2.hasNext())
        {
          paramException = (Map.Entry)paramMap2.next();
          paramMap1.put((String)paramException.getKey(), paramException.getValue());
        }
      }
      catch (JSONException paramMap2)
      {
        localObject = paramMap1;
      }
    }
    if (localObject != null) {
      localBundle.putString("6_extras", ((JSONObject)localObject).toString());
    }
    logger.logEventImplicitly("fb_mobile_login_complete", localBundle);
    if (paramCode == LoginClient.Result.Code.SUCCESS) {
      logHeartbeatEvent(paramString);
    }
  }
  
  public void logLoginStatusError(String paramString, Exception paramException)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      paramString = newAuthorizationLoggingBundle(paramString);
      paramString.putString("2_result", LoginClient.Result.Code.ERROR.getLoggingValue());
      paramString.putString("5_error_message", paramException.toString());
      logger.logEventImplicitly("fb_mobile_login_status_complete", paramString);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, this);
    }
  }
  
  public void logLoginStatusFailure(String paramString)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      paramString = newAuthorizationLoggingBundle(paramString);
      paramString.putString("2_result", "failure");
      logger.logEventImplicitly("fb_mobile_login_status_complete", paramString);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, this);
    }
  }
  
  public void logLoginStatusStart(String paramString)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      paramString = newAuthorizationLoggingBundle(paramString);
      logger.logEventImplicitly("fb_mobile_login_status_start", paramString);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, this);
    }
  }
  
  public void logLoginStatusSuccess(String paramString)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      paramString = newAuthorizationLoggingBundle(paramString);
      paramString.putString("2_result", LoginClient.Result.Code.SUCCESS.getLoggingValue());
      logger.logEventImplicitly("fb_mobile_login_status_complete", paramString);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, this);
    }
  }
  
  public void logStartLogin(LoginClient.Request paramRequest)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    for (;;)
    {
      try
      {
        localBundle = newAuthorizationLoggingBundle(paramRequest.getAuthId());
      }
      finally
      {
        Bundle localBundle;
        JSONObject localJSONObject;
        CrashShieldHandler.handleThrowable(paramRequest, this);
        return;
      }
      try
      {
        localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>();
        localJSONObject.put("login_behavior", paramRequest.getLoginBehavior().toString());
        localJSONObject.put("request_code", LoginClient.getLoginRequestCode());
        localJSONObject.put("permissions", TextUtils.join(",", paramRequest.getPermissions()));
        localJSONObject.put("default_audience", paramRequest.getDefaultAudience().toString());
        localJSONObject.put("isReauthorize", paramRequest.isRerequest());
        paramRequest = facebookVersion;
        if (paramRequest != null) {
          localJSONObject.put("facebookVersion", paramRequest);
        }
        localBundle.putString("6_extras", localJSONObject.toString());
      }
      catch (JSONException paramRequest) {}
    }
    logger.logEventImplicitly("fb_mobile_login_start", null, localBundle);
  }
  
  public void logUnexpectedError(String paramString1, String paramString2)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      logUnexpectedError(paramString1, paramString2, "");
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString1, this);
    }
  }
  
  public void logUnexpectedError(String paramString1, String paramString2, String paramString3)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      Bundle localBundle = newAuthorizationLoggingBundle("");
      localBundle.putString("2_result", LoginClient.Result.Code.ERROR.getLoggingValue());
      localBundle.putString("5_error_message", paramString2);
      localBundle.putString("3_method", paramString3);
      logger.logEventImplicitly(paramString1, localBundle);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString1, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.login.LoginLogger
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */