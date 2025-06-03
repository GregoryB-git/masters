package gb;

import eb.b.a;
import eb.b.b;
import eb.c;
import eb.e1;
import eb.h;
import eb.k;
import eb.s0;
import eb.t0;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

public final class l
  implements v
{
  public final v a;
  public final eb.b b;
  public final Executor c;
  
  public l(v paramv, eb.b paramb, r1.h paramh)
  {
    x6.b.y(paramv, "delegate");
    a = paramv;
    b = paramb;
    c = paramh;
  }
  
  public final x W(SocketAddress paramSocketAddress, v.a parama, d1.f paramf)
  {
    return new a(a.W(paramSocketAddress, parama, paramf), a);
  }
  
  public final void close()
  {
    a.close();
  }
  
  public final ScheduledExecutorService p0()
  {
    return a.p0();
  }
  
  public final Collection<Class<? extends SocketAddress>> y0()
  {
    return a.y0();
  }
  
  public final class a
    extends p0
  {
    public final x a;
    public final AtomicInteger b = new AtomicInteger(-2147483647);
    public volatile e1 c;
    public e1 d;
    public e1 e;
    public final a f = new a();
    
    public a(x paramx, String paramString)
    {
      x6.b.y(paramx, "delegate");
      a = paramx;
      x6.b.y(paramString, "authority");
    }
    
    public static void b(a parama)
    {
      try
      {
        if (b.get() != 0) {
          break label57;
        }
        e1 locale11 = d;
        e1 locale12 = e;
        d = null;
        e = null;
        if (locale11 != null) {
          parama.c(locale11);
        }
        if (locale12 != null) {
          parama.h(locale12);
        }
        label57:
        return;
      }
      finally {}
    }
    
    public final x a()
    {
      return a;
    }
    
    public final void c(e1 parame1)
    {
      x6.b.y(parame1, "status");
      try
      {
        if (b.get() < 0)
        {
          c = parame1;
          b.addAndGet(Integer.MAX_VALUE);
          if (b.get() != 0)
          {
            d = parame1;
            return;
          }
          super.c(parame1);
          return;
        }
        return;
      }
      finally {}
    }
    
    public final s d(t0<?, ?> paramt0, s0 params0, c arg3, h[] paramArrayOfh)
    {
      Object localObject1 = d;
      Object localObject2;
      if (localObject1 == null)
      {
        localObject2 = b;
      }
      else
      {
        eb.b localb = b;
        localObject2 = localObject1;
        if (localb != null) {
          localObject2 = new k(localb, (eb.b)localObject1);
        }
      }
      if (localObject2 != null)
      {
        localObject1 = new k2(a, paramt0, params0, ???, f, paramArrayOfh);
        if (b.incrementAndGet() > 0)
        {
          f.a();
          return new l0(c, paramArrayOfh);
        }
        params0 = new b();
        try
        {
          if (((localObject2 instanceof eb.g0)) && (((eb.g0)localObject2).a()))
          {
            paramt0 = b;
            if (paramt0 != null) {}
          }
          else
          {
            paramt0 = c;
          }
          ((eb.b)localObject2).a(params0, paramt0, (b.a)localObject1);
        }
        finally
        {
          ((k2)localObject1).b(e1.j.g("Credentials should use fail() instead of throwing exceptions").f(paramt0));
        }
        synchronized (h)
        {
          params0 = i;
          paramt0 = params0;
          if (params0 == null)
          {
            paramt0 = new gb/g0;
            paramt0.<init>();
            k = paramt0;
            i = paramt0;
          }
          return paramt0;
        }
      }
      if (b.get() >= 0) {
        return new l0(c, paramArrayOfh);
      }
      return a.d(paramt0, params0, ???, paramArrayOfh);
    }
    
    public final void h(e1 parame1)
    {
      x6.b.y(parame1, "status");
      try
      {
        if (b.get() < 0)
        {
          c = parame1;
          b.addAndGet(Integer.MAX_VALUE);
        }
        else if (e != null)
        {
          return;
        }
        if (b.get() != 0)
        {
          e = parame1;
          return;
        }
        super.h(parame1);
        return;
      }
      finally {}
    }
    
    public final class a
      implements k2.a
    {
      public a() {}
      
      public final void a()
      {
        if (b.decrementAndGet() == 0) {
          l.a.b(l.a.this);
        }
      }
    }
    
    public final class b
      extends b.b
    {}
  }
}

/* Location:
 * Qualified Name:     gb.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */