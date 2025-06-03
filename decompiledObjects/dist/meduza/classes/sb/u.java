package sb;

import eb.y;
import ec.i;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class u
  implements Set, Serializable
{
  public static final u a = new u();
  
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
    if (((paramObject instanceof Set)) && (((Set)paramObject).isEmpty())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final int hashCode()
  {
    return 0;
  }
  
  public final boolean isEmpty()
  {
    return true;
  }
  
  public final Iterator iterator()
  {
    return r.a;
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
 * Qualified Name:     sb.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */