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

public final class a$a
  extends a
{
  public a$a(List<d0> paramList)
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
      int i = 0;
      while (i < ((b)b).L()) {
        if (s.g(((b)b).K(i), locald0))
        {
          paramd0.m();
          b.I((b)b, i);
        }
        else
        {
          i++;
        }
      }
    }
    localObject = d0.d0();
    ((d0.a)localObject).p(paramd0);
    return (d0)((w.a)localObject).k();
  }
}

/* Location:
 * Qualified Name:     k9.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */