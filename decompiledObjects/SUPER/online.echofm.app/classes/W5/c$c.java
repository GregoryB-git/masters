package W5;

import java.util.ListIterator;
import java.util.NoSuchElementException;

public class c$c
  extends c.b
  implements ListIterator, h6.a
{
  public c$c(c paramc, int paramInt)
  {
    super(paramc);
    c.o.b(paramInt, paramc.size());
    d(paramInt);
  }
  
  public void add(Object paramObject)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean hasPrevious()
  {
    boolean bool;
    if (b() > 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int nextIndex()
  {
    return b();
  }
  
  public Object previous()
  {
    if (hasPrevious())
    {
      c localc = q;
      d(b() - 1);
      return localc.get(b());
    }
    throw new NoSuchElementException();
  }
  
  public int previousIndex()
  {
    return b() - 1;
  }
  
  public void set(Object paramObject)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
}

/* Location:
 * Qualified Name:     W5.c.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */