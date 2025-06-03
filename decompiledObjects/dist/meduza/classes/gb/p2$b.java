package gb;

import eb.k0.k;
import eb.n;
import eb.o;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class p2$b
  implements k0.k
{
  public o a = o.a(n.d);
  public p2.g b;
  
  public p2$b(p2 paramp2) {}
  
  public final void a(o paramo)
  {
    p2.o.log(Level.FINE, "Received health status {0} for subchannel {1}", new Object[] { paramo, b.a });
    a = paramo;
    if (c.h.c())
    {
      paramo = c;
      if (g.get(h.a())).c == this) {
        c.j(b);
      }
    }
  }
}

/* Location:
 * Qualified Name:     gb.p2.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */