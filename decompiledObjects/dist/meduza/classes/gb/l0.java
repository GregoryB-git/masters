package gb;

import d2.q;
import eb.e1;
import eb.h;
import eb.s0;
import m.e;
import x6.b;

public final class l0
  extends l2
{
  public boolean b;
  public final e1 c;
  public final t.a d;
  public final h[] e;
  
  public l0(e1 parame1, t.a parama, h[] paramArrayOfh)
  {
    b.s("error must not be OK", parame1.e() ^ true);
    c = parame1;
    d = parama;
    e = paramArrayOfh;
  }
  
  public l0(e1 parame1, h[] paramArrayOfh)
  {
    this(parame1, t.a.a, paramArrayOfh);
  }
  
  public final void i(q paramq)
  {
    paramq.f(c, "error");
    paramq.f(d, "progress");
  }
  
  public final void l(t paramt)
  {
    b.I(b ^ true, "already started");
    b = true;
    h[] arrayOfh = e;
    int i = arrayOfh.length;
    for (int j = 0; j < i; j++) {
      arrayOfh[j].o(c);
    }
    paramt.d(c, d, new s0());
  }
}

/* Location:
 * Qualified Name:     gb.l0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */