package t;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class a$c
  implements Set
{
  public a$c(a parama) {}
  
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
    return o.containsKey(paramObject);
  }
  
  public boolean containsAll(Collection paramCollection)
  {
    return o.m(paramCollection);
  }
  
  public boolean equals(Object paramObject)
  {
    return a.n(this, paramObject);
  }
  
  public int hashCode()
  {
    int i = o.q - 1;
    int j = 0;
    while (i >= 0)
    {
      Object localObject = o.i(i);
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
  
  public boolean isEmpty()
  {
    return o.isEmpty();
  }
  
  public Iterator iterator()
  {
    return new a.b(o);
  }
  
  public boolean remove(Object paramObject)
  {
    int i = o.f(paramObject);
    if (i >= 0)
    {
      o.j(i);
      return true;
    }
    return false;
  }
  
  public boolean removeAll(Collection paramCollection)
  {
    return o.o(paramCollection);
  }
  
  public boolean retainAll(Collection paramCollection)
  {
    return o.p(paramCollection);
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
      arrayOfObject[j] = o.i(j);
    }
    return arrayOfObject;
  }
  
  public Object[] toArray(Object[] paramArrayOfObject)
  {
    return o.q(paramArrayOfObject, 0);
  }
}

/* Location:
 * Qualified Name:     t.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */