package ea;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import ec.i;
import rb.h;

public final class l0
  implements Application.ActivityLifecycleCallbacks
{
  public static final l0 a = new l0();
  public static boolean b;
  public static h0 c;
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    i.e(paramActivity, "activity");
  }
  
  public final void onActivityDestroyed(Activity paramActivity)
  {
    i.e(paramActivity, "activity");
  }
  
  public final void onActivityPaused(Activity paramActivity)
  {
    i.e(paramActivity, "activity");
    paramActivity = c;
    if (paramActivity != null) {
      paramActivity.b(2);
    }
  }
  
  public final void onActivityResumed(Activity paramActivity)
  {
    i.e(paramActivity, "activity");
    paramActivity = c;
    if (paramActivity != null)
    {
      paramActivity.b(1);
      paramActivity = h.a;
    }
    else
    {
      paramActivity = null;
    }
    if (paramActivity == null) {
      b = true;
    }
  }
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
  {
    i.e(paramActivity, "activity");
    i.e(paramBundle, "outState");
  }
  
  public final void onActivityStarted(Activity paramActivity)
  {
    i.e(paramActivity, "activity");
  }
  
  public final void onActivityStopped(Activity paramActivity)
  {
    i.e(paramActivity, "activity");
  }
}

/* Location:
 * Qualified Name:     ea.l0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */