package i9;

import j9.g;
import java.util.Iterator;
import java.util.Map.Entry;

public final class x
  implements Iterator<g>
{
  public x(Iterator paramIterator) {}
  
  public final boolean hasNext()
  {
    return a.hasNext();
  }
  
  public final Object next()
  {
    return (g)((Map.Entry)a.next()).getValue();
  }
}

/* Location:
 * Qualified Name:     i9.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */