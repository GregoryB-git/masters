package gb;

import eb.c;
import eb.c.b;
import eb.e;
import eb.h;
import eb.h1;
import eb.p;
import eb.t0;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import x6.b;

public final class r1$m$e<ReqT, RespT>
  extends d0<ReqT, RespT>
{
  public final p k;
  public final t0<ReqT, RespT> l;
  public final c m;
  public final long n;
  
  public r1$m$e(p paramp, t0<ReqT, RespT> paramt0, c paramc)
  {
    super((Executor)localObject, e.h, a);
    k = paramt0;
    l = paramc;
    m = localc;
    e.a0.getClass();
    n = System.nanoTime();
  }
  
  public final void f()
  {
    o.e.n.execute(new b());
  }
  
  public final void j()
  {
    Object localObject1 = k.a();
    try
    {
      Object localObject3 = m;
      Object localObject5 = h.b;
      o.e.a0.getClass();
      localObject3 = ((c)localObject3).c((c.b)localObject5, Long.valueOf(System.nanoTime() - n));
      localObject3 = o.C(l, (c)localObject3);
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
        o.e.n.execute(new b());
      }
      else
      {
        r1 localr1 = o.e;
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
        if (o.e.C.isEmpty())
        {
          localObject = o.e;
          b0.c(D, false);
          localObject = o.e;
          C = null;
          if (H.get()) {
            o.e.G.a(r1.h0);
          }
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     gb.r1.m.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */