package sb;

import java.util.ListIterator;
import java.util.NoSuchElementException;

public final class r
  implements ListIterator
{
  public static final r a = new r();
  
  public final boolean hasNext()
  {
    return false;
  }
  
  public final boolean hasPrevious()
  {
    return false;
  }
  
  public final Object next()
  {
    throw new NoSuchElementException();
  }
  
  public final int nextIndex()
  {
    return 0;
  }
  
  public final Object previous()
  {
    throw new NoSuchElementException();
  }
  
  public final int previousIndex()
  {
    return -1;
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
}

/* Location:
 * Qualified Name:     sb.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */