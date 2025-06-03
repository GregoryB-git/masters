package n9;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p2.m0;
import x0.q0;

public final class a$b
  implements Executor
{
  public final a a;
  public boolean b;
  public final Thread c;
  
  public a$b(a parama)
  {
    parama = new b();
    Thread localThread = Executors.defaultThreadFactory().newThread(parama);
    c = localThread;
    localThread.setName("FirestoreWorker");
    localThread.setDaemon(true);
    localThread.setUncaughtExceptionHandler(new b(this));
    parama = new a(parama);
    a = parama;
    parama.setKeepAliveTime(3L, TimeUnit.SECONDS);
    b = false;
  }
  
  public final <T> Task<T> a(Callable<T> paramCallable)
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    try
    {
      q0 localq0 = new x0/q0;
      localq0.<init>(15, localTaskCompletionSource, paramCallable);
      execute(localq0);
    }
    catch (RejectedExecutionException paramCallable)
    {
      m0.y(2, a.class.getSimpleName(), "Refused to enqueue task after panic", new Object[0]);
    }
    return localTaskCompletionSource.getTask();
  }
  
  public final void execute(Runnable paramRunnable)
  {
    try
    {
      if (!b) {
        a.execute(paramRunnable);
      }
      return;
    }
    finally
    {
      paramRunnable = finally;
      throw paramRunnable;
    }
  }
  
  public final class a
    extends ScheduledThreadPoolExecutor
  {
    public a(a.b.b paramb)
    {
      super(paramb);
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
        d.c(localThrowable);
      }
    }
  }
  
  public final class b
    implements Runnable, ThreadFactory
  {
    public final CountDownLatch a = new CountDownLatch(1);
    public Runnable b;
    
    public b() {}
    
    public final Thread newThread(Runnable paramRunnable)
    {
      boolean bool;
      if (b == null) {
        bool = true;
      } else {
        bool = false;
      }
      x6.b.Z("Only one thread may be created in an AsyncQueue.", bool, new Object[0]);
      b = paramRunnable;
      a.countDown();
      return c;
    }
    
    public final void run()
    {
      try
      {
        a.await();
      }
      catch (InterruptedException localInterruptedException)
      {
        Thread.currentThread().interrupt();
      }
      b.run();
    }
  }
}

/* Location:
 * Qualified Name:     n9.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */