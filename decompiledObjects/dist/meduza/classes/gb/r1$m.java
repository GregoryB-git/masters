package gb;

import e9.a;
import eb.c;
import eb.c.b;
import eb.e;
import eb.e.a;
import eb.h;
import eb.h1;
import eb.p;
import eb.s0;
import eb.t0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import x6.b;

public final class r1$m
  extends a
{
  public final AtomicReference<eb.d0> b = new AtomicReference(r1.k0);
  public final String c;
  public final a d = new a();
  
  public r1$m(r1 paramr1, String paramString)
  {
    b.y(paramString, "authority");
    c = paramString;
  }
  
  public final <ReqT, RespT> e<ReqT, RespT> C(t0<ReqT, RespT> paramt0, c paramc)
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
    return new r1.f((eb.d0)localObject1, d, e.i, paramt0, paramc);
  }
  
  public final void D(eb.d0 paramd0)
  {
    eb.d0 locald0 = (eb.d0)b.get();
    b.set(paramd0);
    if (locald0 == r1.k0)
    {
      paramd0 = e.C;
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
  
  public final <ReqT, RespT> e<ReqT, RespT> v(final t0<ReqT, RespT> paramt0, c paramc)
  {
    Object localObject = b.get();
    r1.a locala = r1.k0;
    if (localObject != locala) {
      return C(paramt0, paramc);
    }
    e.n.execute(new b());
    if (b.get() != locala) {
      return C(paramt0, paramc);
    }
    if (e.H.get()) {
      return new c();
    }
    paramt0 = new e(p.b(), paramt0, paramc);
    e.n.execute(new d(paramt0));
    return paramt0;
  }
  
  public final class a
    extends a
  {
    public a() {}
    
    public final String b()
    {
      return c;
    }
    
    public final <RequestT, ResponseT> e<RequestT, ResponseT> v(t0<RequestT, ResponseT> paramt0, c paramc)
    {
      Object localObject1 = e;
      Object localObject2 = r1.e0;
      localObject1.getClass();
      localObject2 = b;
      if (localObject2 == null) {
        localObject2 = i;
      }
      localObject1 = e;
      r1.e locale = c0;
      if (K) {
        localObject1 = null;
      } else {
        localObject1 = e.g.p0();
      }
      paramt0 = new q(paramt0, (Executor)localObject2, paramc, locale, (ScheduledExecutorService)localObject1, e.N);
      e.getClass();
      q = false;
      paramc = e;
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
      e.M();
    }
  }
  
  public final class c
    extends e<ReqT, RespT>
  {
    public final void a(String paramString, Throwable paramThrowable) {}
    
    public final void b() {}
    
    public final void c(int paramInt) {}
    
    public final void d(ReqT paramReqT) {}
    
    public final void e(e.a<RespT> parama, s0 params0)
    {
      params0 = r1.h0;
      parama.a(new s0(), params0);
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
        r1 localr1 = e;
        if (C == null)
        {
          C = new LinkedHashSet();
          localr1 = e;
          b0.c(D, true);
        }
        e.C.add(paramt0);
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
    public final p k;
    public final t0<ReqT, RespT> l;
    public final c m;
    public final long n;
    
    public e(t0<ReqT, RespT> paramt0, c paramc)
    {
      super(e.h, a);
      k = paramt0;
      l = paramc;
      m = localc;
      e.a0.getClass();
      n = System.nanoTime();
    }
    
    public final void f()
    {
      e.n.execute(new b());
    }
    
    public final void j()
    {
      Object localObject1 = k.a();
      try
      {
        Object localObject3 = m;
        Object localObject5 = h.b;
        e.a0.getClass();
        localObject3 = ((c)localObject3).c((c.b)localObject5, Long.valueOf(System.nanoTime() - n));
        localObject3 = C(l, (c)localObject3);
        k.c((p)localObject1);
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
        f = ((e)localObject3);
        localb0 = new b0(this, c);
        label152:
        if (localb0 == null)
        {
          e.n.execute(new b());
        }
        else
        {
          r1 localr1 = e;
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
          if (e.C.isEmpty())
          {
            localObject = e;
            b0.c(D, false);
            localObject = e;
            C = null;
            if (H.get()) {
              e.G.a(r1.h0);
            }
          }
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     gb.r1.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */