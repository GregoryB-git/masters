package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

public final class C
{
  public final F1 a;
  public f3 b;
  public d c;
  public final b d;
  
  public C()
  {
    this(new F1());
  }
  
  public C(F1 paramF1)
  {
    a = paramF1;
    b = b.d();
    c = new d();
    d = new b();
    paramF1.b("internal.registerCallback", new a(this));
    paramF1.b("internal.eventLogger", new D0(this));
  }
  
  public final d a()
  {
    return c;
  }
  
  /* Error */
  public final void b(q2 paramq2)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: getfield 25	com/google/android/gms/internal/measurement/C:a	Lcom/google/android/gms/internal/measurement/F1;
    //   5: getfield 27	com/google/android/gms/internal/measurement/F1:b	Lcom/google/android/gms/internal/measurement/f3;
    //   8: invokevirtual 32	com/google/android/gms/internal/measurement/f3:d	()Lcom/google/android/gms/internal/measurement/f3;
    //   11: putfield 33	com/google/android/gms/internal/measurement/C:b	Lcom/google/android/gms/internal/measurement/f3;
    //   14: aload_1
    //   15: invokevirtual 66	com/google/android/gms/internal/measurement/q2:I	()Ljava/util/List;
    //   18: astore_2
    //   19: aload_0
    //   20: getfield 25	com/google/android/gms/internal/measurement/C:a	Lcom/google/android/gms/internal/measurement/F1;
    //   23: aload_0
    //   24: getfield 33	com/google/android/gms/internal/measurement/C:b	Lcom/google/android/gms/internal/measurement/f3;
    //   27: aload_2
    //   28: iconst_0
    //   29: anewarray 68	com/google/android/gms/internal/measurement/r2
    //   32: invokeinterface 74 2 0
    //   37: checkcast 76	[Lcom/google/android/gms/internal/measurement/r2;
    //   40: invokevirtual 79	com/google/android/gms/internal/measurement/F1:a	(Lcom/google/android/gms/internal/measurement/f3;[Lcom/google/android/gms/internal/measurement/r2;)Lcom/google/android/gms/internal/measurement/s;
    //   43: instanceof 81
    //   46: ifne +237 -> 283
    //   49: aload_1
    //   50: invokevirtual 85	com/google/android/gms/internal/measurement/q2:G	()Lcom/google/android/gms/internal/measurement/o2;
    //   53: invokevirtual 88	com/google/android/gms/internal/measurement/o2:I	()Ljava/util/List;
    //   56: invokeinterface 92 1 0
    //   61: astore_3
    //   62: aload_3
    //   63: invokeinterface 98 1 0
    //   68: ifeq +214 -> 282
    //   71: aload_3
    //   72: invokeinterface 102 1 0
    //   77: checkcast 104	com/google/android/gms/internal/measurement/p2
    //   80: astore_2
    //   81: aload_2
    //   82: invokevirtual 105	com/google/android/gms/internal/measurement/p2:I	()Ljava/util/List;
    //   85: astore_1
    //   86: aload_2
    //   87: invokevirtual 109	com/google/android/gms/internal/measurement/p2:H	()Ljava/lang/String;
    //   90: astore_2
    //   91: aload_1
    //   92: invokeinterface 92 1 0
    //   97: astore 4
    //   99: aload 4
    //   101: invokeinterface 98 1 0
    //   106: ifeq -44 -> 62
    //   109: aload 4
    //   111: invokeinterface 102 1 0
    //   116: checkcast 68	com/google/android/gms/internal/measurement/r2
    //   119: astore_1
    //   120: aload_0
    //   121: getfield 25	com/google/android/gms/internal/measurement/C:a	Lcom/google/android/gms/internal/measurement/F1;
    //   124: aload_0
    //   125: getfield 33	com/google/android/gms/internal/measurement/C:b	Lcom/google/android/gms/internal/measurement/f3;
    //   128: iconst_1
    //   129: anewarray 68	com/google/android/gms/internal/measurement/r2
    //   132: dup
    //   133: iconst_0
    //   134: aload_1
    //   135: aastore
    //   136: invokevirtual 79	com/google/android/gms/internal/measurement/F1:a	(Lcom/google/android/gms/internal/measurement/f3;[Lcom/google/android/gms/internal/measurement/r2;)Lcom/google/android/gms/internal/measurement/s;
    //   139: astore 5
    //   141: aload 5
    //   143: instanceof 111
    //   146: ifeq +124 -> 270
    //   149: aload_0
    //   150: getfield 33	com/google/android/gms/internal/measurement/C:b	Lcom/google/android/gms/internal/measurement/f3;
    //   153: astore_1
    //   154: aload_1
    //   155: aload_2
    //   156: invokevirtual 115	com/google/android/gms/internal/measurement/f3:g	(Ljava/lang/String;)Z
    //   159: ifne +8 -> 167
    //   162: aconst_null
    //   163: astore_1
    //   164: goto +21 -> 185
    //   167: aload_1
    //   168: aload_2
    //   169: invokevirtual 118	com/google/android/gms/internal/measurement/f3:c	(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/s;
    //   172: astore_1
    //   173: aload_1
    //   174: instanceof 120
    //   177: ifeq +63 -> 240
    //   180: aload_1
    //   181: checkcast 120	com/google/android/gms/internal/measurement/n
    //   184: astore_1
    //   185: aload_1
    //   186: ifnull +24 -> 210
    //   189: aload_1
    //   190: aload_0
    //   191: getfield 33	com/google/android/gms/internal/measurement/C:b	Lcom/google/android/gms/internal/measurement/f3;
    //   194: aload 5
    //   196: invokestatic 126	java/util/Collections:singletonList	(Ljava/lang/Object;)Ljava/util/List;
    //   199: invokevirtual 129	com/google/android/gms/internal/measurement/n:b	(Lcom/google/android/gms/internal/measurement/f3;Ljava/util/List;)Lcom/google/android/gms/internal/measurement/s;
    //   202: pop
    //   203: goto -104 -> 99
    //   206: astore_1
    //   207: goto +88 -> 295
    //   210: new 131	java/lang/IllegalStateException
    //   213: astore_3
    //   214: new 133	java/lang/StringBuilder
    //   217: astore_1
    //   218: aload_1
    //   219: ldc -121
    //   221: invokespecial 138	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   224: aload_1
    //   225: aload_2
    //   226: invokevirtual 142	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   229: pop
    //   230: aload_3
    //   231: aload_1
    //   232: invokevirtual 145	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   235: invokespecial 146	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   238: aload_3
    //   239: athrow
    //   240: new 131	java/lang/IllegalStateException
    //   243: astore_1
    //   244: new 133	java/lang/StringBuilder
    //   247: astore_3
    //   248: aload_3
    //   249: ldc -108
    //   251: invokespecial 138	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   254: aload_3
    //   255: aload_2
    //   256: invokevirtual 142	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   259: pop
    //   260: aload_1
    //   261: aload_3
    //   262: invokevirtual 145	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   265: invokespecial 146	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   268: aload_1
    //   269: athrow
    //   270: new 150	java/lang/IllegalArgumentException
    //   273: astore_1
    //   274: aload_1
    //   275: ldc -104
    //   277: invokespecial 153	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   280: aload_1
    //   281: athrow
    //   282: return
    //   283: new 131	java/lang/IllegalStateException
    //   286: astore_1
    //   287: aload_1
    //   288: ldc -101
    //   290: invokespecial 146	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   293: aload_1
    //   294: athrow
    //   295: new 157	com/google/android/gms/internal/measurement/d0
    //   298: dup
    //   299: aload_1
    //   300: invokespecial 160	com/google/android/gms/internal/measurement/d0:<init>	(Ljava/lang/Throwable;)V
    //   303: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	304	0	this	C
    //   0	304	1	paramq2	q2
    //   18	238	2	localObject1	Object
    //   61	201	3	localObject2	Object
    //   97	13	4	localIterator	java.util.Iterator
    //   139	56	5	locals	s
    // Exception table:
    //   from	to	target	type
    //   0	62	206	finally
    //   62	99	206	finally
    //   99	162	206	finally
    //   167	185	206	finally
    //   189	203	206	finally
    //   210	240	206	finally
    //   240	270	206	finally
    //   270	282	206	finally
    //   283	295	206	finally
  }
  
  public final void c(String paramString, Callable paramCallable)
  {
    a.b(paramString, paramCallable);
  }
  
  public final boolean d(e parame)
  {
    label80:
    try
    {
      c.b(parame);
      parame = a.c;
      k localk = new com/google/android/gms/internal/measurement/k;
      localk.<init>(Double.valueOf(0.0D));
      parame.h("runtime.counter", localk);
      d.b(b.d(), c);
      if (!g())
      {
        boolean bool = f();
        if (!bool) {}
      }
    }
    finally
    {
      break label80;
      return true;
    }
  }
  
  public final boolean f()
  {
    return !c.f().isEmpty();
  }
  
  public final boolean g()
  {
    return !c.d().equals(c.a());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.C
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */