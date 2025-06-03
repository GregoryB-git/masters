package q8;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import f;
import h3.a;
import h3.e;
import h3.h;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import l.l;
import m8.f0;

public final class c
{
  public final double a;
  public final double b;
  public final long c;
  public final long d;
  public final int e;
  public final ArrayBlockingQueue f;
  public final ThreadPoolExecutor g;
  public final h<f0> h;
  public final l i;
  public int j;
  public long k;
  
  public c(h<f0> paramh, r8.c paramc, l paraml)
  {
    a = d1;
    b = d2;
    c = (l * 1000L);
    h = paramh;
    i = paraml;
    d = SystemClock.elapsedRealtime();
    int m = (int)d1;
    e = m;
    paramh = new ArrayBlockingQueue(m);
    f = paramh;
    g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, paramh);
    j = 0;
    k = 0L;
  }
  
  public final int a()
  {
    if (k == 0L) {
      k = System.currentTimeMillis();
    }
    int m = (int)((System.currentTimeMillis() - k) / c);
    int n;
    if (f.size() == e) {
      n = 1;
    } else {
      n = 0;
    }
    if (n != 0) {
      n = Math.min(100, j + m);
    } else {
      n = Math.max(0, j - m);
    }
    if (j != n)
    {
      j = n;
      k = System.currentTimeMillis();
    }
    return n;
  }
  
  public final void b(j8.u paramu, TaskCompletionSource<j8.u> paramTaskCompletionSource)
  {
    Object localObject = f.l("Sending report through Google DataTransport: ");
    ((StringBuilder)localObject).append(paramu.c());
    localObject = ((StringBuilder)localObject).toString();
    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
      Log.d("FirebaseCrashlytics", (String)localObject, null);
    }
    boolean bool;
    if (SystemClock.elapsedRealtime() - d < 2000L) {
      bool = true;
    } else {
      bool = false;
    }
    h localh = h;
    localObject = new a(paramu.a(), e.c, null);
    paramu = new b(this, paramTaskCompletionSource, bool, paramu);
    ((k3.u)localh).a((a)localObject, paramu);
  }
  
  public final class a
    implements Runnable
  {
    public final j8.u a;
    public final TaskCompletionSource<j8.u> b;
    
    public a(j8.u paramu, TaskCompletionSource paramTaskCompletionSource)
    {
      a = paramu;
      b = paramTaskCompletionSource;
    }
    
    public final void run()
    {
      b(a, b);
      ((AtomicInteger)i.c).set(0);
      Object localObject = c.this;
      double d = 60000.0D / a;
      d = Math.min(3600000.0D, Math.pow(b, ((c)localObject).a()) * d);
      localObject = f.l("Delay for: ");
      ((StringBuilder)localObject).append(String.format(Locale.US, "%.2f", new Object[] { Double.valueOf(d / 1000.0D) }));
      ((StringBuilder)localObject).append(" s for report: ");
      ((StringBuilder)localObject).append(a.c());
      localObject = ((StringBuilder)localObject).toString();
      if (Log.isLoggable("FirebaseCrashlytics", 3)) {
        Log.d("FirebaseCrashlytics", (String)localObject, null);
      }
      long l = d;
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
  }
}

/* Location:
 * Qualified Name:     q8.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */