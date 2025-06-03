package com.facebook.appevents;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.BaseBundle;
import android.os.Bundle;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

final class AppEventsLoggerImpl$1
  implements Runnable
{
  public AppEventsLoggerImpl$1(Context paramContext, AppEventsLoggerImpl paramAppEventsLoggerImpl) {}
  
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    for (;;)
    {
      try
      {
        localBundle = new android/os/Bundle;
        localBundle.<init>();
        i = 0;
        j = i;
        if (i < 11)
        {
          localObject = new String[] { "com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService" }[i];
          str = new String[] { "core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included" }[i];
        }
      }
      finally
      {
        Bundle localBundle;
        int i;
        int j;
        Object localObject;
        String str;
        CrashShieldHandler.handleThrowable(localThrowable, this);
        return;
      }
      try
      {
        Class.forName((String)localObject);
        localBundle.putInt(str, 1);
        j |= 1 << i;
        i++;
      }
      catch (ClassNotFoundException localClassNotFoundException) {}
    }
    localObject = val$context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
    if (((SharedPreferences)localObject).getInt("kitsBitmask", 0) != j)
    {
      ((SharedPreferences)localObject).edit().putInt("kitsBitmask", j).apply();
      val$logger.logEventImplicitly("fb_sdk_initialize", null, localBundle);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.AppEventsLoggerImpl.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */