package W5;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class c$b
  implements Iterator, h6.a
{
  public int o;
  
  public c$b(c paramc) {}
  
  public final int b()
  {
    return o;
  }
  
  public final void d(int paramInt)
  {
    o = paramInt;
  }
  
  public boolean hasNext()
  {
    boolean bool;
    if (o < p.size()) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public Object next()
  {
    if (hasNext())
    {
      c localc = p;
      int i = o;
      o = (i + 1);
      return localc.get(i);
    }
    throw new NoSuchElementException();
  }
  
  public void remove()
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
}

/* Location:
 * Qualified Name:     W5.c.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */