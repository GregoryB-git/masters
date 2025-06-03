package Y3;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

public class c$a
  extends ScheduledThreadPoolExecutor
{
  public c$a(c paramc, int paramInt, ThreadFactory paramThreadFactory)
  {
    super(paramInt, paramThreadFactory);
  }
  
  public void afterExecute(Runnable paramRunnable, Throwable paramThrowable)
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
        if (!paramRunnable.isDone()) {
          break label70;
        }
        paramRunnable.get();
        localThrowable = paramThrowable;
      }
      catch (ExecutionException paramRunnable) {}catch (InterruptedException paramRunnable)
      {
        Thread.currentThread().interrupt();
        localThrowable = paramThrowable;
      }
      localThrowable = paramRunnable.getCause();
    }
    catch (CancellationException paramRunnable)
    {
      for (;;)
      {
        label70:
        localThrowable = paramThrowable;
      }
    }
    if (localThrowable != null) {
      o.g(localThrowable);
    }
  }
}

/* Location:
 * Qualified Name:     Y3.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */