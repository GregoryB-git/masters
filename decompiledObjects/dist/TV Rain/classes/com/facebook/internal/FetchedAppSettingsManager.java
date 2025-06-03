package com.facebook.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.appevents.codeless.internal.UnityReflection;
import com.facebook.appevents.internal.AutomaticAnalyticsLogger;
import com.facebook.appevents.internal.Constants;
import com.facebook.appevents.internal.InAppPurchaseActivityLifecycleTracker;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class FetchedAppSettingsManager
{
  private static final String APPLICATION_FIELDS = "fields";
  private static final String APP_SETTINGS_PREFS_KEY_FORMAT = "com.facebook.internal.APP_SETTINGS.%s";
  private static final String APP_SETTINGS_PREFS_STORE = "com.facebook.internal.preferences.APP_SETTINGS";
  private static final String APP_SETTING_ANDROID_SDK_ERROR_CATEGORIES = "android_sdk_error_categories";
  private static final String APP_SETTING_APP_EVENTS_AAM_RULE = "aam_rules";
  private static final String APP_SETTING_APP_EVENTS_EVENT_BINDINGS = "auto_event_mapping_android";
  private static final String APP_SETTING_APP_EVENTS_FEATURE_BITMASK = "app_events_feature_bitmask";
  private static final String APP_SETTING_APP_EVENTS_SESSION_TIMEOUT = "app_events_session_timeout";
  private static final String APP_SETTING_DIALOG_CONFIGS = "android_dialog_configs";
  private static final String[] APP_SETTING_FIELDS = { "supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting" };
  private static final String APP_SETTING_NUX_CONTENT = "gdpv4_nux_content";
  private static final String APP_SETTING_NUX_ENABLED = "gdpv4_nux_enabled";
  private static final String APP_SETTING_RESTRICTIVE_EVENT_FILTER_FIELD = "restrictive_data_filter_params";
  private static final String APP_SETTING_SMART_LOGIN_OPTIONS = "seamless_login";
  private static final String APP_SETTING_SUPPORTS_IMPLICIT_SDK_LOGGING = "supports_implicit_sdk_logging";
  private static final int AUTOMATIC_LOGGING_ENABLED_BITMASK_FIELD = 8;
  private static final int CODELESS_EVENTS_ENABLED_BITMASK_FIELD = 32;
  private static final int IAP_AUTOMATIC_LOGGING_ENABLED_BITMASK_FIELD = 16;
  private static final int MONITOR_ENABLED_BITMASK_FIELD = 16384;
  private static final String SDK_UPDATE_MESSAGE = "sdk_update_message";
  private static final String SMART_LOGIN_BOOKMARK_ICON_URL = "smart_login_bookmark_icon_url";
  private static final String SMART_LOGIN_MENU_ICON_URL = "smart_login_menu_icon_url";
  private static final String SUGGESTED_EVENTS_SETTING = "suggested_events_setting";
  private static final String TAG = "FetchedAppSettingsManager";
  private static final int TRACK_UNINSTALL_ENABLED_BITMASK_FIELD = 256;
  private static final Map<String, FetchedAppSettings> fetchedAppSettings = new ConcurrentHashMap();
  private static final ConcurrentLinkedQueue<FetchedAppSettingsCallback> fetchedAppSettingsCallbacks;
  private static boolean isUnityInit = false;
  private static final AtomicReference<FetchAppSettingState> loadingState = new AtomicReference(FetchAppSettingState.NOT_LOADED);
  private static boolean printedSDKUpdatedMessage;
  @Nullable
  private static JSONArray unityEventBindings = null;
  
  static
  {
    fetchedAppSettingsCallbacks = new ConcurrentLinkedQueue();
    printedSDKUpdatedMessage = false;
  }
  
  public static void getAppSettingsAsync(FetchedAppSettingsCallback paramFetchedAppSettingsCallback)
  {
    fetchedAppSettingsCallbacks.add(paramFetchedAppSettingsCallback);
    loadAppSettingsAsync();
  }
  
  private static JSONObject getAppSettingsQueryResponse(String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("fields", TextUtils.join(",", new ArrayList(Arrays.asList(APP_SETTING_FIELDS))));
    paramString = GraphRequest.newGraphPathRequest(null, paramString, null);
    paramString.setSkipClientToken(true);
    paramString.setParameters(localBundle);
    return paramString.executeAndWait().getJSONObject();
  }
  
  @Nullable
  public static FetchedAppSettings getAppSettingsWithoutQuery(String paramString)
  {
    if (paramString != null) {
      paramString = (FetchedAppSettings)fetchedAppSettings.get(paramString);
    } else {
      paramString = null;
    }
    return paramString;
  }
  
  public static void loadAppSettingsAsync()
  {
    Context localContext = FacebookSdk.getApplicationContext();
    final String str = FacebookSdk.getApplicationId();
    if (Utility.isNullOrEmpty(str))
    {
      loadingState.set(FetchAppSettingState.ERROR);
      pollCallbacks();
      return;
    }
    if (fetchedAppSettings.containsKey(str))
    {
      loadingState.set(FetchAppSettingState.SUCCESS);
      pollCallbacks();
      return;
    }
    Object localObject1 = loadingState;
    FetchAppSettingState localFetchAppSettingState = FetchAppSettingState.NOT_LOADED;
    final Object localObject2 = FetchAppSettingState.LOADING;
    do
    {
      if (((AtomicReference)localObject1).compareAndSet(localFetchAppSettingState, localObject2))
      {
        i = 1;
        break;
      }
    } while (((AtomicReference)localObject1).get() == localFetchAppSettingState);
    int i = 0;
    if (i == 0)
    {
      localObject2 = loadingState;
      localFetchAppSettingState = FetchAppSettingState.ERROR;
      localObject1 = FetchAppSettingState.LOADING;
      do
      {
        if (((AtomicReference)localObject2).compareAndSet(localFetchAppSettingState, localObject1))
        {
          i = 1;
          break;
        }
      } while (((AtomicReference)localObject2).get() == localFetchAppSettingState);
      i = 0;
      if (i == 0)
      {
        i = 0;
        break label156;
      }
    }
    i = 1;
    label156:
    if (i == 0)
    {
      pollCallbacks();
      return;
    }
    localObject2 = String.format("com.facebook.internal.APP_SETTINGS.%s", new Object[] { str });
    FacebookSdk.getExecutor().execute(new Runnable()
    {
      public void run()
      {
        if (CrashShieldHandler.isObjectCrashing(this)) {
          return;
        }
        try
        {
          SharedPreferences localSharedPreferences = val$context.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
          Object localObject1 = localObject2;
          Object localObject3 = null;
          String str = localSharedPreferences.getString((String)localObject1, null);
          boolean bool = Utility.isNullOrEmpty(str);
          localObject1 = localObject3;
          Object localObject2;
          if (!bool)
          {
            try
            {
              localObject4 = new org/json/JSONObject;
              ((JSONObject)localObject4).<init>(str);
            }
            catch (JSONException localJSONException)
            {
              Utility.logd("FacebookSDK", localJSONException);
              localObject4 = null;
            }
            localObject2 = localObject3;
            if (localObject4 != null) {
              localObject2 = FetchedAppSettingsManager.parseAppSettingsFromJSON(str, (JSONObject)localObject4);
            }
          }
          Object localObject4 = FetchedAppSettingsManager.access$000(str);
          if (localObject4 != null)
          {
            FetchedAppSettingsManager.parseAppSettingsFromJSON(str, (JSONObject)localObject4);
            localSharedPreferences.edit().putString(localObject2, ((JSONObject)localObject4).toString()).apply();
          }
          if (localObject2 != null)
          {
            localObject2 = ((FetchedAppSettings)localObject2).getSdkUpdateMessage();
            if ((!FetchedAppSettingsManager.access$100()) && (localObject2 != null) && (((String)localObject2).length() > 0))
            {
              FetchedAppSettingsManager.access$102(true);
              Log.w(FetchedAppSettingsManager.access$200(), (String)localObject2);
            }
          }
          FetchedAppGateKeepersManager.queryAppGateKeepers(str, true);
          AutomaticAnalyticsLogger.logActivateAppEvent();
          InAppPurchaseActivityLifecycleTracker.update();
          localObject4 = FetchedAppSettingsManager.access$400();
          if (FetchedAppSettingsManager.access$300().containsKey(str)) {
            localObject2 = FetchedAppSettingsManager.FetchAppSettingState.SUCCESS;
          } else {
            localObject2 = FetchedAppSettingsManager.FetchAppSettingState.ERROR;
          }
          ((AtomicReference)localObject4).set(localObject2);
          FetchedAppSettingsManager.access$500();
          return;
        }
        finally
        {
          CrashShieldHandler.handleThrowable(localThrowable, this);
        }
      }
    });
  }
  
  public static FetchedAppSettings parseAppSettingsFromJSON(String paramString, JSONObject paramJSONObject)
  {
    Object localObject = paramJSONObject.optJSONArray("android_sdk_error_categories");
    if (localObject == null) {
      localObject = FacebookRequestErrorClassification.getDefaultErrorClassification();
    } else {
      localObject = FacebookRequestErrorClassification.createFromJSON((JSONArray)localObject);
    }
    int i = paramJSONObject.optInt("app_events_feature_bitmask", 0);
    boolean bool1;
    if ((i & 0x8) != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    boolean bool2;
    if ((i & 0x10) != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    boolean bool3;
    if ((i & 0x20) != 0) {
      bool3 = true;
    } else {
      bool3 = false;
    }
    boolean bool4;
    if ((i & 0x100) != 0) {
      bool4 = true;
    } else {
      bool4 = false;
    }
    boolean bool5;
    if ((i & 0x4000) != 0) {
      bool5 = true;
    } else {
      bool5 = false;
    }
    JSONArray localJSONArray = paramJSONObject.optJSONArray("auto_event_mapping_android");
    unityEventBindings = localJSONArray;
    if ((localJSONArray != null) && (InternalSettings.isUnityApp())) {
      UnityReflection.sendEventMapping(localJSONArray.toString());
    }
    paramJSONObject = new FetchedAppSettings(paramJSONObject.optBoolean("supports_implicit_sdk_logging", false), paramJSONObject.optString("gdpv4_nux_content", ""), paramJSONObject.optBoolean("gdpv4_nux_enabled", false), paramJSONObject.optInt("app_events_session_timeout", Constants.getDefaultAppEventsSessionTimeoutInSeconds()), SmartLoginOption.parseOptions(paramJSONObject.optLong("seamless_login")), parseDialogConfigurations(paramJSONObject.optJSONObject("android_dialog_configs")), bool1, (FacebookRequestErrorClassification)localObject, paramJSONObject.optString("smart_login_bookmark_icon_url"), paramJSONObject.optString("smart_login_menu_icon_url"), bool2, bool3, localJSONArray, paramJSONObject.optString("sdk_update_message"), bool4, bool5, paramJSONObject.optString("aam_rules"), paramJSONObject.optString("suggested_events_setting"), paramJSONObject.optString("restrictive_data_filter_params"));
    fetchedAppSettings.put(paramString, paramJSONObject);
    return paramJSONObject;
  }
  
  private static Map<String, Map<String, FetchedAppSettings.DialogFeatureConfig>> parseDialogConfigurations(JSONObject paramJSONObject)
  {
    HashMap localHashMap = new HashMap();
    if (paramJSONObject != null)
    {
      JSONArray localJSONArray = paramJSONObject.optJSONArray("data");
      if (localJSONArray != null) {
        for (int i = 0; i < localJSONArray.length(); i++)
        {
          FetchedAppSettings.DialogFeatureConfig localDialogFeatureConfig = FetchedAppSettings.DialogFeatureConfig.parseDialogConfig(localJSONArray.optJSONObject(i));
          if (localDialogFeatureConfig != null)
          {
            String str = localDialogFeatureConfig.getDialogName();
            Map localMap = (Map)localHashMap.get(str);
            paramJSONObject = localMap;
            if (localMap == null)
            {
              paramJSONObject = new HashMap();
              localHashMap.put(str, paramJSONObject);
            }
            paramJSONObject.put(localDialogFeatureConfig.getFeatureName(), localDialogFeatureConfig);
          }
        }
      }
    }
    return localHashMap;
  }
  
  private static void pollCallbacks()
  {
    try
    {
      Object localObject1 = (FetchAppSettingState)loadingState.get();
      if ((!FetchAppSettingState.NOT_LOADED.equals(localObject1)) && (!FetchAppSettingState.LOADING.equals(localObject1)))
      {
        Object localObject2 = FacebookSdk.getApplicationId();
        Object localObject4 = (FetchedAppSettings)fetchedAppSettings.get(localObject2);
        localObject2 = new android/os/Handler;
        ((Handler)localObject2).<init>(Looper.getMainLooper());
        if (FetchAppSettingState.ERROR.equals(localObject1))
        {
          for (;;)
          {
            localObject4 = fetchedAppSettingsCallbacks;
            if (((ConcurrentLinkedQueue)localObject4).isEmpty()) {
              break;
            }
            localObject4 = (FetchedAppSettingsCallback)((ConcurrentLinkedQueue)localObject4).poll();
            localObject1 = new com/facebook/internal/FetchedAppSettingsManager$2;
            ((2)localObject1).<init>((FetchedAppSettingsCallback)localObject4);
            ((Handler)localObject2).post((Runnable)localObject1);
          }
          return;
        }
        for (;;)
        {
          localObject1 = fetchedAppSettingsCallbacks;
          if (((ConcurrentLinkedQueue)localObject1).isEmpty()) {
            break;
          }
          localObject1 = (FetchedAppSettingsCallback)((ConcurrentLinkedQueue)localObject1).poll();
          Runnable local3 = new com/facebook/internal/FetchedAppSettingsManager$3;
          local3.<init>((FetchedAppSettingsCallback)localObject1, (FetchedAppSettings)localObject4);
          ((Handler)localObject2).post(local3);
        }
        return;
      }
      return;
    }
    finally {}
  }
  
  @Nullable
  public static FetchedAppSettings queryAppSettings(String paramString, boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      localObject = fetchedAppSettings;
      if (((Map)localObject).containsKey(paramString)) {
        return (FetchedAppSettings)((Map)localObject).get(paramString);
      }
    }
    Object localObject = getAppSettingsQueryResponse(paramString);
    if (localObject == null) {
      return null;
    }
    localObject = parseAppSettingsFromJSON(paramString, (JSONObject)localObject);
    if (paramString.equals(FacebookSdk.getApplicationId()))
    {
      loadingState.set(FetchAppSettingState.SUCCESS);
      pollCallbacks();
    }
    return (FetchedAppSettings)localObject;
  }
  
  public static void setIsUnityInit(boolean paramBoolean)
  {
    isUnityInit = paramBoolean;
    JSONArray localJSONArray = unityEventBindings;
    if ((localJSONArray != null) && (paramBoolean)) {
      UnityReflection.sendEventMapping(localJSONArray.toString());
    }
  }
  
  public static enum FetchAppSettingState
  {
    static
    {
      FetchAppSettingState localFetchAppSettingState1 = new FetchAppSettingState("NOT_LOADED", 0);
      NOT_LOADED = localFetchAppSettingState1;
      FetchAppSettingState localFetchAppSettingState2 = new FetchAppSettingState("LOADING", 1);
      LOADING = localFetchAppSettingState2;
      FetchAppSettingState localFetchAppSettingState3 = new FetchAppSettingState("SUCCESS", 2);
      SUCCESS = localFetchAppSettingState3;
      FetchAppSettingState localFetchAppSettingState4 = new FetchAppSettingState("ERROR", 3);
      ERROR = localFetchAppSettingState4;
      $VALUES = new FetchAppSettingState[] { localFetchAppSettingState1, localFetchAppSettingState2, localFetchAppSettingState3, localFetchAppSettingState4 };
    }
    
    private FetchAppSettingState() {}
  }
  
  public static abstract interface FetchedAppSettingsCallback
  {
    public abstract void onError();
    
    public abstract void onSuccess(FetchedAppSettings paramFetchedAppSettings);
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.FetchedAppSettingsManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */