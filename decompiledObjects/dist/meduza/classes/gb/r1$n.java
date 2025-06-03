package gb;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import x6.b;

public final class r1$n
  implements ScheduledExecutorService
{
  public final ScheduledExecutorService a;
  
  public r1$n(ScheduledExecutorService paramScheduledExecutorService)
  {
    b.y(paramScheduledExecutorService, "delegate");
    a = paramScheduledExecutorService;
  }
  
  public final boolean awaitTermination(long paramLong, TimeUnit paramTimeUnit)
  {
    return a.awaitTermination(paramLong, paramTimeUnit);
  }
  
  public final void execute(Runnable paramRunnable)
  {
    a.execute(paramRunnable);
  }
  
  public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> paramCollection)
  {
    return a.invokeAll(paramCollection);
  }
  
  public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> paramCollection, long paramLong, TimeUnit paramTimeUnit)
  {
    return a.invokeAll(paramCollection, paramLong, paramTimeUnit);
  }
  
  public final <T> T invokeAny(Collection<? extends Callable<T>> paramCollection)
  {
    return (T)a.invokeAny(paramCollection);
  }
  
  public final <T> T invokeAny(Collection<? extends Callable<T>> paramCollection, long paramLong, TimeUnit paramTimeUnit)
  {
    return (T)a.invokeAny(paramCollection, paramLong, paramTimeUnit);
  }
  
  public final boolean isShutdown()
  {
    return a.isShutdown();
  }
  
  public final boolean isTerminated()
  {
    return a.isTerminated();
  }
  
  public final ScheduledFuture<?> schedule(Runnable paramRunnable, long paramLong, TimeUnit paramTimeUnit)
  {
    return a.schedule(paramRunnable, paramLong, paramTimeUnit);
  }
  
  public final <V> ScheduledFuture<V> schedule(Callable<V> paramCallable, long paramLong, TimeUnit paramTimeUnit)
  {
    return a.schedule(paramCallable, paramLong, paramTimeUnit);
  }
  
  public final ScheduledFuture<?> scheduleAtFixedRate(Runnable paramRunnable, long paramLong1, long paramLong2, TimeUnit paramTimeUnit)
  {
    return a.scheduleAtFixedRate(paramRunnable, paramLong1, paramLong2, paramTimeUnit);
  }
  
  public final ScheduledFuture<?> scheduleWithFixedDelay(Runnable paramRunnable, long paramLong1, long paramLong2, TimeUnit paramTimeUnit)
  {
    return a.scheduleWithFixedDelay(paramRunnable, paramLong1, paramLong2, paramTimeUnit);
  }
  
  public final void shutdown()
  {
    throw new UnsupportedOperationException("Restricted: shutdown() is not allowed");
  }
  
  public final List<Runnable> shutdownNow()
  {
    throw new UnsupportedOperationException("Restricted: shutdownNow() is not allowed");
  }
  
  public final Future<?> submit(Runnable paramRunnable)
  {
    return a.submit(paramRunnable);
  }
  
  public final <T> Future<T> submit(Runnable paramRunnable, T paramT)
  {
    return a.submit(paramRunnable, paramT);
  }
  
  public final <T> Future<T> submit(Callable<T> paramCallable)
  {
    return a.submit(paramCallable);
  }
}

/* Location:
 * Qualified Name:     gb.r1.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */