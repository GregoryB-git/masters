package e1;

import android.os.Binder;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

public final class c$a
  implements Callable<Result>
{
  public c$a(c paramc) {}
  
  public final Result call()
  {
    a.d.set(true);
    try
    {
      Process.setThreadPriority(10);
      a.a();
      Binder.flushPendingCommands();
      a.d(null);
      return null;
    }
    finally
    {
      try
      {
        a.c.set(true);
        throw ((Throwable)localObject1);
      }
      finally
      {
        a.d(null);
      }
    }
  }
}

/* Location:
 * Qualified Name:     e1.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */