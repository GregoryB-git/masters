package B3;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class q
{
  public static void a(List paramList)
  {
    Object localObject = c(paramList);
    Set localSet = b((Set)localObject);
    int i = 0;
    b localb2;
    if (!localSet.isEmpty())
    {
      b localb1 = (b)localSet.iterator().next();
      localSet.remove(localb1);
      int j = i + 1;
      Iterator localIterator = localb1.d().iterator();
      for (;;)
      {
        i = j;
        if (!localIterator.hasNext()) {
          break;
        }
        localb2 = (b)localIterator.next();
        localb2.g(localb1);
        if (localb2.f()) {
          localSet.add(localb2);
        }
      }
    }
    if (i == paramList.size()) {
      return;
    }
    paramList = new ArrayList();
    localObject = ((Set)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      localb2 = (b)((Iterator)localObject).next();
      if ((!localb2.f()) && (!localb2.e())) {
        paramList.add(localb2.c());
      }
    }
    throw new s(paramList);
  }
  
  public static Set b(Set paramSet)
  {
    HashSet localHashSet = new HashSet();
    Iterator localIterator = paramSet.iterator();
    while (localIterator.hasNext())
    {
      paramSet = (b)localIterator.next();
      if (paramSet.f()) {
        localHashSet.add(paramSet);
      }
    }
    return localHashSet;
  }
  
  public static Set c(List paramList)
  {
    Object localObject1 = new HashMap(paramList.size());
    Iterator localIterator = paramList.iterator();
    Object localObject3;
    Object localObject4;
    Object localObject5;
    Object localObject6;
    while (localIterator.hasNext())
    {
      localObject2 = (c)localIterator.next();
      localObject3 = new b((c)localObject2);
      paramList = ((c)localObject2).j().iterator();
      while (paramList.hasNext())
      {
        localObject4 = (F)paramList.next();
        localObject5 = new c((F)localObject4, ((c)localObject2).p() ^ true, null);
        if (!((Map)localObject1).containsKey(localObject5)) {
          ((Map)localObject1).put(localObject5, new HashSet());
        }
        localObject6 = (Set)((Map)localObject1).get(localObject5);
        if ((!((Set)localObject6).isEmpty()) && (!c.a((c)localObject5))) {
          throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[] { localObject4 }));
        }
        ((Set)localObject6).add(localObject3);
      }
    }
    Object localObject2 = ((Map)localObject1).values().iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject6 = ((Set)((Iterator)localObject2).next()).iterator();
      label230:
      if (((Iterator)localObject6).hasNext())
      {
        paramList = (b)((Iterator)localObject6).next();
        localObject3 = paramList.c().g().iterator();
        while (((Iterator)localObject3).hasNext())
        {
          localObject5 = (r)((Iterator)localObject3).next();
          if (!((r)localObject5).e()) {
            break label230;
          }
          localObject5 = (Set)((Map)localObject1).get(new c(((r)localObject5).c(), ((r)localObject5).g(), null));
          if (localObject5 == null) {
            break label230;
          }
          localObject5 = ((Set)localObject5).iterator();
          while (((Iterator)localObject5).hasNext())
          {
            localObject4 = (b)((Iterator)localObject5).next();
            paramList.a((b)localObject4);
            ((b)localObject4).b(paramList);
          }
        }
      }
    }
    paramList = new HashSet();
    localObject1 = ((Map)localObject1).values().iterator();
    while (((Iterator)localObject1).hasNext()) {
      paramList.addAll((Set)((Iterator)localObject1).next());
    }
    return paramList;
  }
  
  public static class b
  {
    public final c a;
    public final Set b = new HashSet();
    public final Set c = new HashSet();
    
    public b(c paramc)
    {
      a = paramc;
    }
    
    public void a(b paramb)
    {
      b.add(paramb);
    }
    
    public void b(b paramb)
    {
      c.add(paramb);
    }
    
    public c c()
    {
      return a;
    }
    
    public Set d()
    {
      return b;
    }
    
    public boolean e()
    {
      return b.isEmpty();
    }
    
    public boolean f()
    {
      return c.isEmpty();
    }
    
    public void g(b paramb)
    {
      c.remove(paramb);
    }
  }
  
  public static class c
  {
    public final F a;
    public final boolean b;
    
    public c(F paramF, boolean paramBoolean)
    {
      a = paramF;
      b = paramBoolean;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool1 = paramObject instanceof c;
      boolean bool2 = false;
      boolean bool3 = bool2;
      if (bool1)
      {
        paramObject = (c)paramObject;
        bool3 = bool2;
        if (a.equals(a))
        {
          bool3 = bool2;
          if (b == b) {
            bool3 = true;
          }
        }
      }
      return bool3;
    }
    
    public int hashCode()
    {
      return (a.hashCode() ^ 0xF4243) * 1000003 ^ Boolean.valueOf(b).hashCode();
    }
  }
}

/* Location:
 * Qualified Name:     B3.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */