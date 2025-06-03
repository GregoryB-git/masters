package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

final class ra
  extends ow
{
  private static final AtomicInteger b = new AtomicInteger();
  private final boolean A;
  private fw B;
  private boolean C;
  private re D;
  private int E;
  private boolean F;
  private volatile boolean G;
  private boolean H;
  public final int a;
  private final int l;
  private final Uri m;
  private final tt n;
  private final tx o;
  private final boolean p;
  private final boolean q;
  private final wi r;
  private final boolean s;
  private final qz t;
  private final List<bw> u;
  private final fe v;
  private final fw w;
  private final kz x;
  private final vy y;
  private final boolean z;
  
  private ra(qz paramqz, tt paramtt1, tx paramtx1, bw parambw, boolean paramBoolean1, tt paramtt2, tx paramtx2, boolean paramBoolean2, Uri paramUri, List<bw> paramList, int paramInt1, Object paramObject, long paramLong1, long paramLong2, long paramLong3, int paramInt2, boolean paramBoolean3, boolean paramBoolean4, wi paramwi, fe paramfe, fw paramfw, kz paramkz, vy paramvy, boolean paramBoolean5)
  {
    super(paramtt1, paramtx1, parambw, paramInt1, paramObject, paramLong1, paramLong2, paramLong3);
    z = paramBoolean1;
    l = paramInt2;
    n = paramtt2;
    o = paramtx2;
    A = paramBoolean2;
    m = paramUri;
    p = paramBoolean4;
    r = paramwi;
    q = paramBoolean3;
    t = paramqz;
    u = paramList;
    v = paramfe;
    w = paramfw;
    x = paramkz;
    y = paramvy;
    s = paramBoolean5;
    if (paramtx2 != null) {
      paramBoolean1 = true;
    } else {
      paramBoolean1 = false;
    }
    F = paramBoolean1;
    a = b.getAndIncrement();
  }
  
  private final long a(fz paramfz)
    throws IOException, InterruptedException
  {
    paramfz.a();
    try
    {
      paramfz.c(y.a, 0, 10);
      y.a(10);
      if (y.i() != 4801587) {
        return -9223372036854775807L;
      }
      y.d(3);
      int i = y.o();
      int j = i + 10;
      vy localvy = y;
      Object localObject = a;
      if (j > localObject.length)
      {
        localvy.a(j);
        System.arraycopy(localObject, 0, y.a, 0, 10);
      }
      paramfz.c(y.a, 10, i);
      paramfz = x.a(y.a, i);
      if (paramfz == null) {
        return -9223372036854775807L;
      }
      j = paramfz.a();
      for (i = 0; i < j; i++)
      {
        localObject = paramfz.a(i);
        if ((localObject instanceof lh))
        {
          localObject = (lh)localObject;
          if ("com.apple.streaming.transportStreamTimestamp".equals(a))
          {
            System.arraycopy(b, 0, y.a, 0, 8);
            y.a(8);
            return y.m() & 0x1FFFFFFFF;
          }
        }
      }
    }
    catch (EOFException paramfz)
    {
      for (;;) {}
    }
    return -9223372036854775807L;
  }
  
  public static ra a(qz paramqz, tt paramtt, bw parambw, long paramLong, rx paramrx, int paramInt1, Uri paramUri, List<bw> paramList, int paramInt2, Object paramObject, boolean paramBoolean, rn paramrn, ra paramra, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    sa localsa = (sa)l.get(paramInt1);
    tx localtx = new tx(rp.a(n, a), i, j, null);
    boolean bool1;
    if (paramArrayOfByte1 != null) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    if (bool1) {
      localObject = a(h);
    } else {
      localObject = null;
    }
    tt localtt = a(paramtt, paramArrayOfByte1, (byte[])localObject);
    Object localObject = b;
    boolean bool2;
    boolean bool3;
    if (localObject != null)
    {
      if (paramArrayOfByte2 != null) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      if (bool2) {
        paramArrayOfByte1 = a(h);
      } else {
        paramArrayOfByte1 = null;
      }
      localObject = new tx(rp.a(n, a), i, j, null);
      paramArrayOfByte1 = a(paramtt, paramArrayOfByte2, paramArrayOfByte1);
      paramArrayOfByte2 = (byte[])localObject;
      bool3 = bool2;
    }
    else
    {
      paramArrayOfByte2 = null;
      bool3 = false;
      paramArrayOfByte1 = null;
    }
    long l1 = paramLong + e;
    paramLong = c;
    int i = e + d;
    kz localkz;
    if (paramra != null)
    {
      localkz = x;
      localObject = y;
      if ((paramUri.equals(m)) && (H)) {
        bool2 = false;
      } else {
        bool2 = true;
      }
      if ((C) && (l == i) && (!bool2)) {
        paramtt = B;
      } else {
        paramtt = null;
      }
      paramra = localkz;
    }
    else
    {
      paramtt = new kz();
      localObject = new vy(10);
      localkz = null;
      bool2 = false;
      paramra = paramtt;
      paramtt = localkz;
    }
    return new ra(paramqz, localtt, localtx, parambw, bool1, paramArrayOfByte1, paramArrayOfByte2, bool3, paramUri, paramList, paramInt2, paramObject, l1, l1 + paramLong, f + paramInt1, i, k, paramBoolean, paramrn.a(i), f, paramtt, paramra, (vy)localObject, bool2);
  }
  
  private static tt a(tt paramtt, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (paramArrayOfByte1 != null) {
      return new qo(paramtt, paramArrayOfByte1, paramArrayOfByte2);
    }
    return paramtt;
  }
  
  /* Error */
  private final void a(tt paramtt, tx paramtx, boolean paramBoolean)
    throws IOException, InterruptedException
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 4
    //   3: iload_3
    //   4: ifeq +29 -> 33
    //   7: aload_0
    //   8: getfield 264	com/google/ads/interactivemedia/v3/internal/ra:E	I
    //   11: ifeq +9 -> 20
    //   14: iconst_1
    //   15: istore 5
    //   17: goto +6 -> 23
    //   20: iconst_0
    //   21: istore 5
    //   23: aload_2
    //   24: astore 6
    //   26: iload 5
    //   28: istore 7
    //   30: goto +17 -> 47
    //   33: aload_2
    //   34: aload_0
    //   35: getfield 264	com/google/ads/interactivemedia/v3/internal/ra:E	I
    //   38: i2l
    //   39: invokevirtual 267	com/google/ads/interactivemedia/v3/internal/tx:a	(J)Lcom/google/ads/interactivemedia/v3/internal/tx;
    //   42: astore 6
    //   44: iconst_0
    //   45: istore 7
    //   47: aload_1
    //   48: aload 6
    //   50: invokeinterface 272 2 0
    //   55: lstore 8
    //   57: new 109	com/google/ads/interactivemedia/v3/internal/fz
    //   60: astore 10
    //   62: aload 10
    //   64: aload_1
    //   65: aload 6
    //   67: getfield 273	com/google/ads/interactivemedia/v3/internal/tx:e	J
    //   70: lload 8
    //   72: invokespecial 276	com/google/ads/interactivemedia/v3/internal/fz:<init>	(Lcom/google/ads/interactivemedia/v3/internal/tt;JJ)V
    //   75: aload_0
    //   76: getfield 237	com/google/ads/interactivemedia/v3/internal/ra:B	Lcom/google/ads/interactivemedia/v3/internal/fw;
    //   79: ifnonnull +189 -> 268
    //   82: aload_0
    //   83: aload 10
    //   85: invokespecial 278	com/google/ads/interactivemedia/v3/internal/ra:a	(Lcom/google/ads/interactivemedia/v3/internal/fz;)J
    //   88: lstore 8
    //   90: aload 10
    //   92: invokevirtual 111	com/google/ads/interactivemedia/v3/internal/fz:a	()V
    //   95: aload_0
    //   96: getfield 78	com/google/ads/interactivemedia/v3/internal/ra:t	Lcom/google/ads/interactivemedia/v3/internal/qz;
    //   99: astore 11
    //   101: aload_0
    //   102: getfield 84	com/google/ads/interactivemedia/v3/internal/ra:w	Lcom/google/ads/interactivemedia/v3/internal/fw;
    //   105: astore 12
    //   107: aload 6
    //   109: getfield 280	com/google/ads/interactivemedia/v3/internal/tx:a	Landroid/net/Uri;
    //   112: astore 6
    //   114: aload_0
    //   115: getfield 285	com/google/ads/interactivemedia/v3/internal/ok:e	Lcom/google/ads/interactivemedia/v3/internal/bw;
    //   118: astore 13
    //   120: aload_0
    //   121: getfield 80	com/google/ads/interactivemedia/v3/internal/ra:u	Ljava/util/List;
    //   124: astore 14
    //   126: aload_0
    //   127: getfield 82	com/google/ads/interactivemedia/v3/internal/ra:v	Lcom/google/ads/interactivemedia/v3/internal/fe;
    //   130: astore 15
    //   132: aload_0
    //   133: getfield 74	com/google/ads/interactivemedia/v3/internal/ra:r	Lcom/google/ads/interactivemedia/v3/internal/wi;
    //   136: astore 16
    //   138: aload_1
    //   139: invokeinterface 288 1 0
    //   144: pop
    //   145: aload 11
    //   147: aload 12
    //   149: aload 6
    //   151: aload 13
    //   153: aload 14
    //   155: aload 15
    //   157: aload 16
    //   159: aload 10
    //   161: invokeinterface 293 8 0
    //   166: astore 6
    //   168: aload_0
    //   169: aload 6
    //   171: getfield 297	com/google/ads/interactivemedia/v3/internal/qy:a	Lcom/google/ads/interactivemedia/v3/internal/fw;
    //   174: putfield 237	com/google/ads/interactivemedia/v3/internal/ra:B	Lcom/google/ads/interactivemedia/v3/internal/fw;
    //   177: aload_0
    //   178: aload 6
    //   180: getfield 299	com/google/ads/interactivemedia/v3/internal/qy:c	Z
    //   183: putfield 235	com/google/ads/interactivemedia/v3/internal/ra:C	Z
    //   186: aload 6
    //   188: getfield 301	com/google/ads/interactivemedia/v3/internal/qy:b	Z
    //   191: ifeq +45 -> 236
    //   194: aload_0
    //   195: getfield 303	com/google/ads/interactivemedia/v3/internal/ra:D	Lcom/google/ads/interactivemedia/v3/internal/re;
    //   198: astore 6
    //   200: lload 8
    //   202: ldc2_w 128
    //   205: lcmp
    //   206: ifeq +17 -> 223
    //   209: aload_0
    //   210: getfield 74	com/google/ads/interactivemedia/v3/internal/ra:r	Lcom/google/ads/interactivemedia/v3/internal/wi;
    //   213: lload 8
    //   215: invokevirtual 308	com/google/ads/interactivemedia/v3/internal/wi:b	(J)J
    //   218: lstore 8
    //   220: goto +9 -> 229
    //   223: aload_0
    //   224: getfield 310	com/google/ads/interactivemedia/v3/internal/ok:h	J
    //   227: lstore 8
    //   229: aload 6
    //   231: lload 8
    //   233: invokevirtual 315	com/google/ads/interactivemedia/v3/internal/re:b	(J)V
    //   236: aload_0
    //   237: getfield 303	com/google/ads/interactivemedia/v3/internal/ra:D	Lcom/google/ads/interactivemedia/v3/internal/re;
    //   240: aload_0
    //   241: getfield 98	com/google/ads/interactivemedia/v3/internal/ra:a	I
    //   244: aload_0
    //   245: getfield 90	com/google/ads/interactivemedia/v3/internal/ra:s	Z
    //   248: iconst_0
    //   249: invokevirtual 318	com/google/ads/interactivemedia/v3/internal/re:a	(IZZ)V
    //   252: aload_0
    //   253: getfield 237	com/google/ads/interactivemedia/v3/internal/ra:B	Lcom/google/ads/interactivemedia/v3/internal/fw;
    //   256: aload_0
    //   257: getfield 303	com/google/ads/interactivemedia/v3/internal/ra:D	Lcom/google/ads/interactivemedia/v3/internal/re;
    //   260: invokeinterface 323 2 0
    //   265: goto +3 -> 268
    //   268: iload 4
    //   270: istore 5
    //   272: iload 7
    //   274: ifeq +16 -> 290
    //   277: aload 10
    //   279: aload_0
    //   280: getfield 264	com/google/ads/interactivemedia/v3/internal/ra:E	I
    //   283: invokevirtual 325	com/google/ads/interactivemedia/v3/internal/fz:b	(I)V
    //   286: iload 4
    //   288: istore 5
    //   290: iload 5
    //   292: ifne +47 -> 339
    //   295: aload_0
    //   296: getfield 327	com/google/ads/interactivemedia/v3/internal/ra:G	Z
    //   299: ifne +40 -> 339
    //   302: aload_0
    //   303: getfield 237	com/google/ads/interactivemedia/v3/internal/ra:B	Lcom/google/ads/interactivemedia/v3/internal/fw;
    //   306: aload 10
    //   308: aconst_null
    //   309: invokeinterface 330 3 0
    //   314: istore 5
    //   316: goto -26 -> 290
    //   319: astore 6
    //   321: aload_0
    //   322: aload 10
    //   324: invokevirtual 332	com/google/ads/interactivemedia/v3/internal/fz:c	()J
    //   327: aload_2
    //   328: getfield 273	com/google/ads/interactivemedia/v3/internal/tx:e	J
    //   331: lsub
    //   332: l2i
    //   333: putfield 264	com/google/ads/interactivemedia/v3/internal/ra:E	I
    //   336: aload 6
    //   338: athrow
    //   339: aload_0
    //   340: aload 10
    //   342: invokevirtual 332	com/google/ads/interactivemedia/v3/internal/fz:c	()J
    //   345: aload_2
    //   346: getfield 273	com/google/ads/interactivemedia/v3/internal/tx:e	J
    //   349: lsub
    //   350: l2i
    //   351: putfield 264	com/google/ads/interactivemedia/v3/internal/ra:E	I
    //   354: aload_1
    //   355: invokestatic 337	com/google/ads/interactivemedia/v3/internal/wl:a	(Lcom/google/ads/interactivemedia/v3/internal/tt;)V
    //   358: return
    //   359: astore_2
    //   360: aload_1
    //   361: invokestatic 337	com/google/ads/interactivemedia/v3/internal/wl:a	(Lcom/google/ads/interactivemedia/v3/internal/tt;)V
    //   364: aload_2
    //   365: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	366	0	this	ra
    //   0	366	1	paramtt	tt
    //   0	366	2	paramtx	tx
    //   0	366	3	paramBoolean	boolean
    //   1	286	4	i	int
    //   15	300	5	j	int
    //   24	206	6	localObject1	Object
    //   319	18	6	localObject2	Object
    //   28	245	7	k	int
    //   55	177	8	l1	long
    //   60	281	10	localfz	fz
    //   99	47	11	localqz	qz
    //   105	43	12	localfw	fw
    //   118	34	13	localbw	bw
    //   124	30	14	localList	List
    //   130	26	15	localfe	fe
    //   136	22	16	localwi	wi
    // Exception table:
    //   from	to	target	type
    //   295	316	319	finally
    //   47	200	359	finally
    //   209	220	359	finally
    //   223	229	359	finally
    //   229	236	359	finally
    //   236	265	359	finally
    //   277	286	359	finally
    //   321	339	359	finally
    //   339	354	359	finally
  }
  
  private static byte[] a(String paramString)
  {
    Object localObject = paramString;
    if (wl.d(paramString).startsWith("0x")) {
      localObject = paramString.substring(2);
    }
    paramString = new BigInteger((String)localObject, 16).toByteArray();
    localObject = new byte[16];
    int i;
    if (paramString.length > 16) {
      i = paramString.length - 16;
    } else {
      i = 0;
    }
    System.arraycopy(paramString, i, localObject, 16 - paramString.length + i, paramString.length - i);
    return (byte[])localObject;
  }
  
  public final void a()
  {
    G = true;
  }
  
  public final void a(re paramre)
  {
    D = paramre;
  }
  
  public final void b()
    throws IOException, InterruptedException
  {
    if (B == null)
    {
      fw localfw = w;
      if (localfw != null)
      {
        B = localfw;
        C = true;
        F = false;
        D.a(a, s, true);
      }
    }
    if (F)
    {
      a(n, o, A);
      E = 0;
      F = false;
    }
    if (!G)
    {
      if (!q)
      {
        if (!p) {
          r.e();
        } else if (r.a() == Long.MAX_VALUE) {
          r.a(h);
        }
        a(j, c, z);
      }
      H = true;
    }
  }
  
  public final boolean h()
  {
    return H;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ra
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */