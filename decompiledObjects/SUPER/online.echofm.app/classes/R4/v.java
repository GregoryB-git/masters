package R4;

import T4.f;
import V5.o;
import V5.t;
import X5.d;
import Y5.b;
import Z5.k;
import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import o6.a;
import p6.I;
import p6.J;

public final class v
{
  public final x a;
  public final X5.g b;
  public final u c;
  public final f d;
  public final s e;
  public long f;
  public final Application.ActivityLifecycleCallbacks g;
  
  public v(x paramx, X5.g paramg, u paramu, f paramf, s params)
  {
    a = paramx;
    b = paramg;
    c = paramu;
    d = paramf;
    e = params;
    f = paramx.b();
    e();
    g = new a(this);
  }
  
  public final void b()
  {
    f = a.b();
  }
  
  public final void c()
  {
    if (a.l(a.V(a.b(), f), d.c()) > 0) {
      e();
    }
  }
  
  public final Application.ActivityLifecycleCallbacks d()
  {
    return g;
  }
  
  public final void e()
  {
    final p localp = e.a();
    p6.g.d(J.a(b), null, null, new b(this, localp, null), 3, null);
  }
  
  public static final class a
    implements Application.ActivityLifecycleCallbacks
  {
    public a(v paramv) {}
    
    public void onActivityCreated(Activity paramActivity, Bundle paramBundle)
    {
      Intrinsics.checkNotNullParameter(paramActivity, "activity");
    }
    
    public void onActivityDestroyed(Activity paramActivity)
    {
      Intrinsics.checkNotNullParameter(paramActivity, "activity");
    }
    
    public void onActivityPaused(Activity paramActivity)
    {
      Intrinsics.checkNotNullParameter(paramActivity, "activity");
      o.b();
    }
    
    public void onActivityResumed(Activity paramActivity)
    {
      Intrinsics.checkNotNullParameter(paramActivity, "activity");
      o.c();
    }
    
    public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
    {
      Intrinsics.checkNotNullParameter(paramActivity, "activity");
      Intrinsics.checkNotNullParameter(paramBundle, "outState");
    }
    
    public void onActivityStarted(Activity paramActivity)
    {
      Intrinsics.checkNotNullParameter(paramActivity, "activity");
    }
    
    public void onActivityStopped(Activity paramActivity)
    {
      Intrinsics.checkNotNullParameter(paramActivity, "activity");
    }
  }
  
  public static final class b
    extends k
    implements g6.p
  {
    public int o;
    
    public b(v paramv, p paramp, d paramd)
    {
      super(paramd);
    }
    
    public final d create(Object paramObject, d paramd)
    {
      return new b(p, localp, paramd);
    }
    
    public final Object invoke(I paramI, d paramd)
    {
      return ((b)create(paramI, paramd)).invokeSuspend(t.a);
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      Object localObject = b.c();
      int i = o;
      if (i != 0)
      {
        if (i == 1) {
          o.b(paramObject);
        } else {
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
      }
      else
      {
        o.b(paramObject);
        u localu = v.a(p);
        paramObject = localp;
        o = 1;
        if (localu.a((p)paramObject, this) == localObject) {
          return localObject;
        }
      }
      return t.a;
    }
  }
}

/* Location:
 * Qualified Name:     R4.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */