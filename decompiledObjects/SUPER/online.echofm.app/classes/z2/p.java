package z2;

import A2.n;
import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import x2.j;

public final class p
  extends X
{
  public final t.b t = new t.b();
  public final e u;
  
  public p(g paramg, e parame, j paramj)
  {
    super(paramg, paramj);
    u = parame;
    o.a("ConnectionlessLifecycleHelper", this);
  }
  
  public static void u(Activity paramActivity, e parame, b paramb)
  {
    g localg = LifecycleCallback.c(paramActivity);
    p localp = (p)localg.b("ConnectionlessLifecycleHelper", p.class);
    paramActivity = localp;
    if (localp == null) {
      paramActivity = new p(localg, parame, j.m());
    }
    n.j(paramb, "ApiKey cannot be null");
    t.add(paramb);
    parame.c(paramActivity);
  }
  
  public final void h()
  {
    super.h();
    v();
  }
  
  public final void j()
  {
    super.j();
    v();
  }
  
  public final void k()
  {
    super.k();
    u.d(this);
  }
  
  public final void m(x2.b paramb, int paramInt)
  {
    u.F(paramb, paramInt);
  }
  
  public final void n()
  {
    u.a();
  }
  
  public final t.b t()
  {
    return t;
  }
  
  public final void v()
  {
    if (!t.isEmpty()) {
      u.c(this);
    }
  }
}

/* Location:
 * Qualified Name:     z2.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */