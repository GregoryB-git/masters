package gb;

import eb.h1;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import n7.p;

public final class x2
{
  public final ScheduledExecutorService a;
  public final Executor b;
  public final Runnable c;
  public final p d;
  public long e;
  public boolean f;
  public ScheduledFuture<?> g;
  
  public x2(r1.j paramj, h1 paramh1, ScheduledExecutorService paramScheduledExecutorService, p paramp)
  {
    c = paramj;
    b = paramh1;
    a = paramScheduledExecutorService;
    d = paramp;
    paramp.b();
  }
  
  public final class a
    implements Runnable
  {
    public a() {}
    
    public final void run()
    {
      Object localObject1 = x2.this;
      if (!f)
      {
        g = null;
        return;
      }
      Object localObject2 = d;
      localObject1 = TimeUnit.NANOSECONDS;
      long l = ((p)localObject2).a((TimeUnit)localObject1);
      localObject2 = x2.this;
      l = e - l;
      if (l > 0L)
      {
        g = a.schedule(new x2.b((x2)localObject2), l, (TimeUnit)localObject1);
      }
      else
      {
        f = false;
        g = null;
        c.run();
      }
    }
  }
  
  public final class b
    implements Runnable
  {
    public b() {}
    
    public final void run()
    {
      x2 localx2 = x2.this;
      b.execute(new x2.a(localx2));
    }
  }
}

/* Location:
 * Qualified Name:     gb.x2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */