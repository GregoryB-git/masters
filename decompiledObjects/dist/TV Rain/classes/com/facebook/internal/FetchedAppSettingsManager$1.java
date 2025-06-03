package com.facebook.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;
import com.facebook.appevents.internal.AutomaticAnalyticsLogger;
import com.facebook.appevents.internal.InAppPurchaseActivityLifecycleTracker;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

final class FetchedAppSettingsManager$1
  implements Runnable
{
  public FetchedAppSettingsManager$1(Context paramContext, String paramString1, String paramString2) {}
  
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      SharedPreferences localSharedPreferences = val$context.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
      Object localObject1 = val$settingsKey;
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
          localObject2 = FetchedAppSettingsManager.parseAppSettingsFromJSON(val$applicationId, (JSONObject)localObject4);
        }
      }
      Object localObject4 = FetchedAppSettingsManager.access$000(val$applicationId);
      if (localObject4 != null)
      {
        FetchedAppSettingsManager.parseAppSettingsFromJSON(val$applicationId, (JSONObject)localObject4);
        localSharedPreferences.edit().putString(val$settingsKey, ((JSONObject)localObject4).toString()).apply();
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
      FetchedAppGateKeepersManager.queryAppGateKeepers(val$applicationId, true);
      AutomaticAnalyticsLogger.logActivateAppEvent();
      InAppPurchaseActivityLifecycleTracker.update();
      localObject4 = FetchedAppSettingsManager.access$400();
      if (FetchedAppSettingsManager.access$300().containsKey(val$applicationId)) {
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
}

/* Location:
 * Qualified Name:     com.facebook.internal.FetchedAppSettingsManager.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */