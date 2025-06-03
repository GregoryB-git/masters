package b4;

import V3.k;
import a4.c;
import d4.h;
import d4.i;
import d4.n;
import java.util.Iterator;

public class b
  implements d
{
  public final h a;
  
  public b(h paramh)
  {
    a = paramh;
  }
  
  public i a(i parami, n paramn)
  {
    if (parami.k().isEmpty()) {
      return parami;
    }
    return parami.M(paramn);
  }
  
  public d b()
  {
    return this;
  }
  
  public i c(i parami, d4.b paramb, n paramn, k paramk, d.a parama, a parama1)
  {
    Y3.m.g(parami.s(a), "The index must match the filter");
    parama = parami.k();
    n localn = parama.v(paramb);
    if ((localn.A(paramk).equals(paramn.A(paramk))) && (localn.isEmpty() == paramn.isEmpty())) {
      return parami;
    }
    if (parama1 != null)
    {
      if (paramn.isEmpty()) {
        if (parama.Q(paramb)) {
          paramk = c.h(paramb, localn);
        }
      }
      for (;;)
      {
        parama1.b(paramk);
        break;
        Y3.m.g(parama.B(), "A child remove without an old child only makes sense on a leaf node");
        break;
        if (localn.isEmpty()) {
          paramk = c.c(paramb, paramn);
        } else {
          paramk = c.e(paramb, paramn, localn);
        }
      }
    }
    if ((parama.B()) && (paramn.isEmpty())) {
      return parami;
    }
    return parami.D(paramb, paramn);
  }
  
  public boolean d()
  {
    return false;
  }
  
  public h e()
  {
    return a;
  }
  
  public i f(i parami1, i parami2, a parama)
  {
    Y3.m.g(parami2.s(a), "Can't use IndexedNode that doesn't have filter's index");
    if (parama != null)
    {
      Object localObject1 = parami1.k().iterator();
      Object localObject2;
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (d4.m)((Iterator)localObject1).next();
        if (!parami2.k().Q(((d4.m)localObject2).c())) {
          parama.b(c.h(((d4.m)localObject2).c(), ((d4.m)localObject2).d()));
        }
      }
      if (!parami2.k().B())
      {
        localObject2 = parami2.k().iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject1 = (d4.m)((Iterator)localObject2).next();
          n localn;
          if (parami1.k().Q(((d4.m)localObject1).c()))
          {
            localn = parami1.k().v(((d4.m)localObject1).c());
            if (localn.equals(((d4.m)localObject1).d())) {
              break;
            }
          }
          else
          {
            for (localObject1 = c.e(((d4.m)localObject1).c(), ((d4.m)localObject1).d(), localn);; localObject1 = c.c(((d4.m)localObject1).c(), ((d4.m)localObject1).d()))
            {
              parama.b((c)localObject1);
              break;
            }
          }
        }
      }
    }
    return parami2;
  }
}

/* Location:
 * Qualified Name:     b4.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */