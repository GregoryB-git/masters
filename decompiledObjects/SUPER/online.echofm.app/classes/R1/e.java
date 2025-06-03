package R1;

import O1.P;
import Q1.c.a;
import Q1.k;
import T1.a;
import W5.m;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import x1.F.b;

public final class e
{
  public static final e a = new e();
  public static final AtomicBoolean b = new AtomicBoolean(false);
  
  public static final void c()
  {
    label56:
    try
    {
      boolean bool = a.d(e.class);
      if (bool) {
        return;
      }
      try
      {
        bool = b.getAndSet(true);
        if (bool) {
          return;
        }
        if (x1.B.p()) {
          d();
        }
      }
      finally
      {
        break label56;
      }
      b.d();
      return;
    }
    finally {}
    a.b(localThrowable, e.class);
  }
  
  public static final void d()
  {
    if (a.d(e.class)) {
      return;
    }
    try
    {
      if (P.Z()) {
        return;
      }
      File[] arrayOfFile = k.l();
      Object localObject3 = new java/util/ArrayList;
      ((ArrayList)localObject3).<init>(arrayOfFile.length);
      int i = arrayOfFile.length;
      for (int j = 0; j < i; j++) {
        ((Collection)localObject3).add(c.a.d(arrayOfFile[j]));
      }
      Object localObject2;
      Object localObject4;
      label218:
      return;
    }
    finally
    {
      break label218;
      localObject2 = new java/util/ArrayList;
      ((ArrayList)localObject2).<init>();
      localObject4 = ((Iterable)localObject3).iterator();
      while (((Iterator)localObject4).hasNext())
      {
        localObject3 = ((Iterator)localObject4).next();
        if (((Q1.c)localObject3).f()) {
          ((Collection)localObject2).add(localObject3);
        }
      }
      localObject3 = new R1/c;
      ((c)localObject3).<init>();
      localObject3 = m.E((Iterable)localObject2, (Comparator)localObject3);
      localObject2 = new org/json/JSONArray;
      ((JSONArray)localObject2).<init>();
      localObject4 = l6.d.g(0, Math.min(((List)localObject3).size(), 5)).iterator();
      while (((Iterator)localObject4).hasNext()) {
        ((JSONArray)localObject2).put(((List)localObject3).get(((W5.B)localObject4).b()));
      }
      localObject4 = k.a;
      localObject4 = new R1/d;
      ((d)localObject4).<init>((List)localObject3);
      k.s("anr_reports", (JSONArray)localObject2, (F.b)localObject4);
      return;
      a.b((Throwable)localObject2, e.class);
    }
  }
  
  public static final int e(Q1.c paramc1, Q1.c paramc2)
  {
    if (a.d(e.class)) {
      return 0;
    }
    try
    {
      Intrinsics.checkNotNullExpressionValue(paramc2, "o2");
      int i = paramc1.b(paramc2);
      return i;
    }
    finally
    {
      a.b(paramc1, e.class);
    }
    return 0;
  }
  
  /* Error */
  public static final void f(List paramList, x1.K paramK)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 39	T1/a:d	(Ljava/lang/Object;)Z
    //   5: ifeq +4 -> 9
    //   8: return
    //   9: aload_0
    //   10: ldc -82
    //   12: invokestatic 177	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload_1
    //   16: ldc -77
    //   18: invokestatic 177	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   21: aload_1
    //   22: invokevirtual 184	x1/K:b	()Lx1/r;
    //   25: ifnonnull +75 -> 100
    //   28: aload_1
    //   29: invokevirtual 187	x1/K:d	()Lorg/json/JSONObject;
    //   32: astore_1
    //   33: aload_1
    //   34: ifnonnull +8 -> 42
    //   37: aconst_null
    //   38: astore_1
    //   39: goto +13 -> 52
    //   42: aload_1
    //   43: ldc -67
    //   45: invokevirtual 195	org/json/JSONObject:getBoolean	(Ljava/lang/String;)Z
    //   48: invokestatic 201	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   51: astore_1
    //   52: aload_1
    //   53: getstatic 205	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   56: invokestatic 208	kotlin/jvm/internal/Intrinsics:a	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   59: ifeq +41 -> 100
    //   62: aload_0
    //   63: checkcast 86	java/lang/Iterable
    //   66: invokeinterface 90 1 0
    //   71: astore_0
    //   72: aload_0
    //   73: invokeinterface 95 1 0
    //   78: ifeq +22 -> 100
    //   81: aload_0
    //   82: invokeinterface 99 1 0
    //   87: checkcast 101	Q1/c
    //   90: invokevirtual 210	Q1/c:a	()V
    //   93: goto -21 -> 72
    //   96: astore_0
    //   97: goto +4 -> 101
    //   100: return
    //   101: aload_0
    //   102: ldc 2
    //   104: invokestatic 57	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   107: return
    //   108: astore_0
    //   109: goto -9 -> 100
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	112	0	paramList	List
    //   0	112	1	paramK	x1.K
    // Exception table:
    //   from	to	target	type
    //   9	21	96	finally
    //   21	33	96	finally
    //   42	52	96	finally
    //   52	72	96	finally
    //   72	93	96	finally
    //   21	33	108	org/json/JSONException
    //   42	52	108	org/json/JSONException
    //   52	72	108	org/json/JSONException
    //   72	93	108	org/json/JSONException
  }
}

/* Location:
 * Qualified Name:     R1.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */