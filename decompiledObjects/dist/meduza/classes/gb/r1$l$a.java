package gb;

import eb.d.a;
import eb.e1;
import eb.k0;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class r1$l$a
  implements Runnable
{
  public final void run()
  {
    r1.l locall = b;
    e1 locale1 = a;
    locall.getClass();
    r1.e0.log(Level.WARNING, "[{0}] Failed to resolve name. status={1}", new Object[] { c.b, locale1 });
    Object localObject = c.R;
    if (b.get() == r1.k0) {
      ((r1.m)localObject).D(null);
    }
    localObject = c;
    if (S != 3)
    {
      P.b(d.a.c, "Failed to resolve name: {0}", new Object[] { locale1 });
      c.S = 3;
    }
    localObject = a;
    if (localObject == c.y) {
      a.b.c(locale1);
    }
  }
}

/* Location:
 * Qualified Name:     gb.r1.l.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */