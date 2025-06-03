package gb;

import d2.q;
import eb.c;
import eb.e1;
import eb.h;
import eb.h1;
import eb.k0.g;
import eb.p;
import java.util.Collection;
import m.e;

public final class f0$e
  extends g0
{
  public final k0.g j;
  public final p k = p.b();
  public final h[] l;
  
  public f0$e(f0 paramf0, s2 params2, h[] paramArrayOfh)
  {
    j = params2;
    l = paramArrayOfh;
  }
  
  public final void i(q paramq)
  {
    c localc = j).a;
    if (Boolean.TRUE.equals(h)) {
      paramq.e("wait_for_ready");
    }
    super.i(paramq);
  }
  
  public final void n(e1 arg1)
  {
    super.n(???);
    synchronized (m.b)
    {
      f0 localf0 = m;
      if (g != null)
      {
        boolean bool = i.remove(this);
        if ((!m.b()) && (bool))
        {
          localf0 = m;
          d.b(f);
          localf0 = m;
          if (j != null)
          {
            d.b(g);
            m.g = null;
          }
        }
      }
      m.d.a();
      return;
    }
  }
  
  public final void s(e1 parame1)
  {
    h[] arrayOfh = l;
    int i = arrayOfh.length;
    for (int n = 0; n < i; n++) {
      arrayOfh[n].o(parame1);
    }
  }
}

/* Location:
 * Qualified Name:     gb.f0.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */