package com.facebook.appevents.internal;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.ArrayList;
import java.util.concurrent.Executor;

final class InAppPurchaseActivityLifecycleTracker$2
  implements Application.ActivityLifecycleCallbacks
{
  public void onActivityCreated(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityDestroyed(Activity paramActivity) {}
  
  public void onActivityPaused(Activity paramActivity) {}
  
  public void onActivityResumed(Activity paramActivity)
  {
    try
    {
      paramActivity = FacebookSdk.getExecutor();
      Runnable local1 = new com/facebook/appevents/internal/InAppPurchaseActivityLifecycleTracker$2$1;
      local1.<init>(this);
      paramActivity.execute(local1);
      return;
    }
    catch (Exception paramActivity)
    {
      for (;;) {}
    }
  }
  
  public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityStarted(Activity paramActivity) {}
  
  public void onActivityStopped(Activity paramActivity)
  {
    try
    {
      if ((InAppPurchaseActivityLifecycleTracker.access$200().booleanValue()) && (paramActivity.getLocalClassName().equals("com.android.billingclient.api.ProxyBillingActivity")))
      {
        Executor localExecutor = FacebookSdk.getExecutor();
        paramActivity = new com/facebook/appevents/internal/InAppPurchaseActivityLifecycleTracker$2$2;
        paramActivity.<init>(this);
        localExecutor.execute(paramActivity);
      }
      return;
    }
    catch (Exception paramActivity)
    {
      for (;;) {}
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.internal.InAppPurchaseActivityLifecycleTracker.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */