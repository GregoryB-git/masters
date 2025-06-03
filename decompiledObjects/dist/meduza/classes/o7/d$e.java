package o7;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import n7.q;

public final class d$e
  extends d<K, V>.h
  implements NavigableMap<K, Collection<V>>
{
  public d$e(NavigableMap<K, Collection<V>> paramNavigableMap)
  {
    super(paramNavigableMap, localSortedMap);
  }
  
  public final SortedSet c()
  {
    return new d.f(o, g());
  }
  
  public final Map.Entry<K, Collection<V>> ceilingEntry(K paramK)
  {
    paramK = g().ceilingEntry(paramK);
    if (paramK == null) {
      paramK = null;
    } else {
      paramK = b(paramK);
    }
    return paramK;
  }
  
  public final K ceilingKey(K paramK)
  {
    return (K)g().ceilingKey(paramK);
  }
  
  public final SortedSet d()
  {
    return (NavigableSet)super.d();
  }
  
  public final NavigableSet<K> descendingKeySet()
  {
    return ((e)descendingMap()).navigableKeySet();
  }
  
  public final NavigableMap<K, Collection<V>> descendingMap()
  {
    return new e(o, g().descendingMap());
  }
  
  public final s f(Iterator paramIterator)
  {
    if (!paramIterator.hasNext()) {
      return null;
    }
    Map.Entry localEntry = (Map.Entry)paramIterator.next();
    List localList = (List)o).f.get();
    localList.addAll((Collection)localEntry.getValue());
    paramIterator.remove();
    paramIterator = localEntry.getKey();
    ((c)o).getClass();
    return new s(paramIterator, Collections.unmodifiableList(localList));
  }
  
  public final Map.Entry<K, Collection<V>> firstEntry()
  {
    Object localObject = g().firstEntry();
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = b((Map.Entry)localObject);
    }
    return (Map.Entry<K, Collection<V>>)localObject;
  }
  
  public final Map.Entry<K, Collection<V>> floorEntry(K paramK)
  {
    paramK = g().floorEntry(paramK);
    if (paramK == null) {
      paramK = null;
    } else {
      paramK = b(paramK);
    }
    return paramK;
  }
  
  public final K floorKey(K paramK)
  {
    return (K)g().floorKey(paramK);
  }
  
  public final NavigableMap<K, Collection<V>> g()
  {
    return (NavigableMap)c;
  }
  
  public final NavigableMap<K, Collection<V>> headMap(K paramK, boolean paramBoolean)
  {
    return new e(o, g().headMap(paramK, paramBoolean));
  }
  
  public final SortedMap headMap(Object paramObject)
  {
    return headMap(paramObject, false);
  }
  
  public final Map.Entry<K, Collection<V>> higherEntry(K paramK)
  {
    paramK = g().higherEntry(paramK);
    if (paramK == null) {
      paramK = null;
    } else {
      paramK = b(paramK);
    }
    return paramK;
  }
  
  public final K higherKey(K paramK)
  {
    return (K)g().higherKey(paramK);
  }
  
  public final Set keySet()
  {
    return (NavigableSet)super.d();
  }
  
  public final Map.Entry<K, Collection<V>> lastEntry()
  {
    Object localObject = g().lastEntry();
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = b((Map.Entry)localObject);
    }
    return (Map.Entry<K, Collection<V>>)localObject;
  }
  
  public final Map.Entry<K, Collection<V>> lowerEntry(K paramK)
  {
    paramK = g().lowerEntry(paramK);
    if (paramK == null) {
      paramK = null;
    } else {
      paramK = b(paramK);
    }
    return paramK;
  }
  
  public final K lowerKey(K paramK)
  {
    return (K)g().lowerKey(paramK);
  }
  
  public final NavigableSet<K> navigableKeySet()
  {
    return (NavigableSet)super.d();
  }
  
  public final Map.Entry<K, Collection<V>> pollFirstEntry()
  {
    return f(((d.b.a)entrySet()).iterator());
  }
  
  public final Map.Entry<K, Collection<V>> pollLastEntry()
  {
    return f(((d.b.a)((e0.d)descendingMap()).entrySet()).iterator());
  }
  
  public final NavigableMap<K, Collection<V>> subMap(K paramK1, boolean paramBoolean1, K paramK2, boolean paramBoolean2)
  {
    return new e(o, g().subMap(paramK1, paramBoolean1, paramK2, paramBoolean2));
  }
  
  public final SortedMap subMap(Object paramObject1, Object paramObject2)
  {
    return subMap(paramObject1, true, paramObject2, false);
  }
  
  public final NavigableMap<K, Collection<V>> tailMap(K paramK, boolean paramBoolean)
  {
    return new e(o, g().tailMap(paramK, paramBoolean));
  }
  
  public final SortedMap tailMap(Object paramObject)
  {
    return tailMap(paramObject, true);
  }
}

/* Location:
 * Qualified Name:     o7.d.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */