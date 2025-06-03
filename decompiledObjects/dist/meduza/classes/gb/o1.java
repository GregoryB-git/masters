package gb;

import eb.e1;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import n7.p;
import x6.b;

public final class o1
{
  public static final long l = TimeUnit.SECONDS.toNanos(10L);
  public final ScheduledExecutorService a;
  public final p b;
  public final d c;
  public final boolean d;
  public int e = 1;
  public ScheduledFuture<?> f;
  public ScheduledFuture<?> g;
  public final p1 h = new p1(new a());
  public final p1 i = new p1(new b());
  public final long j;
  public final long k;
  
  static
  {
    TimeUnit.MILLISECONDS.toNanos(10L);
  }
  
  public o1(c paramc, ScheduledExecutorService paramScheduledExecutorService, long paramLong1, long paramLong2, boolean paramBoolean)
  {
    c = paramc;
    b.y(paramScheduledExecutorService, "scheduler");
    a = paramScheduledExecutorService;
    b = localp;
    j = paramLong1;
    k = paramLong2;
    d = paramBoolean;
    b = false;
    localp.b();
  }
  
  public final void a()
  {
    try
    {
      Object localObject1 = b;
      boolean bool = false;
      b = false;
      ((p)localObject1).b();
      int m = e;
      if (m == 2)
      {
        e = 3;
      }
      else if ((m == 4) || (m == 5))
      {
        localObject1 = f;
        if (localObject1 != null) {
          ((Future)localObject1).cancel(false);
        }
        if (e == 5)
        {
          e = 1;
          return;
        }
        e = 2;
        if (g == null) {
          bool = true;
        }
        b.I(bool, "There should be no outstanding pingFuture");
        g = a.schedule(i, j, TimeUnit.NANOSECONDS);
      }
      return;
    }
    finally {}
  }
  
  public final void b()
  {
    try
    {
      int m = e;
      if (m == 1)
      {
        e = 2;
        if (g == null)
        {
          ScheduledExecutorService localScheduledExecutorService = a;
          p1 localp1 = i;
          long l1 = j;
          p localp = b;
          TimeUnit localTimeUnit = TimeUnit.NANOSECONDS;
          g = localScheduledExecutorService.schedule(localp1, l1 - localp.a(localTimeUnit), localTimeUnit);
        }
      }
      else if (m == 5)
      {
        e = 4;
      }
      return;
    }
    finally {}
  }
  
  public final class a
    implements Runnable
  {
    public a() {}
    
    public final void run()
    {
      synchronized (o1.this)
      {
        o1 localo12 = o1.this;
        int i;
        if (e != 6)
        {
          e = 6;
          i = 1;
        }
        else
        {
          i = 0;
        }
        if (i != 0) {
          c.a();
        }
        return;
      }
    }
  }
  
  public final class b
    implements Runnable
  {
    public b() {}
    
    public final void run()
    {
      synchronized (o1.this)
      {
        o1 localo12 = o1.this;
        g = null;
        int i = e;
        if (i == 2)
        {
          i = 1;
          e = 4;
          f = a.schedule(h, k, TimeUnit.NANOSECONDS);
        }
        else
        {
          if (i == 3)
          {
            ScheduledExecutorService localScheduledExecutorService = a;
            p1 localp1 = i;
            long l = j;
            p localp = b;
            TimeUnit localTimeUnit = TimeUnit.NANOSECONDS;
            g = localScheduledExecutorService.schedule(localp1, l - localp.a(localTimeUnit), localTimeUnit);
            e = 2;
          }
          i = 0;
        }
        if (i != 0) {
          c.b();
        }
        return;
      }
    }
  }
  
  public static final class c
    implements o1.d
  {
    public final x a;
    
    public c(x paramx)
    {
      a = paramx;
    }
    
    public final void a()
    {
      a.h(e1.n.g("Keepalive failed. The connection is likely gone"));
    }
    
    public final void b()
    {
      a.e(new a());
    }
    
    public final class a
      implements u.a
    {
      public a() {}
      
      public final void i()
      {
        a.h(e1.n.g("Keepalive failed. The connection is likely gone"));
      }
      
      public final void k() {}
    }
  }
  
  public static abstract interface d
  {
    public abstract void a();
    
    public abstract void b();
  }
}

/* Location:
 * Qualified Name:     gb.o1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */