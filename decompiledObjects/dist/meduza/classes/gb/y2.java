package gb;

import eb.e1;
import eb.g1;
import eb.h;
import eb.h.a;
import eb.h.b;
import eb.h1;
import eb.l;
import eb.s0;
import eb.s0.a;
import eb.s0.b;
import eb.s0.d;
import eb.t0;
import eb.t0.b;
import java.io.Closeable;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import x6.b;

public abstract class y2<ReqT>
  implements s
{
  public static final s0.b A;
  public static final s0.b B;
  public static final e1 C = e1.f.g("Stream thrown away because RetriableStream committed");
  public static Random D = new Random();
  public final t0<ReqT, ?> a;
  public final Executor b;
  public final h1 c = new h1(new a());
  public final ScheduledExecutorService d;
  public final s0 e;
  public final a3 f;
  public final x0 g;
  public final boolean h;
  public final Object i = new Object();
  public final s j;
  public final long k;
  public final long l;
  public final b0 m;
  public final d2.q n = new d2.q();
  public volatile y o = new y(new ArrayList(8), Collections.emptyList(), null, null, false, false, false, 0);
  public final AtomicBoolean p = new AtomicBoolean();
  public final AtomicInteger q = new AtomicInteger();
  public final AtomicInteger r = new AtomicInteger();
  public w s;
  public long t;
  public t u;
  public t v;
  public t w;
  public long x;
  public e1 y;
  public boolean z;
  
  static
  {
    s0.a locala = s0.d;
    BitSet localBitSet = s0.d.d;
    A = new s0.b("grpc-previous-rpc-attempts", locala);
    B = new s0.b("grpc-retry-pushback-ms", locala);
  }
  
  public y2(t0<ReqT, ?> paramt0, s0 params0, s params, long paramLong1, long paramLong2, Executor paramExecutor, ScheduledExecutorService paramScheduledExecutorService, a3 parama3, x0 paramx0, b0 paramb0)
  {
    a = paramt0;
    j = params;
    k = paramLong1;
    l = paramLong2;
    b = paramExecutor;
    d = paramScheduledExecutorService;
    e = params0;
    f = parama3;
    if (parama3 != null) {
      x = b;
    }
    g = paramx0;
    boolean bool1 = false;
    if ((parama3 != null) && (paramx0 != null)) {
      bool2 = false;
    } else {
      bool2 = true;
    }
    b.s("Should not provide both retryPolicy and hedgingPolicy", bool2);
    boolean bool2 = bool1;
    if (paramx0 != null) {
      bool2 = true;
    }
    h = bool2;
    m = paramb0;
  }
  
  public static void c(y2 paramy2, Integer paramInteger)
  {
    paramy2.getClass();
    if (paramInteger != null) {
      if (paramInteger.intValue() < 0) {
        paramy2.u();
      }
    }
    synchronized (i)
    {
      Object localObject2 = w;
      if (localObject2 != null)
      {
        c = true;
        localObject2 = b;
        t localt = new gb/y2$t;
        localt.<init>(i);
        w = localt;
        if (localObject2 != null) {
          ((Future)localObject2).cancel(false);
        }
        localt.a(d.schedule(new u(localt), paramInteger.intValue(), TimeUnit.MILLISECONDS));
      }
      return;
    }
  }
  
  public final void A(final ReqT paramReqT)
  {
    y localy = o;
    if (a)
    {
      f.a.d(a.d.b(paramReqT));
      return;
    }
    s(new m(paramReqT));
  }
  
  public final void a(l paraml)
  {
    s(new c(paraml));
  }
  
  public final boolean b()
  {
    Iterator localIterator = o.c.iterator();
    while (localIterator.hasNext()) {
      if (nexta.b()) {
        return true;
      }
    }
    return false;
  }
  
  public final void d(InputStream paramInputStream)
  {
    throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
  }
  
  public final void e()
  {
    s(new k());
  }
  
  public final void f(int paramInt)
  {
    y localy = o;
    if (a)
    {
      f.a.f(paramInt);
      return;
    }
    s(new l(paramInt));
  }
  
  public final void flush()
  {
    y localy = o;
    if (a)
    {
      f.a.flush();
      return;
    }
    s(new f());
  }
  
  public final void g(int paramInt)
  {
    s(new i(paramInt));
  }
  
  public final void h(int paramInt)
  {
    s(new j(paramInt));
  }
  
  public final void i(d2.q paramq)
  {
    synchronized (i)
    {
      paramq.f(n, "closed");
      Object localObject2 = o;
      if (f != null)
      {
        ??? = new d2.q();
        f.a.i((d2.q)???);
        localObject2 = "committed";
      }
      else
      {
        ??? = new d2.q();
        localObject2 = c.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          a0 locala0 = (a0)((Iterator)localObject2).next();
          d2.q localq = new d2.q();
          a.i(localq);
          ((d2.q)???).e(localq);
        }
        localObject2 = "open";
      }
      paramq.f(???, (String)localObject2);
      return;
    }
  }
  
  public final void j(eb.q paramq)
  {
    s(new d(paramq));
  }
  
  public final void k(String paramString)
  {
    s(new b(paramString));
  }
  
  public final void l(t arg1)
  {
    u = ???;
    ??? = y();
    if (??? != null)
    {
      n(???);
      return;
    }
    synchronized (i)
    {
      ??? = o.b;
      x localx = new gb/y2$x;
      localx.<init>(this);
      ((List)???).add(localx);
      int i1 = 0;
      a0 locala0 = r(0, false);
      if (locala0 == null) {
        return;
      }
      if (h)
      {
        localx = null;
        synchronized (i)
        {
          o = o.a(locala0);
          ??? = localx;
          if (!v(o)) {
            break label170;
          }
          ??? = m;
          if (??? != null)
          {
            if (d.get() > b) {
              i1 = 1;
            }
            ??? = localx;
            if (i1 == 0) {
              break label170;
            }
          }
        }
        ??? = new gb/y2$t;
        ???.<init>(i);
        w = ???;
        label170:
        if (??? != null)
        {
          ???.a(d.schedule(new u(???), g.b, TimeUnit.NANOSECONDS));
          break label215;
          throw ???;
        }
      }
      label215:
      t(locala0);
      return;
    }
  }
  
  public final void m()
  {
    s(new h());
  }
  
  public final void n(e1 parame1)
  {
    ??? = new a0(0);
    a = new l2();
    Object localObject2 = q((a0)???);
    if (localObject2 != null) {
      synchronized (i)
      {
        o = o.e((a0)???);
        ((z2)localObject2).run();
        z(parame1, t.a.a, new s0());
        return;
      }
    }
    ??? = null;
    synchronized (i)
    {
      if (o.c.contains(o.f)) {
        ??? = o.f;
      } else {
        y = parame1;
      }
      localObject2 = o;
      y localy = new gb/y2$y;
      localy.<init>(b, c, d, f, true, a, h, e);
      o = localy;
      if (??? != null) {
        a.n(parame1);
      }
      return;
    }
  }
  
  public final void o(eb.s params)
  {
    s(new e(params));
  }
  
  public final void p(boolean paramBoolean)
  {
    s(new g(paramBoolean));
  }
  
  public final z2 q(a0 parama0)
  {
    synchronized (i)
    {
      if (o.f != null) {
        return null;
      }
      Collection localCollection = o.c;
      Object localObject2 = o;
      Object localObject3 = f;
      boolean bool1 = false;
      boolean bool2;
      if (localObject3 == null) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      b.I(bool2, "Already committed");
      Object localObject4 = b;
      if (c.contains(parama0))
      {
        localObject3 = Collections.singleton(parama0);
        localObject4 = null;
        bool2 = true;
      }
      else
      {
        localObject3 = Collections.emptyList();
        bool2 = bool1;
      }
      y localy = new gb/y2$y;
      localy.<init>((List)localObject4, (Collection)localObject3, d, parama0, g, bool2, h, e);
      o = localy;
      localObject3 = j;
      long l1 = -t;
      a.addAndGet(l1);
      localObject3 = v;
      if (localObject3 != null)
      {
        c = true;
        localObject3 = b;
        v = null;
      }
      else
      {
        localObject3 = null;
      }
      localObject4 = w;
      if (localObject4 != null)
      {
        c = true;
        localObject4 = b;
        w = null;
      }
      else
      {
        localObject4 = null;
      }
      localObject2 = new gb/z2;
      ((z2)localObject2).<init>(this, localCollection, parama0, (Future)localObject3, (Future)localObject4);
      return (z2)localObject2;
    }
  }
  
  public final a0 r(int paramInt, boolean paramBoolean)
  {
    int i1;
    do
    {
      i1 = r.get();
      if (i1 < 0) {
        return null;
      }
    } while (!r.compareAndSet(i1, i1 + 1));
    a0 locala0 = new a0(paramInt);
    n localn = new n(new r(locala0));
    s0 locals01 = e;
    s0 locals02 = new s0();
    locals02.d(locals01);
    if (paramInt > 0) {
      locals02.f(A, String.valueOf(paramInt));
    }
    a = w(locals02, localn, paramInt, paramBoolean);
    return locala0;
  }
  
  public final void s(q paramq)
  {
    synchronized (i)
    {
      if (!o.a) {
        o.b.add(paramq);
      }
      Collection localCollection = o.c;
      ??? = localCollection.iterator();
      while (((Iterator)???).hasNext()) {
        paramq.a((a0)((Iterator)???).next());
      }
      return;
    }
  }
  
  public final void t(a0 parama0)
  {
    Object localObject1 = null;
    int i1 = 0;
    Object localObject2 = null;
    int i2 = 0;
    synchronized (i)
    {
      Object localObject4 = o;
      a0 locala0 = f;
      if ((locala0 != null) && (locala0 != parama0))
      {
        localObject2 = localObject1;
      }
      else if (g)
      {
        localObject2 = localObject1;
      }
      else
      {
        if (i1 != b.size()) {
          break label187;
        }
        o = ((y)localObject4).e(parama0);
        if (!b()) {
          return;
        }
        localObject2 = new o();
      }
      if (localObject2 != null)
      {
        c.execute((Runnable)localObject2);
        return;
      }
      if (i2 == 0) {
        a.l(new z(parama0));
      }
      localObject2 = a;
      if (o.f == parama0) {
        parama0 = y;
      } else {
        parama0 = C;
      }
      ((s)localObject2).n(parama0);
      return;
      label187:
      if (b) {
        return;
      }
      int i3 = Math.min(i1 + 128, b.size());
      if (localObject2 == null)
      {
        localObject2 = new java/util/ArrayList;
        ((ArrayList)localObject2).<init>(b.subList(i1, i3));
      }
      else
      {
        ((List)localObject2).clear();
        ((List)localObject2).addAll(b.subList(i1, i3));
      }
      ??? = ((List)localObject2).iterator();
      i1 = i2;
      do
      {
        i2 = i1;
        if (!((Iterator)???).hasNext()) {
          break;
        }
        localObject4 = (q)((Iterator)???).next();
        ((q)localObject4).a(parama0);
        i2 = i1;
        if ((localObject4 instanceof x)) {
          i2 = 1;
        }
        localObject4 = o;
        locala0 = f;
        if ((locala0 != null) && (locala0 != parama0)) {
          break;
        }
        i1 = i2;
      } while (!g);
      i1 = i3;
    }
  }
  
  public final void u()
  {
    synchronized (i)
    {
      Object localObject2 = w;
      Future localFuture = null;
      if (localObject2 != null)
      {
        c = true;
        localFuture = b;
        w = null;
      }
      localObject2 = o;
      if (!h) {
        localObject2 = new y(b, c, d, f, g, a, true, e);
      }
      o = ((y)localObject2);
      if (localFuture != null) {
        localFuture.cancel(false);
      }
      return;
    }
  }
  
  public final boolean v(y paramy)
  {
    boolean bool;
    if ((f == null) && (e < g.a) && (!h)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public abstract s w(s0 params0, n paramn, int paramInt, boolean paramBoolean);
  
  public abstract void x();
  
  public abstract e1 y();
  
  public final void z(final e1 parame1, final t.a parama, final s0 params0)
  {
    s = new w(parame1, parama, params0);
    if (r.addAndGet(Integer.MIN_VALUE) == Integer.MIN_VALUE) {
      c.execute(new p(parame1, parama, params0));
    }
  }
  
  public final class a
    implements Thread.UncaughtExceptionHandler
  {
    public final void uncaughtException(Thread paramThread, Throwable paramThrowable)
    {
      throw new g1(e1.d(paramThrowable).g("Uncaught exception in the SynchronizationContext. Re-thrown."));
    }
  }
  
  public static final class a0
  {
    public s a;
    public boolean b;
    public boolean c;
    public final int d;
    
    public a0(int paramInt)
    {
      d = paramInt;
    }
  }
  
  public final class b
    implements y2.q
  {
    public b() {}
    
    public final void a(y2.a0 parama0)
    {
      a.k(y2.this);
    }
  }
  
  public static final class b0
  {
    public final int a;
    public final int b;
    public final int c;
    public final AtomicInteger d;
    
    public b0(float paramFloat1, float paramFloat2)
    {
      AtomicInteger localAtomicInteger = new AtomicInteger();
      d = localAtomicInteger;
      c = ((int)(paramFloat2 * 1000.0F));
      int i = (int)(paramFloat1 * 1000.0F);
      a = i;
      b = (i / 2);
      localAtomicInteger.set(i);
    }
    
    public final boolean a()
    {
      int i;
      boolean bool;
      int j;
      do
      {
        i = d.get();
        bool = false;
        if (i == 0) {
          return false;
        }
        j = i - 1000;
      } while (!d.compareAndSet(i, Math.max(j, 0)));
      if (j > b) {
        bool = true;
      }
      return bool;
    }
    
    public final boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof b0)) {
        return false;
      }
      paramObject = (b0)paramObject;
      if ((a != a) || (c != c)) {
        bool = false;
      }
      return bool;
    }
    
    public final int hashCode()
    {
      return Arrays.hashCode(new Object[] { Integer.valueOf(a), Integer.valueOf(c) });
    }
  }
  
  public final class c
    implements y2.q
  {
    public c() {}
    
    public final void a(y2.a0 parama0)
    {
      a.a(y2.this);
    }
  }
  
  public final class d
    implements y2.q
  {
    public d() {}
    
    public final void a(y2.a0 parama0)
    {
      a.j(y2.this);
    }
  }
  
  public final class e
    implements y2.q
  {
    public e() {}
    
    public final void a(y2.a0 parama0)
    {
      a.o(y2.this);
    }
  }
  
  public final class f
    implements y2.q
  {
    public final void a(y2.a0 parama0)
    {
      a.flush();
    }
  }
  
  public final class g
    implements y2.q
  {
    public g() {}
    
    public final void a(y2.a0 parama0)
    {
      a.p(a);
    }
  }
  
  public final class h
    implements y2.q
  {
    public final void a(y2.a0 parama0)
    {
      a.m();
    }
  }
  
  public final class i
    implements y2.q
  {
    public i() {}
    
    public final void a(y2.a0 parama0)
    {
      a.g(a);
    }
  }
  
  public final class j
    implements y2.q
  {
    public j() {}
    
    public final void a(y2.a0 parama0)
    {
      a.h(a);
    }
  }
  
  public final class k
    implements y2.q
  {
    public final void a(y2.a0 parama0)
    {
      a.e();
    }
  }
  
  public final class l
    implements y2.q
  {
    public l() {}
    
    public final void a(y2.a0 parama0)
    {
      a.f(a);
    }
  }
  
  public final class m
    implements y2.q
  {
    public final void a(y2.a0 parama0)
    {
      s locals = a;
      t0 localt0 = b.a;
      Object localObject = paramReqT;
      locals.d(d.b(localObject));
      a.flush();
    }
  }
  
  public final class n
    extends h.a
  {
    public n() {}
    
    public final h a(h.b paramb, s0 params0)
    {
      return y2.this;
    }
  }
  
  public final class o
    implements Runnable
  {
    public o() {}
    
    public final void run()
    {
      y2 localy2 = y2.this;
      if (!z) {
        u.c();
      }
    }
  }
  
  public final class p
    implements Runnable
  {
    public p(e1 parame1, t.a parama, s0 params0) {}
    
    public final void run()
    {
      y2 localy2 = y2.this;
      z = true;
      u.d(parame1, parama, params0);
    }
  }
  
  public static abstract interface q
  {
    public abstract void a(y2.a0 parama0);
  }
  
  public final class r
    extends h
  {
    public final y2.a0 c;
    public long d;
    
    public r(y2.a0 parama0)
    {
      c = parama0;
    }
    
    public final void n(long paramLong)
    {
      if (o.f != null) {
        return;
      }
      z2 localz2 = null;
      synchronized (i)
      {
        if (o.f == null)
        {
          Object localObject3 = c;
          if (!b)
          {
            long l = d + paramLong;
            d = l;
            y2 localy2 = y2.this;
            paramLong = t;
            if (l <= paramLong) {
              return;
            }
            if (l > k)
            {
              c = true;
            }
            else
            {
              paramLong = j.a.addAndGet(l - paramLong);
              localObject3 = y2.this;
              t = d;
              if (paramLong > l) {
                c.c = true;
              }
            }
            localObject3 = c;
            if (c) {
              localz2 = q((y2.a0)localObject3);
            }
            if (localz2 != null) {
              localz2.run();
            }
            return;
          }
        }
        return;
      }
    }
  }
  
  public static final class s
  {
    public final AtomicLong a = new AtomicLong();
  }
  
  public static final class t
  {
    public final Object a;
    public Future<?> b;
    public boolean c;
    
    public t(Object paramObject)
    {
      a = paramObject;
    }
    
    public final void a(ScheduledFuture paramScheduledFuture)
    {
      synchronized (a)
      {
        if (!c) {
          b = paramScheduledFuture;
        }
        return;
      }
    }
  }
  
  public final class u
    implements Runnable
  {
    public final y2.t a;
    
    public u(y2.t paramt)
    {
      a = paramt;
    }
    
    public final void run()
    {
      final Object localObject = y2.this;
      localObject = ((y2)localObject).r(o.e, false);
      if (localObject == null) {
        return;
      }
      b.execute(new a((y2.a0)localObject));
    }
    
    public final class a
      implements Runnable
    {
      public a(y2.a0 parama0) {}
      
      public final void run()
      {
        synchronized (y2.this.i)
        {
          localObject2 = y2.u.this;
          boolean bool = a.c;
          Object localObject3 = null;
          localObject6 = null;
          int i = 1;
          j = 1;
          if (bool)
          {
            j = i;
            break label274;
          }
          localObject3 = b;
          o = o.a(localObject);
          localObject3 = y2.this;
          if (!((y2)localObject3).v(o)) {
            break label173;
          }
          localObject3 = m;
          if (localObject3 != null)
          {
            if (d.get() <= b) {
              j = 0;
            }
            if (j == 0) {
              break label173;
            }
          }
        }
        Object localObject6 = y2.this;
        Object localObject5 = new gb/y2$t;
        ((y2.t)localObject5).<init>(i);
        break label264;
        label173:
        Object localObject2 = y2.this;
        localObject5 = o;
        if (!h) {
          localObject5 = new y2.y(b, c, d, f, g, a, true, e);
        }
        o = ((y2.y)localObject5);
        localObject2 = y2.this;
        localObject5 = localObject6;
        localObject6 = localObject2;
        label264:
        w = ((y2.t)localObject5);
        int j = 0;
        label274:
        if (j != 0)
        {
          localObject5 = localObject;
          a.l(new y2.z(y2.this, (y2.a0)localObject5));
          localObjecta.n(e1.f.g("Unneeded hedging"));
          return;
        }
        if (localObject5 != null)
        {
          localObject6 = y2.this;
          ((y2.t)localObject5).a(d.schedule(new y2.u((y2)localObject6, (y2.t)localObject5), g.b, TimeUnit.NANOSECONDS));
        }
        t(localObject);
        return;
        throw ((Throwable)localObject5);
      }
    }
  }
  
  public static final class v
  {
    public final boolean a;
    public final long b;
    
    public v(long paramLong, boolean paramBoolean)
    {
      a = paramBoolean;
      b = paramLong;
    }
  }
  
  public static final class w
  {
    public final e1 a;
    public final t.a b;
    public final s0 c;
    
    public w(e1 parame1, t.a parama, s0 params0)
    {
      a = parame1;
      b = parama;
      c = params0;
    }
  }
  
  public final class x
    implements y2.q
  {
    public x() {}
    
    public final void a(y2.a0 parama0)
    {
      a.l(new y2.z(y2.this, parama0));
    }
  }
  
  public static final class y
  {
    public final boolean a;
    public final List<y2.q> b;
    public final Collection<y2.a0> c;
    public final Collection<y2.a0> d;
    public final int e;
    public final y2.a0 f;
    public final boolean g;
    public final boolean h;
    
    public y(List<y2.q> paramList, Collection<y2.a0> paramCollection1, Collection<y2.a0> paramCollection2, y2.a0 parama0, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt)
    {
      b = paramList;
      b.y(paramCollection1, "drainedSubstreams");
      c = paramCollection1;
      f = parama0;
      d = paramCollection2;
      g = paramBoolean1;
      a = paramBoolean2;
      h = paramBoolean3;
      e = paramInt;
      boolean bool = false;
      if ((paramBoolean2) && (paramList != null)) {
        paramBoolean3 = false;
      } else {
        paramBoolean3 = true;
      }
      b.I(paramBoolean3, "passThrough should imply buffer is null");
      if ((paramBoolean2) && (parama0 == null)) {
        paramBoolean3 = false;
      } else {
        paramBoolean3 = true;
      }
      b.I(paramBoolean3, "passThrough should imply winningSubstream != null");
      if ((paramBoolean2) && ((paramCollection1.size() != 1) || (!paramCollection1.contains(parama0))) && ((paramCollection1.size() != 0) || (!b))) {
        paramBoolean2 = false;
      } else {
        paramBoolean2 = true;
      }
      b.I(paramBoolean2, "passThrough should imply winningSubstream is drained");
      if (paramBoolean1)
      {
        paramBoolean1 = bool;
        if (parama0 == null) {}
      }
      else
      {
        paramBoolean1 = true;
      }
      b.I(paramBoolean1, "cancelled should imply committed");
    }
    
    public final y a(y2.a0 parama0)
    {
      b.I(h ^ true, "hedging frozen");
      boolean bool;
      if (f == null) {
        bool = true;
      } else {
        bool = false;
      }
      b.I(bool, "already committed");
      if (d == null)
      {
        parama0 = Collections.singleton(parama0);
      }
      else
      {
        ArrayList localArrayList = new ArrayList(d);
        localArrayList.add(parama0);
        parama0 = Collections.unmodifiableCollection(localArrayList);
      }
      int i = e;
      return new y(b, c, parama0, f, g, a, h, i + 1);
    }
    
    public final y b(y2.a0 parama0)
    {
      ArrayList localArrayList = new ArrayList(d);
      localArrayList.remove(parama0);
      parama0 = Collections.unmodifiableCollection(localArrayList);
      return new y(b, c, parama0, f, g, a, h, e);
    }
    
    public final y c(y2.a0 parama01, y2.a0 parama02)
    {
      ArrayList localArrayList = new ArrayList(d);
      localArrayList.remove(parama01);
      localArrayList.add(parama02);
      parama01 = Collections.unmodifiableCollection(localArrayList);
      return new y(b, c, parama01, f, g, a, h, e);
    }
    
    public final y d(y2.a0 parama0)
    {
      b = true;
      if (c.contains(parama0))
      {
        ArrayList localArrayList = new ArrayList(c);
        localArrayList.remove(parama0);
        parama0 = Collections.unmodifiableCollection(localArrayList);
        return new y(b, parama0, d, f, g, a, h, e);
      }
      return this;
    }
    
    public final y e(y2.a0 parama0)
    {
      boolean bool1 = a;
      boolean bool2 = true;
      b.I(bool1 ^ true, "Already passThrough");
      Object localObject;
      if (b) {
        localObject = c;
      }
      for (;;)
      {
        break;
        if (c.isEmpty())
        {
          localObject = Collections.singletonList(parama0);
        }
        else
        {
          localObject = new ArrayList(c);
          ((ArrayList)localObject).add(parama0);
          localObject = Collections.unmodifiableCollection((Collection)localObject);
        }
      }
      y2.a0 locala0 = f;
      if (locala0 != null) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      List localList = b;
      if (bool1)
      {
        if (locala0 != parama0) {
          bool2 = false;
        }
        b.I(bool2, "Another RPC attempt has already committed");
        localList = null;
      }
      return new y(localList, (Collection)localObject, d, f, g, bool1, h, e);
    }
  }
  
  public final class z
    implements t
  {
    public final y2.a0 a;
    
    public z(y2.a0 parama0)
    {
      a = parama0;
    }
    
    public final void a(final n3.a parama)
    {
      Object localObject = o;
      boolean bool;
      if (f != null) {
        bool = true;
      } else {
        bool = false;
      }
      b.I(bool, "Headers should be received prior to messages.");
      if (f != a)
      {
        localObject = v0.a;
        for (;;)
        {
          localObject = parama.next();
          if (localObject == null) {
            break;
          }
          v0.b((Closeable)localObject);
        }
        return;
      }
      c.execute(new e(parama));
    }
    
    public final void b(final s0 params0)
    {
      if (a.d > 0)
      {
        localObject1 = y2.A;
        params0.a((s0.d)localObject1);
        params0.f((s0.d)localObject1, String.valueOf(a.d));
      }
      Object localObject1 = y2.this;
      Object localObject2 = a;
      s0.b localb = y2.A;
      localObject2 = ((y2)localObject1).q((y2.a0)localObject2);
      if (localObject2 != null) {
        b.execute((Runnable)localObject2);
      }
      if (o.f == a)
      {
        localObject1 = m;
        if (localObject1 != null)
        {
          int i;
          int j;
          int k;
          do
          {
            i = d.get();
            j = a;
            if (i == j) {
              break;
            }
            k = c;
          } while (!d.compareAndSet(i, Math.min(k + i, j)));
        }
        c.execute(new a(params0));
      }
    }
    
    public final void c()
    {
      if (!b()) {
        return;
      }
      c.execute(new f());
    }
    
    public final void d(e1 arg1, t.a arg2, final s0 params0)
    {
      Object localObject3;
      synchronized (i)
      {
        Object localObject4 = y2.this;
        o = o.d(a);
        n.e(a);
        if (r.decrementAndGet() == Integer.MIN_VALUE)
        {
          c.execute(new c());
          return;
        }
        localObject4 = a;
        if (c)
        {
          ??? = y2.this;
          localObject4 = ((y2)???).q((y2.a0)localObject4);
          if (localObject4 != null) {
            b.execute((Runnable)localObject4);
          }
          if (o.f == a) {
            z(???, ???, params0);
          }
          return;
        }
        ??? = t.a.d;
        if ((??? == ???) && (q.incrementAndGet() > 1000))
        {
          localObject4 = y2.this;
          ??? = ((y2)localObject4).q(a);
          if (??? != null) {
            b.execute((Runnable)???);
          }
          if (o.f == a)
          {
            ??? = e1.m.g("Too many transparent retries. Might be a bug in gRPC").f(new g1(???));
            z(???, ???, params0);
          }
          return;
        }
        if (o.f == null)
        {
          boolean bool1 = true;
          if ((??? != ???) && ((??? != t.a.b) || (!p.compareAndSet(false, true))))
          {
            if (??? == t.a.c)
            {
              ??? = y2.this;
              if (h) {
                ((y2)???).u();
              }
            }
            else
            {
              p.set(true);
              Object localObject5 = y2.this;
              boolean bool2 = h;
              ??? = null;
              localObject4 = null;
              boolean bool4;
              if (bool2)
              {
                localObject5 = (String)params0.c(y2.B);
                ??? = localObject4;
                if (localObject5 != null) {
                  try
                  {
                    ??? = Integer.valueOf((String)localObject5);
                  }
                  catch (NumberFormatException localNumberFormatException1)
                  {
                    ??? = Integer.valueOf(-1);
                  }
                }
                boolean bool3 = g.c.contains(a) ^ true;
                if ((m != null) && ((!bool3) || ((??? != null) && (((Integer)???).intValue() < 0)))) {
                  bool4 = m.a() ^ true;
                } else {
                  bool4 = false;
                }
                localObject4 = ???;
                if (!bool3)
                {
                  localObject4 = ???;
                  if (!bool4)
                  {
                    localObject4 = ???;
                    if (!???.e())
                    {
                      localObject4 = ???;
                      if (??? != null)
                      {
                        localObject4 = ???;
                        if (((Integer)???).intValue() > 0) {
                          localObject4 = Integer.valueOf(0);
                        }
                      }
                    }
                  }
                }
                if ((!bool3) && (!bool4)) {
                  bool4 = bool1;
                } else {
                  bool4 = false;
                }
                if (bool4) {
                  y2.c(y2.this, (Integer)localObject4);
                }
                synchronized (i)
                {
                  localObject4 = y2.this;
                  o = o.b(a);
                  if (bool4)
                  {
                    localObject4 = y2.this;
                    if ((((y2)localObject4).v(o)) || (!o.d.isEmpty())) {
                      return;
                    }
                  }
                }
              }
              localObject4 = f;
              long l1 = 0L;
              if (localObject4 == null)
              {
                ??? = new y2.v(0L, false);
              }
              else
              {
                bool2 = f.contains(a);
                localObject4 = (String)params0.c(y2.B);
                if (localObject4 != null) {
                  try
                  {
                    ??? = Integer.valueOf((String)localObject4);
                  }
                  catch (NumberFormatException localNumberFormatException2)
                  {
                    localObject3 = Integer.valueOf(-1);
                  }
                }
                if ((m != null) && ((bool2) || ((localObject3 != null) && (((Integer)localObject3).intValue() < 0)))) {
                  bool4 = m.a() ^ true;
                } else {
                  bool4 = false;
                }
                localObject4 = y2.this;
                if ((f.a > a.d + 1) && (!bool4))
                {
                  long l2;
                  if (localObject3 == null)
                  {
                    if (!bool2) {
                      break label956;
                    }
                    double d = x;
                    l1 = (y2.D.nextDouble() * d);
                    localObject3 = y2.this;
                    d = x;
                    localObject4 = f;
                    l2 = Math.min((d * d), c);
                  }
                  else
                  {
                    if (((Integer)localObject3).intValue() < 0) {
                      break label956;
                    }
                    l1 = TimeUnit.MILLISECONDS.toNanos(((Integer)localObject3).intValue());
                    localObject3 = y2.this;
                    l2 = f.b;
                  }
                  x = l2;
                  bool2 = true;
                  break label959;
                }
                label956:
                bool2 = false;
                label959:
                localObject3 = new y2.v(l1, bool2);
              }
              if (a)
              {
                params0 = r(a.d + 1, false);
                if (params0 == null) {
                  return;
                }
                synchronized (i)
                {
                  ??? = y2.this;
                  localObject4 = new gb/y2$t;
                  ((y2.t)localObject4).<init>(i);
                  v = ((y2.t)localObject4);
                  ((y2.t)localObject4).a(d.schedule(new b(params0), b, TimeUnit.NANOSECONDS));
                  return;
                }
              }
            }
          }
          else
          {
            ??? = r(a.d, true);
            if (??? == null) {
              return;
            }
            ??? = y2.this;
            if (h) {
              synchronized (i)
              {
                params0 = y2.this;
                o = o.c(a, ???);
              }
            }
            b.execute(new d(???));
            return;
          }
        }
        localObject4 = y2.this;
        localObject3 = ((y2)localObject4).q(a);
        if (localObject3 != null) {
          b.execute((Runnable)localObject3);
        }
        if (o.f == a) {
          z(???, ???, params0);
        }
        return;
      }
    }
    
    public final class a
      implements Runnable
    {
      public a(s0 params0) {}
      
      public final void run()
      {
        u.b(params0);
      }
    }
    
    public final class b
      implements Runnable
    {
      public final void run()
      {
        b.b.b.execute(new a());
      }
      
      public final class a
        implements Runnable
      {
        public a() {}
        
        public final void run()
        {
          Object localObject = y2.z.b.this;
          y2 localy2 = b.b;
          y2.a0 locala0 = a;
          localObject = y2.A;
          localy2.t(locala0);
        }
      }
    }
    
    public final class c
      implements Runnable
    {
      public c() {}
      
      public final void run()
      {
        Object localObject = y2.this;
        z = true;
        t localt = u;
        localObject = s;
        localt.d(a, b, c);
      }
    }
    
    public final class d
      implements Runnable
    {
      public d(y2.a0 parama0) {}
      
      public final void run()
      {
        y2 localy2 = y2.this;
        y2.a0 locala0 = parame1;
        s0.b localb = y2.A;
        localy2.t(locala0);
      }
    }
    
    public final class e
      implements Runnable
    {
      public e(n3.a parama) {}
      
      public final void run()
      {
        u.a(parama);
      }
    }
    
    public final class f
      implements Runnable
    {
      public f() {}
      
      public final void run()
      {
        y2 localy2 = y2.this;
        if (!z) {
          u.c();
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     gb.y2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */