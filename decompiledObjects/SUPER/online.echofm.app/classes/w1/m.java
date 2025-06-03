package w1;

import A5.a.b;
import E5.k;
import android.app.Activity;
import android.content.Context;

public final class m
  implements A5.a, B5.a
{
  public final q a = new q();
  public k b;
  public B5.c c;
  public l d;
  
  public final void a()
  {
    B5.c localc = c;
    if (localc != null)
    {
      localc.d(a);
      c.f(a);
    }
  }
  
  public final void b()
  {
    B5.c localc = c;
    if (localc != null)
    {
      localc.h(a);
      c.e(a);
    }
  }
  
  public final void c(Context paramContext, E5.c paramc)
  {
    b = new k(paramc, "flutter.baseflow.com/permissions/methods");
    paramContext = new l(paramContext, new a(), a, new y());
    d = paramContext;
    b.e(paramContext);
  }
  
  public final void d(Activity paramActivity)
  {
    l locall = d;
    if (locall != null) {
      locall.i(paramActivity);
    }
  }
  
  public final void e()
  {
    b.e(null);
    b = null;
    d = null;
  }
  
  public final void f()
  {
    l locall = d;
    if (locall != null) {
      locall.i(null);
    }
  }
  
  public void onAttachedToActivity(B5.c paramc)
  {
    d(paramc.c());
    c = paramc;
    b();
  }
  
  public void onAttachedToEngine(a.b paramb)
  {
    c(paramb.a(), paramb.b());
  }
  
  public void onDetachedFromActivity()
  {
    f();
    a();
  }
  
  public void onDetachedFromActivityForConfigChanges()
  {
    onDetachedFromActivity();
  }
  
  public void onDetachedFromEngine(a.b paramb)
  {
    e();
  }
  
  public void onReattachedToActivityForConfigChanges(B5.c paramc)
  {
    onAttachedToActivity(paramc);
  }
}

/* Location:
 * Qualified Name:     w1.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */