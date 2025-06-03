package d8;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class j
{
  public static void a(ArrayList paramArrayList)
  {
    Object localObject1 = new HashMap(paramArrayList.size());
    Iterator localIterator = paramArrayList.iterator();
    boolean bool;
    int i;
    Object localObject2;
    Object localObject4;
    int j;
    Object localObject6;
    for (;;)
    {
      bool = localIterator.hasNext();
      i = 0;
      if (!bool) {
        break;
      }
      localObject2 = (b)localIterator.next();
      localObject3 = new a((b)localObject2);
      localObject4 = b.iterator();
      while (((Iterator)localObject4).hasNext())
      {
        localObject5 = (t)((Iterator)localObject4).next();
        if (e == 0) {
          j = 1;
        } else {
          j = 0;
        }
        bool = j ^ 0x1;
        localObject6 = new b((t)localObject5, bool);
        if (!((HashMap)localObject1).containsKey(localObject6)) {
          ((HashMap)localObject1).put(localObject6, new HashSet());
        }
        localObject6 = (Set)((HashMap)localObject1).get(localObject6);
        if ((!((Set)localObject6).isEmpty()) && (!bool)) {
          throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[] { localObject5 }));
        }
        ((Set)localObject6).add(localObject3);
      }
    }
    Object localObject3 = ((HashMap)localObject1).values().iterator();
    while (((Iterator)localObject3).hasNext())
    {
      label243:
      localIterator = ((Set)((Iterator)localObject3).next()).iterator();
      if (localIterator.hasNext())
      {
        localObject5 = (a)localIterator.next();
        localObject2 = a.c.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject6 = (k)((Iterator)localObject2).next();
          if (c == 0) {
            j = 1;
          } else {
            j = 0;
          }
          if (j == 0) {
            break label243;
          }
          localObject4 = a;
          if (b == 2) {
            bool = true;
          } else {
            bool = false;
          }
          localObject4 = (Set)((HashMap)localObject1).get(new b((t)localObject4, bool));
          if (localObject4 == null) {
            break label243;
          }
          localObject4 = ((Set)localObject4).iterator();
          while (((Iterator)localObject4).hasNext())
          {
            localObject6 = (a)((Iterator)localObject4).next();
            b.add(localObject6);
            c.add(localObject5);
          }
        }
      }
    }
    Object localObject5 = new HashSet();
    localObject1 = ((HashMap)localObject1).values().iterator();
    while (((Iterator)localObject1).hasNext()) {
      ((AbstractCollection)localObject5).addAll((Set)((Iterator)localObject1).next());
    }
    localObject1 = new HashSet();
    localIterator = ((HashSet)localObject5).iterator();
    for (;;)
    {
      j = i;
      if (!localIterator.hasNext()) {
        break;
      }
      localObject3 = (a)localIterator.next();
      if (c.isEmpty()) {
        ((HashSet)localObject1).add(localObject3);
      }
    }
    if (!((HashSet)localObject1).isEmpty())
    {
      localObject3 = (a)((HashSet)localObject1).iterator().next();
      ((HashSet)localObject1).remove(localObject3);
      i = j + 1;
      localIterator = b.iterator();
      for (;;)
      {
        j = i;
        if (!localIterator.hasNext()) {
          break;
        }
        localObject2 = (a)localIterator.next();
        c.remove(localObject3);
        if (c.isEmpty()) {
          ((HashSet)localObject1).add(localObject2);
        }
      }
    }
    if (j == paramArrayList.size()) {
      return;
    }
    paramArrayList = new ArrayList();
    localObject5 = ((HashSet)localObject5).iterator();
    while (((Iterator)localObject5).hasNext())
    {
      localObject1 = (a)((Iterator)localObject5).next();
      if ((!c.isEmpty()) && (!b.isEmpty())) {
        paramArrayList.add(a);
      }
    }
    throw new l(paramArrayList);
  }
  
  public static final class a
  {
    public final b<?> a;
    public final HashSet b = new HashSet();
    public final HashSet c = new HashSet();
    
    public a(b<?> paramb)
    {
      a = paramb;
    }
  }
  
  public static final class b
  {
    public final t<?> a;
    public final boolean b;
    
    public b() {}
    
    public b(t paramt, boolean paramBoolean)
    {
      a = paramt;
      b = paramBoolean;
    }
    
    public final boolean equals(Object paramObject)
    {
      boolean bool1 = paramObject instanceof b;
      boolean bool2 = false;
      boolean bool3 = bool2;
      if (bool1)
      {
        paramObject = (b)paramObject;
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
    
    public final int hashCode()
    {
      return (a.hashCode() ^ 0xF4243) * 1000003 ^ Boolean.valueOf(b).hashCode();
    }
  }
}

/* Location:
 * Qualified Name:     d8.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */