package androidx.lifecycle;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Build.VERSION;
import android.os.Bundle;
import androidx.annotation.NonNull;

public class q
  extends Fragment
{
  public a o;
  
  public static void a(Activity paramActivity, d.b paramb)
  {
    if ((paramActivity instanceof h))
    {
      paramActivity = ((h)paramActivity).g();
      if ((paramActivity instanceof i)) {
        ((i)paramActivity).h(paramb);
      }
    }
  }
  
  public static q f(Activity paramActivity)
  {
    return (q)paramActivity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
  }
  
  public static void g(Activity paramActivity)
  {
    if (Build.VERSION.SDK_INT >= 29) {
      b.registerIn(paramActivity);
    }
    paramActivity = paramActivity.getFragmentManager();
    if (paramActivity.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null)
    {
      paramActivity.beginTransaction().add(new q(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
      paramActivity.executePendingTransactions();
    }
  }
  
  public final void b(d.b paramb)
  {
    if (Build.VERSION.SDK_INT < 29) {
      a(getActivity(), paramb);
    }
  }
  
  public final void c(a parama)
  {
    if (parama != null) {
      parama.a();
    }
  }
  
  public final void d(a parama)
  {
    if (parama != null) {
      parama.b();
    }
  }
  
  public final void e(a parama)
  {
    if (parama != null) {
      parama.c();
    }
  }
  
  public void h(a parama)
  {
    o = parama;
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    c(o);
    b(d.b.ON_CREATE);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    b(d.b.ON_DESTROY);
    o = null;
  }
  
  public void onPause()
  {
    super.onPause();
    b(d.b.ON_PAUSE);
  }
  
  public void onResume()
  {
    super.onResume();
    d(o);
    b(d.b.ON_RESUME);
  }
  
  public void onStart()
  {
    super.onStart();
    e(o);
    b(d.b.ON_START);
  }
  
  public void onStop()
  {
    super.onStop();
    b(d.b.ON_STOP);
  }
  
  public static abstract interface a
  {
    public abstract void a();
    
    public abstract void b();
    
    public abstract void c();
  }
  
  public static class b
    implements Application.ActivityLifecycleCallbacks
  {
    public static void registerIn(Activity paramActivity)
    {
      p.a(paramActivity, new b());
    }
    
    public void onActivityCreated(@NonNull Activity paramActivity, Bundle paramBundle) {}
    
    public void onActivityDestroyed(@NonNull Activity paramActivity) {}
    
    public void onActivityPaused(@NonNull Activity paramActivity) {}
    
    public void onActivityPostCreated(@NonNull Activity paramActivity, Bundle paramBundle)
    {
      q.a(paramActivity, d.b.ON_CREATE);
    }
    
    public void onActivityPostResumed(@NonNull Activity paramActivity)
    {
      q.a(paramActivity, d.b.ON_RESUME);
    }
    
    public void onActivityPostStarted(@NonNull Activity paramActivity)
    {
      q.a(paramActivity, d.b.ON_START);
    }
    
    public void onActivityPreDestroyed(@NonNull Activity paramActivity)
    {
      q.a(paramActivity, d.b.ON_DESTROY);
    }
    
    public void onActivityPrePaused(@NonNull Activity paramActivity)
    {
      q.a(paramActivity, d.b.ON_PAUSE);
    }
    
    public void onActivityPreStopped(@NonNull Activity paramActivity)
    {
      q.a(paramActivity, d.b.ON_STOP);
    }
    
    public void onActivityResumed(@NonNull Activity paramActivity) {}
    
    public void onActivitySaveInstanceState(@NonNull Activity paramActivity, @NonNull Bundle paramBundle) {}
    
    public void onActivityStarted(@NonNull Activity paramActivity) {}
    
    public void onActivityStopped(@NonNull Activity paramActivity) {}
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */