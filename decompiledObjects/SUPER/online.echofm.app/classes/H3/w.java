package H3;

import E3.a;
import E3.f;
import O3.i;
import java.util.concurrent.atomic.AtomicBoolean;

public class w
  implements Thread.UncaughtExceptionHandler
{
  public final a a;
  public final i b;
  public final Thread.UncaughtExceptionHandler c;
  public final a d;
  public final AtomicBoolean e;
  
  public w(a parama, i parami, Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler, a parama1)
  {
    a = parama;
    b = parami;
    c = paramUncaughtExceptionHandler;
    e = new AtomicBoolean(false);
    d = parama1;
  }
  
  public boolean a()
  {
    return e.get();
  }
  
  public final boolean b(Thread paramThread, Throwable paramThrowable)
  {
    if (paramThread == null)
    {
      f.f().d("Crashlytics will not record uncaught exception; null thread");
      return false;
    }
    if (paramThrowable == null)
    {
      f.f().d("Crashlytics will not record uncaught exception; null throwable");
      return false;
    }
    if (d.b())
    {
      f.f().b("Crashlytics will not record uncaught exception; native crash exists for session.");
      return false;
    }
    return true;
  }
  
  /* Error */
  public void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 36	H3/w:e	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   4: iconst_1
    //   5: invokevirtual 72	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   8: aload_0
    //   9: aload_1
    //   10: aload_2
    //   11: invokevirtual 74	H3/w:b	(Ljava/lang/Thread;Ljava/lang/Throwable;)Z
    //   14: ifeq +29 -> 43
    //   17: aload_0
    //   18: getfield 25	H3/w:a	LH3/w$a;
    //   21: aload_0
    //   22: getfield 27	H3/w:b	LO3/i;
    //   25: aload_1
    //   26: aload_2
    //   27: invokeinterface 77 4 0
    //   32: goto +19 -> 51
    //   35: astore_3
    //   36: goto +58 -> 94
    //   39: astore_3
    //   40: goto +41 -> 81
    //   43: invokestatic 50	E3/f:f	()LE3/f;
    //   46: ldc 79
    //   48: invokevirtual 65	E3/f:b	(Ljava/lang/String;)V
    //   51: invokestatic 50	E3/f:f	()LE3/f;
    //   54: ldc 81
    //   56: invokevirtual 65	E3/f:b	(Ljava/lang/String;)V
    //   59: aload_0
    //   60: getfield 29	H3/w:c	Ljava/lang/Thread$UncaughtExceptionHandler;
    //   63: aload_1
    //   64: aload_2
    //   65: invokeinterface 83 3 0
    //   70: aload_0
    //   71: getfield 36	H3/w:e	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   74: iconst_0
    //   75: invokevirtual 72	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   78: goto +15 -> 93
    //   81: invokestatic 50	E3/f:f	()LE3/f;
    //   84: ldc 85
    //   86: aload_3
    //   87: invokevirtual 88	E3/f:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   90: goto -39 -> 51
    //   93: return
    //   94: invokestatic 50	E3/f:f	()LE3/f;
    //   97: ldc 81
    //   99: invokevirtual 65	E3/f:b	(Ljava/lang/String;)V
    //   102: aload_0
    //   103: getfield 29	H3/w:c	Ljava/lang/Thread$UncaughtExceptionHandler;
    //   106: aload_1
    //   107: aload_2
    //   108: invokeinterface 83 3 0
    //   113: aload_0
    //   114: getfield 36	H3/w:e	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   117: iconst_0
    //   118: invokevirtual 72	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   121: aload_3
    //   122: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	123	0	this	w
    //   0	123	1	paramThread	Thread
    //   0	123	2	paramThrowable	Throwable
    //   35	1	3	localObject	Object
    //   39	83	3	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   8	32	35	finally
    //   43	51	35	finally
    //   81	90	35	finally
    //   8	32	39	java/lang/Exception
    //   43	51	39	java/lang/Exception
  }
  
  public static abstract interface a
  {
    public abstract void a(i parami, Thread paramThread, Throwable paramThrowable);
  }
}

/* Location:
 * Qualified Name:     H3.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */