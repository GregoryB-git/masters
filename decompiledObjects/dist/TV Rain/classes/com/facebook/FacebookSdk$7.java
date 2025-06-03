package com.facebook;

import com.facebook.internal.FeatureManager.Callback;
import com.facebook.internal.logging.monitor.MonitorManager;

final class FacebookSdk$7
  implements FeatureManager.Callback
{
  public void onCompleted(boolean paramBoolean)
  {
    if (paramBoolean) {
      MonitorManager.start();
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.FacebookSdk.7
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */