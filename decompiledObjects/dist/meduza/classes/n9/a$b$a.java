package n9;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public final class a$b$a
  extends ScheduledThreadPoolExecutor
{
  public a$b$a(a.b paramb, a.b.b paramb1)
  {
    super(1, paramb1);
  }
  
  public final void afterExecute(Runnable paramRunnable, Throwable paramThrowable)
  {
    super.afterExecute(paramRunnable, paramThrowable);
    localThrowable = paramThrowable;
    if (paramThrowable == null)
    {
      localThrowable = paramThrowable;
      if ((paramRunnable instanceof Future))
      {
        paramRunnable = (Future)paramRunnable;
        localThrowable = paramThrowable;
      }
    }
    try
    {
      try
      {
        if (paramRunnable.isDone())
        {
          paramRunnable.get();
          localThrowable = paramThrowable;
        }
      }
      catch (InterruptedException paramRunnable)
      {
        Thread.currentThread().interrupt();
        localThrowable = paramThrowable;
      }
      catch (ExecutionException paramRunnable)
      {
        localThrowable = paramRunnable.getCause();
      }
    }
    catch (CancellationException paramRunnable)
    {
      for (;;)
      {
        localThrowable = paramThrowable;
      }
    }
    if (localThrowable != null) {
      a.d.c(localThrowable);
    }
  }
}

/* Location:
 * Qualified Name:     n9.a.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */