package o7;

import java.util.Iterator;

public final class v
  extends x0<Object>
{
  public x0 a;
  public x0 b;
  
  public v(w paramw)
  {
    u localu = d;
    r localr = c;
    paramw = localr;
    if (localr == null)
    {
      paramw = localu.e();
      c = paramw;
    }
    a = paramw.n();
    b = b0.a.e;
  }
  
  public final boolean hasNext()
  {
    boolean bool;
    if ((!b.hasNext()) && (!a.hasNext())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final Object next()
  {
    if (!b.hasNext()) {
      b = ((r)a.next()).n();
    }
    return b.next();
  }
}

/* Location:
 * Qualified Name:     o7.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */