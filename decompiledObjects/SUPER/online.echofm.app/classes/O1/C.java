package O1;

import android.util.Log;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import kotlin.text.i;
import x1.B;
import x1.N;

public final class C
{
  public static final a e = new a(null);
  public static final HashMap f = new HashMap();
  public final N a;
  public final String b;
  public StringBuilder c;
  public int d = 3;
  
  public C(N paramN, String paramString)
  {
    a = paramN;
    b = Intrinsics.i("FacebookSDK.", Q.k(paramString, "tag"));
    c = new StringBuilder();
  }
  
  public final void b(String paramString)
  {
    Intrinsics.checkNotNullParameter(paramString, "string");
    if (g()) {
      c.append(paramString);
    }
  }
  
  public final void c(String paramString, Object... paramVarArgs)
  {
    Intrinsics.checkNotNullParameter(paramString, "format");
    Intrinsics.checkNotNullParameter(paramVarArgs, "args");
    if (g())
    {
      StringBuilder localStringBuilder = c;
      x localx = x.a;
      paramVarArgs = Arrays.copyOf(paramVarArgs, paramVarArgs.length);
      paramString = String.format(paramString, Arrays.copyOf(paramVarArgs, paramVarArgs.length));
      Intrinsics.checkNotNullExpressionValue(paramString, "java.lang.String.format(format, *args)");
      localStringBuilder.append(paramString);
    }
  }
  
  public final void d(String paramString, Object paramObject)
  {
    Intrinsics.checkNotNullParameter(paramString, "key");
    Intrinsics.checkNotNullParameter(paramObject, "value");
    c("  %s:\t%s\n", new Object[] { paramString, paramObject });
  }
  
  public final void e()
  {
    String str = c.toString();
    Intrinsics.checkNotNullExpressionValue(str, "contents.toString()");
    f(str);
    c = new StringBuilder();
  }
  
  public final void f(String paramString)
  {
    Intrinsics.checkNotNullParameter(paramString, "string");
    e.a(a, d, b, paramString);
  }
  
  public final boolean g()
  {
    B localB = B.a;
    return B.H(a);
  }
  
  public static final class a
  {
    public final void a(N paramN, int paramInt, String paramString1, String paramString2)
    {
      Intrinsics.checkNotNullParameter(paramN, "behavior");
      Intrinsics.checkNotNullParameter(paramString1, "tag");
      Intrinsics.checkNotNullParameter(paramString2, "string");
      if (B.H(paramN))
      {
        String str = f(paramString2);
        paramString2 = paramString1;
        if (!i.s(paramString1, "FacebookSDK.", false, 2, null)) {
          paramString2 = Intrinsics.i("FacebookSDK.", paramString1);
        }
        Log.println(paramInt, paramString2, str);
        if (paramN == N.t) {
          new Exception().printStackTrace();
        }
      }
    }
    
    public final void b(N paramN, String paramString1, String paramString2)
    {
      Intrinsics.checkNotNullParameter(paramN, "behavior");
      Intrinsics.checkNotNullParameter(paramString1, "tag");
      Intrinsics.checkNotNullParameter(paramString2, "string");
      a(paramN, 3, paramString1, paramString2);
    }
    
    public final void c(N paramN, String paramString1, String paramString2, Object... paramVarArgs)
    {
      Intrinsics.checkNotNullParameter(paramN, "behavior");
      Intrinsics.checkNotNullParameter(paramString1, "tag");
      Intrinsics.checkNotNullParameter(paramString2, "format");
      Intrinsics.checkNotNullParameter(paramVarArgs, "args");
      if (B.H(paramN))
      {
        x localx = x.a;
        paramVarArgs = Arrays.copyOf(paramVarArgs, paramVarArgs.length);
        paramString2 = String.format(paramString2, Arrays.copyOf(paramVarArgs, paramVarArgs.length));
        Intrinsics.checkNotNullExpressionValue(paramString2, "java.lang.String.format(format, *args)");
        a(paramN, 3, paramString1, paramString2);
      }
    }
    
    /* Error */
    public final void d(String paramString)
    {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_1
      //   3: ldc 104
      //   5: invokestatic 23	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
      //   8: getstatic 107	x1/B:a	Lx1/B;
      //   11: astore_2
      //   12: getstatic 110	x1/N:p	Lx1/N;
      //   15: invokestatic 33	x1/B:H	(Lx1/N;)Z
      //   18: ifne +17 -> 35
      //   21: aload_0
      //   22: aload_1
      //   23: ldc 112
      //   25: invokevirtual 116	O1/C$a:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   28: goto +7 -> 35
      //   31: astore_1
      //   32: goto +6 -> 38
      //   35: aload_0
      //   36: monitorexit
      //   37: return
      //   38: aload_0
      //   39: monitorexit
      //   40: aload_1
      //   41: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	42	0	this	a
      //   0	42	1	paramString	String
      //   11	1	2	localB	B
      // Exception table:
      //   from	to	target	type
      //   2	28	31	finally
    }
    
    public final void e(String paramString1, String paramString2)
    {
      try
      {
        Intrinsics.checkNotNullParameter(paramString1, "original");
        Intrinsics.checkNotNullParameter(paramString2, "replace");
        C.a().put(paramString1, paramString2);
        return;
      }
      finally
      {
        paramString1 = finally;
        throw paramString1;
      }
    }
    
    /* Error */
    public final String f(String paramString)
    {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: invokestatic 123	O1/C:a	()Ljava/util/HashMap;
      //   5: invokeinterface 133 1 0
      //   10: invokeinterface 139 1 0
      //   15: astore_2
      //   16: aload_2
      //   17: invokeinterface 145 1 0
      //   22: ifeq +46 -> 68
      //   25: aload_2
      //   26: invokeinterface 149 1 0
      //   31: checkcast 151	java/util/Map$Entry
      //   34: astore_3
      //   35: aload_1
      //   36: aload_3
      //   37: invokeinterface 154 1 0
      //   42: checkcast 92	java/lang/String
      //   45: aload_3
      //   46: invokeinterface 157 1 0
      //   51: checkcast 92	java/lang/String
      //   54: iconst_0
      //   55: iconst_4
      //   56: aconst_null
      //   57: invokestatic 161	kotlin/text/i:q	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
      //   60: astore_1
      //   61: goto -45 -> 16
      //   64: astore_1
      //   65: goto +7 -> 72
      //   68: aload_0
      //   69: monitorexit
      //   70: aload_1
      //   71: areturn
      //   72: aload_0
      //   73: monitorexit
      //   74: aload_1
      //   75: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	76	0	this	a
      //   0	76	1	paramString	String
      //   15	11	2	localIterator	java.util.Iterator
      //   34	12	3	localEntry	java.util.Map.Entry
      // Exception table:
      //   from	to	target	type
      //   2	16	64	finally
      //   16	61	64	finally
    }
  }
}

/* Location:
 * Qualified Name:     O1.C
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */