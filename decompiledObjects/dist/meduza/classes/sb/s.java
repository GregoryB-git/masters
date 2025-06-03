package sb;

import eb.y;
import ec.i;
import f;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class s
  implements List, Serializable, RandomAccess
{
  public static final s a = new s();
  
  public final boolean addAll(int paramInt, Collection paramCollection)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final boolean addAll(Collection paramCollection)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final void clear()
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final boolean contains(Object paramObject)
  {
    if (!(paramObject instanceof Void)) {
      return false;
    }
    i.e((Void)paramObject, "element");
    return false;
  }
  
  public final boolean containsAll(Collection paramCollection)
  {
    i.e(paramCollection, "elements");
    return paramCollection.isEmpty();
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool;
    if (((paramObject instanceof List)) && (((List)paramObject).isEmpty())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final Object get(int paramInt)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Empty list doesn't contain element at index ");
    localStringBuilder.append(paramInt);
    localStringBuilder.append('.');
    throw new IndexOutOfBoundsException(localStringBuilder.toString());
  }
  
  public final int hashCode()
  {
    return 1;
  }
  
  public final int indexOf(Object paramObject)
  {
    if (!(paramObject instanceof Void)) {
      return -1;
    }
    i.e((Void)paramObject, "element");
    return -1;
  }
  
  public final boolean isEmpty()
  {
    return true;
  }
  
  public final Iterator iterator()
  {
    return r.a;
  }
  
  public final int lastIndexOf(Object paramObject)
  {
    if (!(paramObject instanceof Void)) {
      return -1;
    }
    i.e((Void)paramObject, "element");
    return -1;
  }
  
  public final ListIterator listIterator()
  {
    return r.a;
  }
  
  public final ListIterator listIterator(int paramInt)
  {
    if (paramInt == 0) {
      return r.a;
    }
    throw new IndexOutOfBoundsException(f.h("Index: ", paramInt));
  }
  
  public final boolean remove(Object paramObject)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final boolean removeAll(Collection paramCollection)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final boolean retainAll(Collection paramCollection)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final List subList(int paramInt1, int paramInt2)
  {
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      return this;
    }
    throw new IndexOutOfBoundsException(f.i("fromIndex: ", paramInt1, ", toIndex: ", paramInt2));
  }
  
  public final Object[] toArray()
  {
    return y.e(this);
  }
  
  public final <T> T[] toArray(T[] paramArrayOfT)
  {
    i.e(paramArrayOfT, "array");
    return y.f(this, paramArrayOfT);
  }
  
  public final String toString()
  {
    return "[]";
  }
}

/* Location:
 * Qualified Name:     sb.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */