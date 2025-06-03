package o7;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import p2.m0;

public abstract class e0$a<K, V>
  extends u0.c<Map.Entry<K, V>>
{
  public final void clear()
  {
    a.clear();
  }
  
  public abstract boolean contains(Object paramObject);
  
  public final boolean isEmpty()
  {
    return a.isEmpty();
  }
  
  public final boolean removeAll(Collection<?> paramCollection)
  {
    boolean bool;
    try
    {
      paramCollection.getClass();
      bool = super.removeAll(paramCollection);
      return bool;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      paramCollection = paramCollection.iterator();
      bool = false;
      while (paramCollection.hasNext())
      {
        Object localObject = paramCollection.next();
        bool |= ((d.b.a)this).remove(localObject);
      }
    }
    return bool;
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
      int i = paramCollection.size();
      if (i < 3)
      {
        m0.o(i, "expectedSize");
        i++;
      }
      else if (i < 1073741824)
      {
        i = (int)Math.ceil(i / 0.75D);
      }
      else
      {
        i = Integer.MAX_VALUE;
      }
      HashSet localHashSet = new HashSet(i);
      paramCollection = paramCollection.iterator();
      while (paramCollection.hasNext())
      {
        Object localObject = paramCollection.next();
        if ((contains(localObject)) && ((localObject instanceof Map.Entry))) {
          localHashSet.add(((Map.Entry)localObject).getKey());
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
 * Qualified Name:     o7.e0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */