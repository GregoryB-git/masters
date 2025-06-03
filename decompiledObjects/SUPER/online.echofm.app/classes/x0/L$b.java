package x0;

import B0.k;
import B0.m;
import F0.x;
import d0.u;
import g0.a;
import i0.g.a;
import p0.A;
import p0.l;

public final class L$b
  implements x.a
{
  public final g.a a;
  public F.a b;
  public A c;
  public m d;
  public int e;
  
  public L$b(g.a parama, x paramx)
  {
    this(parama, new M(paramx));
  }
  
  public L$b(g.a parama, F.a parama1)
  {
    this(parama, parama1, new l(), new k(), 1048576);
  }
  
  public L$b(g.a parama, F.a parama1, A paramA, m paramm, int paramInt)
  {
    a = parama;
    b = parama1;
    c = paramA;
    d = paramm;
    e = paramInt;
  }
  
  public L b(u paramu)
  {
    a.e(b);
    return new L(paramu, a, b, c.a(paramu), d, e, null);
  }
}

/* Location:
 * Qualified Name:     x0.L.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */