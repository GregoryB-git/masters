package p6;

import X5.d;
import u6.j;

public abstract class o
{
  public static final void a(l paraml, X paramX)
  {
    paraml.d(new Y(paramX));
  }
  
  public static final m b(d paramd)
  {
    if (!(paramd instanceof j)) {
      return new m(paramd, 1);
    }
    m localm = ((j)paramd).l();
    if (localm != null)
    {
      if (!localm.J()) {
        localm = null;
      }
      if (localm != null) {
        return localm;
      }
    }
    return new m(paramd, 2);
  }
}

/* Location:
 * Qualified Name:     p6.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */