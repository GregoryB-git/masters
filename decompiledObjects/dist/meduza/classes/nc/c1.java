package nc;

import i6.p;
import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p2.m0;

public final class c1
  extends b1
  implements l0
{
  public final Executor c;
  
  public c1(Executor paramExecutor)
  {
    c = paramExecutor;
    Method localMethod = sc.b.a;
    try
    {
      if ((paramExecutor instanceof ScheduledThreadPoolExecutor)) {
        paramExecutor = (ScheduledThreadPoolExecutor)paramExecutor;
      } else {
        paramExecutor = null;
      }
      if (paramExecutor != null)
      {
        localMethod = sc.b.a;
        if (localMethod != null) {
          localMethod.invoke(paramExecutor, new Object[] { Boolean.TRUE });
        }
      }
      return;
    }
    finally
    {
      for (;;) {}
    }
  }
  
  public final void close()
  {
    Object localObject = c;
    if ((localObject instanceof ExecutorService)) {
      localObject = (ExecutorService)localObject;
    } else {
      localObject = null;
    }
    if (localObject != null) {
      ((ExecutorService)localObject).shutdown();
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool;
    if (((paramObject instanceof c1)) && (c == c)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void f(long paramLong, l paraml)
  {
    Object localObject1 = c;
    boolean bool = localObject1 instanceof ScheduledExecutorService;
    Object localObject2 = null;
    if (bool) {
      localObject1 = (ScheduledExecutorService)localObject1;
    } else {
      localObject1 = null;
    }
    Object localObject3 = localObject2;
    Object localObject4;
    if (localObject1 != null)
    {
      localObject3 = new p(9, this, paraml);
      ub.h localh = e;
      try
      {
        localObject3 = ((ScheduledExecutorService)localObject1).schedule((Runnable)localObject3, paramLong, TimeUnit.MILLISECONDS);
      }
      catch (RejectedExecutionException localRejectedExecutionException)
      {
        localObject1 = new CancellationException("The task was rejected");
        ((Throwable)localObject1).initCause(localRejectedExecutionException);
        m0.l(localh, (CancellationException)localObject1);
        localObject4 = localObject2;
      }
    }
    if (localObject4 != null)
    {
      paraml.v(new h(localObject4, 0));
      return;
    }
    h0.r.f(paramLong, paraml);
  }
  
  public final int hashCode()
  {
    return System.identityHashCode(c);
  }
  
  public final t0 q0(long paramLong, e2 parame2, ub.h paramh)
  {
    Object localObject1 = c;
    boolean bool = localObject1 instanceof ScheduledExecutorService;
    Object localObject3 = null;
    Object localObject4;
    if (bool) {
      localObject4 = (ScheduledExecutorService)localObject1;
    } else {
      localObject4 = null;
    }
    localObject1 = localObject3;
    Object localObject2;
    if (localObject4 != null) {
      try
      {
        localObject1 = ((ScheduledExecutorService)localObject4).schedule(parame2, paramLong, TimeUnit.MILLISECONDS);
      }
      catch (RejectedExecutionException localRejectedExecutionException)
      {
        localObject4 = new CancellationException("The task was rejected");
        ((Throwable)localObject4).initCause(localRejectedExecutionException);
        m0.l(paramh, (CancellationException)localObject4);
        localObject2 = localObject3;
      }
    }
    if (localObject2 != null) {
      parame2 = new s0((ScheduledFuture)localObject2);
    } else {
      parame2 = h0.r.q0(paramLong, parame2, paramh);
    }
    return parame2;
  }
  
  public final String toString()
  {
    return c.toString();
  }
  
  public final void z0(ub.h paramh, Runnable paramRunnable)
  {
    try
    {
      c.execute(paramRunnable);
    }
    catch (RejectedExecutionException localRejectedExecutionException)
    {
      CancellationException localCancellationException = new CancellationException("The task was rejected");
      localCancellationException.initCause(localRejectedExecutionException);
      m0.l(paramh, localCancellationException);
      r0.b.z0(paramh, paramRunnable);
    }
  }
}

/* Location:
 * Qualified Name:     nc.c1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */