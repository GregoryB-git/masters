package N3;

import H3.H;
import H3.c0;
import H3.v;
import V2.k;
import android.os.SystemClock;
import java.util.Collection;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class e
{
  public final double a;
  public final double b;
  public final long c;
  public final long d;
  public final int e;
  public final BlockingQueue f;
  public final ThreadPoolExecutor g;
  public final c2.f h;
  public final H i;
  public int j;
  public long k;
  
  public e(double paramDouble1, double paramDouble2, long paramLong, c2.f paramf, H paramH)
  {
    a = paramDouble1;
    b = paramDouble2;
    c = paramLong;
    h = paramf;
    i = paramH;
    d = SystemClock.elapsedRealtime();
    int m = (int)paramDouble1;
    e = m;
    paramf = new ArrayBlockingQueue(m);
    f = paramf;
    g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, paramf);
    j = 0;
    k = 0L;
  }
  
  public e(c2.f paramf, O3.d paramd, H paramH)
  {
    this(f, g, h * 1000L, paramf, paramH);
  }
  
  public static void q(double paramDouble)
  {
    long l = paramDouble;
    try
    {
      Thread.sleep(l);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
  }
  
  public final double g()
  {
    return Math.min(3600000.0D, 60000.0D / a * Math.pow(b, h()));
  }
  
  public final int h()
  {
    if (k == 0L) {
      k = o();
    }
    int m = (int)((o() - k) / c);
    if (l()) {
      m = Math.min(100, j + m);
    } else {
      m = Math.max(0, j - m);
    }
    if (j != m)
    {
      j = m;
      k = o();
    }
    return m;
  }
  
  public k i(v paramv, boolean paramBoolean)
  {
    k localk;
    Object localObject1;
    Object localObject2;
    synchronized (f)
    {
      localk = new V2/k;
      localk.<init>();
      if (paramBoolean)
      {
        i.d();
        if (k())
        {
          localObject1 = E3.f.f();
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          ((StringBuilder)localObject2).append("Enqueueing report: ");
          ((StringBuilder)localObject2).append(paramv.d());
          ((E3.f)localObject1).b(((StringBuilder)localObject2).toString());
          localObject2 = E3.f.f();
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          ((StringBuilder)localObject1).append("Queue size: ");
          ((StringBuilder)localObject1).append(f.size());
          ((E3.f)localObject2).b(((StringBuilder)localObject1).toString());
          localObject1 = g;
          localObject2 = new N3/e$b;
          ((b)localObject2).<init>(this, paramv, localk, null);
          ((ThreadPoolExecutor)localObject1).execute((Runnable)localObject2);
          localObject2 = E3.f.f();
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          ((StringBuilder)localObject1).append("Closing task for report: ");
          ((StringBuilder)localObject1).append(paramv.d());
          ((E3.f)localObject2).b(((StringBuilder)localObject1).toString());
          localk.e(paramv);
          return localk;
        }
      }
    }
  }
  
  public void j()
  {
    CountDownLatch localCountDownLatch = new CountDownLatch(1);
    new Thread(new d(this, localCountDownLatch)).start();
    c0.g(localCountDownLatch, 2L, TimeUnit.SECONDS);
  }
  
  public final boolean k()
  {
    boolean bool;
    if (f.size() < e) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean l()
  {
    boolean bool;
    if (f.size() == e) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final long o()
  {
    return System.currentTimeMillis();
  }
  
  public final void p(v paramv, k paramk)
  {
    E3.f localf = E3.f.f();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Sending report through Google DataTransport: ");
    localStringBuilder.append(paramv.d());
    localf.b(localStringBuilder.toString());
    boolean bool;
    if (SystemClock.elapsedRealtime() - d < 2000L) {
      bool = true;
    } else {
      bool = false;
    }
    h.a(c2.c.e(paramv.b()), new c(this, paramk, bool, paramv));
  }
  
  public final class b
    implements Runnable
  {
    public final v o;
    public final k p;
    
    public b(v paramv, k paramk)
    {
      o = paramv;
      p = paramk;
    }
    
    public void run()
    {
      e.c(e.this, o, p);
      e.d(e.this).e();
      double d = e.e(e.this);
      E3.f localf = E3.f.f();
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Delay for: ");
      localStringBuilder.append(String.format(Locale.US, "%.2f", new Object[] { Double.valueOf(d / 1000.0D) }));
      localStringBuilder.append(" s for report: ");
      localStringBuilder.append(o.d());
      localf.b(localStringBuilder.toString());
      e.f(d);
    }
  }
}

/* Location:
 * Qualified Name:     N3.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */