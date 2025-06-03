package o7;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import x6.b;

public abstract class a<E>
  extends x0<Object>
  implements ListIterator<Object>
{
  public final int a;
  public int b;
  
  public a(int paramInt1, int paramInt2)
  {
    b.D(paramInt2, paramInt1);
    a = paramInt1;
    b = paramInt2;
  }
  
  @Deprecated
  public final void a(Object paramObject)
  {
    throw new UnsupportedOperationException();
  }
  
  public abstract E b(int paramInt);
  
  @Deprecated
  public final void c(Object paramObject)
  {
    throw new UnsupportedOperationException();
  }
  
  public final boolean hasNext()
  {
    boolean bool;
    if (b < a) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean hasPrevious()
  {
    boolean bool;
    if (b > 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final E next()
  {
    if (hasNext())
    {
      int i = b;
      b = (i + 1);
      return (E)b(i);
    }
    throw new NoSuchElementException();
  }
  
  public final int nextIndex()
  {
    return b;
  }
  
  public final E previous()
  {
    if (hasPrevious())
    {
      int i = b - 1;
      b = i;
      return (E)b(i);
    }
    throw new NoSuchElementException();
  }
  
  public final int previousIndex()
  {
    return b - 1;
  }
}

/* Location:
 * Qualified Name:     o7.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */