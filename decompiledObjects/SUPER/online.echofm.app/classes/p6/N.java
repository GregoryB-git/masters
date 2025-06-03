package p6;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.Intrinsics;
import l6.d;

public final class N
  extends b0
  implements Runnable
{
  private static volatile Thread _thread;
  private static volatile int debugStatus;
  public static final N w;
  public static final long x;
  
  static
  {
    Object localObject = new N();
    w = (N)localObject;
    a0.N((a0)localObject, false, 1, null);
    TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
    Long localLong;
    try
    {
      localObject = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
    }
    catch (SecurityException localSecurityException)
    {
      localLong = Long.valueOf(1000L);
    }
    x = localTimeUnit.toNanos(localLong.longValue());
  }
  
  public Thread T()
  {
    Thread localThread1 = _thread;
    Thread localThread2 = localThread1;
    if (localThread1 == null) {
      localThread2 = f0();
    }
    return localThread2;
  }
  
  public void X(Runnable paramRunnable)
  {
    if (g0()) {
      j0();
    }
    super.X(paramRunnable);
  }
  
  public final void e0()
  {
    try
    {
      boolean bool = h0();
      if (!bool) {
        return;
      }
      debugStatus = 3;
      c0();
      Intrinsics.c(this, "null cannot be cast to non-null type java.lang.Object");
      notifyAll();
      return;
    }
    finally {}
  }
  
  public final Thread f0()
  {
    try
    {
      Thread localThread1 = _thread;
      Thread localThread2 = localThread1;
      if (localThread1 == null)
      {
        localThread2 = new java/lang/Thread;
        localThread2.<init>(this, "kotlinx.coroutines.DefaultExecutor");
        _thread = localThread2;
        localThread2.setDaemon(true);
        localThread2.start();
      }
    }
    finally
    {
      break label47;
    }
    return localThread3;
    label47:
    throw localThread3;
  }
  
  public final boolean g0()
  {
    boolean bool;
    if (debugStatus == 4) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean h0()
  {
    int i = debugStatus;
    boolean bool;
    if ((i != 2) && (i != 3)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final boolean i0()
  {
    try
    {
      boolean bool = h0();
      if (bool) {
        return false;
      }
      debugStatus = 1;
      Intrinsics.c(this, "null cannot be cast to non-null type java.lang.Object");
      notifyAll();
      return true;
    }
    finally {}
  }
  
  public final void j0()
  {
    throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
  }
  
  public void run()
  {
    L0.a.d(this);
    c.a();
    for (;;)
    {
      boolean bool;
      long l3;
      try
      {
        bool = i0();
        if (!bool)
        {
          _thread = null;
          e0();
          c.a();
          if (!a0()) {
            T();
          }
          return;
        }
        l1 = Long.MAX_VALUE;
        Thread.interrupted();
        l2 = Q();
        if (l2 != Long.MAX_VALUE) {
          break label154;
        }
        c.a();
        l3 = System.nanoTime();
        l4 = l1;
        if (l1 == Long.MAX_VALUE)
        {
          l1 = x;
          l4 = l1 + l3;
        }
      }
      finally
      {
        break;
      }
      long l1 = l4 - l3;
      if (l1 <= 0L)
      {
        _thread = null;
        e0();
        c.a();
        if (!a0()) {
          T();
        }
        return;
      }
      long l2 = d.c(l2, l1);
      break label159;
      label154:
      long l4 = Long.MAX_VALUE;
      label159:
      l1 = l4;
      if (l2 > 0L)
      {
        bool = h0();
        if (bool)
        {
          _thread = null;
          e0();
          c.a();
          if (!a0()) {
            T();
          }
          return;
        }
        c.a();
        LockSupport.parkNanos(this, l2);
        l1 = l4;
      }
    }
    _thread = null;
    e0();
    c.a();
    if (!a0()) {
      T();
    }
    throw ((Throwable)localObject);
  }
  
  public void shutdown()
  {
    debugStatus = 4;
    super.shutdown();
  }
}

/* Location:
 * Qualified Name:     p6.N
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */