package gb;

import eb.h1;
import eb.h1.b;
import eb.h1.c;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class k
  implements b3
{
  public static final Logger f = Logger.getLogger(k.class.getName());
  public final ScheduledExecutorService a;
  public final h1 b;
  public final j.a c;
  public k0 d;
  public h1.c e;
  
  public k(k0.a parama, ScheduledExecutorService paramScheduledExecutorService, h1 paramh1)
  {
    c = parama;
    a = paramScheduledExecutorService;
    b = paramh1;
  }
  
  public final void a(c3.a parama)
  {
    b.d();
    if (d == null)
    {
      ((k0.a)c).getClass();
      d = new k0();
    }
    Object localObject = e;
    if (localObject != null)
    {
      localObject = a;
      int i;
      if ((!c) && (!b)) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0) {
        return;
      }
    }
    long l = d.a();
    e = b.c(parama, l, TimeUnit.NANOSECONDS, a);
    f.log(Level.FINE, "Scheduling DNS resolution backoff for {0}ns", Long.valueOf(l));
  }
}

/* Location:
 * Qualified Name:     gb.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */