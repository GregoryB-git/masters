package W5;

import h6.a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.f;

public final class y
  implements List, Serializable, RandomAccess, a
{
  public static final y o = new y();
  private static final long serialVersionUID = -7390468764508069838L;
  
  private final Object readResolve()
  {
    return o;
  }
  
  public boolean a(Void paramVoid)
  {
    Intrinsics.checkNotNullParameter(paramVoid, "element");
    return false;
  }
  
  public boolean addAll(int paramInt, Collection paramCollection)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean addAll(Collection paramCollection)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public void clear()
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean containsAll(Collection paramCollection)
  {
    Intrinsics.checkNotNullParameter(paramCollection, "elements");
    return paramCollection.isEmpty();
  }
  
  public Void d(int paramInt)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Empty list doesn't contain element at index ");
    localStringBuilder.append(paramInt);
    localStringBuilder.append('.');
    throw new IndexOutOfBoundsException(localStringBuilder.toString());
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    if (((paramObject instanceof List)) && (((List)paramObject).isEmpty())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int f()
  {
    return 0;
  }
  
  public int g(Void paramVoid)
  {
    Intrinsics.checkNotNullParameter(paramVoid, "element");
    return -1;
  }
  
  public int hashCode()
  {
    return 1;
  }
  
  public int i(Void paramVoid)
  {
    Intrinsics.checkNotNullParameter(paramVoid, "element");
    return -1;
  }
  
  public boolean isEmpty()
  {
    return true;
  }
  
  public Iterator iterator()
  {
    return x.o;
  }
  
  public ListIterator listIterator()
  {
    return x.o;
  }
  
  public ListIterator listIterator(int paramInt)
  {
    if (paramInt == 0) {
      return x.o;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Index: ");
    localStringBuilder.append(paramInt);
    throw new IndexOutOfBoundsException(localStringBuilder.toString());
  }
  
  public boolean remove(Object paramObject)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean removeAll(Collection paramCollection)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean retainAll(Collection paramCollection)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public List subList(int paramInt1, int paramInt2)
  {
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      return this;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("fromIndex: ");
    localStringBuilder.append(paramInt1);
    localStringBuilder.append(", toIndex: ");
    localStringBuilder.append(paramInt2);
    throw new IndexOutOfBoundsException(localStringBuilder.toString());
  }
  
  public Object[] toArray()
  {
    return f.a(this);
  }
  
  public Object[] toArray(Object[] paramArrayOfObject)
  {
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "array");
    return f.b(this, paramArrayOfObject);
  }
  
  public String toString()
  {
    return "[]";
  }
}

/* Location:
 * Qualified Name:     W5.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */