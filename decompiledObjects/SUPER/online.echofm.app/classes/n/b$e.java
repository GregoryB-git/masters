package n;

import java.util.Iterator;
import java.util.Map.Entry;

public abstract class b$e
  implements Iterator, b.f
{
  public b.c o;
  public b.c p;
  
  public b$e(b.c paramc1, b.c paramc2)
  {
    o = paramc2;
    p = paramc1;
  }
  
  public void b(b.c paramc)
  {
    if ((o == paramc) && (paramc == p))
    {
      p = null;
      o = null;
    }
    b.c localc = o;
    if (localc == paramc) {
      o = d(localc);
    }
    if (p == paramc) {
      p = g();
    }
  }
  
  public abstract b.c d(b.c paramc);
  
  public abstract b.c e(b.c paramc);
  
  public Map.Entry f()
  {
    b.c localc = p;
    p = g();
    return localc;
  }
  
  public final b.c g()
  {
    b.c localc1 = p;
    b.c localc2 = o;
    if ((localc1 != localc2) && (localc2 != null)) {
      return e(localc1);
    }
    return null;
  }
  
  public boolean hasNext()
  {
    boolean bool;
    if (p != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     n.b.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */