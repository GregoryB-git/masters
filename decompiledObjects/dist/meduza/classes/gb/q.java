package gb;

import eb.c.a;
import eb.c.b;
import eb.e;
import eb.e.a;
import eb.e1;
import eb.e1.a;
import eb.h;
import eb.j.b;
import eb.l;
import eb.p;
import eb.s0;
import eb.s0.d;
import eb.t0;
import eb.t0.b;
import eb.t0.c;
import f;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import n7.g;
import n7.g.a;
import pb.a;

public final class q<ReqT, RespT>
  extends e<ReqT, RespT>
{
  public static final Logger t = Logger.getLogger(q.class.getName());
  public static final byte[] u = "gzip".getBytes(Charset.forName("US-ASCII"));
  public static final double v = TimeUnit.SECONDS.toNanos(1L) * 1.0D;
  public final t0<ReqT, RespT> a;
  public final pb.c b;
  public final Executor c;
  public final boolean d;
  public final m e;
  public final p f;
  public volatile ScheduledFuture<?> g;
  public final boolean h;
  public eb.c i;
  public s j;
  public volatile boolean k;
  public boolean l;
  public boolean m;
  public final c n;
  public final q<ReqT, RespT>.d o = new d();
  public final ScheduledExecutorService p;
  public boolean q;
  public eb.s r = eb.s.d;
  public eb.m s = eb.m.b;
  
  public q(t0 paramt0, Executor paramExecutor, eb.c paramc, r1.e parame, ScheduledExecutorService paramScheduledExecutorService, m paramm)
  {
    a = paramt0;
    Object localObject = b;
    System.identityHashCode(this);
    localObject = pb.b.a;
    localObject.getClass();
    b = a.a;
    s7.c localc = s7.c.a;
    boolean bool1 = true;
    if (paramExecutor == localc)
    {
      c = new e3();
      d = true;
    }
    else
    {
      c = new f3(paramExecutor);
      d = false;
    }
    e = paramm;
    f = p.b();
    paramt0 = a;
    boolean bool2 = bool1;
    if (paramt0 != t0.c.a) {
      if (paramt0 == t0.c.b) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
    }
    h = bool2;
    i = paramc;
    n = parame;
    p = paramScheduledExecutorService;
    localObject.getClass();
  }
  
  /* Error */
  public final void a(String paramString, Throwable paramThrowable)
  {
    // Byte code:
    //   0: invokestatic 206	pb/b:c	()V
    //   3: invokestatic 208	pb/b:a	()V
    //   6: aload_0
    //   7: aload_1
    //   8: aload_2
    //   9: invokevirtual 210	gb/q:f	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   12: getstatic 149	pb/b:a	Lpb/a;
    //   15: invokevirtual 155	java/lang/Object:getClass	()Ljava/lang/Class;
    //   18: pop
    //   19: return
    //   20: astore_2
    //   21: getstatic 149	pb/b:a	Lpb/a;
    //   24: invokevirtual 155	java/lang/Object:getClass	()Ljava/lang/Class;
    //   27: pop
    //   28: goto +9 -> 37
    //   31: astore_1
    //   32: aload_2
    //   33: aload_1
    //   34: invokevirtual 216	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   37: aload_2
    //   38: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	39	0	this	q
    //   0	39	1	paramString	String
    //   0	39	2	paramThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   3	12	20	finally
    //   21	28	31	finally
  }
  
  /* Error */
  public final void b()
  {
    // Byte code:
    //   0: invokestatic 206	pb/b:c	()V
    //   3: invokestatic 208	pb/b:a	()V
    //   6: aload_0
    //   7: getfield 218	gb/q:j	Lgb/s;
    //   10: ifnull +8 -> 18
    //   13: iconst_1
    //   14: istore_1
    //   15: goto +5 -> 20
    //   18: iconst_0
    //   19: istore_1
    //   20: iload_1
    //   21: ldc -36
    //   23: invokestatic 226	x6/b:I	(ZLjava/lang/String;)V
    //   26: aload_0
    //   27: getfield 228	gb/q:l	Z
    //   30: iconst_1
    //   31: ixor
    //   32: ldc -26
    //   34: invokestatic 226	x6/b:I	(ZLjava/lang/String;)V
    //   37: aload_0
    //   38: getfield 232	gb/q:m	Z
    //   41: iconst_1
    //   42: ixor
    //   43: ldc -22
    //   45: invokestatic 226	x6/b:I	(ZLjava/lang/String;)V
    //   48: aload_0
    //   49: iconst_1
    //   50: putfield 232	gb/q:m	Z
    //   53: aload_0
    //   54: getfield 218	gb/q:j	Lgb/s;
    //   57: invokeinterface 238 1 0
    //   62: getstatic 149	pb/b:a	Lpb/a;
    //   65: invokevirtual 155	java/lang/Object:getClass	()Ljava/lang/Class;
    //   68: pop
    //   69: return
    //   70: astore_2
    //   71: getstatic 149	pb/b:a	Lpb/a;
    //   74: invokevirtual 155	java/lang/Object:getClass	()Ljava/lang/Class;
    //   77: pop
    //   78: goto +9 -> 87
    //   81: astore_3
    //   82: aload_2
    //   83: aload_3
    //   84: invokevirtual 216	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   87: aload_2
    //   88: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	89	0	this	q
    //   14	7	1	bool	boolean
    //   70	18	2	localObject	Object
    //   81	3	3	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   3	13	70	finally
    //   20	62	70	finally
    //   71	78	81	finally
  }
  
  /* Error */
  public final void c(int paramInt)
  {
    // Byte code:
    //   0: invokestatic 206	pb/b:c	()V
    //   3: invokestatic 208	pb/b:a	()V
    //   6: aload_0
    //   7: getfield 218	gb/q:j	Lgb/s;
    //   10: astore_2
    //   11: iconst_1
    //   12: istore_3
    //   13: aload_2
    //   14: ifnull +9 -> 23
    //   17: iconst_1
    //   18: istore 4
    //   20: goto +6 -> 26
    //   23: iconst_0
    //   24: istore 4
    //   26: iload 4
    //   28: ldc -36
    //   30: invokestatic 226	x6/b:I	(ZLjava/lang/String;)V
    //   33: iload_1
    //   34: iflt +9 -> 43
    //   37: iload_3
    //   38: istore 4
    //   40: goto +6 -> 46
    //   43: iconst_0
    //   44: istore 4
    //   46: ldc -15
    //   48: iload 4
    //   50: invokestatic 244	x6/b:s	(Ljava/lang/String;Z)V
    //   53: aload_0
    //   54: getfield 218	gb/q:j	Lgb/s;
    //   57: iload_1
    //   58: invokeinterface 248 2 0
    //   63: getstatic 149	pb/b:a	Lpb/a;
    //   66: invokevirtual 155	java/lang/Object:getClass	()Ljava/lang/Class;
    //   69: pop
    //   70: return
    //   71: astore_2
    //   72: getstatic 149	pb/b:a	Lpb/a;
    //   75: invokevirtual 155	java/lang/Object:getClass	()Ljava/lang/Class;
    //   78: pop
    //   79: goto +11 -> 90
    //   82: astore 5
    //   84: aload_2
    //   85: aload 5
    //   87: invokevirtual 216	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   90: aload_2
    //   91: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	92	0	this	q
    //   0	92	1	paramInt	int
    //   10	4	2	locals	s
    //   71	20	2	localObject	Object
    //   12	26	3	bool1	boolean
    //   18	31	4	bool2	boolean
    //   82	4	5	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   3	11	71	finally
    //   26	33	71	finally
    //   46	63	71	finally
    //   72	79	82	finally
  }
  
  /* Error */
  public final void d(ReqT paramReqT)
  {
    // Byte code:
    //   0: invokestatic 206	pb/b:c	()V
    //   3: invokestatic 208	pb/b:a	()V
    //   6: aload_0
    //   7: aload_1
    //   8: invokevirtual 251	gb/q:h	(Ljava/lang/Object;)V
    //   11: getstatic 149	pb/b:a	Lpb/a;
    //   14: invokevirtual 155	java/lang/Object:getClass	()Ljava/lang/Class;
    //   17: pop
    //   18: return
    //   19: astore_1
    //   20: getstatic 149	pb/b:a	Lpb/a;
    //   23: invokevirtual 155	java/lang/Object:getClass	()Ljava/lang/Class;
    //   26: pop
    //   27: goto +9 -> 36
    //   30: astore_2
    //   31: aload_1
    //   32: aload_2
    //   33: invokevirtual 216	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   36: aload_1
    //   37: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	38	0	this	q
    //   0	38	1	paramReqT	ReqT
    //   30	3	2	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   3	11	19	finally
    //   20	27	30	finally
  }
  
  /* Error */
  public final void e(e.a<RespT> parama, s0 params0)
  {
    // Byte code:
    //   0: invokestatic 206	pb/b:c	()V
    //   3: invokestatic 208	pb/b:a	()V
    //   6: aload_0
    //   7: aload_1
    //   8: aload_2
    //   9: invokevirtual 256	gb/q:i	(Leb/e$a;Leb/s0;)V
    //   12: getstatic 149	pb/b:a	Lpb/a;
    //   15: invokevirtual 155	java/lang/Object:getClass	()Ljava/lang/Class;
    //   18: pop
    //   19: return
    //   20: astore_2
    //   21: getstatic 149	pb/b:a	Lpb/a;
    //   24: invokevirtual 155	java/lang/Object:getClass	()Ljava/lang/Class;
    //   27: pop
    //   28: goto +9 -> 37
    //   31: astore_1
    //   32: aload_2
    //   33: aload_1
    //   34: invokevirtual 216	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   37: aload_2
    //   38: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	39	0	this	q
    //   0	39	1	parama	e.a<RespT>
    //   0	39	2	params0	s0
    // Exception table:
    //   from	to	target	type
    //   3	12	20	finally
    //   21	28	31	finally
  }
  
  public final void f(String paramString, Throwable paramThrowable)
  {
    Object localObject = paramThrowable;
    if (paramString == null)
    {
      localObject = paramThrowable;
      if (paramThrowable == null)
      {
        localObject = new CancellationException("Cancelled without a message or cause");
        t.log(Level.WARNING, "Cancelling without a message or cause is suboptimal", (Throwable)localObject);
      }
    }
    if (l) {
      return;
    }
    l = true;
    try
    {
      if (j != null)
      {
        paramThrowable = e1.f;
        if (paramString != null) {}
        for (;;)
        {
          paramThrowable = paramThrowable.g(paramString);
          break;
          paramString = "Call cancelled without message";
        }
        paramString = paramThrowable;
        if (localObject != null) {
          paramString = paramThrowable.f((Throwable)localObject);
        }
        j.n(paramString);
      }
      return;
    }
    finally
    {
      g();
    }
  }
  
  public final void g()
  {
    f.getClass();
    ScheduledFuture localScheduledFuture = g;
    if (localScheduledFuture != null) {
      localScheduledFuture.cancel(false);
    }
  }
  
  public final void h(ReqT paramReqT)
  {
    boolean bool;
    if (j != null) {
      bool = true;
    } else {
      bool = false;
    }
    x6.b.I(bool, "Not started");
    x6.b.I(l ^ true, "call was cancelled");
    x6.b.I(m ^ true, "call was half-closed");
    try
    {
      s locals = j;
      if ((locals instanceof y2)) {
        ((y2)locals).A(paramReqT);
      } else {
        locals.d(a.d.b(paramReqT));
      }
      if (!h) {
        j.flush();
      }
      return;
    }
    catch (Error paramReqT)
    {
      j.n(e1.f.g("Client sendMessage() failed with Error"));
      throw paramReqT;
    }
    catch (RuntimeException paramReqT)
    {
      j.n(e1.f.f(paramReqT).g("Failed to stream message"));
    }
  }
  
  public final void i(final e.a<RespT> parama, s0 params0)
  {
    if (j == null) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    x6.b.I(bool1, "Already started");
    x6.b.I(l ^ true, "call was cancelled");
    x6.b.y(parama, "observer");
    x6.b.y(params0, "headers");
    f.getClass();
    Object localObject1 = i;
    Object localObject2 = g2.a.g;
    Object localObject3 = (g2.a)((eb.c)localObject1).a((c.b)localObject2);
    long l1;
    int i1;
    Object localObject5;
    if (localObject3 != null)
    {
      localObject1 = a;
      if (localObject1 != null)
      {
        l1 = ((Long)localObject1).longValue();
        localObject4 = TimeUnit.NANOSECONDS;
        localObject1 = eb.q.d;
        if (localObject4 != null)
        {
          localObject1 = new eb.q(((TimeUnit)localObject4).toNanos(l1));
          localObject4 = i.a;
          if (localObject4 != null)
          {
            ((eb.q)localObject1).f((eb.q)localObject4);
            boolean bool2 = b - b < 0L;
            if (bool2) {
              i1 = -1;
            } else if (i1 > 0) {
              i1 = 1;
            } else {
              i1 = 0;
            }
            if (i1 >= 0) {}
          }
          else
          {
            localObject4 = i;
            localObject4.getClass();
            localObject4 = eb.c.b((eb.c)localObject4);
            a = ((eb.q)localObject1);
            i = new eb.c((c.a)localObject4);
          }
        }
        else
        {
          throw new NullPointerException("units");
        }
      }
      localObject1 = b;
      if (localObject1 != null)
      {
        if (((Boolean)localObject1).booleanValue())
        {
          localObject1 = i;
          localObject1.getClass();
          localObject1 = eb.c.b((eb.c)localObject1);
          h = Boolean.TRUE;
          localObject1 = new eb.c((c.a)localObject1);
        }
        else
        {
          localObject1 = i;
          localObject1.getClass();
          localObject1 = eb.c.b((eb.c)localObject1);
          h = Boolean.FALSE;
          localObject1 = new eb.c((c.a)localObject1);
        }
        i = ((eb.c)localObject1);
      }
      localObject5 = c;
      if (localObject5 != null)
      {
        localObject1 = i;
        localObject4 = i;
        if (localObject4 != null) {
          i1 = Math.min(((Integer)localObject4).intValue(), c.intValue());
        } else {
          i1 = ((Integer)localObject5).intValue();
        }
        if (i1 >= 0) {
          bool1 = true;
        } else {
          bool1 = false;
        }
        x6.b.l(i1, "invalid maxsize %s", bool1);
        localObject1 = eb.c.b((eb.c)localObject1);
        i = Integer.valueOf(i1);
        i = new eb.c((c.a)localObject1);
      }
      localObject4 = d;
      if (localObject4 != null)
      {
        localObject5 = i;
        localObject1 = j;
        if (localObject1 != null) {
          i1 = Math.min(((Integer)localObject1).intValue(), d.intValue());
        } else {
          i1 = ((Integer)localObject4).intValue();
        }
        if (i1 >= 0) {
          bool1 = true;
        } else {
          bool1 = false;
        }
        x6.b.l(i1, "invalid maxsize %s", bool1);
        localObject1 = eb.c.b((eb.c)localObject5);
        j = Integer.valueOf(i1);
        i = new eb.c((c.a)localObject1);
      }
    }
    final Object localObject4 = i.e;
    if (localObject4 != null)
    {
      localObject3 = (l)s.a.get(localObject4);
      localObject1 = localObject3;
      if (localObject3 == null)
      {
        j = l2.a;
        c.execute(new a(parama, (String)localObject4));
      }
    }
    else
    {
      localObject1 = j.b.a;
    }
    localObject4 = r;
    boolean bool1 = q;
    params0.a(v0.h);
    localObject3 = v0.d;
    params0.a((s0.d)localObject3);
    if (localObject1 != j.b.a) {
      params0.f((s0.d)localObject3, ((l)localObject1).a());
    }
    localObject3 = v0.e;
    params0.a((s0.d)localObject3);
    localObject4 = b;
    if (localObject4.length != 0) {
      params0.f((s0.d)localObject3, (Serializable)localObject4);
    }
    params0.a(v0.f);
    localObject3 = v0.g;
    params0.a((s0.d)localObject3);
    if (bool1) {
      params0.f((s0.d)localObject3, u);
    }
    localObject3 = i.a;
    f.getClass();
    if (localObject3 == null) {
      localObject3 = null;
    }
    if ((localObject3 != null) && (((eb.q)localObject3).g())) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    if (i1 == 0)
    {
      f.getClass();
      Object localObject6 = i.a;
      localObject5 = t;
      if ((((Logger)localObject5).isLoggable(Level.FINE)) && (localObject3 != null) && (((eb.q)localObject3).equals(null)))
      {
        localObject7 = TimeUnit.NANOSECONDS;
        l1 = Math.max(0L, ((eb.q)localObject3).h((TimeUnit)localObject7));
        localObject4 = Locale.US;
        localObject8 = new StringBuilder(String.format((Locale)localObject4, "Call timeout set to '%d' ns, due to context deadline.", new Object[] { Long.valueOf(l1) }));
        if (localObject6 == null) {
          localObject4 = " Explicit call timeout was not set.";
        } else {
          localObject4 = String.format((Locale)localObject4, " Explicit call timeout was '%d' ns.", new Object[] { Long.valueOf(((eb.q)localObject6).h((TimeUnit)localObject7)) });
        }
        ((StringBuilder)localObject8).append((String)localObject4);
        ((Logger)localObject5).fine(((StringBuilder)localObject8).toString());
      }
      localObject4 = n;
      localObject6 = a;
      Object localObject8 = i;
      localObject5 = f;
      Object localObject7 = (r1.e)localObject4;
      if (!b.Z)
      {
        localObject7 = ((r1.e)localObject7).a(new s2((t0)localObject6, params0, (eb.c)localObject8));
        localObject4 = ((p)localObject5).a();
        localObject2 = v0.c((eb.c)localObject8, params0, 0, false);
      }
      try
      {
        params0 = ((u)localObject7).d((t0)localObject6, params0, (eb.c)localObject8, (h[])localObject2);
        ((p)localObject5).c((p)localObject4);
      }
      finally
      {
        ((p)localObject5).c((p)localObject4);
      }
      if (localObject2 == null) {
        localObject4 = null;
      } else {
        localObject4 = e;
      }
      if (localObject2 == null) {
        localObject2 = null;
      } else {
        localObject2 = f;
      }
      params0 = new a2((r1.e)localObject7, (t0)localObject6, params0, (eb.c)localObject8, (a3)localObject4, (x0)localObject2, (p)localObject5);
      j = params0;
    }
    else
    {
      localObject4 = v0.c(i, params0, 0, false);
      params0 = i.a;
      f.getClass();
      if (params0 == null) {
        i1 = 0;
      } else {
        i1 = 1;
      }
      if (i1 != 0) {
        params0 = "CallOptions";
      } else {
        params0 = "Context";
      }
      localObject2 = (Long)i.a(h.b);
      double d1 = ((eb.q)localObject3).h(TimeUnit.NANOSECONDS);
      double d2 = v;
      d1 /= d2;
      if (localObject2 == null) {
        d2 = 0.0D;
      } else {
        d2 = ((Long)localObject2).longValue() / d2;
      }
      params0 = String.format("ClientCall started after %s deadline was exceeded %.9f seconds ago. Name resolution delay %.9f seconds.", new Object[] { params0, Double.valueOf(d1), Double.valueOf(d2) });
      j = new l0(e1.h.g(params0), t.a.a, (h[])localObject4);
    }
    if (d) {
      j.e();
    }
    params0 = i.c;
    if (params0 != null) {
      j.k(params0);
    }
    params0 = i.i;
    if (params0 != null) {
      j.g(params0.intValue());
    }
    params0 = i.j;
    if (params0 != null) {
      j.h(params0.intValue());
    }
    if (localObject3 != null) {
      j.j((eb.q)localObject3);
    }
    j.a((l)localObject1);
    bool1 = q;
    if (bool1) {
      j.p(bool1);
    }
    j.o(r);
    params0 = e;
    b.b();
    a.a();
    j.l(new b(parama));
    parama = f;
    params0 = o;
    parama.getClass();
    if (params0 != null)
    {
      parama = p.a;
      if (localObject3 != null)
      {
        f.getClass();
        if ((!((eb.q)localObject3).equals(null)) && (p != null))
        {
          parama = TimeUnit.NANOSECONDS;
          l1 = ((eb.q)localObject3).h(parama);
          g = p.schedule(new p1(new e(l1)), l1, parama);
        }
      }
      if (k) {
        g();
      }
      return;
    }
    throw new NullPointerException("cancellationListener");
  }
  
  public final String toString()
  {
    g.a locala = g.b(this);
    locala.a(a, "method");
    return locala.toString();
  }
  
  public final class a
    extends z
  {
    public a()
    {
      super();
    }
    
    public final void a()
    {
      q localq = d;
      e.a locala = parama;
      e1 locale1 = e1.m.g(String.format("Unable to find compressor by name %s", new Object[] { localObject4 }));
      s0 locals0 = new s0();
      localq.getClass();
      locala.a(locals0, locale1);
    }
  }
  
  public final class b
    implements t
  {
    public final e.a<RespT> a;
    public e1 b;
    
    public b()
    {
      Object localObject;
      x6.b.y(localObject, "observer");
      a = ((e.a)localObject);
    }
    
    /* Error */
    public final void a(n3.a parama)
    {
      // Byte code:
      //   0: invokestatic 46	pb/b:c	()V
      //   3: aload_0
      //   4: getfield 25	gb/q$b:c	Lgb/q;
      //   7: getfield 49	gb/q:b	Lpb/c;
      //   10: astore_2
      //   11: invokestatic 51	pb/b:a	()V
      //   14: invokestatic 53	pb/b:b	()V
      //   17: aload_0
      //   18: getfield 25	gb/q$b:c	Lgb/q;
      //   21: getfield 56	gb/q:c	Ljava/util/concurrent/Executor;
      //   24: astore_3
      //   25: new 14	gb/q$b$b
      //   28: astore_2
      //   29: aload_2
      //   30: aload_0
      //   31: aload_1
      //   32: invokespecial 59	gb/q$b$b:<init>	(Lgb/q$b;Lgb/n3$a;)V
      //   35: aload_3
      //   36: aload_2
      //   37: invokeinterface 65 2 0
      //   42: getstatic 68	pb/b:a	Lpb/a;
      //   45: invokevirtual 72	java/lang/Object:getClass	()Ljava/lang/Class;
      //   48: pop
      //   49: return
      //   50: astore_2
      //   51: getstatic 68	pb/b:a	Lpb/a;
      //   54: invokevirtual 72	java/lang/Object:getClass	()Ljava/lang/Class;
      //   57: pop
      //   58: goto +9 -> 67
      //   61: astore_1
      //   62: aload_2
      //   63: aload_1
      //   64: invokevirtual 78	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
      //   67: aload_2
      //   68: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	69	0	this	b
      //   0	69	1	parama	n3.a
      //   10	27	2	localObject1	Object
      //   50	18	2	localObject2	Object
      //   24	12	3	localExecutor	Executor
      // Exception table:
      //   from	to	target	type
      //   3	42	50	finally
      //   51	58	61	finally
    }
    
    /* Error */
    public final void b(s0 params0)
    {
      // Byte code:
      //   0: invokestatic 46	pb/b:c	()V
      //   3: aload_0
      //   4: getfield 25	gb/q$b:c	Lgb/q;
      //   7: getfield 49	gb/q:b	Lpb/c;
      //   10: astore_2
      //   11: invokestatic 51	pb/b:a	()V
      //   14: invokestatic 53	pb/b:b	()V
      //   17: aload_0
      //   18: getfield 25	gb/q$b:c	Lgb/q;
      //   21: getfield 56	gb/q:c	Ljava/util/concurrent/Executor;
      //   24: astore_2
      //   25: new 11	gb/q$b$a
      //   28: astore_3
      //   29: aload_3
      //   30: aload_0
      //   31: aload_1
      //   32: invokespecial 82	gb/q$b$a:<init>	(Lgb/q$b;Leb/s0;)V
      //   35: aload_2
      //   36: aload_3
      //   37: invokeinterface 65 2 0
      //   42: getstatic 68	pb/b:a	Lpb/a;
      //   45: invokevirtual 72	java/lang/Object:getClass	()Ljava/lang/Class;
      //   48: pop
      //   49: return
      //   50: astore_2
      //   51: getstatic 68	pb/b:a	Lpb/a;
      //   54: invokevirtual 72	java/lang/Object:getClass	()Ljava/lang/Class;
      //   57: pop
      //   58: goto +9 -> 67
      //   61: astore_1
      //   62: aload_2
      //   63: aload_1
      //   64: invokevirtual 78	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
      //   67: aload_2
      //   68: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	69	0	this	b
      //   0	69	1	params0	s0
      //   10	26	2	localObject1	Object
      //   50	18	2	localObject2	Object
      //   28	9	3	locala	a
      // Exception table:
      //   from	to	target	type
      //   3	42	50	finally
      //   51	58	61	finally
    }
    
    /* Error */
    public final void c()
    {
      // Byte code:
      //   0: aload_0
      //   1: getfield 25	gb/q$b:c	Lgb/q;
      //   4: getfield 85	gb/q:a	Leb/t0;
      //   7: getfield 90	eb/t0:a	Leb/t0$c;
      //   10: astore_1
      //   11: aload_1
      //   12: invokevirtual 72	java/lang/Object:getClass	()Ljava/lang/Class;
      //   15: pop
      //   16: aload_1
      //   17: getstatic 93	eb/t0$c:a	Leb/t0$c;
      //   20: if_acmpeq +18 -> 38
      //   23: aload_1
      //   24: getstatic 95	eb/t0$c:b	Leb/t0$c;
      //   27: if_acmpne +6 -> 33
      //   30: goto +8 -> 38
      //   33: iconst_0
      //   34: istore_2
      //   35: goto +5 -> 40
      //   38: iconst_1
      //   39: istore_2
      //   40: iload_2
      //   41: ifeq +4 -> 45
      //   44: return
      //   45: invokestatic 46	pb/b:c	()V
      //   48: aload_0
      //   49: getfield 25	gb/q$b:c	Lgb/q;
      //   52: getfield 49	gb/q:b	Lpb/c;
      //   55: astore_1
      //   56: invokestatic 51	pb/b:a	()V
      //   59: invokestatic 53	pb/b:b	()V
      //   62: aload_0
      //   63: getfield 25	gb/q$b:c	Lgb/q;
      //   66: getfield 56	gb/q:c	Ljava/util/concurrent/Executor;
      //   69: astore_3
      //   70: new 16	gb/q$b$c
      //   73: astore_1
      //   74: aload_1
      //   75: aload_0
      //   76: invokespecial 98	gb/q$b$c:<init>	(Lgb/q$b;)V
      //   79: aload_3
      //   80: aload_1
      //   81: invokeinterface 65 2 0
      //   86: getstatic 68	pb/b:a	Lpb/a;
      //   89: invokevirtual 72	java/lang/Object:getClass	()Ljava/lang/Class;
      //   92: pop
      //   93: return
      //   94: astore_3
      //   95: getstatic 68	pb/b:a	Lpb/a;
      //   98: invokevirtual 72	java/lang/Object:getClass	()Ljava/lang/Class;
      //   101: pop
      //   102: goto +9 -> 111
      //   105: astore_1
      //   106: aload_3
      //   107: aload_1
      //   108: invokevirtual 78	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
      //   111: aload_3
      //   112: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	113	0	this	b
      //   10	71	1	localObject1	Object
      //   105	3	1	localThrowable	Throwable
      //   34	7	2	i	int
      //   69	11	3	localExecutor	Executor
      //   94	18	3	localObject2	Object
      // Exception table:
      //   from	to	target	type
      //   48	86	94	finally
      //   95	102	105	finally
    }
    
    /* Error */
    public final void d(e1 parame1, t.a parama, s0 params0)
    {
      // Byte code:
      //   0: invokestatic 46	pb/b:c	()V
      //   3: aload_0
      //   4: getfield 25	gb/q$b:c	Lgb/q;
      //   7: getfield 49	gb/q:b	Lpb/c;
      //   10: astore_2
      //   11: invokestatic 51	pb/b:a	()V
      //   14: aload_0
      //   15: aload_1
      //   16: aload_3
      //   17: invokevirtual 104	gb/q$b:e	(Leb/e1;Leb/s0;)V
      //   20: getstatic 68	pb/b:a	Lpb/a;
      //   23: invokevirtual 72	java/lang/Object:getClass	()Ljava/lang/Class;
      //   26: pop
      //   27: return
      //   28: astore_1
      //   29: getstatic 68	pb/b:a	Lpb/a;
      //   32: invokevirtual 72	java/lang/Object:getClass	()Ljava/lang/Class;
      //   35: pop
      //   36: goto +9 -> 45
      //   39: astore_2
      //   40: aload_1
      //   41: aload_2
      //   42: invokevirtual 78	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
      //   45: aload_1
      //   46: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	47	0	this	b
      //   0	47	1	parame1	e1
      //   0	47	2	parama	t.a
      //   0	47	3	params0	s0
      // Exception table:
      //   from	to	target	type
      //   3	20	28	finally
      //   29	36	39	finally
    }
    
    public final void e(e1 parame1, s0 params0)
    {
      Object localObject1 = q.this;
      Object localObject2 = i.a;
      f.getClass();
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = null;
      }
      e1 locale1 = parame1;
      localObject2 = params0;
      if (a == e1.a.d)
      {
        locale1 = parame1;
        localObject2 = params0;
        if (localObject1 != null)
        {
          locale1 = parame1;
          localObject2 = params0;
          if (((eb.q)localObject1).g())
          {
            parame1 = new d2.q();
            j.i(parame1);
            params0 = e1.h;
            localObject1 = new StringBuilder();
            ((StringBuilder)localObject1).append("ClientCall was cancelled at or after deadline. ");
            ((StringBuilder)localObject1).append(parame1);
            locale1 = params0.a(((StringBuilder)localObject1).toString());
            localObject2 = new s0();
          }
        }
      }
      pb.b.b();
      c.execute(new r(this, locale1, (s0)localObject2));
    }
    
    public final class a
      extends z
    {
      public a(s0 params0)
      {
        super();
      }
      
      /* Error */
      public final void a()
      {
        // Byte code:
        //   0: invokestatic 35	pb/b:c	()V
        //   3: aload_0
        //   4: getfield 17	gb/q$b$a:c	Lgb/q$b;
        //   7: getfield 22	gb/q$b:c	Lgb/q;
        //   10: getfield 38	gb/q:b	Lpb/c;
        //   13: astore_1
        //   14: invokestatic 40	pb/b:a	()V
        //   17: getstatic 43	pb/b:a	Lpb/a;
        //   20: invokevirtual 49	java/lang/Object:getClass	()Ljava/lang/Class;
        //   23: pop
        //   24: aload_0
        //   25: getfield 17	gb/q$b$a:c	Lgb/q$b;
        //   28: astore_2
        //   29: aload_2
        //   30: getfield 52	gb/q$b:b	Leb/e1;
        //   33: astore_1
        //   34: aload_1
        //   35: ifnull +6 -> 41
        //   38: goto +54 -> 92
        //   41: aload_2
        //   42: getfield 55	gb/q$b:a	Leb/e$a;
        //   45: aload_0
        //   46: getfield 19	gb/q$b$a:b	Leb/s0;
        //   49: invokevirtual 60	eb/e$a:b	(Leb/s0;)V
        //   52: goto +40 -> 92
        //   55: astore_2
        //   56: aload_0
        //   57: getfield 17	gb/q$b$a:c	Lgb/q$b;
        //   60: astore_1
        //   61: getstatic 64	eb/e1:f	Leb/e1;
        //   64: aload_2
        //   65: invokevirtual 67	eb/e1:f	(Ljava/lang/Throwable;)Leb/e1;
        //   68: ldc 69
        //   70: invokevirtual 73	eb/e1:g	(Ljava/lang/String;)Leb/e1;
        //   73: astore_2
        //   74: aload_1
        //   75: aload_2
        //   76: putfield 52	gb/q$b:b	Leb/e1;
        //   79: aload_1
        //   80: getfield 22	gb/q$b:c	Lgb/q;
        //   83: getfield 77	gb/q:j	Lgb/s;
        //   86: aload_2
        //   87: invokeinterface 83 2 0
        //   92: getstatic 43	pb/b:a	Lpb/a;
        //   95: invokevirtual 49	java/lang/Object:getClass	()Ljava/lang/Class;
        //   98: pop
        //   99: return
        //   100: astore_2
        //   101: getstatic 43	pb/b:a	Lpb/a;
        //   104: invokevirtual 49	java/lang/Object:getClass	()Ljava/lang/Class;
        //   107: pop
        //   108: goto +9 -> 117
        //   111: astore_1
        //   112: aload_2
        //   113: aload_1
        //   114: invokevirtual 89	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
        //   117: aload_2
        //   118: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	119	0	this	a
        //   13	67	1	localObject1	Object
        //   111	3	1	localThrowable1	Throwable
        //   28	14	2	localb	q.b
        //   55	10	2	localThrowable2	Throwable
        //   73	14	2	locale1	e1
        //   100	18	2	localObject2	Object
        // Exception table:
        //   from	to	target	type
        //   41	52	55	finally
        //   3	34	100	finally
        //   56	92	100	finally
        //   101	108	111	finally
      }
    }
    
    public final class b
      extends z
    {
      public b(n3.a parama)
      {
        super();
      }
      
      /* Error */
      public final void a()
      {
        // Byte code:
        //   0: invokestatic 35	pb/b:c	()V
        //   3: aload_0
        //   4: getfield 16	gb/q$b$b:c	Lgb/q$b;
        //   7: getfield 21	gb/q$b:c	Lgb/q;
        //   10: getfield 38	gb/q:b	Lpb/c;
        //   13: astore_1
        //   14: invokestatic 40	pb/b:a	()V
        //   17: getstatic 43	pb/b:a	Lpb/a;
        //   20: astore_1
        //   21: aload_1
        //   22: invokevirtual 49	java/lang/Object:getClass	()Ljava/lang/Class;
        //   25: pop
        //   26: aload_0
        //   27: invokevirtual 51	gb/q$b$b:b	()V
        //   30: aload_1
        //   31: invokevirtual 49	java/lang/Object:getClass	()Ljava/lang/Class;
        //   34: pop
        //   35: return
        //   36: astore_1
        //   37: getstatic 43	pb/b:a	Lpb/a;
        //   40: invokevirtual 49	java/lang/Object:getClass	()Ljava/lang/Class;
        //   43: pop
        //   44: goto +9 -> 53
        //   47: astore_2
        //   48: aload_1
        //   49: aload_2
        //   50: invokevirtual 57	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
        //   53: aload_1
        //   54: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	55	0	this	b
        //   13	18	1	localObject1	Object
        //   36	18	1	localObject2	Object
        //   47	3	2	localThrowable	Throwable
        // Exception table:
        //   from	to	target	type
        //   3	30	36	finally
        //   37	44	47	finally
      }
      
      /* Error */
      public final void b()
      {
        // Byte code:
        //   0: aload_0
        //   1: getfield 16	gb/q$b$b:c	Lgb/q$b;
        //   4: getfield 60	gb/q$b:b	Leb/e1;
        //   7: ifnull +31 -> 38
        //   10: aload_0
        //   11: getfield 18	gb/q$b$b:b	Lgb/n3$a;
        //   14: astore_1
        //   15: getstatic 65	gb/v0:a	Ljava/util/logging/Logger;
        //   18: astore_2
        //   19: aload_1
        //   20: invokeinterface 71 1 0
        //   25: astore_2
        //   26: aload_2
        //   27: ifnull +10 -> 37
        //   30: aload_2
        //   31: invokestatic 74	gb/v0:b	(Ljava/io/Closeable;)V
        //   34: goto -15 -> 19
        //   37: return
        //   38: aload_0
        //   39: getfield 18	gb/q$b$b:b	Lgb/n3$a;
        //   42: invokeinterface 71 1 0
        //   47: astore_1
        //   48: aload_1
        //   49: ifnull +109 -> 158
        //   52: aload_0
        //   53: getfield 16	gb/q$b$b:c	Lgb/q$b;
        //   56: astore_2
        //   57: aload_2
        //   58: getfield 77	gb/q$b:a	Leb/e$a;
        //   61: aload_2
        //   62: getfield 21	gb/q$b:c	Lgb/q;
        //   65: getfield 80	gb/q:a	Leb/t0;
        //   68: getfield 86	eb/t0:e	Leb/t0$b;
        //   71: aload_1
        //   72: invokeinterface 91 2 0
        //   77: invokevirtual 96	eb/e$a:c	(Ljava/lang/Object;)V
        //   80: aload_1
        //   81: invokevirtual 101	java/io/InputStream:close	()V
        //   84: goto -46 -> 38
        //   87: astore_2
        //   88: aload_1
        //   89: invokestatic 74	gb/v0:b	(Ljava/io/Closeable;)V
        //   92: aload_2
        //   93: athrow
        //   94: astore_1
        //   95: aload_0
        //   96: getfield 18	gb/q$b$b:b	Lgb/n3$a;
        //   99: astore_2
        //   100: getstatic 65	gb/v0:a	Ljava/util/logging/Logger;
        //   103: astore_3
        //   104: aload_2
        //   105: invokeinterface 71 1 0
        //   110: astore_3
        //   111: aload_3
        //   112: ifnull +10 -> 122
        //   115: aload_3
        //   116: invokestatic 74	gb/v0:b	(Ljava/io/Closeable;)V
        //   119: goto -15 -> 104
        //   122: aload_0
        //   123: getfield 16	gb/q$b$b:c	Lgb/q$b;
        //   126: astore_2
        //   127: getstatic 105	eb/e1:f	Leb/e1;
        //   130: aload_1
        //   131: invokevirtual 108	eb/e1:f	(Ljava/lang/Throwable;)Leb/e1;
        //   134: ldc 110
        //   136: invokevirtual 114	eb/e1:g	(Ljava/lang/String;)Leb/e1;
        //   139: astore_1
        //   140: aload_2
        //   141: aload_1
        //   142: putfield 60	gb/q$b:b	Leb/e1;
        //   145: aload_2
        //   146: getfield 21	gb/q$b:c	Lgb/q;
        //   149: getfield 118	gb/q:j	Lgb/s;
        //   152: aload_1
        //   153: invokeinterface 124 2 0
        //   158: return
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	159	0	this	b
        //   14	75	1	localObject1	Object
        //   94	37	1	localThrowable	Throwable
        //   139	14	1	locale1	e1
        //   18	44	2	localObject2	Object
        //   87	6	2	localObject3	Object
        //   99	47	2	localObject4	Object
        //   103	13	3	localObject5	Object
        // Exception table:
        //   from	to	target	type
        //   52	80	87	finally
        //   38	48	94	finally
        //   80	84	94	finally
        //   88	94	94	finally
      }
    }
    
    public final class c
      extends z
    {
      public c()
      {
        super();
      }
      
      /* Error */
      public final void a()
      {
        // Byte code:
        //   0: invokestatic 32	pb/b:c	()V
        //   3: aload_0
        //   4: getfield 15	gb/q$b$c:b	Lgb/q$b;
        //   7: getfield 18	gb/q$b:c	Lgb/q;
        //   10: getfield 35	gb/q:b	Lpb/c;
        //   13: astore_1
        //   14: invokestatic 37	pb/b:a	()V
        //   17: getstatic 40	pb/b:a	Lpb/a;
        //   20: invokevirtual 46	java/lang/Object:getClass	()Ljava/lang/Class;
        //   23: pop
        //   24: aload_0
        //   25: getfield 15	gb/q$b$c:b	Lgb/q$b;
        //   28: astore_2
        //   29: aload_2
        //   30: getfield 49	gb/q$b:b	Leb/e1;
        //   33: astore_1
        //   34: aload_1
        //   35: ifnull +6 -> 41
        //   38: goto +50 -> 88
        //   41: aload_2
        //   42: getfield 52	gb/q$b:a	Leb/e$a;
        //   45: invokevirtual 57	eb/e$a:d	()V
        //   48: goto +40 -> 88
        //   51: astore_2
        //   52: aload_0
        //   53: getfield 15	gb/q$b$c:b	Lgb/q$b;
        //   56: astore_1
        //   57: getstatic 61	eb/e1:f	Leb/e1;
        //   60: aload_2
        //   61: invokevirtual 64	eb/e1:f	(Ljava/lang/Throwable;)Leb/e1;
        //   64: ldc 66
        //   66: invokevirtual 70	eb/e1:g	(Ljava/lang/String;)Leb/e1;
        //   69: astore_2
        //   70: aload_1
        //   71: aload_2
        //   72: putfield 49	gb/q$b:b	Leb/e1;
        //   75: aload_1
        //   76: getfield 18	gb/q$b:c	Lgb/q;
        //   79: getfield 74	gb/q:j	Lgb/s;
        //   82: aload_2
        //   83: invokeinterface 80 2 0
        //   88: getstatic 40	pb/b:a	Lpb/a;
        //   91: invokevirtual 46	java/lang/Object:getClass	()Ljava/lang/Class;
        //   94: pop
        //   95: return
        //   96: astore_1
        //   97: getstatic 40	pb/b:a	Lpb/a;
        //   100: invokevirtual 46	java/lang/Object:getClass	()Ljava/lang/Class;
        //   103: pop
        //   104: goto +9 -> 113
        //   107: astore_2
        //   108: aload_1
        //   109: aload_2
        //   110: invokevirtual 86	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
        //   113: aload_1
        //   114: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	115	0	this	c
        //   13	63	1	localObject1	Object
        //   96	18	1	localObject2	Object
        //   28	14	2	localb	q.b
        //   51	10	2	localThrowable1	Throwable
        //   69	14	2	locale1	e1
        //   107	3	2	localThrowable2	Throwable
        // Exception table:
        //   from	to	target	type
        //   41	48	51	finally
        //   3	34	96	finally
        //   52	88	96	finally
        //   97	104	107	finally
      }
    }
  }
  
  public static abstract interface c {}
  
  public final class d
  {
    public d() {}
  }
  
  public final class e
    implements Runnable
  {
    public final long a;
    
    public e(long paramLong)
    {
      a = paramLong;
    }
    
    public final void run()
    {
      d2.q localq = new d2.q();
      j.i(localq);
      long l1 = Math.abs(a);
      Object localObject = TimeUnit.SECONDS;
      long l2 = l1 / ((TimeUnit)localObject).toNanos(1L);
      long l3 = Math.abs(a);
      l1 = ((TimeUnit)localObject).toNanos(1L);
      StringBuilder localStringBuilder = f.l("deadline exceeded after ");
      if (a < 0L) {
        localStringBuilder.append('-');
      }
      localStringBuilder.append(l2);
      Locale localLocale = Locale.US;
      localStringBuilder.append(String.format(localLocale, ".%09d", new Object[] { Long.valueOf(l3 % l1) }));
      localStringBuilder.append("s. ");
      localObject = (Long)i.a(h.b);
      double d;
      if (localObject == null) {
        d = 0.0D;
      } else {
        d = ((Long)localObject).longValue() / q.v;
      }
      localStringBuilder.append(String.format(localLocale, "Name resolution delay %.9f seconds. ", new Object[] { Double.valueOf(d) }));
      localStringBuilder.append(localq);
      j.n(e1.h.a(localStringBuilder.toString()));
    }
  }
}

/* Location:
 * Qualified Name:     gb.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */