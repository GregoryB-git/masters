package t;

import java.util.Collection;
import java.util.Iterator;

public final class a$e
  implements Collection
{
  public a$e(a parama) {}
  
  public boolean add(Object paramObject)
  {
    throw new UnsupportedOperationException();
  }
  
  public boolean addAll(Collection paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  public void clear()
  {
    o.clear();
  }
  
  public boolean contains(Object paramObject)
  {
    boolean bool;
    if (o.h(paramObject) >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean containsAll(Collection paramCollection)
  {
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      if (!contains(paramCollection.next())) {
        return false;
      }
    }
    return true;
  }
  
  public boolean isEmpty()
  {
    return o.isEmpty();
  }
  
  public Iterator iterator()
  {
    return new a.f(o);
  }
  
  public boolean remove(Object paramObject)
  {
    int i = o.h(paramObject);
    if (i >= 0)
    {
      o.j(i);
      return true;
    }
    return false;
  }
  
  public boolean removeAll(Collection paramCollection)
  {
    int i = o.q;
    int j = 0;
    boolean bool = false;
    while (j < i)
    {
      int k = i;
      int m = j;
      if (paramCollection.contains(o.l(j)))
      {
        o.j(j);
        m = j - 1;
        k = i - 1;
        bool = true;
      }
      j = m + 1;
      i = k;
    }
    return bool;
  }
  
  public boolean retainAll(Collection paramCollection)
  {
    int i = o.q;
    int j = 0;
    boolean bool = false;
    while (j < i)
    {
      int k = i;
      int m = j;
      if (!paramCollection.contains(o.l(j)))
      {
        o.j(j);
        m = j - 1;
        k = i - 1;
        bool = true;
      }
      j = m + 1;
      i = k;
    }
    return bool;
  }
  
  public int size()
  {
    return o.q;
  }
  
  public Object[] toArray()
  {
    int i = o.q;
    Object[] arrayOfObject = new Object[i];
    for (int j = 0; j < i; j++) {
      arrayOfObject[j] = o.l(j);
    }
    return arrayOfObject;
  }
  
  public Object[] toArray(Object[] paramArrayOfObject)
  {
    return o.q(paramArrayOfObject, 1);
  }
}

/* Location:
 * Qualified Name:     t.a.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */