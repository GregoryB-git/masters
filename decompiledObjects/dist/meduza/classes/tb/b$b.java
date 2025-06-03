package tb;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public final class b$b<E>
  implements ListIterator<E>
{
  public final b<E> a;
  public int b;
  public int c;
  public int d;
  
  public b$b(b<E> paramb, int paramInt)
  {
    a = paramb;
    b = paramInt;
    c = -1;
    d = b.i(paramb);
  }
  
  public final void a()
  {
    if (b.i(a) == d) {
      return;
    }
    throw new ConcurrentModificationException();
  }
  
  public final void add(E paramE)
  {
    a();
    b localb = a;
    int i = b;
    b = (i + 1);
    localb.add(i, paramE);
    c = -1;
    d = b.i(a);
  }
  
  public final boolean hasNext()
  {
    boolean bool;
    if (b < a.b) {
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
    a();
    int i = b;
    b localb = a;
    if (i < b)
    {
      b = (i + 1);
      c = i;
      return (E)a[i];
    }
    throw new NoSuchElementException();
  }
  
  public final int nextIndex()
  {
    return b;
  }
  
  public final E previous()
  {
    a();
    int i = b;
    if (i > 0)
    {
      i--;
      b = i;
      c = i;
      return (E)a.a[i];
    }
    throw new NoSuchElementException();
  }
  
  public final int previousIndex()
  {
    return b - 1;
  }
  
  public final void remove()
  {
    a();
    int i = c;
    int j;
    if (i != -1) {
      j = 1;
    } else {
      j = 0;
    }
    if (j != 0)
    {
      a.h(i);
      b = c;
      c = -1;
      d = b.i(a);
      return;
    }
    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
  }
  
  public final void set(E paramE)
  {
    a();
    int i = c;
    int j;
    if (i != -1) {
      j = 1;
    } else {
      j = 0;
    }
    if (j != 0)
    {
      a.set(i, paramE);
      return;
    }
    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
  }
}

/* Location:
 * Qualified Name:     tb.b.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */