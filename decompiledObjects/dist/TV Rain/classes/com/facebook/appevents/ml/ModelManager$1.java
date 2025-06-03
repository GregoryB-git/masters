package com.facebook.appevents.ml;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.facebook.FacebookSdk;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FeatureManager.Feature;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import org.json.JSONObject;

final class ModelManager$1
  implements Runnable
{
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      try
      {
        SharedPreferences localSharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.internal.MODEL_STORE", 0);
        Object localObject = localSharedPreferences.getString("models", null);
        if ((localObject != null) && (!((String)localObject).isEmpty()))
        {
          localObject = new JSONObject((String)localObject);
        }
        else
        {
          localObject = new org/json/JSONObject;
          ((JSONObject)localObject).<init>();
        }
        long l = localSharedPreferences.getLong("model_request_timestamp", 0L);
        if ((!FeatureManager.isEnabled(FeatureManager.Feature.ModelRequest)) || (((JSONObject)localObject).length() == 0) || (!ModelManager.access$000(l)))
        {
          localObject = ModelManager.access$100();
          if (localObject == null) {
            return;
          }
          localSharedPreferences.edit().putString("models", ((JSONObject)localObject).toString()).putLong("model_request_timestamp", System.currentTimeMillis()).apply();
        }
        ModelManager.access$200((JSONObject)localObject);
        ModelManager.access$300();
      }
      finally
      {
        CrashShieldHandler.handleThrowable(localThrowable, this);
      }
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.ml.ModelManager.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */