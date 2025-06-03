package o7;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import x6.b;

public class d$d
  extends e0.b<K, Collection<V>>
{
  public d$d(Map<K, Collection<V>> paramMap)
  {
    super(localMap);
  }
  
  public final void clear()
  {
    Iterator localIterator = iterator();
    for (;;)
    {
      a locala = (a)localIterator;
      if (!locala.hasNext()) {
        break;
      }
      locala.next();
      locala.remove();
    }
  }
  
  public final boolean containsAll(Collection<?> paramCollection)
  {
    return a.keySet().containsAll(paramCollection);
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool;
    if ((this != paramObject) && (!a.keySet().equals(paramObject))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final int hashCode()
  {
    return a.keySet().hashCode();
  }
  
  public final Iterator<K> iterator()
  {
    return new a(a.entrySet().iterator());
  }
  
  public final boolean remove(Object paramObject)
  {
    paramObject = (Collection)a.remove(paramObject);
    boolean bool = false;
    int i;
    if (paramObject != null)
    {
      i = ((Collection)paramObject).size();
      ((Collection)paramObject).clear();
      paramObject = b;
      e -= i;
    }
    else
    {
      i = 0;
    }
    if (i > 0) {
      bool = true;
    }
    return bool;
  }
  
  public final class a
    implements Iterator<K>
  {
    public Map.Entry<K, Collection<V>> a;
    
    public a(Iterator paramIterator) {}
    
    public final boolean hasNext()
    {
      return b.hasNext();
    }
    
    public final K next()
    {
      Map.Entry localEntry = (Map.Entry)b.next();
      a = localEntry;
      return (K)localEntry.getKey();
    }
    
    public final void remove()
    {
      boolean bool;
      if (a != null) {
        bool = true;
      } else {
        bool = false;
      }
      b.I(bool, "no calls to next() since the last call to remove()");
      Collection localCollection = (Collection)a.getValue();
      b.remove();
      d locald = b;
      int i = localCollection.size();
      e -= i;
      localCollection.clear();
      a = null;
    }
  }
}

/* Location:
 * Qualified Name:     o7.d.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */