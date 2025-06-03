package gb;

import eb.b.a;
import eb.c;
import eb.e1;
import eb.h;
import eb.p;
import eb.s0;
import eb.t0;
import x6.b;

public final class k2
  extends b.a
{
  public final u a;
  public final t0<?, ?> b;
  public final s0 c;
  public final c d;
  public final p e;
  public final a f;
  public final h[] g;
  public final Object h = new Object();
  public s i;
  public boolean j;
  public g0 k;
  
  public k2(x paramx, t0 paramt0, s0 params0, c paramc, l.a.a parama, h[] paramArrayOfh)
  {
    a = paramx;
    b = paramt0;
    c = params0;
    d = paramc;
    e = p.b();
    f = parama;
    g = paramArrayOfh;
  }
  
  public final void a(s0 params0)
  {
    b.I(j ^ true, "apply() or fail() already called");
    c.d(params0);
    params0 = e.a();
    try
    {
      s locals = a.d(b, c, d, g);
      e.c(params0);
      c(locals);
      return;
    }
    finally
    {
      e.c(params0);
    }
  }
  
  public final void b(e1 parame1)
  {
    b.s("Cannot fail with OK status", parame1.e() ^ true);
    b.I(j ^ true, "apply() or fail() already called");
    e1 locale1 = v0.g(parame1);
    parame1 = g;
    c(new l0(locale1, t.a.a, parame1));
  }
  
  public final void c(s params)
  {
    boolean bool1 = j;
    boolean bool2 = true;
    b.I(bool1 ^ true, "already finalized");
    j = true;
    synchronized (h)
    {
      int m;
      if (i == null)
      {
        i = params;
        m = 1;
      }
      else
      {
        m = 0;
      }
      if (m == 0)
      {
        if (k == null) {
          bool2 = false;
        }
        b.I(bool2, "delayedStream is null");
        params = k.t(params);
        if (params != null) {
          params.run();
        }
      }
      ((l.a.a)f).a();
      return;
    }
  }
  
  public static abstract interface a {}
}

/* Location:
 * Qualified Name:     gb.k2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */