package n;

import java.util.Iterator;
import java.util.Map.Entry;

public class b$d
  implements Iterator, b.f
{
  public b.c o;
  public boolean p = true;
  
  public b$d(b paramb) {}
  
  public void b(b.c paramc)
  {
    b.c localc = o;
    if (paramc == localc)
    {
      paramc = r;
      o = paramc;
      boolean bool;
      if (paramc == null) {
        bool = true;
      } else {
        bool = false;
      }
      p = bool;
    }
  }
  
  public Map.Entry d()
  {
    b.c localc;
    if (p)
    {
      p = false;
      localc = q.o;
    }
    for (;;)
    {
      o = localc;
      break;
      localc = o;
      if (localc != null) {
        localc = q;
      } else {
        localc = null;
      }
    }
    return o;
  }
  
  public boolean hasNext()
  {
    boolean bool1 = p;
    boolean bool2 = false;
    boolean bool3 = false;
    if (bool1)
    {
      if (q.o != null) {
        bool3 = true;
      }
      return bool3;
    }
    b.c localc = o;
    bool3 = bool2;
    if (localc != null)
    {
      bool3 = bool2;
      if (q != null) {
        bool3 = true;
      }
    }
    return bool3;
  }
}

/* Location:
 * Qualified Name:     n.b.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */