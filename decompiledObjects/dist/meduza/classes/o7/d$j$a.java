package o7;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class d$j$a
  implements Iterator<V>
{
  public final Iterator<V> a;
  public final Collection<V> b;
  
  public d$j$a(d.j paramj)
  {
    paramj = b;
    b = paramj;
    if ((paramj instanceof List)) {
      paramj = ((List)paramj).listIterator();
    } else {
      paramj = paramj.iterator();
    }
    a = paramj;
  }
  
  public d$j$a(d.j paramj, ListIterator paramListIterator)
  {
    b = b;
    a = paramListIterator;
  }
  
  public final void a()
  {
    c.h();
    if (c.b == b) {
      return;
    }
    throw new ConcurrentModificationException();
  }
  
  public final boolean hasNext()
  {
    a();
    return a.hasNext();
  }
  
  public final V next()
  {
    a();
    return (V)a.next();
  }
  
  public final void remove()
  {
    a.remove();
    d.j localj = c;
    d locald = e;
    e -= 1;
    localj.i();
  }
}

/* Location:
 * Qualified Name:     o7.d.j.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */