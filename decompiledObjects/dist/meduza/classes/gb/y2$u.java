package gb;

import eb.e1;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class y2$u
  implements Runnable
{
  public final y2.t a;
  
  public y2$u(y2 paramy2, y2.t paramt)
  {
    a = paramt;
  }
  
  public final void run()
  {
    final Object localObject = b;
    localObject = ((y2)localObject).r(o.e, false);
    if (localObject == null) {
      return;
    }
    b.b.execute(new a((y2.a0)localObject));
  }
  
  public final class a
    implements Runnable
  {
    public a(y2.a0 parama0) {}
    
    public final void run()
    {
      synchronized (b.i)
      {
        localObject2 = y2.u.this;
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
        o = o.a(localObject);
        localObject3 = b;
        if (!((y2)localObject3).v(o)) {
          break label173;
        }
        localObject3 = b.m;
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
      Object localObject6 = b;
      Object localObject5 = new gb/y2$t;
      ((y2.t)localObject5).<init>(i);
      break label264;
      label173:
      Object localObject2 = b;
      localObject5 = o;
      if (!h) {
        localObject5 = new y2.y(b, c, d, f, g, a, true, e);
      }
      o = ((y2.y)localObject5);
      localObject2 = b;
      localObject5 = localObject6;
      localObject6 = localObject2;
      label264:
      w = ((y2.t)localObject5);
      int j = 0;
      label274:
      if (j != 0)
      {
        localObject5 = localObject;
        a.l(new y2.z(b, (y2.a0)localObject5));
        localObjecta.n(e1.f.g("Unneeded hedging"));
        return;
      }
      if (localObject5 != null)
      {
        localObject6 = b;
        ((y2.t)localObject5).a(d.schedule(new y2.u((y2)localObject6, (y2.t)localObject5), g.b, TimeUnit.NANOSECONDS));
      }
      b.t(localObject);
      return;
      throw ((Throwable)localObject5);
    }
  }
}

/* Location:
 * Qualified Name:     gb.y2.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */