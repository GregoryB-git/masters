package t8;

import java.util.Comparator;

public abstract class j<K, V>
  implements h<K, V>
{
  public final K a;
  public final V b;
  public h<K, V> c;
  public final h<K, V> d;
  
  public j(K paramK, V paramV, h<K, V> paramh1, h<K, V> paramh2)
  {
    a = paramK;
    b = paramV;
    paramK = paramh1;
    if (paramh1 == null) {
      paramK = g.a;
    }
    c = paramK;
    paramK = paramh2;
    if (paramh2 == null) {
      paramK = g.a;
    }
    d = paramK;
  }
  
  public final h<K, V> a()
  {
    return c;
  }
  
  public final h<K, V> b(K paramK, V paramV, Comparator<K> paramComparator)
  {
    int i = paramComparator.compare(paramK, a);
    if (i < 0) {
      paramK = j(null, null, c.b(paramK, paramV, paramComparator), null);
    } else if (i == 0) {
      paramK = j(paramK, paramV, null, null);
    } else {
      paramK = j(null, null, null, d.b(paramK, paramV, paramComparator));
    }
    return paramK.l();
  }
  
  public final h<K, V> c(K paramK, Comparator<K> paramComparator)
  {
    Object localObject1;
    if (paramComparator.compare(paramK, a) < 0)
    {
      if ((!c.isEmpty()) && (!c.e()) && (!c).c.e())) {
        localObject1 = n();
      } else {
        localObject1 = this;
      }
      paramK = ((j)localObject1).j(null, null, c.c(paramK, paramComparator), null);
    }
    else
    {
      if (c.e()) {
        localObject2 = q();
      } else {
        localObject2 = this;
      }
      localObject1 = localObject2;
      if (!d.isEmpty())
      {
        localObject1 = localObject2;
        if (!d.e())
        {
          localObject1 = localObject2;
          if (!d).c.e())
          {
            localObject2 = ((j)localObject2).i();
            localObject1 = localObject2;
            if (c.a().e()) {
              localObject1 = ((j)localObject2).q().i();
            }
          }
        }
      }
      Object localObject2 = localObject1;
      if (paramComparator.compare(paramK, a) == 0)
      {
        if (d.isEmpty()) {
          return g.a;
        }
        localObject2 = d.g();
        localObject2 = ((j)localObject1).j(((h)localObject2).getKey(), ((h)localObject2).getValue(), null, ((j)d).o());
      }
      paramK = ((j)localObject2).j(null, null, null, d.c(paramK, paramComparator));
    }
    return paramK.l();
  }
  
  public final h<K, V> f()
  {
    return d;
  }
  
  public final h<K, V> g()
  {
    if (c.isEmpty()) {
      return this;
    }
    return c.g();
  }
  
  public final K getKey()
  {
    return (K)a;
  }
  
  public final V getValue()
  {
    return (V)b;
  }
  
  public final h<K, V> h()
  {
    if (d.isEmpty()) {
      return this;
    }
    return d.h();
  }
  
  public final j<K, V> i()
  {
    h.a locala1 = h.a.b;
    h.a locala2 = h.a.a;
    h localh1 = c;
    if (localh1.e()) {
      localObject = locala1;
    } else {
      localObject = locala2;
    }
    localh1 = localh1.d((h.a)localObject, null, null);
    h localh2 = d;
    if (localh2.e()) {
      localObject = locala1;
    } else {
      localObject = locala2;
    }
    Object localObject = localh2.d((h.a)localObject, null, null);
    if (e()) {
      locala2 = locala1;
    }
    return k(locala2, localh1, (h)localObject);
  }
  
  public final boolean isEmpty()
  {
    return false;
  }
  
  public abstract j<K, V> j(K paramK, V paramV, h<K, V> paramh1, h<K, V> paramh2);
  
  public final j k(h.a parama, h paramh1, h paramh2)
  {
    Object localObject1 = a;
    Object localObject2 = b;
    h localh = paramh1;
    if (paramh1 == null) {
      localh = c;
    }
    paramh1 = paramh2;
    if (paramh2 == null) {
      paramh1 = d;
    }
    if (parama == h.a.a) {
      return new i(localObject1, localObject2, localh, paramh1);
    }
    return new f(localObject1, localObject2, localh, paramh1);
  }
  
  public final j<K, V> l()
  {
    if ((d.e()) && (!c.e())) {
      localObject1 = p();
    } else {
      localObject1 = this;
    }
    Object localObject2 = localObject1;
    if (c.e())
    {
      localObject2 = localObject1;
      if (c).c.e()) {
        localObject2 = ((j)localObject1).q();
      }
    }
    Object localObject1 = localObject2;
    if (c.e())
    {
      localObject1 = localObject2;
      if (d.e()) {
        localObject1 = ((j)localObject2).i();
      }
    }
    return (j<K, V>)localObject1;
  }
  
  public abstract h.a m();
  
  public final j<K, V> n()
  {
    j localj1 = i();
    j localj2 = localj1;
    if (d.a().e()) {
      localj2 = localj1.j(null, null, null, ((j)d).q()).p().i();
    }
    return localj2;
  }
  
  public final h<K, V> o()
  {
    if (c.isEmpty()) {
      return g.a;
    }
    j localj;
    if ((!c.e()) && (!c.a().e())) {
      localj = n();
    } else {
      localj = this;
    }
    return localj.j(null, null, ((j)c).o(), null).l();
  }
  
  public final j<K, V> p()
  {
    j localj = k(h.a.a, null, d).c);
    return (j)d.d(m(), localj, null);
  }
  
  public final j<K, V> q()
  {
    j localj = k(h.a.a, c).d, null);
    return (j)c.d(m(), null, localj);
  }
  
  public void r(j paramj)
  {
    c = paramj;
  }
}

/* Location:
 * Qualified Name:     t8.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */