package S3;

import java.util.Iterator;
import java.util.Map.Entry;

public class e$a
  implements Iterator
{
  public final Iterator o;
  
  public e$a(Iterator paramIterator)
  {
    o = paramIterator;
  }
  
  public boolean hasNext()
  {
    return o.hasNext();
  }
  
  public Object next()
  {
    return ((Map.Entry)o.next()).getKey();
  }
  
  public void remove()
  {
    o.remove();
  }
}

/* Location:
 * Qualified Name:     S3.e.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */