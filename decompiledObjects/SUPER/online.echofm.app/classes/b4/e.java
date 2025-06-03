package b4;

import V3.k;
import d4.g;
import d4.i;
import d4.m;
import d4.n;
import d4.r;
import java.util.Comparator;
import java.util.Iterator;

public class e
  implements d
{
  public final b a;
  public final d4.h b;
  public final m c;
  public final m d;
  
  public e(a4.h paramh)
  {
    a = new b(paramh.d());
    b = paramh.d();
    c = j(paramh);
    d = h(paramh);
  }
  
  public static m h(a4.h paramh)
  {
    if (paramh.m())
    {
      d4.b localb = paramh.e();
      return paramh.d().f(localb, paramh.f());
    }
    return paramh.d().g();
  }
  
  public static m j(a4.h paramh)
  {
    if (paramh.o())
    {
      d4.b localb = paramh.g();
      return paramh.d().f(localb, paramh.h());
    }
    return paramh.d().h();
  }
  
  public i a(i parami, n paramn)
  {
    return parami;
  }
  
  public d b()
  {
    return a;
  }
  
  public i c(i parami, d4.b paramb, n paramn, k paramk, d.a parama, a parama1)
  {
    Object localObject = paramn;
    if (!k(new m(paramb, paramn))) {
      localObject = g.W();
    }
    return a.c(parami, paramb, (n)localObject, paramk, parama, parama1);
  }
  
  public boolean d()
  {
    return true;
  }
  
  public d4.h e()
  {
    return b;
  }
  
  public i f(i parami1, i parami2, a parama)
  {
    if (parami2.k().B())
    {
      parami2 = i.f(g.W(), b);
    }
    else
    {
      Object localObject = parami2.M(r.a());
      Iterator localIterator = parami2.iterator();
      parami2 = (i)localObject;
      while (localIterator.hasNext())
      {
        localObject = (m)localIterator.next();
        if (!k((m)localObject)) {
          parami2 = parami2.D(((m)localObject).c(), g.W());
        }
      }
    }
    return a.f(parami1, parami2, parama);
  }
  
  public m g()
  {
    return d;
  }
  
  public m i()
  {
    return c;
  }
  
  public boolean k(m paramm)
  {
    return (b.compare(i(), paramm) <= 0) && (b.compare(paramm, g()) <= 0);
  }
}

/* Location:
 * Qualified Name:     b4.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */