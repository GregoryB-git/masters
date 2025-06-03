package e5;

import a4.d;
import android.net.Uri;
import b5.m;
import c4.h;
import java.math.BigInteger;
import java.util.AbstractCollection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import o7.l0;
import o7.t;
import u4.g;
import v3.i0;
import v5.u;
import w3.a0;

public final class j
  extends m
{
  public static final AtomicInteger L = new AtomicInteger();
  public final boolean A;
  public final boolean B;
  public k C;
  public n D;
  public int E;
  public boolean F;
  public volatile boolean G;
  public boolean H;
  public t<Integer> I;
  public boolean J;
  public boolean K;
  public final int k;
  public final int l;
  public final Uri m;
  public final boolean n;
  public final int o;
  public final t5.k p;
  public final t5.n q;
  public final k r;
  public final boolean s;
  public final boolean t;
  public final v5.c0 u;
  public final i v;
  public final List<i0> w;
  public final d x;
  public final g y;
  public final u z;
  
  public j(i parami, t5.k paramk1, t5.n paramn1, i0 parami0, boolean paramBoolean1, t5.k paramk2, t5.n paramn2, boolean paramBoolean2, Uri paramUri, List<i0> paramList, int paramInt1, Object paramObject, long paramLong1, long paramLong2, long paramLong3, int paramInt2, boolean paramBoolean3, int paramInt3, boolean paramBoolean4, boolean paramBoolean5, v5.c0 paramc0, d paramd, k paramk, g paramg, u paramu, boolean paramBoolean6, a0 parama0)
  {
    super(paramk1, paramn1, parami0, paramInt1, paramObject, paramLong1, paramLong2, paramLong3);
    A = paramBoolean1;
    o = paramInt2;
    K = paramBoolean3;
    l = paramInt3;
    q = paramn2;
    p = paramk2;
    if (paramn2 != null) {
      paramBoolean1 = true;
    } else {
      paramBoolean1 = false;
    }
    F = paramBoolean1;
    B = paramBoolean2;
    m = paramUri;
    s = paramBoolean5;
    u = paramc0;
    t = paramBoolean4;
    v = parami;
    w = paramList;
    x = paramd;
    r = paramk;
    y = paramg;
    z = paramu;
    n = paramBoolean6;
    parami = t.b;
    I = l0.e;
    k = L.getAndIncrement();
  }
  
  public static byte[] f(String paramString)
  {
    Object localObject = paramString;
    if (x6.b.x0(paramString).startsWith("0x")) {
      localObject = paramString.substring(2);
    }
    localObject = new BigInteger((String)localObject, 16).toByteArray();
    paramString = new byte[16];
    int i;
    if (localObject.length > 16) {
      i = localObject.length - 16;
    } else {
      i = 0;
    }
    System.arraycopy(localObject, i, paramString, 16 - localObject.length + i, localObject.length - i);
    return paramString;
  }
  
  public final void a()
  {
    D.getClass();
    if (C == null)
    {
      k localk = r;
      if (localk != null)
      {
        h localh = a;
        int i;
        if ((!(localh instanceof m4.c0)) && (!(localh instanceof k4.e))) {
          i = 0;
        } else {
          i = 1;
        }
        if (i != 0)
        {
          C = localk;
          F = false;
        }
      }
    }
    if (F)
    {
      p.getClass();
      q.getClass();
      e(p, q, B, false);
      E = 0;
      F = false;
    }
    if (!G)
    {
      if (!t) {
        e(this.i, b, A, true);
      }
      H = (G ^ true);
    }
  }
  
  public final void b()
  {
    G = true;
  }
  
  public final boolean d()
  {
    throw null;
  }
  
  /* Error */
  public final void e(t5.k paramk, t5.n paramn, boolean paramBoolean1, boolean paramBoolean2)
  {
    // Byte code:
    //   0: iload_3
    //   1: ifeq +25 -> 26
    //   4: aload_0
    //   5: getfield 182	e5/j:E	I
    //   8: ifeq +9 -> 17
    //   11: iconst_1
    //   12: istore 5
    //   14: goto +6 -> 20
    //   17: iconst_0
    //   18: istore 5
    //   20: aload_2
    //   21: astore 6
    //   23: goto +17 -> 40
    //   26: aload_2
    //   27: aload_0
    //   28: getfield 182	e5/j:E	I
    //   31: i2l
    //   32: invokevirtual 203	t5/n:a	(J)Lt5/n;
    //   35: astore 6
    //   37: iconst_0
    //   38: istore 5
    //   40: aload_0
    //   41: aload_1
    //   42: aload 6
    //   44: iload 4
    //   46: invokevirtual 207	e5/j:h	(Lt5/k;Lt5/n;Z)Lc4/e;
    //   49: astore 6
    //   51: iload 5
    //   53: ifeq +12 -> 65
    //   56: aload 6
    //   58: aload_0
    //   59: getfield 182	e5/j:E	I
    //   62: invokevirtual 213	c4/e:j	(I)V
    //   65: aload_0
    //   66: getfield 184	e5/j:G	Z
    //   69: ifne +52 -> 121
    //   72: aload_0
    //   73: getfield 168	e5/j:C	Le5/k;
    //   76: checkcast 170	e5/b
    //   79: getfield 173	e5/b:a	Lc4/h;
    //   82: aload 6
    //   84: getstatic 216	e5/b:d	Lc4/s;
    //   87: invokeinterface 221 3 0
    //   92: istore 5
    //   94: iload 5
    //   96: ifne +9 -> 105
    //   99: iconst_1
    //   100: istore 5
    //   102: goto +6 -> 108
    //   105: iconst_0
    //   106: istore 5
    //   108: iload 5
    //   110: ifeq +11 -> 121
    //   113: goto -48 -> 65
    //   116: astore 7
    //   118: goto +86 -> 204
    //   121: aload 6
    //   123: getfield 223	c4/e:d	J
    //   126: lstore 8
    //   128: aload_2
    //   129: getfield 225	t5/n:f	J
    //   132: lstore 10
    //   134: aload_0
    //   135: lload 8
    //   137: lload 10
    //   139: lsub
    //   140: l2i
    //   141: putfield 182	e5/j:E	I
    //   144: goto +52 -> 196
    //   147: astore 7
    //   149: aload_0
    //   150: getfield 228	b5/e:d	Lv3/i0;
    //   153: getfield 232	v3/i0:e	I
    //   156: sipush 16384
    //   159: iand
    //   160: ifeq +41 -> 201
    //   163: aload_0
    //   164: getfield 168	e5/j:C	Le5/k;
    //   167: checkcast 170	e5/b
    //   170: getfield 173	e5/b:a	Lc4/h;
    //   173: lconst_0
    //   174: lconst_0
    //   175: invokeinterface 235 5 0
    //   180: aload 6
    //   182: getfield 223	c4/e:d	J
    //   185: lstore 8
    //   187: aload_2
    //   188: getfield 225	t5/n:f	J
    //   191: lstore 10
    //   193: goto -59 -> 134
    //   196: aload_1
    //   197: invokestatic 240	b/z:d	(Lt5/k;)V
    //   200: return
    //   201: aload 7
    //   203: athrow
    //   204: aload_0
    //   205: aload 6
    //   207: getfield 223	c4/e:d	J
    //   210: aload_2
    //   211: getfield 225	t5/n:f	J
    //   214: lsub
    //   215: l2i
    //   216: putfield 182	e5/j:E	I
    //   219: aload 7
    //   221: athrow
    //   222: astore_2
    //   223: aload_1
    //   224: invokestatic 240	b/z:d	(Lt5/k;)V
    //   227: aload_2
    //   228: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	229	0	this	j
    //   0	229	1	paramk	t5.k
    //   0	229	2	paramn	t5.n
    //   0	229	3	paramBoolean1	boolean
    //   0	229	4	paramBoolean2	boolean
    //   12	97	5	i	int
    //   21	185	6	localObject1	Object
    //   116	1	7	localObject2	Object
    //   147	73	7	localEOFException	java.io.EOFException
    //   126	60	8	l1	long
    //   132	60	10	l2	long
    // Exception table:
    //   from	to	target	type
    //   65	94	116	finally
    //   149	180	116	finally
    //   201	204	116	finally
    //   65	94	147	java/io/EOFException
    //   40	51	222	finally
    //   56	65	222	finally
    //   121	134	222	finally
    //   134	144	222	finally
    //   180	193	222	finally
    //   204	222	222	finally
  }
  
  public final int g(int paramInt)
  {
    x6.b.H(n ^ true);
    if (paramInt >= I.size()) {
      return 0;
    }
    return ((Integer)I.get(paramInt)).intValue();
  }
  
  /* Error */
  public final c4.e h(t5.k paramk, t5.n paramn, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_1
    //   1: aload_2
    //   2: invokeinterface 268 2 0
    //   7: lstore 4
    //   9: ldc2_w 269
    //   12: lstore 6
    //   14: iconst_0
    //   15: istore 8
    //   17: iconst_0
    //   18: istore 9
    //   20: iload_3
    //   21: ifeq +124 -> 145
    //   24: aload_0
    //   25: getfield 84	e5/j:u	Lv5/c0;
    //   28: astore 10
    //   30: aload_0
    //   31: getfield 82	e5/j:s	Z
    //   34: istore 11
    //   36: aload_0
    //   37: getfield 272	b5/e:g	J
    //   40: lstore 12
    //   42: aload 10
    //   44: monitorenter
    //   45: aload 10
    //   47: getfield 276	v5/c0:a	J
    //   50: ldc2_w 277
    //   53: lcmp
    //   54: ifne +8 -> 62
    //   57: iconst_1
    //   58: istore_3
    //   59: goto +5 -> 64
    //   62: iconst_0
    //   63: istore_3
    //   64: iload_3
    //   65: invokestatic 245	x6/b:H	(Z)V
    //   68: aload 10
    //   70: getfield 280	v5/c0:b	J
    //   73: ldc2_w 269
    //   76: lcmp
    //   77: ifeq +6 -> 83
    //   80: goto +44 -> 124
    //   83: iload 11
    //   85: ifeq +19 -> 104
    //   88: aload 10
    //   90: getfield 283	v5/c0:d	Ljava/lang/ThreadLocal;
    //   93: lload 12
    //   95: invokestatic 289	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   98: invokevirtual 295	java/lang/ThreadLocal:set	(Ljava/lang/Object;)V
    //   101: goto +23 -> 124
    //   104: aload 10
    //   106: getfield 280	v5/c0:b	J
    //   109: ldc2_w 269
    //   112: lcmp
    //   113: ifne +11 -> 124
    //   116: aload 10
    //   118: invokevirtual 298	java/lang/Object:wait	()V
    //   121: goto -17 -> 104
    //   124: aload 10
    //   126: monitorexit
    //   127: goto +18 -> 145
    //   130: astore_1
    //   131: aload 10
    //   133: monitorexit
    //   134: aload_1
    //   135: athrow
    //   136: astore_1
    //   137: new 300	java/io/InterruptedIOException
    //   140: dup
    //   141: invokespecial 301	java/io/InterruptedIOException:<init>	()V
    //   144: athrow
    //   145: new 209	c4/e
    //   148: dup
    //   149: aload_1
    //   150: aload_2
    //   151: getfield 225	t5/n:f	J
    //   154: lload 4
    //   156: invokespecial 304	c4/e:<init>	(Lt5/h;JJ)V
    //   159: astore 14
    //   161: aload_0
    //   162: getfield 168	e5/j:C	Le5/k;
    //   165: ifnonnull +1339 -> 1504
    //   168: aload 14
    //   170: iconst_0
    //   171: putfield 306	c4/e:f	I
    //   174: aload_0
    //   175: getfield 98	e5/j:z	Lv5/u;
    //   178: bipush 10
    //   180: invokevirtual 310	v5/u:D	(I)V
    //   183: aload 14
    //   185: aload_0
    //   186: getfield 98	e5/j:z	Lv5/u;
    //   189: getfield 313	v5/u:a	[B
    //   192: iconst_0
    //   193: bipush 10
    //   195: iconst_0
    //   196: invokevirtual 317	c4/e:c	([BIIZ)Z
    //   199: pop
    //   200: aload_0
    //   201: getfield 98	e5/j:z	Lv5/u;
    //   204: invokevirtual 319	v5/u:x	()I
    //   207: ldc_w 320
    //   210: if_icmpeq +10 -> 220
    //   213: lload 6
    //   215: lstore 4
    //   217: goto +238 -> 455
    //   220: aload_0
    //   221: getfield 98	e5/j:z	Lv5/u;
    //   224: iconst_3
    //   225: invokevirtual 322	v5/u:H	(I)V
    //   228: aload_0
    //   229: getfield 98	e5/j:z	Lv5/u;
    //   232: invokevirtual 324	v5/u:u	()I
    //   235: istore 15
    //   237: iload 15
    //   239: bipush 10
    //   241: iadd
    //   242: istore 8
    //   244: aload_0
    //   245: getfield 98	e5/j:z	Lv5/u;
    //   248: astore 10
    //   250: aload 10
    //   252: getfield 313	v5/u:a	[B
    //   255: astore 16
    //   257: iload 8
    //   259: aload 16
    //   261: arraylength
    //   262: if_icmple +26 -> 288
    //   265: aload 10
    //   267: iload 8
    //   269: invokevirtual 310	v5/u:D	(I)V
    //   272: aload 16
    //   274: iconst_0
    //   275: aload_0
    //   276: getfield 98	e5/j:z	Lv5/u;
    //   279: getfield 313	v5/u:a	[B
    //   282: iconst_0
    //   283: bipush 10
    //   285: invokestatic 157	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   288: aload 14
    //   290: aload_0
    //   291: getfield 98	e5/j:z	Lv5/u;
    //   294: getfield 313	v5/u:a	[B
    //   297: bipush 10
    //   299: iload 15
    //   301: iconst_0
    //   302: invokevirtual 317	c4/e:c	([BIIZ)Z
    //   305: pop
    //   306: aload_0
    //   307: getfield 96	e5/j:y	Lu4/g;
    //   310: aload_0
    //   311: getfield 98	e5/j:z	Lv5/u;
    //   314: getfield 313	v5/u:a	[B
    //   317: iload 15
    //   319: invokevirtual 329	u4/g:C	([BI)Lp4/a;
    //   322: astore 10
    //   324: aload 10
    //   326: ifnonnull +10 -> 336
    //   329: lload 6
    //   331: lstore 4
    //   333: goto +122 -> 455
    //   336: aload 10
    //   338: getfield 334	p4/a:a	[Lp4/a$b;
    //   341: arraylength
    //   342: istore 15
    //   344: iconst_0
    //   345: istore 8
    //   347: lload 6
    //   349: lstore 4
    //   351: iload 8
    //   353: iload 15
    //   355: if_icmpge +100 -> 455
    //   358: aload 10
    //   360: getfield 334	p4/a:a	[Lp4/a$b;
    //   363: iload 8
    //   365: aaload
    //   366: astore 16
    //   368: aload 16
    //   370: instanceof 336
    //   373: ifeq +76 -> 449
    //   376: aload 16
    //   378: checkcast 336	u4/k
    //   381: astore 16
    //   383: ldc_w 338
    //   386: aload 16
    //   388: getfield 341	u4/k:b	Ljava/lang/String;
    //   391: invokevirtual 345	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   394: ifeq +55 -> 449
    //   397: aload 16
    //   399: getfield 347	u4/k:c	[B
    //   402: iconst_0
    //   403: aload_0
    //   404: getfield 98	e5/j:z	Lv5/u;
    //   407: getfield 313	v5/u:a	[B
    //   410: iconst_0
    //   411: bipush 8
    //   413: invokestatic 157	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   416: aload_0
    //   417: getfield 98	e5/j:z	Lv5/u;
    //   420: iconst_0
    //   421: invokevirtual 349	v5/u:G	(I)V
    //   424: aload_0
    //   425: getfield 98	e5/j:z	Lv5/u;
    //   428: bipush 8
    //   430: invokevirtual 351	v5/u:F	(I)V
    //   433: aload_0
    //   434: getfield 98	e5/j:z	Lv5/u;
    //   437: invokevirtual 354	v5/u:o	()J
    //   440: ldc2_w 355
    //   443: land
    //   444: lstore 4
    //   446: goto +9 -> 455
    //   449: iinc 8 1
    //   452: goto -105 -> 347
    //   455: aload 14
    //   457: iconst_0
    //   458: putfield 306	c4/e:f	I
    //   461: aload_0
    //   462: getfield 94	e5/j:r	Le5/k;
    //   465: astore 10
    //   467: aload 10
    //   469: ifnull +209 -> 678
    //   472: aload 10
    //   474: checkcast 170	e5/b
    //   477: astore_2
    //   478: aload_2
    //   479: getfield 173	e5/b:a	Lc4/h;
    //   482: astore_1
    //   483: aload_1
    //   484: instanceof 175
    //   487: ifne +19 -> 506
    //   490: aload_1
    //   491: instanceof 177
    //   494: ifeq +6 -> 500
    //   497: goto +9 -> 506
    //   500: iconst_0
    //   501: istore 8
    //   503: goto +6 -> 509
    //   506: iconst_1
    //   507: istore 8
    //   509: iload 8
    //   511: iconst_1
    //   512: ixor
    //   513: invokestatic 245	x6/b:H	(Z)V
    //   516: aload_2
    //   517: getfield 173	e5/b:a	Lc4/h;
    //   520: astore_1
    //   521: aload_1
    //   522: instanceof 358
    //   525: ifeq +25 -> 550
    //   528: new 358	e5/p
    //   531: dup
    //   532: aload_2
    //   533: getfield 360	e5/b:b	Lv3/i0;
    //   536: getfield 362	v3/i0:c	Ljava/lang/String;
    //   539: aload_2
    //   540: getfield 364	e5/b:c	Lv5/c0;
    //   543: invokespecial 367	e5/p:<init>	(Ljava/lang/String;Lv5/c0;)V
    //   546: astore_1
    //   547: goto +73 -> 620
    //   550: aload_1
    //   551: instanceof 369
    //   554: ifeq +15 -> 569
    //   557: new 369	m4/e
    //   560: dup
    //   561: iconst_0
    //   562: invokespecial 371	m4/e:<init>	(I)V
    //   565: astore_1
    //   566: goto +54 -> 620
    //   569: aload_1
    //   570: instanceof 373
    //   573: ifeq +14 -> 587
    //   576: new 373	m4/a
    //   579: dup
    //   580: invokespecial 374	m4/a:<init>	()V
    //   583: astore_1
    //   584: goto +36 -> 620
    //   587: aload_1
    //   588: instanceof 376
    //   591: ifeq +14 -> 605
    //   594: new 376	m4/c
    //   597: dup
    //   598: invokespecial 377	m4/c:<init>	()V
    //   601: astore_1
    //   602: goto +18 -> 620
    //   605: aload_1
    //   606: instanceof 379
    //   609: ifeq +35 -> 644
    //   612: new 379	j4/d
    //   615: dup
    //   616: invokespecial 380	j4/d:<init>	()V
    //   619: astore_1
    //   620: new 170	e5/b
    //   623: dup
    //   624: aload_1
    //   625: aload_2
    //   626: getfield 360	e5/b:b	Lv3/i0;
    //   629: aload_2
    //   630: getfield 364	e5/b:c	Lv5/c0;
    //   633: invokespecial 383	e5/b:<init>	(Lc4/h;Lv3/i0;Lv5/c0;)V
    //   636: astore_1
    //   637: iload 9
    //   639: istore 8
    //   641: goto +728 -> 1369
    //   644: ldc_w 385
    //   647: invokestatic 389	f:l	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   650: astore_1
    //   651: aload_1
    //   652: aload_2
    //   653: getfield 173	e5/b:a	Lc4/h;
    //   656: invokevirtual 166	java/lang/Object:getClass	()Ljava/lang/Class;
    //   659: invokevirtual 395	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   662: invokevirtual 400	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   665: pop
    //   666: new 402	java/lang/IllegalStateException
    //   669: dup
    //   670: aload_1
    //   671: invokevirtual 405	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   674: invokespecial 408	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   677: athrow
    //   678: aload_0
    //   679: getfield 88	e5/j:v	Le5/i;
    //   682: astore 10
    //   684: aload_2
    //   685: getfield 410	t5/n:a	Landroid/net/Uri;
    //   688: astore 16
    //   690: aload_0
    //   691: getfield 228	b5/e:d	Lv3/i0;
    //   694: astore 17
    //   696: aload_0
    //   697: getfield 90	e5/j:w	Ljava/util/List;
    //   700: astore_2
    //   701: aload_0
    //   702: getfield 84	e5/j:u	Lv5/c0;
    //   705: astore 18
    //   707: aload_1
    //   708: invokeinterface 413 1 0
    //   713: astore_1
    //   714: aload 10
    //   716: checkcast 415	e5/d
    //   719: invokevirtual 166	java/lang/Object:getClass	()Ljava/lang/Class;
    //   722: pop
    //   723: aload 17
    //   725: getfield 417	v3/i0:t	Ljava/lang/String;
    //   728: invokestatic 420	b/z:k	(Ljava/lang/String;)I
    //   731: istore 19
    //   733: aload_1
    //   734: invokestatic 423	b/z:l	(Ljava/util/Map;)I
    //   737: istore 20
    //   739: aload 16
    //   741: invokestatic 426	b/z:m	(Landroid/net/Uri;)I
    //   744: istore 21
    //   746: getstatic 429	e5/d:b	[I
    //   749: astore_1
    //   750: new 431	java/util/ArrayList
    //   753: dup
    //   754: bipush 7
    //   756: invokespecial 432	java/util/ArrayList:<init>	(I)V
    //   759: astore 10
    //   761: iload 19
    //   763: aload 10
    //   765: invokestatic 435	e5/d:a	(ILjava/util/ArrayList;)V
    //   768: iload 20
    //   770: aload 10
    //   772: invokestatic 435	e5/d:a	(ILjava/util/ArrayList;)V
    //   775: iload 21
    //   777: aload 10
    //   779: invokestatic 435	e5/d:a	(ILjava/util/ArrayList;)V
    //   782: iconst_0
    //   783: istore 8
    //   785: iload 8
    //   787: bipush 7
    //   789: if_icmpge +18 -> 807
    //   792: aload_1
    //   793: iload 8
    //   795: iaload
    //   796: aload 10
    //   798: invokestatic 435	e5/d:a	(ILjava/util/ArrayList;)V
    //   801: iinc 8 1
    //   804: goto -19 -> 785
    //   807: aload 14
    //   809: iconst_0
    //   810: putfield 306	c4/e:f	I
    //   813: aconst_null
    //   814: astore 16
    //   816: iconst_0
    //   817: istore 15
    //   819: iload 15
    //   821: aload 10
    //   823: invokevirtual 436	java/util/ArrayList:size	()I
    //   826: if_icmpge +520 -> 1346
    //   829: aload 10
    //   831: iload 15
    //   833: invokevirtual 437	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   836: checkcast 258	java/lang/Integer
    //   839: invokevirtual 261	java/lang/Integer:intValue	()I
    //   842: istore 22
    //   844: iload 22
    //   846: ifeq +376 -> 1222
    //   849: iload 22
    //   851: iconst_1
    //   852: if_icmpeq +359 -> 1211
    //   855: iload 22
    //   857: iconst_2
    //   858: if_icmpeq +341 -> 1199
    //   861: iload 22
    //   863: bipush 7
    //   865: if_icmpeq +321 -> 1186
    //   868: iload 22
    //   870: bipush 8
    //   872: if_icmpeq +196 -> 1068
    //   875: iload 22
    //   877: bipush 11
    //   879: if_icmpeq +33 -> 912
    //   882: iload 22
    //   884: bipush 13
    //   886: if_icmpeq +8 -> 894
    //   889: aconst_null
    //   890: astore_1
    //   891: goto +18 -> 909
    //   894: new 358	e5/p
    //   897: dup
    //   898: aload 17
    //   900: getfield 362	v3/i0:c	Ljava/lang/String;
    //   903: aload 18
    //   905: invokespecial 367	e5/p:<init>	(Ljava/lang/String;Lv5/c0;)V
    //   908: astore_1
    //   909: goto +321 -> 1230
    //   912: aload_2
    //   913: ifnull +12 -> 925
    //   916: bipush 48
    //   918: istore 8
    //   920: aload_2
    //   921: astore_1
    //   922: goto +34 -> 956
    //   925: new 439	v3/i0$a
    //   928: dup
    //   929: invokespecial 440	v3/i0$a:<init>	()V
    //   932: astore_1
    //   933: aload_1
    //   934: ldc_w 442
    //   937: putfield 444	v3/i0$a:k	Ljava/lang/String;
    //   940: new 230	v3/i0
    //   943: dup
    //   944: aload_1
    //   945: invokespecial 447	v3/i0:<init>	(Lv3/i0$a;)V
    //   948: invokestatic 453	java/util/Collections:singletonList	(Ljava/lang/Object;)Ljava/util/List;
    //   951: astore_1
    //   952: bipush 16
    //   954: istore 8
    //   956: aload 17
    //   958: getfield 455	v3/i0:q	Ljava/lang/String;
    //   961: astore 23
    //   963: aload 23
    //   965: invokestatic 461	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   968: ifne +76 -> 1044
    //   971: aload 23
    //   973: ldc_w 463
    //   976: invokestatic 468	v5/p:c	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   979: ifnull +9 -> 988
    //   982: iconst_1
    //   983: istore 24
    //   985: goto +6 -> 991
    //   988: iconst_0
    //   989: istore 24
    //   991: iload 8
    //   993: istore 9
    //   995: iload 24
    //   997: ifne +9 -> 1006
    //   1000: iload 8
    //   1002: iconst_2
    //   1003: ior
    //   1004: istore 9
    //   1006: aload 23
    //   1008: ldc_w 470
    //   1011: invokestatic 468	v5/p:c	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1014: ifnull +9 -> 1023
    //   1017: iconst_1
    //   1018: istore 24
    //   1020: goto +6 -> 1026
    //   1023: iconst_0
    //   1024: istore 24
    //   1026: iload 9
    //   1028: istore 8
    //   1030: iload 24
    //   1032: ifne +12 -> 1044
    //   1035: iload 9
    //   1037: iconst_4
    //   1038: ior
    //   1039: istore 8
    //   1041: goto +3 -> 1044
    //   1044: new 175	m4/c0
    //   1047: dup
    //   1048: iconst_2
    //   1049: aload 18
    //   1051: new 472	m4/g
    //   1054: dup
    //   1055: iload 8
    //   1057: aload_1
    //   1058: invokespecial 475	m4/g:<init>	(ILjava/util/List;)V
    //   1061: invokespecial 478	m4/c0:<init>	(ILv5/c0;Lm4/g;)V
    //   1064: astore_1
    //   1065: goto +143 -> 1208
    //   1068: aload 17
    //   1070: getfield 481	v3/i0:r	Lp4/a;
    //   1073: astore_1
    //   1074: aload_1
    //   1075: ifnonnull +6 -> 1081
    //   1078: goto +61 -> 1139
    //   1081: iconst_0
    //   1082: istore 8
    //   1084: aload_1
    //   1085: getfield 334	p4/a:a	[Lp4/a$b;
    //   1088: astore 23
    //   1090: iload 8
    //   1092: aload 23
    //   1094: arraylength
    //   1095: if_icmpge +44 -> 1139
    //   1098: aload 23
    //   1100: iload 8
    //   1102: aaload
    //   1103: astore 23
    //   1105: aload 23
    //   1107: instanceof 483
    //   1110: ifeq +23 -> 1133
    //   1113: aload 23
    //   1115: checkcast 483	e5/o
    //   1118: getfield 485	e5/o:c	Ljava/util/List;
    //   1121: invokeinterface 487 1 0
    //   1126: iconst_1
    //   1127: ixor
    //   1128: istore 8
    //   1130: goto +12 -> 1142
    //   1133: iinc 8 1
    //   1136: goto -52 -> 1084
    //   1139: iconst_0
    //   1140: istore 8
    //   1142: iload 8
    //   1144: ifeq +9 -> 1153
    //   1147: iconst_4
    //   1148: istore 8
    //   1150: goto +6 -> 1156
    //   1153: iconst_0
    //   1154: istore 8
    //   1156: aload_2
    //   1157: ifnull +8 -> 1165
    //   1160: aload_2
    //   1161: astore_1
    //   1162: goto +7 -> 1169
    //   1165: invokestatic 491	java/util/Collections:emptyList	()Ljava/util/List;
    //   1168: astore_1
    //   1169: new 177	k4/e
    //   1172: dup
    //   1173: iload 8
    //   1175: aload 18
    //   1177: aconst_null
    //   1178: aload_1
    //   1179: invokespecial 494	k4/e:<init>	(ILv5/c0;Lk4/j;Ljava/util/List;)V
    //   1182: astore_1
    //   1183: goto +47 -> 1230
    //   1186: new 379	j4/d
    //   1189: dup
    //   1190: iconst_0
    //   1191: lconst_0
    //   1192: invokespecial 497	j4/d:<init>	(IJ)V
    //   1195: astore_1
    //   1196: goto +34 -> 1230
    //   1199: new 369	m4/e
    //   1202: dup
    //   1203: iconst_0
    //   1204: invokespecial 371	m4/e:<init>	(I)V
    //   1207: astore_1
    //   1208: goto +22 -> 1230
    //   1211: new 376	m4/c
    //   1214: dup
    //   1215: invokespecial 377	m4/c:<init>	()V
    //   1218: astore_1
    //   1219: goto +11 -> 1230
    //   1222: new 373	m4/a
    //   1225: dup
    //   1226: invokespecial 374	m4/a:<init>	()V
    //   1229: astore_1
    //   1230: aload_1
    //   1231: invokevirtual 166	java/lang/Object:getClass	()Ljava/lang/Class;
    //   1234: pop
    //   1235: aload_1
    //   1236: aload 14
    //   1238: invokeinterface 500 2 0
    //   1243: istore_3
    //   1244: aload 14
    //   1246: iconst_0
    //   1247: putfield 306	c4/e:f	I
    //   1250: goto +22 -> 1272
    //   1253: astore_1
    //   1254: aload 14
    //   1256: iconst_0
    //   1257: putfield 306	c4/e:f	I
    //   1260: aload_1
    //   1261: athrow
    //   1262: astore 23
    //   1264: iconst_0
    //   1265: istore_3
    //   1266: aload 14
    //   1268: iconst_0
    //   1269: putfield 306	c4/e:f	I
    //   1272: iload_3
    //   1273: ifeq +19 -> 1292
    //   1276: new 170	e5/b
    //   1279: dup
    //   1280: aload_1
    //   1281: aload 17
    //   1283: aload 18
    //   1285: invokespecial 383	e5/b:<init>	(Lc4/h;Lv3/i0;Lv5/c0;)V
    //   1288: astore_1
    //   1289: goto +77 -> 1366
    //   1292: aload 16
    //   1294: astore 23
    //   1296: aload 16
    //   1298: ifnonnull +38 -> 1336
    //   1301: iload 22
    //   1303: iload 19
    //   1305: if_icmpeq +28 -> 1333
    //   1308: iload 22
    //   1310: iload 20
    //   1312: if_icmpeq +21 -> 1333
    //   1315: iload 22
    //   1317: iload 21
    //   1319: if_icmpeq +14 -> 1333
    //   1322: aload 16
    //   1324: astore 23
    //   1326: iload 22
    //   1328: bipush 11
    //   1330: if_icmpne +6 -> 1336
    //   1333: aload_1
    //   1334: astore 23
    //   1336: iinc 15 1
    //   1339: aload 23
    //   1341: astore 16
    //   1343: goto -524 -> 819
    //   1346: aload 16
    //   1348: invokevirtual 166	java/lang/Object:getClass	()Ljava/lang/Class;
    //   1351: pop
    //   1352: new 170	e5/b
    //   1355: dup
    //   1356: aload 16
    //   1358: aload 17
    //   1360: aload 18
    //   1362: invokespecial 383	e5/b:<init>	(Lc4/h;Lv3/i0;Lv5/c0;)V
    //   1365: astore_1
    //   1366: iconst_0
    //   1367: istore 8
    //   1369: aload_0
    //   1370: aload_1
    //   1371: putfield 168	e5/j:C	Le5/k;
    //   1374: aload_1
    //   1375: getfield 173	e5/b:a	Lc4/h;
    //   1378: astore_1
    //   1379: aload_1
    //   1380: instanceof 369
    //   1383: ifne +34 -> 1417
    //   1386: aload_1
    //   1387: instanceof 373
    //   1390: ifne +27 -> 1417
    //   1393: aload_1
    //   1394: instanceof 376
    //   1397: ifne +20 -> 1417
    //   1400: aload_1
    //   1401: instanceof 379
    //   1404: ifeq +6 -> 1410
    //   1407: goto +10 -> 1417
    //   1410: iload 8
    //   1412: istore 9
    //   1414: goto +6 -> 1420
    //   1417: iconst_1
    //   1418: istore 9
    //   1420: aload_0
    //   1421: getfield 160	e5/j:D	Le5/n;
    //   1424: astore_1
    //   1425: iload 9
    //   1427: ifeq +35 -> 1462
    //   1430: lload 4
    //   1432: ldc2_w 269
    //   1435: lcmp
    //   1436: ifeq +17 -> 1453
    //   1439: aload_0
    //   1440: getfield 84	e5/j:u	Lv5/c0;
    //   1443: lload 4
    //   1445: invokevirtual 503	v5/c0:b	(J)J
    //   1448: lstore 4
    //   1450: goto +15 -> 1465
    //   1453: aload_0
    //   1454: getfield 272	b5/e:g	J
    //   1457: lstore 4
    //   1459: goto +6 -> 1465
    //   1462: lconst_0
    //   1463: lstore 4
    //   1465: aload_1
    //   1466: lload 4
    //   1468: invokevirtual 508	e5/n:H	(J)V
    //   1471: aload_0
    //   1472: getfield 160	e5/j:D	Le5/n;
    //   1475: getfield 511	e5/n:F	Ljava/util/HashSet;
    //   1478: invokevirtual 516	java/util/HashSet:clear	()V
    //   1481: aload_0
    //   1482: getfield 168	e5/j:C	Le5/k;
    //   1485: astore_2
    //   1486: aload_0
    //   1487: getfield 160	e5/j:D	Le5/n;
    //   1490: astore_1
    //   1491: aload_2
    //   1492: checkcast 170	e5/b
    //   1495: getfield 173	e5/b:a	Lc4/h;
    //   1498: aload_1
    //   1499: invokeinterface 519 2 0
    //   1504: aload_0
    //   1505: getfield 160	e5/j:D	Le5/n;
    //   1508: astore_1
    //   1509: aload_0
    //   1510: getfield 92	e5/j:x	La4/d;
    //   1513: astore_2
    //   1514: aload_1
    //   1515: getfield 522	e5/n:e0	La4/d;
    //   1518: aload_2
    //   1519: invokestatic 527	v5/e0:a	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1522: ifne +57 -> 1579
    //   1525: aload_1
    //   1526: aload_2
    //   1527: putfield 522	e5/n:e0	La4/d;
    //   1530: aload_1
    //   1531: getfield 530	e5/n:D	[Le5/n$c;
    //   1534: astore 10
    //   1536: iload 8
    //   1538: aload 10
    //   1540: arraylength
    //   1541: if_icmpge +38 -> 1579
    //   1544: aload_1
    //   1545: getfield 534	e5/n:W	[Z
    //   1548: iload 8
    //   1550: baload
    //   1551: ifeq +22 -> 1573
    //   1554: aload 10
    //   1556: iload 8
    //   1558: aaload
    //   1559: astore 10
    //   1561: aload 10
    //   1563: aload_2
    //   1564: putfield 538	e5/n$c:I	La4/d;
    //   1567: aload 10
    //   1569: iconst_1
    //   1570: putfield 542	z4/b0:z	Z
    //   1573: iinc 8 1
    //   1576: goto -46 -> 1530
    //   1579: aload 14
    //   1581: areturn
    //   1582: astore 10
    //   1584: lload 6
    //   1586: lstore 4
    //   1588: goto -1133 -> 455
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1591	0	this	j
    //   0	1591	1	paramk	t5.k
    //   0	1591	2	paramn	t5.n
    //   0	1591	3	paramBoolean	boolean
    //   7	1580	4	l1	long
    //   12	1573	6	l2	long
    //   15	1086	8	i	int
    //   1128	15	8	bool1	boolean
    //   1148	426	8	j	int
    //   18	1408	9	i1	int
    //   28	1540	10	localObject1	Object
    //   1582	1	10	localEOFException1	java.io.EOFException
    //   34	50	11	bool2	boolean
    //   40	54	12	l3	long
    //   159	1421	14	locale	c4.e
    //   235	1102	15	i2	int
    //   255	1102	16	localObject2	Object
    //   694	665	17	locali0	i0
    //   705	656	18	localc0	v5.c0
    //   731	575	19	i3	int
    //   737	576	20	i4	int
    //   744	576	21	i5	int
    //   842	489	22	i6	int
    //   961	153	23	localObject3	Object
    //   1262	1	23	localEOFException2	java.io.EOFException
    //   1294	46	23	localObject4	Object
    //   983	48	24	i7	int
    // Exception table:
    //   from	to	target	type
    //   45	57	130	finally
    //   64	80	130	finally
    //   88	101	130	finally
    //   104	121	130	finally
    //   24	45	136	java/lang/InterruptedException
    //   124	127	136	java/lang/InterruptedException
    //   131	136	136	java/lang/InterruptedException
    //   1235	1244	1253	finally
    //   1235	1244	1262	java/io/EOFException
    //   174	200	1582	java/io/EOFException
  }
}

/* Location:
 * Qualified Name:     e5.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */