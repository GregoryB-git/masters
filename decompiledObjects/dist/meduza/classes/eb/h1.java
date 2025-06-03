package eb;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import x6.b;

public final class h1
  implements Executor
{
  public final Thread.UncaughtExceptionHandler a;
  public final ConcurrentLinkedQueue b = new ConcurrentLinkedQueue();
  public final AtomicReference<Thread> c = new AtomicReference();
  
  public h1(Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler)
  {
    a = paramUncaughtExceptionHandler;
  }
  
  /* Error */
  public final void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 34	eb/h1:c	Ljava/util/concurrent/atomic/AtomicReference;
    //   4: astore_1
    //   5: invokestatic 43	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   8: astore_2
    //   9: aload_1
    //   10: aconst_null
    //   11: aload_2
    //   12: invokevirtual 47	java/util/concurrent/atomic/AtomicReference:compareAndSet	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   15: ifeq +8 -> 23
    //   18: iconst_1
    //   19: istore_3
    //   20: goto +12 -> 32
    //   23: aload_1
    //   24: invokevirtual 51	java/util/concurrent/atomic/AtomicReference:get	()Ljava/lang/Object;
    //   27: ifnull -18 -> 9
    //   30: iconst_0
    //   31: istore_3
    //   32: iload_3
    //   33: ifne +4 -> 37
    //   36: return
    //   37: aload_0
    //   38: getfield 29	eb/h1:b	Ljava/util/concurrent/ConcurrentLinkedQueue;
    //   41: invokevirtual 54	java/util/concurrent/ConcurrentLinkedQueue:poll	()Ljava/lang/Object;
    //   44: checkcast 56	java/lang/Runnable
    //   47: astore_1
    //   48: aload_1
    //   49: ifnull +29 -> 78
    //   52: aload_1
    //   53: invokeinterface 59 1 0
    //   58: goto -21 -> 37
    //   61: astore_1
    //   62: aload_0
    //   63: getfield 36	eb/h1:a	Ljava/lang/Thread$UncaughtExceptionHandler;
    //   66: invokestatic 43	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   69: aload_1
    //   70: invokeinterface 65 3 0
    //   75: goto -38 -> 37
    //   78: aload_0
    //   79: getfield 34	eb/h1:c	Ljava/util/concurrent/atomic/AtomicReference;
    //   82: aconst_null
    //   83: invokevirtual 69	java/util/concurrent/atomic/AtomicReference:set	(Ljava/lang/Object;)V
    //   86: aload_0
    //   87: getfield 29	eb/h1:b	Ljava/util/concurrent/ConcurrentLinkedQueue;
    //   90: invokevirtual 73	java/util/concurrent/ConcurrentLinkedQueue:isEmpty	()Z
    //   93: ifeq -93 -> 0
    //   96: return
    //   97: astore_1
    //   98: aload_0
    //   99: getfield 34	eb/h1:c	Ljava/util/concurrent/atomic/AtomicReference;
    //   102: aconst_null
    //   103: invokevirtual 69	java/util/concurrent/atomic/AtomicReference:set	(Ljava/lang/Object;)V
    //   106: aload_1
    //   107: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	108	0	this	h1
    //   4	49	1	localObject1	Object
    //   61	9	1	localThrowable	Throwable
    //   97	10	1	localObject2	Object
    //   8	4	2	localThread	Thread
    //   19	14	3	i	int
    // Exception table:
    //   from	to	target	type
    //   52	58	61	finally
    //   37	48	97	finally
    //   62	75	97	finally
  }
  
  public final void b(Runnable paramRunnable)
  {
    ConcurrentLinkedQueue localConcurrentLinkedQueue = b;
    b.y(paramRunnable, "runnable is null");
    localConcurrentLinkedQueue.add(paramRunnable);
  }
  
  public final c c(final Runnable paramRunnable, long paramLong, TimeUnit paramTimeUnit, ScheduledExecutorService paramScheduledExecutorService)
  {
    final b localb = new b(paramRunnable);
    return new c(localb, paramScheduledExecutorService.schedule(new a(localb, paramRunnable), paramLong, paramTimeUnit));
  }
  
  public final void d()
  {
    boolean bool;
    if (Thread.currentThread() == c.get()) {
      bool = true;
    } else {
      bool = false;
    }
    b.I(bool, "Not called from the SynchronizationContext");
  }
  
  public final void execute(Runnable paramRunnable)
  {
    b(paramRunnable);
    a();
  }
  
  public final class a
    implements Runnable
  {
    public a(h1.b paramb, Runnable paramRunnable) {}
    
    public final void run()
    {
      execute(localb);
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramRunnable.toString());
      localStringBuilder.append("(scheduled in SynchronizationContext)");
      return localStringBuilder.toString();
    }
  }
  
  public static final class b
    implements Runnable
  {
    public final Runnable a;
    public boolean b;
    public boolean c;
    
    public b(Runnable paramRunnable)
    {
      a = paramRunnable;
    }
    
    public final void run()
    {
      if (!b)
      {
        c = true;
        a.run();
      }
    }
  }
  
  public static final class c
  {
    public final h1.b a;
    public final ScheduledFuture<?> b;
    
    public c(h1.b paramb, ScheduledFuture paramScheduledFuture)
    {
      a = paramb;
      b.y(paramScheduledFuture, "future");
      b = paramScheduledFuture;
    }
    
    public final void a()
    {
      a.b = true;
      b.cancel(false);
    }
  }
}

/* Location:
 * Qualified Name:     eb.h1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */