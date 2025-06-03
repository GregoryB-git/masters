package b1;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import ec.i;

public class f
  implements Application.ActivityLifecycleCallbacks
{
  public void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    i.e(paramActivity, "activity");
  }
  
  public void onActivityDestroyed(Activity paramActivity)
  {
    i.e(paramActivity, "activity");
  }
  
  public void onActivityPaused(Activity paramActivity)
  {
    i.e(paramActivity, "activity");
  }
  
  public void onActivityResumed(Activity paramActivity)
  {
    i.e(paramActivity, "activity");
  }
  
  public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
  {
    i.e(paramActivity, "activity");
    i.e(paramBundle, "outState");
  }
  
  public void onActivityStarted(Activity paramActivity)
  {
    i.e(paramActivity, "activity");
  }
  
  public void onActivityStopped(Activity paramActivity)
  {
    i.e(paramActivity, "activity");
  }
}

/* Location:
 * Qualified Name:     b1.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */