package j8;

import android.util.Log;
import g8.a;
import java.util.concurrent.atomic.AtomicBoolean;
import r8.f;
import r8.h;

public final class v
  implements Thread.UncaughtExceptionHandler
{
  public final a a;
  public final h b;
  public final Thread.UncaughtExceptionHandler c;
  public final a d;
  public final AtomicBoolean e;
  
  public v(l paraml, f paramf, Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler, a parama)
  {
    a = paraml;
    b = paramf;
    c = paramUncaughtExceptionHandler;
    e = new AtomicBoolean(false);
    d = parama;
  }
  
  public final boolean a(Thread paramThread, Throwable paramThrowable)
  {
    if (paramThread == null)
    {
      Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null thread", null);
      return false;
    }
    if (paramThrowable == null)
    {
      Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null throwable", null);
      return false;
    }
    boolean bool = d.b();
    int i = 1;
    if (bool)
    {
      if (!Log.isLoggable("FirebaseCrashlytics", 3)) {
        i = 0;
      }
      if (i != 0) {
        Log.d("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; native crash exists for session.", null);
      }
      return false;
    }
    return true;
  }
  
  /* Error */
  public final void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 36	j8/v:e	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   4: iconst_1
    //   5: invokevirtual 71	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   8: aload_0
    //   9: aload_1
    //   10: aload_2
    //   11: invokevirtual 73	j8/v:a	(Ljava/lang/Thread;Ljava/lang/Throwable;)Z
    //   14: ifeq +32 -> 46
    //   17: aload_0
    //   18: getfield 25	j8/v:a	Lj8/v$a;
    //   21: astore_3
    //   22: aload_0
    //   23: getfield 27	j8/v:b	Lr8/h;
    //   26: astore 4
    //   28: aload_3
    //   29: checkcast 75	j8/l
    //   32: getfield 78	j8/l:a	Lj8/n;
    //   35: aload 4
    //   37: aload_1
    //   38: aload_2
    //   39: iconst_0
    //   40: invokevirtual 84	j8/n:g	(Lr8/h;Ljava/lang/Thread;Ljava/lang/Throwable;Z)V
    //   43: goto +21 -> 64
    //   46: ldc 42
    //   48: iconst_3
    //   49: invokestatic 60	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   52: ifeq +12 -> 64
    //   55: ldc 42
    //   57: ldc 86
    //   59: aconst_null
    //   60: invokestatic 64	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   63: pop
    //   64: aload_0
    //   65: getfield 29	j8/v:c	Ljava/lang/Thread$UncaughtExceptionHandler;
    //   68: ifnull +24 -> 92
    //   71: ldc 42
    //   73: iconst_3
    //   74: invokestatic 60	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   77: ifeq +83 -> 160
    //   80: ldc 42
    //   82: ldc 88
    //   84: aconst_null
    //   85: invokestatic 64	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   88: pop
    //   89: goto +71 -> 160
    //   92: ldc 42
    //   94: iconst_3
    //   95: invokestatic 60	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   98: ifeq +83 -> 181
    //   101: ldc 42
    //   103: ldc 90
    //   105: aconst_null
    //   106: invokestatic 64	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   109: pop
    //   110: goto +71 -> 181
    //   113: astore_3
    //   114: getstatic 95	b/z:e	Lb/z;
    //   117: astore 4
    //   119: aload 4
    //   121: bipush 6
    //   123: invokevirtual 98	b/z:c	(I)Z
    //   126: ifeq +20 -> 146
    //   129: ldc 42
    //   131: ldc 100
    //   133: aload_3
    //   134: invokestatic 49	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   137: pop
    //   138: goto +8 -> 146
    //   141: astore 4
    //   143: goto +51 -> 194
    //   146: aload_0
    //   147: getfield 29	j8/v:c	Ljava/lang/Thread$UncaughtExceptionHandler;
    //   150: ifnull +24 -> 174
    //   153: aload 4
    //   155: ldc 88
    //   157: invokevirtual 104	b/z:h	(Ljava/lang/String;)V
    //   160: aload_0
    //   161: getfield 29	j8/v:c	Ljava/lang/Thread$UncaughtExceptionHandler;
    //   164: aload_1
    //   165: aload_2
    //   166: invokeinterface 106 3 0
    //   171: goto +14 -> 185
    //   174: aload 4
    //   176: ldc 90
    //   178: invokevirtual 104	b/z:h	(Ljava/lang/String;)V
    //   181: iconst_1
    //   182: invokestatic 112	java/lang/System:exit	(I)V
    //   185: aload_0
    //   186: getfield 36	j8/v:e	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   189: iconst_0
    //   190: invokevirtual 71	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   193: return
    //   194: aload_0
    //   195: getfield 29	j8/v:c	Ljava/lang/Thread$UncaughtExceptionHandler;
    //   198: ifnull +35 -> 233
    //   201: ldc 42
    //   203: iconst_3
    //   204: invokestatic 60	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   207: ifeq +12 -> 219
    //   210: ldc 42
    //   212: ldc 88
    //   214: aconst_null
    //   215: invokestatic 64	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   218: pop
    //   219: aload_0
    //   220: getfield 29	j8/v:c	Ljava/lang/Thread$UncaughtExceptionHandler;
    //   223: aload_1
    //   224: aload_2
    //   225: invokeinterface 106 3 0
    //   230: goto +25 -> 255
    //   233: ldc 42
    //   235: iconst_3
    //   236: invokestatic 60	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   239: ifeq +12 -> 251
    //   242: ldc 42
    //   244: ldc 90
    //   246: aconst_null
    //   247: invokestatic 64	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   250: pop
    //   251: iconst_1
    //   252: invokestatic 112	java/lang/System:exit	(I)V
    //   255: aload_0
    //   256: getfield 36	j8/v:e	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   259: iconst_0
    //   260: invokevirtual 71	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   263: aload 4
    //   265: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	266	0	this	v
    //   0	266	1	paramThread	Thread
    //   0	266	2	paramThrowable	Throwable
    //   21	8	3	locala	a
    //   113	21	3	localException	Exception
    //   26	94	4	localObject1	Object
    //   141	123	4	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   8	43	113	java/lang/Exception
    //   46	64	113	java/lang/Exception
    //   8	43	141	finally
    //   46	64	141	finally
    //   114	138	141	finally
  }
  
  public static abstract interface a {}
}

/* Location:
 * Qualified Name:     j8.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */