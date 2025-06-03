package d;

import android.os.Bundle;
import b1.k.a;
import b1.m;
import b1.o;
import java.util.HashMap;

public final class d
  implements m
{
  public final void a(o paramo, k.a parama)
  {
    if (k.a.ON_START.equals(parama))
    {
      parama = d.e;
      paramo = a;
      b localb = b;
      parama.put(paramo, new g.a(c, localb));
      if (d.f.containsKey(a))
      {
        paramo = d.f.get(a);
        d.f.remove(a);
        b.a(paramo);
      }
      paramo = (a)d.g.getParcelable(a);
      if (paramo != null)
      {
        d.g.remove(a);
        b.a(c.c(a, b));
      }
    }
    else if (k.a.ON_STOP.equals(parama))
    {
      d.e.remove(a);
    }
    else if (k.a.ON_DESTROY.equals(parama))
    {
      d.f(a);
    }
  }
}

/* Location:
 * Qualified Name:     d.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */