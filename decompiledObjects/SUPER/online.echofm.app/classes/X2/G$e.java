package X2;

import W2.k;
import W2.m;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class G$e
  extends AbstractCollection
{
  public final Map o;
  
  public G$e(Map paramMap)
  {
    o = ((Map)m.j(paramMap));
  }
  
  public final Map a()
  {
    return o;
  }
  
  public void clear()
  {
    a().clear();
  }
  
  public boolean contains(Object paramObject)
  {
    return a().containsValue(paramObject);
  }
  
  public boolean isEmpty()
  {
    return a().isEmpty();
  }
  
  public Iterator iterator()
  {
    return G.m(a().entrySet().iterator());
  }
  
  public boolean remove(Object paramObject)
  {
    try
    {
      boolean bool = super.remove(paramObject);
      return bool;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      Iterator localIterator = a().entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        if (k.a(paramObject, localEntry.getValue()))
        {
          a().remove(localEntry.getKey());
          return true;
        }
      }
    }
    return false;
  }
  
  public boolean removeAll(Collection paramCollection)
  {
    try
    {
      boolean bool = super.removeAll((Collection)m.j(paramCollection));
      return bool;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      HashSet localHashSet = a0.f();
      Iterator localIterator = a().entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        if (paramCollection.contains(localEntry.getValue())) {
          localHashSet.add(localEntry.getKey());
        }
      }
      return a().keySet().removeAll(localHashSet);
    }
  }
  
  public boolean retainAll(Collection paramCollection)
  {
    try
    {
      boolean bool = super.retainAll((Collection)m.j(paramCollection));
      return bool;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      HashSet localHashSet = a0.f();
      Iterator localIterator = a().entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        if (paramCollection.contains(localEntry.getValue())) {
          localHashSet.add(localEntry.getKey());
        }
      }
      return a().keySet().retainAll(localHashSet);
    }
  }
  
  public int size()
  {
    return a().size();
  }
}

/* Location:
 * Qualified Name:     X2.G.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */