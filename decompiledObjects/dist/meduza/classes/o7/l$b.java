package o7;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import x6.b;

public abstract class l$b<T>
  implements Iterator<T>
{
  public int a;
  public int b;
  public int c;
  
  public l$b(l paraml)
  {
    a = e;
    int i;
    if (paraml.isEmpty()) {
      i = -1;
    } else {
      i = 0;
    }
    b = i;
    c = -1;
  }
  
  public abstract T a(int paramInt);
  
  public final boolean hasNext()
  {
    boolean bool;
    if (b >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final T next()
  {
    if (d.e == a)
    {
      if (hasNext())
      {
        int i = b;
        c = i;
        Object localObject = a(i);
        l locall = d;
        i = b + 1;
        if (i >= f) {
          i = -1;
        }
        b = i;
        return (T)localObject;
      }
      throw new NoSuchElementException();
    }
    throw new ConcurrentModificationException();
  }
  
  public final void remove()
  {
    if (d.e == a)
    {
      boolean bool;
      if (c >= 0) {
        bool = true;
      } else {
        bool = false;
      }
      b.I(bool, "no calls to next() since the last call to remove()");
      a += 32;
      l locall = d;
      locall.remove(locall.d(c));
      locall = d;
      int i = b;
      locall.getClass();
      b = (i - 1);
      c = -1;
      return;
    }
    throw new ConcurrentModificationException();
  }
}

/* Location:
 * Qualified Name:     o7.l.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */