package F1;

import H1.f;
import H1.f.a;
import O1.q;
import kotlin.jvm.internal.Intrinsics;
import x1.B;

public final class a
{
  public static final a a = new a();
  public static boolean b;
  public static boolean c;
  
  public static final void a()
  {
    if (T1.a.d(a.class)) {
      return;
    }
    try
    {
      b = true;
      q localq = q.a;
      c = q.d("FBSDKFeatureIntegritySample", B.m(), false);
      return;
    }
    finally
    {
      T1.a.b(localThrowable, a.class);
    }
  }
  
  /* Error */
  public static final void c(java.util.Map paramMap)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 24	T1/a:d	(Ljava/lang/Object;)Z
    //   5: ifeq +4 -> 9
    //   8: return
    //   9: aload_0
    //   10: ldc 52
    //   12: invokestatic 58	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   15: getstatic 26	F1/a:b	Z
    //   18: ifeq +189 -> 207
    //   21: aload_0
    //   22: invokeinterface 64 1 0
    //   27: istore_1
    //   28: iload_1
    //   29: ifeq +6 -> 35
    //   32: goto +175 -> 207
    //   35: aload_0
    //   36: invokeinterface 68 1 0
    //   41: invokestatic 74	W5/m:G	(Ljava/lang/Iterable;)Ljava/util/List;
    //   44: astore_2
    //   45: new 76	org/json/JSONObject
    //   48: astore_3
    //   49: aload_3
    //   50: invokespecial 77	org/json/JSONObject:<init>	()V
    //   53: aload_2
    //   54: invokeinterface 83 1 0
    //   59: astore 4
    //   61: aload 4
    //   63: invokeinterface 88 1 0
    //   68: ifeq +111 -> 179
    //   71: aload 4
    //   73: invokeinterface 92 1 0
    //   78: checkcast 94	java/lang/String
    //   81: astore 5
    //   83: aload_0
    //   84: aload 5
    //   86: invokeinterface 98 2 0
    //   91: astore_2
    //   92: aload_2
    //   93: ifnull +71 -> 164
    //   96: aload_2
    //   97: checkcast 94	java/lang/String
    //   100: astore_2
    //   101: getstatic 16	F1/a:a	LF1/a;
    //   104: astore 6
    //   106: aload 6
    //   108: aload 5
    //   110: invokevirtual 101	F1/a:d	(Ljava/lang/String;)Z
    //   113: ifne +19 -> 132
    //   116: aload 6
    //   118: aload_2
    //   119: invokevirtual 101	F1/a:d	(Ljava/lang/String;)Z
    //   122: ifeq -61 -> 61
    //   125: goto +7 -> 132
    //   128: astore_0
    //   129: goto +79 -> 208
    //   132: aload_0
    //   133: aload 5
    //   135: invokeinterface 104 2 0
    //   140: pop
    //   141: getstatic 44	F1/a:c	Z
    //   144: ifeq +6 -> 150
    //   147: goto +6 -> 153
    //   150: ldc 106
    //   152: astore_2
    //   153: aload_3
    //   154: aload 5
    //   156: aload_2
    //   157: invokevirtual 110	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   160: pop
    //   161: goto -100 -> 61
    //   164: new 112	java/lang/IllegalStateException
    //   167: astore_0
    //   168: aload_0
    //   169: ldc 114
    //   171: invokevirtual 117	java/lang/Object:toString	()Ljava/lang/String;
    //   174: invokespecial 120	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   177: aload_0
    //   178: athrow
    //   179: aload_3
    //   180: invokevirtual 124	org/json/JSONObject:length	()I
    //   183: ifeq +24 -> 207
    //   186: aload_3
    //   187: invokevirtual 125	org/json/JSONObject:toString	()Ljava/lang/String;
    //   190: astore_2
    //   191: aload_2
    //   192: ldc 127
    //   194: invokestatic 130	kotlin/jvm/internal/Intrinsics:checkNotNullExpressionValue	(Ljava/lang/Object;Ljava/lang/String;)V
    //   197: aload_0
    //   198: ldc -124
    //   200: aload_2
    //   201: invokeinterface 135 3 0
    //   206: pop
    //   207: return
    //   208: aload_0
    //   209: ldc 2
    //   211: invokestatic 47	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   214: return
    //   215: astore_0
    //   216: goto -9 -> 207
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	219	0	paramMap	java.util.Map
    //   27	2	1	bool	boolean
    //   44	157	2	localObject	Object
    //   48	139	3	localJSONObject	org.json.JSONObject
    //   59	13	4	localIterator	java.util.Iterator
    //   81	74	5	str	String
    //   104	13	6	locala	a
    // Exception table:
    //   from	to	target	type
    //   9	28	128	finally
    //   35	61	128	finally
    //   61	92	128	finally
    //   96	125	128	finally
    //   132	147	128	finally
    //   153	161	128	finally
    //   164	179	128	finally
    //   179	207	128	finally
    //   35	61	215	java/lang/Exception
    //   61	92	215	java/lang/Exception
    //   96	125	215	java/lang/Exception
    //   132	147	215	java/lang/Exception
    //   153	161	215	java/lang/Exception
    //   164	179	215	java/lang/Exception
    //   179	207	215	java/lang/Exception
  }
  
  public final String b(String paramString)
  {
    if (T1.a.d(this)) {
      return null;
    }
    try
    {
      Object localObject = new float[30];
      for (int i = 0; i < 30; i++) {
        localObject[i] = 0.0F;
      }
      f localf;
      label89:
      return null;
    }
    finally
    {
      break label89;
      localf = f.a;
      localObject = f.q(f.a.o, new float[][] { localObject }, new String[] { paramString });
      paramString = "none";
      if (localObject != null)
      {
        localObject = localObject[0];
        if (localObject != null) {
          paramString = (String)localObject;
        }
      }
      return paramString;
      T1.a.b(paramString, this);
    }
  }
  
  public final boolean d(String paramString)
  {
    if (T1.a.d(this)) {
      return false;
    }
    try
    {
      boolean bool = Intrinsics.a("none", b(paramString));
      return bool ^ true;
    }
    finally
    {
      T1.a.b(paramString, this);
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     F1.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */