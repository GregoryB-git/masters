package k9;

import j9.s;
import java.util.Iterator;
import java.util.List;
import ka.b;
import ka.b.a;
import ka.d0;
import ka.d0.a;
import ma.w;
import ma.w.a;

public final class a$b
  extends a
{
  public a$b(List<d0> paramList)
  {
    super(paramList);
  }
  
  public final d0 d(d0 paramd0)
  {
    if (s.h(paramd0)) {
      paramd0 = (b.a)paramd0.R().E();
    } else {
      paramd0 = b.M();
    }
    Object localObject = a.iterator();
    while (((Iterator)localObject).hasNext())
    {
      d0 locald0 = (d0)((Iterator)localObject).next();
      if (!s.f(paramd0, locald0))
      {
        paramd0.m();
        b.G((b)b, locald0);
      }
    }
    localObject = d0.d0();
    ((d0.a)localObject).p(paramd0);
    return (d0)((w.a)localObject).k();
  }
}

/* Location:
 * Qualified Name:     k9.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */