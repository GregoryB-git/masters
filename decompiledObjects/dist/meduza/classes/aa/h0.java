package aa;

import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledExecutorService;

public final class h0
{
  public static WeakReference<h0> b;
  public e0 a;
  
  public h0(SharedPreferences paramSharedPreferences, ScheduledExecutorService paramScheduledExecutorService) {}
  
  /* Error */
  public final g0 a()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 18	aa/h0:a	Laa/e0;
    //   6: astore_1
    //   7: aload_1
    //   8: getfield 24	aa/e0:d	Ljava/util/ArrayDeque;
    //   11: astore_2
    //   12: aload_2
    //   13: monitorenter
    //   14: aload_1
    //   15: getfield 24	aa/e0:d	Ljava/util/ArrayDeque;
    //   18: invokevirtual 30	java/util/ArrayDeque:peek	()Ljava/lang/Object;
    //   21: checkcast 32	java/lang/String
    //   24: astore_1
    //   25: aload_2
    //   26: monitorexit
    //   27: getstatic 37	aa/g0:d	Ljava/util/regex/Pattern;
    //   30: astore_2
    //   31: aload_1
    //   32: invokestatic 43	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   35: istore_3
    //   36: aconst_null
    //   37: astore_2
    //   38: iload_3
    //   39: ifeq +6 -> 45
    //   42: goto +34 -> 76
    //   45: aload_1
    //   46: ldc 45
    //   48: iconst_m1
    //   49: invokevirtual 49	java/lang/String:split	(Ljava/lang/String;I)[Ljava/lang/String;
    //   52: astore_1
    //   53: aload_1
    //   54: arraylength
    //   55: iconst_2
    //   56: if_icmpeq +6 -> 62
    //   59: goto +17 -> 76
    //   62: new 34	aa/g0
    //   65: dup
    //   66: aload_1
    //   67: iconst_0
    //   68: aaload
    //   69: aload_1
    //   70: iconst_1
    //   71: aaload
    //   72: invokespecial 52	aa/g0:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   75: astore_2
    //   76: aload_0
    //   77: monitorexit
    //   78: aload_2
    //   79: areturn
    //   80: astore_1
    //   81: aload_2
    //   82: monitorexit
    //   83: aload_1
    //   84: athrow
    //   85: astore_2
    //   86: aload_0
    //   87: monitorexit
    //   88: aload_2
    //   89: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	90	0	this	h0
    //   6	64	1	localObject1	Object
    //   80	4	1	localObject2	Object
    //   85	4	2	localObject4	Object
    //   35	4	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   14	27	80	finally
    //   81	83	80	finally
    //   2	14	85	finally
    //   27	36	85	finally
    //   45	59	85	finally
    //   62	76	85	finally
    //   83	85	85	finally
  }
}

/* Location:
 * Qualified Name:     aa.h0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */