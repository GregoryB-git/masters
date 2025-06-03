package com.facebook;

import com.facebook.internal.FeatureManager.Callback;
import com.facebook.internal.instrument.InstrumentManager;

final class FacebookSdk$3
  implements FeatureManager.Callback
{
  public void onCompleted(boolean paramBoolean)
  {
    if (paramBoolean) {
      InstrumentManager.start();
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.FacebookSdk.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */