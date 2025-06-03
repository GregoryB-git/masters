package n9;

import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import w.g;
import x6.b;

public final class c
  implements Executor
{
  public Semaphore a = new Semaphore(0);
  public int b = 0;
  
  public final void a()
  {
    try
    {
      a.acquire(b);
      b = 0;
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      Thread.currentThread().interrupt();
      b.T("Interrupted while waiting for background task", new Object[] { localInterruptedException });
      throw null;
    }
  }
  
  public final void execute(Runnable paramRunnable)
  {
    b += 1;
    f.c.execute(new g(24, this, paramRunnable));
  }
}

/* Location:
 * Qualified Name:     n9.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */