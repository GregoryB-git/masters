package W5;

import h6.a;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public final class x
  implements ListIterator, a
{
  public static final x o = new x();
  
  public Void b()
  {
    throw new NoSuchElementException();
  }
  
  public Void d()
  {
    throw new NoSuchElementException();
  }
  
  public boolean hasNext()
  {
    return false;
  }
  
  public boolean hasPrevious()
  {
    return false;
  }
  
  public int nextIndex()
  {
    return 0;
  }
  
  public int previousIndex()
  {
    return -1;
  }
  
  public void remove()
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
}

/* Location:
 * Qualified Name:     W5.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */