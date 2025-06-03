package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.NonNull;

public class o
  implements h
{
  public static final o w = new o();
  public int o = 0;
  public int p = 0;
  public boolean q = true;
  public boolean r = true;
  public Handler s;
  public final i t = new i(this);
  public Runnable u = new a();
  public q.a v = new b();
  
  public static h i()
  {
    return w;
  }
  
  public static void l(Context paramContext)
  {
    w.e(paramContext);
  }
  
  public void a()
  {
    int i = p - 1;
    p = i;
    if (i == 0) {
      s.postDelayed(u, 700L);
    }
  }
  
  public void b()
  {
    int i = p + 1;
    p = i;
    if (i == 1) {
      if (q)
      {
        t.h(d.b.ON_RESUME);
        q = false;
      }
      else
      {
        s.removeCallbacks(u);
      }
    }
  }
  
  public void c()
  {
    int i = o + 1;
    o = i;
    if ((i == 1) && (r))
    {
      t.h(d.b.ON_START);
      r = false;
    }
  }
  
  public void d()
  {
    o -= 1;
    h();
  }
  
  public void e(Context paramContext)
  {
    s = new Handler();
    t.h(d.b.ON_CREATE);
    ((Application)paramContext.getApplicationContext()).registerActivityLifecycleCallbacks(new c());
  }
  
  public void f()
  {
    if (p == 0)
    {
      q = true;
      t.h(d.b.ON_PAUSE);
    }
  }
  
  public d g()
  {
    return t;
  }
  
  public void h()
  {
    if ((o == 0) && (q))
    {
      t.h(d.b.ON_STOP);
      r = true;
    }
  }
  
  public class a
    implements Runnable
  {
    public a() {}
    
    public void run()
    {
      f();
      h();
    }
  }
  
  public class b
    implements q.a
  {
    public b() {}
    
    public void a() {}
    
    public void b()
    {
      o.this.b();
    }
    
    public void c()
    {
      o.this.c();
    }
  }
  
  public class c
    extends b
  {
    public c() {}
    
    public void onActivityCreated(Activity paramActivity, Bundle paramBundle)
    {
      if (Build.VERSION.SDK_INT < 29) {
        q.f(paramActivity).h(v);
      }
    }
    
    public void onActivityPaused(Activity paramActivity)
    {
      a();
    }
    
    public void onActivityPreCreated(@NonNull Activity paramActivity, Bundle paramBundle)
    {
      p.a(paramActivity, new a());
    }
    
    public void onActivityStopped(Activity paramActivity)
    {
      d();
    }
    
    public class a
      extends b
    {
      public a() {}
      
      public void onActivityPostResumed(@NonNull Activity paramActivity)
      {
        b();
      }
      
      public void onActivityPostStarted(@NonNull Activity paramActivity)
      {
        c();
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */