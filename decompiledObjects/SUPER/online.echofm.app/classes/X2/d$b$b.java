package X2;

import W2.m;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class d$b$b
  implements Iterator
{
  public final Iterator o;
  public Collection p;
  
  public d$b$b(d.b paramb)
  {
    o = q.entrySet().iterator();
  }
  
  public Map.Entry b()
  {
    Map.Entry localEntry = (Map.Entry)o.next();
    p = ((Collection)localEntry.getValue());
    return q.e(localEntry);
  }
  
  public boolean hasNext()
  {
    return o.hasNext();
  }
  
  public void remove()
  {
    boolean bool;
    if (p != null) {
      bool = true;
    } else {
      bool = false;
    }
    m.p(bool, "no calls to next() since the last call to remove()");
    o.remove();
    d.m(q.r, p.size());
    p.clear();
    p = null;
  }
}

/* Location:
 * Qualified Name:     X2.d.b.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */