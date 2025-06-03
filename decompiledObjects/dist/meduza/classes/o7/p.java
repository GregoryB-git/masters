package o7;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public abstract class p<K, V>
  extends q
  implements Map<K, V>
{
  public abstract Map<K, V> c();
  
  public final void clear()
  {
    c().clear();
  }
  
  public boolean containsKey(Object paramObject)
  {
    return c().containsKey(paramObject);
  }
  
  public boolean containsValue(Object paramObject)
  {
    return c().containsValue(paramObject);
  }
  
  public Set<Map.Entry<K, V>> entrySet()
  {
    return c().entrySet();
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    if ((paramObject != this) && (!c().equals(paramObject))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public V get(Object paramObject)
  {
    return (V)c().get(paramObject);
  }
  
  public int hashCode()
  {
    return c().hashCode();
  }
  
  public boolean isEmpty()
  {
    return c().isEmpty();
  }
  
  public Set<K> keySet()
  {
    return c().keySet();
  }
  
  public final V put(K paramK, V paramV)
  {
    return (V)c().put(paramK, paramV);
  }
  
  public final void putAll(Map<? extends K, ? extends V> paramMap)
  {
    c().putAll(paramMap);
  }
  
  public final V remove(Object paramObject)
  {
    return (V)c().remove(paramObject);
  }
  
  public int size()
  {
    return c().size();
  }
  
  public final Collection<V> values()
  {
    return c().values();
  }
}

/* Location:
 * Qualified Name:     o7.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */