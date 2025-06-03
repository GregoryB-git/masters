package com.google.ads.interactivemedia.v3.internal;

public final class ox
  extends ok
{
  private static final gf a = new gf();
  private final on b;
  private long k;
  private volatile boolean l;
  
  public ox(tt paramtt, tx paramtx, bw parambw, int paramInt, Object paramObject, on paramon)
  {
    super(paramtt, paramtx, 2, parambw, paramInt, paramObject, -9223372036854775807L, -9223372036854775807L);
    b = paramon;
  }
  
  public final void a()
  {
    l = true;
  }
  
  /* Error */
  public final void b()
    throws java.io.IOException, java.lang.InterruptedException
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 40	com/google/ads/interactivemedia/v3/internal/ok:c	Lcom/google/ads/interactivemedia/v3/internal/tx;
    //   4: aload_0
    //   5: getfield 42	com/google/ads/interactivemedia/v3/internal/ox:k	J
    //   8: invokevirtual 47	com/google/ads/interactivemedia/v3/internal/tx:a	(J)Lcom/google/ads/interactivemedia/v3/internal/tx;
    //   11: astore_1
    //   12: new 49	com/google/ads/interactivemedia/v3/internal/fz
    //   15: astore_2
    //   16: aload_0
    //   17: getfield 53	com/google/ads/interactivemedia/v3/internal/ok:j	Lcom/google/ads/interactivemedia/v3/internal/vd;
    //   20: astore_3
    //   21: aload_2
    //   22: aload_3
    //   23: aload_1
    //   24: getfield 56	com/google/ads/interactivemedia/v3/internal/tx:e	J
    //   27: aload_3
    //   28: aload_1
    //   29: invokevirtual 61	com/google/ads/interactivemedia/v3/internal/vd:a	(Lcom/google/ads/interactivemedia/v3/internal/tx;)J
    //   32: invokespecial 64	com/google/ads/interactivemedia/v3/internal/fz:<init>	(Lcom/google/ads/interactivemedia/v3/internal/tt;JJ)V
    //   35: aload_0
    //   36: getfield 42	com/google/ads/interactivemedia/v3/internal/ox:k	J
    //   39: lconst_0
    //   40: lcmp
    //   41: ifne +17 -> 58
    //   44: aload_0
    //   45: getfield 30	com/google/ads/interactivemedia/v3/internal/ox:b	Lcom/google/ads/interactivemedia/v3/internal/on;
    //   48: aconst_null
    //   49: ldc2_w 24
    //   52: ldc2_w 24
    //   55: invokevirtual 69	com/google/ads/interactivemedia/v3/internal/on:a	(Lcom/google/ads/interactivemedia/v3/internal/op;JJ)V
    //   58: aload_0
    //   59: getfield 30	com/google/ads/interactivemedia/v3/internal/ox:b	Lcom/google/ads/interactivemedia/v3/internal/on;
    //   62: getfield 72	com/google/ads/interactivemedia/v3/internal/on:a	Lcom/google/ads/interactivemedia/v3/internal/fw;
    //   65: astore_1
    //   66: iconst_0
    //   67: istore 4
    //   69: iconst_0
    //   70: istore 5
    //   72: iload 5
    //   74: ifne +25 -> 99
    //   77: aload_0
    //   78: getfield 32	com/google/ads/interactivemedia/v3/internal/ox:l	Z
    //   81: ifne +18 -> 99
    //   84: aload_1
    //   85: aload_2
    //   86: getstatic 21	com/google/ads/interactivemedia/v3/internal/ox:a	Lcom/google/ads/interactivemedia/v3/internal/gf;
    //   89: invokeinterface 77 3 0
    //   94: istore 5
    //   96: goto -24 -> 72
    //   99: iload 5
    //   101: iconst_1
    //   102: if_icmpeq +6 -> 108
    //   105: iconst_1
    //   106: istore 4
    //   108: iload 4
    //   110: invokestatic 82	com/google/ads/interactivemedia/v3/internal/rp:c	(Z)V
    //   113: aload_0
    //   114: aload_2
    //   115: invokevirtual 85	com/google/ads/interactivemedia/v3/internal/fz:c	()J
    //   118: aload_0
    //   119: getfield 40	com/google/ads/interactivemedia/v3/internal/ok:c	Lcom/google/ads/interactivemedia/v3/internal/tx;
    //   122: getfield 56	com/google/ads/interactivemedia/v3/internal/tx:e	J
    //   125: lsub
    //   126: putfield 42	com/google/ads/interactivemedia/v3/internal/ox:k	J
    //   129: aload_0
    //   130: getfield 53	com/google/ads/interactivemedia/v3/internal/ok:j	Lcom/google/ads/interactivemedia/v3/internal/vd;
    //   133: invokestatic 90	com/google/ads/interactivemedia/v3/internal/wl:a	(Lcom/google/ads/interactivemedia/v3/internal/tt;)V
    //   136: return
    //   137: astore_1
    //   138: aload_0
    //   139: aload_2
    //   140: invokevirtual 85	com/google/ads/interactivemedia/v3/internal/fz:c	()J
    //   143: aload_0
    //   144: getfield 40	com/google/ads/interactivemedia/v3/internal/ok:c	Lcom/google/ads/interactivemedia/v3/internal/tx;
    //   147: getfield 56	com/google/ads/interactivemedia/v3/internal/tx:e	J
    //   150: lsub
    //   151: putfield 42	com/google/ads/interactivemedia/v3/internal/ox:k	J
    //   154: aload_1
    //   155: athrow
    //   156: astore_2
    //   157: aload_0
    //   158: getfield 53	com/google/ads/interactivemedia/v3/internal/ok:j	Lcom/google/ads/interactivemedia/v3/internal/vd;
    //   161: invokestatic 90	com/google/ads/interactivemedia/v3/internal/wl:a	(Lcom/google/ads/interactivemedia/v3/internal/tt;)V
    //   164: aload_2
    //   165: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	166	0	this	ox
    //   11	74	1	localObject1	Object
    //   137	18	1	localObject2	Object
    //   15	125	2	localfz	fz
    //   156	9	2	localObject3	Object
    //   20	8	3	localvd	vd
    //   67	42	4	bool	boolean
    //   70	33	5	i	int
    // Exception table:
    //   from	to	target	type
    //   58	66	137	finally
    //   77	96	137	finally
    //   108	113	137	finally
    //   12	58	156	finally
    //   113	129	156	finally
    //   138	156	156	finally
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ox
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */