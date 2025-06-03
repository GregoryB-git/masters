package o7;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;

public class d$h
  extends d<K, V>.b
  implements SortedMap<K, Collection<V>>
{
  public SortedSet<K> e;
  
  public d$h(SortedMap<K, Collection<V>> paramSortedMap)
  {
    super(paramSortedMap, localMap);
  }
  
  public SortedSet<K> c()
  {
    return new d.i(f, e());
  }
  
  public final Comparator<? super K> comparator()
  {
    return e().comparator();
  }
  
  public SortedSet<K> d()
  {
    SortedSet localSortedSet1 = e;
    SortedSet localSortedSet2 = localSortedSet1;
    if (localSortedSet1 == null)
    {
      localSortedSet2 = c();
      e = localSortedSet2;
    }
    return localSortedSet2;
  }
  
  public SortedMap<K, Collection<V>> e()
  {
    return (SortedMap)c;
  }
  
  public final K firstKey()
  {
    return (K)e().firstKey();
  }
  
  public SortedMap<K, Collection<V>> headMap(K paramK)
  {
    return new h(f, e().headMap(paramK));
  }
  
  public final K lastKey()
  {
    return (K)e().lastKey();
  }
  
  public SortedMap<K, Collection<V>> subMap(K paramK1, K paramK2)
  {
    return new h(f, e().subMap(paramK1, paramK2));
  }
  
  public SortedMap<K, Collection<V>> tailMap(K paramK)
  {
    return new h(f, e().tailMap(paramK));
  }
}

/* Location:
 * Qualified Name:     o7.d.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */