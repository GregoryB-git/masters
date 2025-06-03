package o7;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;

public class d$i
  extends d<K, V>.d
  implements SortedSet<K>
{
  public d$i(SortedMap<K, Collection<V>> paramSortedMap)
  {
    super(paramSortedMap, localMap);
  }
  
  public SortedMap<K, Collection<V>> a()
  {
    return (SortedMap)a;
  }
  
  public final Comparator<? super K> comparator()
  {
    return a().comparator();
  }
  
  public final K first()
  {
    return (K)a().firstKey();
  }
  
  public SortedSet<K> headSet(K paramK)
  {
    return new i(c, a().headMap(paramK));
  }
  
  public final K last()
  {
    return (K)a().lastKey();
  }
  
  public SortedSet<K> subSet(K paramK1, K paramK2)
  {
    return new i(c, a().subMap(paramK1, paramK2));
  }
  
  public SortedSet<K> tailSet(K paramK)
  {
    return new i(c, a().tailMap(paramK));
  }
}

/* Location:
 * Qualified Name:     o7.d.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */