package k9;

import j9.s;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ka.b;
import ka.b.a;
import ka.d0;
import ka.d0.a;
import ma.w;
import ma.w.a;
import u7.m;

public abstract class a
  implements p
{
  public final List<d0> a;
  
  public a(List<d0> paramList)
  {
    a = Collections.unmodifiableList(paramList);
  }
  
  public final d0 a(d0 paramd01, d0 paramd02)
  {
    return d(paramd01);
  }
  
  public final d0 b(m paramm, d0 paramd0)
  {
    return d(paramd0);
  }
  
  public final d0 c(d0 paramd0)
  {
    return null;
  }
  
  public abstract d0 d(d0 paramd0);
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (a)paramObject;
      return a.equals(a);
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = getClass().hashCode();
    return a.hashCode() + i * 31;
  }
  
  public static final class a
    extends a
  {
    public a(List<d0> paramList)
    {
      super();
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
  
  public static final class b
    extends a
  {
    public b(List<d0> paramList)
    {
      super();
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
}

/* Location:
 * Qualified Name:     k9.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */