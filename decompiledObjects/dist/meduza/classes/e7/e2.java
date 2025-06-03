package e7;

import d2.q;
import java.util.AbstractCollection;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import m6.j;

public final class e2
  extends d3
{
  public static final AtomicLong t = new AtomicLong(Long.MIN_VALUE);
  public h2 d;
  public h2 e;
  public final PriorityBlockingQueue<i2<?>> f = new PriorityBlockingQueue();
  public final LinkedBlockingQueue o = new LinkedBlockingQueue();
  public final g2 p = new g2(this, "Thread death: Uncaught exception on worker thread");
  public final g2 q = new g2(this, "Thread death: Uncaught exception on network thread");
  public final Object r = new Object();
  public final Semaphore s = new Semaphore(2);
  
  public e2(j2 paramj2)
  {
    super(paramj2);
  }
  
  public final void l()
  {
    if (Thread.currentThread() == d) {
      return;
    }
    throw new IllegalStateException("Call expected from worker thread");
  }
  
  public final boolean o()
  {
    return false;
  }
  
  public final i2 p(Callable paramCallable)
  {
    m();
    paramCallable = new i2(this, paramCallable, false);
    if (Thread.currentThread() == d)
    {
      if (!f.isEmpty()) {
        zzjr.b("Callable skipped the worker queue.");
      }
      paramCallable.run();
    }
    else
    {
      r(paramCallable);
    }
    return paramCallable;
  }
  
  /* Error */
  public final <T> T q(java.util.concurrent.atomic.AtomicReference<T> paramAtomicReference, long paramLong, String paramString, Runnable paramRunnable)
  {
    // Byte code:
    //   0: aload_1
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual 137	d2/q:zzl	()Le7/e2;
    //   6: aload 5
    //   8: invokevirtual 141	e7/e2:u	(Ljava/lang/Runnable;)V
    //   11: aload_1
    //   12: lload_2
    //   13: invokevirtual 144	java/lang/Object:wait	(J)V
    //   16: aload_1
    //   17: monitorexit
    //   18: aload_1
    //   19: invokevirtual 150	java/util/concurrent/atomic/AtomicReference:get	()Ljava/lang/Object;
    //   22: astore 6
    //   24: aload 6
    //   26: ifnonnull +38 -> 64
    //   29: aload_0
    //   30: invokevirtual 110	d2/q:zzj	()Le7/a1;
    //   33: getfield 115	e7/a1:r	Le7/b1;
    //   36: astore 5
    //   38: new 152	java/lang/StringBuilder
    //   41: dup
    //   42: ldc -102
    //   44: invokespecial 155	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   47: astore_1
    //   48: aload_1
    //   49: aload 4
    //   51: invokevirtual 159	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: pop
    //   55: aload 5
    //   57: aload_1
    //   58: invokevirtual 163	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   61: invokevirtual 122	e7/b1:b	(Ljava/lang/String;)V
    //   64: aload 6
    //   66: areturn
    //   67: astore 5
    //   69: aload_0
    //   70: invokevirtual 110	d2/q:zzj	()Le7/a1;
    //   73: getfield 115	e7/a1:r	Le7/b1;
    //   76: astore 6
    //   78: new 152	java/lang/StringBuilder
    //   81: astore 5
    //   83: aload 5
    //   85: ldc -91
    //   87: invokespecial 155	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   90: aload 5
    //   92: aload 4
    //   94: invokevirtual 159	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   97: pop
    //   98: aload 6
    //   100: aload 5
    //   102: invokevirtual 163	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   105: invokevirtual 122	e7/b1:b	(Ljava/lang/String;)V
    //   108: aload_1
    //   109: monitorexit
    //   110: aconst_null
    //   111: areturn
    //   112: astore 4
    //   114: aload_1
    //   115: monitorexit
    //   116: aload 4
    //   118: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	119	0	this	e2
    //   0	119	1	paramAtomicReference	java.util.concurrent.atomic.AtomicReference<T>
    //   0	119	2	paramLong	long
    //   0	119	4	paramString	String
    //   0	119	5	paramRunnable	Runnable
    //   22	77	6	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   11	16	67	java/lang/InterruptedException
    //   2	11	112	finally
    //   11	16	112	finally
    //   16	18	112	finally
    //   69	110	112	finally
    //   114	116	112	finally
  }
  
  public final void r(i2<?> arg1)
  {
    synchronized (r)
    {
      f.add(???);
      h2 localh2 = d;
      if (localh2 == null)
      {
        ??? = new e7/h2;
        ???.<init>(this, "Measurement Worker", f);
        d = ???;
        ???.setUncaughtExceptionHandler(p);
        d.start();
      }
      synchronized (a)
      {
        a.notifyAll();
        return;
      }
    }
  }
  
  public final void s(Runnable arg1)
  {
    m();
    ??? = new i2(this, ???, false, "Task exception on network thread");
    synchronized (r)
    {
      o.add(???);
      h2 localh2 = e;
      if (localh2 == null)
      {
        ??? = new e7/h2;
        ((h2)???).<init>(this, "Measurement Network", o);
        e = ((h2)???);
        ((Thread)???).setUncaughtExceptionHandler(q);
        e.start();
      }
      synchronized (a)
      {
        a.notifyAll();
        return;
      }
    }
  }
  
  public final i2 t(Callable paramCallable)
  {
    m();
    paramCallable = new i2(this, paramCallable, true);
    if (Thread.currentThread() == d) {
      paramCallable.run();
    } else {
      r(paramCallable);
    }
    return paramCallable;
  }
  
  public final void u(Runnable paramRunnable)
  {
    m();
    j.i(paramRunnable);
    r(new i2(this, paramRunnable, false, "Task exception on worker thread"));
  }
  
  public final void v(Runnable paramRunnable)
  {
    m();
    r(new i2(this, paramRunnable, true, "Task exception on worker thread"));
  }
  
  public final boolean w()
  {
    return Thread.currentThread() == d;
  }
  
  public final void x()
  {
    if (Thread.currentThread() == e) {
      return;
    }
    throw new IllegalStateException("Call expected from network thread");
  }
}

/* Location:
 * Qualified Name:     e7.e2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */