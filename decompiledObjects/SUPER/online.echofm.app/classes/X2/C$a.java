package X2;

import W2.n;
import java.util.Iterator;

public class C$a
  extends b
{
  public C$a(Iterator paramIterator, n paramn) {}
  
  public Object b()
  {
    while (q.hasNext())
    {
      Object localObject = q.next();
      if (r.apply(localObject)) {
        return localObject;
      }
    }
    return d();
  }
}

/* Location:
 * Qualified Name:     X2.C.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */