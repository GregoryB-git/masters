package K1;

import H1.f.a;
import O1.r;
import O1.v;
import android.app.Activity;
import java.io.File;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import x1.B;

public final class e
{
  public static final e a = new e();
  public static final AtomicBoolean b = new AtomicBoolean(false);
  public static final Set c = new LinkedHashSet();
  public static final Set d = new LinkedHashSet();
  
  /* Error */
  public static final void b()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc 2
    //   5: invokestatic 41	T1/a:d	(Ljava/lang/Object;)Z
    //   8: istore_0
    //   9: iload_0
    //   10: ifeq +7 -> 17
    //   13: ldc 2
    //   15: monitorexit
    //   16: return
    //   17: invokestatic 47	x1/B:t	()Ljava/util/concurrent/Executor;
    //   20: astore_1
    //   21: new 49	K1/d
    //   24: astore_2
    //   25: aload_2
    //   26: invokespecial 50	K1/d:<init>	()V
    //   29: aload_1
    //   30: aload_2
    //   31: invokeinterface 56 2 0
    //   36: ldc 2
    //   38: monitorexit
    //   39: return
    //   40: astore_1
    //   41: aload_1
    //   42: ldc 2
    //   44: invokestatic 59	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   47: ldc 2
    //   49: monitorexit
    //   50: return
    //   51: astore_1
    //   52: ldc 2
    //   54: monitorexit
    //   55: aload_1
    //   56: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   8	2	0	bool	boolean
    //   20	10	1	localExecutor	java.util.concurrent.Executor
    //   40	2	1	localThrowable	Throwable
    //   51	5	1	localObject	Object
    //   24	7	2	locald	d
    // Exception table:
    //   from	to	target	type
    //   17	36	40	finally
    //   3	9	51	finally
    //   41	47	51	finally
  }
  
  public static final void c()
  {
    if (T1.a.d(e.class)) {
      return;
    }
    try
    {
      AtomicBoolean localAtomicBoolean = b;
      if (localAtomicBoolean.get()) {
        return;
      }
      localAtomicBoolean.set(true);
      a.d();
      return;
    }
    finally
    {
      T1.a.b(localThrowable, e.class);
    }
  }
  
  public static final boolean e(String paramString)
  {
    if (T1.a.d(e.class)) {
      return false;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramString, "event");
      boolean bool = d.contains(paramString);
      return bool;
    }
    finally
    {
      T1.a.b(paramString, e.class);
    }
    return false;
  }
  
  public static final boolean f(String paramString)
  {
    if (T1.a.d(e.class)) {
      return false;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramString, "event");
      boolean bool = c.contains(paramString);
      return bool;
    }
    finally
    {
      T1.a.b(paramString, e.class);
    }
    return false;
  }
  
  /* Error */
  public static final void h(Activity paramActivity)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 41	T1/a:d	(Ljava/lang/Object;)Z
    //   5: ifeq +4 -> 9
    //   8: return
    //   9: aload_0
    //   10: ldc 90
    //   12: invokestatic 78	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   15: getstatic 25	K1/e:b	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   18: invokevirtual 63	java/util/concurrent/atomic/AtomicBoolean:get	()Z
    //   21: ifeq +48 -> 69
    //   24: invokestatic 94	K1/a:f	()Z
    //   27: ifeq +42 -> 69
    //   30: getstatic 30	K1/e:c	Ljava/util/Set;
    //   33: invokeinterface 97 1 0
    //   38: ifeq +21 -> 59
    //   41: getstatic 32	K1/e:d	Ljava/util/Set;
    //   44: invokeinterface 97 1 0
    //   49: ifne +20 -> 69
    //   52: goto +7 -> 59
    //   55: astore_0
    //   56: goto +21 -> 77
    //   59: getstatic 103	K1/g:r	LK1/g$a;
    //   62: aload_0
    //   63: invokevirtual 107	K1/g$a:a	(Landroid/app/Activity;)V
    //   66: goto +10 -> 76
    //   69: getstatic 103	K1/g:r	LK1/g$a;
    //   72: aload_0
    //   73: invokevirtual 109	K1/g$a:b	(Landroid/app/Activity;)V
    //   76: return
    //   77: aload_0
    //   78: ldc 2
    //   80: invokestatic 59	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   83: return
    //   84: astore_0
    //   85: goto -9 -> 76
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	88	0	paramActivity	Activity
    // Exception table:
    //   from	to	target	type
    //   9	15	55	finally
    //   15	52	55	finally
    //   59	66	55	finally
    //   69	76	55	finally
    //   15	52	84	java/lang/Exception
    //   59	66	84	java/lang/Exception
    //   69	76	84	java/lang/Exception
  }
  
  public final void d()
  {
    if (T1.a.d(this)) {
      return;
    }
    try
    {
      try
      {
        Object localObject1 = v.a;
        localObject1 = v.q(B.m(), false);
        if (localObject1 == null) {
          return;
        }
        localObject1 = ((r)localObject1).m();
        if (localObject1 == null) {
          return;
        }
        g((String)localObject1);
        if (!(c.isEmpty() ^ true)) {
          if (!(d.isEmpty() ^ true)) {
            break label113;
          }
        }
      }
      finally
      {
        break label108;
      }
      localObject3 = H1.f.a;
      localObject3 = H1.f.l(f.a.p);
      if (localObject3 == null) {
        return;
      }
      a.d((File)localObject3);
      localObject3 = G1.f.l();
      if (localObject3 == null) {
        break label113;
      }
      h((Activity)localObject3);
    }
    catch (Exception localException)
    {
      Object localObject3;
      label108:
      label113:
      for (;;) {}
    }
    T1.a.b((Throwable)localObject3, this);
  }
  
  /* Error */
  public final void g(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 41	T1/a:d	(Ljava/lang/Object;)Z
    //   4: ifeq +4 -> 8
    //   7: return
    //   8: new 159	org/json/JSONObject
    //   11: astore_2
    //   12: aload_2
    //   13: aload_1
    //   14: invokespecial 161	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   17: aload_2
    //   18: ldc -93
    //   20: invokevirtual 166	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   23: istore_3
    //   24: iconst_0
    //   25: istore 4
    //   27: iload_3
    //   28: ifeq +81 -> 109
    //   31: aload_2
    //   32: ldc -93
    //   34: invokevirtual 170	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   37: astore 5
    //   39: aload 5
    //   41: invokevirtual 176	org/json/JSONArray:length	()I
    //   44: istore 6
    //   46: iload 6
    //   48: ifle +61 -> 109
    //   51: iconst_0
    //   52: istore 7
    //   54: iload 7
    //   56: iconst_1
    //   57: iadd
    //   58: istore 8
    //   60: getstatic 30	K1/e:c	Ljava/util/Set;
    //   63: astore 9
    //   65: aload 5
    //   67: iload 7
    //   69: invokevirtual 180	org/json/JSONArray:getString	(I)Ljava/lang/String;
    //   72: astore_1
    //   73: aload_1
    //   74: ldc -74
    //   76: invokestatic 185	kotlin/jvm/internal/Intrinsics:checkNotNullExpressionValue	(Ljava/lang/Object;Ljava/lang/String;)V
    //   79: aload 9
    //   81: aload_1
    //   82: invokeinterface 188 2 0
    //   87: pop
    //   88: iload 8
    //   90: iload 6
    //   92: if_icmplt +6 -> 98
    //   95: goto +14 -> 109
    //   98: iload 8
    //   100: istore 7
    //   102: goto -48 -> 54
    //   105: astore_1
    //   106: goto +84 -> 190
    //   109: aload_2
    //   110: ldc -66
    //   112: invokevirtual 166	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   115: ifeq +80 -> 195
    //   118: aload_2
    //   119: ldc -66
    //   121: invokevirtual 170	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   124: astore_2
    //   125: aload_2
    //   126: invokevirtual 176	org/json/JSONArray:length	()I
    //   129: istore 8
    //   131: iload 8
    //   133: ifle +62 -> 195
    //   136: iload 4
    //   138: istore 7
    //   140: iload 7
    //   142: iconst_1
    //   143: iadd
    //   144: istore 4
    //   146: getstatic 32	K1/e:d	Ljava/util/Set;
    //   149: astore 9
    //   151: aload_2
    //   152: iload 7
    //   154: invokevirtual 180	org/json/JSONArray:getString	(I)Ljava/lang/String;
    //   157: astore_1
    //   158: aload_1
    //   159: ldc -74
    //   161: invokestatic 185	kotlin/jvm/internal/Intrinsics:checkNotNullExpressionValue	(Ljava/lang/Object;Ljava/lang/String;)V
    //   164: aload 9
    //   166: aload_1
    //   167: invokeinterface 188 2 0
    //   172: pop
    //   173: iload 4
    //   175: iload 8
    //   177: if_icmplt +6 -> 183
    //   180: goto +15 -> 195
    //   183: iload 4
    //   185: istore 7
    //   187: goto -47 -> 140
    //   190: aload_1
    //   191: aload_0
    //   192: invokestatic 59	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   195: return
    //   196: astore_1
    //   197: goto -2 -> 195
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	200	0	this	e
    //   0	200	1	paramString	String
    //   11	141	2	localObject	Object
    //   23	5	3	bool	boolean
    //   25	159	4	i	int
    //   37	29	5	localJSONArray	org.json.JSONArray
    //   44	49	6	j	int
    //   52	134	7	k	int
    //   58	120	8	m	int
    //   63	102	9	localSet	Set
    // Exception table:
    //   from	to	target	type
    //   8	24	105	finally
    //   31	46	105	finally
    //   60	88	105	finally
    //   109	131	105	finally
    //   146	173	105	finally
    //   8	24	196	java/lang/Exception
    //   31	46	196	java/lang/Exception
    //   60	88	196	java/lang/Exception
    //   109	131	196	java/lang/Exception
    //   146	173	196	java/lang/Exception
  }
}

/* Location:
 * Qualified Name:     K1.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */