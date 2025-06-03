package a4;

import V3.G;
import W3.d.a;
import W3.e;
import d4.g;
import d4.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class j
{
  public final i a;
  public final l b;
  public k c;
  public final List d;
  public final f e;
  
  public j(i parami, k paramk)
  {
    a = parami;
    Object localObject = new b4.b(parami.c());
    b4.d locald = parami.d().j();
    b = new l(locald);
    a locala = paramk.d();
    paramk = paramk.c();
    d4.i locali1 = d4.i.f(g.W(), parami.c());
    d4.i locali2 = ((b4.b)localObject).f(locali1, locala.a(), null);
    locali1 = locald.f(locali1, paramk.a(), null);
    localObject = new a(locali2, locala.f(), ((b4.b)localObject).d());
    c = new k(new a(locali1, paramk.f(), locald.d()), (a)localObject);
    d = new ArrayList();
    e = new f(parami);
  }
  
  public void a(V3.h paramh)
  {
    d.add(paramh);
  }
  
  public a b(W3.d paramd, G paramG, n paramn)
  {
    Object localObject = paramd.c();
    d.a locala = d.a.p;
    boolean bool1 = false;
    boolean bool2;
    if ((localObject == locala) && (paramd.b().b() != null))
    {
      if (c.b() != null) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      Y3.m.g(bool2, "We should always have a full cache before handling merges");
      if (c.a() != null) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      Y3.m.g(bool2, "Missing event cache, even though we have a server cache");
    }
    localObject = c;
    paramd = b.b((k)localObject, paramd, paramG, paramn);
    if (!a.d().f())
    {
      bool2 = bool1;
      if (((k)localObject).d().f()) {}
    }
    else
    {
      bool2 = true;
    }
    Y3.m.g(bool2, "Once a server snap is complete, it should never go back");
    paramG = a;
    c = paramG;
    return new a(c(b, paramG.c().a(), null), b);
  }
  
  public final List c(List paramList, d4.i parami, V3.h paramh)
  {
    if (paramh == null) {
      paramh = d;
    } else {
      paramh = Arrays.asList(new V3.h[] { paramh });
    }
    return e.d(paramList, parami, paramh);
  }
  
  public n d()
  {
    return c.a();
  }
  
  public n e(V3.k paramk)
  {
    n localn = c.b();
    if ((localn != null) && ((a.g()) || ((!paramk.isEmpty()) && (!localn.v(paramk.Z()).isEmpty())))) {
      return localn.A(paramk);
    }
    return null;
  }
  
  public n f()
  {
    return c.c().b();
  }
  
  public List g(V3.h paramh)
  {
    a locala = c.c();
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = locala.b().iterator();
    while (localIterator.hasNext())
    {
      d4.m localm = (d4.m)localIterator.next();
      localArrayList.add(c.c(localm.c(), localm.d()));
    }
    if (locala.f()) {
      localArrayList.add(c.n(locala.a()));
    }
    return c(localArrayList, locala.a(), paramh);
  }
  
  public i h()
  {
    return a;
  }
  
  public n i()
  {
    return c.d().b();
  }
  
  public boolean j()
  {
    return d.isEmpty();
  }
  
  public List k(V3.h paramh, Q3.c paramc)
  {
    int i = 0;
    if (paramc != null)
    {
      ArrayList localArrayList = new ArrayList();
      boolean bool;
      if (paramh == null) {
        bool = true;
      } else {
        bool = false;
      }
      Y3.m.g(bool, "A cancel should cancel all event registrations");
      V3.k localk = a.e();
      Iterator localIterator = d.iterator();
      for (;;)
      {
        localObject = localArrayList;
        if (!localIterator.hasNext()) {
          break;
        }
        localArrayList.add(new b((V3.h)localIterator.next(), paramc, localk));
      }
    }
    Object localObject = Collections.emptyList();
    if (paramh != null)
    {
      int j = -1;
      while (i < d.size())
      {
        paramc = (V3.h)d.get(i);
        if (paramc.f(paramh))
        {
          if (paramc.h()) {
            break label169;
          }
          j = i;
        }
        i++;
      }
      i = j;
      label169:
      if (i != -1)
      {
        paramh = (V3.h)d.get(i);
        d.remove(i);
        paramh.l();
      }
    }
    else
    {
      paramh = d.iterator();
      while (paramh.hasNext()) {
        ((V3.h)paramh.next()).l();
      }
      d.clear();
    }
    return (List)localObject;
  }
  
  public static class a
  {
    public final List a;
    public final List b;
    
    public a(List paramList1, List paramList2)
    {
      a = paramList1;
      b = paramList2;
    }
  }
}

/* Location:
 * Qualified Name:     a4.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */