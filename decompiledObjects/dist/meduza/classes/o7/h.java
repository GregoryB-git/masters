package o7;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import n7.j;
import x6.b;

public class h<E>
  extends AbstractCollection<E>
{
  public final Collection<E> a;
  public final j<? super E> b;
  
  public h(Collection<E> paramCollection, j<? super E> paramj)
  {
    a = paramCollection;
    b = paramj;
  }
  
  public final boolean add(E paramE)
  {
    b.t(b.apply(paramE));
    return a.add(paramE);
  }
  
  public final boolean addAll(Collection<? extends E> paramCollection)
  {
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      b.t(b.apply(localObject));
    }
    return a.addAll(paramCollection);
  }
  
  public final void clear()
  {
    Object localObject1 = a;
    j localj = b;
    if (((localObject1 instanceof RandomAccess)) && ((localObject1 instanceof List)))
    {
      localObject1 = (List)localObject1;
      localj.getClass();
      int i = 0;
      int k;
      for (int j = 0; i < ((List)localObject1).size(); j = k)
      {
        Object localObject2 = ((List)localObject1).get(i);
        k = j;
        if (!localj.apply(localObject2))
        {
          if (i > j)
          {
            try
            {
              ((List)localObject1).set(j, localObject2);
            }
            catch (UnsupportedOperationException|IllegalArgumentException localUnsupportedOperationException)
            {
              k = ((List)localObject1).size();
              for (;;)
              {
                int m = k - 1;
                k = i;
                if (m <= i) {
                  break;
                }
                k = m;
                if (localj.apply(((List)localObject1).get(m)))
                {
                  ((List)localObject1).remove(m);
                  k = m;
                }
              }
            }
            for (;;)
            {
              k--;
              if (k < j) {
                break;
              }
              ((List)localObject1).remove(k);
            }
          }
          k = j + 1;
        }
        i++;
      }
      ((List)localObject1).subList(j, ((List)localObject1).size()).clear();
    }
    else
    {
      localObject1 = ((Iterable)localObject1).iterator();
      localj.getClass();
      while (((Iterator)localObject1).hasNext()) {
        if (localj.apply(((Iterator)localObject1).next())) {
          ((Iterator)localObject1).remove();
        }
      }
    }
  }
  
  public final boolean contains(Object paramObject)
  {
    Collection localCollection = a;
    localCollection.getClass();
    boolean bool;
    try
    {
      bool = localCollection.contains(paramObject);
    }
    catch (ClassCastException|NullPointerException localClassCastException)
    {
      bool = false;
    }
    if (bool) {
      return b.apply(paramObject);
    }
    return false;
  }
  
  public final boolean containsAll(Collection<?> paramCollection)
  {
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      if (!contains(paramCollection.next())) {
        return false;
      }
    }
    boolean bool = true;
    return bool;
  }
  
  public final boolean isEmpty()
  {
    Object localObject = a;
    j localj = b;
    localObject = ((Iterable)localObject).iterator();
    b.y(localj, "predicate");
    int i = 0;
    for (int j = 0; ((Iterator)localObject).hasNext(); j++) {
      if (localj.apply(((Iterator)localObject).next())) {
        break label64;
      }
    }
    j = -1;
    label64:
    if (j != -1) {
      i = 1;
    }
    return 0x1 ^ i;
  }
  
  public final Iterator<E> iterator()
  {
    Iterator localIterator = a.iterator();
    j localj = b;
    localIterator.getClass();
    localj.getClass();
    return new z(localIterator, localj);
  }
  
  public final boolean remove(Object paramObject)
  {
    boolean bool;
    if ((contains(paramObject)) && (a.remove(paramObject))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean removeAll(Collection<?> paramCollection)
  {
    Iterator localIterator = a.iterator();
    for (boolean bool = false; localIterator.hasNext(); bool = true)
    {
      label12:
      Object localObject = localIterator.next();
      if ((!b.apply(localObject)) || (!paramCollection.contains(localObject))) {
        break label12;
      }
      localIterator.remove();
    }
    return bool;
  }
  
  public final boolean retainAll(Collection<?> paramCollection)
  {
    Iterator localIterator = a.iterator();
    for (boolean bool = false; localIterator.hasNext(); bool = true)
    {
      label12:
      Object localObject = localIterator.next();
      if ((!b.apply(localObject)) || (paramCollection.contains(localObject))) {
        break label12;
      }
      localIterator.remove();
    }
    return bool;
  }
  
  public final int size()
  {
    Iterator localIterator = a.iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      if (b.apply(localObject)) {
        i++;
      }
    }
    return i;
  }
  
  public final Object[] toArray()
  {
    return c0.b(iterator()).toArray();
  }
  
  public final <T> T[] toArray(T[] paramArrayOfT)
  {
    return c0.b(iterator()).toArray(paramArrayOfT);
  }
}

/* Location:
 * Qualified Name:     o7.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */