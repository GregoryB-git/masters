package W5;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.f;

public abstract class a
  implements Collection, h6.a
{
  public abstract int a();
  
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
      } while (!Intrinsics.a(localIterator.next(), paramObject));
      bool1 = true;
    }
    return bool1;
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
    if (size() == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
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
    return m.x(this, ", ", "[", "]", 0, null, new a(this), 24, null);
  }
  
  public static final class a
    extends kotlin.jvm.internal.l
    implements g6.l
  {
    public a(a parama)
    {
      super();
    }
    
    public final CharSequence a(Object paramObject)
    {
      if (paramObject == o) {
        paramObject = "(this Collection)";
      } else {
        paramObject = String.valueOf(paramObject);
      }
      return (CharSequence)paramObject;
    }
  }
}

/* Location:
 * Qualified Name:     W5.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */