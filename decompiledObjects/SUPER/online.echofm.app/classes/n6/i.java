package n6;

import g6.l;
import h6.a;
import java.util.Iterator;

public final class i
  implements b
{
  public final b a;
  public final l b;
  
  public i(b paramb, l paraml)
  {
    a = paramb;
    b = paraml;
  }
  
  public Iterator iterator()
  {
    return new a(this);
  }
  
  public static final class a
    implements Iterator, a
  {
    public final Iterator o;
    
    public a(i parami)
    {
      o = i.a(parami).iterator();
    }
    
    public boolean hasNext()
    {
      return o.hasNext();
    }
    
    public Object next()
    {
      return i.b(p).invoke(o.next());
    }
    
    public void remove()
    {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
  }
}

/* Location:
 * Qualified Name:     n6.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */