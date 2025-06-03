package lb;

import eb.t0.b;
import java.lang.ref.Reference;
import ma.b1;
import ma.s0;
import ma.w;
import x6.b;

public final class b$a<T extends s0>
  implements t0.b
{
  public static final ThreadLocal<Reference<byte[]>> d = new ThreadLocal();
  public final b1<T> a;
  public final T b;
  public final int c;
  
  public b$a(w paramw)
  {
    b.y(paramw, "defaultInstance cannot be null");
    b = paramw;
    a = paramw.v();
    c = -1;
  }
  
  /* Error */
  public final s0 a(java.io.InputStream paramInputStream)
  {
    // Byte code:
    //   0: aload_1
    //   1: instanceof 61
    //   4: ifeq +46 -> 50
    //   7: aload_1
    //   8: checkcast 61	lb/a
    //   11: getfield 63	lb/a:b	Lma/b1;
    //   14: aload_0
    //   15: getfield 50	lb/b$a:a	Lma/b1;
    //   18: if_acmpne +32 -> 50
    //   21: aload_1
    //   22: checkcast 61	lb/a
    //   25: getfield 65	lb/a:a	Lma/s0;
    //   28: astore_2
    //   29: aload_2
    //   30: ifnull +8 -> 38
    //   33: aload_2
    //   34: astore_1
    //   35: goto +310 -> 345
    //   38: new 55	java/lang/IllegalStateException
    //   41: astore_2
    //   42: aload_2
    //   43: ldc 67
    //   45: invokespecial 70	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   48: aload_2
    //   49: athrow
    //   50: aconst_null
    //   51: astore_3
    //   52: aload_3
    //   53: astore_2
    //   54: aload_1
    //   55: instanceof 72
    //   58: ifeq +207 -> 265
    //   61: aload_1
    //   62: invokevirtual 78	java/io/InputStream:available	()I
    //   65: istore 4
    //   67: iload 4
    //   69: ifle +181 -> 250
    //   72: iload 4
    //   74: ldc 79
    //   76: if_icmpgt +174 -> 250
    //   79: getstatic 29	lb/b$a:d	Ljava/lang/ThreadLocal;
    //   82: astore 5
    //   84: aload 5
    //   86: invokevirtual 83	java/lang/ThreadLocal:get	()Ljava/lang/Object;
    //   89: checkcast 85	java/lang/ref/Reference
    //   92: astore_2
    //   93: aload_2
    //   94: ifnull +24 -> 118
    //   97: aload_2
    //   98: invokevirtual 86	java/lang/ref/Reference:get	()Ljava/lang/Object;
    //   101: checkcast 88	[B
    //   104: astore_3
    //   105: aload_3
    //   106: ifnull +12 -> 118
    //   109: aload_3
    //   110: astore_2
    //   111: aload_3
    //   112: arraylength
    //   113: iload 4
    //   115: if_icmpge +23 -> 138
    //   118: iload 4
    //   120: newarray <illegal type>
    //   122: astore_2
    //   123: new 90	java/lang/ref/WeakReference
    //   126: astore_3
    //   127: aload_3
    //   128: aload_2
    //   129: invokespecial 93	java/lang/ref/WeakReference:<init>	(Ljava/lang/Object;)V
    //   132: aload 5
    //   134: aload_3
    //   135: invokevirtual 96	java/lang/ThreadLocal:set	(Ljava/lang/Object;)V
    //   138: iload 4
    //   140: istore 6
    //   142: iload 6
    //   144: ifle +36 -> 180
    //   147: aload_1
    //   148: aload_2
    //   149: iload 4
    //   151: iload 6
    //   153: isub
    //   154: iload 6
    //   156: invokevirtual 100	java/io/InputStream:read	([BII)I
    //   159: istore 7
    //   161: iload 7
    //   163: iconst_m1
    //   164: if_icmpne +6 -> 170
    //   167: goto +13 -> 180
    //   170: iload 6
    //   172: iload 7
    //   174: isub
    //   175: istore 6
    //   177: goto -35 -> 142
    //   180: iload 6
    //   182: ifne +15 -> 197
    //   185: aload_2
    //   186: iconst_0
    //   187: iload 4
    //   189: iconst_0
    //   190: invokestatic 106	ma/i:f	([BIIZ)Lma/i$a;
    //   193: astore_2
    //   194: goto +71 -> 265
    //   197: new 108	java/lang/RuntimeException
    //   200: astore_1
    //   201: new 110	java/lang/StringBuilder
    //   204: astore_2
    //   205: aload_2
    //   206: invokespecial 111	java/lang/StringBuilder:<init>	()V
    //   209: aload_2
    //   210: ldc 113
    //   212: invokevirtual 117	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   215: pop
    //   216: aload_2
    //   217: iload 4
    //   219: invokevirtual 120	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   222: pop
    //   223: aload_2
    //   224: ldc 122
    //   226: invokevirtual 117	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   229: pop
    //   230: aload_2
    //   231: iload 4
    //   233: iload 6
    //   235: isub
    //   236: invokevirtual 120	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   239: pop
    //   240: aload_1
    //   241: aload_2
    //   242: invokevirtual 126	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   245: invokespecial 127	java/lang/RuntimeException:<init>	(Ljava/lang/String;)V
    //   248: aload_1
    //   249: athrow
    //   250: aload_3
    //   251: astore_2
    //   252: iload 4
    //   254: ifne +11 -> 265
    //   257: aload_0
    //   258: getfield 42	lb/b$a:b	Lma/s0;
    //   261: astore_1
    //   262: goto +83 -> 345
    //   265: aload_2
    //   266: astore_3
    //   267: aload_2
    //   268: ifnonnull +12 -> 280
    //   271: new 129	ma/i$c
    //   274: dup
    //   275: aload_1
    //   276: invokespecial 132	ma/i$c:<init>	(Ljava/io/InputStream;)V
    //   279: astore_3
    //   280: aload_3
    //   281: ldc -123
    //   283: putfield 134	ma/i:c	I
    //   286: aload_0
    //   287: getfield 52	lb/b$a:c	I
    //   290: istore 6
    //   292: iload 6
    //   294: iflt +32 -> 326
    //   297: iload 6
    //   299: iflt +12 -> 311
    //   302: aload_3
    //   303: iload 6
    //   305: putfield 136	ma/i:b	I
    //   308: goto +18 -> 326
    //   311: new 138	java/lang/IllegalArgumentException
    //   314: dup
    //   315: ldc -116
    //   317: iload 6
    //   319: invokestatic 145	f:h	(Ljava/lang/String;I)Ljava/lang/String;
    //   322: invokespecial 146	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   325: athrow
    //   326: aload_0
    //   327: getfield 50	lb/b$a:a	Lma/b1;
    //   330: aload_3
    //   331: getstatic 149	lb/b:a	Lma/o;
    //   334: invokeinterface 154 3 0
    //   339: astore_1
    //   340: aload_3
    //   341: iconst_0
    //   342: invokevirtual 157	ma/i:a	(I)V
    //   345: aload_1
    //   346: areturn
    //   347: astore_2
    //   348: aload_2
    //   349: aload_1
    //   350: putfield 158	ma/b0:a	Lma/s0;
    //   353: aload_2
    //   354: athrow
    //   355: astore_1
    //   356: new 160	eb/g1
    //   359: dup
    //   360: getstatic 166	eb/e1:m	Leb/e1;
    //   363: ldc -88
    //   365: invokevirtual 172	eb/e1:g	(Ljava/lang/String;)Leb/e1;
    //   368: aload_1
    //   369: invokevirtual 175	eb/e1:f	(Ljava/lang/Throwable;)Leb/e1;
    //   372: invokespecial 178	eb/g1:<init>	(Leb/e1;)V
    //   375: athrow
    //   376: astore_1
    //   377: new 108	java/lang/RuntimeException
    //   380: dup
    //   381: aload_1
    //   382: invokespecial 181	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   385: athrow
    //   386: astore_2
    //   387: goto -337 -> 50
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	390	0	this	a
    //   0	390	1	paramInputStream	java.io.InputStream
    //   28	240	2	localObject1	Object
    //   347	7	2	localb0	ma.b0
    //   386	1	2	localIllegalStateException	IllegalStateException
    //   51	290	3	localObject2	Object
    //   65	188	4	i	int
    //   82	51	5	localThreadLocal	ThreadLocal
    //   140	178	6	j	int
    //   159	16	7	k	int
    // Exception table:
    //   from	to	target	type
    //   340	345	347	ma/b0
    //   326	340	355	ma/b0
    //   348	355	355	ma/b0
    //   54	67	376	java/io/IOException
    //   79	93	376	java/io/IOException
    //   97	105	376	java/io/IOException
    //   111	118	376	java/io/IOException
    //   118	138	376	java/io/IOException
    //   147	161	376	java/io/IOException
    //   185	194	376	java/io/IOException
    //   197	250	376	java/io/IOException
    //   257	262	376	java/io/IOException
    //   21	29	386	java/lang/IllegalStateException
    //   38	50	386	java/lang/IllegalStateException
  }
  
  public final a b(Object paramObject)
  {
    return new a((s0)paramObject, a);
  }
}

/* Location:
 * Qualified Name:     lb.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */