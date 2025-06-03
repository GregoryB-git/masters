package sb;

import eb.y;
import ec.i;
import java.util.Collection;
import java.util.Iterator;

public abstract class b<E>
  implements Collection<E>
{
  public abstract int a();
  
  public final boolean add(E paramE)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final boolean addAll(Collection<? extends E> paramCollection)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final void clear()
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean contains(E paramE)
  {
    boolean bool1 = isEmpty();
    boolean bool2 = false;
    if (bool1)
    {
      bool1 = bool2;
    }
    else
    {
      Iterator localIterator = iterator();
      do
      {
        bool1 = bool2;
        if (!localIterator.hasNext()) {
          break;
        }
      } while (!i.a(localIterator.next(), paramE));
      bool1 = true;
    }
    return bool1;
  }
  
  public final boolean containsAll(Collection<? extends Object> paramCollection)
  {
    i.e(paramCollection, "elements");
    boolean bool1 = paramCollection.isEmpty();
    boolean bool2 = true;
    if (bool1)
    {
      bool1 = bool2;
    }
    else
    {
      paramCollection = paramCollection.iterator();
      do
      {
        bool1 = bool2;
        if (!paramCollection.hasNext()) {
          break;
        }
      } while (contains(paramCollection.next()));
      bool1 = false;
    }
    return bool1;
  }
  
  public final boolean isEmpty()
  {
    boolean bool;
    if (a() == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean remove(Object paramObject)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final boolean removeAll(Collection<? extends Object> paramCollection)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final boolean retainAll(Collection<? extends Object> paramCollection)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public Object[] toArray()
  {
    return y.e(this);
  }
  
  public <T> T[] toArray(T[] paramArrayOfT)
  {
    i.e(paramArrayOfT, "array");
    return y.f(this, paramArrayOfT);
  }
  
  public final String toString()
  {
    return q.p(this, ", ", "[", "]", new a(this), 24);
  }
}

/* Location:
 * Qualified Name:     sb.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */