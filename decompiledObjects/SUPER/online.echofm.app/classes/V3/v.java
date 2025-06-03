package V3;

import W3.d;
import a4.a;
import a4.e.a;
import a4.j;
import a4.j.a;
import d4.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class v
{
  public final Map a = new HashMap();
  public final X3.e b;
  
  public v(X3.e parame)
  {
    b = parame;
  }
  
  public List a(h paramh, G paramG, a parama)
  {
    a4.i locali = paramh.e();
    paramG = g(locali, paramG, parama);
    if (!locali.g())
    {
      parama = new HashSet();
      Iterator localIterator = paramG.f().iterator();
      while (localIterator.hasNext()) {
        parama.add(((d4.m)localIterator.next()).c());
      }
      b.o(locali, parama);
    }
    if (!a.containsKey(locali.d())) {
      a.put(locali.d(), paramG);
    }
    a.put(locali.d(), paramG);
    paramG.a(paramh);
    return paramG.g(paramh);
  }
  
  public List b(d paramd, G paramG, n paramn)
  {
    Object localObject = paramd.b().b();
    if (localObject != null)
    {
      localObject = (j)a.get(localObject);
      boolean bool;
      if (localObject != null) {
        bool = true;
      } else {
        bool = false;
      }
      Y3.m.f(bool);
      return c((j)localObject, paramd, paramG, paramn);
    }
    ArrayList localArrayList = new ArrayList();
    localObject = a.entrySet().iterator();
    while (((Iterator)localObject).hasNext()) {
      localArrayList.addAll(c((j)((Map.Entry)((Iterator)localObject).next()).getValue(), paramd, paramG, paramn));
    }
    return localArrayList;
  }
  
  public final List c(j paramj, d paramd, G paramG, n paramn)
  {
    paramd = paramj.b(paramd, paramG, paramn);
    if (!paramj.h().g())
    {
      paramG = new HashSet();
      HashSet localHashSet = new HashSet();
      Iterator localIterator = b.iterator();
      while (localIterator.hasNext())
      {
        paramn = (a4.c)localIterator.next();
        e.a locala = paramn.j();
        if (locala == e.a.p) {
          localHashSet.add(paramn.i());
        } else if (locala == e.a.o) {
          paramG.add(paramn.i());
        }
      }
      if ((!localHashSet.isEmpty()) || (!paramG.isEmpty())) {
        b.l(paramj.h(), localHashSet, paramG);
      }
    }
    return a;
  }
  
  public n d(k paramk)
  {
    Iterator localIterator = a.values().iterator();
    while (localIterator.hasNext())
    {
      n localn = ((j)localIterator.next()).e(paramk);
      if (localn != null) {
        return localn;
      }
    }
    return null;
  }
  
  public j e()
  {
    Iterator localIterator = a.entrySet().iterator();
    while (localIterator.hasNext())
    {
      j localj = (j)((Map.Entry)localIterator.next()).getValue();
      if (localj.h().g()) {
        return localj;
      }
    }
    return null;
  }
  
  public List f()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = a.entrySet().iterator();
    while (localIterator.hasNext())
    {
      j localj = (j)((Map.Entry)localIterator.next()).getValue();
      if (!localj.h().g()) {
        localArrayList.add(localj);
      }
    }
    return localArrayList;
  }
  
  public j g(a4.i parami, G paramG, a parama)
  {
    Object localObject = (j)a.get(parami.d());
    if (localObject == null)
    {
      if (parama.f()) {
        localObject = parama.b();
      } else {
        localObject = null;
      }
      localObject = paramG.b((n)localObject);
      boolean bool;
      if (localObject != null)
      {
        bool = true;
        paramG = (G)localObject;
      }
      else
      {
        if (parama.b() != null) {
          localObject = parama.b();
        } else {
          localObject = d4.g.W();
        }
        paramG = paramG.e((n)localObject);
        bool = false;
      }
      return new j(parami, new a4.k(new a(d4.i.f(paramG, parami.c()), bool, false), parama));
    }
    return (j)localObject;
  }
  
  public boolean h()
  {
    boolean bool;
    if (e() != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean i()
  {
    return a.isEmpty();
  }
  
  public Y3.g j(a4.i parami, h paramh, Q3.c paramc)
  {
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    boolean bool = h();
    if (parami.f())
    {
      localObject = a.entrySet().iterator();
      while (((Iterator)localObject).hasNext())
      {
        j localj = (j)((Map.Entry)((Iterator)localObject).next()).getValue();
        localArrayList2.addAll(localj.k(paramh, paramc));
        if (localj.j())
        {
          ((Iterator)localObject).remove();
          if (!localj.h().g()) {
            localArrayList1.add(localj.h());
          }
        }
      }
    }
    Object localObject = (j)a.get(parami.d());
    if (localObject != null)
    {
      localArrayList2.addAll(((j)localObject).k(paramh, paramc));
      if (((j)localObject).j())
      {
        a.remove(parami.d());
        if (!((j)localObject).h().g()) {
          localArrayList1.add(((j)localObject).h());
        }
      }
    }
    if ((bool) && (!h())) {
      localArrayList1.add(a4.i.a(parami.e()));
    }
    return new Y3.g(localArrayList1, localArrayList2);
  }
  
  public boolean k(a4.i parami)
  {
    boolean bool;
    if (l(parami) != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public j l(a4.i parami)
  {
    if (parami.g()) {
      return e();
    }
    return (j)a.get(parami.d());
  }
}

/* Location:
 * Qualified Name:     V3.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */