package com.facebook.appevents;

import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import java.util.concurrent.Executor;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class InternalAppEventsLogger
{
  private AppEventsLoggerImpl loggerImpl;
  
  public InternalAppEventsLogger(Context paramContext)
  {
    this(new AppEventsLoggerImpl(paramContext, null, null));
  }
  
  public InternalAppEventsLogger(Context paramContext, String paramString)
  {
    this(new AppEventsLoggerImpl(paramContext, paramString, null));
  }
  
  @VisibleForTesting
  public InternalAppEventsLogger(AppEventsLoggerImpl paramAppEventsLoggerImpl)
  {
    loggerImpl = paramAppEventsLoggerImpl;
  }
  
  public InternalAppEventsLogger(String paramString1, String paramString2, AccessToken paramAccessToken)
  {
    this(new AppEventsLoggerImpl(paramString1, paramString2, paramAccessToken));
  }
  
  public static Executor getAnalyticsExecutor()
  {
    return AppEventsLoggerImpl.getAnalyticsExecutor();
  }
  
  public static AppEventsLogger.FlushBehavior getFlushBehavior()
  {
    return AppEventsLoggerImpl.getFlushBehavior();
  }
  
  public static String getPushNotificationsRegistrationId()
  {
    return AppEventsLoggerImpl.getPushNotificationsRegistrationId();
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.GROUP_ID})
  public static void setInternalUserData(Map<String, String> paramMap)
  {
    UserDataStore.setInternalUd(paramMap);
  }
  
  public static void setUserData(Bundle paramBundle)
  {
    UserDataStore.setUserDataAndHash(paramBundle);
  }
  
  public void flush()
  {
    loggerImpl.flush();
  }
  
  public void logChangedSettingsEvent(Bundle paramBundle)
  {
    int i;
    if ((paramBundle.getInt("previous") & 0x2) != 0) {
      i = 1;
    } else {
      i = 0;
    }
    if ((i != 0) || (FacebookSdk.getAutoLogAppEventsEnabled())) {
      loggerImpl.logEventImplicitly("fb_sdk_settings_changed", null, paramBundle);
    }
  }
  
  public void logEvent(String paramString, double paramDouble, Bundle paramBundle)
  {
    if (FacebookSdk.getAutoLogAppEventsEnabled()) {
      loggerImpl.logEvent(paramString, paramDouble, paramBundle);
    }
  }
  
  public void logEvent(String paramString, Bundle paramBundle)
  {
    if (FacebookSdk.getAutoLogAppEventsEnabled()) {
      loggerImpl.logEvent(paramString, paramBundle);
    }
  }
  
  public void logEventFromSE(String paramString1, String paramString2)
  {
    loggerImpl.logEventFromSE(paramString1, paramString2);
  }
  
  public void logEventImplicitly(String paramString)
  {
    if (FacebookSdk.getAutoLogAppEventsEnabled()) {
      loggerImpl.logEventImplicitly(paramString, null, null);
    }
  }
  
  public void logEventImplicitly(String paramString, Bundle paramBundle)
  {
    if (FacebookSdk.getAutoLogAppEventsEnabled()) {
      loggerImpl.logEventImplicitly(paramString, null, paramBundle);
    }
  }
  
  public void logEventImplicitly(String paramString, Double paramDouble, Bundle paramBundle)
  {
    if (FacebookSdk.getAutoLogAppEventsEnabled()) {
      loggerImpl.logEventImplicitly(paramString, paramDouble, paramBundle);
    }
  }
  
  public void logEventImplicitly(String paramString, BigDecimal paramBigDecimal, Currency paramCurrency, Bundle paramBundle)
  {
    if (FacebookSdk.getAutoLogAppEventsEnabled()) {
      loggerImpl.logEventImplicitly(paramString, paramBigDecimal, paramCurrency, paramBundle);
    }
  }
  
  public void logPurchaseImplicitly(BigDecimal paramBigDecimal, Currency paramCurrency, Bundle paramBundle)
  {
    if (FacebookSdk.getAutoLogAppEventsEnabled()) {
      loggerImpl.logPurchaseImplicitly(paramBigDecimal, paramCurrency, paramBundle);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.InternalAppEventsLogger
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */