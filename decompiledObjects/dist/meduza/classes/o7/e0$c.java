package o7;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import x6.b;

public final class e0$c<K, V>
  extends AbstractCollection<V>
{
  public final Map<K, V> a;
  
  public e0$c(Map<K, V> paramMap)
  {
    paramMap.getClass();
    a = paramMap;
  }
  
  public final void clear()
  {
    a.clear();
  }
  
  public final boolean contains(Object paramObject)
  {
    return a.containsValue(paramObject);
  }
  
  public final boolean isEmpty()
  {
    return a.isEmpty();
  }
  
  public final Iterator<V> iterator()
  {
    return new d0(a.entrySet().iterator());
  }
  
  public final boolean remove(Object paramObject)
  {
    try
    {
      boolean bool = super.remove(paramObject);
      return bool;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      Iterator localIterator = a.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        if (b.Q(paramObject, localEntry.getValue()))
        {
          a.remove(localEntry.getKey());
          return true;
        }
      }
    }
    return false;
  }
  
  public final boolean removeAll(Collection<?> paramCollection)
  {
    try
    {
      paramCollection.getClass();
      boolean bool = super.removeAll(paramCollection);
      return bool;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      HashSet localHashSet = new HashSet();
      Iterator localIterator = a.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        if (paramCollection.contains(localEntry.getValue())) {
          localHashSet.add(localEntry.getKey());
        }
      }
      return a.keySet().removeAll(localHashSet);
    }
  }
  
  public final boolean retainAll(Collection<?> paramCollection)
  {
    try
    {
      paramCollection.getClass();
      boolean bool = super.retainAll(paramCollection);
      return bool;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      HashSet localHashSet = new HashSet();
      Iterator localIterator = a.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        if (paramCollection.contains(localEntry.getValue())) {
          localHashSet.add(localEntry.getKey());
        }
      }
      return a.keySet().retainAll(localHashSet);
    }
  }
  
  public final int size()
  {
    return a.size();
  }
}

/* Location:
 * Qualified Name:     o7.e0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */