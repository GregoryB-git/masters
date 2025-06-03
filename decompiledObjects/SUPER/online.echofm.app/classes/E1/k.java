package E1;

import O1.n;
import O1.n.b;
import java.util.concurrent.atomic.AtomicBoolean;
import x1.B;

public final class k
{
  public static final k a = new k();
  public static final AtomicBoolean b = new AtomicBoolean(false);
  
  public static final void a()
  {
    if (T1.a.d(k.class)) {
      return;
    }
    try
    {
      b.set(true);
      b();
      return;
    }
    finally
    {
      T1.a.b(localThrowable, k.class);
    }
  }
  
  public static final void b()
  {
    if (T1.a.d(k.class)) {
      return;
    }
    try
    {
      if (!b.get()) {
        break label60;
      }
      if (a.c())
      {
        Object localObject = n.a;
        if (n.g(n.b.H))
        {
          localObject = f.a;
          f.d(B.l());
        }
      }
    }
    finally
    {
      break label61;
    }
    a.g();
    label60:
    return;
    label61:
    T1.a.b(localThrowable, k.class);
  }
  
  /* Error */
  public final boolean c()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 30	T1/a:d	(Ljava/lang/Object;)Z
    //   4: istore_1
    //   5: iconst_0
    //   6: istore_2
    //   7: iload_1
    //   8: ifeq +5 -> 13
    //   11: iconst_0
    //   12: ireturn
    //   13: invokestatic 71	x1/B:l	()Landroid/content/Context;
    //   16: astore_3
    //   17: aload_3
    //   18: invokevirtual 86	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   21: aload_3
    //   22: invokevirtual 90	android/content/Context:getPackageName	()Ljava/lang/String;
    //   25: sipush 128
    //   28: invokevirtual 96	android/content/pm/PackageManager:getApplicationInfo	(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    //   31: astore_3
    //   32: aload_3
    //   33: ldc 98
    //   35: invokestatic 104	kotlin/jvm/internal/Intrinsics:checkNotNullExpressionValue	(Ljava/lang/Object;Ljava/lang/String;)V
    //   38: aload_3
    //   39: getfield 110	android/content/pm/ApplicationInfo:metaData	Landroid/os/Bundle;
    //   42: ldc 112
    //   44: invokevirtual 118	android/os/BaseBundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   47: astore_3
    //   48: aload_3
    //   49: ifnonnull +5 -> 54
    //   52: iconst_0
    //   53: ireturn
    //   54: aload_3
    //   55: iconst_1
    //   56: anewarray 120	java/lang/String
    //   59: dup
    //   60: iconst_0
    //   61: ldc 122
    //   63: aastore
    //   64: iconst_0
    //   65: iconst_3
    //   66: iconst_2
    //   67: aconst_null
    //   68: invokestatic 128	kotlin/text/i:V	(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;
    //   71: iconst_0
    //   72: invokeinterface 133 2 0
    //   77: checkcast 120	java/lang/String
    //   80: invokestatic 139	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   83: istore 4
    //   85: iload 4
    //   87: iconst_2
    //   88: if_icmplt +5 -> 93
    //   91: iconst_1
    //   92: istore_2
    //   93: iload_2
    //   94: ireturn
    //   95: astore_3
    //   96: aload_3
    //   97: aload_0
    //   98: invokestatic 38	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   101: iconst_0
    //   102: ireturn
    //   103: astore_3
    //   104: goto -3 -> 101
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	107	0	this	k
    //   4	4	1	bool1	boolean
    //   6	88	2	bool2	boolean
    //   16	39	3	localObject	Object
    //   95	2	3	localThrowable	Throwable
    //   103	1	3	localException	Exception
    //   83	6	4	i	int
    // Exception table:
    //   from	to	target	type
    //   13	48	95	finally
    //   54	85	95	finally
    //   13	48	103	java/lang/Exception
    //   54	85	103	java/lang/Exception
  }
}

/* Location:
 * Qualified Name:     E1.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */