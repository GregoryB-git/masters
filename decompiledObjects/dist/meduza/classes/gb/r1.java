package gb;

import eb.a.a;
import eb.b0.a;
import eb.c;
import eb.c.b;
import eb.c0;
import eb.d;
import eb.d.a;
import eb.d0.a;
import eb.e.a;
import eb.e0;
import eb.e1;
import eb.g.b;
import eb.h;
import eb.h1.c;
import eb.k0;
import eb.k0.b;
import eb.k0.c;
import eb.k0.e;
import eb.k0.f;
import eb.k0.h;
import eb.k0.i;
import eb.k0.j;
import eb.k0.k;
import eb.l0;
import eb.n0;
import eb.q.a;
import eb.s;
import eb.t0;
import eb.u0;
import eb.u0.a;
import eb.u0.b;
import eb.u0.d;
import eb.u0.e;
import eb.u0.f;
import eb.w0;
import eb.x;
import eb.z0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import n7.g.a;
import x6.b;

public final class r1
  extends n0
  implements e0<Object>
{
  public static final Logger e0 = Logger.getLogger(r1.class.getName());
  public static final Pattern f0 = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");
  public static final e1 g0;
  public static final e1 h0;
  public static final e1 i0;
  public static final g2 j0 = new g2(null, new HashMap(), new HashMap(), null, null, null);
  public static final a k0 = new a();
  public static final d l0 = new d();
  public boolean A;
  public final HashSet B;
  public Collection<r1.m.e<?, ?>> C;
  public final Object D;
  public final HashSet E;
  public final f0 F;
  public final p G;
  public final AtomicBoolean H;
  public boolean I;
  public boolean J;
  public volatile boolean K;
  public final CountDownLatch L;
  public final t1 M;
  public final m N;
  public final p O;
  public final n P;
  public final c0 Q;
  public final m R;
  public int S;
  public g2 T;
  public boolean U;
  public final boolean V;
  public final y2.s W;
  public final long X;
  public final long Y;
  public final boolean Z;
  public final q.a a0;
  public final eb.f0 b;
  public final i b0;
  public final String c;
  public final e c0;
  public final w0 d;
  public final x2 d0;
  public final u0.a e;
  public final i f;
  public final l g;
  public final n h;
  public final Executor i;
  public final j3 j;
  public final h k;
  public final h l;
  public final o3 m;
  public final eb.h1 n;
  public final s o;
  public final eb.m p;
  public final n7.q<n7.p> q;
  public final long r;
  public final y s;
  public final j.a t;
  public final e9.a u;
  public final ArrayList v;
  public s0 w;
  public boolean x;
  public k y;
  public volatile k0.j z;
  
  static
  {
    e1 locale1 = e1.n;
    g0 = locale1.g("Channel shutdownNow invoked");
    h0 = locale1.g("Channel shutdown invoked");
    i0 = locale1.g("Subchannel shutdown invoked");
  }
  
  public r1(e2 parame2, v paramv, k0.a parama, j3 paramj3, v0.d paramd, ArrayList paramArrayList)
  {
    eb.h1 localh1 = new eb.h1(new c());
    n = localh1;
    s = new y();
    B = new HashSet(16, 0.75F);
    D = new Object();
    E = new HashSet(1, 0.75F);
    G = new p();
    H = new AtomicBoolean(false);
    L = new CountDownLatch(1);
    S = 1;
    T = j0;
    U = false;
    W = new y2.s();
    a0 = eb.q.d;
    g localg = new g();
    b0 = new i();
    c0 = new e();
    String str = f;
    b.y(str, "target");
    c = str;
    Object localObject2 = new eb.f0(eb.f0.d.incrementAndGet(), "Channel", str);
    b = ((eb.f0)localObject2);
    m = ((o3)localObject1);
    Object localObject3 = a;
    b.y(localObject3, "executorPool");
    j = ((j3)localObject3);
    localObject3 = (Executor)((j3)localObject3).b();
    b.y(localObject3, "executor");
    i = ((Executor)localObject3);
    Object localObject4 = b;
    b.y(localObject4, "offloadExecutorPool");
    localObject4 = new h((j3)localObject4);
    l = ((h)localObject4);
    paramv = new l(paramv, g, (h)localObject4);
    g = paramv;
    n localn = new n(paramv.p0());
    h = localn;
    localObject2 = new p((eb.f0)localObject2, ((o3.a)localObject1).a(), g.e("Channel for '", str, "'"));
    O = ((p)localObject2);
    n localn1 = new n((p)localObject2, (o3)localObject1);
    P = localn1;
    localObject2 = v0.m;
    boolean bool = p;
    Z = bool;
    Object localObject5 = new i(h);
    f = ((i)localObject5);
    localObject1 = d;
    d = ((w0)localObject1);
    localObject5 = new d3(bool, l, m, (i)localObject5);
    int i1 = y.a();
    localObject2.getClass();
    bool = false;
    localObject4 = new u0.a(Integer.valueOf(i1), (z0)localObject2, localh1, (u0.f)localObject5, localn, localn1, (Executor)localObject4, null);
    e = ((u0.a)localObject4);
    w = N(str, (w0)localObject1, (u0.a)localObject4, paramv.y0());
    k = new h(paramj3);
    paramv = new f0((Executor)localObject3, localh1);
    F = paramv;
    paramv.g(localg);
    t = parama;
    V = r;
    paramv = new m(w.a());
    R = paramv;
    i1 = eb.g.a;
    parama = paramArrayList.iterator();
    while (parama.hasNext()) {
      paramv = new g.b(paramv, (eb.f)parama.next());
    }
    u = paramv;
    v = new ArrayList(e);
    b.y(paramd, "stopwatchSupplier");
    q = paramd;
    long l1 = k;
    if (l1 != -1L)
    {
      if (l1 >= e2.B) {
        bool = true;
      }
      b.m(l1, "invalid idleTimeoutMillis %s", bool);
      l1 = k;
    }
    r = l1;
    d0 = new x2(new j(), n, g.p0(), new n7.p());
    paramv = i;
    b.y(paramv, "decompressorRegistry");
    o = paramv;
    paramv = j;
    b.y(paramv, "compressorRegistry");
    p = paramv;
    Y = n;
    X = o;
    M = new t1();
    N = new m(o3.a);
    parame2 = q;
    parame2.getClass();
    Q = parame2;
    c0.a(a, this);
    if (!V) {
      U = true;
    }
  }
  
  public static void I(r1 paramr1)
  {
    int i1 = 1;
    paramr1.Q(true);
    F.i(null);
    P.a(d.a.b, "Entering IDLE state");
    s.a(eb.n.d);
    i locali = b0;
    Object localObject1 = D;
    f0 localf0 = F;
    locali.getClass();
    for (int i2 = 0; i2 < 2; i2++)
    {
      Object localObject2 = new Object[] { localObject1, localf0 }[i2];
      if (a.contains(localObject2))
      {
        i2 = i1;
        break label115;
      }
    }
    i2 = 0;
    label115:
    if (i2 != 0) {
      paramr1.M();
    }
  }
  
  public static void J(r1 paramr1)
  {
    if (I)
    {
      Iterator localIterator = B.iterator();
      while (localIterator.hasNext())
      {
        d1 locald1 = (d1)localIterator.next();
        e1 locale1 = g0;
        l.execute(new h1(locald1, locale1));
        l.execute(new k1(locald1, locale1));
      }
      paramr1 = E.iterator();
      if (paramr1.hasNext())
      {
        ((n2)paramr1.next()).getClass();
        throw null;
      }
    }
  }
  
  public static void K(r1 paramr1)
  {
    if ((!K) && (H.get()) && (B.isEmpty()) && (E.isEmpty()))
    {
      P.a(d.a.b, "Terminated");
      c0.b(Q.a, paramr1);
      j.a(i);
      synchronized (k)
      {
        Executor localExecutor = b;
        if (localExecutor != null)
        {
          a.a(localExecutor);
          b = null;
        }
        synchronized (l)
        {
          localExecutor = b;
          if (localExecutor != null)
          {
            a.a(localExecutor);
            b = null;
          }
          g.close();
          K = true;
          L.countDown();
        }
      }
    }
  }
  
  /* Error */
  public static s0 N(String paramString, w0 paramw0, u0.a parama, Collection paramCollection)
  {
    // Byte code:
    //   0: new 711	java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial 712	java/lang/StringBuilder:<init>	()V
    //   7: astore 4
    //   9: aconst_null
    //   10: astore 5
    //   12: new 714	java/net/URI
    //   15: astore 6
    //   17: aload 6
    //   19: aload_0
    //   20: invokespecial 715	java/net/URI:<init>	(Ljava/lang/String;)V
    //   23: goto +19 -> 42
    //   26: astore 6
    //   28: aload 4
    //   30: aload 6
    //   32: invokevirtual 718	java/net/URISyntaxException:getMessage	()Ljava/lang/String;
    //   35: invokevirtual 722	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   38: pop
    //   39: aconst_null
    //   40: astore 6
    //   42: aload 6
    //   44: ifnull +66 -> 110
    //   47: aload 6
    //   49: invokevirtual 725	java/net/URI:getScheme	()Ljava/lang/String;
    //   52: astore 7
    //   54: aload 7
    //   56: ifnonnull +11 -> 67
    //   59: aload_1
    //   60: invokevirtual 465	java/lang/Object:getClass	()Ljava/lang/Class;
    //   63: pop
    //   64: goto +46 -> 110
    //   67: aload_1
    //   68: monitorenter
    //   69: aload_1
    //   70: getfield 730	eb/w0:c	Lo7/u;
    //   73: astore 8
    //   75: aload_1
    //   76: monitorexit
    //   77: aload 7
    //   79: getstatic 736	java/util/Locale:US	Ljava/util/Locale;
    //   82: invokevirtual 742	java/lang/String:toLowerCase	(Ljava/util/Locale;)Ljava/lang/String;
    //   85: astore 7
    //   87: aload 8
    //   89: checkcast 744	o7/m0
    //   92: aload 7
    //   94: invokevirtual 747	o7/m0:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   97: checkcast 749	eb/v0
    //   100: astore 8
    //   102: goto +11 -> 113
    //   105: astore_0
    //   106: aload_1
    //   107: monitorexit
    //   108: aload_0
    //   109: athrow
    //   110: aconst_null
    //   111: astore 8
    //   113: aload 6
    //   115: astore 7
    //   117: aload 8
    //   119: astore 9
    //   121: aload 8
    //   123: ifnonnull +156 -> 279
    //   126: aload 6
    //   128: astore 7
    //   130: aload 8
    //   132: astore 9
    //   134: getstatic 203	gb/r1:f0	Ljava/util/regex/Pattern;
    //   137: aload_0
    //   138: invokevirtual 753	java/util/regex/Pattern:matcher	(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   141: invokevirtual 758	java/util/regex/Matcher:matches	()Z
    //   144: ifne +135 -> 279
    //   147: aload_1
    //   148: monitorenter
    //   149: aload_1
    //   150: getfield 760	eb/w0:a	Ljava/lang/String;
    //   153: astore 8
    //   155: aload_1
    //   156: monitorexit
    //   157: new 711	java/lang/StringBuilder
    //   160: astore 6
    //   162: aload 6
    //   164: invokespecial 712	java/lang/StringBuilder:<init>	()V
    //   167: aload 6
    //   169: ldc_w 762
    //   172: invokevirtual 722	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   175: pop
    //   176: aload 6
    //   178: aload_0
    //   179: invokevirtual 722	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   182: pop
    //   183: new 714	java/net/URI
    //   186: dup
    //   187: aload 8
    //   189: ldc_w 764
    //   192: aload 6
    //   194: invokevirtual 767	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   197: aconst_null
    //   198: invokespecial 770	java/net/URI:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   201: astore 7
    //   203: aload 7
    //   205: invokevirtual 725	java/net/URI:getScheme	()Ljava/lang/String;
    //   208: astore 6
    //   210: aload 6
    //   212: ifnonnull +9 -> 221
    //   215: aload 5
    //   217: astore_1
    //   218: goto +35 -> 253
    //   221: aload_1
    //   222: monitorenter
    //   223: aload_1
    //   224: getfield 730	eb/w0:c	Lo7/u;
    //   227: astore 8
    //   229: aload_1
    //   230: monitorexit
    //   231: aload 6
    //   233: getstatic 736	java/util/Locale:US	Ljava/util/Locale;
    //   236: invokevirtual 742	java/lang/String:toLowerCase	(Ljava/util/Locale;)Ljava/lang/String;
    //   239: astore_1
    //   240: aload 8
    //   242: checkcast 744	o7/m0
    //   245: aload_1
    //   246: invokevirtual 747	o7/m0:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   249: checkcast 749	eb/v0
    //   252: astore_1
    //   253: aload_1
    //   254: astore 9
    //   256: goto +23 -> 279
    //   259: astore_0
    //   260: aload_1
    //   261: monitorexit
    //   262: aload_0
    //   263: athrow
    //   264: astore_0
    //   265: aload_1
    //   266: monitorexit
    //   267: aload_0
    //   268: athrow
    //   269: astore_0
    //   270: new 772	java/lang/IllegalArgumentException
    //   273: dup
    //   274: aload_0
    //   275: invokespecial 775	java/lang/IllegalArgumentException:<init>	(Ljava/lang/Throwable;)V
    //   278: athrow
    //   279: aload 9
    //   281: ifnonnull +80 -> 361
    //   284: aload 4
    //   286: invokevirtual 778	java/lang/StringBuilder:length	()I
    //   289: ifle +42 -> 331
    //   292: new 711	java/lang/StringBuilder
    //   295: dup
    //   296: invokespecial 712	java/lang/StringBuilder:<init>	()V
    //   299: astore_1
    //   300: aload_1
    //   301: ldc_w 780
    //   304: invokevirtual 722	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   307: pop
    //   308: aload_1
    //   309: aload 4
    //   311: invokevirtual 783	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   314: pop
    //   315: aload_1
    //   316: ldc_w 785
    //   319: invokevirtual 722	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   322: pop
    //   323: aload_1
    //   324: invokevirtual 767	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   327: astore_1
    //   328: goto +7 -> 335
    //   331: ldc_w 764
    //   334: astore_1
    //   335: new 772	java/lang/IllegalArgumentException
    //   338: dup
    //   339: ldc_w 787
    //   342: iconst_2
    //   343: anewarray 273	java/lang/Object
    //   346: dup
    //   347: iconst_0
    //   348: aload_0
    //   349: aastore
    //   350: dup
    //   351: iconst_1
    //   352: aload_1
    //   353: aastore
    //   354: invokestatic 791	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   357: invokespecial 792	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   360: athrow
    //   361: aload_3
    //   362: ifnull +50 -> 412
    //   365: aload_3
    //   366: aload 9
    //   368: invokevirtual 794	eb/v0:c	()Ljava/util/Collection;
    //   371: invokeinterface 800 2 0
    //   376: ifeq +6 -> 382
    //   379: goto +33 -> 412
    //   382: new 772	java/lang/IllegalArgumentException
    //   385: dup
    //   386: ldc_w 802
    //   389: iconst_2
    //   390: anewarray 273	java/lang/Object
    //   393: dup
    //   394: iconst_0
    //   395: aload 7
    //   397: invokevirtual 725	java/net/URI:getScheme	()Ljava/lang/String;
    //   400: aastore
    //   401: dup
    //   402: iconst_1
    //   403: aload_0
    //   404: aastore
    //   405: invokestatic 791	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   408: invokespecial 792	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   411: athrow
    //   412: aload 9
    //   414: aload 7
    //   416: aload_2
    //   417: invokevirtual 807	eb/u0$c:b	(Ljava/net/URI;Leb/u0$a;)Lgb/i0;
    //   420: astore_1
    //   421: aload_1
    //   422: ifnull +56 -> 478
    //   425: new 809	gb/k0$a
    //   428: dup
    //   429: invokespecial 810	gb/k0$a:<init>	()V
    //   432: astore_0
    //   433: aload_2
    //   434: getfield 813	eb/u0$a:e	Ljava/util/concurrent/ScheduledExecutorService;
    //   437: astore_3
    //   438: aload_3
    //   439: ifnull +28 -> 467
    //   442: aload_2
    //   443: getfield 815	eb/u0$a:c	Leb/h1;
    //   446: astore_2
    //   447: new 817	gb/c3
    //   450: dup
    //   451: aload_1
    //   452: new 819	gb/k
    //   455: dup
    //   456: aload_0
    //   457: aload_3
    //   458: aload_2
    //   459: invokespecial 822	gb/k:<init>	(Lgb/k0$a;Ljava/util/concurrent/ScheduledExecutorService;Leb/h1;)V
    //   462: aload_2
    //   463: invokespecial 825	gb/c3:<init>	(Leb/u0;Lgb/k;Leb/h1;)V
    //   466: areturn
    //   467: new 827	java/lang/IllegalStateException
    //   470: dup
    //   471: ldc_w 829
    //   474: invokespecial 830	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   477: athrow
    //   478: aload 4
    //   480: invokevirtual 778	java/lang/StringBuilder:length	()I
    //   483: ifle +42 -> 525
    //   486: new 711	java/lang/StringBuilder
    //   489: dup
    //   490: invokespecial 712	java/lang/StringBuilder:<init>	()V
    //   493: astore_1
    //   494: aload_1
    //   495: ldc_w 780
    //   498: invokevirtual 722	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   501: pop
    //   502: aload_1
    //   503: aload 4
    //   505: invokevirtual 783	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   508: pop
    //   509: aload_1
    //   510: ldc_w 785
    //   513: invokevirtual 722	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   516: pop
    //   517: aload_1
    //   518: invokevirtual 767	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   521: astore_1
    //   522: goto +7 -> 529
    //   525: ldc_w 764
    //   528: astore_1
    //   529: new 772	java/lang/IllegalArgumentException
    //   532: dup
    //   533: ldc_w 832
    //   536: iconst_2
    //   537: anewarray 273	java/lang/Object
    //   540: dup
    //   541: iconst_0
    //   542: aload_0
    //   543: aastore
    //   544: dup
    //   545: iconst_1
    //   546: aload_1
    //   547: aastore
    //   548: invokestatic 791	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   551: invokespecial 792	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   554: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	555	0	paramString	String
    //   0	555	1	paramw0	w0
    //   0	555	2	parama	u0.a
    //   0	555	3	paramCollection	Collection
    //   7	497	4	localStringBuilder	StringBuilder
    //   10	206	5	localObject1	Object
    //   15	3	6	localURI	java.net.URI
    //   26	5	6	localURISyntaxException	java.net.URISyntaxException
    //   40	192	6	localObject2	Object
    //   52	363	7	localObject3	Object
    //   73	168	8	localObject4	Object
    //   119	294	9	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   12	23	26	java/net/URISyntaxException
    //   69	75	105	finally
    //   223	229	259	finally
    //   149	155	264	finally
    //   147	149	269	java/net/URISyntaxException
    //   155	203	269	java/net/URISyntaxException
    //   265	269	269	java/net/URISyntaxException
  }
  
  public final boolean C(long paramLong, TimeUnit paramTimeUnit)
  {
    return L.await(paramLong, paramTimeUnit);
  }
  
  public final void D()
  {
    n.execute(new b());
  }
  
  public final eb.n E()
  {
    eb.n localn = s.b;
    if (localn != null)
    {
      if (localn == eb.n.d) {
        n.execute(new w1(this));
      }
      return localn;
    }
    throw new UnsupportedOperationException("Channel state API is not implemented");
  }
  
  public final void F(eb.n paramn, x0.f paramf)
  {
    n.execute(new u1(this, paramf, paramn));
  }
  
  public final n0 H()
  {
    P.a(d.a.a, "shutdownNow() called");
    P();
    m localm = R;
    e.n.execute(new d2(localm));
    n.execute(new y1(this));
    return this;
  }
  
  public final void L(boolean paramBoolean)
  {
    x2 localx2 = d0;
    f = false;
    if (paramBoolean)
    {
      ScheduledFuture localScheduledFuture = g;
      if (localScheduledFuture != null)
      {
        localScheduledFuture.cancel(false);
        g = null;
      }
    }
  }
  
  public final void M()
  {
    n.d();
    if ((!H.get()) && (!A))
    {
      if ((b0.a.isEmpty() ^ true)) {
        L(false);
      } else {
        O();
      }
      if (y != null) {
        return;
      }
      P.a(d.a.b, "Exiting idle mode");
      k localk = new k();
      Object localObject = f;
      localObject.getClass();
      a = new i.a((i)localObject, localk);
      y = localk;
      localObject = new l(localk, w);
      w.d((u0.d)localObject);
      x = true;
    }
  }
  
  public final void O()
  {
    long l1 = r;
    if (l1 == -1L) {
      return;
    }
    x2 localx2 = d0;
    TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
    localx2.getClass();
    long l2 = localTimeUnit.toNanos(l1);
    Object localObject = d;
    localTimeUnit = TimeUnit.NANOSECONDS;
    l1 = ((n7.p)localObject).a(localTimeUnit) + l2;
    f = true;
    if ((l1 - e < 0L) || (g == null))
    {
      localObject = g;
      if (localObject != null) {
        ((Future)localObject).cancel(false);
      }
      g = a.schedule(new x2.b(localx2), l2, localTimeUnit);
    }
    e = l1;
  }
  
  public final void P()
  {
    P.a(d.a.a, "shutdown() called");
    if (!H.compareAndSet(false, true)) {
      return;
    }
    n.execute(new x1(this));
    m localm = R;
    e.n.execute(new c2(localm));
    n.execute(new s1(this));
  }
  
  public final void Q(boolean paramBoolean)
  {
    n.d();
    if (paramBoolean)
    {
      b.I(x, "nameResolver is not started");
      boolean bool;
      if (y != null) {
        bool = true;
      } else {
        bool = false;
      }
      b.I(bool, "lbHelper is null");
    }
    Object localObject = w;
    if (localObject != null)
    {
      ((s0)localObject).c();
      x = false;
      if (paramBoolean) {
        w = N(c, d, e, g.y0());
      } else {
        w = null;
      }
    }
    localObject = y;
    if (localObject != null)
    {
      localObject = a;
      b.f();
      b = null;
      y = null;
    }
    z = null;
  }
  
  public final String b()
  {
    return u.b();
  }
  
  public final eb.f0 f()
  {
    return b;
  }
  
  public final String toString()
  {
    g.a locala = n7.g.b(this);
    locala.b("logId", b.c);
    locala.a(c, "target");
    return locala.toString();
  }
  
  public final <ReqT, RespT> eb.e<ReqT, RespT> v(t0<ReqT, RespT> paramt0, c paramc)
  {
    return u.v(paramt0, paramc);
  }
  
  public final class a
    extends eb.d0
  {
    public final d0.a a()
    {
      throw new IllegalStateException("Resolution is pending");
    }
  }
  
  public final class b
    implements Runnable
  {
    public b() {}
    
    public final void run()
    {
      if (!H.get())
      {
        r1 localr1 = r1.this;
        if (y != null)
        {
          localr1.L(false);
          r1.I(r1.this);
        }
      }
    }
  }
  
  public final class c
    implements Thread.UncaughtExceptionHandler
  {
    public c() {}
    
    public final void uncaughtException(Thread paramThread, Throwable paramThrowable)
    {
      Logger localLogger = r1.e0;
      paramThread = Level.SEVERE;
      StringBuilder localStringBuilder = f.l("[");
      localStringBuilder.append(b);
      localStringBuilder.append("] Uncaught exception in the SynchronizationContext. Panic!");
      localLogger.log(paramThread, localStringBuilder.toString(), paramThrowable);
      paramThread = r1.this;
      if (!A)
      {
        A = true;
        paramThread.L(true);
        paramThread.Q(false);
        paramThrowable = new v1(paramThrowable);
        z = paramThrowable;
        F.i(paramThrowable);
        R.D(null);
        P.a(d.a.d, "PANIC! Entering TRANSIENT_FAILURE");
        s.a(eb.n.c);
      }
    }
  }
  
  public final class d
    extends eb.e<Object, Object>
  {
    public final void a(String paramString, Throwable paramThrowable) {}
    
    public final void b() {}
    
    public final void c(int paramInt) {}
    
    public final void d(Object paramObject) {}
    
    public final void e(e.a<Object> parama, eb.s0 params0) {}
  }
  
  public final class e
    implements q.c
  {
    public volatile y2.b0 a;
    
    public e() {}
    
    public final u a(s2 params2)
    {
      Object localObject = z;
      if (H.get()) {}
      do
      {
        for (;;)
        {
          return F;
          if (localObject != null) {
            break;
          }
          n.execute(new z1(this));
        }
        localObject = ((k0.j)localObject).a(params2);
        params2 = a;
        params2 = v0.e((k0.f)localObject, Boolean.TRUE.equals(h));
      } while (params2 == null);
      return params2;
    }
  }
  
  public static final class f<ReqT, RespT>
    extends x<ReqT, RespT>
  {
    public final eb.d0 a;
    public final e9.a b;
    public final Executor c;
    public final t0<ReqT, RespT> d;
    public final eb.p e;
    public c f;
    public eb.e<ReqT, RespT> g;
    
    public f(eb.d0 paramd0, r1.m.a parama, Executor paramExecutor, t0 paramt0, c paramc)
    {
      a = paramd0;
      b = parama;
      d = paramt0;
      paramd0 = b;
      if (paramd0 != null) {
        paramExecutor = paramd0;
      }
      c = paramExecutor;
      paramd0 = c.b(paramc);
      b = paramExecutor;
      f = new c(paramd0);
      e = eb.p.b();
    }
    
    public final void a(String paramString, Throwable paramThrowable)
    {
      eb.e locale = g;
      if (locale != null) {
        locale.a(paramString, paramThrowable);
      }
    }
    
    public final void e(e.a<RespT> parama, eb.s0 params0)
    {
      Object localObject1 = d;
      Object localObject2 = f;
      b.y(localObject1, "method");
      b.y(params0, "headers");
      b.y(localObject2, "callOptions");
      localObject1 = a.a();
      localObject2 = a;
      if (!((e1)localObject2).e())
      {
        params0 = v0.g((e1)localObject2);
        c.execute(new b2(this, parama, params0));
        g = r1.l0;
        return;
      }
      eb.f localf = c;
      g2 localg2 = (g2)b;
      t0 localt0 = d;
      localObject2 = (g2.a)b.get(b);
      localObject1 = localObject2;
      if (localObject2 == null)
      {
        localObject1 = c;
        localObject1 = (g2.a)c.get(localObject1);
      }
      localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = a;
      }
      if (localObject2 != null) {
        f = f.c(g2.a.g, localObject2);
      }
      if (localf != null) {
        localObject1 = localf.a();
      } else {
        localObject1 = b.v(d, f);
      }
      g = ((eb.e)localObject1);
      ((eb.e)localObject1).e(parama, params0);
    }
    
    public final eb.e<ReqT, RespT> f()
    {
      return g;
    }
  }
  
  public final class g
    implements h2.a
  {
    public g() {}
    
    public final void a(e1 parame1)
    {
      b.I(H.get(), "Channel must have been shut down");
    }
    
    public final void b() {}
    
    public final eb.a c(eb.a parama)
    {
      return parama;
    }
    
    public final void d()
    {
      b.I(H.get(), "Channel must have been shut down");
      r1 localr1 = r1.this;
      J = true;
      localr1.Q(false);
      r1.J(r1.this);
      r1.K(r1.this);
    }
    
    public final void e(boolean paramBoolean)
    {
      r1 localr1 = r1.this;
      b0.c(F, paramBoolean);
    }
  }
  
  public static final class h
    implements Executor
  {
    public final m2<? extends Executor> a;
    public Executor b;
    
    public h(j3 paramj3)
    {
      a = paramj3;
    }
    
    public final void execute(Runnable paramRunnable)
    {
      try
      {
        if (b == null)
        {
          localExecutor = (Executor)a.b();
          b.z("%s.getObject()", localExecutor, b);
          b = localExecutor;
        }
        Executor localExecutor = b;
        localExecutor.execute(paramRunnable);
        return;
      }
      finally {}
    }
  }
  
  public final class i
    extends c1<Object>
  {
    public i() {}
    
    public final void a()
    {
      M();
    }
    
    public final void b()
    {
      if (H.get()) {
        return;
      }
      O();
    }
  }
  
  public final class j
    implements Runnable
  {
    public j() {}
    
    public final void run()
    {
      r1 localr1 = r1.this;
      if (y == null) {
        return;
      }
      r1.I(localr1);
    }
  }
  
  public final class k
    extends k0.e
  {
    public i.a a;
    
    public k() {}
    
    public final k0.i a(k0.b paramb)
    {
      n.d();
      b.I(J ^ true, "Channel is being terminated");
      return new r1.o(r1.this, paramb);
    }
    
    public final d b()
    {
      return P;
    }
    
    public final ScheduledExecutorService c()
    {
      return h;
    }
    
    public final eb.h1 d()
    {
      return n;
    }
    
    public final void e()
    {
      n.d();
      n.execute(new a());
    }
    
    public final void f(final eb.n paramn, final k0.j paramj)
    {
      n.d();
      b.y(paramn, "newState");
      b.y(paramj, "newPicker");
      n.execute(new b(paramj, paramn));
    }
    
    public final class a
      implements Runnable
    {
      public a() {}
      
      public final void run()
      {
        r1 localr1 = r1.this;
        n.d();
        if (x) {
          w.b();
        }
      }
    }
    
    public final class b
      implements Runnable
    {
      public final void run()
      {
        Object localObject1 = c;
        Object localObject2 = b;
        if (localObject1 != y) {
          return;
        }
        localObject1 = paramj;
        z = ((k0.j)localObject1);
        F.i((k0.j)localObject1);
        localObject2 = paramn;
        if (localObject2 != eb.n.e)
        {
          c.b.P.b(d.a.b, "Entering {0} state with picker: {1}", new Object[] { localObject2, paramj });
          c.b.s.a(paramn);
        }
      }
    }
  }
  
  public final class l
    extends u0.d
  {
    public final r1.k a;
    public final u0 b;
    
    public l(r1.k paramk, u0 paramu0)
    {
      a = paramk;
      b.y(paramu0, "resolver");
      b = paramu0;
    }
    
    public final void a(final e1 parame1)
    {
      b.s("the error status must not be OK", parame1.e() ^ true);
      n.execute(new a(parame1));
    }
    
    public final void b(final u0.e parame)
    {
      n.execute(new b(parame));
    }
    
    public final class a
      implements Runnable
    {
      public final void run()
      {
        r1.l locall = b;
        e1 locale1 = parame1;
        locall.getClass();
        r1.e0.log(Level.WARNING, "[{0}] Failed to resolve name. status={1}", new Object[] { c.b, locale1 });
        Object localObject = c.R;
        if (b.get() == r1.k0) {
          ((r1.m)localObject).D(null);
        }
        localObject = c;
        if (S != 3)
        {
          P.b(d.a.c, "Failed to resolve name: {0}", new Object[] { locale1 });
          c.S = 3;
        }
        localObject = a;
        if (localObject == c.y) {
          a.b.c(locale1);
        }
      }
    }
    
    public final class b
      implements Runnable
    {
      public final void run()
      {
        d.a locala1 = d.a.a;
        d.a locala2 = d.a.b;
        Object localObject1 = b;
        Object localObject3 = c;
        if (w != b) {
          return;
        }
        localObject1 = parame;
        List localList = a;
        P.b(locala1, "Resolved address: {0}, config={1}", new Object[] { localList, b });
        localObject3 = b.c;
        if (S != 2)
        {
          P.b(locala2, "Address resolved: {0}", new Object[] { localList });
          b.c.S = 2;
        }
        localObject3 = parame;
        Object localObject4 = c;
        c3.b localb = (c3.b)b.a(c3.d);
        Object localObject5 = (eb.d0)parameb.a(eb.d0.a);
        if (localObject4 != null)
        {
          localObject3 = b;
          if (localObject3 != null)
          {
            localObject1 = (g2)localObject3;
            break label194;
          }
        }
        localObject1 = null;
        label194:
        if (localObject4 != null) {
          localObject3 = a;
        } else {
          localObject3 = null;
        }
        Object localObject6 = b.c;
        if (!V)
        {
          if (localObject1 != null) {
            P.a(locala2, "Service config from name resolver discarded by channel settings");
          }
          b.c.getClass();
          localObject3 = r1.j0;
          if (localObject5 != null) {
            b.c.P.a(locala2, "Config selector from name resolver discarded by channel settings");
          }
          b.c.R.D(((g2)localObject3).b());
        }
        else
        {
          if (localObject1 != null)
          {
            if (localObject5 != null)
            {
              R.D((eb.d0)localObject5);
              localObject3 = localObject1;
              if (((g2)localObject1).b() != null)
              {
                b.c.P.a(locala1, "Method configs in service config will be discarded due to presence ofconfig-selector");
                localObject3 = localObject1;
              }
            }
            else
            {
              R.D(((g2)localObject1).b());
              localObject3 = localObject1;
            }
          }
          else if (localObject3 != null)
          {
            if (!U)
            {
              P.a(locala2, "Fallback to error due to invalid first service config without default config");
              b.a(a);
              if (localb != null) {
                localb.a(a);
              }
              return;
            }
            localObject3 = T;
          }
          else
          {
            localObject3 = r1.j0;
            R.D(null);
          }
          if (!((g2)localObject3).equals(b.c.T))
          {
            localObject5 = b.c.P;
            if (localObject3 == r1.j0) {
              localObject1 = " to empty";
            } else {
              localObject1 = "";
            }
            ((n)localObject5).b(locala2, "Service config changed{0}", new Object[] { localObject1 });
            localObject1 = b.c;
            T = ((g2)localObject3);
            c0.a = d;
          }
          try
          {
            b.c.U = true;
          }
          catch (RuntimeException localRuntimeException)
          {
            localObject6 = r1.e0;
            localObject5 = Level.WARNING;
            localObject4 = f.l("[");
            ((StringBuilder)localObject4).append(b.c.b);
            ((StringBuilder)localObject4).append("] Unexpected exception from parsing service config");
            ((Logger)localObject6).log((Level)localObject5, ((StringBuilder)localObject4).toString(), localRuntimeException);
          }
        }
        localObject5 = parameb;
        Object localObject2 = b;
        if (a == c.y)
        {
          localObject5.getClass();
          localObject5 = new a.a((eb.a)localObject5);
          ((a.a)localObject5).b(eb.d0.a);
          localObject2 = f;
          if (localObject2 != null)
          {
            ((a.a)localObject5).c(k0.b, localObject2);
            ((a.a)localObject5).a();
          }
          localObject4 = ((a.a)localObject5).a();
          localObject5 = b.a.a;
          localObject2 = eb.a.b;
          localObject3 = e;
          b.y(localList, "addresses");
          localList = Collections.unmodifiableList(new ArrayList(localList));
          b.y(localObject4, "attributes");
          localObject5.getClass();
          localObject2 = (g3.b)localObject3;
          localObject3 = localObject2;
          if (localObject2 == null) {
            try
            {
              localObject3 = d;
              localObject3 = i.a((i)localObject3, b);
              localObject3 = new g3.b((l0)localObject3, null);
            }
            catch (i.e locale)
            {
              locale1 = e1.m.g(locale.getMessage());
              a.f(eb.n.c, new i.c(locale1));
              b.f();
              c = null;
              b = new i.d();
              locale1 = e1.e;
              break label1056;
            }
          }
          if ((c == null) || (!a.b().equals(c.b())))
          {
            a.f(eb.n.a, new i.b());
            b.f();
            localObject2 = a;
            c = ((l0)localObject2);
            localObject6 = b;
            b = ((k0.c)localObject2).a(a);
            a.b().b(locala2, "Load balancer changed from {0} to {1}", new Object[] { localObject6.getClass().getSimpleName(), b.getClass().getSimpleName() });
          }
          localObject2 = b;
          if (localObject2 != null) {
            a.b().b(locala1, "Load-balancing config: {0}", new Object[] { b });
          }
          e1 locale1 = b.a(new k0.h(localList, (eb.a)localObject4, localObject2));
          label1056:
          if (localb != null) {
            localb.a(locale1);
          }
        }
      }
    }
  }
  
  public final class m
    extends e9.a
  {
    public final AtomicReference<eb.d0> b = new AtomicReference(r1.k0);
    public final String c;
    public final a d = new a();
    
    public m(String paramString)
    {
      b.y(paramString, "authority");
      c = paramString;
    }
    
    public final <ReqT, RespT> eb.e<ReqT, RespT> C(t0<ReqT, RespT> paramt0, c paramc)
    {
      Object localObject1 = (eb.d0)b.get();
      if (localObject1 == null)
      {
        localObject1 = paramc;
      }
      else
      {
        if (!(localObject1 instanceof g2.b)) {
          break label124;
        }
        g2 localg2 = b;
        Object localObject2 = (g2.a)b.get(b);
        localObject1 = localObject2;
        if (localObject2 == null)
        {
          localObject1 = c;
          localObject1 = (g2.a)c.get(localObject1);
        }
        localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = a;
        }
        localObject1 = paramc;
        if (localObject2 != null) {
          localObject1 = paramc.c(g2.a.g, localObject2);
        }
      }
      return d.v(paramt0, (c)localObject1);
      label124:
      return new r1.f((eb.d0)localObject1, d, i, paramt0, paramc);
    }
    
    public final void D(eb.d0 paramd0)
    {
      eb.d0 locald0 = (eb.d0)b.get();
      b.set(paramd0);
      if (locald0 == r1.k0)
      {
        paramd0 = C;
        if (paramd0 != null)
        {
          paramd0 = paramd0.iterator();
          while (paramd0.hasNext()) {
            ((e)paramd0.next()).j();
          }
        }
      }
    }
    
    public final String b()
    {
      return c;
    }
    
    public final <ReqT, RespT> eb.e<ReqT, RespT> v(final t0<ReqT, RespT> paramt0, c paramc)
    {
      Object localObject = b.get();
      r1.a locala = r1.k0;
      if (localObject != locala) {
        return C(paramt0, paramc);
      }
      n.execute(new b());
      if (b.get() != locala) {
        return C(paramt0, paramc);
      }
      if (H.get()) {
        return new c();
      }
      paramt0 = new e(eb.p.b(), paramt0, paramc);
      n.execute(new d(paramt0));
      return paramt0;
    }
    
    public final class a
      extends e9.a
    {
      public a() {}
      
      public final String b()
      {
        return c;
      }
      
      public final <RequestT, ResponseT> eb.e<RequestT, ResponseT> v(t0<RequestT, ResponseT> paramt0, c paramc)
      {
        Object localObject1 = r1.this;
        Object localObject2 = r1.e0;
        localObject1.getClass();
        localObject2 = b;
        if (localObject2 == null) {
          localObject2 = i;
        }
        localObject1 = r1.this;
        r1.e locale = c0;
        if (K) {
          localObject1 = null;
        } else {
          localObject1 = g.p0();
        }
        paramt0 = new q(paramt0, (Executor)localObject2, paramc, locale, (ScheduledExecutorService)localObject1, N);
        getClass();
        q = false;
        paramc = r1.this;
        r = o;
        s = p;
        return paramt0;
      }
    }
    
    public final class b
      implements Runnable
    {
      public b() {}
      
      public final void run()
      {
        M();
      }
    }
    
    public final class c
      extends eb.e<ReqT, RespT>
    {
      public final void a(String paramString, Throwable paramThrowable) {}
      
      public final void b() {}
      
      public final void c(int paramInt) {}
      
      public final void d(ReqT paramReqT) {}
      
      public final void e(e.a<RespT> parama, eb.s0 params0)
      {
        params0 = r1.h0;
        parama.a(new eb.s0(), params0);
      }
    }
    
    public final class d
      implements Runnable
    {
      public d(r1.m.e parame) {}
      
      public final void run()
      {
        if (b.get() == r1.k0)
        {
          r1 localr1 = r1.this;
          if (C == null)
          {
            C = new LinkedHashSet();
            localr1 = r1.this;
            b0.c(D, true);
          }
          C.add(paramt0);
        }
        else
        {
          paramt0.j();
        }
      }
    }
    
    public final class e<ReqT, RespT>
      extends d0<ReqT, RespT>
    {
      public final eb.p k;
      public final t0<ReqT, RespT> l;
      public final c m;
      public final long n;
      
      public e(t0<ReqT, RespT> paramt0, c paramc)
      {
        super(h, a);
        k = paramt0;
        l = paramc;
        m = localc;
        a0.getClass();
        n = System.nanoTime();
      }
      
      public final void f()
      {
        n.execute(new b());
      }
      
      public final void j()
      {
        Object localObject1 = k.a();
        try
        {
          Object localObject3 = m;
          Object localObject5 = h.b;
          a0.getClass();
          localObject3 = ((c)localObject3).c((c.b)localObject5, Long.valueOf(System.nanoTime() - n));
          localObject3 = C(l, (c)localObject3);
          k.c((eb.p)localObject1);
          try
          {
            localObject1 = f;
            if (localObject1 != null)
            {
              localObject1 = null;
              break label152;
            }
            boolean bool;
            if (localObject1 == null) {
              bool = true;
            } else {
              bool = false;
            }
            b.G(localObject1, "realCall already set to %s", bool);
            localObject1 = a;
            if (localObject1 != null) {
              ((Future)localObject1).cancel(false);
            }
          }
          finally
          {
            break label233;
          }
          f = ((eb.e)localObject3);
          localb0 = new b0(this, c);
          label152:
          if (localb0 == null)
          {
            n.execute(new b());
          }
          else
          {
            r1 localr1 = r1.this;
            localObject3 = m;
            localr1.getClass();
            localObject5 = b;
            localObject3 = localObject5;
            if (localObject5 == null) {
              localObject3 = i;
            }
            ((Executor)localObject3).execute(new a(localb0));
          }
          return;
        }
        finally
        {
          final b0 localb0;
          label233:
          k.c(localb0);
        }
        throw localb0;
      }
      
      public final class a
        implements Runnable
      {
        public a(b0 paramb0) {}
        
        public final void run()
        {
          localb0.run();
          r1.m.e locale = r1.m.e.this;
          o.e.n.execute(new r1.m.e.b(locale));
        }
      }
      
      public final class b
        implements Runnable
      {
        public b() {}
        
        public final void run()
        {
          r1.m.e locale = r1.m.e.this;
          Object localObject = o.e.C;
          if (localObject != null)
          {
            ((Collection)localObject).remove(locale);
            if (C.isEmpty())
            {
              localObject = r1.this;
              b0.c(D, false);
              localObject = r1.this;
              C = null;
              if (H.get()) {
                G.a(r1.h0);
              }
            }
          }
        }
      }
    }
  }
  
  public static final class n
    implements ScheduledExecutorService
  {
    public final ScheduledExecutorService a;
    
    public n(ScheduledExecutorService paramScheduledExecutorService)
    {
      b.y(paramScheduledExecutorService, "delegate");
      a = paramScheduledExecutorService;
    }
    
    public final boolean awaitTermination(long paramLong, TimeUnit paramTimeUnit)
    {
      return a.awaitTermination(paramLong, paramTimeUnit);
    }
    
    public final void execute(Runnable paramRunnable)
    {
      a.execute(paramRunnable);
    }
    
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> paramCollection)
    {
      return a.invokeAll(paramCollection);
    }
    
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> paramCollection, long paramLong, TimeUnit paramTimeUnit)
    {
      return a.invokeAll(paramCollection, paramLong, paramTimeUnit);
    }
    
    public final <T> T invokeAny(Collection<? extends Callable<T>> paramCollection)
    {
      return (T)a.invokeAny(paramCollection);
    }
    
    public final <T> T invokeAny(Collection<? extends Callable<T>> paramCollection, long paramLong, TimeUnit paramTimeUnit)
    {
      return (T)a.invokeAny(paramCollection, paramLong, paramTimeUnit);
    }
    
    public final boolean isShutdown()
    {
      return a.isShutdown();
    }
    
    public final boolean isTerminated()
    {
      return a.isTerminated();
    }
    
    public final ScheduledFuture<?> schedule(Runnable paramRunnable, long paramLong, TimeUnit paramTimeUnit)
    {
      return a.schedule(paramRunnable, paramLong, paramTimeUnit);
    }
    
    public final <V> ScheduledFuture<V> schedule(Callable<V> paramCallable, long paramLong, TimeUnit paramTimeUnit)
    {
      return a.schedule(paramCallable, paramLong, paramTimeUnit);
    }
    
    public final ScheduledFuture<?> scheduleAtFixedRate(Runnable paramRunnable, long paramLong1, long paramLong2, TimeUnit paramTimeUnit)
    {
      return a.scheduleAtFixedRate(paramRunnable, paramLong1, paramLong2, paramTimeUnit);
    }
    
    public final ScheduledFuture<?> scheduleWithFixedDelay(Runnable paramRunnable, long paramLong1, long paramLong2, TimeUnit paramTimeUnit)
    {
      return a.scheduleWithFixedDelay(paramRunnable, paramLong1, paramLong2, paramTimeUnit);
    }
    
    public final void shutdown()
    {
      throw new UnsupportedOperationException("Restricted: shutdown() is not allowed");
    }
    
    public final List<Runnable> shutdownNow()
    {
      throw new UnsupportedOperationException("Restricted: shutdownNow() is not allowed");
    }
    
    public final Future<?> submit(Runnable paramRunnable)
    {
      return a.submit(paramRunnable);
    }
    
    public final <T> Future<T> submit(Runnable paramRunnable, T paramT)
    {
      return a.submit(paramRunnable, paramT);
    }
    
    public final <T> Future<T> submit(Callable<T> paramCallable)
    {
      return a.submit(paramCallable);
    }
  }
  
  public final class o
    extends e
  {
    public final k0.b a;
    public final eb.f0 b;
    public final n c;
    public final p d;
    public List<eb.u> e;
    public d1 f;
    public boolean g;
    public boolean h;
    public h1.c i;
    
    public o(k0.b paramb)
    {
      e = a;
      Object localObject = r1.e0;
      getClass();
      a = paramb;
      localObject = b();
      localObject = new eb.f0(eb.f0.d.incrementAndGet(), "Subchannel", (String)localObject);
      b = ((eb.f0)localObject);
      long l = m.a();
      StringBuilder localStringBuilder = f.l("Subchannel for ");
      localStringBuilder.append(a);
      paramb = new p((eb.f0)localObject, l, localStringBuilder.toString());
      d = paramb;
      c = new n(paramb, m);
    }
    
    public final List<eb.u> b()
    {
      n.d();
      b.I(g, "not started");
      return e;
    }
    
    public final eb.a c()
    {
      return a.b;
    }
    
    public final d d()
    {
      return c;
    }
    
    public final Object e()
    {
      b.I(g, "Subchannel is not started");
      return f;
    }
    
    public final void f()
    {
      n.d();
      b.I(g, "not started");
      f.a();
    }
    
    public final void g()
    {
      n.d();
      if (f == null)
      {
        h = true;
        return;
      }
      if (h)
      {
        if (J)
        {
          localObject = i;
          if (localObject != null)
          {
            ((h1.c)localObject).a();
            i = null;
            break label67;
          }
        }
      }
      else {
        h = true;
      }
      label67:
      Object localObject = r1.this;
      if (!J)
      {
        i = n.c(new p1(new b()), 5L, TimeUnit.SECONDS, g.p0());
        return;
      }
      localObject = f;
      e1 locale1 = r1.h0;
      l.execute(new h1((d1)localObject, locale1));
    }
    
    public final void h(final k0.k paramk)
    {
      n.d();
      b.I(g ^ true, "already started");
      b.I(h ^ true, "already shutdown");
      b.I(J ^ true, "Channel is being terminated");
      g = true;
      Object localObject1 = a.a;
      Object localObject2 = b();
      getClass();
      Object localObject3 = r1.this;
      Object localObject4 = t;
      localObject3 = g;
      ScheduledExecutorService localScheduledExecutorService = ((l)localObject3).p0();
      r1 localr1 = r1.this;
      localObject1 = new d1((List)localObject1, (String)localObject2, (j.a)localObject4, (l)localObject3, localScheduledExecutorService, q, n, new a(paramk), Q, new m(M.a), d, b, c, v);
      localObject4 = r1.this;
      localObject2 = O;
      paramk = b0.a.a;
      localObject4 = Long.valueOf(m.a());
      b.y(localObject4, "timestampNanos");
      ((p)localObject2).b(new eb.b0("Child Subchannel started", paramk, ((Long)localObject4).longValue(), (e0)localObject1));
      f = ((d1)localObject1);
      c0.a(Q.b, (e0)localObject1);
      B.add(localObject1);
    }
    
    public final void i(List<eb.u> paramList)
    {
      n.d();
      e = paramList;
      getClass();
      d1 locald1 = f;
      locald1.getClass();
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext()) {
        b.y(localIterator.next(), "newAddressGroups contains null entry");
      }
      b.s("newAddressGroups is empty", paramList.isEmpty() ^ true);
      paramList = Collections.unmodifiableList(new ArrayList(paramList));
      l.execute(new g1(locald1, paramList));
    }
    
    public final String toString()
    {
      return b.toString();
    }
    
    public final class a
      extends d1.c
    {}
    
    public final class b
      implements Runnable
    {
      public b() {}
      
      public final void run()
      {
        d1 locald1 = f;
        e1 locale1 = r1.i0;
        l.execute(new h1(locald1, locale1));
      }
    }
  }
  
  public final class p
  {
    public final Object a = new Object();
    public HashSet b = new HashSet();
    public e1 c;
    
    public p() {}
    
    public final void a(e1 parame1)
    {
      synchronized (a)
      {
        if (c != null) {
          return;
        }
        c = parame1;
        boolean bool = b.isEmpty();
        if (bool) {
          F.c(parame1);
        }
        return;
      }
    }
  }
}

/* Location:
 * Qualified Name:     gb.r1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */