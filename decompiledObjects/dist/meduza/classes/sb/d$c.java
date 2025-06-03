package sb;

import f;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public final class d$c
  extends d<E>.b
  implements ListIterator<E>
{
  public d$c(int paramInt)
  {
    super(paramInt);
    int j = paramInt.a();
    int i;
    if ((i >= 0) && (i <= j))
    {
      a = i;
      return;
    }
    throw new IndexOutOfBoundsException(f.i("index: ", i, ", size: ", j));
  }
  
  public final void add(E paramE)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final boolean hasPrevious()
  {
    boolean bool;
    if (a > 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final int nextIndex()
  {
    return a;
  }
  
  public final E previous()
  {
    if (hasPrevious())
    {
      d locald = c;
      int i = a - 1;
      a = i;
      return (E)locald.get(i);
    }
    throw new NoSuchElementException();
  }
  
  public final int previousIndex()
  {
    return a - 1;
  }
  
  public final void set(E paramE)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
}

/* Location:
 * Qualified Name:     sb.d.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */