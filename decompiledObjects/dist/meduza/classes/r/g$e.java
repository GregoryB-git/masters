package r;

import java.util.Collection;
import java.util.Iterator;

public final class g$e
  implements Collection<V>
{
  public g$e(g paramg) {}
  
  public final boolean add(V paramV)
  {
    throw new UnsupportedOperationException();
  }
  
  public final boolean addAll(Collection<? extends V> paramCollection)
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
    if (a.f(paramObject) >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
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
  
  public final Iterator<V> iterator()
  {
    return new g.a(a, 1);
  }
  
  public final boolean remove(Object paramObject)
  {
    int i = a.f(paramObject);
    if (i >= 0)
    {
      a.h(i);
      return true;
    }
    return false;
  }
  
  public final boolean removeAll(Collection<?> paramCollection)
  {
    int i = a.d();
    int j = 0;
    boolean bool = false;
    while (j < i)
    {
      int k = i;
      int m = j;
      if (paramCollection.contains(a.b(j, 1)))
      {
        a.h(j);
        m = j - 1;
        k = i - 1;
        bool = true;
      }
      j = m + 1;
      i = k;
    }
    return bool;
  }
  
  public final boolean retainAll(Collection<?> paramCollection)
  {
    int i = a.d();
    int j = 0;
    boolean bool = false;
    while (j < i)
    {
      int k = i;
      int m = j;
      if (!paramCollection.contains(a.b(j, 1)))
      {
        a.h(j);
        m = j - 1;
        k = i - 1;
        bool = true;
      }
      j = m + 1;
      i = k;
    }
    return bool;
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
      arrayOfObject[j] = localg.b(j, 1);
    }
    return arrayOfObject;
  }
  
  public final <T> T[] toArray(T[] paramArrayOfT)
  {
    return a.l(1, paramArrayOfT);
  }
}

/* Location:
 * Qualified Name:     r.g.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */