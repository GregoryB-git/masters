package gb;

import eb.c;
import eb.e1;
import eb.g1;
import eb.j.b;
import eb.l;
import eb.r;
import eb.s.a;
import eb.s0;
import eb.s0.b;
import eb.y;
import eb.z;
import hb.h.a;
import hb.h.b;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import m.e;

public abstract class a
  extends d
  implements s, j2.c
{
  public static final Logger g = Logger.getLogger(a.class.getName());
  public final r3 a;
  public final t0 b;
  public boolean c;
  public boolean d;
  public s0 e;
  public volatile boolean f;
  
  public a(y paramy, l3 paraml3, r3 paramr3, s0 params0, c paramc, boolean paramBoolean)
  {
    x6.b.y(params0, "headers");
    x6.b.y(paramr3, "transportTracer");
    a = paramr3;
    c = (Boolean.TRUE.equals(paramc.a(v0.n)) ^ true);
    d = paramBoolean;
    if (!paramBoolean)
    {
      b = new j2(this, paramy, paraml3);
      e = params0;
    }
    else
    {
      b = new a(params0, paraml3);
    }
  }
  
  public final boolean b()
  {
    d.a locala = q();
    synchronized (b)
    {
      boolean bool1 = f;
      boolean bool2 = true;
      int i;
      if ((bool1) && (e < 32768) && (!g)) {
        i = 1;
      } else {
        i = 0;
      }
      if ((i == 0) || (f)) {
        bool2 = false;
      }
      return bool2;
    }
  }
  
  /* Error */
  public final void c(s3 params3, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +16 -> 17
    //   4: iload_2
    //   5: ifeq +6 -> 11
    //   8: goto +9 -> 17
    //   11: iconst_0
    //   12: istore 5
    //   14: goto +6 -> 20
    //   17: iconst_1
    //   18: istore 5
    //   20: ldc 118
    //   22: iload 5
    //   24: invokestatic 122	x6/b:s	(Ljava/lang/String;Z)V
    //   27: aload_0
    //   28: invokevirtual 126	gb/a:r	()Lhb/h$a;
    //   31: astore 6
    //   33: aload 6
    //   35: invokevirtual 132	java/lang/Object:getClass	()Ljava/lang/Class;
    //   38: pop
    //   39: invokestatic 136	pb/b:c	()V
    //   42: aload_1
    //   43: ifnonnull +10 -> 53
    //   46: getstatic 142	hb/h:p	Lxc/f;
    //   49: astore_1
    //   50: goto +79 -> 129
    //   53: aload_1
    //   54: checkcast 144	hb/o
    //   57: getfield 146	hb/o:a	Lxc/f;
    //   60: astore 7
    //   62: aload 7
    //   64: getfield 151	xc/f:b	J
    //   67: l2i
    //   68: istore 8
    //   70: aload 7
    //   72: astore_1
    //   73: iload 8
    //   75: ifle +54 -> 129
    //   78: aload 6
    //   80: getfield 156	hb/h$a:a	Lhb/h;
    //   83: getfield 160	hb/h:l	Lhb/h$b;
    //   86: astore 9
    //   88: aload 9
    //   90: getfield 106	gb/d$a:b	Ljava/lang/Object;
    //   93: astore_1
    //   94: aload_1
    //   95: monitorenter
    //   96: aload 9
    //   98: aload 9
    //   100: getfield 111	gb/d$a:e	I
    //   103: iload 8
    //   105: iadd
    //   106: putfield 111	gb/d$a:e	I
    //   109: aload_1
    //   110: monitorexit
    //   111: aload 7
    //   113: astore_1
    //   114: goto +15 -> 129
    //   117: astore 7
    //   119: aload_1
    //   120: monitorexit
    //   121: aload 7
    //   123: athrow
    //   124: astore 7
    //   126: goto +87 -> 213
    //   129: aload 6
    //   131: getfield 156	hb/h$a:a	Lhb/h;
    //   134: getfield 160	hb/h:l	Lhb/h$b;
    //   137: getfield 165	hb/h$b:x	Ljava/lang/Object;
    //   140: astore 7
    //   142: aload 7
    //   144: monitorenter
    //   145: aload 6
    //   147: getfield 156	hb/h$a:a	Lhb/h;
    //   150: getfield 160	hb/h:l	Lhb/h$b;
    //   153: aload_1
    //   154: iload_2
    //   155: iload_3
    //   156: invokestatic 168	hb/h$b:n	(Lhb/h$b;Lxc/f;ZZ)V
    //   159: aload 6
    //   161: getfield 156	hb/h$a:a	Lhb/h;
    //   164: getfield 59	gb/a:a	Lgb/r3;
    //   167: astore_1
    //   168: iload 4
    //   170: ifne +11 -> 181
    //   173: aload_1
    //   174: invokevirtual 132	java/lang/Object:getClass	()Ljava/lang/Class;
    //   177: pop
    //   178: goto +18 -> 196
    //   181: aload_1
    //   182: invokevirtual 132	java/lang/Object:getClass	()Ljava/lang/Class;
    //   185: pop
    //   186: aload_1
    //   187: getfield 173	gb/r3:a	Lgb/o3;
    //   190: invokeinterface 178 1 0
    //   195: pop2
    //   196: aload 7
    //   198: monitorexit
    //   199: getstatic 181	pb/b:a	Lpb/a;
    //   202: invokevirtual 132	java/lang/Object:getClass	()Ljava/lang/Class;
    //   205: pop
    //   206: return
    //   207: astore_1
    //   208: aload 7
    //   210: monitorexit
    //   211: aload_1
    //   212: athrow
    //   213: getstatic 181	pb/b:a	Lpb/a;
    //   216: invokevirtual 132	java/lang/Object:getClass	()Ljava/lang/Class;
    //   219: pop
    //   220: goto +10 -> 230
    //   223: astore_1
    //   224: aload 7
    //   226: aload_1
    //   227: invokevirtual 187	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   230: aload 7
    //   232: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	233	0	this	a
    //   0	233	1	params3	s3
    //   0	233	2	paramBoolean1	boolean
    //   0	233	3	paramBoolean2	boolean
    //   0	233	4	paramInt	int
    //   12	11	5	bool	boolean
    //   31	129	6	locala	h.a
    //   60	52	7	localf	xc.f
    //   117	5	7	localObject1	Object
    //   124	1	7	localObject2	Object
    //   140	91	7	localObject3	Object
    //   68	38	8	i	int
    //   86	13	9	localb	h.b
    // Exception table:
    //   from	to	target	type
    //   96	111	117	finally
    //   119	121	117	finally
    //   46	50	124	finally
    //   53	70	124	finally
    //   78	96	124	finally
    //   121	124	124	finally
    //   129	145	124	finally
    //   211	213	124	finally
    //   145	168	207	finally
    //   173	178	207	finally
    //   181	196	207	finally
    //   196	199	207	finally
    //   208	211	207	finally
    //   213	220	223	finally
  }
  
  public final void g(int paramInt)
  {
    sa.g(paramInt);
  }
  
  public final void h(int paramInt)
  {
    b.h(paramInt);
  }
  
  public final void i(d2.q paramq)
  {
    paramq.f(n.a(z.a), "remote_addr");
  }
  
  public final void j(eb.q paramq)
  {
    s0 locals0 = e;
    s0.b localb = v0.c;
    locals0.a(localb);
    long l = Math.max(0L, paramq.h(TimeUnit.NANOSECONDS));
    e.f(localb, Long.valueOf(l));
  }
  
  public final void l(t paramt)
  {
    h.b localb = s();
    boolean bool;
    if (j == null) {
      bool = true;
    } else {
      bool = false;
    }
    x6.b.I(bool, "Already called setListener");
    j = paramt;
    if (!d)
    {
      r().a(e, null);
      e = null;
    }
  }
  
  public final void m()
  {
    if (!so)
    {
      so = true;
      b.close();
    }
  }
  
  /* Error */
  public final void n(e1 parame1)
  {
    // Byte code:
    //   0: ldc_w 283
    //   3: aload_1
    //   4: invokevirtual 287	eb/e1:e	()Z
    //   7: iconst_1
    //   8: ixor
    //   9: invokestatic 122	x6/b:s	(Ljava/lang/String;Z)V
    //   12: aload_0
    //   13: iconst_1
    //   14: putfield 115	gb/a:f	Z
    //   17: aload_0
    //   18: invokevirtual 126	gb/a:r	()Lhb/h$a;
    //   21: astore_2
    //   22: aload_2
    //   23: invokevirtual 132	java/lang/Object:getClass	()Ljava/lang/Class;
    //   26: pop
    //   27: invokestatic 136	pb/b:c	()V
    //   30: aload_2
    //   31: getfield 156	hb/h$a:a	Lhb/h;
    //   34: getfield 160	hb/h:l	Lhb/h$b;
    //   37: getfield 165	hb/h$b:x	Ljava/lang/Object;
    //   40: astore_3
    //   41: aload_3
    //   42: monitorenter
    //   43: aload_2
    //   44: getfield 156	hb/h$a:a	Lhb/h;
    //   47: getfield 160	hb/h:l	Lhb/h$b;
    //   50: aconst_null
    //   51: aload_1
    //   52: iconst_1
    //   53: invokevirtual 290	hb/h$b:o	(Leb/s0;Leb/e1;Z)V
    //   56: aload_3
    //   57: monitorexit
    //   58: getstatic 181	pb/b:a	Lpb/a;
    //   61: invokevirtual 132	java/lang/Object:getClass	()Ljava/lang/Class;
    //   64: pop
    //   65: return
    //   66: astore_1
    //   67: aload_3
    //   68: monitorexit
    //   69: aload_1
    //   70: athrow
    //   71: astore_3
    //   72: getstatic 181	pb/b:a	Lpb/a;
    //   75: invokevirtual 132	java/lang/Object:getClass	()Ljava/lang/Class;
    //   78: pop
    //   79: goto +9 -> 88
    //   82: astore_1
    //   83: aload_3
    //   84: aload_1
    //   85: invokevirtual 187	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   88: aload_3
    //   89: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	90	0	this	a
    //   0	90	1	parame1	e1
    //   21	23	2	locala	h.a
    //   40	28	3	localObject1	Object
    //   71	18	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   43	58	66	finally
    //   67	69	66	finally
    //   30	43	71	finally
    //   69	71	71	finally
    //   72	79	82	finally
  }
  
  public final void o(eb.s params)
  {
    h.b localb = s();
    boolean bool;
    if (j == null) {
      bool = true;
    } else {
      bool = false;
    }
    x6.b.I(bool, "Already called start");
    x6.b.y(params, "decompressorRegistry");
    l = params;
  }
  
  public final void p(boolean paramBoolean)
  {
    sk = paramBoolean;
  }
  
  public abstract h.a r();
  
  public abstract h.b s();
  
  public final class a
    implements t0
  {
    public s0 a;
    public boolean b;
    public final l3 c;
    public byte[] d;
    
    public a(s0 params0, l3 paraml3)
    {
      x6.b.y(params0, "headers");
      a = params0;
      c = paraml3;
    }
    
    public final t0 a(l paraml)
    {
      return this;
    }
    
    public final void b(InputStream paramInputStream)
    {
      Object localObject = d;
      int i = 0;
      boolean bool;
      if (localObject == null) {
        bool = true;
      } else {
        bool = false;
      }
      x6.b.I(bool, "writePayload should not be called multiple times");
      try
      {
        d = p7.b.b(paramInputStream);
        paramInputStream = c.a;
        int j = paramInputStream.length;
        for (int k = 0; k < j; k++) {
          paramInputStream[k].k(0);
        }
        localObject = c;
        paramInputStream = d;
        long l1 = paramInputStream.length;
        long l2 = paramInputStream.length;
        paramInputStream = a;
        j = paramInputStream.length;
        for (k = 0; k < j; k++) {
          paramInputStream[k].l(0, l1, l2);
        }
        paramInputStream = c;
        l2 = d.length;
        paramInputStream = a;
        j = paramInputStream.length;
        for (k = 0; k < j; k++) {
          paramInputStream[k].m(l2);
        }
        paramInputStream = c;
        l2 = d.length;
        paramInputStream = a;
        j = paramInputStream.length;
        for (k = i; k < j; k++) {
          paramInputStream[k].n(l2);
        }
        return;
      }
      catch (IOException paramInputStream)
      {
        throw new RuntimeException(paramInputStream);
      }
    }
    
    public final void close()
    {
      boolean bool = true;
      b = true;
      if (d == null) {
        bool = false;
      }
      x6.b.I(bool, "Lack of request message. GET request is only supported for unary requests");
      r().a(a, d);
      d = null;
      a = null;
    }
    
    public final void flush() {}
    
    public final void h(int paramInt) {}
    
    public final boolean isClosed()
    {
      return b;
    }
  }
  
  public static abstract class b
    extends d.a
  {
    public final l3 h;
    public boolean i;
    public t j;
    public boolean k;
    public eb.s l = eb.s.d;
    public boolean m = false;
    public a n;
    public volatile boolean o;
    public boolean p;
    public boolean q;
    
    public b(int paramInt, l3 paraml3, r3 paramr3)
    {
      super(paraml3, paramr3);
      h = paraml3;
    }
    
    public final void g(e1 parame1, t.a parama, s0 params0)
    {
      if (!i)
      {
        i = true;
        Object localObject = h;
        AtomicBoolean localAtomicBoolean = b;
        int i1 = 0;
        if (localAtomicBoolean.compareAndSet(false, true))
        {
          localObject = a;
          int i2 = localObject.length;
          while (i1 < i2)
          {
            localObject[i1].o(parame1);
            i1++;
          }
        }
        if (c != null) {
          parame1.e();
        }
        j.d(parame1, parama, params0);
      }
    }
    
    public final void h(s0 params0)
    {
      x6.b.I(p ^ true, "Received headers on closed stream");
      Object localObject1 = h.a;
      int i1 = localObject1.length;
      for (int i2 = 0; i2 < i1; i2++) {
        ((eb.h)localObject1[i2]).w();
      }
      Object localObject2 = (String)params0.c(v0.f);
      boolean bool = k;
      localObject1 = null;
      Object localObject3;
      if ((bool) && (localObject2 != null))
      {
        if (((String)localObject2).equalsIgnoreCase("gzip"))
        {
          localObject3 = new w0();
          localObject2 = d;
          if (e == j.b.a) {
            bool = true;
          } else {
            bool = false;
          }
          x6.b.I(bool, "per-message decompressor already set");
          if (f == null) {
            bool = true;
          } else {
            bool = false;
          }
          x6.b.I(bool, "full stream decompressor already set");
          f = ((w0)localObject3);
          u = null;
          localObject3 = d;
          localObject2 = (y0)this;
          a = new f((y0)localObject2, (y0)localObject2, (i2)localObject3);
          i2 = 1;
          break label245;
        }
        if (!((String)localObject2).equalsIgnoreCase("identity"))
        {
          params0 = new g1(e1.m.g(String.format("Can't find full stream decompressor for %s", new Object[] { localObject2 })));
          break label355;
        }
      }
      i2 = 0;
      label245:
      localObject2 = (String)params0.c(v0.d);
      if (localObject2 != null)
      {
        localObject3 = (s.a)l.a.get(localObject2);
        if (localObject3 != null) {
          localObject1 = a;
        }
        if (localObject1 == null)
        {
          params0 = new g1(e1.m.g(String.format("Can't find decompressor for %s", new Object[] { localObject2 })));
        }
        else
        {
          if (localObject1 == j.b.a) {
            break label374;
          }
          if (i2 == 0) {
            break label364;
          }
          params0 = new g1(e1.m.g("Full stream and gRPC message encoding cannot both be set"));
        }
        label355:
        ((h.b)this).e(params0);
        return;
        label364:
        a.I((r)localObject1);
      }
      label374:
      j.b(params0);
    }
    
    public final void i(s0 params0, e1 parame1, boolean paramBoolean)
    {
      j(parame1, t.a.a, paramBoolean, params0);
    }
    
    public final void j(final e1 parame1, final t.a parama, boolean paramBoolean, final s0 params0)
    {
      x6.b.y(parame1, "status");
      if ((p) && (!paramBoolean)) {
        return;
      }
      p = true;
      q = parame1.e();
      synchronized (b)
      {
        g = true;
        if (m)
        {
          n = null;
          g(parame1, parama, params0);
        }
        else
        {
          n = new a(parame1, parama, params0);
          parame1 = a;
          if (paramBoolean) {
            parame1.close();
          } else {
            parame1.H();
          }
        }
        return;
      }
    }
    
    public final class a
      implements Runnable
    {
      public a(e1 parame1, t.a parama, s0 params0) {}
      
      public final void run()
      {
        g(parame1, parama, params0);
      }
    }
  }
}

/* Location:
 * Qualified Name:     gb.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */