package com.google.ads.interactivemedia.v3.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

@TargetApi(14)
final class add
  implements Application.ActivityLifecycleCallbacks
{
  public add(aet paramaet) {}
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle) {}
  
  public final void onActivityDestroyed(Activity paramActivity)
  {
    if (aet.a(a) == paramActivity)
    {
      aet.a(a, null);
      paramActivity = aet.d(a);
      if (paramActivity != null) {
        paramActivity.unregisterActivityLifecycleCallbacks(aet.e(a));
      }
    }
  }
  
  public final void onActivityPaused(Activity paramActivity)
  {
    if ((aet.a(a) == null) || (aet.a(a) == paramActivity))
    {
      aet.a(a, paramActivity);
      paramActivity = a.a("", "", "", "inactive");
      aet.c(a).b(new aeq(aes.activityMonitor, aer.appStateChanged, aet.b(a), paramActivity));
    }
  }
  
  public final void onActivityResumed(Activity paramActivity)
  {
    if (aet.a(a) == paramActivity)
    {
      paramActivity = a.a("", "", "", "active");
      aet.c(a).b(new aeq(aes.activityMonitor, aer.appStateChanged, aet.b(a), paramActivity));
    }
  }
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public final void onActivityStarted(Activity paramActivity) {}
  
  public final void onActivityStopped(Activity paramActivity) {}
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.add
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */