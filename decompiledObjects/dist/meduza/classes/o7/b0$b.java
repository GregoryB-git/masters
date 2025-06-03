package o7;

import java.util.Iterator;
import java.util.NoSuchElementException;
import x6.b;

public enum b0$b
  implements Iterator<Object>
{
  static
  {
    b localb = new b();
    a = localb;
    b = new b[] { localb };
  }
  
  public b0$b() {}
  
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
    b.I(false, "no calls to next() since the last call to remove()");
  }
}

/* Location:
 * Qualified Name:     o7.b0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */