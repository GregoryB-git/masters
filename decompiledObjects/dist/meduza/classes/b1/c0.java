package b1;

import aa.v;
import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Build.VERSION;
import android.os.Bundle;
import ec.i;

public final class c0
  extends Fragment
{
  public a a;
  
  public final void a(k.a parama)
  {
    if (Build.VERSION.SDK_INT < 29)
    {
      Activity localActivity = getActivity();
      i.d(localActivity, "activity");
      b.a(localActivity, parama);
    }
  }
  
  public final void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    paramBundle = a;
    if (paramBundle != null) {
      paramBundle.onCreate();
    }
    a(k.a.ON_CREATE);
  }
  
  public final void onDestroy()
  {
    super.onDestroy();
    a(k.a.ON_DESTROY);
    a = null;
  }
  
  public final void onPause()
  {
    super.onPause();
    a(k.a.ON_PAUSE);
  }
  
  public final void onResume()
  {
    super.onResume();
    a locala = a;
    if (locala != null) {
      locala.onResume();
    }
    a(k.a.ON_RESUME);
  }
  
  public final void onStart()
  {
    super.onStart();
    a locala = a;
    if (locala != null) {
      locala.a();
    }
    a(k.a.ON_START);
  }
  
  public final void onStop()
  {
    super.onStop();
    a(k.a.ON_STOP);
  }
  
  public static abstract interface a
  {
    public abstract void a();
    
    public abstract void onCreate();
    
    public abstract void onResume();
  }
  
  public static final class b
  {
    public static void a(Activity paramActivity, k.a parama)
    {
      i.e(paramActivity, "activity");
      i.e(parama, "event");
      if ((paramActivity instanceof q))
      {
        ((q)paramActivity).getLifecycle().f(parama);
        return;
      }
      if ((paramActivity instanceof o))
      {
        paramActivity = ((o)paramActivity).getLifecycle();
        if ((paramActivity instanceof p)) {
          ((p)paramActivity).f(parama);
        }
      }
    }
    
    public static void b(Activity paramActivity)
    {
      i.e(paramActivity, "activity");
      if (Build.VERSION.SDK_INT >= 29)
      {
        c0.c.Companion.getClass();
        v.k(paramActivity, new c0.c());
      }
      paramActivity = paramActivity.getFragmentManager();
      if (paramActivity.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null)
      {
        paramActivity.beginTransaction().add(new c0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
        paramActivity.executePendingTransactions();
      }
    }
  }
  
  public static final class c
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
}

/* Location:
 * Qualified Name:     b1.c0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */