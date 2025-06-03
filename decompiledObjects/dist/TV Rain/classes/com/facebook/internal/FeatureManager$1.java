package com.facebook.internal;

final class FeatureManager$1
  implements FetchedAppGateKeepersManager.Callback
{
  public FeatureManager$1(FeatureManager.Callback paramCallback, FeatureManager.Feature paramFeature) {}
  
  public void onCompleted()
  {
    val$callback.onCompleted(FeatureManager.isEnabled(val$feature));
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.FeatureManager.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */