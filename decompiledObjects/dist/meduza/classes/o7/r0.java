package o7;

import java.util.Iterator;
import java.util.Set;

public final class r0
  extends u0.d<Object>
{
  public r0(Set paramSet1, Set paramSet2) {}
  
  public final boolean contains(Object paramObject)
  {
    boolean bool;
    if ((!a.contains(paramObject)) && (!b.contains(paramObject))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final boolean isEmpty()
  {
    boolean bool;
    if ((a.isEmpty()) && (b.isEmpty())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final Iterator iterator()
  {
    return new q0(this);
  }
  
  public final int size()
  {
    int i = a.size();
    Iterator localIterator = b.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      if (!a.contains(localObject)) {
        i++;
      }
    }
    return i;
  }
}

/* Location:
 * Qualified Name:     o7.r0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */