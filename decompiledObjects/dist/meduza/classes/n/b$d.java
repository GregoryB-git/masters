package n;

import java.util.Iterator;
import java.util.Map.Entry;

public final class b$d
  extends b.f<K, V>
  implements Iterator<Map.Entry<K, V>>
{
  public b.c<K, V> a;
  public boolean b = true;
  
  public b$d(b paramb) {}
  
  public final void a(b.c<K, V> paramc)
  {
    b.c localc = a;
    if (paramc == localc)
    {
      paramc = d;
      a = paramc;
      boolean bool;
      if (paramc == null) {
        bool = true;
      } else {
        bool = false;
      }
      b = bool;
    }
  }
  
  public final boolean hasNext()
  {
    boolean bool1 = b;
    boolean bool2 = true;
    boolean bool3 = true;
    if (bool1)
    {
      if (c.a == null) {
        bool3 = false;
      }
      return bool3;
    }
    b.c localc = a;
    if ((localc != null) && (c != null)) {
      bool3 = bool2;
    } else {
      bool3 = false;
    }
    return bool3;
  }
  
  public final Object next()
  {
    b.c localc;
    if (b)
    {
      b = false;
      localc = c.a;
    }
    else
    {
      localc = a;
      if (localc != null) {
        localc = c;
      } else {
        localc = null;
      }
    }
    a = localc;
    return localc;
  }
}

/* Location:
 * Qualified Name:     n.b.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */