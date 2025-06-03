package e7;

import d2.q;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;
import m6.j;

public final class h2
  extends Thread
{
  public final Object a;
  public final BlockingQueue<i2<?>> b;
  public boolean c = false;
  
  public h2(String paramString, BlockingQueue<i2<?>> paramBlockingQueue)
  {
    Object localObject;
    j.i(localObject);
    a = new Object();
    b = ((BlockingQueue)localObject);
    setName(paramBlockingQueue);
  }
  
  public final void a(InterruptedException paramInterruptedException)
  {
    b1 localb1 = d.zzj().r;
    String str = getName();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(str);
    localStringBuilder.append(" was interrupted");
    localb1.c(localStringBuilder.toString(), paramInterruptedException);
  }
  
  public final void b()
  {
    synchronized (d.r)
    {
      if (!c)
      {
        d.s.release();
        d.r.notifyAll();
        e2 locale2 = d;
        if (this == d) {
          d = null;
        } else if (this == e) {
          e = null;
        } else {
          zzjo.b("Current scheduler thread is neither worker nor network");
        }
        c = true;
      }
      return;
    }
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
    //   7: getfield 17	e7/h2:d	Le7/e2;
    //   10: getfield 84	e7/e2:s	Ljava/util/concurrent/Semaphore;
    //   13: invokevirtual 111	java/util/concurrent/Semaphore:acquire	()V
    //   16: iconst_1
    //   17: istore_1
    //   18: goto -16 -> 2
    //   21: astore_2
    //   22: aload_0
    //   23: aload_2
    //   24: invokevirtual 113	e7/h2:a	(Ljava/lang/InterruptedException;)V
    //   27: goto -25 -> 2
    //   30: invokestatic 119	android/os/Process:myTid	()I
    //   33: invokestatic 123	android/os/Process:getThreadPriority	(I)I
    //   36: istore_3
    //   37: aload_0
    //   38: getfield 35	e7/h2:b	Ljava/util/concurrent/BlockingQueue;
    //   41: invokeinterface 129 1 0
    //   46: checkcast 131	e7/i2
    //   49: astore_2
    //   50: aload_2
    //   51: ifnull +29 -> 80
    //   54: aload_2
    //   55: getfield 133	e7/i2:b	Z
    //   58: ifeq +8 -> 66
    //   61: iload_3
    //   62: istore_1
    //   63: goto +6 -> 69
    //   66: bipush 10
    //   68: istore_1
    //   69: iload_1
    //   70: invokestatic 137	android/os/Process:setThreadPriority	(I)V
    //   73: aload_2
    //   74: invokevirtual 141	java/util/concurrent/FutureTask:run	()V
    //   77: goto -40 -> 37
    //   80: aload_0
    //   81: getfield 33	e7/h2:a	Ljava/lang/Object;
    //   84: astore_2
    //   85: aload_2
    //   86: monitorenter
    //   87: aload_0
    //   88: getfield 35	e7/h2:b	Ljava/util/concurrent/BlockingQueue;
    //   91: invokeinterface 144 1 0
    //   96: ifnonnull +32 -> 128
    //   99: aload_0
    //   100: getfield 17	e7/h2:d	Le7/e2;
    //   103: invokevirtual 148	java/lang/Object:getClass	()Ljava/lang/Class;
    //   106: pop
    //   107: aload_0
    //   108: getfield 33	e7/h2:a	Ljava/lang/Object;
    //   111: ldc2_w 149
    //   114: invokevirtual 154	java/lang/Object:wait	(J)V
    //   117: goto +11 -> 128
    //   120: astore 4
    //   122: aload_0
    //   123: aload 4
    //   125: invokevirtual 113	e7/h2:a	(Ljava/lang/InterruptedException;)V
    //   128: aload_2
    //   129: monitorexit
    //   130: aload_0
    //   131: getfield 17	e7/h2:d	Le7/e2;
    //   134: getfield 80	e7/e2:r	Ljava/lang/Object;
    //   137: astore_2
    //   138: aload_2
    //   139: monitorenter
    //   140: aload_0
    //   141: getfield 35	e7/h2:b	Ljava/util/concurrent/BlockingQueue;
    //   144: invokeinterface 144 1 0
    //   149: ifnonnull +14 -> 163
    //   152: aload_0
    //   153: invokevirtual 156	e7/h2:b	()V
    //   156: aload_2
    //   157: monitorexit
    //   158: aload_0
    //   159: invokevirtual 156	e7/h2:b	()V
    //   162: return
    //   163: aload_2
    //   164: monitorexit
    //   165: goto -128 -> 37
    //   168: astore 4
    //   170: aload_2
    //   171: monitorexit
    //   172: aload 4
    //   174: athrow
    //   175: astore 4
    //   177: aload_2
    //   178: monitorexit
    //   179: aload 4
    //   181: athrow
    //   182: astore_2
    //   183: aload_0
    //   184: invokevirtual 156	e7/h2:b	()V
    //   187: aload_2
    //   188: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	189	0	this	h2
    //   1	69	1	i	int
    //   21	3	2	localInterruptedException1	InterruptedException
    //   182	6	2	localObject2	Object
    //   36	26	3	j	int
    //   120	4	4	localInterruptedException2	InterruptedException
    //   168	5	4	localObject3	Object
    //   175	5	4	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   6	16	21	java/lang/InterruptedException
    //   107	117	120	java/lang/InterruptedException
    //   140	158	168	finally
    //   163	165	168	finally
    //   170	172	168	finally
    //   87	107	175	finally
    //   107	117	175	finally
    //   122	128	175	finally
    //   128	130	175	finally
    //   177	179	175	finally
    //   30	37	182	finally
    //   37	50	182	finally
    //   54	61	182	finally
    //   69	77	182	finally
    //   80	87	182	finally
    //   130	140	182	finally
    //   172	175	182	finally
    //   179	182	182	finally
  }
}

/* Location:
 * Qualified Name:     e7.h2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */