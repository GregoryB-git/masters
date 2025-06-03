package com.facebook.appevents;

import com.facebook.appevents.aam.MetadataIndexer;
import com.facebook.appevents.eventdeactivation.EventDeactivationManager;
import com.facebook.appevents.ml.ModelManager;
import com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FeatureManager.Callback;
import com.facebook.internal.FeatureManager.Feature;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager.FetchedAppSettingsCallback;

final class AppEventsManager$1
  implements FetchedAppSettingsManager.FetchedAppSettingsCallback
{
  public void onError() {}
  
  public void onSuccess(FetchedAppSettings paramFetchedAppSettings)
  {
    FeatureManager.checkFeature(FeatureManager.Feature.AAM, new FeatureManager.Callback()
    {
      public void onCompleted(boolean paramAnonymousBoolean)
      {
        if (paramAnonymousBoolean) {
          MetadataIndexer.enable();
        }
      }
    });
    FeatureManager.checkFeature(FeatureManager.Feature.RestrictiveDataFiltering, new FeatureManager.Callback()
    {
      public void onCompleted(boolean paramAnonymousBoolean)
      {
        if (paramAnonymousBoolean) {
          RestrictiveDataManager.enable();
        }
      }
    });
    FeatureManager.checkFeature(FeatureManager.Feature.PrivacyProtection, new FeatureManager.Callback()
    {
      public void onCompleted(boolean paramAnonymousBoolean)
      {
        if (paramAnonymousBoolean) {
          ModelManager.enable();
        }
      }
    });
    FeatureManager.checkFeature(FeatureManager.Feature.EventDeactivation, new FeatureManager.Callback()
    {
      public void onCompleted(boolean paramAnonymousBoolean)
      {
        if (paramAnonymousBoolean) {
          EventDeactivationManager.enable();
        }
      }
    });
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.AppEventsManager.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */