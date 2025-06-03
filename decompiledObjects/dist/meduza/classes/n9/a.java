package n9;

import android.os.Handler;
import android.os.Looper;
import b.d;
import b.m;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p2.m0;
import x0.q0;
import y2.h;

public final class a
{
  public final b a = new b();
  public final ArrayList<a> b = new ArrayList();
  public final ArrayList<c> c = new ArrayList();
  
  public final Task<Void> a(Runnable paramRunnable)
  {
    paramRunnable = new h(paramRunnable, 2);
    return a.a(paramRunnable);
  }
  
  public final a b(c paramc, long paramLong, Runnable paramRunnable)
  {
    if (c.contains(paramc)) {
      paramLong = 0L;
    }
    System.currentTimeMillis();
    a locala = new a(paramRunnable);
    paramRunnable = a;
    m localm = new m(locala, 17);
    paramc = TimeUnit.MILLISECONDS;
    try
    {
      if (!b) {
        paramc = a.schedule(localm, paramLong, paramc);
      } else {
        paramc = null;
      }
      b = paramc;
      b.add(locala);
      return locala;
    }
    finally {}
  }
  
  public final void c(Throwable paramThrowable)
  {
    a.a.shutdownNow();
    new Handler(Looper.getMainLooper()).post(new d(paramThrowable, 18));
  }
  
  public final void d()
  {
    Thread localThread1 = Thread.currentThread();
    Thread localThread2 = a.c;
    if (localThread2 == localThread1) {
      return;
    }
    x6.b.T("We are running on the wrong thread. Expected to be on the AsyncQueue thread %s/%d but was %s/%d", new Object[] { localThread2.getName(), Long.valueOf(a.c.getId()), localThread1.getName(), Long.valueOf(localThread1.getId()) });
    throw null;
  }
  
  public final class a
  {
    public final Runnable a;
    public ScheduledFuture b;
    
    public a(Runnable paramRunnable)
    {
      a = paramRunnable;
    }
    
    public final void a()
    {
      d();
      ScheduledFuture localScheduledFuture = b;
      if (localScheduledFuture != null)
      {
        localScheduledFuture.cancel(false);
        b();
      }
    }
    
    public final void b()
    {
      boolean bool;
      if (b != null) {
        bool = true;
      } else {
        bool = false;
      }
      x6.b.Z("Caller should have verified scheduledFuture is non-null.", bool, new Object[0]);
      b = null;
      x6.b.Z("Delayed task not found.", b.remove(this), new Object[0]);
    }
  }
  
  public final class b
    implements Executor
  {
    public final a a;
    public boolean b;
    public final Thread c;
    
    public b()
    {
      this$1 = new b();
      Thread localThread = Executors.defaultThreadFactory().newThread(a.this);
      c = localThread;
      localThread.setName("FirestoreWorker");
      localThread.setDaemon(true);
      localThread.setUncaughtExceptionHandler(new b(this));
      this$1 = new a(a.this);
      a = a.this;
      setKeepAliveTime(3L, TimeUnit.SECONDS);
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
          c(localThrowable);
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
  
  public static enum c
  {
    static
    {
      c localc1 = new c("ALL", 0);
      c localc2 = new c("LISTEN_STREAM_IDLE", 1);
      a = localc2;
      c localc3 = new c("LISTEN_STREAM_CONNECTION_BACKOFF", 2);
      b = localc3;
      c localc4 = new c("WRITE_STREAM_IDLE", 3);
      c = localc4;
      c localc5 = new c("WRITE_STREAM_CONNECTION_BACKOFF", 4);
      d = localc5;
      c localc6 = new c("HEALTH_CHECK_TIMEOUT", 5);
      e = localc6;
      c localc7 = new c("ONLINE_STATE_TIMEOUT", 6);
      f = localc7;
      c localc8 = new c("GARBAGE_COLLECTION", 7);
      o = localc8;
      c localc9 = new c("RETRY_TRANSACTION", 8);
      p = localc9;
      c localc10 = new c("CONNECTIVITY_ATTEMPT_TIMER", 9);
      q = localc10;
      c localc11 = new c("INDEX_BACKFILL", 10);
      r = localc11;
      s = new c[] { localc1, localc2, localc3, localc4, localc5, localc6, localc7, localc8, localc9, localc10, localc11 };
    }
    
    public c() {}
  }
}

/* Location:
 * Qualified Name:     n9.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */