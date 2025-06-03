package U3;

import c4.c;
import c4.d;
import java.util.Random;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class a
{
  public final ScheduledExecutorService a;
  public final c b;
  public final long c;
  public final long d;
  public final double e;
  public final double f;
  public final Random g = new Random();
  public ScheduledFuture h;
  public long i;
  public boolean j = true;
  
  public a(ScheduledExecutorService paramScheduledExecutorService, c paramc, long paramLong1, long paramLong2, double paramDouble1, double paramDouble2)
  {
    a = paramScheduledExecutorService;
    b = paramc;
    c = paramLong1;
    d = paramLong2;
    f = paramDouble1;
    e = paramDouble2;
  }
  
  public void b()
  {
    if (h != null)
    {
      b.b("Cancelling existing retry attempt", new Object[0]);
      h.cancel(false);
      h = null;
    }
    else
    {
      b.b("No existing retry attempt to cancel", new Object[0]);
    }
    i = 0L;
  }
  
  public void c(final Runnable paramRunnable)
  {
    paramRunnable = new a(paramRunnable);
    if (h != null)
    {
      b.b("Cancelling previous scheduled retry", new Object[0]);
      h.cancel(false);
      h = null;
    }
    boolean bool = j;
    long l = 0L;
    if (!bool)
    {
      l = i;
      if (l == 0L) {}
      for (l = c;; l = Math.min((l * f), d))
      {
        i = l;
        break;
      }
      double d1 = e;
      l = i;
      l = ((1.0D - d1) * l + d1 * l * g.nextDouble());
    }
    j = false;
    b.b("Scheduling retry in %dms", new Object[] { Long.valueOf(l) });
    h = a.schedule(paramRunnable, l, TimeUnit.MILLISECONDS);
  }
  
  public void d()
  {
    i = d;
  }
  
  public void e()
  {
    j = true;
    i = 0L;
  }
  
  public class a
    implements Runnable
  {
    public a(Runnable paramRunnable) {}
    
    public void run()
    {
      a.a(a.this, null);
      paramRunnable.run();
    }
  }
  
  public static class b
  {
    public final ScheduledExecutorService a;
    public long b = 1000L;
    public double c = 0.5D;
    public long d = 30000L;
    public double e = 1.3D;
    public final c f;
    
    public b(ScheduledExecutorService paramScheduledExecutorService, d paramd, String paramString)
    {
      a = paramScheduledExecutorService;
      f = new c(paramd, paramString);
    }
    
    public a a()
    {
      return new a(a, f, b, d, e, c, null);
    }
    
    public b b(double paramDouble)
    {
      if ((paramDouble >= 0.0D) && (paramDouble <= 1.0D))
      {
        c = paramDouble;
        return this;
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Argument out of range: ");
      localStringBuilder.append(paramDouble);
      throw new IllegalArgumentException(localStringBuilder.toString());
    }
    
    public b c(long paramLong)
    {
      d = paramLong;
      return this;
    }
    
    public b d(long paramLong)
    {
      b = paramLong;
      return this;
    }
    
    public b e(double paramDouble)
    {
      e = paramDouble;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     U3.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */