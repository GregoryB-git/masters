package o7;

import java.util.Iterator;
import java.util.Set;

public final class q0
  extends b<Object>
{
  public final Iterator<Object> c;
  public final Iterator<Object> d;
  
  public q0(r0 paramr0)
  {
    c = a.iterator();
    d = b.iterator();
  }
  
  public final Object a()
  {
    if (c.hasNext()) {
      return c.next();
    }
    while (d.hasNext())
    {
      Object localObject = d.next();
      if (!e.a.contains(localObject)) {
        return localObject;
      }
    }
    a = 3;
    return null;
  }
}

/* Location:
 * Qualified Name:     o7.q0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */