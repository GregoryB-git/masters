package o7;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import x6.b;

public final class d$b$b
  implements Iterator<Map.Entry<K, Collection<V>>>
{
  public final Iterator<Map.Entry<K, Collection<V>>> a;
  public Collection<V> b;
  
  public d$b$b(d.b paramb)
  {
    a = c.entrySet().iterator();
  }
  
  public final boolean hasNext()
  {
    return a.hasNext();
  }
  
  public final Object next()
  {
    Map.Entry localEntry = (Map.Entry)a.next();
    b = ((Collection)localEntry.getValue());
    return c.b(localEntry);
  }
  
  public final void remove()
  {
    boolean bool;
    if (b != null) {
      bool = true;
    } else {
      bool = false;
    }
    b.I(bool, "no calls to next() since the last call to remove()");
    a.remove();
    d locald = c.d;
    int i = b.size();
    e -= i;
    b.clear();
    b = null;
  }
}

/* Location:
 * Qualified Name:     o7.d.b.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */