package com.facebook.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

final class FetchedAppGateKeepersManager$1
  implements Runnable
{
  public FetchedAppGateKeepersManager$1(String paramString1, Context paramContext, String paramString2) {}
  
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      JSONObject localJSONObject = FetchedAppGateKeepersManager.access$000(val$applicationId);
      if (localJSONObject != null)
      {
        FetchedAppGateKeepersManager.parseAppGateKeepersFromJSON(val$applicationId, localJSONObject);
        val$context.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(val$gateKeepersKey, localJSONObject.toString()).apply();
        FetchedAppGateKeepersManager.access$102(Long.valueOf(System.currentTimeMillis()));
      }
      FetchedAppGateKeepersManager.access$200();
      FetchedAppGateKeepersManager.access$300().set(false);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.FetchedAppGateKeepersManager.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */