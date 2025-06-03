package d4;

import S3.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class i
  implements Iterable
{
  public static final e r = new e(Collections.emptyList(), null);
  public final n o;
  public e p;
  public final h q;
  
  public i(n paramn, h paramh)
  {
    q = paramh;
    o = paramn;
    p = null;
  }
  
  public i(n paramn, h paramh, e parame)
  {
    q = paramh;
    o = paramn;
    p = parame;
  }
  
  public static i d(n paramn)
  {
    return new i(paramn, q.j());
  }
  
  public static i f(n paramn, h paramh)
  {
    return new i(paramn, paramh);
  }
  
  public i D(b paramb, n paramn)
  {
    n localn = o.N(paramb, paramn);
    e locale = p;
    Object localObject = r;
    if ((A2.m.a(locale, localObject)) && (!q.e(paramn))) {
      return new i(localn, q, (e)localObject);
    }
    locale = p;
    if ((locale != null) && (!A2.m.a(locale, localObject)))
    {
      localObject = o.v(paramb);
      locale = p.i(new m(paramb, (n)localObject));
      localObject = locale;
      if (!paramn.isEmpty()) {
        localObject = locale.g(new m(paramb, paramn));
      }
      return new i(localn, q, (e)localObject);
    }
    return new i(localn, q, null);
  }
  
  public i M(n paramn)
  {
    return new i(o.J(paramn), q, p);
  }
  
  public Iterator P()
  {
    a();
    if (A2.m.a(p, r)) {
      return o.P();
    }
    return p.P();
  }
  
  public final void a()
  {
    if (p == null)
    {
      if (q.equals(j.j())) {}
      ArrayList localArrayList;
      int i;
      do
      {
        p = r;
        break;
        localArrayList = new ArrayList();
        Iterator localIterator = o.iterator();
        i = 0;
        while (localIterator.hasNext())
        {
          m localm = (m)localIterator.next();
          if ((i == 0) && (!q.e(localm.d()))) {
            i = 0;
          } else {
            i = 1;
          }
          localArrayList.add(new m(localm.c(), localm.d()));
        }
      } while (i == 0);
      p = new e(localArrayList, q);
    }
  }
  
  public m g()
  {
    if (!(o instanceof c)) {
      return null;
    }
    a();
    if (A2.m.a(p, r))
    {
      b localb = ((c)o).T();
      return new m(localb, o.v(localb));
    }
    return (m)p.d();
  }
  
  public m i()
  {
    if (!(o instanceof c)) {
      return null;
    }
    a();
    if (A2.m.a(p, r))
    {
      b localb = ((c)o).U();
      return new m(localb, o.v(localb));
    }
    return (m)p.a();
  }
  
  public Iterator iterator()
  {
    a();
    if (A2.m.a(p, r)) {
      return o.iterator();
    }
    return p.iterator();
  }
  
  public n k()
  {
    return o;
  }
  
  public b q(b paramb, n paramn, h paramh)
  {
    if ((!q.equals(j.j())) && (!q.equals(paramh))) {
      throw new IllegalArgumentException("Index not available in IndexedNode!");
    }
    a();
    if (A2.m.a(p, r)) {
      return o.I(paramb);
    }
    paramb = (m)p.f(new m(paramb, paramn));
    if (paramb != null) {
      paramb = paramb.c();
    } else {
      paramb = null;
    }
    return paramb;
  }
  
  public boolean s(h paramh)
  {
    boolean bool;
    if (q == paramh) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     d4.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */