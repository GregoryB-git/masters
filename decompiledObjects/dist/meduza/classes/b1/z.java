package b1;

import aa.u;
import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Handler;
import b.d;
import ec.i;

public final class z
  implements o
{
  public static final z q = new z();
  public int a;
  public int b;
  public boolean c = true;
  public boolean d = true;
  public Handler e;
  public final p f = new p(this);
  public final d o = new d(this, 2);
  public final b p = new b(this);
  
  public final void a()
  {
    int i = b + 1;
    b = i;
    if (i == 1) {
      if (c)
      {
        f.f(k.a.ON_RESUME);
        c = false;
      }
      else
      {
        Handler localHandler = e;
        i.b(localHandler);
        localHandler.removeCallbacks(o);
      }
    }
  }
  
  public final k getLifecycle()
  {
    return f;
  }
  
  public static final class a
  {
    public static final void a(Activity paramActivity, Application.ActivityLifecycleCallbacks paramActivityLifecycleCallbacks)
    {
      i.e(paramActivity, "activity");
      i.e(paramActivityLifecycleCallbacks, "callback");
      u.g(paramActivity, paramActivityLifecycleCallbacks);
    }
  }
  
  public static final class b
    implements c0.a
  {
    public b(z paramz) {}
    
    public final void a()
    {
      z localz = a;
      int i = a + 1;
      a = i;
      if ((i == 1) && (d))
      {
        f.f(k.a.ON_START);
        d = false;
      }
    }
    
    public final void onCreate() {}
    
    public final void onResume()
    {
      a.a();
    }
  }
}

/* Location:
 * Qualified Name:     b1.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */