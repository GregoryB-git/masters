package s0;

import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class g$a
  implements Iterator
{
  public final Object next()
  {
    f localf = (f)this;
    int i = a;
    if (i < b)
    {
      a = (i + 1);
      return Byte.valueOf(c.k(i));
    }
    throw new NoSuchElementException();
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException();
  }
}

/* Location:
 * Qualified Name:     s0.g.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */