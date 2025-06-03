package com.google.ads.interactivemedia.v3.internal;

final class nk
{
  private final fw[] a;
  private fw b;
  
  public nk(fw[] paramArrayOffw)
  {
    a = paramArrayOffw;
  }
  
  /* Error */
  public final fw a(fz paramfz, fy paramfy, android.net.Uri paramUri)
    throws java.io.IOException, java.lang.InterruptedException
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 25	com/google/ads/interactivemedia/v3/internal/nk:b	Lcom/google/ads/interactivemedia/v3/internal/fw;
    //   4: astore 4
    //   6: aload 4
    //   8: ifnull +6 -> 14
    //   11: aload 4
    //   13: areturn
    //   14: aload_0
    //   15: getfield 15	com/google/ads/interactivemedia/v3/internal/nk:a	[Lcom/google/ads/interactivemedia/v3/internal/fw;
    //   18: astore 4
    //   20: aload 4
    //   22: arraylength
    //   23: istore 5
    //   25: iconst_0
    //   26: istore 6
    //   28: iload 5
    //   30: iconst_1
    //   31: if_icmpne +14 -> 45
    //   34: aload_0
    //   35: aload 4
    //   37: iconst_0
    //   38: aaload
    //   39: putfield 25	com/google/ads/interactivemedia/v3/internal/nk:b	Lcom/google/ads/interactivemedia/v3/internal/fw;
    //   42: goto +79 -> 121
    //   45: aload 4
    //   47: arraylength
    //   48: istore 5
    //   50: iload 6
    //   52: iload 5
    //   54: if_icmpge +60 -> 114
    //   57: aload 4
    //   59: iload 6
    //   61: aaload
    //   62: astore 7
    //   64: aload 7
    //   66: aload_1
    //   67: invokeinterface 30 2 0
    //   72: ifeq +16 -> 88
    //   75: aload_0
    //   76: aload 7
    //   78: putfield 25	com/google/ads/interactivemedia/v3/internal/nk:b	Lcom/google/ads/interactivemedia/v3/internal/fw;
    //   81: aload_1
    //   82: invokevirtual 34	com/google/ads/interactivemedia/v3/internal/fz:a	()V
    //   85: goto +29 -> 114
    //   88: aload_1
    //   89: invokevirtual 34	com/google/ads/interactivemedia/v3/internal/fz:a	()V
    //   92: goto +16 -> 108
    //   95: astore_2
    //   96: aload_1
    //   97: invokevirtual 34	com/google/ads/interactivemedia/v3/internal/fz:a	()V
    //   100: aload_2
    //   101: athrow
    //   102: astore 7
    //   104: aload_1
    //   105: invokevirtual 34	com/google/ads/interactivemedia/v3/internal/fz:a	()V
    //   108: iinc 6 1
    //   111: goto -61 -> 50
    //   114: aload_0
    //   115: getfield 25	com/google/ads/interactivemedia/v3/internal/nk:b	Lcom/google/ads/interactivemedia/v3/internal/fw;
    //   118: ifnull +18 -> 136
    //   121: aload_0
    //   122: getfield 25	com/google/ads/interactivemedia/v3/internal/nk:b	Lcom/google/ads/interactivemedia/v3/internal/fw;
    //   125: aload_2
    //   126: invokeinterface 37 2 0
    //   131: aload_0
    //   132: getfield 25	com/google/ads/interactivemedia/v3/internal/nk:b	Lcom/google/ads/interactivemedia/v3/internal/fw;
    //   135: areturn
    //   136: aload_0
    //   137: getfield 15	com/google/ads/interactivemedia/v3/internal/nk:a	[Lcom/google/ads/interactivemedia/v3/internal/fw;
    //   140: invokestatic 42	com/google/ads/interactivemedia/v3/internal/wl:b	([Ljava/lang/Object;)Ljava/lang/String;
    //   143: astore_1
    //   144: new 44	com/google/ads/interactivemedia/v3/internal/oh
    //   147: dup
    //   148: aload_1
    //   149: bipush 58
    //   151: invokestatic 48	a:b	(Ljava/lang/String;I)I
    //   154: ldc 50
    //   156: aload_1
    //   157: ldc 52
    //   159: invokestatic 58	z2:l	(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   162: aload_3
    //   163: invokespecial 61	com/google/ads/interactivemedia/v3/internal/oh:<init>	(Ljava/lang/String;Landroid/net/Uri;)V
    //   166: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	167	0	this	nk
    //   0	167	1	paramfz	fz
    //   0	167	2	paramfy	fy
    //   0	167	3	paramUri	android.net.Uri
    //   4	54	4	localObject	Object
    //   23	32	5	i	int
    //   26	83	6	j	int
    //   62	15	7	localfw	fw
    //   102	1	7	localEOFException	java.io.EOFException
    // Exception table:
    //   from	to	target	type
    //   64	81	95	finally
    //   64	81	102	java/io/EOFException
  }
  
  public final void a()
  {
    fw localfw = b;
    if (localfw != null)
    {
      localfw.c();
      b = null;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.nk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */