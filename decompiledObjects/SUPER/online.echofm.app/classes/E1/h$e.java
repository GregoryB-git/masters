package E1;

import T1.a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class h$e
  implements InvocationHandler
{
  public Runnable a;
  
  public h$e(h paramh, Runnable paramRunnable)
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
    //   9: ldc 44
    //   11: invokestatic 23	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_1
    //   15: invokeinterface 50 1 0
    //   20: astore_2
    //   21: aload_2
    //   22: invokeinterface 56 1 0
    //   27: ifeq +117 -> 144
    //   30: aload_2
    //   31: invokeinterface 60 1 0
    //   36: astore_3
    //   37: getstatic 65	E1/m:a	LE1/m;
    //   40: astore_1
    //   41: aload_0
    //   42: getfield 27	E1/h$e:b	LE1/h;
    //   45: invokestatic 69	E1/h:j	(LE1/h;)Ljava/lang/Class;
    //   48: aload_0
    //   49: getfield 27	E1/h$e:b	LE1/h;
    //   52: invokestatic 72	E1/h:d	(LE1/h;)Ljava/lang/reflect/Method;
    //   55: aload_3
    //   56: iconst_0
    //   57: anewarray 4	java/lang/Object
    //   60: invokestatic 75	E1/m:e	(Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   63: astore_1
    //   64: aload_1
    //   65: instanceof 77
    //   68: ifeq +15 -> 83
    //   71: aload_1
    //   72: checkcast 77	java/lang/String
    //   75: astore_1
    //   76: goto +9 -> 85
    //   79: astore_1
    //   80: goto +74 -> 154
    //   83: aconst_null
    //   84: astore_1
    //   85: aload_1
    //   86: ifnonnull +6 -> 92
    //   89: goto -68 -> 21
    //   92: new 79	org/json/JSONObject
    //   95: astore_3
    //   96: aload_3
    //   97: aload_1
    //   98: invokespecial 82	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   101: aload_3
    //   102: ldc 84
    //   104: invokevirtual 88	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   107: ifeq -86 -> 21
    //   110: aload_3
    //   111: ldc 84
    //   113: invokevirtual 92	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   116: astore_1
    //   117: getstatic 96	E1/h:s	LE1/h$b;
    //   120: invokevirtual 101	E1/h$b:e	()Ljava/util/Map;
    //   123: astore 4
    //   125: aload_1
    //   126: ldc 103
    //   128: invokestatic 106	kotlin/jvm/internal/Intrinsics:checkNotNullExpressionValue	(Ljava/lang/Object;Ljava/lang/String;)V
    //   131: aload 4
    //   133: aload_1
    //   134: aload_3
    //   135: invokeinterface 112 3 0
    //   140: pop
    //   141: goto -120 -> 21
    //   144: aload_0
    //   145: getfield 32	E1/h$e:a	Ljava/lang/Runnable;
    //   148: invokeinterface 117 1 0
    //   153: return
    //   154: aload_1
    //   155: aload_0
    //   156: invokestatic 120	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   159: return
    //   160: astore_1
    //   161: goto -140 -> 21
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	164	0	this	e
    //   0	164	1	paramList	List
    //   20	11	2	localIterator	java.util.Iterator
    //   36	99	3	localObject	Object
    //   123	9	4	localMap	java.util.Map
    // Exception table:
    //   from	to	target	type
    //   8	21	79	finally
    //   21	37	79	finally
    //   37	76	79	finally
    //   92	141	79	finally
    //   144	153	79	finally
    //   37	76	160	java/lang/Exception
    //   92	141	160	java/lang/Exception
  }
  
  public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    if (a.d(this)) {
      return null;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramObject, "proxy");
      Intrinsics.checkNotNullParameter(paramMethod, "m");
      if (Intrinsics.a(paramMethod.getName(), "onSkuDetailsResponse"))
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
 * Qualified Name:     E1.h.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */