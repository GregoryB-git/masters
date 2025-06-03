package p6;

import X5.g;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

public final class h0
  extends g0
  implements S
{
  public final Executor r;
  
  public h0(Executor paramExecutor)
  {
    r = paramExecutor;
    u6.c.a(I());
  }
  
  public void E(g paramg, Runnable paramRunnable)
  {
    try
    {
      Executor localExecutor = I();
      c.a();
      localExecutor.execute(paramRunnable);
    }
    catch (RejectedExecutionException localRejectedExecutionException)
    {
      c.a();
      H(paramg, localRejectedExecutionException);
      W.b().E(paramg, paramRunnable);
    }
  }
  
  public final void H(g paramg, RejectedExecutionException paramRejectedExecutionException)
  {
    u0.c(paramg, f0.a("The task was rejected", paramRejectedExecutionException));
  }
  
  public Executor I()
  {
    return r;
  }
  
  public void close()
  {
    Object localObject = I();
    if ((localObject instanceof ExecutorService)) {
      localObject = (ExecutorService)localObject;
    } else {
      localObject = null;
    }
    if (localObject != null) {
      ((ExecutorService)localObject).shutdown();
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    if (((paramObject instanceof h0)) && (((h0)paramObject).I() == I())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    return System.identityHashCode(I());
  }
  
  public String toString()
  {
    return I().toString();
  }
}

/* Location:
 * Qualified Name:     p6.h0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */