package com.facebook.appevents.internal;

import com.facebook.appevents.codeless.CodelessManager;
import com.facebook.internal.FeatureManager.Callback;

final class ActivityLifecycleTracker$1
  implements FeatureManager.Callback
{
  public void onCompleted(boolean paramBoolean)
  {
    if (paramBoolean) {
      CodelessManager.enable();
    } else {
      CodelessManager.disable();
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.internal.ActivityLifecycleTracker.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */