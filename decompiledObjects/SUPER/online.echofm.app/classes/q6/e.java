package q6;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

public abstract class e
{
  public static final d a;
  private static volatile Choreographer choreographer;
  
  /* Error */
  static
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_0
    //   2: getstatic 16	V5/n:o	LV5/n$a;
    //   5: astore_1
    //   6: new 18	q6/c
    //   9: astore_1
    //   10: aload_1
    //   11: invokestatic 24	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   14: iconst_1
    //   15: invokestatic 27	q6/e:a	(Landroid/os/Looper;Z)Landroid/os/Handler;
    //   18: aconst_null
    //   19: iconst_2
    //   20: aconst_null
    //   21: invokespecial 31	q6/c:<init>	(Landroid/os/Handler;Ljava/lang/String;ILkotlin/jvm/internal/g;)V
    //   24: aload_1
    //   25: invokestatic 34	V5/n:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   28: astore_1
    //   29: goto +16 -> 45
    //   32: astore_2
    //   33: getstatic 16	V5/n:o	LV5/n$a;
    //   36: astore_1
    //   37: aload_2
    //   38: invokestatic 39	V5/o:a	(Ljava/lang/Throwable;)Ljava/lang/Object;
    //   41: invokestatic 34	V5/n:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   44: astore_1
    //   45: aload_1
    //   46: invokestatic 43	V5/n:c	(Ljava/lang/Object;)Z
    //   49: ifeq +8 -> 57
    //   52: aload_0
    //   53: astore_1
    //   54: goto +3 -> 57
    //   57: aload_1
    //   58: checkcast 45	q6/d
    //   61: putstatic 47	q6/e:a	Lq6/d;
    //   64: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   1	52	0	localObject1	Object
    //   5	53	1	localObject2	Object
    //   32	6	2	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   2	29	32	finally
  }
  
  public static final Handler a(Looper paramLooper, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if (Build.VERSION.SDK_INT >= 28)
      {
        paramLooper = Handler.class.getDeclaredMethod("createAsync", new Class[] { Looper.class }).invoke(null, new Object[] { paramLooper });
        Intrinsics.c(paramLooper, "null cannot be cast to non-null type android.os.Handler");
      }
      for (;;)
      {
        return (Handler)paramLooper;
        try
        {
          Constructor localConstructor = Handler.class.getDeclaredConstructor(new Class[] { Looper.class, Handler.Callback.class, Boolean.TYPE });
          paramLooper = localConstructor.newInstance(new Object[] { paramLooper, null, Boolean.TRUE });
        }
        catch (NoSuchMethodException localNoSuchMethodException)
        {
          return new Handler(paramLooper);
        }
      }
    }
    return new Handler(paramLooper);
  }
}

/* Location:
 * Qualified Name:     q6.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */