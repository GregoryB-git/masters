package gb;

import eb.e1;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class y2$u$a
  implements Runnable
{
  public y2$u$a(y2.u paramu, y2.a0 parama0) {}
  
  public final void run()
  {
    synchronized (b.b.i)
    {
      localObject2 = b;
      boolean bool = a.c;
      Object localObject3 = null;
      localObject6 = null;
      int i = 1;
      j = 1;
      if (bool)
      {
        j = i;
        break label274;
      }
      localObject3 = b;
      o = o.a(a);
      localObject3 = b.b;
      if (!((y2)localObject3).v(o)) {
        break label173;
      }
      localObject3 = b.b.m;
      if (localObject3 != null)
      {
        if (d.get() <= b) {
          j = 0;
        }
        if (j == 0) {
          break label173;
        }
      }
    }
    Object localObject6 = b.b;
    Object localObject5 = new gb/y2$t;
    ((y2.t)localObject5).<init>(i);
    break label264;
    label173:
    Object localObject2 = b.b;
    localObject5 = o;
    if (!h) {
      localObject5 = new y2.y(b, c, d, f, g, a, true, e);
    }
    o = ((y2.y)localObject5);
    localObject2 = b.b;
    localObject5 = localObject6;
    localObject6 = localObject2;
    label264:
    w = ((y2.t)localObject5);
    int j = 0;
    label274:
    if (j != 0)
    {
      localObject5 = a;
      a.l(new y2.z(b.b, (y2.a0)localObject5));
      a.a.n(e1.f.g("Unneeded hedging"));
      return;
    }
    if (localObject5 != null)
    {
      localObject6 = b.b;
      ((y2.t)localObject5).a(d.schedule(new y2.u((y2)localObject6, (y2.t)localObject5), g.b, TimeUnit.NANOSECONDS));
    }
    b.b.t(a);
    return;
    throw ((Throwable)localObject5);
  }
}

/* Location:
 * Qualified Name:     gb.y2.u.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */