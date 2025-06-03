package H3;

import E3.f;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.DiscardPolicy;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public abstract class A
{
  public static void a(String paramString, ExecutorService paramExecutorService)
  {
    b(paramString, paramExecutorService, 2L, TimeUnit.SECONDS);
  }
  
  public static void b(String paramString, final ExecutorService paramExecutorService, final long paramLong, TimeUnit paramTimeUnit)
  {
    Runtime localRuntime = Runtime.getRuntime();
    paramTimeUnit = new b(paramExecutorService, paramLong, paramTimeUnit);
    paramExecutorService = new StringBuilder();
    paramExecutorService.append("Crashlytics Shutdown Hook for ");
    paramExecutorService.append(paramString);
    localRuntime.addShutdownHook(new Thread(paramTimeUnit, paramExecutorService.toString()));
  }
  
  public static ExecutorService c(String paramString)
  {
    ExecutorService localExecutorService = e(d(paramString), new ThreadPoolExecutor.DiscardPolicy());
    a(paramString, localExecutorService);
    return localExecutorService;
  }
  
  public static ThreadFactory d(String paramString)
  {
    return new a(new AtomicLong(1L));
  }
  
  public static ExecutorService e(ThreadFactory paramThreadFactory, RejectedExecutionHandler paramRejectedExecutionHandler)
  {
    return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), paramThreadFactory, paramRejectedExecutionHandler));
  }
  
  public class a
    implements ThreadFactory
  {
    public a(AtomicLong paramAtomicLong) {}
    
    public Thread newThread(final Runnable paramRunnable)
    {
      Thread localThread = Executors.defaultThreadFactory().newThread(new a(paramRunnable));
      paramRunnable = new StringBuilder();
      paramRunnable.append(A.this);
      paramRunnable.append(b.getAndIncrement());
      localThread.setName(paramRunnable.toString());
      return localThread;
    }
    
    public class a
      extends d
    {
      public a(Runnable paramRunnable) {}
      
      public void a()
      {
        paramRunnable.run();
      }
    }
  }
  
  public class b
    extends d
  {
    public b(ExecutorService paramExecutorService, long paramLong, TimeUnit paramTimeUnit) {}
    
    public void a()
    {
      try
      {
        Object localObject1 = f.f();
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        ((StringBuilder)localObject2).append("Executing shutdown hook for ");
        ((StringBuilder)localObject2).append(A.this);
        ((f)localObject1).b(((StringBuilder)localObject2).toString());
        paramExecutorService.shutdown();
        if (!paramExecutorService.awaitTermination(paramLong, r))
        {
          localObject2 = f.f();
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          ((StringBuilder)localObject1).append(A.this);
          ((StringBuilder)localObject1).append(" did not shut down in the allocated time. Requesting immediate shutdown.");
          ((f)localObject2).b(((StringBuilder)localObject1).toString());
          paramExecutorService.shutdownNow();
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        f.f().b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[] { A.this }));
        paramExecutorService.shutdownNow();
      }
    }
  }
}

/* Location:
 * Qualified Name:     H3.A
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */