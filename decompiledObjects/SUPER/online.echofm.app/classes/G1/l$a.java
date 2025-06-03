package G1;

import java.lang.reflect.InvocationHandler;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.u;

public final class l$a
  implements InvocationHandler
{
  public l$a(Object paramObject, u paramu, ReentrantLock paramReentrantLock, Condition paramCondition) {}
  
  /* Error */
  public Object invoke(Object paramObject, java.lang.reflect.Method paramMethod, Object[] paramArrayOfObject)
  {
    // Byte code:
    //   0: aload_2
    //   1: ldc 36
    //   3: invokestatic 42	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_3
    //   7: ldc 44
    //   9: invokestatic 42	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   12: aload_2
    //   13: invokevirtual 50	java/lang/reflect/Method:getName	()Ljava/lang/String;
    //   16: ldc 52
    //   18: invokestatic 55	kotlin/jvm/internal/Intrinsics:a	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   21: ifeq +249 -> 270
    //   24: aload_3
    //   25: arraylength
    //   26: iconst_1
    //   27: if_icmpne +243 -> 270
    //   30: aload_3
    //   31: iconst_0
    //   32: aaload
    //   33: astore_1
    //   34: aload_1
    //   35: instanceof 57
    //   38: ifeq +232 -> 270
    //   41: aload_1
    //   42: checkcast 57	java/util/List
    //   45: invokeinterface 61 1 0
    //   50: astore_3
    //   51: aload_3
    //   52: invokeinterface 67 1 0
    //   57: ifeq +213 -> 270
    //   60: aload_3
    //   61: invokeinterface 71 1 0
    //   66: astore_1
    //   67: aload_1
    //   68: ifnull -17 -> 51
    //   71: aload_1
    //   72: invokevirtual 75	java/lang/Object:getClass	()Ljava/lang/Class;
    //   75: ldc 77
    //   77: iconst_0
    //   78: anewarray 79	java/lang/Class
    //   81: invokevirtual 83	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   84: astore_2
    //   85: aload_2
    //   86: ldc 85
    //   88: invokestatic 88	kotlin/jvm/internal/Intrinsics:checkNotNullExpressionValue	(Ljava/lang/Object;Ljava/lang/String;)V
    //   91: aload_1
    //   92: invokevirtual 75	java/lang/Object:getClass	()Ljava/lang/Class;
    //   95: ldc 90
    //   97: iconst_0
    //   98: anewarray 79	java/lang/Class
    //   101: invokevirtual 83	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   104: astore 4
    //   106: aload 4
    //   108: ldc 92
    //   110: invokestatic 88	kotlin/jvm/internal/Intrinsics:checkNotNullExpressionValue	(Ljava/lang/Object;Ljava/lang/String;)V
    //   113: aload_2
    //   114: aload_1
    //   115: iconst_0
    //   116: anewarray 4	java/lang/Object
    //   119: invokevirtual 95	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   122: ifnonnull -71 -> 51
    //   125: aload 4
    //   127: aload_1
    //   128: iconst_0
    //   129: anewarray 4	java/lang/Object
    //   132: invokevirtual 95	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   135: aload_0
    //   136: getfield 22	G1/l$a:a	Ljava/lang/Object;
    //   139: invokestatic 55	kotlin/jvm/internal/Intrinsics:a	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   142: ifeq -91 -> 51
    //   145: aload_1
    //   146: invokevirtual 75	java/lang/Object:getClass	()Ljava/lang/Class;
    //   149: ldc 97
    //   151: iconst_0
    //   152: anewarray 79	java/lang/Class
    //   155: invokevirtual 83	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   158: astore_2
    //   159: aload_2
    //   160: ldc 99
    //   162: invokestatic 88	kotlin/jvm/internal/Intrinsics:checkNotNullExpressionValue	(Ljava/lang/Object;Ljava/lang/String;)V
    //   165: aload_2
    //   166: aload_1
    //   167: iconst_0
    //   168: anewarray 4	java/lang/Object
    //   171: invokevirtual 95	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   174: astore_1
    //   175: aload_1
    //   176: ifnull +72 -> 248
    //   179: aload_1
    //   180: checkcast 101	[B
    //   183: astore_2
    //   184: aload_0
    //   185: getfield 24	G1/l$a:b	Lkotlin/jvm/internal/u;
    //   188: astore_1
    //   189: new 103	java/math/BigInteger
    //   192: astore_3
    //   193: aload_3
    //   194: iconst_1
    //   195: aload_2
    //   196: invokespecial 106	java/math/BigInteger:<init>	(I[B)V
    //   199: aload_1
    //   200: aload_3
    //   201: bipush 16
    //   203: invokevirtual 110	java/math/BigInteger:toString	(I)Ljava/lang/String;
    //   206: putfield 115	kotlin/jvm/internal/u:o	Ljava/lang/Object;
    //   209: aload_0
    //   210: getfield 26	G1/l$a:c	Ljava/util/concurrent/locks/ReentrantLock;
    //   213: invokevirtual 120	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   216: aload_0
    //   217: getfield 28	G1/l$a:d	Ljava/util/concurrent/locks/Condition;
    //   220: invokeinterface 125 1 0
    //   225: aload_0
    //   226: getfield 26	G1/l$a:c	Ljava/util/concurrent/locks/ReentrantLock;
    //   229: invokevirtual 128	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   232: aconst_null
    //   233: areturn
    //   234: astore_1
    //   235: goto +25 -> 260
    //   238: astore_1
    //   239: aload_0
    //   240: getfield 26	G1/l$a:c	Ljava/util/concurrent/locks/ReentrantLock;
    //   243: invokevirtual 128	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   246: aload_1
    //   247: athrow
    //   248: new 130	java/lang/NullPointerException
    //   251: astore_1
    //   252: aload_1
    //   253: ldc -124
    //   255: invokespecial 135	java/lang/NullPointerException:<init>	(Ljava/lang/String;)V
    //   258: aload_1
    //   259: athrow
    //   260: invokestatic 137	G1/l:a	()Ljava/lang/String;
    //   263: ldc -117
    //   265: aload_1
    //   266: invokestatic 144	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   269: pop
    //   270: aconst_null
    //   271: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	272	0	this	a
    //   0	272	1	paramObject	Object
    //   0	272	2	paramMethod	java.lang.reflect.Method
    //   0	272	3	paramArrayOfObject	Object[]
    //   104	22	4	localMethod	java.lang.reflect.Method
    // Exception table:
    //   from	to	target	type
    //   12	30	234	finally
    //   34	51	234	finally
    //   51	67	234	finally
    //   71	175	234	finally
    //   179	216	234	finally
    //   225	232	234	finally
    //   239	248	234	finally
    //   248	260	234	finally
    //   216	225	238	finally
  }
}

/* Location:
 * Qualified Name:     G1.l.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */