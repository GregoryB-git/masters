package b5;

import t5.k;
import t5.n;
import v3.i0;

public final class j
  extends a
{
  public final int o;
  public final long p;
  public final f q;
  public long r;
  public volatile boolean s;
  public boolean t;
  
  public j(k paramk, n paramn, i0 parami0, int paramInt1, Object paramObject, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, int paramInt2, long paramLong6, f paramf)
  {
    super(paramk, paramn, parami0, paramInt1, paramObject, paramLong1, paramLong2, paramLong3, paramLong4, paramLong5);
    o = paramInt2;
    p = paramLong6;
    q = paramf;
  }
  
  /* Error */
  public final void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 30	b5/j:r	J
    //   4: lconst_0
    //   5: lcmp
    //   6: ifne +150 -> 156
    //   9: aload_0
    //   10: getfield 34	b5/a:m	Lb5/c;
    //   13: astore_1
    //   14: aload_1
    //   15: invokestatic 40	x6/b:K	(Ljava/lang/Object;)V
    //   18: aload_0
    //   19: getfield 23	b5/j:p	J
    //   22: lstore_2
    //   23: aload_1
    //   24: getfield 46	b5/c:b	[Lz4/b0;
    //   27: astore 4
    //   29: aload 4
    //   31: arraylength
    //   32: istore 5
    //   34: iconst_0
    //   35: istore 6
    //   37: iload 6
    //   39: iload 5
    //   41: if_icmpge +38 -> 79
    //   44: aload 4
    //   46: iload 6
    //   48: aaload
    //   49: astore 7
    //   51: aload 7
    //   53: getfield 51	z4/b0:F	J
    //   56: lload_2
    //   57: lcmp
    //   58: ifeq +15 -> 73
    //   61: aload 7
    //   63: lload_2
    //   64: putfield 51	z4/b0:F	J
    //   67: aload 7
    //   69: iconst_1
    //   70: putfield 54	z4/b0:z	Z
    //   73: iinc 6 1
    //   76: goto -39 -> 37
    //   79: aload_0
    //   80: getfield 25	b5/j:q	Lb5/f;
    //   83: astore 7
    //   85: aload_0
    //   86: getfield 57	b5/a:k	J
    //   89: lstore_2
    //   90: ldc2_w 58
    //   93: lstore 8
    //   95: lload_2
    //   96: ldc2_w 58
    //   99: lcmp
    //   100: ifne +10 -> 110
    //   103: ldc2_w 58
    //   106: lstore_2
    //   107: goto +10 -> 117
    //   110: lload_2
    //   111: aload_0
    //   112: getfield 23	b5/j:p	J
    //   115: lsub
    //   116: lstore_2
    //   117: aload_0
    //   118: getfield 62	b5/a:l	J
    //   121: lstore 10
    //   123: lload 10
    //   125: ldc2_w 58
    //   128: lcmp
    //   129: ifne +6 -> 135
    //   132: goto +12 -> 144
    //   135: lload 10
    //   137: aload_0
    //   138: getfield 23	b5/j:p	J
    //   141: lsub
    //   142: lstore 8
    //   144: aload 7
    //   146: checkcast 64	b5/d
    //   149: aload_1
    //   150: lload_2
    //   151: lload 8
    //   153: invokevirtual 67	b5/d:a	(Lb5/f$a;JJ)V
    //   156: aload_0
    //   157: getfield 72	b5/e:b	Lt5/n;
    //   160: aload_0
    //   161: getfield 30	b5/j:r	J
    //   164: invokevirtual 77	t5/n:a	(J)Lt5/n;
    //   167: astore 7
    //   169: new 79	c4/e
    //   172: astore_1
    //   173: aload_0
    //   174: getfield 83	b5/e:i	Lt5/j0;
    //   177: astore 4
    //   179: aload_1
    //   180: aload 4
    //   182: aload 7
    //   184: getfield 86	t5/n:f	J
    //   187: aload 4
    //   189: aload 7
    //   191: invokevirtual 91	t5/j0:a	(Lt5/n;)J
    //   194: invokespecial 94	c4/e:<init>	(Lt5/h;JJ)V
    //   197: aload_0
    //   198: getfield 96	b5/j:s	Z
    //   201: ifne +71 -> 272
    //   204: aload_0
    //   205: getfield 25	b5/j:q	Lb5/f;
    //   208: checkcast 64	b5/d
    //   211: getfield 99	b5/d:a	Lc4/h;
    //   214: aload_1
    //   215: getstatic 102	b5/d:r	Lc4/s;
    //   218: invokeinterface 108 3 0
    //   223: istore 6
    //   225: iload 6
    //   227: iconst_1
    //   228: if_icmpeq +9 -> 237
    //   231: iconst_1
    //   232: istore 12
    //   234: goto +6 -> 240
    //   237: iconst_0
    //   238: istore 12
    //   240: iload 12
    //   242: invokestatic 112	x6/b:H	(Z)V
    //   245: iload 6
    //   247: ifne +9 -> 256
    //   250: iconst_1
    //   251: istore 6
    //   253: goto +6 -> 259
    //   256: iconst_0
    //   257: istore 6
    //   259: iload 6
    //   261: ifeq +11 -> 272
    //   264: goto -67 -> 197
    //   267: astore 7
    //   269: goto +37 -> 306
    //   272: aload_0
    //   273: aload_1
    //   274: getfield 114	c4/e:d	J
    //   277: aload_0
    //   278: getfield 72	b5/e:b	Lt5/n;
    //   281: getfield 86	t5/n:f	J
    //   284: lsub
    //   285: putfield 30	b5/j:r	J
    //   288: aload_0
    //   289: getfield 83	b5/e:i	Lt5/j0;
    //   292: invokestatic 119	b/z:d	(Lt5/k;)V
    //   295: aload_0
    //   296: aload_0
    //   297: getfield 96	b5/j:s	Z
    //   300: iconst_1
    //   301: ixor
    //   302: putfield 121	b5/j:t	Z
    //   305: return
    //   306: aload_0
    //   307: aload_1
    //   308: getfield 114	c4/e:d	J
    //   311: aload_0
    //   312: getfield 72	b5/e:b	Lt5/n;
    //   315: getfield 86	t5/n:f	J
    //   318: lsub
    //   319: putfield 30	b5/j:r	J
    //   322: aload 7
    //   324: athrow
    //   325: astore_1
    //   326: aload_0
    //   327: getfield 83	b5/e:i	Lt5/j0;
    //   330: invokestatic 119	b/z:d	(Lt5/k;)V
    //   333: aload_1
    //   334: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	335	0	this	j
    //   13	295	1	localObject1	Object
    //   325	9	1	localObject2	Object
    //   22	129	2	l1	long
    //   27	161	4	localObject3	Object
    //   32	10	5	i	int
    //   35	225	6	j	int
    //   49	141	7	localObject4	Object
    //   267	56	7	localObject5	Object
    //   93	59	8	l2	long
    //   121	15	10	l3	long
    //   232	9	12	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   197	225	267	finally
    //   240	245	267	finally
    //   156	197	325	finally
    //   272	288	325	finally
    //   306	325	325	finally
  }
  
  public final void b()
  {
    s = true;
  }
  
  public final long c()
  {
    return j + o;
  }
  
  public final boolean d()
  {
    return t;
  }
}

/* Location:
 * Qualified Name:     b5.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */