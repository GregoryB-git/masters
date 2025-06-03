package g9;

import j9.g;
import j9.s;
import ka.d0;
import x6.b;

public final class v
  extends l
{
  public v(j9.l paraml, d0 paramd0)
  {
    super(paraml, l.a.r, paramd0);
    b.Z("InFilter expects an ArrayValue", s.h(paramd0), new Object[0]);
  }
  
  public final boolean d(g paramg)
  {
    paramg = paramg.g(c);
    boolean bool;
    if ((paramg != null) && (s.f(b.R(), paramg))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     g9.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */