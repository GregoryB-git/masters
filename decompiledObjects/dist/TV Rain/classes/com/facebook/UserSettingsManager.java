package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.BaseBundle;
import android.os.Bundle;
import android.util.Log;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

final class UserSettingsManager
{
  private static final String ADVERTISERID_COLLECTION_FALSE_WARNING = "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.";
  private static final String ADVERTISERID_COLLECTION_NOT_SET_WARNING = "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.";
  private static final String ADVERTISER_ID_KEY = "advertiser_id";
  private static final String APPLICATION_FIELDS = "fields";
  private static final String AUTOLOG_APPEVENT_NOT_SET_WARNING = "Please set a value for AutoLogAppEventsEnabled. Set the flag to TRUE if you want to collect app install, app launch and in-app purchase events automatically. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.";
  private static final String AUTO_APP_LINK_WARNING = "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest";
  private static final String EVENTS_CODELESS_SETUP_ENABLED = "auto_event_setup_enabled";
  private static final String LAST_TIMESTAMP = "last_timestamp";
  private static final String TAG = "com.facebook.UserSettingsManager";
  private static final long TIMEOUT_7D = 604800000L;
  private static final String USER_SETTINGS = "com.facebook.sdk.USER_SETTINGS";
  private static final String USER_SETTINGS_BITMASK = "com.facebook.sdk.USER_SETTINGS_BITMASK";
  private static final String VALUE = "value";
  private static UserSetting advertiserIDCollectionEnabled = new UserSetting(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");
  private static UserSetting autoInitEnabled;
  private static UserSetting autoLogAppEventsEnabled;
  private static UserSetting codelessSetupEnabled = new UserSetting(false, "auto_event_setup_enabled");
  private static AtomicBoolean isFetchingCodelessStatus;
  private static AtomicBoolean isInitialized = new AtomicBoolean(false);
  private static UserSetting monitorEnabled = new UserSetting(true, "com.facebook.sdk.MonitorEnabled");
  private static SharedPreferences userSettingPref;
  
  static
  {
    isFetchingCodelessStatus = new AtomicBoolean(false);
    autoInitEnabled = new UserSetting(true, "com.facebook.sdk.AutoInitEnabled");
    autoLogAppEventsEnabled = new UserSetting(true, "com.facebook.sdk.AutoLogAppEventsEnabled");
  }
  
  public static boolean getAdvertiserIDCollectionEnabled()
  {
    if (CrashShieldHandler.isObjectCrashing(UserSettingsManager.class)) {
      return false;
    }
    try
    {
      initializeIfNotInitialized();
      boolean bool = advertiserIDCollectionEnabled.getValue();
      return bool;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, UserSettingsManager.class);
    }
    return false;
  }
  
  public static boolean getAutoInitEnabled()
  {
    if (CrashShieldHandler.isObjectCrashing(UserSettingsManager.class)) {
      return false;
    }
    try
    {
      initializeIfNotInitialized();
      boolean bool = autoInitEnabled.getValue();
      return bool;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, UserSettingsManager.class);
    }
    return false;
  }
  
  public static boolean getAutoLogAppEventsEnabled()
  {
    if (CrashShieldHandler.isObjectCrashing(UserSettingsManager.class)) {
      return false;
    }
    try
    {
      initializeIfNotInitialized();
      boolean bool = autoLogAppEventsEnabled.getValue();
      return bool;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, UserSettingsManager.class);
    }
    return false;
  }
  
  public static boolean getCodelessSetupEnabled()
  {
    if (CrashShieldHandler.isObjectCrashing(UserSettingsManager.class)) {
      return false;
    }
    try
    {
      initializeIfNotInitialized();
      boolean bool = codelessSetupEnabled.getValue();
      return bool;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, UserSettingsManager.class);
    }
    return false;
  }
  
  public static boolean getMonitorEnabled()
  {
    if (CrashShieldHandler.isObjectCrashing(UserSettingsManager.class)) {
      return false;
    }
    try
    {
      initializeIfNotInitialized();
      boolean bool = monitorEnabled.getValue();
      return bool;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, UserSettingsManager.class);
    }
    return false;
  }
  
  private static void initializeCodelessSetupEnabledAsync()
  {
    if (CrashShieldHandler.isObjectCrashing(UserSettingsManager.class)) {
      return;
    }
    try
    {
      readSettingFromCache(codelessSetupEnabled);
      long l = System.currentTimeMillis();
      Object localObject = codelessSetupEnabled;
      if ((value != null) && (l - lastTS < 604800000L)) {
        return;
      }
      value = null;
      lastTS = 0L;
      if (!isFetchingCodelessStatus.compareAndSet(false, true)) {
        return;
      }
      Executor localExecutor = FacebookSdk.getExecutor();
      localObject = new com/facebook/UserSettingsManager$1;
      ((1)localObject).<init>(l);
      localExecutor.execute((Runnable)localObject);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, UserSettingsManager.class);
    }
  }
  
  public static void initializeIfNotInitialized()
  {
    if (CrashShieldHandler.isObjectCrashing(UserSettingsManager.class)) {
      return;
    }
    try
    {
      if (!FacebookSdk.isInitialized()) {
        return;
      }
      if (!isInitialized.compareAndSet(false, true)) {
        return;
      }
      userSettingPref = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
      initializeUserSetting(new UserSetting[] { autoLogAppEventsEnabled, advertiserIDCollectionEnabled, autoInitEnabled });
      initializeCodelessSetupEnabledAsync();
      logWarnings();
      logIfSDKSettingsChanged();
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, UserSettingsManager.class);
    }
  }
  
  private static void initializeUserSetting(UserSetting... paramVarArgs)
  {
    if (CrashShieldHandler.isObjectCrashing(UserSettingsManager.class)) {
      return;
    }
    int i = 0;
    try
    {
      while (i < paramVarArgs.length)
      {
        UserSetting localUserSetting = paramVarArgs[i];
        if (localUserSetting == codelessSetupEnabled)
        {
          initializeCodelessSetupEnabledAsync();
        }
        else if (value == null)
        {
          readSettingFromCache(localUserSetting);
          if (value == null) {
            loadSettingFromManifest(localUserSetting);
          }
        }
        else
        {
          writeSettingToCache(localUserSetting);
        }
        i++;
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramVarArgs, UserSettingsManager.class);
    }
  }
  
  private static void loadSettingFromManifest(UserSetting paramUserSetting)
  {
    if (CrashShieldHandler.isObjectCrashing(UserSettingsManager.class)) {
      return;
    }
    try
    {
      validateInitialized();
      try
      {
        Object localObject = FacebookSdk.getApplicationContext();
        ApplicationInfo localApplicationInfo = ((Context)localObject).getPackageManager().getApplicationInfo(((Context)localObject).getPackageName(), 128);
        if (localApplicationInfo != null)
        {
          localObject = metaData;
          if ((localObject != null) && (((BaseBundle)localObject).containsKey(key))) {
            value = Boolean.valueOf(metaData.getBoolean(key, defaultVal));
          }
        }
      }
      catch (PackageManager.NameNotFoundException paramUserSetting)
      {
        Utility.logd(TAG, paramUserSetting);
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramUserSetting, UserSettingsManager.class);
    }
  }
  
  public static void logIfAutoAppLinkEnabled()
  {
    if (CrashShieldHandler.isObjectCrashing(UserSettingsManager.class)) {
      return;
    }
    try
    {
      try
      {
        Object localObject1 = FacebookSdk.getApplicationContext();
        Object localObject2 = ((Context)localObject1).getPackageManager().getApplicationInfo(((Context)localObject1).getPackageName(), 128);
        if (localObject2 != null)
        {
          localObject2 = metaData;
          if ((localObject2 != null) && (((BaseBundle)localObject2).getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)))
          {
            localObject2 = new com/facebook/appevents/InternalAppEventsLogger;
            ((InternalAppEventsLogger)localObject2).<init>((Context)localObject1);
            localObject1 = new android/os/Bundle;
            ((Bundle)localObject1).<init>();
            if (!Utility.isAutoAppLinkSetup())
            {
              ((BaseBundle)localObject1).putString("SchemeWarning", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
              Log.w(TAG, "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
            }
            ((InternalAppEventsLogger)localObject2).logEvent("fb_auto_applink", (Bundle)localObject1);
          }
        }
      }
      finally
      {
        CrashShieldHandler.handleThrowable(localThrowable, UserSettingsManager.class);
      }
      return;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;) {}
    }
  }
  
  private static void logIfSDKSettingsChanged()
  {
    if (CrashShieldHandler.isObjectCrashing(UserSettingsManager.class)) {
      return;
    }
    for (;;)
    {
      try
      {
        if (!isInitialized.get()) {
          return;
        }
        if (!FacebookSdk.isInitialized()) {
          return;
        }
        localObject1 = FacebookSdk.getApplicationContext();
        boolean bool = autoInitEnabled.getValue();
        i = 0;
        if (bool) {
          j = 1;
        } else {
          j = 0;
        }
        if (autoLogAppEventsEnabled.getValue()) {
          k = 1;
        } else {
          k = 0;
        }
        if (advertiserIDCollectionEnabled.getValue()) {
          m = 1;
        } else {
          m = 0;
        }
        if (monitorEnabled.getValue()) {
          n = 1;
        } else {
          n = 0;
        }
        i1 = j << 0 | 0x0 | k << 1 | m << 2 | n << 3;
        i2 = userSettingPref.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
        if (i2 != i1) {
          userSettingPref.edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", i1).commit();
        }
      }
      finally
      {
        Object localObject1;
        int i;
        int j;
        int k;
        int m;
        int n;
        int i1;
        int i2;
        Object localObject2;
        String[] arrayOfString;
        CrashShieldHandler.handleThrowable(localThrowable, UserSettingsManager.class);
        return;
      }
      try
      {
        localObject2 = ((Context)localObject1).getPackageManager().getApplicationInfo(((Context)localObject1).getPackageName(), 128);
        if ((localObject2 != null) && (metaData != null))
        {
          arrayOfString = new String[4];
          arrayOfString[0] = "com.facebook.sdk.AutoInitEnabled";
          arrayOfString[1] = "com.facebook.sdk.AutoLogAppEventsEnabled";
          arrayOfString[2] = "com.facebook.sdk.AdvertiserIDCollectionEnabled";
          arrayOfString[3] = "com.facebook.sdk.MonitorEnabled";
          n = 0;
          k = n;
          j = k;
          m = j;
          if (n < 4) {
            m = j;
          }
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException1)
      {
        continue;
      }
      try
      {
        if (metaData.containsKey(arrayOfString[n])) {
          m = 1;
        } else {
          m = 0;
        }
        j |= m << n;
        m = j;
        i = metaData.getBoolean(arrayOfString[n], new boolean[] { true, true, true, true }[n]);
        k |= i << n;
        n++;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException2) {}
    }
    j = m;
    break label348;
    k = 0;
    j = i;
    label348:
    localObject2 = new com/facebook/appevents/InternalAppEventsLogger;
    ((InternalAppEventsLogger)localObject2).<init>((Context)localObject1);
    localObject1 = new android/os/Bundle;
    ((Bundle)localObject1).<init>();
    ((BaseBundle)localObject1).putInt("usage", j);
    ((BaseBundle)localObject1).putInt("initial", k);
    ((BaseBundle)localObject1).putInt("previous", i2);
    ((BaseBundle)localObject1).putInt("current", i1);
    ((InternalAppEventsLogger)localObject2).logChangedSettingsEvent((Bundle)localObject1);
  }
  
  private static void logWarnings()
  {
    if (CrashShieldHandler.isObjectCrashing(UserSettingsManager.class)) {
      return;
    }
    try
    {
      try
      {
        Object localObject = FacebookSdk.getApplicationContext();
        localObject = ((Context)localObject).getPackageManager().getApplicationInfo(((Context)localObject).getPackageName(), 128);
        if (localObject != null)
        {
          Bundle localBundle = metaData;
          if (localBundle != null)
          {
            if (!localBundle.containsKey("com.facebook.sdk.AutoLogAppEventsEnabled")) {
              Log.w(TAG, "Please set a value for AutoLogAppEventsEnabled. Set the flag to TRUE if you want to collect app install, app launch and in-app purchase events automatically. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
            }
            if (!metaData.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled")) {
              Log.w(TAG, "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
            }
            if (!getAdvertiserIDCollectionEnabled()) {
              Log.w(TAG, "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.");
            }
          }
        }
      }
      finally
      {
        CrashShieldHandler.handleThrowable(localThrowable, UserSettingsManager.class);
      }
      return;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;) {}
    }
  }
  
  private static void readSettingFromCache(UserSetting paramUserSetting)
  {
    if (CrashShieldHandler.isObjectCrashing(UserSettingsManager.class)) {
      return;
    }
    try
    {
      validateInitialized();
      try
      {
        String str = userSettingPref.getString(key, "");
        if (!str.isEmpty())
        {
          JSONObject localJSONObject = new org/json/JSONObject;
          localJSONObject.<init>(str);
          value = Boolean.valueOf(localJSONObject.getBoolean("value"));
          lastTS = localJSONObject.getLong("last_timestamp");
        }
      }
      catch (JSONException paramUserSetting)
      {
        Utility.logd(TAG, paramUserSetting);
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramUserSetting, UserSettingsManager.class);
    }
  }
  
  public static void setAdvertiserIDCollectionEnabled(boolean paramBoolean)
  {
    if (CrashShieldHandler.isObjectCrashing(UserSettingsManager.class)) {
      return;
    }
    try
    {
      advertiserIDCollectionEnabledvalue = Boolean.valueOf(paramBoolean);
      advertiserIDCollectionEnabledlastTS = System.currentTimeMillis();
      if (isInitialized.get()) {
        writeSettingToCache(advertiserIDCollectionEnabled);
      } else {
        initializeIfNotInitialized();
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, UserSettingsManager.class);
    }
  }
  
  public static void setAutoInitEnabled(boolean paramBoolean)
  {
    if (CrashShieldHandler.isObjectCrashing(UserSettingsManager.class)) {
      return;
    }
    try
    {
      autoInitEnabledvalue = Boolean.valueOf(paramBoolean);
      autoInitEnabledlastTS = System.currentTimeMillis();
      if (isInitialized.get()) {
        writeSettingToCache(autoInitEnabled);
      } else {
        initializeIfNotInitialized();
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, UserSettingsManager.class);
    }
  }
  
  public static void setAutoLogAppEventsEnabled(boolean paramBoolean)
  {
    if (CrashShieldHandler.isObjectCrashing(UserSettingsManager.class)) {
      return;
    }
    try
    {
      autoLogAppEventsEnabledvalue = Boolean.valueOf(paramBoolean);
      autoLogAppEventsEnabledlastTS = System.currentTimeMillis();
      if (isInitialized.get()) {
        writeSettingToCache(autoLogAppEventsEnabled);
      } else {
        initializeIfNotInitialized();
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, UserSettingsManager.class);
    }
  }
  
  public static void setMonitorEnabled(boolean paramBoolean)
  {
    if (CrashShieldHandler.isObjectCrashing(UserSettingsManager.class)) {
      return;
    }
    try
    {
      monitorEnabledvalue = Boolean.valueOf(paramBoolean);
      monitorEnabledlastTS = System.currentTimeMillis();
      if (isInitialized.get()) {
        writeSettingToCache(monitorEnabled);
      } else {
        initializeIfNotInitialized();
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, UserSettingsManager.class);
    }
  }
  
  private static void validateInitialized()
  {
    if (CrashShieldHandler.isObjectCrashing(UserSettingsManager.class)) {
      return;
    }
    try
    {
      if (isInitialized.get()) {
        return;
      }
      FacebookSdkNotInitializedException localFacebookSdkNotInitializedException = new com/facebook/FacebookSdkNotInitializedException;
      localFacebookSdkNotInitializedException.<init>("The UserSettingManager has not been initialized successfully");
      throw localFacebookSdkNotInitializedException;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, UserSettingsManager.class);
    }
  }
  
  private static void writeSettingToCache(UserSetting paramUserSetting)
  {
    if (CrashShieldHandler.isObjectCrashing(UserSettingsManager.class)) {
      return;
    }
    try
    {
      validateInitialized();
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>();
        localJSONObject.put("value", value);
        localJSONObject.put("last_timestamp", lastTS);
        userSettingPref.edit().putString(key, localJSONObject.toString()).commit();
        logIfSDKSettingsChanged();
      }
      catch (Exception paramUserSetting)
      {
        Utility.logd(TAG, paramUserSetting);
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramUserSetting, UserSettingsManager.class);
    }
  }
  
  public static class UserSetting
  {
    public boolean defaultVal;
    public String key;
    public long lastTS;
    public Boolean value;
    
    public UserSetting(boolean paramBoolean, String paramString)
    {
      defaultVal = paramBoolean;
      key = paramString;
    }
    
    public boolean getValue()
    {
      Boolean localBoolean = value;
      boolean bool;
      if (localBoolean == null) {
        bool = defaultVal;
      } else {
        bool = localBoolean.booleanValue();
      }
      return bool;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.UserSettingsManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */