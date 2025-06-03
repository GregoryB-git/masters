package q8;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import f;
import j8.u;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import l.l;

public final class c$a
  implements Runnable
{
  public final u a;
  public final TaskCompletionSource<u> b;
  
  public c$a(c paramc, u paramu, TaskCompletionSource paramTaskCompletionSource)
  {
    a = paramu;
    b = paramTaskCompletionSource;
  }
  
  public final void run()
  {
    c.b(a, b);
    ((AtomicInteger)c.i.c).set(0);
    Object localObject = c;
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

/* Location:
 * Qualified Name:     q8.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */