package u2;

import dc.a;
import ec.i;
import ec.j;
import java.util.AbstractCollection;
import rb.h;
import v2.g;

public final class c$a
  extends j
  implements a<h>
{
  public c$a(d paramd, c.b paramb)
  {
    super(0);
  }
  
  public final Object invoke()
  {
    g localg = a.a;
    c.b localb = b;
    localg.getClass();
    i.e(localb, "listener");
    synchronized (c)
    {
      if ((d.remove(localb)) && (d.isEmpty())) {
        localg.d();
      }
      return h.a;
    }
  }
}

/* Location:
 * Qualified Name:     u2.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */