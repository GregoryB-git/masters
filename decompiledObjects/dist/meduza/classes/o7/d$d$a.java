package o7;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import x6.b;

public final class d$d$a
  implements Iterator<K>
{
  public Map.Entry<K, Collection<V>> a;
  
  public d$d$a(d.d paramd, Iterator paramIterator) {}
  
  public final boolean hasNext()
  {
    return b.hasNext();
  }
  
  public final K next()
  {
    Map.Entry localEntry = (Map.Entry)b.next();
    a = localEntry;
    return (K)localEntry.getKey();
  }
  
  public final void remove()
  {
    boolean bool;
    if (a != null) {
      bool = true;
    } else {
      bool = false;
    }
    b.I(bool, "no calls to next() since the last call to remove()");
    Collection localCollection = (Collection)a.getValue();
    b.remove();
    d locald = c.b;
    int i = localCollection.size();
    e -= i;
    localCollection.clear();
    a = null;
  }
}

/* Location:
 * Qualified Name:     o7.d.d.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */