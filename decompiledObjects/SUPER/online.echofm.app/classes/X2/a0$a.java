package X2;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public class a0$a
  extends a0.e
{
  public a0$a(Set paramSet1, Set paramSet2)
  {
    super(null);
  }
  
  public g0 a()
  {
    return new a();
  }
  
  public boolean contains(Object paramObject)
  {
    boolean bool;
    if ((o.contains(paramObject)) && (p.contains(paramObject))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean containsAll(Collection paramCollection)
  {
    boolean bool;
    if ((o.containsAll(paramCollection)) && (p.containsAll(paramCollection))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isEmpty()
  {
    return Collections.disjoint(p, o);
  }
  
  public int size()
  {
    Iterator localIterator = o.iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      if (p.contains(localObject)) {
        i++;
      }
    }
    return i;
  }
  
  public class a
    extends b
  {
    public final Iterator q = o.iterator();
    
    public a() {}
    
    public Object b()
    {
      while (q.hasNext())
      {
        Object localObject = q.next();
        if (p.contains(localObject)) {
          return localObject;
        }
      }
      return d();
    }
  }
}

/* Location:
 * Qualified Name:     X2.a0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */