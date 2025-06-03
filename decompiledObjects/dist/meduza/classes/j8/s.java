package j8;

import aa.m0;
import android.content.Context;
import android.util.Log;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import k8.i;
import l.l;
import r4.c;

public final class s
{
  public final Context a;
  public final w b;
  public final l c;
  public final long d;
  public c e;
  public c f;
  public boolean g;
  public n h;
  public final a0 i;
  public final p8.e j;
  public final i8.b k;
  public final h8.a l;
  public final j m;
  public final g8.a n;
  public final g8.f o;
  public final i p;
  
  public s(u7.f paramf, a0 parama0, g8.b paramb, w paramw, e parame, m0 paramm0, p8.e parame1, j paramj, g8.f paramf1, i parami)
  {
    b = paramw;
    paramf.a();
    a = a;
    i = parama0;
    n = paramb;
    k = parame;
    l = paramm0;
    j = parame1;
    m = paramj;
    o = paramf1;
    p = parami;
    d = System.currentTimeMillis();
    c = new l(6);
  }
  
  /* Error */
  public final void a(r8.h paramh)
  {
    // Byte code:
    //   0: invokestatic 87	k8/i:a	()V
    //   3: invokestatic 87	k8/i:a	()V
    //   6: aload_0
    //   7: getfield 89	j8/s:e	Lr4/c;
    //   10: invokevirtual 93	r4/c:d	()V
    //   13: ldc 95
    //   15: iconst_2
    //   16: invokestatic 101	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   19: ifeq +12 -> 31
    //   22: ldc 95
    //   24: ldc 103
    //   26: aconst_null
    //   27: invokestatic 107	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   30: pop
    //   31: aload_0
    //   32: getfield 55	j8/s:k	Li8/b;
    //   35: astore_2
    //   36: new 109	j8/r
    //   39: astore_3
    //   40: aload_3
    //   41: aload_0
    //   42: invokespecial 112	j8/r:<init>	(Lj8/s;)V
    //   45: aload_2
    //   46: aload_3
    //   47: invokeinterface 117 2 0
    //   52: aload_0
    //   53: getfield 119	j8/s:h	Lj8/n;
    //   56: invokevirtual 123	j8/n:h	()V
    //   59: aload_1
    //   60: checkcast 125	r8/f
    //   63: astore_1
    //   64: aload_1
    //   65: invokevirtual 128	r8/f:b	()Lr8/c;
    //   68: getfield 133	r8/c:b	Lr8/c$a;
    //   71: getfield 137	r8/c$a:a	Z
    //   74: ifeq +54 -> 128
    //   77: aload_0
    //   78: getfield 119	j8/s:h	Lj8/n;
    //   81: aload_1
    //   82: invokevirtual 140	j8/n:d	(Lr8/h;)Z
    //   85: ifne +12 -> 97
    //   88: ldc 95
    //   90: ldc -114
    //   92: aconst_null
    //   93: invokestatic 145	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   96: pop
    //   97: aload_0
    //   98: getfield 119	j8/s:h	Lj8/n;
    //   101: aload_1
    //   102: getfield 148	r8/f:i	Ljava/util/concurrent/atomic/AtomicReference;
    //   105: invokevirtual 154	java/util/concurrent/atomic/AtomicReference:get	()Ljava/lang/Object;
    //   108: checkcast 156	com/google/android/gms/tasks/TaskCompletionSource
    //   111: invokevirtual 160	com/google/android/gms/tasks/TaskCompletionSource:getTask	()Lcom/google/android/gms/tasks/Task;
    //   114: invokevirtual 163	j8/n:j	(Lcom/google/android/gms/tasks/Task;)V
    //   117: goto +54 -> 171
    //   120: astore_1
    //   121: goto +55 -> 176
    //   124: astore_1
    //   125: goto +37 -> 162
    //   128: ldc 95
    //   130: iconst_3
    //   131: invokestatic 101	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   134: istore 4
    //   136: iload 4
    //   138: ifeq +12 -> 150
    //   141: ldc 95
    //   143: ldc -91
    //   145: aconst_null
    //   146: invokestatic 167	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   149: pop
    //   150: new 169	java/lang/RuntimeException
    //   153: astore_1
    //   154: aload_1
    //   155: ldc -91
    //   157: invokespecial 172	java/lang/RuntimeException:<init>	(Ljava/lang/String;)V
    //   160: aload_1
    //   161: athrow
    //   162: ldc 95
    //   164: ldc -82
    //   166: aload_1
    //   167: invokestatic 176	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   170: pop
    //   171: aload_0
    //   172: invokevirtual 178	j8/s:c	()V
    //   175: return
    //   176: aload_0
    //   177: invokevirtual 178	j8/s:c	()V
    //   180: aload_1
    //   181: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	182	0	this	s
    //   0	182	1	paramh	r8.h
    //   35	11	2	localb	i8.b
    //   39	8	3	localr	r
    //   134	3	4	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   31	97	120	finally
    //   97	117	120	finally
    //   128	136	120	finally
    //   141	150	120	finally
    //   150	162	120	finally
    //   162	171	120	finally
    //   31	97	124	java/lang/Exception
    //   97	117	124	java/lang/Exception
    //   128	136	124	java/lang/Exception
    //   141	150	124	java/lang/Exception
    //   150	162	124	java/lang/Exception
  }
  
  public final void b(r8.f paramf)
  {
    paramf = p.a.a.submit(new x0.f(14, this, paramf));
    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
      Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
    }
    try
    {
      String str;
      try
      {
        paramf.get(3L, TimeUnit.SECONDS);
      }
      catch (TimeoutException paramf)
      {
        str = "Crashlytics timed out during initialization.";
      }
      catch (ExecutionException paramf)
      {
        str = "Crashlytics encountered a problem during initialization.";
      }
      Log.e("FirebaseCrashlytics", str, paramf);
    }
    catch (InterruptedException paramf)
    {
      Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", paramf);
      Thread.currentThread().interrupt();
    }
  }
  
  public final void c()
  {
    
    try
    {
      Object localObject = e;
      p8.e locale = (p8.e)c;
      localObject = (String)b;
      locale.getClass();
      File localFile = new java/io/File;
      localFile.<init>(c, (String)localObject);
      if (!localFile.delete()) {
        Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
      }
    }
    catch (Exception localException)
    {
      Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", localException);
    }
  }
}

/* Location:
 * Qualified Name:     j8.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */