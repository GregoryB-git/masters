package androidx.core.app;

import android.app.Application;

class ActivityRecreator$2
  implements Runnable
{
  public ActivityRecreator$2(Application paramApplication, ActivityRecreator.LifecycleCheckCallbacks paramLifecycleCheckCallbacks) {}
  
  public void run()
  {
    val$application.unregisterActivityLifecycleCallbacks(val$callbacks);
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.ActivityRecreator.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */