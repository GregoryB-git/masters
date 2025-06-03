package R2;

import A2.n;
import java.util.AbstractCollection;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;

public final class G2
  extends l3
{
  public static final AtomicLong l = new AtomicLong(Long.MIN_VALUE);
  public K2 c;
  public K2 d;
  public final PriorityBlockingQueue e = new PriorityBlockingQueue();
  public final BlockingQueue f = new LinkedBlockingQueue();
  public final Thread.UncaughtExceptionHandler g = new J2(this, "Thread death: Uncaught exception on worker thread");
  public final Thread.UncaughtExceptionHandler h = new J2(this, "Thread death: Uncaught exception on network thread");
  public final Object i = new Object();
  public final Semaphore j = new Semaphore(2);
  public volatile boolean k;
  
  public G2(N2 paramN2)
  {
    super(paramN2);
  }
  
  public final Future B(Callable paramCallable)
  {
    o();
    n.i(paramCallable);
    paramCallable = new L2(this, paramCallable, true, "Task exception on worker thread");
    if (Thread.currentThread() == c) {
      paramCallable.run();
    } else {
      y(paramCallable);
    }
    return paramCallable;
  }
  
  public final void D(Runnable paramRunnable)
  {
    o();
    n.i(paramRunnable);
    y(new L2(this, paramRunnable, false, "Task exception on worker thread"));
  }
  
  public final void G(Runnable paramRunnable)
  {
    o();
    n.i(paramRunnable);
    y(new L2(this, paramRunnable, true, "Task exception on worker thread"));
  }
  
  public final boolean J()
  {
    return Thread.currentThread() == c;
  }
  
  public final void l()
  {
    if (Thread.currentThread() == d) {
      return;
    }
    throw new IllegalStateException("Call expected from network thread");
  }
  
  public final void n()
  {
    if (Thread.currentThread() == c) {
      return;
    }
    throw new IllegalStateException("Call expected from worker thread");
  }
  
  public final boolean s()
  {
    return false;
  }
  
  /* Error */
  public final Object v(java.util.concurrent.atomic.AtomicReference paramAtomicReference, long paramLong, String paramString, Runnable paramRunnable)
  {
    // Byte code:
    //   0: aload_1
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual 150	R2/m3:e	()LR2/G2;
    //   6: aload 5
    //   8: invokevirtual 188	R2/G2:D	(Ljava/lang/Runnable;)V
    //   11: aload_1
    //   12: lload_2
    //   13: invokevirtual 191	java/lang/Object:wait	(J)V
    //   16: aload_1
    //   17: monitorexit
    //   18: aload_1
    //   19: invokevirtual 197	java/util/concurrent/atomic/AtomicReference:get	()Ljava/lang/Object;
    //   22: astore 6
    //   24: aload 6
    //   26: ifnonnull +39 -> 65
    //   29: aload_0
    //   30: invokevirtual 165	R2/m3:j	()LR2/Y1;
    //   33: invokevirtual 203	R2/Y1:L	()LR2/a2;
    //   36: astore_1
    //   37: new 205	java/lang/StringBuilder
    //   40: dup
    //   41: ldc -49
    //   43: invokespecial 208	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   46: astore 5
    //   48: aload 5
    //   50: aload 4
    //   52: invokevirtual 212	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   55: pop
    //   56: aload_1
    //   57: aload 5
    //   59: invokevirtual 216	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   62: invokevirtual 220	R2/a2:a	(Ljava/lang/String;)V
    //   65: aload 6
    //   67: areturn
    //   68: astore 4
    //   70: goto +48 -> 118
    //   73: astore 5
    //   75: aload_0
    //   76: invokevirtual 165	R2/m3:j	()LR2/Y1;
    //   79: invokevirtual 203	R2/Y1:L	()LR2/a2;
    //   82: astore 6
    //   84: new 205	java/lang/StringBuilder
    //   87: astore 5
    //   89: aload 5
    //   91: ldc -34
    //   93: invokespecial 208	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   96: aload 5
    //   98: aload 4
    //   100: invokevirtual 212	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: pop
    //   104: aload 6
    //   106: aload 5
    //   108: invokevirtual 216	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   111: invokevirtual 220	R2/a2:a	(Ljava/lang/String;)V
    //   114: aload_1
    //   115: monitorexit
    //   116: aconst_null
    //   117: areturn
    //   118: aload_1
    //   119: monitorexit
    //   120: aload 4
    //   122: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	123	0	this	G2
    //   0	123	1	paramAtomicReference	java.util.concurrent.atomic.AtomicReference
    //   0	123	2	paramLong	long
    //   0	123	4	paramString	String
    //   0	123	5	paramRunnable	Runnable
    //   22	83	6	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	11	68	finally
    //   11	16	68	finally
    //   16	18	68	finally
    //   75	116	68	finally
    //   118	120	68	finally
    //   11	16	73	java/lang/InterruptedException
  }
  
  public final Future w(Callable paramCallable)
  {
    o();
    n.i(paramCallable);
    paramCallable = new L2(this, paramCallable, false, "Task exception on worker thread");
    if (Thread.currentThread() == c)
    {
      if (!e.isEmpty()) {
        j().L().a("Callable skipped the worker queue.");
      }
      paramCallable.run();
    }
    else
    {
      y(paramCallable);
    }
    return paramCallable;
  }
  
  public final void y(L2 paramL2)
  {
    synchronized (i)
    {
      e.add(paramL2);
      paramL2 = c;
      if (paramL2 == null)
      {
        paramL2 = new R2/K2;
        paramL2.<init>(this, "Measurement Worker", e);
        c = paramL2;
        paramL2.setUncaughtExceptionHandler(g);
        c.start();
      }
    }
    paramL2.a();
  }
  
  public final void z(Runnable arg1)
  {
    o();
    n.i(???);
    Object localObject1 = new L2(this, ???, false, "Task exception on network thread");
    synchronized (i)
    {
      f.add(localObject1);
      localObject1 = d;
      if (localObject1 == null)
      {
        localObject1 = new R2/K2;
        ((K2)localObject1).<init>(this, "Measurement Network", f);
        d = ((K2)localObject1);
        ((Thread)localObject1).setUncaughtExceptionHandler(h);
        d.start();
      }
    }
    ((K2)localObject2).a();
    return;
    throw ((Throwable)localObject2);
  }
}

/* Location:
 * Qualified Name:     R2.G2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */