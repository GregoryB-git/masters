package X2;

import java.util.Iterator;

public class x$a
  extends g0
{
  public Iterator o;
  public Iterator p;
  
  public x$a(x paramx)
  {
    o = r.k().q();
    p = C.f();
  }
  
  public boolean hasNext()
  {
    boolean bool;
    if ((!p.hasNext()) && (!o.hasNext())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public Object next()
  {
    if (!p.hasNext()) {
      p = ((t)o.next()).q();
    }
    return p.next();
  }
}

/* Location:
 * Qualified Name:     X2.x.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */