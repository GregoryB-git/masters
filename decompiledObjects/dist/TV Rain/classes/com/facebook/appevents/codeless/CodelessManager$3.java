package com.facebook.appevents.codeless;

import android.os.BaseBundle;
import android.os.Build;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.appevents.internal.AppEventUtility;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

final class CodelessManager$3
  implements Runnable
{
  public CodelessManager$3(String paramString) {}
  
  public void run()
  {
    Object localObject1 = "0";
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      Object localObject2 = Locale.US;
      boolean bool = true;
      GraphRequest localGraphRequest = GraphRequest.newPostRequest(null, String.format((Locale)localObject2, "%s/app_indexing_session", new Object[] { val$applicationId }), null, null);
      Object localObject3 = localGraphRequest.getParameters();
      localObject2 = localObject3;
      if (localObject3 == null)
      {
        localObject2 = new android/os/Bundle;
        ((Bundle)localObject2).<init>();
      }
      AttributionIdentifiers localAttributionIdentifiers = AttributionIdentifiers.getAttributionIdentifiers(FacebookSdk.getApplicationContext());
      JSONArray localJSONArray = new org/json/JSONArray;
      localJSONArray.<init>();
      localObject3 = Build.MODEL;
      if (localObject3 == null) {
        localObject3 = "";
      }
      localJSONArray.put(localObject3);
      if ((localAttributionIdentifiers != null) && (localAttributionIdentifiers.getAndroidAdvertiserId() != null)) {
        localJSONArray.put(localAttributionIdentifiers.getAndroidAdvertiserId());
      } else {
        localJSONArray.put("");
      }
      localJSONArray.put("0");
      localObject3 = localObject1;
      if (AppEventUtility.isEmulator()) {
        localObject3 = "1";
      }
      localJSONArray.put(localObject3);
      localObject1 = Utility.getCurrentLocale();
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      ((StringBuilder)localObject3).append(((Locale)localObject1).getLanguage());
      ((StringBuilder)localObject3).append("_");
      ((StringBuilder)localObject3).append(((Locale)localObject1).getCountry());
      localJSONArray.put(((StringBuilder)localObject3).toString());
      localObject3 = localJSONArray.toString();
      ((BaseBundle)localObject2).putString("device_session_id", CodelessManager.getCurrentDeviceSessionID());
      ((BaseBundle)localObject2).putString("extinfo", (String)localObject3);
      localGraphRequest.setParameters((Bundle)localObject2);
      localObject3 = localGraphRequest.executeAndWait().getJSONObject();
      localObject2 = CodelessManager.access$100();
      if ((localObject3 == null) || (!((JSONObject)localObject3).optBoolean("is_app_indexing_enabled", false))) {
        bool = false;
      }
      ((AtomicBoolean)localObject2).set(bool);
      if (!CodelessManager.access$100().get()) {
        CodelessManager.access$202(null);
      } else if (CodelessManager.access$300() != null) {
        CodelessManager.access$300().schedule();
      }
      CodelessManager.access$402(Boolean.FALSE);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.codeless.CodelessManager.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */