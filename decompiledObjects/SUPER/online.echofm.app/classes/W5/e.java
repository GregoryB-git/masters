package W5;

import h6.a;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.b;
import kotlin.jvm.internal.f;

public final class e
  implements Collection, a
{
  public final Object[] o;
  public final boolean p;
  
  public e(Object[] paramArrayOfObject, boolean paramBoolean)
  {
    o = paramArrayOfObject;
    p = paramBoolean;
  }
  
  public int a()
  {
    return o.length;
  }
  
  public boolean add(Object paramObject)
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
  
  public boolean contains(Object paramObject)
  {
    return g.h(o, paramObject);
  }
  
  public boolean containsAll(Collection paramCollection)
  {
    Intrinsics.checkNotNullParameter(paramCollection, "elements");
    paramCollection = (Iterable)paramCollection;
    boolean bool1 = ((Collection)paramCollection).isEmpty();
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
  
  public boolean isEmpty()
  {
    boolean bool;
    if (o.length == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public Iterator iterator()
  {
    return b.a(o);
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
  
  public final Object[] toArray()
  {
    return n.a(o, p);
  }
  
  public Object[] toArray(Object[] paramArrayOfObject)
  {
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "array");
    return f.b(this, paramArrayOfObject);
  }
}

/* Location:
 * Qualified Name:     W5.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */