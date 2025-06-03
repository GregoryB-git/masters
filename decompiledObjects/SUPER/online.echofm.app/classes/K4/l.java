package K4;

import F4.a;
import M4.k;
import M4.o;
import N4.b;
import N4.b.b;
import com.google.protobuf.r.a;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class l
{
  public static final a f = ;
  public final ScheduledExecutorService a;
  public final ConcurrentLinkedQueue b;
  public final Runtime c;
  public ScheduledFuture d = null;
  public long e = -1L;
  
  public l()
  {
    this(Executors.newSingleThreadScheduledExecutor(), Runtime.getRuntime());
  }
  
  public l(ScheduledExecutorService paramScheduledExecutorService, Runtime paramRuntime)
  {
    a = paramScheduledExecutorService;
    b = new ConcurrentLinkedQueue();
    c = paramRuntime;
  }
  
  public static boolean e(long paramLong)
  {
    boolean bool;
    if (paramLong <= 0L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void c(M4.l paraml)
  {
    h(paraml);
  }
  
  public final int d()
  {
    return o.c(k.t.c(c.totalMemory() - c.freeMemory()));
  }
  
  /* Error */
  public final void h(M4.l paraml)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 52	K4/l:a	Ljava/util/concurrent/ScheduledExecutorService;
    //   6: astore_2
    //   7: new 104	K4/k
    //   10: astore_3
    //   11: aload_3
    //   12: aload_0
    //   13: aload_1
    //   14: invokespecial 106	K4/k:<init>	(LK4/l;LM4/l;)V
    //   17: aload_2
    //   18: aload_3
    //   19: lconst_0
    //   20: getstatic 112	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   23: invokeinterface 118 5 0
    //   28: pop
    //   29: goto +44 -> 73
    //   32: astore_1
    //   33: goto +43 -> 76
    //   36: astore_1
    //   37: getstatic 25	K4/l:f	LF4/a;
    //   40: astore_3
    //   41: new 120	java/lang/StringBuilder
    //   44: astore_2
    //   45: aload_2
    //   46: invokespecial 121	java/lang/StringBuilder:<init>	()V
    //   49: aload_2
    //   50: ldc 123
    //   52: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   55: pop
    //   56: aload_2
    //   57: aload_1
    //   58: invokevirtual 133	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   61: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   64: pop
    //   65: aload_3
    //   66: aload_2
    //   67: invokevirtual 136	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   70: invokevirtual 140	F4/a:j	(Ljava/lang/String;)V
    //   73: aload_0
    //   74: monitorexit
    //   75: return
    //   76: aload_0
    //   77: monitorexit
    //   78: aload_1
    //   79: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	80	0	this	l
    //   0	80	1	paraml	M4.l
    //   6	61	2	localObject1	Object
    //   10	56	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   2	29	32	finally
    //   37	73	32	finally
    //   2	29	36	java/util/concurrent/RejectedExecutionException
  }
  
  public final void i(long paramLong, M4.l paraml)
  {
    try
    {
      e = paramLong;
    }
    finally
    {
      try
      {
        ScheduledExecutorService localScheduledExecutorService = a;
        localObject = new K4/j;
        ((j)localObject).<init>(this, paraml);
        d = localScheduledExecutorService.scheduleAtFixedRate((Runnable)localObject, 0L, paramLong, TimeUnit.MILLISECONDS);
      }
      catch (RejectedExecutionException localRejectedExecutionException)
      {
        paraml = f;
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        ((StringBuilder)localObject).append("Unable to start collecting Memory Metrics: ");
        ((StringBuilder)localObject).append(localRejectedExecutionException.getMessage());
        paraml.j(((StringBuilder)localObject).toString());
        return;
      }
      paraml = finally;
    }
    throw paraml;
  }
  
  public void j(long paramLong, M4.l paraml)
  {
    if (e(paramLong)) {
      return;
    }
    if (d != null)
    {
      if (e != paramLong)
      {
        k();
        i(paramLong, paraml);
      }
      return;
    }
    i(paramLong, paraml);
  }
  
  public void k()
  {
    ScheduledFuture localScheduledFuture = d;
    if (localScheduledFuture == null) {
      return;
    }
    localScheduledFuture.cancel(false);
    d = null;
    e = -1L;
  }
  
  public final b l(M4.l paraml)
  {
    if (paraml == null) {
      return null;
    }
    long l = paraml.b();
    return (b)b.W().D(l).E(d()).v();
  }
}

/* Location:
 * Qualified Name:     K4.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */