package v5;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class f<E>
  implements Iterable<E>
{
  public final Object a = new Object();
  public final HashMap b = new HashMap();
  public Set<E> c = Collections.emptySet();
  public List<E> d = Collections.emptyList();
  
  public final int a(E paramE)
  {
    synchronized (a)
    {
      int i;
      if (b.containsKey(paramE)) {
        i = ((Integer)b.get(paramE)).intValue();
      } else {
        i = 0;
      }
      return i;
    }
  }
  
  public final Iterator<E> iterator()
  {
    synchronized (a)
    {
      Iterator localIterator = d.iterator();
      return localIterator;
    }
  }
}

/* Location:
 * Qualified Name:     v5.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */