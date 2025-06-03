package g9;

import j9.g;
import j9.i;
import j9.s;
import ka.d0;
import x6.b;

public final class w
  extends l
{
  public final i d;
  
  public w(j9.l paraml, l.a parama, d0 paramd0)
  {
    super(paraml, parama, paramd0);
    b.Z("KeyFieldFilter expects a ReferenceValue", s.k(paramd0), new Object[0]);
    d = i.h(b.Z());
  }
  
  public final boolean d(g paramg)
  {
    return g(paramg.getKey().f(d));
  }
}

/* Location:
 * Qualified Name:     g9.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */