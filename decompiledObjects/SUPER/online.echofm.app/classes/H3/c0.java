package H3;

import V2.j;
import V2.k;
import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class c0
{
  public static final ExecutorService a = A.c("awaitEvenIfOnMainThread task continuation executor");
  
  public static Object f(j paramj)
  {
    CountDownLatch localCountDownLatch = new CountDownLatch(1);
    paramj.g(a, new X(localCountDownLatch));
    if (Looper.getMainLooper() == Looper.myLooper()) {}
    for (long l = 3L;; l = 4L)
    {
      localCountDownLatch.await(l, TimeUnit.SECONDS);
      break;
    }
    if (paramj.n()) {
      return paramj.j();
    }
    if (!paramj.l())
    {
      if (paramj.m()) {
        throw new IllegalStateException(paramj.i());
      }
      throw new TimeoutException();
    }
    throw new CancellationException("Task is already canceled");
  }
  
  public static boolean g(CountDownLatch paramCountDownLatch, long paramLong, TimeUnit paramTimeUnit)
  {
    int i = 0;
    j = 0;
    k = i;
    try
    {
      l1 = paramTimeUnit.toNanos(paramLong);
      k = i;
      l2 = System.nanoTime();
      paramLong = l1;
    }
    finally
    {
      for (;;)
      {
        try
        {
          boolean bool = paramCountDownLatch.await(paramLong, TimeUnit.NANOSECONDS);
          if (j != 0) {
            Thread.currentThread().interrupt();
          }
          return bool;
        }
        catch (InterruptedException paramTimeUnit)
        {
          long l1;
          long l2;
          k = 1;
          j = 1;
          paramLong = System.nanoTime();
          paramLong = l2 + l1 - paramLong;
        }
        paramCountDownLatch = finally;
        break;
      }
      if (k == 0) {
        break label94;
      }
      Thread.currentThread().interrupt();
    }
    k = j;
  }
  
  public static j h(Executor paramExecutor, Callable paramCallable)
  {
    k localk = new k();
    paramExecutor.execute(new Y(paramCallable, paramExecutor, localk));
    return localk.a();
  }
  
  public static j n(j paramj1, j paramj2)
  {
    k localk = new k();
    a0 locala0 = new a0(localk);
    paramj1.f(locala0);
    paramj2.f(locala0);
    return localk.a();
  }
  
  public static j o(Executor paramExecutor, j paramj1, j paramj2)
  {
    k localk = new k();
    Z localZ = new Z(localk);
    paramj1.g(paramExecutor, localZ);
    paramj2.g(paramExecutor, localZ);
    return localk.a();
  }
}

/* Location:
 * Qualified Name:     H3.c0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */