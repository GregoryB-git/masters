package b1;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import ec.i;

public final class a0
  extends f
{
  public a0(z paramz) {}
  
  public void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    i.e(paramActivity, "activity");
    if (Build.VERSION.SDK_INT < 29)
    {
      int i = c0.b;
      paramActivity = paramActivity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
      i.c(paramActivity, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
      a = this$0.p;
    }
  }
  
  public void onActivityPaused(Activity paramActivity)
  {
    i.e(paramActivity, "activity");
    z localz = this$0;
    int i = b - 1;
    b = i;
    if (i == 0)
    {
      paramActivity = e;
      i.b(paramActivity);
      paramActivity.postDelayed(o, 700L);
    }
  }
  
  public void onActivityPreCreated(Activity paramActivity, Bundle paramBundle)
  {
    i.e(paramActivity, "activity");
    z.a.a(paramActivity, new a(this$0));
  }
  
  public void onActivityStopped(Activity paramActivity)
  {
    i.e(paramActivity, "activity");
    paramActivity = this$0;
    int i = a - 1;
    a = i;
    if ((i == 0) && (c))
    {
      f.f(k.a.ON_STOP);
      d = true;
    }
  }
  
  public static final class a
    extends f
  {
    public a(z paramz) {}
    
    public void onActivityPostResumed(Activity paramActivity)
    {
      i.e(paramActivity, "activity");
      this$0.a();
    }
    
    public void onActivityPostStarted(Activity paramActivity)
    {
      i.e(paramActivity, "activity");
      paramActivity = this$0;
      int i = a + 1;
      a = i;
      if ((i == 1) && (d))
      {
        f.f(k.a.ON_START);
        d = false;
      }
    }
  }
}

/* Location:
 * Qualified Name:     b1.a0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */