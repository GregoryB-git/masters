package w5;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

public class c$h
  implements c.d
{
  public final ExecutorService a;
  public final ConcurrentLinkedQueue b;
  public final AtomicBoolean c;
  
  public c$h(ExecutorService paramExecutorService)
  {
    a = paramExecutorService;
    b = new ConcurrentLinkedQueue();
    c = new AtomicBoolean(false);
  }
  
  public void a(Runnable paramRunnable)
  {
    b.add(paramRunnable);
    a.execute(new d(this));
  }
  
  public final void d()
  {
    if (c.compareAndSet(false, true))
    {
      try
      {
        Runnable localRunnable = (Runnable)b.poll();
        if (localRunnable != null) {
          localRunnable.run();
        }
      }
      finally
      {
        break label78;
      }
      c.set(false);
      if (!b.isEmpty())
      {
        a.execute(new e(this));
        return;
        label78:
        c.set(false);
        if (!b.isEmpty()) {
          a.execute(new e(this));
        }
        throw ((Throwable)localObject);
      }
    }
  }
}

/* Location:
 * Qualified Name:     w5.c.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */