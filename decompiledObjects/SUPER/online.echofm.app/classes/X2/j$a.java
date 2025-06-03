package X2;

import W2.m;
import W2.n;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public abstract class j$a
  extends AbstractCollection
{
  public final Collection o;
  public final n p;
  
  public j$a(Collection paramCollection, n paramn)
  {
    o = paramCollection;
    p = paramn;
  }
  
  public boolean add(Object paramObject)
  {
    m.d(p.apply(paramObject));
    return o.add(paramObject);
  }
  
  public boolean addAll(Collection paramCollection)
  {
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      m.d(p.apply(localObject));
    }
    return o.addAll(paramCollection);
  }
  
  public void clear()
  {
    B.h(o, p);
  }
  
  public boolean contains(Object paramObject)
  {
    if (j.c(o, paramObject)) {
      return p.apply(paramObject);
    }
    return false;
  }
  
  public boolean containsAll(Collection paramCollection)
  {
    return j.a(this, paramCollection);
  }
  
  public boolean isEmpty()
  {
    return B.a(o, p) ^ true;
  }
  
  public Iterator iterator()
  {
    return C.i(o.iterator(), p);
  }
  
  public boolean remove(Object paramObject)
  {
    boolean bool;
    if ((contains(paramObject)) && (o.remove(paramObject))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean removeAll(Collection paramCollection)
  {
    Iterator localIterator = o.iterator();
    for (boolean bool = false; localIterator.hasNext(); bool = true)
    {
      label12:
      Object localObject = localIterator.next();
      if ((!p.apply(localObject)) || (!paramCollection.contains(localObject))) {
        break label12;
      }
      localIterator.remove();
    }
    return bool;
  }
  
  public boolean retainAll(Collection paramCollection)
  {
    Iterator localIterator = o.iterator();
    for (boolean bool = false; localIterator.hasNext(); bool = true)
    {
      label12:
      Object localObject = localIterator.next();
      if ((!p.apply(localObject)) || (paramCollection.contains(localObject))) {
        break label12;
      }
      localIterator.remove();
    }
    return bool;
  }
  
  public int size()
  {
    Iterator localIterator = o.iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      if (p.apply(localObject)) {
        i++;
      }
    }
    return i;
  }
  
  public Object[] toArray()
  {
    return E.i(iterator()).toArray();
  }
  
  public Object[] toArray(Object[] paramArrayOfObject)
  {
    return E.i(iterator()).toArray(paramArrayOfObject);
  }
}

/* Location:
 * Qualified Name:     X2.j.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */