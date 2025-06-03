package V3;

import Q3.e.e;
import Q3.r.b;
import Q3.r.c;
import T3.h.a;
import Y3.k.b;
import Y3.k.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class m
  implements h.a
{
  public final p a;
  public final Y3.f b = new Y3.f(new Y3.b(), 0L);
  public T3.h c;
  public t d;
  public u e;
  public Y3.k f;
  public boolean g = false;
  public final a4.g h;
  public final f i;
  public final c4.c j;
  public final c4.c k;
  public final c4.c l;
  public long m = 0L;
  public long n = 1L;
  public x o;
  public x p;
  public Q3.h q;
  public boolean r = false;
  public long s = 0L;
  
  public m(p paramp, f paramf, Q3.h paramh)
  {
    a = paramp;
    i = paramf;
    q = paramh;
    j = paramf.q("RepoOperation");
    k = paramf.q("Transaction");
    l = paramf.q("DataOperation");
    h = new a4.g(paramf);
    i0(new k());
  }
  
  public static Q3.c I(String paramString1, String paramString2)
  {
    if (paramString1 != null) {
      return Q3.c.d(paramString1, paramString2);
    }
    return null;
  }
  
  public final void C(long paramLong, k paramk, Q3.c paramc)
  {
    if ((paramc == null) || (paramc.f() != -25))
    {
      int i1;
      if (paramc == null) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      paramc = p.s(paramLong, i1 ^ 0x1, true, b);
      if (paramc.size() > 0) {
        d0(paramk);
      }
      Y(paramc);
    }
  }
  
  public void D(h paramh)
  {
    Object localObject = paramh.e().e().Z();
    if ((localObject != null) && (((d4.b)localObject).equals(c.a))) {}
    for (localObject = o;; localObject = p)
    {
      paramh = ((x)localObject).t(paramh);
      break;
    }
    Y(paramh);
  }
  
  public final void E(final List paramList, Y3.k paramk)
  {
    List localList = (List)paramk.g();
    if (localList != null) {
      paramList.addAll(localList);
    }
    paramk.c(new n(paramList));
  }
  
  public final List F(Y3.k paramk)
  {
    ArrayList localArrayList = new ArrayList();
    E(localArrayList, paramk);
    Collections.sort(localArrayList);
    return localArrayList;
  }
  
  public void G(final e.e parame, final Q3.c paramc, k paramk)
  {
    if (parame != null)
    {
      d4.b localb = paramk.X();
      k localk = paramk;
      if (localb != null)
      {
        localk = paramk;
        if (localb.s()) {
          localk = paramk.a0();
        }
      }
      X(new w(parame, paramc, Q3.k.c(this, localk)));
    }
  }
  
  public final void H()
  {
    Object localObject = a;
    localObject = new T3.f(a, c, b);
    c = i.E((T3.f)localObject, this);
    i.m().b(((Y3.c)i.v()).d(), new r());
    i.l().b(((Y3.c)i.v()).d(), new s());
    c.a();
    localObject = i.t(a.a);
    d = new t();
    e = new u();
    f = new Y3.k();
    o = new x(i, new X3.d(), new t());
    p = new x(i, (X3.e)localObject, new u());
    e0((X3.e)localObject);
    localObject = c.c;
    Boolean localBoolean = Boolean.FALSE;
    p0((d4.b)localObject, localBoolean);
    p0(c.d, localBoolean);
  }
  
  public final Y3.k J(k paramk)
  {
    Y3.k localk = f;
    while ((!paramk.isEmpty()) && (localk.g() == null))
    {
      localk = localk.k(new k(new d4.b[] { paramk.Z() }));
      paramk = paramk.c0();
    }
    return localk;
  }
  
  public final d4.n K(k paramk)
  {
    return L(paramk, new ArrayList());
  }
  
  public final d4.n L(k paramk, List paramList)
  {
    paramList = p.J(paramk, paramList);
    paramk = paramList;
    if (paramList == null) {
      paramk = d4.g.W();
    }
    return paramk;
  }
  
  public final long M()
  {
    long l1 = n;
    n = (1L + l1);
    return l1;
  }
  
  public x N()
  {
    return p;
  }
  
  public V2.j O(final Q3.p paramp)
  {
    final V2.k localk = new V2.k();
    i0(new y(paramp, localk, this));
    return localk.a();
  }
  
  public void P()
  {
    c.j("repo_interrupt");
  }
  
  public void Q(a4.i parami, boolean paramBoolean)
  {
    R(parami, paramBoolean, false);
  }
  
  public void R(a4.i parami, boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool;
    if ((!parami.e().isEmpty()) && (parami.e().Z().equals(c.a))) {
      bool = false;
    } else {
      bool = true;
    }
    Y3.m.f(bool);
    p.O(parami, paramBoolean1, paramBoolean2);
  }
  
  public final long S()
  {
    long l1 = s;
    s = (1L + l1);
    return l1;
  }
  
  public void T(final k paramk, final e.e parame)
  {
    c.m(paramk.S(), new d(paramk, parame));
  }
  
  public void U(final k paramk, final d4.n paramn, final e.e parame)
  {
    c.h(paramk.S(), paramn.L(true), new b(paramk, paramn, parame));
  }
  
  public void V(final k paramk, final Map paramMap1, final e.e parame, Map paramMap2)
  {
    c.b(paramk.S(), paramMap2, new c(paramk, paramMap1, parame));
  }
  
  public void W(d4.b paramb, Object paramObject)
  {
    p0(paramb, paramObject);
  }
  
  public void X(Runnable paramRunnable)
  {
    i.F();
    i.o().b(paramRunnable);
  }
  
  public final void Y(List paramList)
  {
    if (!paramList.isEmpty()) {
      h.b(paramList);
    }
  }
  
  public final void Z(Y3.k paramk)
  {
    List localList = (List)paramk.g();
    if (localList != null)
    {
      int i1 = 0;
      while (i1 < localList.size()) {
        if (z.n((z)localList.get(i1)) == A.r) {
          localList.remove(i1);
        } else {
          i1++;
        }
      }
      if (localList.size() > 0) {}
      for (;;)
      {
        paramk.j(localList);
        break;
        localList = null;
      }
    }
    paramk.c(new j());
  }
  
  public void a()
  {
    W(c.d, Boolean.TRUE);
  }
  
  public void a0()
  {
    if (j.f()) {
      j.b("Purging writes", new Object[0]);
    }
    Y(p.U());
    g(k.Y(), -25);
    c.e();
  }
  
  public void b(Map paramMap)
  {
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      p0(d4.b.j((String)localEntry.getKey()), localEntry.getValue());
    }
  }
  
  public void b0(h paramh)
  {
    if (c.a.equals(paramh.e().e().Z())) {}
    for (x localx = o;; localx = p)
    {
      paramh = localx.V(paramh);
      break;
    }
    Y(paramh);
  }
  
  public void c(List paramList, Object paramObject, boolean paramBoolean, Long paramLong)
  {
    k localk = new k(paramList);
    Object localObject1;
    if (j.f())
    {
      paramList = j;
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("onDataUpdate: ");
      ((StringBuilder)localObject1).append(localk);
      paramList.b(((StringBuilder)localObject1).toString(), new Object[0]);
    }
    if (l.f())
    {
      paramList = j;
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("onDataUpdate: ");
      ((StringBuilder)localObject1).append(localk);
      ((StringBuilder)localObject1).append(" ");
      ((StringBuilder)localObject1).append(paramObject);
      paramList.b(((StringBuilder)localObject1).toString(), new Object[0]);
    }
    m += 1L;
    Object localObject2;
    if (paramLong != null)
    {
      try
      {
        paramList = new V3/y;
        paramList.<init>(paramLong.longValue());
        if (!paramBoolean) {
          break label278;
        }
        paramLong = new java/util/HashMap;
        paramLong.<init>();
        localObject2 = ((Map)paramObject).entrySet().iterator();
        while (((Iterator)localObject2).hasNext())
        {
          Map.Entry localEntry = (Map.Entry)((Iterator)localObject2).next();
          localObject1 = d4.o.a(localEntry.getValue());
          paramObject = new V3/k;
          ((k)paramObject).<init>((String)localEntry.getKey());
          paramLong.put(paramObject, localObject1);
        }
        paramList = p.E(localk, paramLong, paramList);
      }
      catch (Q3.d paramList) {}
      break label421;
      label278:
      paramObject = d4.o.a(paramObject);
      paramList = p.F(localk, (d4.n)paramObject, paramList);
    }
    else if (paramBoolean)
    {
      paramList = new java/util/HashMap;
      paramList.<init>();
      paramObject = ((Map)paramObject).entrySet().iterator();
      while (((Iterator)paramObject).hasNext())
      {
        localObject2 = (Map.Entry)((Iterator)paramObject).next();
        localObject1 = d4.o.a(((Map.Entry)localObject2).getValue());
        paramLong = new V3/k;
        paramLong.<init>((String)((Map.Entry)localObject2).getKey());
        paramList.put(paramLong, localObject1);
      }
      paramList = p.z(localk, paramList);
    }
    else
    {
      paramList = d4.o.a(paramObject);
      paramList = p.A(localk, paramList);
    }
    label421:
    if (paramList.size() > 0) {
      d0(localk);
    }
    Y(paramList);
    return;
    j.c("FIREBASE INTERNAL ERROR", paramList);
  }
  
  /* Error */
  public final void c0(final List paramList, k paramk)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface 512 1 0
    //   6: ifeq +4 -> 10
    //   9: return
    //   10: new 305	java/util/ArrayList
    //   13: dup
    //   14: invokespecial 306	java/util/ArrayList:<init>	()V
    //   17: astore_3
    //   18: new 305	java/util/ArrayList
    //   21: dup
    //   22: invokespecial 306	java/util/ArrayList:<init>	()V
    //   25: astore 4
    //   27: aload_1
    //   28: invokeinterface 654 1 0
    //   33: astore 5
    //   35: aload 5
    //   37: invokeinterface 569 1 0
    //   42: ifeq +30 -> 72
    //   45: aload 4
    //   47: aload 5
    //   49: invokeinterface 572 1 0
    //   54: checkcast 67	V3/m$z
    //   57: invokestatic 657	V3/m$z:p	(LV3/m$z;)J
    //   60: invokestatic 661	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   63: invokeinterface 664 2 0
    //   68: pop
    //   69: goto -34 -> 35
    //   72: aload_1
    //   73: invokeinterface 654 1 0
    //   78: astore 6
    //   80: aload 6
    //   82: invokeinterface 569 1 0
    //   87: istore 7
    //   89: iconst_0
    //   90: istore 8
    //   92: iconst_0
    //   93: istore 9
    //   95: iload 7
    //   97: ifeq +498 -> 595
    //   100: aload 6
    //   102: invokeinterface 572 1 0
    //   107: checkcast 67	V3/m$z
    //   110: astore 10
    //   112: aload_2
    //   113: aload 10
    //   115: invokestatic 667	V3/m$z:w	(LV3/m$z;)LV3/k;
    //   118: invokestatic 670	V3/k:b0	(LV3/k;LV3/k;)LV3/k;
    //   121: astore_1
    //   122: new 305	java/util/ArrayList
    //   125: dup
    //   126: invokespecial 306	java/util/ArrayList:<init>	()V
    //   129: astore 11
    //   131: aload_1
    //   132: ifnull +9 -> 141
    //   135: iconst_1
    //   136: istore 7
    //   138: goto +6 -> 144
    //   141: iconst_0
    //   142: istore 7
    //   144: iload 7
    //   146: invokestatic 467	Y3/m:f	(Z)V
    //   149: aload 10
    //   151: invokestatic 521	V3/m$z:n	(LV3/m$z;)LV3/m$A;
    //   154: getstatic 672	V3/m$A:t	LV3/m$A;
    //   157: if_acmpne +59 -> 216
    //   160: aload 10
    //   162: invokestatic 675	V3/m$z:C	(LV3/m$z;)LQ3/c;
    //   165: astore 5
    //   167: aload 5
    //   169: astore_1
    //   170: aload 5
    //   172: invokevirtual 246	Q3/c:f	()I
    //   175: bipush -25
    //   177: if_icmpeq +33 -> 210
    //   180: aload_0
    //   181: getfield 172	V3/m:p	LV3/x;
    //   184: aload 10
    //   186: invokestatic 657	V3/m$z:p	(LV3/m$z;)J
    //   189: iconst_1
    //   190: iconst_0
    //   191: aload_0
    //   192: getfield 115	V3/m:b	LY3/f;
    //   195: invokevirtual 251	V3/x:s	(JZZLY3/a;)Ljava/util/List;
    //   198: astore 12
    //   200: aload 5
    //   202: astore_1
    //   203: aload 12
    //   205: astore 5
    //   207: goto +57 -> 264
    //   210: iconst_1
    //   211: istore 9
    //   213: goto +303 -> 516
    //   216: aload 10
    //   218: invokestatic 521	V3/m$z:n	(LV3/m$z;)LV3/m$A;
    //   221: getstatic 677	V3/m$A:p	LV3/m$A;
    //   224: if_acmpne +290 -> 514
    //   227: aload 10
    //   229: invokestatic 680	V3/m$z:s	(LV3/m$z;)I
    //   232: bipush 25
    //   234: if_icmplt +43 -> 277
    //   237: ldc_w 682
    //   240: invokestatic 685	Q3/c:c	(Ljava/lang/String;)LQ3/c;
    //   243: astore_1
    //   244: aload_0
    //   245: getfield 172	V3/m:p	LV3/x;
    //   248: aload 10
    //   250: invokestatic 657	V3/m$z:p	(LV3/m$z;)J
    //   253: iconst_1
    //   254: iconst_0
    //   255: aload_0
    //   256: getfield 115	V3/m:b	LY3/f;
    //   259: invokevirtual 251	V3/x:s	(JZZLY3/a;)Ljava/util/List;
    //   262: astore 5
    //   264: aload 11
    //   266: aload 5
    //   268: invokeinterface 296 2 0
    //   273: pop
    //   274: goto -64 -> 210
    //   277: aload_0
    //   278: aload 10
    //   280: invokestatic 667	V3/m$z:w	(LV3/m$z;)LV3/k;
    //   283: aload 4
    //   285: invokevirtual 427	V3/m:L	(LV3/k;Ljava/util/List;)Ld4/n;
    //   288: astore 12
    //   290: aload 10
    //   292: aload 12
    //   294: invokestatic 688	V3/m$z:e	(LV3/m$z;Ld4/n;)Ld4/n;
    //   297: pop
    //   298: aload 12
    //   300: invokestatic 691	Q3/k:b	(Ld4/n;)LQ3/m;
    //   303: astore_1
    //   304: aload 10
    //   306: invokestatic 694	V3/m$z:x	(LV3/m$z;)LQ3/r$b;
    //   309: aload_1
    //   310: invokeinterface 699 2 0
    //   315: astore 5
    //   317: aconst_null
    //   318: astore_1
    //   319: goto +25 -> 344
    //   322: astore_1
    //   323: aload_0
    //   324: getfield 140	V3/m:j	Lc4/c;
    //   327: ldc_w 701
    //   330: aload_1
    //   331: invokevirtual 652	c4/c:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   334: aload_1
    //   335: invokestatic 704	Q3/c:b	(Ljava/lang/Throwable;)LQ3/c;
    //   338: astore_1
    //   339: invokestatic 709	Q3/r:a	()LQ3/r$c;
    //   342: astore 5
    //   344: aload 5
    //   346: invokevirtual 713	Q3/r$c:b	()Z
    //   349: ifeq +133 -> 482
    //   352: aload 10
    //   354: invokestatic 657	V3/m$z:p	(LV3/m$z;)J
    //   357: lstore 13
    //   359: aload_0
    //   360: getfield 115	V3/m:b	LY3/f;
    //   363: invokestatic 718	V3/s:c	(LY3/a;)Ljava/util/Map;
    //   366: astore 15
    //   368: aload 5
    //   370: invokevirtual 721	Q3/r$c:a	()Ld4/n;
    //   373: astore_1
    //   374: aload_1
    //   375: aload 12
    //   377: aload 15
    //   379: invokestatic 724	V3/s:i	(Ld4/n;Ld4/n;Ljava/util/Map;)Ld4/n;
    //   382: astore 5
    //   384: aload 10
    //   386: aload_1
    //   387: invokestatic 726	V3/m$z:j	(LV3/m$z;Ld4/n;)Ld4/n;
    //   390: pop
    //   391: aload 10
    //   393: aload 5
    //   395: invokestatic 728	V3/m$z:m	(LV3/m$z;Ld4/n;)Ld4/n;
    //   398: pop
    //   399: aload 10
    //   401: aload_0
    //   402: invokevirtual 730	V3/m:M	()J
    //   405: invokestatic 733	V3/m$z:r	(LV3/m$z;J)J
    //   408: pop2
    //   409: aload 4
    //   411: lload 13
    //   413: invokestatic 661	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   416: invokeinterface 735 2 0
    //   421: pop
    //   422: aload 11
    //   424: aload_0
    //   425: getfield 172	V3/m:p	LV3/x;
    //   428: aload 10
    //   430: invokestatic 667	V3/m$z:w	(LV3/m$z;)LV3/k;
    //   433: aload_1
    //   434: aload 5
    //   436: aload 10
    //   438: invokestatic 657	V3/m$z:p	(LV3/m$z;)J
    //   441: aload 10
    //   443: invokestatic 738	V3/m$z:F	(LV3/m$z;)Z
    //   446: iconst_0
    //   447: invokevirtual 741	V3/x:I	(LV3/k;Ld4/n;Ld4/n;JZZ)Ljava/util/List;
    //   450: invokeinterface 296 2 0
    //   455: pop
    //   456: aload 11
    //   458: aload_0
    //   459: getfield 172	V3/m:p	LV3/x;
    //   462: lload 13
    //   464: iconst_1
    //   465: iconst_0
    //   466: aload_0
    //   467: getfield 115	V3/m:b	LY3/f;
    //   470: invokevirtual 251	V3/x:s	(JZZLY3/a;)Ljava/util/List;
    //   473: invokeinterface 296 2 0
    //   478: pop
    //   479: goto +35 -> 514
    //   482: aload 11
    //   484: aload_0
    //   485: getfield 172	V3/m:p	LV3/x;
    //   488: aload 10
    //   490: invokestatic 657	V3/m$z:p	(LV3/m$z;)J
    //   493: iconst_1
    //   494: iconst_0
    //   495: aload_0
    //   496: getfield 115	V3/m:b	LY3/f;
    //   499: invokevirtual 251	V3/x:s	(JZZLY3/a;)Ljava/util/List;
    //   502: invokeinterface 296 2 0
    //   507: pop
    //   508: iconst_1
    //   509: istore 9
    //   511: goto +5 -> 516
    //   514: aconst_null
    //   515: astore_1
    //   516: aload_0
    //   517: aload 11
    //   519: invokevirtual 235	V3/m:Y	(Ljava/util/List;)V
    //   522: iload 9
    //   524: ifeq -444 -> 80
    //   527: aload 10
    //   529: getstatic 524	V3/m$A:r	LV3/m$A;
    //   532: invokestatic 744	V3/m$z:o	(LV3/m$z;LV3/m$A;)LV3/m$A;
    //   535: pop
    //   536: aload_0
    //   537: aload 10
    //   539: invokestatic 667	V3/m$z:w	(LV3/m$z;)LV3/k;
    //   542: invokestatic 327	Q3/k:c	(LV3/m;LV3/k;)LQ3/e;
    //   545: aload 10
    //   547: invokestatic 747	V3/m$z:c	(LV3/m$z;)Ld4/n;
    //   550: invokestatic 752	d4/i:d	(Ld4/n;)Ld4/i;
    //   553: invokestatic 755	Q3/k:a	(LQ3/e;Ld4/i;)LQ3/b;
    //   556: astore 5
    //   558: aload_0
    //   559: new 35	V3/m$l
    //   562: dup
    //   563: aload_0
    //   564: aload 10
    //   566: invokespecial 758	V3/m$l:<init>	(LV3/m;LV3/m$z;)V
    //   569: invokevirtual 162	V3/m:i0	(Ljava/lang/Runnable;)V
    //   572: aload_3
    //   573: new 37	V3/m$m
    //   576: dup
    //   577: aload_0
    //   578: aload 10
    //   580: aload_1
    //   581: aload 5
    //   583: invokespecial 761	V3/m$m:<init>	(LV3/m;LV3/m$z;LQ3/c;LQ3/b;)V
    //   586: invokeinterface 664 2 0
    //   591: pop
    //   592: goto -512 -> 80
    //   595: aload_0
    //   596: aload_0
    //   597: getfield 206	V3/m:f	LY3/k;
    //   600: invokevirtual 208	V3/m:Z	(LY3/k;)V
    //   603: iload 8
    //   605: istore 9
    //   607: iload 9
    //   609: aload_3
    //   610: invokeinterface 256 1 0
    //   615: if_icmpge +24 -> 639
    //   618: aload_0
    //   619: aload_3
    //   620: iload 9
    //   622: invokeinterface 518 2 0
    //   627: checkcast 763	java/lang/Runnable
    //   630: invokevirtual 332	V3/m:X	(Ljava/lang/Runnable;)V
    //   633: iinc 9 1
    //   636: goto -29 -> 607
    //   639: aload_0
    //   640: invokevirtual 211	V3/m:j0	()V
    //   643: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	644	0	this	m
    //   0	644	1	paramList	List
    //   0	644	2	paramk	k
    //   17	603	3	localArrayList1	ArrayList
    //   25	385	4	localArrayList2	ArrayList
    //   33	549	5	localObject1	Object
    //   78	23	6	localIterator	Iterator
    //   87	58	7	bool	boolean
    //   90	514	8	i1	int
    //   93	541	9	i2	int
    //   110	469	10	localz	z
    //   129	389	11	localArrayList3	ArrayList
    //   198	178	12	localObject2	Object
    //   357	106	13	l1	long
    //   366	12	15	localMap	Map
    // Exception table:
    //   from	to	target	type
    //   304	317	322	finally
  }
  
  public void d()
  {
    W(c.d, Boolean.FALSE);
    g0();
  }
  
  public final k d0(k paramk)
  {
    Y3.k localk = J(paramk);
    paramk = localk.f();
    c0(F(localk), paramk);
    return paramk;
  }
  
  public void e(boolean paramBoolean)
  {
    W(c.c, Boolean.valueOf(paramBoolean));
  }
  
  public final void e0(X3.e parame)
  {
    final Object localObject1 = parame.d();
    parame = s.c(b);
    Iterator localIterator = ((List)localObject1).iterator();
    long l1 = Long.MIN_VALUE;
    while (localIterator.hasNext())
    {
      localObject1 = (B)localIterator.next();
      Object localObject2 = new v((B)localObject1);
      if (l1 < ((B)localObject1).d())
      {
        l1 = ((B)localObject1).d();
        n = (((B)localObject1).d() + 1L);
        Object localObject3;
        Object localObject4;
        if (((B)localObject1).e())
        {
          if (j.f())
          {
            localObject3 = j;
            localObject4 = new StringBuilder();
            ((StringBuilder)localObject4).append("Restoring overwrite with id ");
            ((StringBuilder)localObject4).append(((B)localObject1).d());
            ((c4.c)localObject3).b(((StringBuilder)localObject4).toString(), new Object[0]);
          }
          c.r(((B)localObject1).c().S(), ((B)localObject1).b().L(true), (T3.p)localObject2);
          localObject2 = s.g(((B)localObject1).b(), p, ((B)localObject1).c(), parame);
          p.I(((B)localObject1).c(), ((B)localObject1).b(), (d4.n)localObject2, ((B)localObject1).d(), true, false);
        }
        else
        {
          if (j.f())
          {
            localObject4 = j;
            localObject3 = new StringBuilder();
            ((StringBuilder)localObject3).append("Restoring merge with id ");
            ((StringBuilder)localObject3).append(((B)localObject1).d());
            ((c4.c)localObject4).b(((StringBuilder)localObject3).toString(), new Object[0]);
          }
          c.f(((B)localObject1).c().S(), ((B)localObject1).a().U(true), (T3.p)localObject2);
          localObject2 = s.f(((B)localObject1).a(), p, ((B)localObject1).c(), parame);
          p.H(((B)localObject1).c(), ((B)localObject1).a(), (b)localObject2, ((B)localObject1).d(), false);
        }
      }
      else
      {
        throw new IllegalStateException("Write ids were not in order.");
      }
    }
  }
  
  public void f(List paramList1, List paramList2, Long paramLong)
  {
    k localk = new k(paramList1);
    c4.c localc;
    if (j.f())
    {
      localc = j;
      paramList1 = new StringBuilder();
      paramList1.append("onRangeMergeUpdate: ");
      paramList1.append(localk);
      localc.b(paramList1.toString(), new Object[0]);
    }
    if (l.f())
    {
      localc = j;
      paramList1 = new StringBuilder();
      paramList1.append("onRangeMergeUpdate: ");
      paramList1.append(localk);
      paramList1.append(" ");
      paramList1.append(paramList2);
      localc.b(paramList1.toString(), new Object[0]);
    }
    m += 1L;
    paramList1 = new ArrayList(paramList2.size());
    paramList2 = paramList2.iterator();
    while (paramList2.hasNext()) {
      paramList1.add(new d4.s((T3.o)paramList2.next()));
    }
    paramList2 = p;
    if (paramLong != null) {
      paramList1 = paramList2.G(localk, paramList1, new y(paramLong.longValue()));
    } else {
      paramList1 = paramList2.B(localk, paramList1);
    }
    if (paramList1.size() > 0) {
      d0(localk);
    }
    Y(paramList1);
  }
  
  public void f0()
  {
    c.p("repo_interrupt");
  }
  
  public final k g(k paramk, final int paramInt)
  {
    k localk = J(paramk).f();
    if (k.f())
    {
      c4.c localc = j;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Aborting transactions for path: ");
      localStringBuilder.append(paramk);
      localStringBuilder.append(". Affected: ");
      localStringBuilder.append(localk);
      localc.b(localStringBuilder.toString(), new Object[0]);
    }
    paramk = f.k(paramk);
    paramk.a(new o(paramInt));
    h(paramk, paramInt);
    paramk.d(new p(paramInt));
    return localk;
  }
  
  public final void g0()
  {
    final Map localMap = s.c(b);
    final ArrayList localArrayList = new ArrayList();
    e.b(k.Y(), new e(localMap, localArrayList));
    e = new u();
    Y(localArrayList);
  }
  
  public final void h(Y3.k paramk, int paramInt)
  {
    List localList = (List)paramk.g();
    ArrayList localArrayList1 = new ArrayList();
    if (localList != null)
    {
      ArrayList localArrayList2 = new ArrayList();
      boolean bool;
      if (paramInt == -9)
      {
        localObject1 = Q3.c.c("overriddenBySet");
      }
      else
      {
        if (paramInt == -25) {
          bool = true;
        } else {
          bool = false;
        }
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("Unknown transaction abort reason: ");
        ((StringBuilder)localObject1).append(paramInt);
        Y3.m.g(bool, ((StringBuilder)localObject1).toString());
        localObject1 = Q3.c.a(-25);
      }
      int i1 = 0;
      int i2 = -1;
      while (i1 < localList.size())
      {
        final z localz = (z)localList.get(i1);
        A localA = z.n(localz);
        Object localObject2 = A.s;
        if (localA != localObject2) {
          if (z.n(localz) == A.q)
          {
            if (i2 == i1 - 1) {
              bool = true;
            } else {
              bool = false;
            }
            Y3.m.f(bool);
            z.o(localz, (A)localObject2);
            z.D(localz, (Q3.c)localObject1);
            i2 = i1;
          }
          else
          {
            if (z.n(localz) == A.p) {
              bool = true;
            } else {
              bool = false;
            }
            Y3.m.f(bool);
            b0(new D(this, z.z(localz), a4.i.a(z.w(localz))));
            if (paramInt == -9)
            {
              localArrayList1.addAll(p.s(z.p(localz), true, false, b));
            }
            else
            {
              if (paramInt == -25) {
                bool = true;
              } else {
                bool = false;
              }
              localObject2 = new StringBuilder();
              ((StringBuilder)localObject2).append("Unknown transaction abort reason: ");
              ((StringBuilder)localObject2).append(paramInt);
              Y3.m.g(bool, ((StringBuilder)localObject2).toString());
            }
            localArrayList2.add(new q(localz, (Q3.c)localObject1));
          }
        }
        i1++;
      }
      if (i2 == -1) {}
      for (final Object localObject1 = null;; localObject1 = localList.subList(0, i2 + 1))
      {
        paramk.j(localObject1);
        break;
      }
      Y(localArrayList1);
      paramk = localArrayList2.iterator();
      while (paramk.hasNext()) {
        X((Runnable)paramk.next());
      }
    }
  }
  
  public void h0(Runnable paramRunnable, long paramLong)
  {
    i.F();
    i.v().b(paramRunnable, paramLong);
  }
  
  public void i0(Runnable paramRunnable)
  {
    i.F();
    i.v().c(paramRunnable);
  }
  
  public final void j0()
  {
    Y3.k localk = f;
    Z(localk);
    k0(localk);
  }
  
  public final void k0(Y3.k paramk)
  {
    if ((List)paramk.g() != null)
    {
      List localList = F(paramk);
      boolean bool;
      if (localList.size() > 0) {
        bool = true;
      } else {
        bool = false;
      }
      Y3.m.f(bool);
      Boolean localBoolean1 = Boolean.TRUE;
      Iterator localIterator = localList.iterator();
      do
      {
        localBoolean2 = localBoolean1;
        if (!localIterator.hasNext()) {
          break;
        }
      } while (z.n((z)localIterator.next()) == A.p);
      Boolean localBoolean2 = Boolean.FALSE;
      if (localBoolean2.booleanValue()) {
        l0(localList, paramk.f());
      }
    }
    else if (paramk.h())
    {
      paramk.c(new h());
    }
  }
  
  public final void l0(final List paramList, final k paramk)
  {
    Object localObject1 = new ArrayList();
    Object localObject2 = paramList.iterator();
    while (((Iterator)localObject2).hasNext()) {
      ((List)localObject1).add(Long.valueOf(z.p((z)((Iterator)localObject2).next())));
    }
    localObject1 = L(paramk, (List)localObject1);
    if (!g) {
      localObject2 = ((d4.n)localObject1).R();
    } else {
      localObject2 = "badhash";
    }
    Iterator localIterator = paramList.iterator();
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      boolean bool2 = true;
      if (!bool1) {
        break;
      }
      z localz = (z)localIterator.next();
      if (z.n(localz) != A.p) {
        bool2 = false;
      }
      Y3.m.f(bool2);
      z.o(localz, A.q);
      z.u(localz);
      localObject1 = ((d4.n)localObject1).y(k.b0(paramk, z.w(localz)), z.h(localz));
    }
    localObject1 = ((d4.n)localObject1).L(true);
    c.n(paramk.S(), localObject1, (String)localObject2, new i(paramk, paramList, this));
  }
  
  public void m0(final k paramk, d4.n paramn, e.e parame)
  {
    c4.c localc;
    if (j.f())
    {
      localc = j;
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("set: ");
      ((StringBuilder)localObject).append(paramk);
      localc.b(((StringBuilder)localObject).toString(), new Object[0]);
    }
    if (l.f())
    {
      localc = l;
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("set: ");
      ((StringBuilder)localObject).append(paramk);
      ((StringBuilder)localObject).append(" ");
      ((StringBuilder)localObject).append(paramn);
      localc.b(((StringBuilder)localObject).toString(), new Object[0]);
    }
    Object localObject = s.c(b);
    localObject = s.i(paramn, p.J(paramk, new ArrayList()), (Map)localObject);
    final long l1 = M();
    Y(p.I(paramk, paramn, (d4.n)localObject, l1, true, true));
    c.r(paramk.S(), paramn.L(true), new x(paramk, l1, parame));
    d0(g(paramk, -9));
  }
  
  public void n0(k paramk, final r.b paramb, boolean paramBoolean)
  {
    final Object localObject3;
    if (j.f())
    {
      localObject1 = j;
      localObject3 = new StringBuilder();
      ((StringBuilder)localObject3).append("transaction: ");
      ((StringBuilder)localObject3).append(paramk);
      ((c4.c)localObject1).b(((StringBuilder)localObject3).toString(), new Object[0]);
    }
    if (l.f())
    {
      localObject1 = j;
      localObject3 = new StringBuilder();
      ((StringBuilder)localObject3).append("transaction: ");
      ((StringBuilder)localObject3).append(paramk);
      ((c4.c)localObject1).b(((StringBuilder)localObject3).toString(), new Object[0]);
    }
    if ((i.C()) && (!r))
    {
      r = true;
      k.e("runTransaction() usage detected while persistence is enabled. Please be aware that transactions *will not* be persisted across database restarts.  See https://www.firebase.com/docs/android/guide/offline-capabilities.html#section-handling-transactions-offline for more details.");
    }
    Q3.e locale = Q3.k.c(this, paramk);
    Object localObject1 = new f();
    D(new D(this, (Q3.s)localObject1, locale.u()));
    z localz = new z(paramk, paramb, (Q3.s)localObject1, A.o, paramBoolean, S(), null);
    localObject1 = K(paramk);
    z.e(localz, (d4.n)localObject1);
    localObject1 = Q3.k.b((d4.n)localObject1);
    try
    {
      localObject1 = paramb.a((Q3.m)localObject1);
      if (localObject1 != null)
      {
        localObject3 = null;
      }
      else
      {
        localObject1 = new java/lang/NullPointerException;
        ((NullPointerException)localObject1).<init>("Transaction returned null as result");
        throw ((Throwable)localObject1);
      }
    }
    finally
    {
      j.c("Caught Throwable.", localThrowable);
      Object localObject2 = Q3.c.b(localThrowable);
      Object localObject4 = Q3.r.a();
      localObject3 = localObject2;
      localObject2 = localObject4;
      if (!((r.c)localObject2).b())
      {
        z.j(localz, null);
        z.m(localz, null);
        X(new g(paramb, (Q3.c)localObject3, Q3.k.a(locale, d4.i.d(z.c(localz)))));
      }
      else
      {
        z.o(localz, A.p);
        localObject4 = f.k(paramk);
        localObject3 = (List)((Y3.k)localObject4).g();
        paramb = (r.b)localObject3;
        if (localObject3 == null) {
          paramb = new ArrayList();
        }
        paramb.add(localz);
        ((Y3.k)localObject4).j(paramb);
        paramb = s.c(b);
        localObject2 = ((r.c)localObject2).a();
        paramb = s.i((d4.n)localObject2, z.c(localz), paramb);
        z.j(localz, (d4.n)localObject2);
        z.m(localz, paramb);
        z.r(localz, M());
        Y(p.I(paramk, (d4.n)localObject2, paramb, z.p(localz), paramBoolean, false));
        j0();
      }
    }
  }
  
  public void o0(final k paramk, b paramb, e.e parame, Map paramMap)
  {
    Object localObject2;
    if (j.f())
    {
      localObject1 = j;
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("update: ");
      ((StringBuilder)localObject2).append(paramk);
      ((c4.c)localObject1).b(((StringBuilder)localObject2).toString(), new Object[0]);
    }
    if (l.f())
    {
      localObject2 = l;
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("update: ");
      ((StringBuilder)localObject1).append(paramk);
      ((StringBuilder)localObject1).append(" ");
      ((StringBuilder)localObject1).append(paramMap);
      ((c4.c)localObject2).b(((StringBuilder)localObject1).toString(), new Object[0]);
    }
    if (paramb.isEmpty())
    {
      if (j.f()) {
        j.b("update called with no changes. No-op", new Object[0]);
      }
      G(parame, null, paramk);
      return;
    }
    Object localObject1 = s.c(b);
    localObject1 = s.f(paramb, p, paramk, (Map)localObject1);
    final long l1 = M();
    Y(p.H(paramk, paramb, (b)localObject1, l1, true));
    c.f(paramk.S(), paramMap, new a(paramk, l1, parame));
    paramb = paramb.iterator();
    while (paramb.hasNext()) {
      d0(g(paramk.T((k)((Map.Entry)paramb.next()).getKey()), -9));
    }
  }
  
  public final void p0(d4.b paramb, Object paramObject)
  {
    if (paramb.equals(c.b)) {
      b.b(((Long)paramObject).longValue());
    }
    paramb = new k(new d4.b[] { c.a, paramb });
    try
    {
      paramObject = d4.o.a(paramObject);
      d.c(paramb, (d4.n)paramObject);
      Y(o.A(paramb, (d4.n)paramObject));
    }
    catch (Q3.d paramb)
    {
      j.c("Failed to parse info update", paramb);
    }
  }
  
  public final void q0(String paramString, k paramk, Q3.c paramc)
  {
    if ((paramc != null) && (paramc.f() != -1) && (paramc.f() != -25))
    {
      c4.c localc = j;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramString);
      localStringBuilder.append(" at ");
      localStringBuilder.append(paramk.toString());
      localStringBuilder.append(" failed: ");
      localStringBuilder.append(paramc.toString());
      localc.i(localStringBuilder.toString());
    }
  }
  
  public String toString()
  {
    return a.toString();
  }
  
  public static enum A
  {
    static
    {
      A localA1 = new A("INITIALIZING", 0);
      o = localA1;
      A localA2 = new A("RUN", 1);
      p = localA2;
      A localA3 = new A("SENT", 2);
      q = localA3;
      A localA4 = new A("COMPLETED", 3);
      r = localA4;
      A localA5 = new A("SENT_NEEDS_ABORT", 4);
      s = localA5;
      A localA6 = new A("NEEDS_ABORT", 5);
      t = localA6;
      u = new A[] { localA1, localA2, localA3, localA4, localA5, localA6 };
    }
  }
  
  public class a
    implements T3.p
  {
    public a(k paramk, long paramLong, e.e parame) {}
    
    public void a(String paramString1, String paramString2)
    {
      paramString1 = m.y(paramString1, paramString2);
      m.z(m.this, "updateChildren", paramk, paramString1);
      m.A(m.this, l1, paramk, paramString1);
      G(c, paramString1, paramk);
    }
  }
  
  public class b
    implements T3.p
  {
    public b(k paramk, d4.n paramn, e.e parame) {}
    
    public void a(String paramString1, String paramString2)
    {
      paramString1 = m.y(paramString1, paramString2);
      m.z(m.this, "onDisconnect().setValue", paramk, paramString1);
      if (paramString1 == null) {
        m.k(m.this).d(paramk, paramn);
      }
      G(parame, paramString1, paramk);
    }
  }
  
  public class c
    implements T3.p
  {
    public c(k paramk, Map paramMap, e.e parame) {}
    
    public void a(String paramString1, String paramString2)
    {
      Q3.c localc = m.y(paramString1, paramString2);
      m.z(m.this, "onDisconnect().updateChildren", paramk, localc);
      if (localc == null)
      {
        paramString1 = paramMap1.entrySet().iterator();
        while (paramString1.hasNext())
        {
          paramString2 = (Map.Entry)paramString1.next();
          m.k(m.this).d(paramk.T((k)paramString2.getKey()), (d4.n)paramString2.getValue());
        }
      }
      G(parame, localc, paramk);
    }
  }
  
  public class d
    implements T3.p
  {
    public d(k paramk, e.e parame) {}
    
    public void a(String paramString1, String paramString2)
    {
      paramString1 = m.y(paramString1, paramString2);
      if (paramString1 == null) {
        m.k(m.this).c(paramk);
      }
      G(parame, paramString1, paramk);
    }
  }
  
  public class e
    implements u.d
  {
    public e(Map paramMap, List paramList) {}
    
    public void a(k paramk, d4.n paramn)
    {
      paramn = s.i(paramn, m.B(m.this).J(paramk, new ArrayList()), localMap);
      localArrayList.addAll(m.B(m.this).A(paramk, paramn));
      paramk = m.l(m.this, paramk, -9);
      m.m(m.this, paramk);
    }
  }
  
  public class f
    implements Q3.s
  {
    public f() {}
    
    public void a(Q3.c paramc) {}
    
    public void b(Q3.b paramb) {}
  }
  
  public class g
    implements Runnable
  {
    public g(r.b paramb, Q3.c paramc, Q3.b paramb1) {}
    
    public void run()
    {
      paramb.b(localObject3, false, q);
    }
  }
  
  public class h
    implements k.c
  {
    public h() {}
    
    public void a(Y3.k paramk)
    {
      m.o(m.this, paramk);
    }
  }
  
  public class i
    implements T3.p
  {
    public i(k paramk, List paramList, m paramm) {}
    
    public void a(String paramString1, String paramString2)
    {
      paramString2 = m.y(paramString1, paramString2);
      m.z(m.this, "Transaction", paramk, paramString2);
      paramString1 = new ArrayList();
      Object localObject1;
      if (paramString2 == null)
      {
        paramString2 = new ArrayList();
        localObject1 = paramList.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          final m.z localz = (m.z)((Iterator)localObject1).next();
          m.z.o(localz, m.A.r);
          paramString1.addAll(m.B(m.this).s(m.z.p(localz), false, false, m.p(m.this)));
          Object localObject2 = m.z.l(localz);
          paramString2.add(new a(localz, Q3.k.a(Q3.k.c(jdField_this, m.z.w(localz)), d4.i.d((d4.n)localObject2))));
          localObject2 = m.this;
          ((m)localObject2).b0(new D((m)localObject2, m.z.z(localz), a4.i.a(m.z.w(localz))));
        }
        localObject1 = m.this;
        m.r((m)localObject1, m.q((m)localObject1).k(paramk));
        m.s(m.this);
        m.x(jdField_this, paramString1);
        for (int i = 0; i < paramString2.size(); i++) {
          X((Runnable)paramString2.get(i));
        }
      }
      if (paramString2.f() == -1)
      {
        paramString2 = paramList.iterator();
        if (paramString2.hasNext())
        {
          localObject1 = (m.z)paramString2.next();
          if (m.z.n((m.z)localObject1) == m.A.s) {}
          for (paramString1 = m.A.t;; paramString1 = m.A.p)
          {
            m.z.o((m.z)localObject1, paramString1);
            break;
          }
        }
      }
      else
      {
        localObject1 = paramList.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          paramString1 = (m.z)((Iterator)localObject1).next();
          m.z.o(paramString1, m.A.t);
          m.z.D(paramString1, paramString2);
        }
      }
      m.m(m.this, paramk);
    }
    
    public class a
      implements Runnable
    {
      public a(m.z paramz, Q3.b paramb) {}
      
      public void run()
      {
        m.z.x(localz).b(null, true, p);
      }
    }
  }
  
  public class j
    implements k.c
  {
    public j() {}
    
    public void a(Y3.k paramk)
    {
      m.r(m.this, paramk);
    }
  }
  
  public class k
    implements Runnable
  {
    public k() {}
    
    public void run()
    {
      m.i(m.this);
    }
  }
  
  public class l
    implements Runnable
  {
    public l(m.z paramz) {}
    
    public void run()
    {
      m localm = m.this;
      localm.b0(new D(localm, m.z.z(localz), a4.i.a(m.z.w(localz))));
    }
  }
  
  public class m
    implements Runnable
  {
    public m(m.z paramz, Q3.c paramc, Q3.b paramb) {}
    
    public void run()
    {
      m.z.x(localz).b(paramList, false, localObject1);
    }
  }
  
  public class n
    implements k.c
  {
    public n(List paramList) {}
    
    public void a(Y3.k paramk)
    {
      m.u(m.this, paramList, paramk);
    }
  }
  
  public class o
    implements k.b
  {
    public o(int paramInt) {}
    
    public boolean a(Y3.k paramk)
    {
      m.v(m.this, paramk, paramInt);
      return false;
    }
  }
  
  public class p
    implements k.c
  {
    public p(int paramInt) {}
    
    public void a(Y3.k paramk)
    {
      m.v(m.this, paramk, paramInt);
    }
  }
  
  public class q
    implements Runnable
  {
    public q(m.z paramz, Q3.c paramc) {}
    
    public void run()
    {
      m.z.x(localz).b(localObject1, false, null);
    }
  }
  
  public class r
    implements A.b
  {
    public r() {}
  }
  
  public class s
    implements A.b
  {
    public s() {}
  }
  
  public class t
    implements x.s
  {
    public t() {}
    
    public void a(a4.i parami, y paramy) {}
    
    public void b(final a4.i parami, y paramy, T3.g paramg, final x.p paramp)
    {
      i0(new a(parami, paramp));
    }
    
    public class a
      implements Runnable
    {
      public a(a4.i parami, x.p paramp) {}
      
      public void run()
      {
        Object localObject = m.t(m.this).a(parami.e());
        if (!((d4.n)localObject).isEmpty())
        {
          localObject = m.w(m.this).A(parami.e(), (d4.n)localObject);
          m.x(m.this, (List)localObject);
          paramp.a(null);
        }
      }
    }
  }
  
  public class u
    implements x.s
  {
    public u() {}
    
    public void a(a4.i parami, y paramy)
    {
      m.n(m.this).l(parami.e().S(), parami.d().k());
    }
    
    public void b(a4.i parami, y paramy, T3.g paramg, final x.p paramp)
    {
      T3.h localh = m.n(m.this);
      List localList = parami.e().S();
      Map localMap = parami.d().k();
      if (paramy != null) {}
      for (parami = Long.valueOf(paramy.a());; parami = null) {
        break;
      }
      localh.k(localList, localMap, paramg, parami, new a(paramp));
    }
    
    public class a
      implements T3.p
    {
      public a(x.p paramp) {}
      
      public void a(String paramString1, String paramString2)
      {
        paramString1 = m.y(paramString1, paramString2);
        paramString1 = paramp.a(paramString1);
        m.x(m.this, paramString1);
      }
    }
  }
  
  public class v
    implements T3.p
  {
    public v(B paramB) {}
    
    public void a(String paramString1, String paramString2)
    {
      paramString1 = m.y(paramString1, paramString2);
      m.z(m.this, "Persisted write", localObject1.c(), paramString1);
      m.A(m.this, localObject1.d(), localObject1.c(), paramString1);
    }
  }
  
  public class w
    implements Runnable
  {
    public w(e.e parame, Q3.c paramc, Q3.e parame1) {}
    
    public void run()
    {
      parame.a(paramc, q);
    }
  }
  
  public class x
    implements T3.p
  {
    public x(k paramk, long paramLong, e.e parame) {}
    
    public void a(String paramString1, String paramString2)
    {
      paramString1 = m.y(paramString1, paramString2);
      m.z(m.this, "setValue", paramk, paramString1);
      m.A(m.this, l1, paramk, paramString1);
      G(c, paramString1, paramk);
    }
  }
  
  public class y
    implements Runnable
  {
    public y(Q3.p paramp, V2.k paramk, m paramm) {}
    
    public void run()
    {
      Object localObject = m.B(m.this).N(paramp.u());
      if (localObject != null)
      {
        localk.c(Q3.k.a(paramp.t(), d4.i.d((d4.n)localObject)));
        return;
      }
      m.B(m.this).Z(paramp.u());
      localObject = m.B(m.this).Q(paramp);
      if (((Q3.b)localObject).b()) {
        h0(new n(localk, (Q3.b)localObject), 3000L);
      }
      m.n(m.this).d(paramp.s().S(), paramp.u().d().k()).c(((Y3.c)m.j(m.this).v()).d(), new o(this, localk, (Q3.b)localObject, paramp, jdField_this));
    }
  }
  
  public static class z
    implements Comparable
  {
    public k o;
    public r.b p;
    public Q3.s q;
    public m.A r;
    public long s;
    public boolean t;
    public int u;
    public Q3.c v;
    public long w;
    public d4.n x;
    public d4.n y;
    public d4.n z;
    
    public z(k paramk, r.b paramb, Q3.s params, m.A paramA, boolean paramBoolean, long paramLong)
    {
      o = paramk;
      p = paramb;
      q = params;
      r = paramA;
      u = 0;
      t = paramBoolean;
      s = paramLong;
      v = null;
      x = null;
      y = null;
      z = null;
    }
    
    public int G(z paramz)
    {
      long l1 = s;
      long l2 = s;
      if (l1 < l2) {
        return -1;
      }
      if (l1 == l2) {
        return 0;
      }
      return 1;
    }
  }
}

/* Location:
 * Qualified Name:     V3.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */