package X2;

import W2.m;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public abstract class G$c
  extends a0.d
{
  public abstract Map a();
  
  public void clear()
  {
    a().clear();
  }
  
  public abstract boolean contains(Object paramObject);
  
  public boolean isEmpty()
  {
    return a().isEmpty();
  }
  
  public boolean removeAll(Collection paramCollection)
  {
    try
    {
      boolean bool = super.removeAll((Collection)m.j(paramCollection));
      return bool;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException) {}
    return a0.j(this, paramCollection.iterator());
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
      HashSet localHashSet = a0.g(paramCollection.size());
      Iterator localIterator = paramCollection.iterator();
      while (localIterator.hasNext())
      {
        paramCollection = localIterator.next();
        if ((contains(paramCollection)) && ((paramCollection instanceof Map.Entry))) {
          localHashSet.add(((Map.Entry)paramCollection).getKey());
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
 * Qualified Name:     X2.G.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */