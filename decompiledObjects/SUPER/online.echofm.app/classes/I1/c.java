package I1;

import O1.P;
import T1.a;
import W5.I;
import W5.m;
import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import x1.B;

public final class c
{
  public static final c a = new c();
  public static final Set b = I.f(new String[] { "fb_mobile_purchase", "StartTrial", "Subscribe" });
  
  public static final boolean d()
  {
    boolean bool1 = a.d(c.class);
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    bool1 = bool2;
    try
    {
      if (!B.z(B.l()))
      {
        bool1 = bool2;
        if (!P.Z())
        {
          boolean bool3 = e.b();
          bool1 = bool2;
          if (bool3) {
            bool1 = true;
          }
        }
      }
    }
    finally
    {
      break label54;
    }
    return bool1;
    label54:
    a.b(localThrowable, c.class);
    return false;
  }
  
  /* Error */
  public static final void e(String paramString, y1.e parame)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 47	T1/a:d	(Ljava/lang/Object;)Z
    //   5: ifeq +4 -> 9
    //   8: return
    //   9: aload_0
    //   10: ldc 72
    //   12: invokestatic 78	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload_1
    //   16: ldc 80
    //   18: invokestatic 78	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   21: getstatic 15	I1/c:a	LI1/c;
    //   24: aload_1
    //   25: invokevirtual 84	I1/c:c	(Ly1/e;)Z
    //   28: ifeq +31 -> 59
    //   31: invokestatic 88	x1/B:t	()Ljava/util/concurrent/Executor;
    //   34: astore_2
    //   35: new 90	I1/a
    //   38: astore_3
    //   39: aload_3
    //   40: aload_0
    //   41: aload_1
    //   42: invokespecial 92	I1/a:<init>	(Ljava/lang/String;Ly1/e;)V
    //   45: aload_2
    //   46: aload_3
    //   47: invokeinterface 98 2 0
    //   52: goto +7 -> 59
    //   55: astore_0
    //   56: goto +4 -> 60
    //   59: return
    //   60: aload_0
    //   61: ldc 2
    //   63: invokestatic 69	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   66: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	67	0	paramString	String
    //   0	67	1	parame	y1.e
    //   34	12	2	localExecutor	Executor
    //   38	9	3	locala	a
    // Exception table:
    //   from	to	target	type
    //   9	52	55	finally
  }
  
  public static final void f(String paramString, y1.e parame)
  {
    if (a.d(c.class)) {
      return;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramString, "$applicationId");
      Intrinsics.checkNotNullParameter(parame, "$event");
      e locale = e.a;
      e.c(paramString, m.b(parame));
      return;
    }
    finally
    {
      a.b(paramString, c.class);
    }
  }
  
  public static final void g(String paramString1, String paramString2)
  {
    if (a.d(c.class)) {
      return;
    }
    try
    {
      Context localContext = B.l();
      if ((localContext != null) && (paramString1 != null) && (paramString2 != null))
      {
        Executor localExecutor = B.t();
        b localb = new I1/b;
        localb.<init>(localContext, paramString2, paramString1);
        localExecutor.execute(localb);
      }
    }
    finally
    {
      break label58;
    }
    return;
    label58:
    a.b(paramString1, c.class);
  }
  
  /* Error */
  public static final void h(Context paramContext, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 47	T1/a:d	(Ljava/lang/Object;)Z
    //   5: ifeq +4 -> 9
    //   8: return
    //   9: aload_0
    //   10: ldc 121
    //   12: invokestatic 78	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload_0
    //   16: aload_1
    //   17: iconst_0
    //   18: invokevirtual 127	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   21: astore_1
    //   22: aload_2
    //   23: ldc -127
    //   25: invokestatic 133	kotlin/jvm/internal/Intrinsics:i	(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   28: astore_0
    //   29: aload_1
    //   30: aload_0
    //   31: lconst_0
    //   32: invokeinterface 139 4 0
    //   37: lconst_0
    //   38: lcmp
    //   39: ifne +39 -> 78
    //   42: aload_2
    //   43: invokestatic 142	I1/e:e	(Ljava/lang/String;)LI1/e$c;
    //   46: pop
    //   47: aload_1
    //   48: invokeinterface 146 1 0
    //   53: astore_1
    //   54: aload_1
    //   55: aload_0
    //   56: invokestatic 152	java/lang/System:currentTimeMillis	()J
    //   59: invokeinterface 158 4 0
    //   64: pop
    //   65: aload_1
    //   66: invokeinterface 161 1 0
    //   71: goto +7 -> 78
    //   74: astore_0
    //   75: goto +4 -> 79
    //   78: return
    //   79: aload_0
    //   80: ldc 2
    //   82: invokestatic 69	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   85: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	86	0	paramContext	Context
    //   0	86	1	paramString1	String
    //   0	86	2	paramString2	String
    // Exception table:
    //   from	to	target	type
    //   9	71	74	finally
  }
  
  public final boolean c(y1.e parame)
  {
    boolean bool1 = a.d(this);
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    try
    {
      if ((parame.h()) && (b.contains(parame.f()))) {
        i = 1;
      }
    }
    finally
    {
      break label68;
    }
    int i = 0;
    bool1 = parame.h();
    if (((bool1 ^ true)) || (i != 0)) {
      bool2 = true;
    }
    return bool2;
    label68:
    a.b(parame, this);
    return false;
  }
}

/* Location:
 * Qualified Name:     I1.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */