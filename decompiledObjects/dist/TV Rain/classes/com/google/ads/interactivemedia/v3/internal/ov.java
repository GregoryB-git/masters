package com.google.ads.interactivemedia.v3.internal;

public final class ov
  extends oi
{
  private static final gf l = new gf();
  private final int m;
  private final long n;
  private final on o;
  private long p;
  private volatile boolean q;
  private boolean r;
  
  public ov(tt paramtt, tx paramtx, bw parambw, int paramInt1, Object paramObject, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, int paramInt2, long paramLong6, on paramon)
  {
    super(paramtt, paramtx, parambw, paramInt1, paramObject, paramLong1, paramLong2, paramLong3, paramLong4, paramLong5);
    m = paramInt2;
    n = paramLong6;
    o = paramon;
  }
  
  public final void a()
  {
    q = true;
  }
  
  /* Error */
  public final void b()
    throws java.io.IOException, java.lang.InterruptedException
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 50	com/google/ads/interactivemedia/v3/internal/ok:c	Lcom/google/ads/interactivemedia/v3/internal/tx;
    //   4: aload_0
    //   5: getfield 52	com/google/ads/interactivemedia/v3/internal/ov:p	J
    //   8: invokevirtual 57	com/google/ads/interactivemedia/v3/internal/tx:a	(J)Lcom/google/ads/interactivemedia/v3/internal/tx;
    //   11: astore_1
    //   12: new 59	com/google/ads/interactivemedia/v3/internal/fz
    //   15: astore_2
    //   16: aload_0
    //   17: getfield 63	com/google/ads/interactivemedia/v3/internal/ok:j	Lcom/google/ads/interactivemedia/v3/internal/vd;
    //   20: astore_3
    //   21: aload_2
    //   22: aload_3
    //   23: aload_1
    //   24: getfield 66	com/google/ads/interactivemedia/v3/internal/tx:e	J
    //   27: aload_3
    //   28: aload_1
    //   29: invokevirtual 71	com/google/ads/interactivemedia/v3/internal/vd:a	(Lcom/google/ads/interactivemedia/v3/internal/tx;)J
    //   32: invokespecial 74	com/google/ads/interactivemedia/v3/internal/fz:<init>	(Lcom/google/ads/interactivemedia/v3/internal/tt;JJ)V
    //   35: aload_0
    //   36: getfield 52	com/google/ads/interactivemedia/v3/internal/ov:p	J
    //   39: lconst_0
    //   40: lcmp
    //   41: ifne +94 -> 135
    //   44: aload_0
    //   45: invokevirtual 77	com/google/ads/interactivemedia/v3/internal/oi:c	()Lcom/google/ads/interactivemedia/v3/internal/op;
    //   48: astore_3
    //   49: aload_3
    //   50: aload_0
    //   51: getfield 34	com/google/ads/interactivemedia/v3/internal/ov:n	J
    //   54: invokevirtual 82	com/google/ads/interactivemedia/v3/internal/op:a	(J)V
    //   57: aload_0
    //   58: getfield 36	com/google/ads/interactivemedia/v3/internal/ov:o	Lcom/google/ads/interactivemedia/v3/internal/on;
    //   61: astore_1
    //   62: aload_0
    //   63: getfield 84	com/google/ads/interactivemedia/v3/internal/oi:a	J
    //   66: lstore 4
    //   68: ldc2_w 85
    //   71: lstore 6
    //   73: lload 4
    //   75: ldc2_w 85
    //   78: lcmp
    //   79: ifne +11 -> 90
    //   82: ldc2_w 85
    //   85: lstore 4
    //   87: goto +12 -> 99
    //   90: lload 4
    //   92: aload_0
    //   93: getfield 34	com/google/ads/interactivemedia/v3/internal/ov:n	J
    //   96: lsub
    //   97: lstore 4
    //   99: aload_0
    //   100: getfield 88	com/google/ads/interactivemedia/v3/internal/oi:b	J
    //   103: lstore 8
    //   105: lload 8
    //   107: ldc2_w 85
    //   110: lcmp
    //   111: ifne +6 -> 117
    //   114: goto +12 -> 126
    //   117: lload 8
    //   119: aload_0
    //   120: getfield 34	com/google/ads/interactivemedia/v3/internal/ov:n	J
    //   123: lsub
    //   124: lstore 6
    //   126: aload_1
    //   127: aload_3
    //   128: lload 4
    //   130: lload 6
    //   132: invokevirtual 93	com/google/ads/interactivemedia/v3/internal/on:a	(Lcom/google/ads/interactivemedia/v3/internal/op;JJ)V
    //   135: aload_0
    //   136: getfield 36	com/google/ads/interactivemedia/v3/internal/ov:o	Lcom/google/ads/interactivemedia/v3/internal/on;
    //   139: getfield 96	com/google/ads/interactivemedia/v3/internal/on:a	Lcom/google/ads/interactivemedia/v3/internal/fw;
    //   142: astore_1
    //   143: iconst_0
    //   144: istore 10
    //   146: iconst_0
    //   147: istore 11
    //   149: iload 11
    //   151: ifne +25 -> 176
    //   154: aload_0
    //   155: getfield 39	com/google/ads/interactivemedia/v3/internal/ov:q	Z
    //   158: ifne +18 -> 176
    //   161: aload_1
    //   162: aload_2
    //   163: getstatic 25	com/google/ads/interactivemedia/v3/internal/ov:l	Lcom/google/ads/interactivemedia/v3/internal/gf;
    //   166: invokeinterface 101 3 0
    //   171: istore 11
    //   173: goto -24 -> 149
    //   176: iload 11
    //   178: iconst_1
    //   179: if_icmpeq +6 -> 185
    //   182: iconst_1
    //   183: istore 10
    //   185: iload 10
    //   187: invokestatic 106	com/google/ads/interactivemedia/v3/internal/rp:c	(Z)V
    //   190: aload_0
    //   191: aload_2
    //   192: invokevirtual 109	com/google/ads/interactivemedia/v3/internal/fz:c	()J
    //   195: aload_0
    //   196: getfield 50	com/google/ads/interactivemedia/v3/internal/ok:c	Lcom/google/ads/interactivemedia/v3/internal/tx;
    //   199: getfield 66	com/google/ads/interactivemedia/v3/internal/tx:e	J
    //   202: lsub
    //   203: putfield 52	com/google/ads/interactivemedia/v3/internal/ov:p	J
    //   206: aload_0
    //   207: getfield 63	com/google/ads/interactivemedia/v3/internal/ok:j	Lcom/google/ads/interactivemedia/v3/internal/vd;
    //   210: invokestatic 114	com/google/ads/interactivemedia/v3/internal/wl:a	(Lcom/google/ads/interactivemedia/v3/internal/tt;)V
    //   213: aload_0
    //   214: iconst_1
    //   215: putfield 116	com/google/ads/interactivemedia/v3/internal/ov:r	Z
    //   218: return
    //   219: astore_1
    //   220: aload_0
    //   221: aload_2
    //   222: invokevirtual 109	com/google/ads/interactivemedia/v3/internal/fz:c	()J
    //   225: aload_0
    //   226: getfield 50	com/google/ads/interactivemedia/v3/internal/ok:c	Lcom/google/ads/interactivemedia/v3/internal/tx;
    //   229: getfield 66	com/google/ads/interactivemedia/v3/internal/tx:e	J
    //   232: lsub
    //   233: putfield 52	com/google/ads/interactivemedia/v3/internal/ov:p	J
    //   236: aload_1
    //   237: athrow
    //   238: astore_2
    //   239: aload_0
    //   240: getfield 63	com/google/ads/interactivemedia/v3/internal/ok:j	Lcom/google/ads/interactivemedia/v3/internal/vd;
    //   243: invokestatic 114	com/google/ads/interactivemedia/v3/internal/wl:a	(Lcom/google/ads/interactivemedia/v3/internal/tt;)V
    //   246: aload_2
    //   247: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	248	0	this	ov
    //   11	151	1	localObject1	Object
    //   219	18	1	localObject2	Object
    //   15	207	2	localfz	fz
    //   238	9	2	localObject3	Object
    //   20	108	3	localObject4	Object
    //   66	63	4	l1	long
    //   71	60	6	l2	long
    //   103	15	8	l3	long
    //   144	42	10	bool	boolean
    //   147	33	11	i	int
    // Exception table:
    //   from	to	target	type
    //   135	143	219	finally
    //   154	173	219	finally
    //   185	190	219	finally
    //   12	68	238	finally
    //   90	99	238	finally
    //   99	105	238	finally
    //   117	126	238	finally
    //   126	135	238	finally
    //   190	206	238	finally
    //   220	238	238	finally
  }
  
  public final long g()
  {
    return k + m;
  }
  
  public final boolean h()
  {
    return r;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ov
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */