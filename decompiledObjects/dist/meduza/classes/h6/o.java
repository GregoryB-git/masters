package h6;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

public final class o
{
  public static o d;
  public final b a;
  public GoogleSignInAccount b;
  public GoogleSignInOptions c;
  
  public o(Context paramContext)
  {
    paramContext = b.a(paramContext);
    a = paramContext;
    b = paramContext.b();
    c = paramContext.c();
  }
  
  /* Error */
  public static o a(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: aload_0
    //   4: invokevirtual 42	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   7: astore_1
    //   8: ldc 2
    //   10: monitorenter
    //   11: getstatic 44	h6/o:d	Lh6/o;
    //   14: astore_0
    //   15: aload_0
    //   16: ifnull +9 -> 25
    //   19: ldc 2
    //   21: monitorexit
    //   22: goto +19 -> 41
    //   25: new 2	h6/o
    //   28: astore_0
    //   29: aload_0
    //   30: aload_1
    //   31: invokespecial 46	h6/o:<init>	(Landroid/content/Context;)V
    //   34: aload_0
    //   35: putstatic 44	h6/o:d	Lh6/o;
    //   38: goto -19 -> 19
    //   41: ldc 2
    //   43: monitorexit
    //   44: aload_0
    //   45: areturn
    //   46: astore_0
    //   47: ldc 2
    //   49: monitorexit
    //   50: aload_0
    //   51: athrow
    //   52: astore_0
    //   53: ldc 2
    //   55: monitorexit
    //   56: aload_0
    //   57: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	58	0	paramContext	Context
    //   7	24	1	localContext	Context
    // Exception table:
    //   from	to	target	type
    //   11	15	46	finally
    //   25	38	46	finally
    //   3	11	52	finally
    //   19	22	52	finally
    //   47	52	52	finally
  }
  
  /* Error */
  public final void b()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 24	h6/o:a	Lh6/b;
    //   6: astore_1
    //   7: aload_1
    //   8: getfield 49	h6/b:a	Ljava/util/concurrent/locks/ReentrantLock;
    //   11: invokevirtual 54	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   14: aload_1
    //   15: getfield 57	h6/b:b	Landroid/content/SharedPreferences;
    //   18: invokeinterface 63 1 0
    //   23: invokeinterface 68 1 0
    //   28: invokeinterface 71 1 0
    //   33: aload_1
    //   34: getfield 49	h6/b:a	Ljava/util/concurrent/locks/ReentrantLock;
    //   37: invokevirtual 74	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   40: aload_0
    //   41: aconst_null
    //   42: putfield 29	h6/o:b	Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;
    //   45: aload_0
    //   46: aconst_null
    //   47: putfield 34	h6/o:c	Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;
    //   50: aload_0
    //   51: monitorexit
    //   52: return
    //   53: astore_2
    //   54: aload_1
    //   55: getfield 49	h6/b:a	Ljava/util/concurrent/locks/ReentrantLock;
    //   58: invokevirtual 74	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   61: aload_2
    //   62: athrow
    //   63: astore_2
    //   64: aload_0
    //   65: monitorexit
    //   66: aload_2
    //   67: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	68	0	this	o
    //   6	49	1	localb	b
    //   53	9	2	localObject1	Object
    //   63	4	2	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   14	33	53	finally
    //   2	14	63	finally
    //   33	50	63	finally
    //   54	63	63	finally
  }
}

/* Location:
 * Qualified Name:     h6.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */