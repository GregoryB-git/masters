package com.facebook.appevents;

import com.facebook.appevents.aam.MetadataIndexer;
import com.facebook.internal.FeatureManager.Callback;

class AppEventsManager$1$1
  implements FeatureManager.Callback
{
  public AppEventsManager$1$1(AppEventsManager.1 param1) {}
  
  public void onCompleted(boolean paramBoolean)
  {
    if (paramBoolean) {
      MetadataIndexer.enable();
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.AppEventsManager.1.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */