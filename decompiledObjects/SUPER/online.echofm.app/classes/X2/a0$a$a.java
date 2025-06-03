package X2;

import java.util.Iterator;
import java.util.Set;

public class a0$a$a
  extends b
{
  public final Iterator q;
  
  public a0$a$a(a0.a parama)
  {
    q = o.iterator();
  }
  
  public Object b()
  {
    while (q.hasNext())
    {
      Object localObject = q.next();
      if (r.p.contains(localObject)) {
        return localObject;
      }
    }
    return d();
  }
}

/* Location:
 * Qualified Name:     X2.a0.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */