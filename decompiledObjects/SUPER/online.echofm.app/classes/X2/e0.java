package X2;

import W2.m;
import java.util.Iterator;

public abstract class e0
  implements Iterator
{
  public final Iterator o;
  
  public e0(Iterator paramIterator)
  {
    o = ((Iterator)m.j(paramIterator));
  }
  
  public abstract Object b(Object paramObject);
  
  public final boolean hasNext()
  {
    return o.hasNext();
  }
  
  public final Object next()
  {
    return b(o.next());
  }
  
  public final void remove()
  {
    o.remove();
  }
}

/* Location:
 * Qualified Name:     X2.e0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */