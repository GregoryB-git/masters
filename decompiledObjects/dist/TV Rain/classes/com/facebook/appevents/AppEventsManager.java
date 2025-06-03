package com.facebook.appevents;

import androidx.annotation.RestrictTo;
import com.facebook.appevents.aam.MetadataIndexer;
import com.facebook.appevents.eventdeactivation.EventDeactivationManager;
import com.facebook.appevents.ml.ModelManager;
import com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FeatureManager.Callback;
import com.facebook.internal.FeatureManager.Feature;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.FetchedAppSettingsManager.FetchedAppSettingsCallback;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class AppEventsManager
{
  public static void start()
  {
    if (CrashShieldHandler.isObjectCrashing(AppEventsManager.class)) {
      return;
    }
    try
    {
      FetchedAppSettingsManager.FetchedAppSettingsCallback local1 = new com/facebook/appevents/AppEventsManager$1;
      local1.<init>();
      FetchedAppSettingsManager.getAppSettingsAsync(local1);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, AppEventsManager.class);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.AppEventsManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */