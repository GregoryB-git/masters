package com.facebook.appevents;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.internal.ActivityLifecycleTracker;
import com.facebook.appevents.internal.AutomaticAnalyticsLogger;
import com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FeatureManager.Feature;
import com.facebook.internal.FetchedAppGateKeepersManager;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.InstallReferrerUtil;
import com.facebook.internal.InstallReferrerUtil.Callback;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

class AppEventsLoggerImpl
{
  private static final String ACCOUNT_KIT_EVENT_NAME_PREFIX = "fb_ak";
  private static final String APP_EVENTS_KILLSWITCH = "app_events_killswitch";
  private static final String APP_EVENT_NAME_PUSH_OPENED = "fb_mobile_push_opened";
  private static final String APP_EVENT_PREFERENCES = "com.facebook.sdk.appEventPreferences";
  private static final String APP_EVENT_PUSH_PARAMETER_ACTION = "fb_push_action";
  private static final String APP_EVENT_PUSH_PARAMETER_CAMPAIGN = "fb_push_campaign";
  private static final int APP_SUPPORTS_ATTRIBUTION_ID_RECHECK_PERIOD_IN_SECONDS = 86400;
  private static final String PUSH_PAYLOAD_CAMPAIGN_KEY = "campaign";
  private static final String PUSH_PAYLOAD_KEY = "fb_push_payload";
  private static final String TAG = "com.facebook.appevents.AppEventsLoggerImpl";
  private static String anonymousAppDeviceGUID;
  private static ScheduledThreadPoolExecutor backgroundExecutor;
  private static AppEventsLogger.FlushBehavior flushBehavior = AppEventsLogger.FlushBehavior.AUTO;
  private static boolean isActivateAppEventRequested;
  private static String pushNotificationsRegistrationId;
  private static final Object staticLock = new Object();
  private final AccessTokenAppIdPair accessTokenAppId;
  private final String contextName;
  
  public AppEventsLoggerImpl(Context paramContext, String paramString, AccessToken paramAccessToken)
  {
    this(Utility.getActivityName(paramContext), paramString, paramAccessToken);
  }
  
  public AppEventsLoggerImpl(String paramString1, String paramString2, AccessToken paramAccessToken)
  {
    Validate.sdkInitialized();
    contextName = paramString1;
    paramString1 = paramAccessToken;
    if (paramAccessToken == null) {
      paramString1 = AccessToken.getCurrentAccessToken();
    }
    if ((paramString1 != null) && (!paramString1.isExpired()) && ((paramString2 == null) || (paramString2.equals(paramString1.getApplicationId()))))
    {
      accessTokenAppId = new AccessTokenAppIdPair(paramString1);
    }
    else
    {
      paramString1 = paramString2;
      if (paramString2 == null) {
        paramString1 = Utility.getMetadataApplicationId(FacebookSdk.getApplicationContext());
      }
      accessTokenAppId = new AccessTokenAppIdPair(null, paramString1);
    }
    initializeTimersIfNeeded();
  }
  
  public static void activateApp(Application paramApplication, String paramString)
  {
    if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
      return;
    }
    try
    {
      if (FacebookSdk.isInitialized())
      {
        AnalyticsUserIDStore.initStore();
        UserDataStore.initStore();
        String str = paramString;
        if (paramString == null) {
          str = FacebookSdk.getApplicationId();
        }
        FacebookSdk.publishInstallAsync(paramApplication, str);
        ActivityLifecycleTracker.startTracking(paramApplication, str);
        return;
      }
      paramApplication = new com/facebook/FacebookException;
      paramApplication.<init>("The Facebook sdk must be initialized before calling activateApp");
      throw paramApplication;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramApplication, AppEventsLoggerImpl.class);
    }
  }
  
  public static void augmentWebView(WebView paramWebView, Context paramContext)
  {
    if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
      return;
    }
    try
    {
      Object localObject = Build.VERSION.RELEASE.split("\\.");
      int i = localObject.length;
      int j = 0;
      if (i > 0) {
        i = Integer.parseInt(localObject[0]);
      } else {
        i = 0;
      }
      if (localObject.length > 1) {
        j = Integer.parseInt(localObject[1]);
      }
      if ((i >= 4) && ((i != 4) || (j > 1)))
      {
        localObject = new com/facebook/appevents/FacebookSDKJSInterface;
        ((FacebookSDKJSInterface)localObject).<init>(paramContext);
        paramContext = new java/lang/StringBuilder;
        paramContext.<init>();
        paramContext.append("fbmq_");
        paramContext.append(FacebookSdk.getApplicationId());
        paramWebView.addJavascriptInterface(localObject, paramContext.toString());
        return;
      }
      Logger.log(LoggingBehavior.DEVELOPER_ERRORS, TAG, "augmentWebView is only available for Android SDK version >= 17 on devices running Android >= 4.2");
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramWebView, AppEventsLoggerImpl.class);
    }
  }
  
  public static void eagerFlush()
  {
    if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
      return;
    }
    try
    {
      if (getFlushBehavior() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) {
        AppEventQueue.flush(FlushReason.EAGER_FLUSHING_EVENT);
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, AppEventsLoggerImpl.class);
    }
  }
  
  public static void functionDEPRECATED(String paramString)
  {
    if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
      return;
    }
    try
    {
      String str = TAG;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append("This function is deprecated. ");
      localStringBuilder.append(paramString);
      Log.w(str, localStringBuilder.toString());
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, AppEventsLoggerImpl.class);
    }
  }
  
  public static Executor getAnalyticsExecutor()
  {
    if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
      return null;
    }
    try
    {
      if (backgroundExecutor == null) {
        initializeTimersIfNeeded();
      }
      ScheduledThreadPoolExecutor localScheduledThreadPoolExecutor = backgroundExecutor;
      return localScheduledThreadPoolExecutor;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, AppEventsLoggerImpl.class);
    }
    return null;
  }
  
  public static String getAnonymousAppDeviceGUID(Context paramContext)
  {
    if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
      return null;
    }
    try
    {
      if (anonymousAppDeviceGUID == null) {
        synchronized (staticLock)
        {
          if (anonymousAppDeviceGUID == null)
          {
            Object localObject2 = paramContext.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null);
            anonymousAppDeviceGUID = (String)localObject2;
            if (localObject2 == null)
            {
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>();
              ((StringBuilder)localObject2).append("XZ");
              ((StringBuilder)localObject2).append(UUID.randomUUID().toString());
              anonymousAppDeviceGUID = ((StringBuilder)localObject2).toString();
              paramContext.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", anonymousAppDeviceGUID).apply();
            }
          }
        }
      }
      paramContext = anonymousAppDeviceGUID;
      return paramContext;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramContext, AppEventsLoggerImpl.class);
    }
    return null;
  }
  
  public static AppEventsLogger.FlushBehavior getFlushBehavior()
  {
    if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
      return null;
    }
    try
    {
      synchronized (staticLock)
      {
        AppEventsLogger.FlushBehavior localFlushBehavior = flushBehavior;
        return localFlushBehavior;
      }
      return null;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, AppEventsLoggerImpl.class);
    }
  }
  
  @Nullable
  public static String getInstallReferrer()
  {
    if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
      return null;
    }
    try
    {
      Object localObject = new com/facebook/appevents/AppEventsLoggerImpl$2;
      ((2)localObject).<init>();
      InstallReferrerUtil.tryUpdateReferrerInfo((InstallReferrerUtil.Callback)localObject);
      localObject = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", null);
      return (String)localObject;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, AppEventsLoggerImpl.class);
    }
    return null;
  }
  
  public static String getPushNotificationsRegistrationId()
  {
    if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
      return null;
    }
    try
    {
      synchronized (staticLock)
      {
        String str = pushNotificationsRegistrationId;
        return str;
      }
      return null;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, AppEventsLoggerImpl.class);
    }
  }
  
  public static void initializeLib(Context paramContext, String paramString)
  {
    if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
      return;
    }
    try
    {
      if (!FacebookSdk.getAutoLogAppEventsEnabled()) {
        return;
      }
      AppEventsLoggerImpl localAppEventsLoggerImpl = new com/facebook/appevents/AppEventsLoggerImpl;
      localAppEventsLoggerImpl.<init>(paramContext, paramString, null);
      paramString = backgroundExecutor;
      Runnable local1 = new com/facebook/appevents/AppEventsLoggerImpl$1;
      local1.<init>(paramContext, localAppEventsLoggerImpl);
      paramString.execute(local1);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramContext, AppEventsLoggerImpl.class);
    }
  }
  
  private static void initializeTimersIfNeeded()
  {
    if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
      return;
    }
    try
    {
      synchronized (staticLock)
      {
        if (backgroundExecutor != null) {
          return;
        }
        ScheduledThreadPoolExecutor localScheduledThreadPoolExecutor = new java/util/concurrent/ScheduledThreadPoolExecutor;
        localScheduledThreadPoolExecutor.<init>(1);
        backgroundExecutor = localScheduledThreadPoolExecutor;
        ??? = new com/facebook/appevents/AppEventsLoggerImpl$3;
        ((3)???).<init>();
        backgroundExecutor.scheduleAtFixedRate((Runnable)???, 0L, 86400L, TimeUnit.SECONDS);
        return;
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, AppEventsLoggerImpl.class);
    }
  }
  
  private static void logEvent(AppEvent paramAppEvent, AccessTokenAppIdPair paramAccessTokenAppIdPair)
  {
    if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
      return;
    }
    try
    {
      AppEventQueue.add(paramAccessTokenAppIdPair, paramAppEvent);
      if ((FeatureManager.isEnabled(FeatureManager.Feature.OnDevicePostInstallEventProcessing)) && (OnDeviceProcessingManager.isOnDeviceProcessingEnabled())) {
        OnDeviceProcessingManager.sendCustomEventAsync(paramAccessTokenAppIdPair.getApplicationId(), paramAppEvent);
      }
      if ((!paramAppEvent.getIsImplicit()) && (!isActivateAppEventRequested)) {
        if (paramAppEvent.getName().equals("fb_mobile_activate_app")) {
          isActivateAppEventRequested = true;
        } else {
          Logger.log(LoggingBehavior.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
        }
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramAppEvent, AppEventsLoggerImpl.class);
    }
  }
  
  private static void notifyDeveloperError(String paramString)
  {
    if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
      return;
    }
    try
    {
      Logger.log(LoggingBehavior.DEVELOPER_ERRORS, "AppEvents", paramString);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, AppEventsLoggerImpl.class);
    }
  }
  
  public static void onContextStop()
  {
    if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
      return;
    }
    try
    {
      AppEventQueue.persistToDisk();
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, AppEventsLoggerImpl.class);
    }
  }
  
  public static void setFlushBehavior(AppEventsLogger.FlushBehavior paramFlushBehavior)
  {
    if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
      return;
    }
    try
    {
      synchronized (staticLock)
      {
        flushBehavior = paramFlushBehavior;
        return;
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramFlushBehavior, AppEventsLoggerImpl.class);
    }
  }
  
  public static void setInstallReferrer(String paramString)
  {
    if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
      return;
    }
    try
    {
      SharedPreferences localSharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
      if (paramString != null) {
        localSharedPreferences.edit().putString("install_referrer", paramString).apply();
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, AppEventsLoggerImpl.class);
    }
  }
  
  public static void setPushNotificationsRegistrationId(String paramString)
  {
    if (CrashShieldHandler.isObjectCrashing(AppEventsLoggerImpl.class)) {
      return;
    }
    try
    {
      synchronized (staticLock)
      {
        if (!Utility.stringsEqualOrEmpty(pushNotificationsRegistrationId, paramString))
        {
          pushNotificationsRegistrationId = paramString;
          paramString = new com/facebook/appevents/AppEventsLoggerImpl;
          paramString.<init>(FacebookSdk.getApplicationContext(), null, null);
          paramString.logEvent("fb_mobile_obtain_push_token");
          if (getFlushBehavior() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) {
            paramString.flush();
          }
        }
        return;
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, AppEventsLoggerImpl.class);
    }
  }
  
  public void flush()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      AppEventQueue.flush(FlushReason.EXPLICIT);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
  
  public String getApplicationId()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return null;
    }
    try
    {
      String str = accessTokenAppId.getApplicationId();
      return str;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
    return null;
  }
  
  public boolean isValidForAccessToken(AccessToken paramAccessToken)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return false;
    }
    try
    {
      AccessTokenAppIdPair localAccessTokenAppIdPair = new com/facebook/appevents/AccessTokenAppIdPair;
      localAccessTokenAppIdPair.<init>(paramAccessToken);
      boolean bool = accessTokenAppId.equals(localAccessTokenAppIdPair);
      return bool;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramAccessToken, this);
    }
    return false;
  }
  
  public void logEvent(String paramString)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      logEvent(paramString, null);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, this);
    }
  }
  
  public void logEvent(String paramString, double paramDouble)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      logEvent(paramString, paramDouble, null);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, this);
    }
  }
  
  public void logEvent(String paramString, double paramDouble, Bundle paramBundle)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      logEvent(paramString, Double.valueOf(paramDouble), paramBundle, false, ActivityLifecycleTracker.getCurrentSessionGuid());
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, this);
    }
  }
  
  public void logEvent(String paramString, Bundle paramBundle)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      logEvent(paramString, null, paramBundle, false, ActivityLifecycleTracker.getCurrentSessionGuid());
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, this);
    }
  }
  
  public void logEvent(String paramString, Double paramDouble, Bundle paramBundle, boolean paramBoolean, @Nullable UUID paramUUID)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    if (paramString != null) {
      try
      {
        if (!paramString.isEmpty())
        {
          boolean bool = FetchedAppGateKeepersManager.getGateKeeperForKey("app_events_killswitch", FacebookSdk.getApplicationId(), false);
          if (bool)
          {
            Logger.log(LoggingBehavior.APP_EVENTS, "AppEvents", "KillSwitch is enabled and fail to log app event: %s", new Object[] { paramString });
            return;
          }
          try
          {
            AppEvent localAppEvent = new com/facebook/appevents/AppEvent;
            localAppEvent.<init>(contextName, paramString, paramDouble, paramBundle, paramBoolean, ActivityLifecycleTracker.isInBackground(), paramUUID);
            logEvent(localAppEvent, accessTokenAppId);
          }
          catch (FacebookException paramString)
          {
            Logger.log(LoggingBehavior.APP_EVENTS, "AppEvents", "Invalid app event: %s", new Object[] { paramString.toString() });
          }
          catch (JSONException paramString)
          {
            Logger.log(LoggingBehavior.APP_EVENTS, "AppEvents", "JSON encoding for app event failed: '%s'", new Object[] { paramString.toString() });
          }
          return;
        }
      }
      finally
      {
        CrashShieldHandler.handleThrowable(paramString, this);
      }
    }
  }
  
  public void logEventFromSE(String paramString1, String paramString2)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      localBundle.putString("_is_suggested_event", "1");
      localBundle.putString("_button_text", paramString2);
      logEvent(paramString1, localBundle);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString1, this);
    }
  }
  
  public void logEventImplicitly(String paramString, Double paramDouble, Bundle paramBundle)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      logEvent(paramString, paramDouble, paramBundle, true, ActivityLifecycleTracker.getCurrentSessionGuid());
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, this);
    }
  }
  
  public void logEventImplicitly(String paramString, BigDecimal paramBigDecimal, Currency paramCurrency, Bundle paramBundle)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    Bundle localBundle;
    if ((paramBigDecimal != null) && (paramCurrency != null))
    {
      localBundle = paramBundle;
      if (paramBundle != null) {}
    }
    try
    {
      localBundle = new android/os/Bundle;
      localBundle.<init>();
      localBundle.putString("fb_currency", paramCurrency.getCurrencyCode());
      logEvent(paramString, Double.valueOf(paramBigDecimal.doubleValue()), localBundle, true, ActivityLifecycleTracker.getCurrentSessionGuid());
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, this);
    }
    Utility.logd(TAG, "purchaseAmount and currency cannot be null");
    return;
  }
  
  public void logProductItem(String paramString1, AppEventsLogger.ProductAvailability paramProductAvailability, AppEventsLogger.ProductCondition paramProductCondition, String paramString2, String paramString3, String paramString4, String paramString5, BigDecimal paramBigDecimal, Currency paramCurrency, String paramString6, String paramString7, String paramString8, Bundle paramBundle)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    if (paramString1 == null) {
      try
      {
        notifyDeveloperError("itemID cannot be null");
        return;
      }
      finally
      {
        break label320;
      }
    }
    if (paramProductAvailability == null)
    {
      notifyDeveloperError("availability cannot be null");
      return;
    }
    if (paramProductCondition == null)
    {
      notifyDeveloperError("condition cannot be null");
      return;
    }
    if (paramString2 == null)
    {
      notifyDeveloperError("description cannot be null");
      return;
    }
    if (paramString3 == null)
    {
      notifyDeveloperError("imageLink cannot be null");
      return;
    }
    if (paramString4 == null)
    {
      notifyDeveloperError("link cannot be null");
      return;
    }
    if (paramString5 == null)
    {
      notifyDeveloperError("title cannot be null");
      return;
    }
    if (paramBigDecimal == null)
    {
      notifyDeveloperError("priceAmount cannot be null");
      return;
    }
    if (paramCurrency == null)
    {
      notifyDeveloperError("currency cannot be null");
      return;
    }
    if ((paramString6 == null) && (paramString7 == null) && (paramString8 == null))
    {
      notifyDeveloperError("Either gtin, mpn or brand is required");
      return;
    }
    Bundle localBundle = paramBundle;
    if (paramBundle == null)
    {
      localBundle = new android/os/Bundle;
      localBundle.<init>();
    }
    localBundle.putString("fb_product_item_id", paramString1);
    localBundle.putString("fb_product_availability", paramProductAvailability.name());
    localBundle.putString("fb_product_condition", paramProductCondition.name());
    localBundle.putString("fb_product_description", paramString2);
    localBundle.putString("fb_product_image_link", paramString3);
    localBundle.putString("fb_product_link", paramString4);
    localBundle.putString("fb_product_title", paramString5);
    localBundle.putString("fb_product_price_amount", paramBigDecimal.setScale(3, 4).toString());
    localBundle.putString("fb_product_price_currency", paramCurrency.getCurrencyCode());
    if (paramString6 != null) {
      localBundle.putString("fb_product_gtin", paramString6);
    }
    if (paramString7 != null) {
      localBundle.putString("fb_product_mpn", paramString7);
    }
    if (paramString8 != null) {
      localBundle.putString("fb_product_brand", paramString8);
    }
    logEvent("fb_mobile_catalog_update", localBundle);
    eagerFlush();
    return;
    label320:
    CrashShieldHandler.handleThrowable(paramString1, this);
  }
  
  public void logPurchase(BigDecimal paramBigDecimal, Currency paramCurrency)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      logPurchase(paramBigDecimal, paramCurrency, null);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramBigDecimal, this);
    }
  }
  
  public void logPurchase(BigDecimal paramBigDecimal, Currency paramCurrency, Bundle paramBundle)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      if (AutomaticAnalyticsLogger.isImplicitPurchaseLoggingEnabled()) {
        Log.w(TAG, "You are logging purchase events while auto-logging of in-app purchase is enabled in the SDK. Make sure you don't log duplicate events");
      }
      logPurchase(paramBigDecimal, paramCurrency, paramBundle, false);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramBigDecimal, this);
    }
  }
  
  public void logPurchase(BigDecimal paramBigDecimal, Currency paramCurrency, Bundle paramBundle, boolean paramBoolean)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    if (paramBigDecimal == null) {
      try
      {
        notifyDeveloperError("purchaseAmount cannot be null");
        return;
      }
      finally
      {
        break label88;
      }
    }
    if (paramCurrency == null)
    {
      notifyDeveloperError("currency cannot be null");
      return;
    }
    Bundle localBundle = paramBundle;
    if (paramBundle == null)
    {
      localBundle = new android/os/Bundle;
      localBundle.<init>();
    }
    localBundle.putString("fb_currency", paramCurrency.getCurrencyCode());
    logEvent("fb_mobile_purchase", Double.valueOf(paramBigDecimal.doubleValue()), localBundle, paramBoolean, ActivityLifecycleTracker.getCurrentSessionGuid());
    eagerFlush();
    return;
    label88:
    CrashShieldHandler.handleThrowable(paramBigDecimal, this);
  }
  
  public void logPurchaseImplicitly(BigDecimal paramBigDecimal, Currency paramCurrency, Bundle paramBundle)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      logPurchase(paramBigDecimal, paramCurrency, paramBundle, true);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramBigDecimal, this);
    }
  }
  
  public void logPushNotificationOpen(Bundle paramBundle, String paramString)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    localBundle = null;
    try
    {
      try
      {
        paramBundle = paramBundle.getString("fb_push_payload");
        if (Utility.isNullOrEmpty(paramBundle)) {
          return;
        }
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramBundle);
        paramBundle = localJSONObject.getString("campaign");
      }
      finally
      {
        break label102;
      }
    }
    catch (JSONException paramBundle)
    {
      for (;;)
      {
        paramBundle = localBundle;
      }
    }
    if (paramBundle == null)
    {
      Logger.log(LoggingBehavior.DEVELOPER_ERRORS, TAG, "Malformed payload specified for logging a push notification open.");
      return;
    }
    localBundle = new android/os/Bundle;
    localBundle.<init>();
    localBundle.putString("fb_push_campaign", paramBundle);
    if (paramString != null) {
      localBundle.putString("fb_push_action", paramString);
    }
    logEvent("fb_mobile_push_opened", localBundle);
    return;
    label102:
    CrashShieldHandler.handleThrowable(paramBundle, this);
  }
  
  public void logSdkEvent(String paramString, Double paramDouble, Bundle paramBundle)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      if (!paramString.startsWith("fb_ak"))
      {
        Log.e(TAG, "logSdkEvent is deprecated and only supports account kit for legacy, please use logEvent instead");
        return;
      }
      if (FacebookSdk.getAutoLogAppEventsEnabled()) {
        logEvent(paramString, paramDouble, paramBundle, true, ActivityLifecycleTracker.getCurrentSessionGuid());
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.AppEventsLoggerImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */