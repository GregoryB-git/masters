package o7;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public final class t0
  extends u0.d<Object>
{
  public t0(x paramx1, x paramx2) {}
  
  public final boolean contains(Object paramObject)
  {
    boolean bool;
    if ((a.contains(paramObject)) && (b.contains(paramObject))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean containsAll(Collection<?> paramCollection)
  {
    boolean bool;
    if ((a.containsAll(paramCollection)) && (b.containsAll(paramCollection))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean isEmpty()
  {
    return Collections.disjoint(b, a);
  }
  
  public final Iterator iterator()
  {
    return new s0(this);
  }
  
  public final int size()
  {
    Iterator localIterator = a.iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      if (b.contains(localObject)) {
        i++;
      }
    }
    return i;
  }
}

/* Location:
 * Qualified Name:     o7.t0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */