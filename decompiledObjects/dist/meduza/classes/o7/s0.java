package o7;

import java.util.Iterator;
import java.util.Set;

public final class s0
  extends b<Object>
{
  public final Iterator<Object> c;
  
  public s0(t0 paramt0)
  {
    c = a.iterator();
  }
  
  public final Object a()
  {
    while (c.hasNext())
    {
      Object localObject = c.next();
      if (d.b.contains(localObject)) {
        return localObject;
      }
    }
    a = 3;
    return null;
  }
}

/* Location:
 * Qualified Name:     o7.s0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */