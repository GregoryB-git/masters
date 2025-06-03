package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

public final class J0$c
  implements Application.ActivityLifecycleCallbacks
{
  public J0$c(J0 paramJ0) {}
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    J0.p(o, new o1(this, paramBundle, paramActivity));
  }
  
  public final void onActivityDestroyed(Activity paramActivity)
  {
    J0.p(o, new t1(this, paramActivity));
  }
  
  public final void onActivityPaused(Activity paramActivity)
  {
    J0.p(o, new s1(this, paramActivity));
  }
  
  public final void onActivityResumed(Activity paramActivity)
  {
    J0.p(o, new p1(this, paramActivity));
  }
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
  {
    v0 localv0 = new v0();
    J0.p(o, new u1(this, paramActivity, localv0));
    paramActivity = localv0.o(50L);
    if (paramActivity != null) {
      paramBundle.putAll(paramActivity);
    }
  }
  
  public final void onActivityStarted(Activity paramActivity)
  {
    J0.p(o, new q1(this, paramActivity));
  }
  
  public final void onActivityStopped(Activity paramActivity)
  {
    J0.p(o, new r1(this, paramActivity));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.J0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */