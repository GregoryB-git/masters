package d4;

import java.util.Iterator;
import java.util.Map.Entry;

public class c$d
  implements Iterator
{
  public final Iterator o;
  
  public c$d(Iterator paramIterator)
  {
    o = paramIterator;
  }
  
  public m b()
  {
    Map.Entry localEntry = (Map.Entry)o.next();
    return new m((b)localEntry.getKey(), (n)localEntry.getValue());
  }
  
  public boolean hasNext()
  {
    return o.hasNext();
  }
  
  public void remove()
  {
    o.remove();
  }
}

/* Location:
 * Qualified Name:     d4.c.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */