package X2;

import W2.m;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;

public class d$d$a
  implements Iterator
{
  public Map.Entry o;
  
  public d$d$a(d.d paramd, Iterator paramIterator) {}
  
  public boolean hasNext()
  {
    return p.hasNext();
  }
  
  public Object next()
  {
    Map.Entry localEntry = (Map.Entry)p.next();
    o = localEntry;
    return localEntry.getKey();
  }
  
  public void remove()
  {
    boolean bool;
    if (o != null) {
      bool = true;
    } else {
      bool = false;
    }
    m.p(bool, "no calls to next() since the last call to remove()");
    Collection localCollection = (Collection)o.getValue();
    p.remove();
    d.m(q.p, localCollection.size());
    localCollection.clear();
    o = null;
  }
}

/* Location:
 * Qualified Name:     X2.d.d.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */