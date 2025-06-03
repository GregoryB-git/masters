package R2;

import A2.n;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

public final class K2
  extends Thread
{
  public final Object o;
  public final BlockingQueue p;
  public boolean q = false;
  
  public K2(G2 paramG2, String paramString, BlockingQueue paramBlockingQueue)
  {
    n.i(paramString);
    n.i(paramBlockingQueue);
    o = new Object();
    p = paramBlockingQueue;
    setName(paramString);
  }
  
  public final void a()
  {
    synchronized (o)
    {
      o.notifyAll();
      return;
    }
  }
  
  public final void b(InterruptedException paramInterruptedException)
  {
    a2 locala2 = r.j().L();
    String str = getName();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(str);
    localStringBuilder.append(" was interrupted");
    locala2.b(localStringBuilder.toString(), paramInterruptedException);
  }
  
  public final void c()
  {
    synchronized (G2.E(r))
    {
      if (q) {
        break label105;
      }
      G2.H(r).release();
      G2.E(r).notifyAll();
      if (this == G2.A(r)) {
        G2.C(r, null);
      }
    }
    if (this == G2.u(r)) {
      G2.x(r, null);
    } else {
      r.j().G().a("Current scheduler thread is neither worker nor network");
    }
    q = true;
    label105:
    return;
    throw ((Throwable)localObject2);
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: iload_1
    //   3: ifne +27 -> 30
    //   6: aload_0
    //   7: getfield 16	R2/K2:r	LR2/G2;
    //   10: invokestatic 89	R2/G2:H	(LR2/G2;)Ljava/util/concurrent/Semaphore;
    //   13: invokevirtual 121	java/util/concurrent/Semaphore:acquire	()V
    //   16: iconst_1
    //   17: istore_1
    //   18: goto -16 -> 2
    //   21: astore_2
    //   22: aload_0
    //   23: aload_2
    //   24: invokevirtual 123	R2/K2:b	(Ljava/lang/InterruptedException;)V
    //   27: goto -25 -> 2
    //   30: invokestatic 129	android/os/Process:myTid	()I
    //   33: invokestatic 133	android/os/Process:getThreadPriority	(I)I
    //   36: istore_3
    //   37: aload_0
    //   38: getfield 34	R2/K2:p	Ljava/util/concurrent/BlockingQueue;
    //   41: invokeinterface 139 1 0
    //   46: checkcast 141	R2/L2
    //   49: astore_2
    //   50: aload_2
    //   51: ifnull +33 -> 84
    //   54: aload_2
    //   55: getfield 143	R2/L2:p	Z
    //   58: ifeq +8 -> 66
    //   61: iload_3
    //   62: istore_1
    //   63: goto +6 -> 69
    //   66: bipush 10
    //   68: istore_1
    //   69: iload_1
    //   70: invokestatic 147	android/os/Process:setThreadPriority	(I)V
    //   73: aload_2
    //   74: invokevirtual 151	java/util/concurrent/FutureTask:run	()V
    //   77: goto -40 -> 37
    //   80: astore_2
    //   81: goto +117 -> 198
    //   84: aload_0
    //   85: getfield 32	R2/K2:o	Ljava/lang/Object;
    //   88: astore_2
    //   89: aload_2
    //   90: monitorenter
    //   91: aload_0
    //   92: getfield 34	R2/K2:p	Ljava/util/concurrent/BlockingQueue;
    //   95: invokeinterface 154 1 0
    //   100: ifnonnull +43 -> 143
    //   103: aload_0
    //   104: getfield 16	R2/K2:r	LR2/G2;
    //   107: invokestatic 158	R2/G2:I	(LR2/G2;)Z
    //   110: istore 4
    //   112: iload 4
    //   114: ifne +29 -> 143
    //   117: aload_0
    //   118: getfield 32	R2/K2:o	Ljava/lang/Object;
    //   121: ldc2_w 159
    //   124: invokevirtual 164	java/lang/Object:wait	(J)V
    //   127: goto +16 -> 143
    //   130: astore 5
    //   132: goto +61 -> 193
    //   135: astore 5
    //   137: aload_0
    //   138: aload 5
    //   140: invokevirtual 123	R2/K2:b	(Ljava/lang/InterruptedException;)V
    //   143: aload_2
    //   144: monitorexit
    //   145: aload_0
    //   146: getfield 16	R2/K2:r	LR2/G2;
    //   149: invokestatic 85	R2/G2:E	(LR2/G2;)Ljava/lang/Object;
    //   152: astore_2
    //   153: aload_2
    //   154: monitorenter
    //   155: aload_0
    //   156: getfield 34	R2/K2:p	Ljava/util/concurrent/BlockingQueue;
    //   159: invokeinterface 154 1 0
    //   164: ifnonnull +19 -> 183
    //   167: aload_0
    //   168: invokevirtual 166	R2/K2:c	()V
    //   171: aload_2
    //   172: monitorexit
    //   173: aload_0
    //   174: invokevirtual 166	R2/K2:c	()V
    //   177: return
    //   178: astore 5
    //   180: goto +8 -> 188
    //   183: aload_2
    //   184: monitorexit
    //   185: goto -148 -> 37
    //   188: aload_2
    //   189: monitorexit
    //   190: aload 5
    //   192: athrow
    //   193: aload_2
    //   194: monitorexit
    //   195: aload 5
    //   197: athrow
    //   198: aload_0
    //   199: invokevirtual 166	R2/K2:c	()V
    //   202: aload_2
    //   203: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	204	0	this	K2
    //   1	69	1	i	int
    //   21	3	2	localInterruptedException1	InterruptedException
    //   49	25	2	localL2	L2
    //   80	1	2	localObject1	Object
    //   36	26	3	j	int
    //   110	3	4	bool	boolean
    //   130	1	5	localObject3	Object
    //   135	4	5	localInterruptedException2	InterruptedException
    //   178	18	5	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   6	16	21	java/lang/InterruptedException
    //   30	37	80	finally
    //   37	50	80	finally
    //   54	61	80	finally
    //   69	77	80	finally
    //   84	91	80	finally
    //   145	155	80	finally
    //   190	193	80	finally
    //   195	198	80	finally
    //   91	112	130	finally
    //   117	127	130	finally
    //   137	143	130	finally
    //   143	145	130	finally
    //   193	195	130	finally
    //   117	127	135	java/lang/InterruptedException
    //   155	173	178	finally
    //   183	185	178	finally
    //   188	190	178	finally
  }
}

/* Location:
 * Qualified Name:     R2.K2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */