package i9;

import a.a;
import g9.f0;
import j9.e;
import j9.i;
import j9.k.a;
import j9.o;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;
import k9.d;
import k9.k;
import k9.l;
import t8.c;

public final class h
{
  public final g0 a;
  public final a0 b;
  public final b c;
  public final f d;
  
  public h(g0 paramg0, a0 parama0, b paramb, f paramf)
  {
    a = paramg0;
    b = parama0;
    c = paramb;
    d = paramf;
  }
  
  public final HashMap a(Map paramMap1, Map paramMap2, Set paramSet)
  {
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    Iterator localIterator = paramMap1.values().iterator();
    while (localIterator.hasNext())
    {
      j9.m localm = (j9.m)localIterator.next();
      k localk = (k)paramMap2.get(b);
      if ((paramSet.contains(b)) && ((localk == null) || ((localk.c() instanceof l))))
      {
        localHashMap1.put(b, localm);
      }
      else if (localk != null)
      {
        localHashMap2.put(b, localk.c().d());
        localk.c().a(localm, localk.c().d(), new u7.m(new Date()));
      }
      else
      {
        localHashMap2.put(b, d.b);
      }
    }
    localHashMap2.putAll(g(localHashMap1));
    paramMap2 = new HashMap();
    paramMap1 = paramMap1.entrySet().iterator();
    while (paramMap1.hasNext())
    {
      paramSet = (Map.Entry)paramMap1.next();
      paramMap2.put((i)paramSet.getKey(), new c0((j9.g)paramSet.getValue(), (d)localHashMap2.get(paramSet.getKey())));
    }
    return paramMap2;
  }
  
  public final c<i, j9.g> b(Iterable<i> paramIterable)
  {
    return e(a.a(paramIterable), new HashSet());
  }
  
  public final c<i, j9.g> c(f0 paramf0, k.a parama, a parama1)
  {
    HashMap localHashMap = c.e(f, parama.i());
    parama1 = a.f(paramf0, parama, localHashMap.keySet(), parama1);
    parama = localHashMap.entrySet().iterator();
    Map.Entry localEntry;
    while (parama.hasNext())
    {
      localEntry = (Map.Entry)parama.next();
      if (!parama1.containsKey(localEntry.getKey())) {
        parama1.put((i)localEntry.getKey(), j9.m.m((i)localEntry.getKey()));
      }
    }
    parama = j9.h.a;
    parama1 = parama1.entrySet().iterator();
    while (parama1.hasNext())
    {
      localEntry = (Map.Entry)parama1.next();
      k localk = (k)localHashMap.get(localEntry.getKey());
      if (localk != null) {
        localk.c().a((j9.m)localEntry.getValue(), d.b, new u7.m(new Date()));
      }
      if (paramf0.g((j9.g)localEntry.getValue())) {
        parama = parama.n((i)localEntry.getKey(), (j9.g)localEntry.getValue());
      }
    }
    return parama;
  }
  
  public final c<i, j9.g> d(f0 paramf0, k.a parama, a parama1)
  {
    Object localObject1 = f;
    if (paramf0.e())
    {
      parama1 = j9.h.a;
      paramf0 = new i((o)localObject1);
      parama = c.c(paramf0);
      if ((parama != null) && (!(parama.c() instanceof l))) {
        paramf0 = j9.m.m(paramf0);
      } else {
        paramf0 = a.g(paramf0);
      }
      if (parama != null) {
        parama.c().a(paramf0, d.b, new u7.m(new Date()));
      }
      parama = parama1;
      if (paramf0.b()) {
        parama = parama1.n(b, paramf0);
      }
      return parama;
    }
    int i;
    if (g != null) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      x6.b.Z("Currently we only support collection group queries at the root.", f.o(), new Object[0]);
      String str = g;
      Object localObject2 = j9.h.a;
      Iterator localIterator1 = d.f(str).iterator();
      if (localIterator1.hasNext())
      {
        Iterator localIterator2 = c(new f0((o)((o)localIterator1.next()).g(str), null, e, a, h, i, j, k), parama, parama1).iterator();
        for (localObject1 = localObject2;; localObject1 = ((c)localObject1).n((i)((Map.Entry)localObject2).getKey(), (j9.g)((Map.Entry)localObject2).getValue()))
        {
          localObject2 = localObject1;
          if (!localIterator2.hasNext()) {
            break;
          }
          localObject2 = (Map.Entry)localIterator2.next();
        }
      }
      return (c<i, j9.g>)localObject2;
    }
    return c(paramf0, parama, parama1);
  }
  
  public final c<i, j9.g> e(Map<i, j9.m> paramMap, Set<i> paramSet)
  {
    HashMap localHashMap = new HashMap();
    f(localHashMap, paramMap.keySet());
    Object localObject = j9.h.a;
    paramSet = a(paramMap, localHashMap, paramSet).entrySet().iterator();
    for (paramMap = (Map<i, j9.m>)localObject; paramSet.hasNext(); paramMap = paramMap.n((i)((Map.Entry)localObject).getKey(), getValuea)) {
      localObject = (Map.Entry)paramSet.next();
    }
    return paramMap;
  }
  
  public final void f(Map<i, k> paramMap, Set<i> paramSet)
  {
    TreeSet localTreeSet = new TreeSet();
    Iterator localIterator = paramSet.iterator();
    while (localIterator.hasNext())
    {
      paramSet = (i)localIterator.next();
      if (!paramMap.containsKey(paramSet)) {
        localTreeSet.add(paramSet);
      }
    }
    paramMap.putAll(c.d(localTreeSet));
  }
  
  public final HashMap g(Map paramMap)
  {
    Object localObject1 = b.e(paramMap.keySet());
    HashMap localHashMap = new HashMap();
    Object localObject2 = new TreeMap();
    Object localObject3 = ((List)localObject1).iterator();
    Object localObject5;
    Object localObject6;
    Object localObject7;
    while (((Iterator)localObject3).hasNext())
    {
      localObject4 = (k9.g)((Iterator)localObject3).next();
      localObject5 = ((k9.g)localObject4).b().iterator();
      while (((Iterator)localObject5).hasNext())
      {
        localObject6 = (i)((Iterator)localObject5).next();
        localObject7 = (j9.m)paramMap.get(localObject6);
        if (localObject7 != null)
        {
          if (localHashMap.containsKey(localObject6)) {
            localObject1 = (d)localHashMap.get(localObject6);
          } else {
            localObject1 = d.b;
          }
          localHashMap.put(localObject6, ((k9.g)localObject4).a((j9.m)localObject7, (d)localObject1));
          int i = a;
          if (!((TreeMap)localObject2).containsKey(Integer.valueOf(i))) {
            ((TreeMap)localObject2).put(Integer.valueOf(i), new HashSet());
          }
          ((Set)((TreeMap)localObject2).get(Integer.valueOf(i))).add(localObject6);
        }
      }
    }
    localObject1 = new HashSet();
    Object localObject4 = ((TreeMap)localObject2).descendingMap().entrySet().iterator();
    while (((Iterator)localObject4).hasNext())
    {
      localObject5 = (Map.Entry)((Iterator)localObject4).next();
      localObject6 = new HashMap();
      localObject2 = ((Set)((Map.Entry)localObject5).getValue()).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject7 = (i)((Iterator)localObject2).next();
        if (!((HashSet)localObject1).contains(localObject7))
        {
          localObject3 = k9.f.c((j9.m)paramMap.get(localObject7), (d)localHashMap.get(localObject7));
          if (localObject3 != null) {
            ((HashMap)localObject6).put(localObject7, localObject3);
          }
          ((HashSet)localObject1).add(localObject7);
        }
      }
      c.a(((Integer)((Map.Entry)localObject5).getKey()).intValue(), (HashMap)localObject6);
    }
    return localHashMap;
  }
}

/* Location:
 * Qualified Name:     i9.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */