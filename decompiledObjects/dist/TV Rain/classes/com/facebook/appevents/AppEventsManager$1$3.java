package com.facebook.appevents;

import com.facebook.appevents.ml.ModelManager;
import com.facebook.internal.FeatureManager.Callback;

class AppEventsManager$1$3
  implements FeatureManager.Callback
{
  public AppEventsManager$1$3(AppEventsManager.1 param1) {}
  
  public void onCompleted(boolean paramBoolean)
  {
    if (paramBoolean) {
      ModelManager.enable();
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.AppEventsManager.1.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */