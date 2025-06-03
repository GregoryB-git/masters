package com.facebook;

import com.facebook.internal.FeatureManager.Callback;

final class FacebookSdk$6
  implements FeatureManager.Callback
{
  public void onCompleted(boolean paramBoolean)
  {
    if (paramBoolean) {
      FacebookSdk.ignoreAppSwitchToLoggedOut = true;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.FacebookSdk.6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */