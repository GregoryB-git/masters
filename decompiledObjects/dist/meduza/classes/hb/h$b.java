package hb;

import eb.e1;
import eb.h0;
import eb.i0;
import eb.s0;
import eb.s0.b;
import eb.s0.d;
import gb.a.b;
import gb.a.b.a;
import gb.c1;
import gb.l3;
import gb.o1;
import gb.p3;
import gb.t.a;
import gb.v0;
import gb.y0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import pb.c;

public final class h$b
  extends y0
  implements p.a
{
  public boolean A = false;
  public boolean B = false;
  public boolean C = false;
  public int D;
  public int E;
  public final b F;
  public final p G;
  public final i H;
  public boolean I = true;
  public final c J;
  public p.b K;
  public int L = -1;
  public final int w;
  public final Object x;
  public ArrayList y;
  public xc.f z = new xc.f();
  
  public h$b(h paramh, int paramInt1, l3 paraml3, Object paramObject, b paramb, p paramp, i parami, int paramInt2)
  {
    super(paramInt1, paraml3, a);
    x6.b.y(paramObject, "lock");
    x = paramObject;
    F = paramb;
    G = paramp;
    H = parami;
    D = paramInt2;
    E = paramInt2;
    w = paramInt2;
    pb.b.a.getClass();
    J = pb.a.a;
  }
  
  public static void m(b paramb, s0 params0, String paramString)
  {
    Object localObject1 = M;
    Object localObject2 = k;
    String str = i;
    boolean bool = o;
    if (H.B == null) {
      i = 1;
    } else {
      i = 0;
    }
    localObject1 = d.a;
    x6.b.y(params0, "headers");
    x6.b.y(paramString, "defaultPath");
    x6.b.y(localObject2, "authority");
    params0.a(v0.i);
    params0.a(v0.j);
    s0.b localb = v0.k;
    params0.a(localb);
    ArrayList localArrayList = new ArrayList(b + 7);
    if (i != 0) {
      localObject1 = d.b;
    } else {
      localObject1 = d.a;
    }
    localArrayList.add(localObject1);
    if (bool) {
      localObject1 = d.d;
    } else {
      localObject1 = d.c;
    }
    localArrayList.add(localObject1);
    localArrayList.add(new jb.d(jb.d.h, (String)localObject2));
    localArrayList.add(new jb.d(jb.d.f, paramString));
    localArrayList.add(new jb.d(a, str));
    localArrayList.add(d.e);
    localArrayList.add(d.f);
    paramString = p3.a;
    paramString = h0.a;
    int j = b * 2;
    paramString = new byte[j][];
    localObject1 = a;
    if ((localObject1 instanceof byte[][])) {
      System.arraycopy(localObject1, 0, paramString, 0, j);
    } else {
      for (i = 0; i < b; i++)
      {
        k = i * 2;
        paramString[k] = params0.e(i);
        paramString[(k + 1)] = params0.g(i);
      }
    }
    int i = 0;
    int k = i;
    while (i < j)
    {
      localObject1 = paramString[i];
      params0 = paramString[(i + 1)];
      if (p3.a((byte[])localObject1, p3.b))
      {
        paramString[k] = localObject1;
        paramString[(k + 1)] = h0.b.c(params0).getBytes(n7.d.a);
      }
      else
      {
        int m = params0.length;
        int n = 0;
        while (n < m)
        {
          int i1 = params0[n];
          if ((i1 >= 32) && (i1 <= 126))
          {
            n++;
          }
          else
          {
            n = 0;
            break label432;
          }
        }
        n = 1;
        label432:
        if (n == 0) {
          break label455;
        }
        paramString[k] = localObject1;
        paramString[(k + 1)] = params0;
      }
      k += 2;
      break label511;
      label455:
      localObject2 = new String((byte[])localObject1, n7.d.a);
      localObject1 = p3.a;
      localObject2 = f.m("Metadata key=", (String)localObject2, ", value=");
      ((StringBuilder)localObject2).append(Arrays.toString(params0));
      ((StringBuilder)localObject2).append(" contains invalid ASCII characters");
      ((Logger)localObject1).warning(((StringBuilder)localObject2).toString());
      label511:
      i += 2;
    }
    if (k == j) {
      params0 = paramString;
    } else {
      params0 = (byte[][])Arrays.copyOfRange(paramString, 0, k);
    }
    for (i = 0; i < params0.length; i += 2)
    {
      localObject1 = xc.i.o(params0[i]);
      paramString = a;
      if ((paramString.length != 0) && (paramString[0] != 58)) {
        localArrayList.add(new jb.d((xc.i)localObject1, xc.i.o(params0[(i + 1)])));
      }
    }
    y = localArrayList;
    params0 = H;
    paramb = M;
    paramString = v;
    if (paramString != null)
    {
      l.j(paramString, t.a.d, true, new s0());
    }
    else if (n.size() >= D)
    {
      E.add(paramb);
      if (!z)
      {
        z = true;
        paramString = G;
        if (paramString != null) {
          paramString.b();
        }
      }
      if (c) {
        P.c(paramb, true);
      }
    }
    else
    {
      params0.v(paramb);
    }
  }
  
  public static void n(b paramb, xc.f paramf, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (!C) {
      if (I)
      {
        int i = (int)b;
        z.g0(paramf, i);
        A |= paramBoolean1;
        B |= paramBoolean2;
      }
      else
      {
        boolean bool;
        if (L != -1) {
          bool = true;
        } else {
          bool = false;
        }
        x6.b.I(bool, "streamId should be set");
        G.a(paramBoolean1, K, paramf, paramBoolean2);
      }
    }
  }
  
  public final void c(boolean paramBoolean)
  {
    t.a locala = t.a.a;
    i locali;
    int i;
    if (!o)
    {
      locali = H;
      i = L;
      localObject = jb.a.q;
    }
    else
    {
      locali = H;
      i = L;
      localObject = null;
    }
    locali.l(i, null, locala, false, (jb.a)localObject, null);
    x6.b.I(p, "status should have been reported on deframer closed");
    m = true;
    if ((q) && (paramBoolean))
    {
      localObject = e1.m.g("Encountered end-of-stream mid-frame");
      i(new s0(), (e1)localObject, true);
    }
    Object localObject = n;
    if (localObject != null)
    {
      ((a.b.a)localObject).run();
      n = null;
    }
  }
  
  public final void d(int paramInt)
  {
    paramInt = E - paramInt;
    E = paramInt;
    float f = paramInt;
    int i = w;
    if (f <= i * 0.5F)
    {
      i -= paramInt;
      D += i;
      E = (paramInt + i);
      F.d(L, i);
    }
  }
  
  public final void e(Throwable paramThrowable)
  {
    paramThrowable = e1.d(paramThrowable);
    o(new s0(), paramThrowable, true);
  }
  
  public final void f(Runnable paramRunnable)
  {
    synchronized (x)
    {
      paramRunnable.run();
      return;
    }
  }
  
  public final void o(s0 params0, e1 parame1, boolean paramBoolean)
  {
    if (C) {
      return;
    }
    C = true;
    if (I)
    {
      i locali = H;
      h localh = M;
      E.remove(localh);
      locali.q(localh);
      y = null;
      z.f();
      I = false;
      if (params0 == null) {
        params0 = new s0();
      }
      i(params0, parame1, true);
    }
    else
    {
      H.l(L, parame1, t.a.a, paramBoolean, jb.a.q, params0);
    }
  }
  
  /* Error */
  public final void p(int paramInt, xc.f paramf, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_2
    //   1: getfield 353	xc/f:b	J
    //   4: lstore 4
    //   6: lload 4
    //   8: l2i
    //   9: istore 6
    //   11: aload_0
    //   12: getfield 83	hb/h$b:D	I
    //   15: iload 6
    //   17: iload_1
    //   18: iadd
    //   19: isub
    //   20: istore 6
    //   22: aload_0
    //   23: iload 6
    //   25: putfield 83	hb/h$b:D	I
    //   28: aload_0
    //   29: aload_0
    //   30: getfield 85	hb/h$b:E	I
    //   33: iload_1
    //   34: isub
    //   35: putfield 85	hb/h$b:E	I
    //   38: iload 6
    //   40: ifge +44 -> 84
    //   43: aload_0
    //   44: getfield 77	hb/h$b:F	Lhb/b;
    //   47: aload_0
    //   48: getfield 66	hb/h$b:L	I
    //   51: getstatic 437	jb/a:e	Ljb/a;
    //   54: invokevirtual 441	hb/b:R	(ILjb/a;)V
    //   57: aload_0
    //   58: getfield 81	hb/h$b:H	Lhb/i;
    //   61: aload_0
    //   62: getfield 66	hb/h$b:L	I
    //   65: getstatic 395	eb/e1:m	Leb/e1;
    //   68: ldc_w 443
    //   71: invokevirtual 400	eb/e1:g	(Ljava/lang/String;)Leb/e1;
    //   74: getstatic 372	gb/t$a:a	Lgb/t$a;
    //   77: iconst_0
    //   78: aconst_null
    //   79: aconst_null
    //   80: invokevirtual 382	hb/i:l	(ILeb/e1;Lgb/t$a;ZLjb/a;Leb/s0;)V
    //   83: return
    //   84: new 445	hb/l
    //   87: dup
    //   88: aload_2
    //   89: invokespecial 448	hb/l:<init>	(Lxc/f;)V
    //   92: astore 7
    //   94: aload_0
    //   95: getfield 451	gb/y0:r	Leb/e1;
    //   98: astore 8
    //   100: iconst_0
    //   101: istore_1
    //   102: aload 8
    //   104: ifnull +117 -> 221
    //   107: ldc_w 453
    //   110: invokestatic 455	f:l	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   113: astore 9
    //   115: aload_0
    //   116: getfield 458	gb/y0:t	Ljava/nio/charset/Charset;
    //   119: astore 10
    //   121: getstatic 463	gb/v2:a	Lgb/v2$b;
    //   124: astore 11
    //   126: aload 10
    //   128: ldc_w 465
    //   131: invokestatic 73	x6/b:y	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   134: aload_2
    //   135: getfield 353	xc/f:b	J
    //   138: l2i
    //   139: istore_1
    //   140: iload_1
    //   141: newarray <illegal type>
    //   143: astore_2
    //   144: aload 7
    //   146: aload_2
    //   147: iconst_0
    //   148: iload_1
    //   149: invokevirtual 469	hb/l:U	([BII)V
    //   152: aload 9
    //   154: new 238	java/lang/String
    //   157: dup
    //   158: aload_2
    //   159: aload 10
    //   161: invokespecial 245	java/lang/String:<init>	([BLjava/nio/charset/Charset;)V
    //   164: invokevirtual 264	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   167: pop
    //   168: aload_0
    //   169: aload 8
    //   171: aload 9
    //   173: invokevirtual 269	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   176: invokevirtual 471	eb/e1:a	(Ljava/lang/String;)Leb/e1;
    //   179: putfield 451	gb/y0:r	Leb/e1;
    //   182: aload 7
    //   184: invokevirtual 474	hb/l:close	()V
    //   187: aload_0
    //   188: getfield 451	gb/y0:r	Leb/e1;
    //   191: getfield 476	eb/e1:b	Ljava/lang/String;
    //   194: invokevirtual 479	java/lang/String:length	()I
    //   197: sipush 1000
    //   200: if_icmpgt +7 -> 207
    //   203: iload_3
    //   204: ifeq +164 -> 368
    //   207: aload_0
    //   208: getfield 451	gb/y0:r	Leb/e1;
    //   211: astore 7
    //   213: aload_0
    //   214: getfield 483	gb/y0:s	Leb/s0;
    //   217: astore_2
    //   218: goto +29 -> 247
    //   221: aload_0
    //   222: getfield 486	gb/y0:u	Z
    //   225: ifne +33 -> 258
    //   228: getstatic 395	eb/e1:m	Leb/e1;
    //   231: ldc_w 488
    //   234: invokevirtual 400	eb/e1:g	(Ljava/lang/String;)Leb/e1;
    //   237: astore 7
    //   239: new 140	eb/s0
    //   242: dup
    //   243: invokespecial 305	eb/s0:<init>	()V
    //   246: astore_2
    //   247: aload_0
    //   248: aload_2
    //   249: aload 7
    //   251: iconst_0
    //   252: invokevirtual 423	hb/h$b:o	(Leb/s0;Leb/e1;Z)V
    //   255: goto +113 -> 368
    //   258: lload 4
    //   260: l2i
    //   261: istore 6
    //   263: aload_0
    //   264: getfield 385	gb/a$b:p	Z
    //   267: ifeq +23 -> 290
    //   270: getstatic 490	gb/a:g	Ljava/util/logging/Logger;
    //   273: getstatic 496	java/util/logging/Level:INFO	Ljava/util/logging/Level;
    //   276: ldc_w 498
    //   279: invokevirtual 502	java/util/logging/Logger:log	(Ljava/util/logging/Level;Ljava/lang/String;)V
    //   282: aload 7
    //   284: invokevirtual 474	hb/l:close	()V
    //   287: goto +23 -> 310
    //   290: aload_0
    //   291: getfield 507	gb/d$a:a	Lgb/a0;
    //   294: aload 7
    //   296: invokeinterface 512 2 0
    //   301: goto +9 -> 310
    //   304: astore_2
    //   305: aload_0
    //   306: aload_2
    //   307: invokevirtual 514	hb/h$b:e	(Ljava/lang/Throwable;)V
    //   310: iload_3
    //   311: ifeq +57 -> 368
    //   314: getstatic 395	eb/e1:m	Leb/e1;
    //   317: astore 7
    //   319: iload 6
    //   321: ifle +10 -> 331
    //   324: ldc_w 516
    //   327: astore_2
    //   328: goto +7 -> 335
    //   331: ldc_w 518
    //   334: astore_2
    //   335: aload_0
    //   336: aload 7
    //   338: aload_2
    //   339: invokevirtual 400	eb/e1:g	(Ljava/lang/String;)Leb/e1;
    //   342: putfield 451	gb/y0:r	Leb/e1;
    //   345: new 140	eb/s0
    //   348: dup
    //   349: invokespecial 305	eb/s0:<init>	()V
    //   352: astore_2
    //   353: aload_0
    //   354: aload_2
    //   355: putfield 483	gb/y0:s	Leb/s0;
    //   358: aload_0
    //   359: aload_2
    //   360: aload_0
    //   361: getfield 451	gb/y0:r	Leb/e1;
    //   364: iconst_0
    //   365: invokevirtual 403	gb/a$b:i	(Leb/s0;Leb/e1;Z)V
    //   368: return
    //   369: astore_2
    //   370: goto +6 -> 376
    //   373: astore_2
    //   374: iconst_1
    //   375: istore_1
    //   376: iload_1
    //   377: ifeq +8 -> 385
    //   380: aload 7
    //   382: invokevirtual 474	hb/l:close	()V
    //   385: aload_2
    //   386: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	387	0	this	b
    //   0	387	1	paramInt	int
    //   0	387	2	paramf	xc.f
    //   0	387	3	paramBoolean	boolean
    //   4	255	4	l	long
    //   9	311	6	i	int
    //   92	289	7	localObject	Object
    //   98	72	8	locale1	e1
    //   113	59	9	localStringBuilder	StringBuilder
    //   119	41	10	localCharset	java.nio.charset.Charset
    //   124	1	11	localb	gb.v2.b
    // Exception table:
    //   from	to	target	type
    //   290	301	304	finally
    //   305	310	369	finally
    //   263	282	373	finally
  }
  
  public final void q(ArrayList paramArrayList, boolean paramBoolean)
  {
    Object localObject1;
    s0 locals0;
    Object localObject3;
    label176:
    label221:
    int j;
    if (paramBoolean)
    {
      paramArrayList = q.a(paramArrayList);
      localObject1 = h0.a;
      locals0 = new s0(paramArrayList);
      if ((r == null) && (!u))
      {
        paramArrayList = y0.l(locals0);
        r = paramArrayList;
        if (paramArrayList != null) {
          s = locals0;
        }
      }
      localObject1 = r;
      if (localObject1 != null)
      {
        paramArrayList = new StringBuilder();
        paramArrayList.append("trailers: ");
        paramArrayList.append(locals0);
        paramArrayList = ((e1)localObject1).a(paramArrayList.toString());
        r = paramArrayList;
        o(s, paramArrayList, false);
      }
      else
      {
        localObject3 = i0.b;
        localObject1 = (e1)locals0.c((s0.d)localObject3);
        if (localObject1 != null)
        {
          paramArrayList = (String)locals0.c(i0.a);
        }
        else
        {
          if (!u) {
            break label176;
          }
          localObject1 = e1.g;
          paramArrayList = "missing GRPC status in response";
        }
        paramArrayList = ((e1)localObject1).g(paramArrayList);
        break label221;
        paramArrayList = (Integer)locals0.c(y0.v);
        if (paramArrayList != null) {
          paramArrayList = v0.f(paramArrayList.intValue());
        } else {
          paramArrayList = e1.m.g("missing HTTP status code");
        }
        paramArrayList = paramArrayList.a("missing GRPC status, inferred error from HTTP status code");
        locals0.a(y0.v);
        locals0.a((s0.d)localObject3);
        locals0.a(i0.a);
        if (p)
        {
          gb.a.g.log(Level.INFO, "Received trailers on closed stream:\n {1}\n {2}", new Object[] { paramArrayList, locals0 });
        }
        else
        {
          localObject1 = h.a;
          int i = localObject1.length;
          for (j = 0; j < i; j++) {
            ((eb.h)localObject1[j]).x(locals0);
          }
          i(locals0, paramArrayList, false);
        }
      }
    }
    else
    {
      paramArrayList = q.a(paramArrayList);
      localObject1 = h0.a;
      locals0 = new s0(paramArrayList);
      paramArrayList = r;
      if (paramArrayList != null)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("headers: ");
        ((StringBuilder)localObject1).append(locals0);
        r = paramArrayList.a(((StringBuilder)localObject1).toString());
      }
    }
    try
    {
      if (u)
      {
        localObject1 = e1.m.g("Received headers twice");
        r = ((e1)localObject1);
        paramArrayList = new StringBuilder();
      }
      else
      {
        paramArrayList = y0.v;
        localObject1 = (Integer)locals0.c(paramArrayList);
        if ((localObject1 != null) && (((Integer)localObject1).intValue() >= 100))
        {
          j = ((Integer)localObject1).intValue();
          if (j < 200)
          {
            localObject1 = r;
            if (localObject1 == null) {
              break label608;
            }
            paramArrayList = new StringBuilder();
            break label566;
          }
        }
        u = true;
        localObject1 = y0.l(locals0);
        r = ((e1)localObject1);
        if (localObject1 != null)
        {
          paramArrayList = new StringBuilder();
        }
        else
        {
          locals0.a(paramArrayList);
          locals0.a(i0.b);
          locals0.a(i0.a);
          h(locals0);
          localObject1 = r;
          if (localObject1 == null) {
            break label608;
          }
          paramArrayList = new StringBuilder();
        }
      }
      label566:
      paramArrayList.append("headers: ");
      paramArrayList.append(locals0);
      r = ((e1)localObject1).a(paramArrayList.toString());
      s = locals0;
      t = y0.k(locals0);
      label608:
      return;
    }
    finally
    {
      paramArrayList = r;
      if (paramArrayList != null)
      {
        localObject3 = new StringBuilder();
        ((StringBuilder)localObject3).append("headers: ");
        ((StringBuilder)localObject3).append(locals0);
        r = paramArrayList.a(((StringBuilder)localObject3).toString());
        s = locals0;
        t = y0.k(locals0);
      }
    }
  }
}

/* Location:
 * Qualified Name:     hb.h.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */