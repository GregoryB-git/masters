package com.facebook;

import android.os.BaseBundle;
import android.os.Bundle;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

final class UserSettingsManager$1
  implements Runnable
{
  public UserSettingsManager$1(long paramLong) {}
  
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      if (UserSettingsManager.access$000().getValue())
      {
        Object localObject1 = FetchedAppSettingsManager.queryAppSettings(FacebookSdk.getApplicationId(), false);
        if ((localObject1 != null) && (((FetchedAppSettings)localObject1).getCodelessEventsEnabled()))
        {
          Object localObject2 = AttributionIdentifiers.getAttributionIdentifiers(FacebookSdk.getApplicationContext());
          if ((localObject2 != null) && (((AttributionIdentifiers)localObject2).getAndroidAdvertiserId() != null)) {
            localObject1 = ((AttributionIdentifiers)localObject2).getAndroidAdvertiserId();
          } else {
            localObject1 = null;
          }
          if (localObject1 != null)
          {
            localObject1 = new android/os/Bundle;
            ((Bundle)localObject1).<init>();
            ((BaseBundle)localObject1).putString("advertiser_id", ((AttributionIdentifiers)localObject2).getAndroidAdvertiserId());
            ((BaseBundle)localObject1).putString("fields", "auto_event_setup_enabled");
            localObject2 = GraphRequest.newGraphPathRequest(null, FacebookSdk.getApplicationId(), null);
            ((GraphRequest)localObject2).setSkipClientToken(true);
            ((GraphRequest)localObject2).setParameters((Bundle)localObject1);
            localObject1 = ((GraphRequest)localObject2).executeAndWait().getJSONObject();
            if (localObject1 != null)
            {
              access$100value = Boolean.valueOf(((JSONObject)localObject1).optBoolean("auto_event_setup_enabled", false));
              access$100lastTS = val$currTime;
              UserSettingsManager.access$200(UserSettingsManager.access$100());
            }
          }
        }
      }
      UserSettingsManager.access$300().set(false);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.UserSettingsManager.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */