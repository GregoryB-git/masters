package W5;

import h6.a;
import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class b
  implements Iterator, a
{
  public int o;
  public Object p;
  
  public abstract void b();
  
  public final void d()
  {
    o = 2;
  }
  
  public final void e(Object paramObject)
  {
    p = paramObject;
    o = 1;
  }
  
  public final boolean f()
  {
    o = 3;
    b();
    int i = o;
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    return bool;
  }
  
  public boolean hasNext()
  {
    int i = o;
    boolean bool;
    if (i != 0)
    {
      bool = true;
      if (i != 1) {
        if (i == 2) {
          bool = false;
        } else {
          throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
        }
      }
    }
    else
    {
      bool = f();
    }
    return bool;
  }
  
  public Object next()
  {
    int i = o;
    if (i == 1) {}
    while ((i != 2) && (f()))
    {
      o = 0;
      return p;
    }
    throw new NoSuchElementException();
  }
  
  public void remove()
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
}

/* Location:
 * Qualified Name:     W5.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */