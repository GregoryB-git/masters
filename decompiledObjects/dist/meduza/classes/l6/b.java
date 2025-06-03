package l6;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

public final class b
  implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2
{
  public static final b e = new b();
  public final AtomicBoolean a = new AtomicBoolean();
  public final AtomicBoolean b = new AtomicBoolean();
  public final ArrayList c = new ArrayList();
  public boolean d = false;
  
  public static void a(Application paramApplication)
  {
    synchronized (e)
    {
      if (!d)
      {
        paramApplication.registerActivityLifecycleCallbacks(???);
        paramApplication.registerComponentCallbacks(???);
        d = true;
      }
      return;
    }
  }
  
  public final void b(boolean paramBoolean)
  {
    synchronized (e)
    {
      Iterator localIterator = c.iterator();
      while (localIterator.hasNext()) {
        ((a)localIterator.next()).a(paramBoolean);
      }
      return;
    }
  }
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    paramActivity = b;
    boolean bool = a.compareAndSet(true, false);
    paramActivity.set(true);
    if (bool) {
      b(false);
    }
  }
  
  public final void onActivityDestroyed(Activity paramActivity) {}
  
  public final void onActivityPaused(Activity paramActivity) {}
  
  public final void onActivityResumed(Activity paramActivity)
  {
    paramActivity = b;
    boolean bool = a.compareAndSet(true, false);
    paramActivity.set(true);
    if (bool) {
      b(false);
    }
  }
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public final void onActivityStarted(Activity paramActivity) {}
  
  public final void onActivityStopped(Activity paramActivity) {}
  
  public final void onConfigurationChanged(Configuration paramConfiguration) {}
  
  public final void onLowMemory() {}
  
  public final void onTrimMemory(int paramInt)
  {
    if ((paramInt == 20) && (a.compareAndSet(false, true)))
    {
      b.set(true);
      b(true);
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(boolean paramBoolean);
  }
}

/* Location:
 * Qualified Name:     l6.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */