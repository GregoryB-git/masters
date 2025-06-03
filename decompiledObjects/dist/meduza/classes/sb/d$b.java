package sb;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class d$b
  implements Iterator<E>
{
  public int a;
  
  public final boolean hasNext()
  {
    boolean bool;
    if (a < b.a()) {
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
      d locald = b;
      int i = a;
      a = (i + 1);
      return (E)locald.get(i);
    }
    throw new NoSuchElementException();
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
}

/* Location:
 * Qualified Name:     sb.d.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */