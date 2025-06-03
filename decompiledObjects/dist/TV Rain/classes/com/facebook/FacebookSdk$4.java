package com.facebook;

import com.facebook.appevents.AppEventsManager;
import com.facebook.internal.FeatureManager.Callback;

final class FacebookSdk$4
  implements FeatureManager.Callback
{
  public void onCompleted(boolean paramBoolean)
  {
    if (paramBoolean) {
      AppEventsManager.start();
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.FacebookSdk.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */