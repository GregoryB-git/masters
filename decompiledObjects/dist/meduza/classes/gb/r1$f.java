package gb;

import e9.a;
import eb.c;
import eb.d0;
import eb.d0.a;
import eb.e;
import eb.e.a;
import eb.e1;
import eb.f;
import eb.p;
import eb.s0;
import eb.t0;
import eb.x;
import java.util.Map;
import java.util.concurrent.Executor;
import x6.b;

public final class r1$f<ReqT, RespT>
  extends x<ReqT, RespT>
{
  public final d0 a;
  public final a b;
  public final Executor c;
  public final t0<ReqT, RespT> d;
  public final p e;
  public c f;
  public e<ReqT, RespT> g;
  
  public r1$f(d0 paramd0, r1.m.a parama, Executor paramExecutor, t0 paramt0, c paramc)
  {
    a = paramd0;
    b = parama;
    d = paramt0;
    paramd0 = b;
    if (paramd0 != null) {
      paramExecutor = paramd0;
    }
    c = paramExecutor;
    paramd0 = c.b(paramc);
    b = paramExecutor;
    f = new c(paramd0);
    e = p.b();
  }
  
  public final void a(String paramString, Throwable paramThrowable)
  {
    e locale = g;
    if (locale != null) {
      locale.a(paramString, paramThrowable);
    }
  }
  
  public final void e(e.a<RespT> parama, s0 params0)
  {
    Object localObject1 = d;
    Object localObject2 = f;
    b.y(localObject1, "method");
    b.y(params0, "headers");
    b.y(localObject2, "callOptions");
    localObject1 = a.a();
    localObject2 = a;
    if (!((e1)localObject2).e())
    {
      params0 = v0.g((e1)localObject2);
      c.execute(new b2(this, parama, params0));
      g = r1.l0;
      return;
    }
    f localf = c;
    g2 localg2 = (g2)b;
    t0 localt0 = d;
    localObject2 = (g2.a)b.get(b);
    localObject1 = localObject2;
    if (localObject2 == null)
    {
      localObject1 = c;
      localObject1 = (g2.a)c.get(localObject1);
    }
    localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = a;
    }
    if (localObject2 != null) {
      f = f.c(g2.a.g, localObject2);
    }
    if (localf != null) {
      localObject1 = localf.a();
    } else {
      localObject1 = b.v(d, f);
    }
    g = ((e)localObject1);
    ((e)localObject1).e(parama, params0);
  }
  
  public final e<ReqT, RespT> f()
  {
    return g;
  }
}

/* Location:
 * Qualified Name:     gb.r1.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */