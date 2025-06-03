package E1;

import T1.a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class h$c
  implements InvocationHandler
{
  public Runnable a;
  
  public h$c(h paramh, Runnable paramRunnable)
  {
    a = paramRunnable;
  }
  
  /* Error */
  public final void a(List paramList)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 42	T1/a:d	(Ljava/lang/Object;)Z
    //   4: ifeq +4 -> 8
    //   7: return
    //   8: aload_1
    //   9: invokeinterface 48 1 0
    //   14: astore_2
    //   15: aload_2
    //   16: invokeinterface 54 1 0
    //   21: ifeq +150 -> 171
    //   24: aload_2
    //   25: invokeinterface 58 1 0
    //   30: astore_3
    //   31: getstatic 63	E1/m:a	LE1/m;
    //   34: astore_1
    //   35: aload_0
    //   36: getfield 27	E1/h$c:b	LE1/h;
    //   39: invokestatic 67	E1/h:i	(LE1/h;)Ljava/lang/Class;
    //   42: aload_0
    //   43: getfield 27	E1/h$c:b	LE1/h;
    //   46: invokestatic 70	E1/h:c	(LE1/h;)Ljava/lang/reflect/Method;
    //   49: aload_3
    //   50: iconst_0
    //   51: anewarray 4	java/lang/Object
    //   54: invokestatic 74	E1/m:e	(Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   57: astore_1
    //   58: aload_1
    //   59: instanceof 76
    //   62: ifeq +15 -> 77
    //   65: aload_1
    //   66: checkcast 76	java/lang/String
    //   69: astore_1
    //   70: goto +9 -> 79
    //   73: astore_1
    //   74: goto +107 -> 181
    //   77: aconst_null
    //   78: astore_1
    //   79: aload_1
    //   80: ifnonnull +6 -> 86
    //   83: goto -68 -> 15
    //   86: new 78	org/json/JSONObject
    //   89: astore_3
    //   90: aload_3
    //   91: aload_1
    //   92: invokespecial 81	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   95: aload_3
    //   96: ldc 83
    //   98: aload_0
    //   99: getfield 27	E1/h$c:b	LE1/h;
    //   102: invokestatic 86	E1/h:b	(LE1/h;)Landroid/content/Context;
    //   105: invokevirtual 92	android/content/Context:getPackageName	()Ljava/lang/String;
    //   108: invokevirtual 96	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   111: pop
    //   112: aload_3
    //   113: ldc 98
    //   115: invokevirtual 102	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   118: ifeq -103 -> 15
    //   121: aload_3
    //   122: ldc 98
    //   124: invokevirtual 106	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   127: astore 4
    //   129: aload_0
    //   130: getfield 27	E1/h$c:b	LE1/h;
    //   133: invokestatic 109	E1/h:e	(LE1/h;)Ljava/util/Set;
    //   136: aload 4
    //   138: invokeinterface 114 2 0
    //   143: pop
    //   144: getstatic 118	E1/h:s	LE1/h$b;
    //   147: invokevirtual 123	E1/h$b:d	()Ljava/util/Map;
    //   150: astore_1
    //   151: aload 4
    //   153: ldc 125
    //   155: invokestatic 128	kotlin/jvm/internal/Intrinsics:checkNotNullExpressionValue	(Ljava/lang/Object;Ljava/lang/String;)V
    //   158: aload_1
    //   159: aload 4
    //   161: aload_3
    //   162: invokeinterface 133 3 0
    //   167: pop
    //   168: goto -153 -> 15
    //   171: aload_0
    //   172: getfield 32	E1/h$c:a	Ljava/lang/Runnable;
    //   175: invokeinterface 138 1 0
    //   180: return
    //   181: aload_1
    //   182: aload_0
    //   183: invokestatic 141	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   186: return
    //   187: astore_1
    //   188: goto -173 -> 15
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	191	0	this	c
    //   0	191	1	paramList	List
    //   14	11	2	localIterator	java.util.Iterator
    //   30	132	3	localObject	Object
    //   127	33	4	str	String
    // Exception table:
    //   from	to	target	type
    //   8	15	73	finally
    //   15	31	73	finally
    //   31	70	73	finally
    //   86	168	73	finally
    //   171	180	73	finally
    //   31	70	187	java/lang/Exception
    //   86	168	187	java/lang/Exception
  }
  
  public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    if (a.d(this)) {
      return null;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramObject, "proxy");
      Intrinsics.checkNotNullParameter(paramMethod, "method");
      if (Intrinsics.a(paramMethod.getName(), "onPurchaseHistoryResponse"))
      {
        if (paramArrayOfObject == null) {
          paramObject = null;
        } else {
          paramObject = paramArrayOfObject[1];
        }
        if ((paramObject != null) && ((paramObject instanceof List))) {
          a((List)paramObject);
        }
      }
    }
    finally
    {
      break label74;
    }
    return null;
    label74:
    a.b((Throwable)paramObject, this);
    return null;
  }
}

/* Location:
 * Qualified Name:     E1.h.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */