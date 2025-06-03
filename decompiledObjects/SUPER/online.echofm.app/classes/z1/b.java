package z1;

import O1.r;
import O1.v;
import T1.a;
import android.app.Activity;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import x1.B;

public final class b
{
  public static final b a = new b();
  public static final String b = b.class.getCanonicalName();
  public static boolean c;
  
  /* Error */
  public static final void b()
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 37	T1/a:d	(Ljava/lang/Object;)Z
    //   5: ifeq +4 -> 9
    //   8: return
    //   9: invokestatic 43	x1/B:t	()Ljava/util/concurrent/Executor;
    //   12: astore_0
    //   13: new 45	z1/a
    //   16: astore_1
    //   17: aload_1
    //   18: invokespecial 46	z1/a:<init>	()V
    //   21: aload_0
    //   22: aload_1
    //   23: invokeinterface 52 2 0
    //   28: goto +19 -> 47
    //   31: astore_1
    //   32: goto +16 -> 48
    //   35: astore_1
    //   36: getstatic 57	O1/P:a	LO1/P;
    //   39: astore_0
    //   40: getstatic 25	z1/b:b	Ljava/lang/String;
    //   43: aload_1
    //   44: invokestatic 61	O1/P:i0	(Ljava/lang/String;Ljava/lang/Exception;)V
    //   47: return
    //   48: aload_1
    //   49: ldc 2
    //   51: invokestatic 64	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   54: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   12	28	0	localObject1	Object
    //   16	7	1	locala	a
    //   31	1	1	localObject2	Object
    //   35	14	1	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   9	28	31	finally
    //   36	47	31	finally
    //   9	28	35	java/lang/Exception
  }
  
  /* Error */
  public static final void c()
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 37	T1/a:d	(Ljava/lang/Object;)Z
    //   5: ifeq +4 -> 9
    //   8: return
    //   9: invokestatic 68	x1/B:l	()Landroid/content/Context;
    //   12: astore_0
    //   13: getstatic 74	O1/a:f	LO1/a$a;
    //   16: aload_0
    //   17: invokevirtual 80	O1/a$a:h	(Landroid/content/Context;)Z
    //   20: ifne +20 -> 40
    //   23: getstatic 17	z1/b:a	Lz1/b;
    //   26: invokevirtual 83	z1/b:e	()V
    //   29: iconst_1
    //   30: putstatic 85	z1/b:c	Z
    //   33: goto +7 -> 40
    //   36: astore_0
    //   37: goto +4 -> 41
    //   40: return
    //   41: aload_0
    //   42: ldc 2
    //   44: invokestatic 64	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   47: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   12	5	0	localContext	android.content.Context
    //   36	6	0	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   9	33	36	finally
  }
  
  public static final void d(Activity paramActivity)
  {
    if (a.d(b.class)) {
      return;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramActivity, "activity");
      return;
    }
    finally
    {
      try
      {
        if ((!c) || (d.d.c().isEmpty())) {
          break label52;
        }
        f.s.e(paramActivity);
      }
      catch (Exception paramActivity)
      {
        for (;;) {}
      }
      paramActivity = finally;
    }
    label52:
    a.b(paramActivity, b.class);
  }
  
  public final void e()
  {
    if (a.d(this)) {
      return;
    }
    try
    {
      Object localObject = v.a;
      localObject = v.q(B.m(), false);
      if (localObject == null) {
        return;
      }
      localObject = ((r)localObject).h();
      if (localObject == null) {
        return;
      }
      d.d.d((String)localObject);
      return;
    }
    finally
    {
      a.b(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     z1.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */