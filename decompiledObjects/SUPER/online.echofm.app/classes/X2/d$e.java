package X2;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

public final class d$e
  extends d.h
  implements NavigableMap
{
  public d$e(d paramd, NavigableMap paramNavigableMap)
  {
    super(paramd, paramNavigableMap);
  }
  
  public Map.Entry ceilingEntry(Object paramObject)
  {
    paramObject = m().ceilingEntry(paramObject);
    if (paramObject == null) {
      paramObject = null;
    } else {
      paramObject = e((Map.Entry)paramObject);
    }
    return (Map.Entry)paramObject;
  }
  
  public Object ceilingKey(Object paramObject)
  {
    return m().ceilingKey(paramObject);
  }
  
  public NavigableSet descendingKeySet()
  {
    return descendingMap().navigableKeySet();
  }
  
  public NavigableMap descendingMap()
  {
    return new e(u, m().descendingMap());
  }
  
  public Map.Entry firstEntry()
  {
    Map.Entry localEntry = m().firstEntry();
    if (localEntry == null) {
      localEntry = null;
    } else {
      localEntry = e(localEntry);
    }
    return localEntry;
  }
  
  public Map.Entry floorEntry(Object paramObject)
  {
    paramObject = m().floorEntry(paramObject);
    if (paramObject == null) {
      paramObject = null;
    } else {
      paramObject = e((Map.Entry)paramObject);
    }
    return (Map.Entry)paramObject;
  }
  
  public Object floorKey(Object paramObject)
  {
    return m().floorKey(paramObject);
  }
  
  public NavigableMap headMap(Object paramObject, boolean paramBoolean)
  {
    return new e(u, m().headMap(paramObject, paramBoolean));
  }
  
  public Map.Entry higherEntry(Object paramObject)
  {
    paramObject = m().higherEntry(paramObject);
    if (paramObject == null) {
      paramObject = null;
    } else {
      paramObject = e((Map.Entry)paramObject);
    }
    return (Map.Entry)paramObject;
  }
  
  public Object higherKey(Object paramObject)
  {
    return m().higherKey(paramObject);
  }
  
  public NavigableSet i()
  {
    return new d.f(u, m());
  }
  
  public NavigableMap j(Object paramObject)
  {
    return headMap(paramObject, false);
  }
  
  public NavigableSet k()
  {
    return (NavigableSet)super.g();
  }
  
  public Map.Entry l(Iterator paramIterator)
  {
    if (!paramIterator.hasNext()) {
      return null;
    }
    Map.Entry localEntry = (Map.Entry)paramIterator.next();
    Collection localCollection = u.p();
    localCollection.addAll((Collection)localEntry.getValue());
    paramIterator.remove();
    return G.d(localEntry.getKey(), u.w(localCollection));
  }
  
  public Map.Entry lastEntry()
  {
    Map.Entry localEntry = m().lastEntry();
    if (localEntry == null) {
      localEntry = null;
    } else {
      localEntry = e(localEntry);
    }
    return localEntry;
  }
  
  public Map.Entry lowerEntry(Object paramObject)
  {
    paramObject = m().lowerEntry(paramObject);
    if (paramObject == null) {
      paramObject = null;
    } else {
      paramObject = e((Map.Entry)paramObject);
    }
    return (Map.Entry)paramObject;
  }
  
  public Object lowerKey(Object paramObject)
  {
    return m().lowerKey(paramObject);
  }
  
  public NavigableMap m()
  {
    return (NavigableMap)super.h();
  }
  
  public NavigableMap n(Object paramObject1, Object paramObject2)
  {
    return subMap(paramObject1, true, paramObject2, false);
  }
  
  public NavigableSet navigableKeySet()
  {
    return k();
  }
  
  public NavigableMap o(Object paramObject)
  {
    return tailMap(paramObject, true);
  }
  
  public Map.Entry pollFirstEntry()
  {
    return l(entrySet().iterator());
  }
  
  public Map.Entry pollLastEntry()
  {
    return l(descendingMap().entrySet().iterator());
  }
  
  public NavigableMap subMap(Object paramObject1, boolean paramBoolean1, Object paramObject2, boolean paramBoolean2)
  {
    return new e(u, m().subMap(paramObject1, paramBoolean1, paramObject2, paramBoolean2));
  }
  
  public NavigableMap tailMap(Object paramObject, boolean paramBoolean)
  {
    return new e(u, m().tailMap(paramObject, paramBoolean));
  }
}

/* Location:
 * Qualified Name:     X2.d.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */