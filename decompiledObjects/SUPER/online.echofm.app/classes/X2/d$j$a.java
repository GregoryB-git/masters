package X2;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class d$j$a
  implements Iterator
{
  public final Iterator o;
  public final Collection p;
  
  public d$j$a(d.j paramj)
  {
    paramj = p;
    p = paramj;
    o = d.i(paramj);
  }
  
  public d$j$a(d.j paramj, Iterator paramIterator)
  {
    p = p;
    o = paramIterator;
  }
  
  public Iterator b()
  {
    d();
    return o;
  }
  
  public void d()
  {
    q.i();
    if (q.p == p) {
      return;
    }
    throw new ConcurrentModificationException();
  }
  
  public boolean hasNext()
  {
    d();
    return o.hasNext();
  }
  
  public Object next()
  {
    d();
    return o.next();
  }
  
  public void remove()
  {
    o.remove();
    d.k(q.s);
    q.k();
  }
}

/* Location:
 * Qualified Name:     X2.d.j.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */