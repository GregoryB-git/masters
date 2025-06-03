package r;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public final class g$b
  implements Set<Map.Entry<K, V>>
{
  public g$b(g paramg) {}
  
  public final boolean add(Object paramObject)
  {
    paramObject = (Map.Entry)paramObject;
    throw new UnsupportedOperationException();
  }
  
  public final boolean addAll(Collection<? extends Map.Entry<K, V>> paramCollection)
  {
    int i = a.d();
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramCollection.next();
      a.g(localEntry.getKey(), localEntry.getValue());
    }
    boolean bool;
    if (i != a.d()) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void clear()
  {
    a.a();
  }
  
  public final boolean contains(Object paramObject)
  {
    boolean bool1 = paramObject instanceof Map.Entry;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    Object localObject = (Map.Entry)paramObject;
    int i = a.e(((Map.Entry)localObject).getKey());
    if (i < 0) {
      return false;
    }
    paramObject = a.b(i, 1);
    localObject = ((Map.Entry)localObject).getValue();
    if (paramObject != localObject)
    {
      bool1 = bool2;
      if (paramObject != null)
      {
        bool1 = bool2;
        if (!paramObject.equals(localObject)) {}
      }
    }
    else
    {
      bool1 = true;
    }
    return bool1;
  }
  
  public final boolean containsAll(Collection<?> paramCollection)
  {
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      if (!contains(paramCollection.next())) {
        return false;
      }
    }
    return true;
  }
  
  public final boolean equals(Object paramObject)
  {
    return g.j(this, paramObject);
  }
  
  public final int hashCode()
  {
    int i = a.d() - 1;
    int j = 0;
    while (i >= 0)
    {
      Object localObject1 = a.b(i, 0);
      Object localObject2 = a.b(i, 1);
      int k;
      if (localObject1 == null) {
        k = 0;
      } else {
        k = localObject1.hashCode();
      }
      int m;
      if (localObject2 == null) {
        m = 0;
      } else {
        m = localObject2.hashCode();
      }
      j += (k ^ m);
      i--;
    }
    return j;
  }
  
  public final boolean isEmpty()
  {
    boolean bool;
    if (a.d() == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final Iterator<Map.Entry<K, V>> iterator()
  {
    return new g.d(a);
  }
  
  public final boolean remove(Object paramObject)
  {
    throw new UnsupportedOperationException();
  }
  
  public final boolean removeAll(Collection<?> paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  public final boolean retainAll(Collection<?> paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  public final int size()
  {
    return a.d();
  }
  
  public final Object[] toArray()
  {
    throw new UnsupportedOperationException();
  }
  
  public final <T> T[] toArray(T[] paramArrayOfT)
  {
    throw new UnsupportedOperationException();
  }
}

/* Location:
 * Qualified Name:     r.g.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */