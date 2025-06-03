package g0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class h
  implements Iterable
{
  public final Object o = new Object();
  public final Map p = new HashMap();
  public Set q = Collections.emptySet();
  public List r = Collections.emptyList();
  
  public void a(Object paramObject)
  {
    Object localObject2;
    synchronized (o)
    {
      localObject2 = new java/util/ArrayList;
      ((ArrayList)localObject2).<init>(r);
      ((List)localObject2).add(paramObject);
      r = Collections.unmodifiableList((List)localObject2);
      localObject2 = (Integer)p.get(paramObject);
      if (localObject2 == null)
      {
        localObject3 = new java/util/HashSet;
        ((HashSet)localObject3).<init>(q);
        ((Set)localObject3).add(paramObject);
        q = Collections.unmodifiableSet((Set)localObject3);
      }
    }
    Object localObject3 = p;
    int i = 1;
    if (localObject2 != null) {
      i = 1 + ((Integer)localObject2).intValue();
    }
    ((Map)localObject3).put(paramObject, Integer.valueOf(i));
    return;
    throw ((Throwable)paramObject);
  }
  
  public int d(Object paramObject)
  {
    synchronized (o)
    {
      if (p.containsKey(paramObject)) {
        i = ((Integer)p.get(paramObject)).intValue();
      }
    }
    int i = 0;
    return i;
    throw ((Throwable)paramObject);
  }
  
  public void f(Object paramObject)
  {
    Object localObject2;
    ArrayList localArrayList;
    synchronized (o)
    {
      localObject2 = (Integer)p.get(paramObject);
      if (localObject2 == null) {
        return;
      }
    }
  }
  
  public Iterator iterator()
  {
    synchronized (o)
    {
      Iterator localIterator = r.iterator();
      return localIterator;
    }
  }
  
  public Set u()
  {
    synchronized (o)
    {
      Set localSet = q;
      return localSet;
    }
  }
}

/* Location:
 * Qualified Name:     g0.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */