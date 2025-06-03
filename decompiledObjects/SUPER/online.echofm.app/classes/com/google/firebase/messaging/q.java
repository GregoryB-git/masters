package com.google.firebase.messaging;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

public class q
  implements Application.ActivityLifecycleCallbacks
{
  public final Set o = Collections.newSetFromMap(new WeakHashMap());
  
  public final void c(Intent paramIntent)
  {
    Object localObject = null;
    try
    {
      Bundle localBundle = paramIntent.getExtras();
      paramIntent = (Intent)localObject;
      if (localBundle != null) {
        paramIntent = localBundle.getBundle("gcm.n.analytics_data");
      }
    }
    catch (RuntimeException paramIntent)
    {
      Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", paramIntent);
      paramIntent = (Intent)localObject;
    }
    if (J.C(paramIntent)) {
      J.u(paramIntent);
    }
  }
  
  public void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    paramActivity = paramActivity.getIntent();
    if ((paramActivity != null) && (o.add(paramActivity))) {
      if (Build.VERSION.SDK_INT <= 25) {
        new Handler(Looper.getMainLooper()).post(new p(this, paramActivity));
      } else {
        c(paramActivity);
      }
    }
  }
  
  public void onActivityDestroyed(Activity paramActivity) {}
  
  public void onActivityPaused(Activity paramActivity)
  {
    if (paramActivity.isFinishing()) {
      o.remove(paramActivity.getIntent());
    }
  }
  
  public void onActivityResumed(Activity paramActivity) {}
  
  public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityStarted(Activity paramActivity) {}
  
  public void onActivityStopped(Activity paramActivity) {}
}

/* Location:
 * Qualified Name:     com.google.firebase.messaging.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */