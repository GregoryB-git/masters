package g9;

import j9.g;
import j9.s;
import ka.d0;
import x6.b;

public final class c0
  extends l
{
  public c0(j9.l paraml, d0 paramd0)
  {
    super(paraml, l.a.s, paramd0);
    b.Z("NotInFilter expects an ArrayValue", s.h(paramd0), new Object[0]);
  }
  
  public final boolean d(g paramg)
  {
    boolean bool1 = s.f(b.R(), s.b);
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    paramg = paramg.g(c);
    bool1 = bool2;
    if (paramg != null)
    {
      bool1 = bool2;
      if (!s.f(b.R(), paramg)) {
        bool1 = true;
      }
    }
    return bool1;
  }
}

/* Location:
 * Qualified Name:     g9.c0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */