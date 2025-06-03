package nc;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ub.h;

public final class h0
  extends y0
  implements Runnable
{
  private static volatile Thread _thread;
  private static volatile int debugStatus;
  public static final h0 r;
  public static final long s;
  
  static
  {
    Object localObject = new h0();
    r = (h0)localObject;
    ((x0)localObject).E0(false);
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
    s = localTimeUnit.toNanos(localLong.longValue());
  }
  
  public final Thread I0()
  {
    Thread localThread1 = _thread;
    Thread localThread2 = localThread1;
    if (localThread1 == null) {
      try
      {
        localThread1 = _thread;
        localThread2 = localThread1;
        if (localThread1 == null)
        {
          localThread2 = new java/lang/Thread;
          localThread2.<init>(this, "kotlinx.coroutines.DefaultExecutor");
          _thread = localThread2;
          localThread2.setDaemon(true);
          localThread2.start();
        }
      }
      finally {}
    }
    return localThread3;
  }
  
  public final void J0(long paramLong, y0.c paramc)
  {
    throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
  }
  
  public final void L0(Runnable paramRunnable)
  {
    int i;
    if (debugStatus == 4) {
      i = 1;
    } else {
      i = 0;
    }
    if (i == 0)
    {
      super.L0(paramRunnable);
      return;
    }
    throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
  }
  
  public final void P0()
  {
    try
    {
      int i = debugStatus;
      if ((i != 2) && (i != 3)) {
        i = 0;
      } else {
        i = 1;
      }
      if (i == 0) {
        return;
      }
      debugStatus = 3;
      y0.o.set(this, null);
      y0.p.set(this, null);
      notifyAll();
      return;
    }
    finally {}
  }
  
  public final t0 q0(long paramLong, e2 parame2, h paramh)
  {
    long l = 0L;
    if (paramLong <= 0L) {
      paramLong = l;
    } else if (paramLong >= 9223372036854L) {
      paramLong = Long.MAX_VALUE;
    } else {
      paramLong = 1000000L * paramLong;
    }
    if (paramLong < 4611686018427387903L)
    {
      l = System.nanoTime();
      parame2 = new y0.b(parame2, paramLong + l);
      O0(l, parame2);
    }
    else
    {
      parame2 = u1.a;
    }
    return parame2;
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: getstatic 147	nc/c2:a	Ljava/lang/ThreadLocal;
    //   3: aload_0
    //   4: invokevirtual 152	java/lang/ThreadLocal:set	(Ljava/lang/Object;)V
    //   7: aload_0
    //   8: monitorenter
    //   9: getstatic 91	nc/h0:debugStatus	I
    //   12: istore_1
    //   13: iload_1
    //   14: iconst_2
    //   15: if_icmpeq +16 -> 31
    //   18: iload_1
    //   19: iconst_3
    //   20: if_icmpne +6 -> 26
    //   23: goto +8 -> 31
    //   26: iconst_0
    //   27: istore_1
    //   28: goto +5 -> 33
    //   31: iconst_1
    //   32: istore_1
    //   33: iload_1
    //   34: ifeq +10 -> 44
    //   37: aload_0
    //   38: monitorexit
    //   39: iconst_0
    //   40: istore_1
    //   41: goto +15 -> 56
    //   44: iconst_1
    //   45: putstatic 91	nc/h0:debugStatus	I
    //   48: aload_0
    //   49: invokevirtual 112	java/lang/Object:notifyAll	()V
    //   52: aload_0
    //   53: monitorexit
    //   54: iconst_1
    //   55: istore_1
    //   56: iload_1
    //   57: ifne +24 -> 81
    //   60: aconst_null
    //   61: putstatic 65	nc/h0:_thread	Ljava/lang/Thread;
    //   64: aload_0
    //   65: invokevirtual 154	nc/h0:P0	()V
    //   68: aload_0
    //   69: invokevirtual 158	nc/y0:N0	()Z
    //   72: ifne +8 -> 80
    //   75: aload_0
    //   76: invokevirtual 160	nc/h0:I0	()Ljava/lang/Thread;
    //   79: pop
    //   80: return
    //   81: ldc2_w 117
    //   84: lstore_2
    //   85: invokestatic 163	java/lang/Thread:interrupted	()Z
    //   88: pop
    //   89: aload_0
    //   90: invokevirtual 166	nc/y0:G0	()J
    //   93: lstore 4
    //   95: lload 4
    //   97: ldc2_w 117
    //   100: lcmp
    //   101: ifne +89 -> 190
    //   104: invokestatic 127	java/lang/System:nanoTime	()J
    //   107: lstore 6
    //   109: lload_2
    //   110: lstore 8
    //   112: lload_2
    //   113: ldc2_w 117
    //   116: lcmp
    //   117: ifne +15 -> 132
    //   120: getstatic 59	nc/h0:s	J
    //   123: lstore 8
    //   125: lload 8
    //   127: lload 6
    //   129: ladd
    //   130: lstore 8
    //   132: lload 8
    //   134: lload 6
    //   136: lsub
    //   137: lstore_2
    //   138: lload_2
    //   139: lconst_0
    //   140: lcmp
    //   141: ifgt +24 -> 165
    //   144: aconst_null
    //   145: putstatic 65	nc/h0:_thread	Ljava/lang/Thread;
    //   148: aload_0
    //   149: invokevirtual 154	nc/h0:P0	()V
    //   152: aload_0
    //   153: invokevirtual 158	nc/y0:N0	()Z
    //   156: ifne +8 -> 164
    //   159: aload_0
    //   160: invokevirtual 160	nc/h0:I0	()Ljava/lang/Thread;
    //   163: pop
    //   164: return
    //   165: lload 8
    //   167: lstore 6
    //   169: lload 4
    //   171: lstore 10
    //   173: lload 4
    //   175: lload_2
    //   176: lcmp
    //   177: ifle +22 -> 199
    //   180: lload_2
    //   181: lstore 10
    //   183: lload 8
    //   185: lstore 6
    //   187: goto +12 -> 199
    //   190: ldc2_w 117
    //   193: lstore 6
    //   195: lload 4
    //   197: lstore 10
    //   199: lload 6
    //   201: lstore_2
    //   202: lload 10
    //   204: lconst_0
    //   205: lcmp
    //   206: ifle -121 -> 85
    //   209: getstatic 91	nc/h0:debugStatus	I
    //   212: istore_1
    //   213: iload_1
    //   214: iconst_2
    //   215: if_icmpeq +16 -> 231
    //   218: iload_1
    //   219: iconst_3
    //   220: if_icmpne +6 -> 226
    //   223: goto +8 -> 231
    //   226: iconst_0
    //   227: istore_1
    //   228: goto +5 -> 233
    //   231: iconst_1
    //   232: istore_1
    //   233: iload_1
    //   234: ifeq +24 -> 258
    //   237: aconst_null
    //   238: putstatic 65	nc/h0:_thread	Ljava/lang/Thread;
    //   241: aload_0
    //   242: invokevirtual 154	nc/h0:P0	()V
    //   245: aload_0
    //   246: invokevirtual 158	nc/y0:N0	()Z
    //   249: ifne +8 -> 257
    //   252: aload_0
    //   253: invokevirtual 160	nc/h0:I0	()Ljava/lang/Thread;
    //   256: pop
    //   257: return
    //   258: aload_0
    //   259: lload 10
    //   261: invokestatic 172	java/util/concurrent/locks/LockSupport:parkNanos	(Ljava/lang/Object;J)V
    //   264: lload 6
    //   266: lstore_2
    //   267: goto -182 -> 85
    //   270: astore 12
    //   272: goto +10 -> 282
    //   275: astore 12
    //   277: aload_0
    //   278: monitorexit
    //   279: aload 12
    //   281: athrow
    //   282: aconst_null
    //   283: putstatic 65	nc/h0:_thread	Ljava/lang/Thread;
    //   286: aload_0
    //   287: invokevirtual 154	nc/h0:P0	()V
    //   290: aload_0
    //   291: invokevirtual 158	nc/y0:N0	()Z
    //   294: ifne +8 -> 302
    //   297: aload_0
    //   298: invokevirtual 160	nc/h0:I0	()Ljava/lang/Thread;
    //   301: pop
    //   302: aload 12
    //   304: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	305	0	this	h0
    //   12	222	1	i	int
    //   84	183	2	l1	long
    //   93	103	4	l2	long
    //   107	158	6	l3	long
    //   110	74	8	l4	long
    //   171	89	10	l5	long
    //   270	1	12	localObject1	Object
    //   275	28	12	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   7	9	270	finally
    //   37	39	270	finally
    //   52	54	270	finally
    //   85	95	270	finally
    //   104	109	270	finally
    //   120	125	270	finally
    //   209	213	270	finally
    //   258	264	270	finally
    //   277	282	270	finally
    //   9	13	275	finally
    //   44	52	275	finally
  }
  
  public final void shutdown()
  {
    debugStatus = 4;
    super.shutdown();
  }
}

/* Location:
 * Qualified Name:     nc.h0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */