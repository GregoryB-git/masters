package o7;

import java.util.Iterator;
import n7.j;

public final class z
  extends b<Object>
{
  public z(Iterator paramIterator, j paramj) {}
  
  public final Object a()
  {
    while (c.hasNext())
    {
      Object localObject = c.next();
      if (d.apply(localObject)) {
        return localObject;
      }
    }
    a = 3;
    return null;
  }
}

/* Location:
 * Qualified Name:     o7.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */