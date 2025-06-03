package W5;

import h6.a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.f;

public final class A
  implements Set, Serializable, a
{
  public static final A o = new A();
  private static final long serialVersionUID = 3406603774387020532L;
  
  private final Object readResolve()
  {
    return o;
  }
  
  public boolean a(Void paramVoid)
  {
    Intrinsics.checkNotNullParameter(paramVoid, "element");
    return false;
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
  
  public int d()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    if (((paramObject instanceof Set)) && (((Set)paramObject).isEmpty())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    return 0;
  }
  
  public boolean isEmpty()
  {
    return true;
  }
  
  public Iterator iterator()
  {
    return x.o;
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
 * Qualified Name:     W5.A
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */