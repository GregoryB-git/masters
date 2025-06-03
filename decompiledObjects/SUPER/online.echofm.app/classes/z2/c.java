package z2;

import E2.l;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

public final class c
  implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2
{
  public static final c s = new c();
  public final AtomicBoolean o = new AtomicBoolean();
  public final AtomicBoolean p = new AtomicBoolean();
  public final ArrayList q = new ArrayList();
  public boolean r = false;
  
  public static c b()
  {
    return s;
  }
  
  public static void c(Application paramApplication)
  {
    synchronized (s)
    {
      if (!r)
      {
        paramApplication.registerActivityLifecycleCallbacks(???);
        paramApplication.registerComponentCallbacks(???);
        r = true;
      }
    }
  }
  
  public void a(a parama)
  {
    synchronized (s)
    {
      q.add(parama);
      return;
    }
  }
  
  public boolean d()
  {
    return o.get();
  }
  
  public boolean e(boolean paramBoolean)
  {
    if (!p.get()) {
      if (l.b())
      {
        ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(localRunningAppProcessInfo);
        if ((!p.getAndSet(true)) && (importance > 100)) {
          o.set(true);
        }
      }
      else
      {
        return paramBoolean;
      }
    }
    return d();
  }
  
  public final void f(boolean paramBoolean)
  {
    synchronized (s)
    {
      Iterator localIterator = q.iterator();
      if (localIterator.hasNext()) {
        ((a)localIterator.next()).a(paramBoolean);
      }
    }
  }
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    boolean bool = o.compareAndSet(true, false);
    p.set(true);
    if (bool) {
      f(false);
    }
  }
  
  public final void onActivityDestroyed(Activity paramActivity) {}
  
  public final void onActivityPaused(Activity paramActivity) {}
  
  public final void onActivityResumed(Activity paramActivity)
  {
    boolean bool = o.compareAndSet(true, false);
    p.set(true);
    if (bool) {
      f(false);
    }
  }
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public final void onActivityStarted(Activity paramActivity) {}
  
  public final void onActivityStopped(Activity paramActivity) {}
  
  public final void onConfigurationChanged(Configuration paramConfiguration) {}
  
  public final void onLowMemory() {}
  
  public final void onTrimMemory(int paramInt)
  {
    if ((paramInt == 20) && (o.compareAndSet(false, true)))
    {
      p.set(true);
      f(true);
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(boolean paramBoolean);
  }
}

/* Location:
 * Qualified Name:     z2.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */