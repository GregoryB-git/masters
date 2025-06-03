package sb;

import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class c<T>
  implements Iterator<T>
{
  public int a;
  public T b;
  
  public final boolean a()
  {
    a = 3;
    a0.a locala = (a0.a)this;
    int i = c;
    boolean bool = true;
    if (i == 0)
    {
      a = 2;
    }
    else
    {
      a0 locala0 = e;
      Object[] arrayOfObject = a;
      int j = d;
      b = arrayOfObject[j];
      a = 1;
      d = ((j + 1) % b);
      c = (i - 1);
    }
    if (a != 1) {
      bool = false;
    }
    return bool;
  }
  
  public final boolean hasNext()
  {
    int i = a;
    boolean bool = true;
    if (i != 0)
    {
      if (i != 1) {
        if (i == 2) {
          bool = false;
        } else {
          throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
        }
      }
    }
    else {
      bool = a();
    }
    return bool;
  }
  
  public final T next()
  {
    int i = a;
    if (i == 1) {}
    while ((i != 2) && (a()))
    {
      a = 0;
      return (T)b;
    }
    throw new NoSuchElementException();
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
}

/* Location:
 * Qualified Name:     sb.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */