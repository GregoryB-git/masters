package com.facebook.applinks;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AppLinkData
{
  private static final String APPLINK_BRIDGE_ARGS_KEY = "bridge_args";
  private static final String APPLINK_METHOD_ARGS_KEY = "method_args";
  private static final String APPLINK_VERSION_KEY = "version";
  public static final String ARGUMENTS_EXTRAS_KEY = "extras";
  public static final String ARGUMENTS_NATIVE_CLASS_KEY = "com.facebook.platform.APPLINK_NATIVE_CLASS";
  public static final String ARGUMENTS_NATIVE_URL = "com.facebook.platform.APPLINK_NATIVE_URL";
  public static final String ARGUMENTS_REFERER_DATA_KEY = "referer_data";
  public static final String ARGUMENTS_TAPTIME_KEY = "com.facebook.platform.APPLINK_TAP_TIME_UTC";
  private static final String AUTO_APPLINK_FLAG_KEY = "is_auto_applink";
  private static final String BRIDGE_ARGS_METHOD_KEY = "method";
  private static final String BUNDLE_AL_APPLINK_DATA_KEY = "al_applink_data";
  private static final String BUNDLE_APPLINK_ARGS_KEY = "com.facebook.platform.APPLINK_ARGS";
  private static final String DEFERRED_APP_LINK_ARGS_FIELD = "applink_args";
  private static final String DEFERRED_APP_LINK_CLASS_FIELD = "applink_class";
  private static final String DEFERRED_APP_LINK_CLICK_TIME_FIELD = "click_time";
  private static final String DEFERRED_APP_LINK_EVENT = "DEFERRED_APP_LINK";
  private static final String DEFERRED_APP_LINK_PATH = "%s/activities";
  private static final String DEFERRED_APP_LINK_URL_FIELD = "applink_url";
  private static final String EXTRAS_DEEPLINK_CONTEXT_KEY = "deeplink_context";
  private static final String METHOD_ARGS_REF_KEY = "ref";
  private static final String METHOD_ARGS_TARGET_URL_KEY = "target_url";
  private static final String PROMOTION_CODE_KEY = "promo_code";
  private static final String REFERER_DATA_REF_KEY = "fb_ref";
  private static final String TAG = "com.facebook.applinks.AppLinkData";
  @Nullable
  private JSONObject appLinkData;
  @Nullable
  private Bundle argumentBundle;
  @Nullable
  private JSONObject arguments;
  @Nullable
  private String promotionCode;
  @Nullable
  private String ref;
  @Nullable
  private Uri targetUri;
  
  @Nullable
  public static AppLinkData createFromActivity(Activity paramActivity)
  {
    if (CrashShieldHandler.isObjectCrashing(AppLinkData.class)) {
      return null;
    }
    try
    {
      Validate.notNull(paramActivity, "activity");
      Intent localIntent = paramActivity.getIntent();
      if (localIntent == null) {
        return null;
      }
      Object localObject = createFromAlApplinkData(localIntent);
      paramActivity = (Activity)localObject;
      if (localObject == null) {
        paramActivity = createFromJson(localIntent.getStringExtra("com.facebook.platform.APPLINK_ARGS"));
      }
      localObject = paramActivity;
      if (paramActivity == null) {
        localObject = createFromUri(localIntent.getData());
      }
      return (AppLinkData)localObject;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramActivity, AppLinkData.class);
    }
    return null;
  }
  
  @Nullable
  public static AppLinkData createFromAlApplinkData(Intent paramIntent)
  {
    if (CrashShieldHandler.isObjectCrashing(AppLinkData.class)) {
      return null;
    }
    if (paramIntent == null) {
      return null;
    }
    try
    {
      Object localObject = paramIntent.getBundleExtra("al_applink_data");
      if (localObject == null) {
        return null;
      }
      AppLinkData localAppLinkData = new com/facebook/applinks/AppLinkData;
      localAppLinkData.<init>();
      paramIntent = paramIntent.getData();
      targetUri = paramIntent;
      appLinkData = getAppLinkData(paramIntent);
      if (targetUri == null)
      {
        paramIntent = ((BaseBundle)localObject).getString("target_url");
        if (paramIntent != null) {
          targetUri = Uri.parse(paramIntent);
        }
      }
      argumentBundle = ((Bundle)localObject);
      arguments = null;
      paramIntent = ((Bundle)localObject).getBundle("referer_data");
      if (paramIntent != null) {
        ref = paramIntent.getString("fb_ref");
      }
      paramIntent = ((Bundle)localObject).getBundle("extras");
      if (paramIntent != null)
      {
        paramIntent = paramIntent.getString("deeplink_context");
        if (paramIntent != null) {
          try
          {
            localObject = new org/json/JSONObject;
            ((JSONObject)localObject).<init>(paramIntent);
            if (((JSONObject)localObject).has("promo_code")) {
              promotionCode = ((JSONObject)localObject).getString("promo_code");
            }
          }
          catch (JSONException paramIntent)
          {
            Utility.logd(TAG, "Unable to parse deeplink_context JSON", paramIntent);
          }
        }
      }
      return localAppLinkData;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramIntent, AppLinkData.class);
    }
    return null;
  }
  
  @Nullable
  private static AppLinkData createFromJson(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    try
    {
      Object localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>(paramString);
      paramString = ((JSONObject)localObject).getString("version");
      if ((((JSONObject)localObject).getJSONObject("bridge_args").getString("method").equals("applink")) && (paramString.equals("2")))
      {
        paramString = new com/facebook/applinks/AppLinkData;
        paramString.<init>();
        localObject = ((JSONObject)localObject).getJSONObject("method_args");
        arguments = ((JSONObject)localObject);
        if (((JSONObject)localObject).has("ref"))
        {
          ref = arguments.getString("ref");
        }
        else if (arguments.has("referer_data"))
        {
          localObject = arguments.getJSONObject("referer_data");
          if (((JSONObject)localObject).has("fb_ref")) {
            ref = ((JSONObject)localObject).getString("fb_ref");
          }
        }
        if (arguments.has("target_url"))
        {
          localObject = Uri.parse(arguments.getString("target_url"));
          targetUri = ((Uri)localObject);
          appLinkData = getAppLinkData((Uri)localObject);
        }
        if (arguments.has("extras"))
        {
          localObject = arguments.getJSONObject("extras");
          if (((JSONObject)localObject).has("deeplink_context"))
          {
            localObject = ((JSONObject)localObject).getJSONObject("deeplink_context");
            if (((JSONObject)localObject).has("promo_code")) {
              promotionCode = ((JSONObject)localObject).getString("promo_code");
            }
          }
        }
        argumentBundle = toBundle(arguments);
        return paramString;
      }
    }
    catch (FacebookException paramString)
    {
      Utility.logd(TAG, "Unable to parse AppLink JSON", paramString);
    }
    catch (JSONException paramString)
    {
      Utility.logd(TAG, "Unable to parse AppLink JSON", paramString);
    }
    return null;
  }
  
  @Nullable
  private static AppLinkData createFromUri(Uri paramUri)
  {
    if (paramUri == null) {
      return null;
    }
    AppLinkData localAppLinkData = new AppLinkData();
    targetUri = paramUri;
    appLinkData = getAppLinkData(paramUri);
    return localAppLinkData;
  }
  
  public static void fetchDeferredAppLinkData(Context paramContext, CompletionHandler paramCompletionHandler)
  {
    fetchDeferredAppLinkData(paramContext, null, paramCompletionHandler);
  }
  
  public static void fetchDeferredAppLinkData(Context paramContext, String paramString, final CompletionHandler paramCompletionHandler)
  {
    Validate.notNull(paramContext, "context");
    Validate.notNull(paramCompletionHandler, "completionHandler");
    final String str = paramString;
    if (paramString == null) {
      str = Utility.getMetadataApplicationId(paramContext);
    }
    Validate.notNull(str, "applicationId");
    paramContext = paramContext.getApplicationContext();
    FacebookSdk.getExecutor().execute(new Runnable()
    {
      public void run()
      {
        if (CrashShieldHandler.isObjectCrashing(this)) {
          return;
        }
        try
        {
          AppLinkData.access$000(val$applicationContext, str, paramCompletionHandler);
          return;
        }
        finally
        {
          CrashShieldHandler.handleThrowable(localThrowable, this);
        }
      }
    });
  }
  
  private static void fetchDeferredAppLinkFromServer(Context paramContext, String paramString, CompletionHandler paramCompletionHandler)
  {
    Object localObject = new JSONObject();
    try
    {
      ((JSONObject)localObject).put("event", "DEFERRED_APP_LINK");
      Utility.setAppEventAttributionParameters((JSONObject)localObject, AttributionIdentifiers.getAttributionIdentifiers(paramContext), AppEventsLogger.getAnonymousAppDeviceGUID(paramContext), FacebookSdk.getLimitEventAndDataUsage(paramContext));
      Utility.setAppEventExtendedDeviceInfoParameters((JSONObject)localObject, FacebookSdk.getApplicationContext());
      ((JSONObject)localObject).put("application_package_name", paramContext.getPackageName());
      paramString = String.format("%s/activities", new Object[] { paramString });
      Bundle localBundle = null;
      AppLinkData localAppLinkData = null;
      paramContext = localAppLinkData;
      try
      {
        localObject = GraphRequest.newPostRequest(null, paramString, (JSONObject)localObject, null).executeAndWait().getJSONObject();
        paramString = localBundle;
        if (localObject != null)
        {
          paramContext = localAppLinkData;
          String str1 = ((JSONObject)localObject).optString("applink_args");
          paramContext = localAppLinkData;
          long l = ((JSONObject)localObject).optLong("click_time", -1L);
          paramContext = localAppLinkData;
          String str2 = ((JSONObject)localObject).optString("applink_class");
          paramContext = localAppLinkData;
          localObject = ((JSONObject)localObject).optString("applink_url");
          paramContext = localAppLinkData;
          paramString = localBundle;
          if (!TextUtils.isEmpty(str1))
          {
            paramContext = localAppLinkData;
            localAppLinkData = createFromJson(str1);
            paramString = localAppLinkData;
            if (localAppLinkData != null)
            {
              if (l != -1L)
              {
                paramContext = localAppLinkData;
                try
                {
                  paramString = arguments;
                  if (paramString != null)
                  {
                    paramContext = localAppLinkData;
                    paramString.put("com.facebook.platform.APPLINK_TAP_TIME_UTC", l);
                  }
                  paramContext = localAppLinkData;
                  paramString = argumentBundle;
                  if (paramString != null)
                  {
                    paramContext = localAppLinkData;
                    paramString.putString("com.facebook.platform.APPLINK_TAP_TIME_UTC", Long.toString(l));
                  }
                }
                catch (JSONException paramContext)
                {
                  paramContext = localAppLinkData;
                  Utility.logd(TAG, "Unable to put tap time in AppLinkData.arguments");
                }
              }
              if (str2 != null)
              {
                paramContext = localAppLinkData;
                try
                {
                  paramString = arguments;
                  if (paramString != null)
                  {
                    paramContext = localAppLinkData;
                    paramString.put("com.facebook.platform.APPLINK_NATIVE_CLASS", str2);
                  }
                  paramContext = localAppLinkData;
                  paramString = argumentBundle;
                  if (paramString != null)
                  {
                    paramContext = localAppLinkData;
                    paramString.putString("com.facebook.platform.APPLINK_NATIVE_CLASS", str2);
                  }
                }
                catch (JSONException paramContext)
                {
                  paramContext = localAppLinkData;
                  Utility.logd(TAG, "Unable to put app link class name in AppLinkData.arguments");
                }
              }
              paramString = localAppLinkData;
              if (localObject != null)
              {
                paramContext = localAppLinkData;
                try
                {
                  paramString = arguments;
                  if (paramString != null)
                  {
                    paramContext = localAppLinkData;
                    paramString.put("com.facebook.platform.APPLINK_NATIVE_URL", localObject);
                  }
                  paramContext = localAppLinkData;
                  localBundle = argumentBundle;
                  paramString = localAppLinkData;
                  if (localBundle != null)
                  {
                    paramContext = localAppLinkData;
                    localBundle.putString("com.facebook.platform.APPLINK_NATIVE_URL", (String)localObject);
                    paramString = localAppLinkData;
                  }
                }
                catch (JSONException paramContext)
                {
                  paramContext = localAppLinkData;
                  Utility.logd(TAG, "Unable to put app link URL in AppLinkData.arguments");
                  paramString = localAppLinkData;
                }
              }
            }
          }
        }
        paramCompletionHandler.onDeferredAppLinkDataFetched(paramString);
      }
      catch (Exception paramString)
      {
        Utility.logd(TAG, "Unable to fetch deferred applink from server");
        paramString = paramContext;
      }
      return;
    }
    catch (JSONException paramContext)
    {
      throw new FacebookException("An error occurred while preparing deferred app link", paramContext);
    }
  }
  
  @Nullable
  private static JSONObject getAppLinkData(@Nullable Uri paramUri)
  {
    if (CrashShieldHandler.isObjectCrashing(AppLinkData.class)) {
      return null;
    }
    if (paramUri == null) {
      return null;
    }
    try
    {
      paramUri = paramUri.getQueryParameter("al_applink_data");
      if (paramUri == null) {
        return null;
      }
      try
      {
        paramUri = new JSONObject(paramUri);
        return paramUri;
      }
      catch (JSONException paramUri)
      {
        return null;
      }
      return null;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramUri, AppLinkData.class);
    }
  }
  
  private static Bundle toBundle(JSONObject paramJSONObject)
    throws JSONException
  {
    Bundle localBundle = new Bundle();
    Iterator localIterator = paramJSONObject.keys();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject1 = paramJSONObject.get(str);
      if ((localObject1 instanceof JSONObject))
      {
        localBundle.putBundle(str, toBundle((JSONObject)localObject1));
      }
      else if ((localObject1 instanceof JSONArray))
      {
        localObject1 = (JSONArray)localObject1;
        int i = ((JSONArray)localObject1).length();
        int j = 0;
        int k = 0;
        if (i == 0)
        {
          localBundle.putStringArray(str, new String[0]);
        }
        else
        {
          Object localObject2 = ((JSONArray)localObject1).get(0);
          if ((localObject2 instanceof JSONObject))
          {
            localObject2 = new Bundle[((JSONArray)localObject1).length()];
            while (k < ((JSONArray)localObject1).length())
            {
              localObject2[k] = toBundle(((JSONArray)localObject1).getJSONObject(k));
              k++;
            }
            localBundle.putParcelableArray(str, (Parcelable[])localObject2);
          }
          else if (!(localObject2 instanceof JSONArray))
          {
            localObject2 = new String[((JSONArray)localObject1).length()];
            for (k = j; k < ((JSONArray)localObject1).length(); k++) {
              localObject2[k] = ((JSONArray)localObject1).get(k).toString();
            }
            localBundle.putStringArray(str, (String[])localObject2);
          }
          else
          {
            throw new FacebookException("Nested arrays are not supported.");
          }
        }
      }
      else
      {
        localBundle.putString(str, localObject1.toString());
      }
    }
    return localBundle;
  }
  
  public JSONObject getAppLinkData()
  {
    JSONObject localJSONObject = appLinkData;
    if (localJSONObject == null) {
      localJSONObject = new JSONObject();
    }
    return localJSONObject;
  }
  
  @Nullable
  public Bundle getArgumentBundle()
  {
    return argumentBundle;
  }
  
  @Nullable
  public String getPromotionCode()
  {
    return promotionCode;
  }
  
  @Nullable
  public String getRef()
  {
    return ref;
  }
  
  @Nullable
  public Bundle getRefererData()
  {
    Bundle localBundle = argumentBundle;
    if (localBundle != null) {
      return localBundle.getBundle("referer_data");
    }
    return null;
  }
  
  @Nullable
  public Uri getTargetUri()
  {
    return targetUri;
  }
  
  public boolean isAutoAppLink()
  {
    Object localObject = targetUri;
    boolean bool1 = false;
    if (localObject == null) {
      return false;
    }
    localObject = ((Uri)localObject).getHost();
    String str1 = targetUri.getScheme();
    String str2 = String.format("fb%s", new Object[] { FacebookSdk.getApplicationId() });
    JSONObject localJSONObject = appLinkData;
    int i;
    if ((localJSONObject != null) && (localJSONObject.optBoolean("is_auto_applink"))) {
      i = 1;
    } else {
      i = 0;
    }
    boolean bool2 = bool1;
    if (i != 0)
    {
      bool2 = bool1;
      if ("applinks".equals(localObject))
      {
        bool2 = bool1;
        if (str2.equals(str1)) {
          bool2 = true;
        }
      }
    }
    return bool2;
  }
  
  public static abstract interface CompletionHandler
  {
    public abstract void onDeferredAppLinkDataFetched(@Nullable AppLinkData paramAppLinkData);
  }
}

/* Location:
 * Qualified Name:     com.facebook.applinks.AppLinkData
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */