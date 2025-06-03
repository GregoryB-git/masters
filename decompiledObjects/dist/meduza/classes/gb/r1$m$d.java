package gb;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicReference;

public final class r1$m$d
  implements Runnable
{
  public r1$m$d(r1.m paramm, r1.m.e parame) {}
  
  public final void run()
  {
    if (b.b.get() == r1.k0)
    {
      r1 localr1 = b.e;
      if (C == null)
      {
        C = new LinkedHashSet();
        localr1 = b.e;
        b0.c(D, true);
      }
      b.e.C.add(a);
    }
    else
    {
      a.j();
    }
  }
}

/* Location:
 * Qualified Name:     gb.r1.m.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */