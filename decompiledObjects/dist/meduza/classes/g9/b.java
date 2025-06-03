package g9;

import j9.g;
import j9.s;
import java.util.Iterator;
import java.util.List;
import ka.d0;

public final class b
  extends l
{
  public b(j9.l paraml, d0 paramd0)
  {
    super(paraml, l.a.q, paramd0);
    x6.b.Z("ArrayContainsAnyFilter expects an ArrayValue", s.h(paramd0), new Object[0]);
  }
  
  public final boolean d(g paramg)
  {
    paramg = paramg.g(c);
    if (!s.h(paramg)) {
      return false;
    }
    Iterator localIterator = paramg.R().h().iterator();
    while (localIterator.hasNext())
    {
      paramg = (d0)localIterator.next();
      if (s.f(b.R(), paramg)) {
        return true;
      }
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     g9.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */