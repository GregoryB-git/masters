package gb;

import java.util.concurrent.Executor;

public final class i3
  implements Runnable
{
  public i3(h3 paramh3, h3.b paramb, h3.c paramc, Executor paramExecutor) {}
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 18	gb/i3:d	Lgb/h3;
    //   4: astore_1
    //   5: aload_1
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 20	gb/i3:a	Lgb/h3$b;
    //   11: getfield 34	gb/h3$b:b	I
    //   14: istore_2
    //   15: iload_2
    //   16: ifne +118 -> 134
    //   19: aload_0
    //   20: getfield 22	gb/i3:b	Lgb/h3$c;
    //   23: aload_0
    //   24: getfield 24	gb/i3:c	Ljava/lang/Object;
    //   27: invokeinterface 39 2 0
    //   32: aload_0
    //   33: getfield 18	gb/i3:d	Lgb/h3;
    //   36: getfield 44	gb/h3:a	Ljava/util/IdentityHashMap;
    //   39: aload_0
    //   40: getfield 22	gb/i3:b	Lgb/h3$c;
    //   43: invokevirtual 50	java/util/IdentityHashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   46: pop
    //   47: aload_0
    //   48: getfield 18	gb/i3:d	Lgb/h3;
    //   51: getfield 44	gb/h3:a	Ljava/util/IdentityHashMap;
    //   54: invokevirtual 54	java/util/IdentityHashMap:isEmpty	()Z
    //   57: ifeq +77 -> 134
    //   60: aload_0
    //   61: getfield 18	gb/i3:d	Lgb/h3;
    //   64: getfield 57	gb/h3:c	Ljava/util/concurrent/ScheduledExecutorService;
    //   67: invokeinterface 62 1 0
    //   72: aload_0
    //   73: getfield 18	gb/i3:d	Lgb/h3;
    //   76: aconst_null
    //   77: putfield 57	gb/h3:c	Ljava/util/concurrent/ScheduledExecutorService;
    //   80: goto +54 -> 134
    //   83: astore_3
    //   84: aload_0
    //   85: getfield 18	gb/i3:d	Lgb/h3;
    //   88: getfield 44	gb/h3:a	Ljava/util/IdentityHashMap;
    //   91: aload_0
    //   92: getfield 22	gb/i3:b	Lgb/h3$c;
    //   95: invokevirtual 50	java/util/IdentityHashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   98: pop
    //   99: aload_0
    //   100: getfield 18	gb/i3:d	Lgb/h3;
    //   103: getfield 44	gb/h3:a	Ljava/util/IdentityHashMap;
    //   106: invokevirtual 54	java/util/IdentityHashMap:isEmpty	()Z
    //   109: ifeq +23 -> 132
    //   112: aload_0
    //   113: getfield 18	gb/i3:d	Lgb/h3;
    //   116: getfield 57	gb/h3:c	Ljava/util/concurrent/ScheduledExecutorService;
    //   119: invokeinterface 62 1 0
    //   124: aload_0
    //   125: getfield 18	gb/i3:d	Lgb/h3;
    //   128: aconst_null
    //   129: putfield 57	gb/h3:c	Ljava/util/concurrent/ScheduledExecutorService;
    //   132: aload_3
    //   133: athrow
    //   134: aload_1
    //   135: monitorexit
    //   136: return
    //   137: astore_3
    //   138: aload_1
    //   139: monitorexit
    //   140: aload_3
    //   141: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	142	0	this	i3
    //   4	135	1	localh3	h3
    //   14	2	2	i	int
    //   83	50	3	localObject1	Object
    //   137	4	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   19	32	83	finally
    //   7	15	137	finally
    //   32	80	137	finally
    //   84	132	137	finally
    //   132	134	137	finally
    //   134	136	137	finally
    //   138	140	137	finally
  }
}

/* Location:
 * Qualified Name:     gb.i3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */