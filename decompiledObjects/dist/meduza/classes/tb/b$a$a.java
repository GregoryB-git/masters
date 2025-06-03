package tb;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public final class b$a$a<E>
  implements ListIterator<E>
{
  public final b.a<E> a;
  public int b;
  public int c;
  public int d;
  
  public b$a$a(b.a<E> parama, int paramInt)
  {
    a = parama;
    b = paramInt;
    c = -1;
    d = b.a.i(parama);
  }
  
  public final void a()
  {
    if (b.i(a.e) == d) {
      return;
    }
    throw new ConcurrentModificationException();
  }
  
  public final void add(E paramE)
  {
    a();
    b.a locala = a;
    int i = b;
    b = (i + 1);
    locala.add(i, paramE);
    c = -1;
    d = b.a.i(a);
  }
  
  public final boolean hasNext()
  {
    boolean bool;
    if (b < a.c) {
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
    b.a locala = a;
    if (i < c)
    {
      b = (i + 1);
      c = i;
      return (E)a[(b + i)];
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
      b.a locala = a;
      return (E)a[(b + i)];
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
      d = b.a.i(a);
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
 * Qualified Name:     tb.b.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */