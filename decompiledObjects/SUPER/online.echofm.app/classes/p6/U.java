package p6;

import V5.a;
import X5.d;
import kotlin.jvm.internal.Intrinsics;
import w6.h;

public abstract class U
  extends h
{
  public int q;
  
  public U(int paramInt)
  {
    q = paramInt;
  }
  
  public abstract void b(Object paramObject, Throwable paramThrowable);
  
  public abstract d c();
  
  public Throwable e(Object paramObject)
  {
    boolean bool = paramObject instanceof z;
    Throwable localThrowable = null;
    if (bool) {
      paramObject = (z)paramObject;
    } else {
      paramObject = null;
    }
    if (paramObject != null) {
      localThrowable = a;
    }
    return localThrowable;
  }
  
  public Object f(Object paramObject)
  {
    return paramObject;
  }
  
  public final void h(Throwable paramThrowable1, Throwable paramThrowable2)
  {
    if ((paramThrowable1 == null) && (paramThrowable2 == null)) {
      return;
    }
    if ((paramThrowable1 != null) && (paramThrowable2 != null)) {
      a.a(paramThrowable1, paramThrowable2);
    }
    Throwable localThrowable = paramThrowable1;
    if (paramThrowable1 == null) {
      localThrowable = paramThrowable2;
    }
    paramThrowable1 = new StringBuilder();
    paramThrowable1.append("Fatal exception in coroutines machinery for ");
    paramThrowable1.append(this);
    paramThrowable1.append(". Please read KDoc to 'handleFatalException' method and report this incident to maintainers");
    paramThrowable1 = paramThrowable1.toString();
    Intrinsics.b(localThrowable);
    paramThrowable1 = new L(paramThrowable1, localThrowable);
    H.a(c().getContext(), paramThrowable1);
  }
  
  public abstract Object i();
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 82	w6/h:p	Lw6/i;
    //   4: astore_1
    //   5: aload_0
    //   6: invokevirtual 64	p6/U:c	()LX5/d;
    //   9: astore_2
    //   10: aload_2
    //   11: ldc 84
    //   13: invokestatic 87	kotlin/jvm/internal/Intrinsics:c	(Ljava/lang/Object;Ljava/lang/String;)V
    //   16: aload_2
    //   17: checkcast 89	u6/j
    //   20: astore_2
    //   21: aload_2
    //   22: getfield 93	u6/j:s	LX5/d;
    //   25: astore_3
    //   26: aload_2
    //   27: getfield 97	u6/j:u	Ljava/lang/Object;
    //   30: astore_2
    //   31: aload_3
    //   32: invokeinterface 70 1 0
    //   37: astore 4
    //   39: aload 4
    //   41: aload_2
    //   42: invokestatic 102	u6/J:c	(LX5/g;Ljava/lang/Object;)Ljava/lang/Object;
    //   45: astore 5
    //   47: aload 5
    //   49: getstatic 105	u6/J:a	Lu6/F;
    //   52: if_acmpeq +21 -> 73
    //   55: aload_3
    //   56: aload 4
    //   58: aload 5
    //   60: invokestatic 111	p6/E:g	(LX5/d;LX5/g;Ljava/lang/Object;)Lp6/N0;
    //   63: astore 6
    //   65: goto +11 -> 76
    //   68: astore 6
    //   70: goto +241 -> 311
    //   73: aconst_null
    //   74: astore 6
    //   76: aload_3
    //   77: invokeinterface 70 1 0
    //   82: astore_2
    //   83: aload_0
    //   84: invokevirtual 113	p6/U:i	()Ljava/lang/Object;
    //   87: astore 7
    //   89: aload_0
    //   90: aload 7
    //   92: invokevirtual 115	p6/U:e	(Ljava/lang/Object;)Ljava/lang/Throwable;
    //   95: astore 8
    //   97: aload 8
    //   99: ifnonnull +33 -> 132
    //   102: aload_0
    //   103: getfield 13	p6/U:q	I
    //   106: invokestatic 120	p6/V:b	(I)Z
    //   109: ifeq +23 -> 132
    //   112: aload_2
    //   113: getstatic 126	p6/q0:n	Lp6/q0$b;
    //   116: invokeinterface 131 2 0
    //   121: checkcast 122	p6/q0
    //   124: astore_2
    //   125: goto +9 -> 134
    //   128: astore_2
    //   129: goto +160 -> 289
    //   132: aconst_null
    //   133: astore_2
    //   134: aload_2
    //   135: ifnull +49 -> 184
    //   138: aload_2
    //   139: invokeinterface 134 1 0
    //   144: ifne +40 -> 184
    //   147: aload_2
    //   148: invokeinterface 137 1 0
    //   153: astore_2
    //   154: aload_0
    //   155: aload 7
    //   157: aload_2
    //   158: invokevirtual 139	p6/U:b	(Ljava/lang/Object;Ljava/lang/Throwable;)V
    //   161: getstatic 145	V5/n:o	LV5/n$a;
    //   164: astore 7
    //   166: aload_2
    //   167: invokestatic 150	V5/o:a	(Ljava/lang/Throwable;)Ljava/lang/Object;
    //   170: invokestatic 152	V5/n:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   173: astore_2
    //   174: aload_3
    //   175: aload_2
    //   176: invokeinterface 155 2 0
    //   181: goto +41 -> 222
    //   184: aload 8
    //   186: ifnull +19 -> 205
    //   189: getstatic 145	V5/n:o	LV5/n$a;
    //   192: astore_2
    //   193: aload 8
    //   195: invokestatic 150	V5/o:a	(Ljava/lang/Throwable;)Ljava/lang/Object;
    //   198: invokestatic 152	V5/n:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   201: astore_2
    //   202: goto -28 -> 174
    //   205: getstatic 145	V5/n:o	LV5/n$a;
    //   208: astore_2
    //   209: aload_0
    //   210: aload 7
    //   212: invokevirtual 157	p6/U:f	(Ljava/lang/Object;)Ljava/lang/Object;
    //   215: invokestatic 152	V5/n:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   218: astore_2
    //   219: goto -45 -> 174
    //   222: getstatic 162	V5/t:a	LV5/t;
    //   225: astore_2
    //   226: aload 6
    //   228: ifnull +11 -> 239
    //   231: aload 6
    //   233: invokevirtual 167	p6/N0:K0	()Z
    //   236: ifeq +10 -> 246
    //   239: aload 4
    //   241: aload 5
    //   243: invokestatic 170	u6/J:a	(LX5/g;Ljava/lang/Object;)V
    //   246: aload_1
    //   247: invokeinterface 174 1 0
    //   252: getstatic 162	V5/t:a	LV5/t;
    //   255: invokestatic 152	V5/n:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   258: astore_2
    //   259: goto +18 -> 277
    //   262: astore 6
    //   264: getstatic 145	V5/n:o	LV5/n$a;
    //   267: astore_2
    //   268: aload 6
    //   270: invokestatic 150	V5/o:a	(Ljava/lang/Throwable;)Ljava/lang/Object;
    //   273: invokestatic 152	V5/n:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   276: astore_2
    //   277: aload_0
    //   278: aconst_null
    //   279: aload_2
    //   280: invokestatic 176	V5/n:b	(Ljava/lang/Object;)Ljava/lang/Throwable;
    //   283: invokevirtual 178	p6/U:h	(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    //   286: goto +68 -> 354
    //   289: aload 6
    //   291: ifnull +11 -> 302
    //   294: aload 6
    //   296: invokevirtual 167	p6/N0:K0	()Z
    //   299: ifeq +10 -> 309
    //   302: aload 4
    //   304: aload 5
    //   306: invokestatic 170	u6/J:a	(LX5/g;Ljava/lang/Object;)V
    //   309: aload_2
    //   310: athrow
    //   311: getstatic 145	V5/n:o	LV5/n$a;
    //   314: astore_2
    //   315: aload_1
    //   316: invokeinterface 174 1 0
    //   321: getstatic 162	V5/t:a	LV5/t;
    //   324: invokestatic 152	V5/n:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   327: astore_2
    //   328: goto +16 -> 344
    //   331: astore_2
    //   332: getstatic 145	V5/n:o	LV5/n$a;
    //   335: astore_1
    //   336: aload_2
    //   337: invokestatic 150	V5/o:a	(Ljava/lang/Throwable;)Ljava/lang/Object;
    //   340: invokestatic 152	V5/n:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   343: astore_2
    //   344: aload_0
    //   345: aload 6
    //   347: aload_2
    //   348: invokestatic 176	V5/n:b	(Ljava/lang/Object;)Ljava/lang/Throwable;
    //   351: invokevirtual 178	p6/U:h	(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    //   354: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	355	0	this	U
    //   4	332	1	localObject1	Object
    //   9	116	2	localObject2	Object
    //   128	1	2	localObject3	Object
    //   133	195	2	localObject4	Object
    //   331	6	2	localThrowable1	Throwable
    //   343	5	2	localObject5	Object
    //   25	150	3	locald	d
    //   37	266	4	localg	X5.g
    //   45	260	5	localObject6	Object
    //   63	1	6	localN0	N0
    //   68	1	6	localObject7	Object
    //   74	158	6	localObject8	Object
    //   262	84	6	localThrowable2	Throwable
    //   87	124	7	localObject9	Object
    //   95	99	8	localThrowable3	Throwable
    // Exception table:
    //   from	to	target	type
    //   5	65	68	finally
    //   231	239	68	finally
    //   239	246	68	finally
    //   294	302	68	finally
    //   302	309	68	finally
    //   309	311	68	finally
    //   76	97	128	finally
    //   102	125	128	finally
    //   138	174	128	finally
    //   174	181	128	finally
    //   189	202	128	finally
    //   205	219	128	finally
    //   222	226	128	finally
    //   246	259	262	finally
    //   311	328	331	finally
  }
}

/* Location:
 * Qualified Name:     p6.U
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */