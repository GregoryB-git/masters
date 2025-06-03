package com.facebook.appevents.internal;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.FetchedAppGateKeepersManager;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Validate;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class AutomaticAnalyticsLogger
{
  private static final String APP_EVENTS_IF_AUTO_LOG_SUBS = "app_events_if_auto_log_subs";
  private static final String TAG = "com.facebook.appevents.internal.AutomaticAnalyticsLogger";
  private static final InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(FacebookSdk.getApplicationContext());
  
  @Nullable
  private static PurchaseLoggingParameters getPurchaseLoggingParameters(String paramString1, String paramString2)
  {
    return getPurchaseLoggingParameters(paramString1, paramString2, new HashMap());
  }
  
  @Nullable
  private static PurchaseLoggingParameters getPurchaseLoggingParameters(String paramString1, String paramString2, Map<String, String> paramMap)
  {
    try
    {
      Object localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>(paramString1);
      paramString1 = new org/json/JSONObject;
      paramString1.<init>(paramString2);
      paramString2 = new android/os/Bundle;
      paramString2.<init>(1);
      paramString2.putCharSequence("fb_iap_product_id", ((JSONObject)localObject).getString("productId"));
      paramString2.putCharSequence("fb_iap_purchase_time", ((JSONObject)localObject).getString("purchaseTime"));
      paramString2.putCharSequence("fb_iap_purchase_token", ((JSONObject)localObject).getString("purchaseToken"));
      paramString2.putCharSequence("fb_iap_package_name", ((JSONObject)localObject).optString("packageName"));
      paramString2.putCharSequence("fb_iap_product_title", paramString1.optString("title"));
      paramString2.putCharSequence("fb_iap_product_description", paramString1.optString("description"));
      String str = paramString1.optString("type");
      paramString2.putCharSequence("fb_iap_product_type", str);
      if (str.equals("subs"))
      {
        paramString2.putCharSequence("fb_iap_subs_auto_renewing", Boolean.toString(((JSONObject)localObject).optBoolean("autoRenewing", false)));
        paramString2.putCharSequence("fb_iap_subs_period", paramString1.optString("subscriptionPeriod"));
        paramString2.putCharSequence("fb_free_trial_period", paramString1.optString("freeTrialPeriod"));
        localObject = paramString1.optString("introductoryPriceCycles");
        if (!((String)localObject).isEmpty())
        {
          paramString2.putCharSequence("fb_intro_price_amount_micros", paramString1.optString("introductoryPriceAmountMicros"));
          paramString2.putCharSequence("fb_intro_price_cycles", (CharSequence)localObject);
        }
      }
      localObject = paramMap.keySet().iterator();
      while (((Iterator)localObject).hasNext())
      {
        str = (String)((Iterator)localObject).next();
        paramString2.putCharSequence(str, (CharSequence)paramMap.get(str));
      }
      paramMap = new java/math/BigDecimal;
      paramMap.<init>(paramString1.getLong("price_amount_micros") / 1000000.0D);
      paramString1 = new PurchaseLoggingParameters(paramMap, Currency.getInstance(paramString1.getString("price_currency_code")), paramString2);
      return paramString1;
    }
    catch (JSONException paramString1)
    {
      Log.e(TAG, "Error parsing in-app subscription data.", paramString1);
    }
    return null;
  }
  
  public static boolean isImplicitPurchaseLoggingEnabled()
  {
    FetchedAppSettings localFetchedAppSettings = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
    boolean bool;
    if ((localFetchedAppSettings != null) && (FacebookSdk.getAutoLogAppEventsEnabled()) && (localFetchedAppSettings.getIAPAutomaticLoggingEnabled())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static void logActivateAppEvent()
  {
    Context localContext = FacebookSdk.getApplicationContext();
    String str = FacebookSdk.getApplicationId();
    boolean bool = FacebookSdk.getAutoLogAppEventsEnabled();
    Validate.notNull(localContext, "context");
    if (bool) {
      if ((localContext instanceof Application)) {
        AppEventsLogger.activateApp((Application)localContext, str);
      } else {
        Log.w(TAG, "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
      }
    }
  }
  
  public static void logActivityTimeSpentEvent(String paramString, long paramLong)
  {
    Object localObject1 = FacebookSdk.getApplicationContext();
    Object localObject2 = FacebookSdk.getApplicationId();
    Validate.notNull(localObject1, "context");
    localObject2 = FetchedAppSettingsManager.queryAppSettings((String)localObject2, false);
    if ((localObject2 != null) && (((FetchedAppSettings)localObject2).getAutomaticLoggingEnabled()) && (paramLong > 0L))
    {
      localObject2 = new InternalAppEventsLogger((Context)localObject1);
      localObject1 = new Bundle(1);
      ((Bundle)localObject1).putCharSequence("fb_aa_time_spent_view_name", paramString);
      ((InternalAppEventsLogger)localObject2).logEvent("fb_aa_time_spent_on_view", paramLong, (Bundle)localObject1);
    }
  }
  
  public static void logPurchase(String paramString1, String paramString2, boolean paramBoolean)
  {
    if (!isImplicitPurchaseLoggingEnabled()) {
      return;
    }
    PurchaseLoggingParameters localPurchaseLoggingParameters = getPurchaseLoggingParameters(paramString1, paramString2);
    if (localPurchaseLoggingParameters == null) {
      return;
    }
    int i = 0;
    int j = i;
    if (paramBoolean)
    {
      j = i;
      if (FetchedAppGateKeepersManager.getGateKeeperForKey("app_events_if_auto_log_subs", FacebookSdk.getApplicationId(), false)) {
        j = 1;
      }
    }
    if (j != 0)
    {
      if (InAppPurchaseEventManager.hasFreeTrialPeirod(paramString2)) {
        paramString1 = "StartTrial";
      } else {
        paramString1 = "Subscribe";
      }
      internalAppEventsLogger.logEventImplicitly(paramString1, purchaseAmount, currency, param);
    }
    else
    {
      internalAppEventsLogger.logPurchaseImplicitly(purchaseAmount, currency, param);
    }
  }
  
  public static class PurchaseLoggingParameters
  {
    public Currency currency;
    public Bundle param;
    public BigDecimal purchaseAmount;
    
    public PurchaseLoggingParameters(BigDecimal paramBigDecimal, Currency paramCurrency, Bundle paramBundle)
    {
      purchaseAmount = paramBigDecimal;
      currency = paramCurrency;
      param = paramBundle;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.internal.AutomaticAnalyticsLogger
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */