package nc;

import ec.i;
import java.util.concurrent.CancellationException;
import tc.g;
import ub.e;
import x6.b;

public abstract class p0<T>
  extends g
{
  public int c;
  
  public p0(int paramInt)
  {
    c = paramInt;
  }
  
  public void a(Object paramObject, CancellationException paramCancellationException) {}
  
  public abstract e<T> d();
  
  public Throwable f(Object paramObject)
  {
    boolean bool = paramObject instanceof u;
    Throwable localThrowable = null;
    if (bool) {
      paramObject = (u)paramObject;
    } else {
      paramObject = null;
    }
    if (paramObject != null) {
      localThrowable = a;
    }
    return localThrowable;
  }
  
  public <T> T g(Object paramObject)
  {
    return (T)paramObject;
  }
  
  public final void i(Throwable paramThrowable1, Throwable paramThrowable2)
  {
    if ((paramThrowable1 == null) && (paramThrowable2 == null)) {
      return;
    }
    if ((paramThrowable1 != null) && (paramThrowable2 != null)) {
      b.e(paramThrowable1, paramThrowable2);
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
    i.b(localThrowable);
    paramThrowable1 = new f0(paramThrowable1, localThrowable);
    c0.a(d().getContext(), paramThrowable1);
  }
  
  public abstract Object k();
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 85	tc/g:b	Ltc/h;
    //   4: astore_1
    //   5: aload_0
    //   6: invokevirtual 68	nc/p0:d	()Lub/e;
    //   9: astore_2
    //   10: aload_2
    //   11: ldc 87
    //   13: invokestatic 90	ec/i:c	(Ljava/lang/Object;Ljava/lang/String;)V
    //   16: aload_2
    //   17: checkcast 92	sc/g
    //   20: astore_2
    //   21: aload_2
    //   22: getfield 95	sc/g:e	Lub/e;
    //   25: astore_3
    //   26: aload_2
    //   27: getfield 99	sc/g:o	Ljava/lang/Object;
    //   30: astore_2
    //   31: aload_3
    //   32: invokeinterface 74 1 0
    //   37: astore 4
    //   39: aload 4
    //   41: aload_2
    //   42: invokestatic 104	sc/w:c	(Lub/h;Ljava/lang/Object;)Ljava/lang/Object;
    //   45: astore 5
    //   47: aload 5
    //   49: getstatic 107	sc/w:a	Ld2/h0;
    //   52: if_acmpeq +16 -> 68
    //   55: aload_3
    //   56: aload 4
    //   58: aload 5
    //   60: invokestatic 112	nc/y:c	(Lub/e;Lub/h;Ljava/lang/Object;)Lnc/g2;
    //   63: astore 6
    //   65: goto +6 -> 71
    //   68: aconst_null
    //   69: astore 6
    //   71: aload_3
    //   72: invokeinterface 74 1 0
    //   77: astore_2
    //   78: aload_0
    //   79: invokevirtual 114	nc/p0:k	()Ljava/lang/Object;
    //   82: astore 7
    //   84: aload_0
    //   85: aload 7
    //   87: invokevirtual 116	nc/p0:f	(Ljava/lang/Object;)Ljava/lang/Throwable;
    //   90: astore 8
    //   92: aload 8
    //   94: ifnonnull +59 -> 153
    //   97: aload_0
    //   98: getfield 14	nc/p0:c	I
    //   101: istore 9
    //   103: iconst_1
    //   104: istore 10
    //   106: iload 10
    //   108: istore 11
    //   110: iload 9
    //   112: iconst_1
    //   113: if_icmpeq +19 -> 132
    //   116: iload 9
    //   118: iconst_2
    //   119: if_icmpne +10 -> 129
    //   122: iload 10
    //   124: istore 11
    //   126: goto +6 -> 132
    //   129: iconst_0
    //   130: istore 11
    //   132: iload 11
    //   134: ifeq +19 -> 153
    //   137: aload_2
    //   138: getstatic 121	nc/j1$b:a	Lnc/j1$b;
    //   141: invokeinterface 127 2 0
    //   146: checkcast 129	nc/j1
    //   149: astore_2
    //   150: goto +5 -> 155
    //   153: aconst_null
    //   154: astore_2
    //   155: aload_2
    //   156: ifnull +38 -> 194
    //   159: aload_2
    //   160: invokeinterface 133 1 0
    //   165: ifne +29 -> 194
    //   168: aload_2
    //   169: invokeinterface 137 1 0
    //   174: astore_2
    //   175: aload_0
    //   176: aload 7
    //   178: aload_2
    //   179: invokevirtual 139	nc/p0:a	(Ljava/lang/Object;Ljava/util/concurrent/CancellationException;)V
    //   182: aload_2
    //   183: invokestatic 144	rb/f:a	(Ljava/lang/Throwable;)Lrb/e$a;
    //   186: astore_2
    //   187: goto +28 -> 215
    //   190: astore_2
    //   191: goto +86 -> 277
    //   194: aload 8
    //   196: ifnull +12 -> 208
    //   199: aload 8
    //   201: invokestatic 144	rb/f:a	(Ljava/lang/Throwable;)Lrb/e$a;
    //   204: astore_2
    //   205: goto +10 -> 215
    //   208: aload_0
    //   209: aload 7
    //   211: invokevirtual 146	nc/p0:g	(Ljava/lang/Object;)Ljava/lang/Object;
    //   214: astore_2
    //   215: aload_3
    //   216: aload_2
    //   217: invokeinterface 149 2 0
    //   222: getstatic 154	rb/h:a	Lrb/h;
    //   225: astore_2
    //   226: aload 6
    //   228: ifnull +11 -> 239
    //   231: aload 6
    //   233: invokevirtual 159	nc/g2:e0	()Z
    //   236: ifeq +10 -> 246
    //   239: aload 4
    //   241: aload 5
    //   243: invokestatic 162	sc/w:a	(Lub/h;Ljava/lang/Object;)V
    //   246: aload_1
    //   247: invokeinterface 166 1 0
    //   252: getstatic 154	rb/h:a	Lrb/h;
    //   255: astore_2
    //   256: goto +9 -> 265
    //   259: astore_2
    //   260: aload_2
    //   261: invokestatic 144	rb/f:a	(Ljava/lang/Throwable;)Lrb/e$a;
    //   264: astore_2
    //   265: aload_0
    //   266: aconst_null
    //   267: aload_2
    //   268: invokestatic 170	rb/e:a	(Ljava/lang/Object;)Ljava/lang/Throwable;
    //   271: invokevirtual 172	nc/p0:i	(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    //   274: goto +56 -> 330
    //   277: aload 6
    //   279: ifnull +11 -> 290
    //   282: aload 6
    //   284: invokevirtual 159	nc/g2:e0	()Z
    //   287: ifeq +10 -> 297
    //   290: aload 4
    //   292: aload 5
    //   294: invokestatic 162	sc/w:a	(Lub/h;Ljava/lang/Object;)V
    //   297: aload_2
    //   298: athrow
    //   299: astore 6
    //   301: aload_1
    //   302: invokeinterface 166 1 0
    //   307: getstatic 154	rb/h:a	Lrb/h;
    //   310: astore_2
    //   311: goto +9 -> 320
    //   314: astore_2
    //   315: aload_2
    //   316: invokestatic 144	rb/f:a	(Ljava/lang/Throwable;)Lrb/e$a;
    //   319: astore_2
    //   320: aload_0
    //   321: aload 6
    //   323: aload_2
    //   324: invokestatic 170	rb/e:a	(Ljava/lang/Object;)Ljava/lang/Throwable;
    //   327: invokevirtual 172	nc/p0:i	(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    //   330: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	331	0	this	p0
    //   4	298	1	localh	tc.h
    //   9	178	2	localObject1	Object
    //   190	1	2	localObject2	Object
    //   204	52	2	localObject3	Object
    //   259	2	2	localThrowable1	Throwable
    //   264	47	2	localObject4	Object
    //   314	2	2	localThrowable2	Throwable
    //   319	5	2	locala	rb.e.a
    //   25	191	3	locale	e
    //   37	254	4	localh1	ub.h
    //   45	248	5	localObject5	Object
    //   63	220	6	localg2	g2
    //   299	23	6	localThrowable3	Throwable
    //   82	128	7	localObject6	Object
    //   90	110	8	localThrowable4	Throwable
    //   101	19	9	i	int
    //   104	19	10	j	int
    //   108	25	11	k	int
    // Exception table:
    //   from	to	target	type
    //   71	92	190	finally
    //   97	103	190	finally
    //   137	150	190	finally
    //   159	187	190	finally
    //   199	205	190	finally
    //   208	215	190	finally
    //   215	226	190	finally
    //   246	256	259	finally
    //   5	65	299	finally
    //   231	239	299	finally
    //   239	246	299	finally
    //   282	290	299	finally
    //   290	297	299	finally
    //   297	299	299	finally
    //   301	311	314	finally
  }
}

/* Location:
 * Qualified Name:     nc.p0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */