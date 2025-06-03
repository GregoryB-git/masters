package F;

import H.a;
import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class h
{
  public static ThreadPoolExecutor a(String paramString, int paramInt1, int paramInt2)
  {
    paramString = new a(paramString, paramInt1);
    paramString = new ThreadPoolExecutor(0, 1, paramInt2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), paramString);
    paramString.allowCoreThreadTimeOut(true);
    return paramString;
  }
  
  public static void b(Executor paramExecutor, Callable paramCallable, a parama)
  {
    paramExecutor.execute(new b(b.a(), paramCallable, parama));
  }
  
  public static Object c(ExecutorService paramExecutorService, Callable paramCallable, int paramInt)
  {
    paramExecutorService = paramExecutorService.submit(paramCallable);
    long l = paramInt;
    try
    {
      paramExecutorService = paramExecutorService.get(l, TimeUnit.MILLISECONDS);
      return paramExecutorService;
    }
    catch (InterruptedException paramExecutorService) {}catch (ExecutionException paramExecutorService) {}catch (TimeoutException paramExecutorService)
    {
      throw new InterruptedException("timeout");
    }
    throw paramExecutorService;
    throw new RuntimeException(paramExecutorService);
  }
  
  public static class a
    implements ThreadFactory
  {
    public String a;
    public int b;
    
    public a(String paramString, int paramInt)
    {
      a = paramString;
      b = paramInt;
    }
    
    public Thread newThread(Runnable paramRunnable)
    {
      return new a(paramRunnable, a, b);
    }
    
    public static class a
      extends Thread
    {
      public final int o;
      
      public a(Runnable paramRunnable, String paramString, int paramInt)
      {
        super(paramString);
        o = paramInt;
      }
      
      public void run()
      {
        Process.setThreadPriority(o);
        super.run();
      }
    }
  }
  
  public static class b
    implements Runnable
  {
    public Callable o;
    public a p;
    public Handler q;
    
    public b(Handler paramHandler, Callable paramCallable, a parama)
    {
      o = paramCallable;
      p = parama;
      q = paramHandler;
    }
    
    public void run()
    {
      final Object localObject2;
      try
      {
        Object localObject1 = o.call();
      }
      catch (Exception localException)
      {
        localObject2 = null;
      }
      final a locala = p;
      q.post(new a(locala, localObject2));
    }
    
    public class a
      implements Runnable
    {
      public a(a parama, Object paramObject) {}
      
      public void run()
      {
        locala.accept(localObject2);
      }
    }
  }
}

/* Location:
 * Qualified Name:     F.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */