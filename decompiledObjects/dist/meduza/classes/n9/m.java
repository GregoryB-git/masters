package n9;

import g.q;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Semaphore;

public final class m
  implements Executor
{
  public final Executor a;
  public final Semaphore b = new Semaphore(4);
  
  public m(Executor paramExecutor)
  {
    a = paramExecutor;
  }
  
  public final void execute(Runnable paramRunnable)
  {
    if (b.tryAcquire()) {}
    try
    {
      Executor localExecutor = a;
      q localq = new g/q;
      localq.<init>(21, this, paramRunnable);
      localExecutor.execute(localq);
    }
    catch (RejectedExecutionException localRejectedExecutionException)
    {
      for (;;) {}
    }
    paramRunnable.run();
  }
}

/* Location:
 * Qualified Name:     n9.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */