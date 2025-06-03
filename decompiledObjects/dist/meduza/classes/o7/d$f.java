package o7;

import java.util.Collection;
import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

public final class d$f
  extends d<K, V>.i
  implements NavigableSet<K>
{
  public d$f(NavigableMap<K, Collection<V>> paramNavigableMap)
  {
    super(paramNavigableMap, localSortedMap);
  }
  
  public final K ceiling(K paramK)
  {
    return (K)h().ceilingKey(paramK);
  }
  
  public final Iterator<K> descendingIterator()
  {
    return ((d.d)descendingSet()).iterator();
  }
  
  public final NavigableSet<K> descendingSet()
  {
    return new f(d, h().descendingMap());
  }
  
  public final K floor(K paramK)
  {
    return (K)h().floorKey(paramK);
  }
  
  public final NavigableMap<K, Collection<V>> h()
  {
    return (NavigableMap)a;
  }
  
  public final NavigableSet<K> headSet(K paramK, boolean paramBoolean)
  {
    return new f(d, h().headMap(paramK, paramBoolean));
  }
  
  public final SortedSet headSet(Object paramObject)
  {
    return headSet(paramObject, false);
  }
  
  public final K higher(K paramK)
  {
    return (K)h().higherKey(paramK);
  }
  
  public final K lower(K paramK)
  {
    return (K)h().lowerKey(paramK);
  }
  
  public final K pollFirst()
  {
    d.d.a locala = (d.d.a)iterator();
    Object localObject;
    if (locala.hasNext())
    {
      localObject = locala.next();
      locala.remove();
    }
    else
    {
      localObject = null;
    }
    return (K)localObject;
  }
  
  public final K pollLast()
  {
    Iterator localIterator = descendingIterator();
    Object localObject;
    if (localIterator.hasNext())
    {
      localObject = localIterator.next();
      localIterator.remove();
    }
    else
    {
      localObject = null;
    }
    return (K)localObject;
  }
  
  public final NavigableSet<K> subSet(K paramK1, boolean paramBoolean1, K paramK2, boolean paramBoolean2)
  {
    return new f(d, h().subMap(paramK1, paramBoolean1, paramK2, paramBoolean2));
  }
  
  public final SortedSet subSet(Object paramObject1, Object paramObject2)
  {
    return subSet(paramObject1, true, paramObject2, false);
  }
  
  public final NavigableSet<K> tailSet(K paramK, boolean paramBoolean)
  {
    return new f(d, h().tailMap(paramK, paramBoolean));
  }
  
  public final SortedSet tailSet(Object paramObject)
  {
    return tailSet(paramObject, true);
  }
}

/* Location:
 * Qualified Name:     o7.d.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */