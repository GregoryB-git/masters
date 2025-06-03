package com.facebook.referrals;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.BaseBundle;
import android.os.Bundle;
import com.facebook.appevents.InternalAppEventsLogger;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

public class ReferralLogger
{
  public static final String EVENT_EXTRAS_FACEBOOK_VERSION = "facebookVersion";
  public static final String EVENT_EXTRAS_REQUEST_CODE = "request_code";
  public static final String EVENT_NAME_REFERRAL_CANCEL = "fb_mobile_referral_cancel";
  public static final String EVENT_NAME_REFERRAL_ERROR = "fb_mobile_referral_error";
  public static final String EVENT_NAME_REFERRAL_START = "fb_mobile_referral_start";
  public static final String EVENT_NAME_REFERRAL_SUCCESS = "fb_mobile_referral_success";
  public static final String EVENT_PARAM_AUTH_LOGGER_ID = "0_auth_logger_id";
  public static final String EVENT_PARAM_ERROR_MESSAGE = "2_error_message";
  public static final String EVENT_PARAM_EXTRAS = "3_extras";
  public static final String EVENT_PARAM_TIMESTAMP = "1_timestamp_ms";
  public static final String EVENT_PARAM_VALUE_EMPTY = "";
  public static final String FACEBOOK_PACKAGE_NAME = "com.facebook.katana";
  private String facebookVersion;
  private final InternalAppEventsLogger logger;
  private String loggerID;
  
  public ReferralLogger(Context paramContext, String paramString)
  {
    logger = new InternalAppEventsLogger(paramContext, paramString);
    loggerID = UUID.randomUUID().toString();
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
  
  private Bundle getReferralLoggingBundle()
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("0_auth_logger_id", loggerID);
    localBundle.putLong("1_timestamp_ms", System.currentTimeMillis());
    localBundle.putString("2_error_message", "");
    localBundle.putString("3_extras", "");
    return localBundle;
  }
  
  public void logCancel()
  {
    Bundle localBundle = getReferralLoggingBundle();
    logger.logEventImplicitly("fb_mobile_referral_cancel", localBundle);
  }
  
  public void logError(Exception paramException)
  {
    Bundle localBundle = getReferralLoggingBundle();
    if ((paramException != null) && (paramException.getMessage() != null)) {
      localBundle.putString("2_error_message", paramException.getMessage());
    }
    logger.logEventImplicitly("fb_mobile_referral_error", localBundle);
  }
  
  public void logStartReferral()
  {
    Bundle localBundle = getReferralLoggingBundle();
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localJSONObject.put("request_code", ReferralClient.getReferralRequestCode());
      String str = facebookVersion;
      if (str != null) {
        localJSONObject.put("facebookVersion", str);
      }
      localBundle.putString("3_extras", localJSONObject.toString());
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
    logger.logEventImplicitly("fb_mobile_referral_start", localBundle);
  }
  
  public void logSuccess()
  {
    Bundle localBundle = getReferralLoggingBundle();
    logger.logEventImplicitly("fb_mobile_referral_success", localBundle);
  }
}

/* Location:
 * Qualified Name:     com.facebook.referrals.ReferralLogger
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */