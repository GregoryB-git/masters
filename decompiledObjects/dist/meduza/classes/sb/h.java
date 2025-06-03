package sb;

import eb.y;
import ec.a;
import ec.i;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public final class h<T>
  implements Collection<T>
{
  public final T[] a;
  public final boolean b;
  
  public h(T[] paramArrayOfT, boolean paramBoolean)
  {
    a = paramArrayOfT;
    b = paramBoolean;
  }
  
  public final boolean add(T paramT)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final boolean addAll(Collection<? extends T> paramCollection)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final void clear()
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final boolean contains(Object paramObject)
  {
    return k.n(paramObject, a);
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
    if (a.length == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final Iterator<T> iterator()
  {
    Object[] arrayOfObject = a;
    i.e(arrayOfObject, "array");
    return new a(arrayOfObject);
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
  
  public final int size()
  {
    return a.length;
  }
  
  public final Object[] toArray()
  {
    Object[] arrayOfObject = a;
    boolean bool = b;
    i.e(arrayOfObject, "<this>");
    if ((!bool) || (!i.a(arrayOfObject.getClass(), Object[].class)))
    {
      arrayOfObject = Arrays.copyOf(arrayOfObject, arrayOfObject.length, Object[].class);
      i.d(arrayOfObject, "copyOf(...)");
    }
    return arrayOfObject;
  }
  
  public final <T> T[] toArray(T[] paramArrayOfT)
  {
    i.e(paramArrayOfT, "array");
    return y.f(this, paramArrayOfT);
  }
}

/* Location:
 * Qualified Name:     sb.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */