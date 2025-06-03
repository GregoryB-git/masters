package com.facebook;

import com.facebook.internal.FeatureManager.Callback;

final class FacebookSdk$5
  implements FeatureManager.Callback
{
  public void onCompleted(boolean paramBoolean)
  {
    if (paramBoolean) {
      FacebookSdk.hasCustomTabsPrefetching = true;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.FacebookSdk.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */