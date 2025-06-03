package e1;

import java.util.concurrent.FutureTask;

public final class c$b
  extends FutureTask<Result>
{
  public c$b(c paramc, c.a parama)
  {
    super(parama);
  }
  
  /* Error */
  public final void done()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 30	java/util/concurrent/FutureTask:get	()Ljava/lang/Object;
    //   4: astore_1
    //   5: aload_0
    //   6: getfield 15	e1/c$b:a	Le1/c;
    //   9: astore_2
    //   10: aload_2
    //   11: getfield 34	e1/c:d	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   14: invokevirtual 39	java/util/concurrent/atomic/AtomicBoolean:get	()Z
    //   17: ifne +70 -> 87
    //   20: aload_2
    //   21: aload_1
    //   22: invokevirtual 42	e1/c:d	(Ljava/lang/Object;)V
    //   25: goto +62 -> 87
    //   28: astore_2
    //   29: new 44	java/lang/RuntimeException
    //   32: dup
    //   33: ldc 46
    //   35: aload_2
    //   36: invokespecial 49	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   39: athrow
    //   40: astore_2
    //   41: aload_0
    //   42: getfield 15	e1/c$b:a	Le1/c;
    //   45: astore_2
    //   46: aload_2
    //   47: getfield 34	e1/c:d	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   50: invokevirtual 39	java/util/concurrent/atomic/AtomicBoolean:get	()Z
    //   53: ifne +34 -> 87
    //   56: aload_2
    //   57: aconst_null
    //   58: invokevirtual 42	e1/c:d	(Ljava/lang/Object;)V
    //   61: goto +26 -> 87
    //   64: astore_2
    //   65: new 44	java/lang/RuntimeException
    //   68: dup
    //   69: ldc 46
    //   71: aload_2
    //   72: invokevirtual 55	java/lang/Throwable:getCause	()Ljava/lang/Throwable;
    //   75: invokespecial 49	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   78: athrow
    //   79: astore_2
    //   80: ldc 57
    //   82: aload_2
    //   83: invokestatic 63	android/util/Log:w	(Ljava/lang/String;Ljava/lang/Throwable;)I
    //   86: pop
    //   87: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	88	0	this	b
    //   4	18	1	localObject	Object
    //   9	12	2	localc1	c
    //   28	8	2	localThrowable	Throwable
    //   40	1	2	localCancellationException	java.util.concurrent.CancellationException
    //   45	12	2	localc2	c
    //   64	8	2	localExecutionException	java.util.concurrent.ExecutionException
    //   79	4	2	localInterruptedException	InterruptedException
    // Exception table:
    //   from	to	target	type
    //   0	25	28	finally
    //   0	25	40	java/util/concurrent/CancellationException
    //   0	25	64	java/util/concurrent/ExecutionException
    //   0	25	79	java/lang/InterruptedException
  }
}

/* Location:
 * Qualified Name:     e1.c.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */