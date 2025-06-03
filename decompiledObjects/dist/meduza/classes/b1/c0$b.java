package b1;

import aa.v;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Build.VERSION;
import ec.i;

public final class c0$b
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

/* Location:
 * Qualified Name:     b1.c0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */