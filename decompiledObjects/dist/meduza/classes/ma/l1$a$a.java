package ma;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class l1$a$a
  implements Iterator<Object>
{
  public final boolean hasNext()
  {
    return false;
  }
  
  public final Object next()
  {
    throw new NoSuchElementException();
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException();
  }
}

/* Location:
 * Qualified Name:     ma.l1.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */