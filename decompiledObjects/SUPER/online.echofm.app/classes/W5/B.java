package W5;

import h6.a;
import java.util.Iterator;

public abstract class B
  implements Iterator, a
{
  public abstract int b();
  
  public void remove()
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
}

/* Location:
 * Qualified Name:     W5.B
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */