package C3;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class o
  implements ScheduledExecutorService
{
  public final ExecutorService o;
  public final ScheduledExecutorService p;
  
  public o(ExecutorService paramExecutorService, ScheduledExecutorService paramScheduledExecutorService)
  {
    o = paramExecutorService;
    p = paramScheduledExecutorService;
  }
  
  public boolean awaitTermination(long paramLong, TimeUnit paramTimeUnit)
  {
    return o.awaitTermination(paramLong, paramTimeUnit);
  }
  
  public void execute(Runnable paramRunnable)
  {
    o.execute(paramRunnable);
  }
  
  public List invokeAll(Collection paramCollection)
  {
    return o.invokeAll(paramCollection);
  }
  
  public List invokeAll(Collection paramCollection, long paramLong, TimeUnit paramTimeUnit)
  {
    return o.invokeAll(paramCollection, paramLong, paramTimeUnit);
  }
  
  public Object invokeAny(Collection paramCollection)
  {
    return o.invokeAny(paramCollection);
  }
  
  public Object invokeAny(Collection paramCollection, long paramLong, TimeUnit paramTimeUnit)
  {
    return o.invokeAny(paramCollection, paramLong, paramTimeUnit);
  }
  
  public boolean isShutdown()
  {
    return o.isShutdown();
  }
  
  public boolean isTerminated()
  {
    return o.isTerminated();
  }
  
  public ScheduledFuture schedule(Runnable paramRunnable, long paramLong, TimeUnit paramTimeUnit)
  {
    return new p(new c(this, paramRunnable, paramLong, paramTimeUnit));
  }
  
  public ScheduledFuture schedule(Callable paramCallable, long paramLong, TimeUnit paramTimeUnit)
  {
    return new p(new h(this, paramCallable, paramLong, paramTimeUnit));
  }
  
  public ScheduledFuture scheduleAtFixedRate(Runnable paramRunnable, long paramLong1, long paramLong2, TimeUnit paramTimeUnit)
  {
    return new p(new f(this, paramRunnable, paramLong1, paramLong2, paramTimeUnit));
  }
  
  public ScheduledFuture scheduleWithFixedDelay(Runnable paramRunnable, long paramLong1, long paramLong2, TimeUnit paramTimeUnit)
  {
    return new p(new g(this, paramRunnable, paramLong1, paramLong2, paramTimeUnit));
  }
  
  public void shutdown()
  {
    throw new UnsupportedOperationException("Shutting down is not allowed.");
  }
  
  public List shutdownNow()
  {
    throw new UnsupportedOperationException("Shutting down is not allowed.");
  }
  
  public Future submit(Runnable paramRunnable)
  {
    return o.submit(paramRunnable);
  }
  
  public Future submit(Runnable paramRunnable, Object paramObject)
  {
    return o.submit(paramRunnable, paramObject);
  }
  
  public Future submit(Callable paramCallable)
  {
    return o.submit(paramCallable);
  }
}

/* Location:
 * Qualified Name:     C3.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */