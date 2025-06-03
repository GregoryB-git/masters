package b1;

import aa.v;
import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import ec.i;

public final class c0$c
  implements Application.ActivityLifecycleCallbacks
{
  public static final a Companion = new a();
  
  public static final void registerIn(Activity paramActivity)
  {
    Companion.getClass();
    i.e(paramActivity, "activity");
    v.k(paramActivity, new c());
  }
  
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
  
  public void onActivityPostCreated(Activity paramActivity, Bundle paramBundle)
  {
    i.e(paramActivity, "activity");
    int i = c0.b;
    c0.b.a(paramActivity, k.a.ON_CREATE);
  }
  
  public void onActivityPostResumed(Activity paramActivity)
  {
    i.e(paramActivity, "activity");
    int i = c0.b;
    c0.b.a(paramActivity, k.a.ON_RESUME);
  }
  
  public void onActivityPostStarted(Activity paramActivity)
  {
    i.e(paramActivity, "activity");
    int i = c0.b;
    c0.b.a(paramActivity, k.a.ON_START);
  }
  
  public void onActivityPreDestroyed(Activity paramActivity)
  {
    i.e(paramActivity, "activity");
    int i = c0.b;
    c0.b.a(paramActivity, k.a.ON_DESTROY);
  }
  
  public void onActivityPrePaused(Activity paramActivity)
  {
    i.e(paramActivity, "activity");
    int i = c0.b;
    c0.b.a(paramActivity, k.a.ON_PAUSE);
  }
  
  public void onActivityPreStopped(Activity paramActivity)
  {
    i.e(paramActivity, "activity");
    int i = c0.b;
    c0.b.a(paramActivity, k.a.ON_STOP);
  }
  
  public void onActivityResumed(Activity paramActivity)
  {
    i.e(paramActivity, "activity");
  }
  
  public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
  {
    i.e(paramActivity, "activity");
    i.e(paramBundle, "bundle");
  }
  
  public void onActivityStarted(Activity paramActivity)
  {
    i.e(paramActivity, "activity");
  }
  
  public void onActivityStopped(Activity paramActivity)
  {
    i.e(paramActivity, "activity");
  }
  
  public static final class a {}
}

/* Location:
 * Qualified Name:     b1.c0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */