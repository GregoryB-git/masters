package r;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class g$c
  implements Set<K>
{
  public g$c(g paramg) {}
  
  public final boolean add(K paramK)
  {
    throw new UnsupportedOperationException();
  }
  
  public final boolean addAll(Collection<? extends K> paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  public final void clear()
  {
    a.a();
  }
  
  public final boolean contains(Object paramObject)
  {
    boolean bool;
    if (a.e(paramObject) >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean containsAll(Collection<?> paramCollection)
  {
    Map localMap = a.c();
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      if (!localMap.containsKey(paramCollection.next())) {
        return false;
      }
    }
    boolean bool = true;
    return bool;
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
      Object localObject = a.b(i, 0);
      int k;
      if (localObject == null) {
        k = 0;
      } else {
        k = localObject.hashCode();
      }
      j += k;
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
  
  public final Iterator<K> iterator()
  {
    return new g.a(a, 0);
  }
  
  public final boolean remove(Object paramObject)
  {
    int i = a.e(paramObject);
    if (i >= 0)
    {
      a.h(i);
      return true;
    }
    return false;
  }
  
  public final boolean removeAll(Collection<?> paramCollection)
  {
    Map localMap = a.c();
    int i = localMap.size();
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      localMap.remove(paramCollection.next());
    }
    boolean bool;
    if (i != localMap.size()) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean retainAll(Collection<?> paramCollection)
  {
    return g.k(a.c(), paramCollection);
  }
  
  public final int size()
  {
    return a.d();
  }
  
  public final Object[] toArray()
  {
    g localg = a;
    int i = localg.d();
    Object[] arrayOfObject = new Object[i];
    for (int j = 0; j < i; j++) {
      arrayOfObject[j] = localg.b(j, 0);
    }
    return arrayOfObject;
  }
  
  public final <T> T[] toArray(T[] paramArrayOfT)
  {
    return a.l(0, paramArrayOfT);
  }
}

/* Location:
 * Qualified Name:     r.g.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */