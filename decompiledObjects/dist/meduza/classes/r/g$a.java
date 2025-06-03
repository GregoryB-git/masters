package r;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class g$a<T>
  implements Iterator<T>
{
  public final int a;
  public int b;
  public int c;
  public boolean d = false;
  
  public g$a(g paramg, int paramInt)
  {
    a = paramInt;
    b = paramg.d();
  }
  
  public final boolean hasNext()
  {
    boolean bool;
    if (c < b) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final T next()
  {
    if (hasNext())
    {
      Object localObject = e.b(c, a);
      c += 1;
      d = true;
      return (T)localObject;
    }
    throw new NoSuchElementException();
  }
  
  public final void remove()
  {
    if (d)
    {
      int i = c - 1;
      c = i;
      b -= 1;
      d = false;
      e.h(i);
      return;
    }
    throw new IllegalStateException();
  }
}

/* Location:
 * Qualified Name:     r.g.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */