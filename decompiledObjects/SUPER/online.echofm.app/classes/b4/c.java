package b4;

import V3.k;
import d4.b;
import d4.g;
import d4.i;
import d4.n;
import d4.r;
import java.util.Comparator;
import java.util.Iterator;

public class c
  implements d
{
  public final e a;
  public final d4.h b;
  public final int c;
  public final boolean d;
  
  public c(a4.h paramh)
  {
    a = new e(paramh);
    b = paramh.d();
    c = paramh.i();
    d = (paramh.r() ^ true);
  }
  
  public i a(i parami, n paramn)
  {
    return parami;
  }
  
  public d b()
  {
    return a.b();
  }
  
  public i c(i parami, b paramb, n paramn, k paramk, d.a parama, a parama1)
  {
    Object localObject = paramn;
    if (!a.k(new d4.m(paramb, paramn))) {
      localObject = g.W();
    }
    if (parami.k().v(paramb).equals(localObject)) {
      return parami;
    }
    if (parami.k().E() < c) {
      return a.b().c(parami, paramb, (n)localObject, paramk, parama, parama1);
    }
    return g(parami, paramb, (n)localObject, parama, parama1);
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
    if ((!parami2.k().B()) && (!parami2.k().isEmpty()))
    {
      localObject = parami2.M(r.a());
      Iterator localIterator;
      d4.m localm1;
      d4.m localm2;
      int i;
      if (d)
      {
        localIterator = parami2.P();
        localm1 = a.g();
        localm2 = a.i();
        i = -1;
      }
      else
      {
        localIterator = parami2.iterator();
        localm1 = a.i();
        localm2 = a.g();
        i = 1;
      }
      int j = 0;
      int k = 0;
      parami2 = (i)localObject;
      for (;;)
      {
        localObject = parami2;
        if (!localIterator.hasNext()) {
          break;
        }
        localObject = (d4.m)localIterator.next();
        int m = j;
        if (j == 0)
        {
          m = j;
          if (b.compare(localm1, localObject) * i <= 0) {
            m = 1;
          }
        }
        if ((m != 0) && (k < c) && (b.compare(localObject, localm2) * i <= 0))
        {
          k++;
          j = m;
        }
        else
        {
          parami2 = parami2.D(((d4.m)localObject).c(), g.W());
          j = m;
        }
      }
    }
    Object localObject = i.f(g.W(), b);
    return a.b().f(parami1, (i)localObject, parama);
  }
  
  public final i g(i parami, b paramb, n paramn, d.a parama, a parama1)
  {
    int i = parami.k().E();
    int j = c;
    int k = 1;
    if (i == j) {
      bool = true;
    } else {
      bool = false;
    }
    Y3.m.f(bool);
    d4.m localm1 = new d4.m(paramb, paramn);
    Object localObject;
    if (d) {
      localObject = parami.g();
    } else {
      localObject = parami.i();
    }
    boolean bool = a.k(localm1);
    d4.m localm2;
    if (parami.k().Q(paramb))
    {
      n localn = parami.k().v(paramb);
      for (;;)
      {
        localm2 = parama.a(b, (d4.m)localObject, d);
        if (localm2 == null) {
          break;
        }
        localObject = localm2;
        if (!localm2.c().equals(paramb))
        {
          if (!parami.k().Q(localm2.c())) {
            break;
          }
          localObject = localm2;
        }
      }
      if (localm2 != null) {
        k = b.a(localm2, localm1, d);
      }
      if ((bool) && (!paramn.isEmpty()) && (k >= 0))
      {
        if (parama1 != null) {
          parama1.b(a4.c.e(paramb, paramn, localn));
        }
        return parami.D(paramb, paramn);
      }
      if (parama1 != null) {
        parama1.b(a4.c.h(paramb, localn));
      }
      parami = parami.D(paramb, g.W());
      paramb = parami;
      if (localm2 != null)
      {
        paramb = parami;
        if (a.k(localm2))
        {
          if (parama1 != null) {
            parama1.b(a4.c.c(localm2.c(), localm2.d()));
          }
          paramn = localm2.c();
        }
      }
    }
    for (paramb = localm2.d();; paramb = g.W())
    {
      paramb = parami.D(paramn, paramb);
      return paramb;
      if (paramn.isEmpty()) {
        return parami;
      }
      if ((!bool) || (b.a((d4.m)localObject, localm1, d) < 0)) {
        break;
      }
      if (parama1 != null)
      {
        parama1.b(a4.c.h(((d4.m)localObject).c(), ((d4.m)localObject).d()));
        parama1.b(a4.c.c(paramb, paramn));
      }
      parami = parami.D(paramb, paramn);
      paramn = ((d4.m)localObject).c();
    }
    return parami;
  }
}

/* Location:
 * Qualified Name:     b4.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */