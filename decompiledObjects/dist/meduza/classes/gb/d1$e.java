package gb;

import eb.a;
import eb.c0;
import eb.d;
import eb.d.a;
import eb.e0;
import eb.f0;
import eb.h1;
import eb.i;
import eb.n;
import eb.o;
import eb.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import n7.p;
import x6.b;

public final class d1$e
  implements h2.a
{
  public final x a;
  public boolean b = false;
  
  public d1$e(d1 paramd1, d1.b paramb)
  {
    a = paramb;
  }
  
  public final void a(final eb.e1 parame1)
  {
    d locald = c.j;
    d.a locala = d.a.b;
    f0 localf0 = a.f();
    c.getClass();
    locald.b(locala, "{0} SHUTDOWN with {1}", new Object[] { localf0, d1.k(parame1) });
    b = true;
    c.l.execute(new b(parame1));
  }
  
  public final void b()
  {
    c.j.a(d.a.b, "READY");
    c.l.execute(new a());
  }
  
  public final a c(a parama)
  {
    Iterator localIterator = c.k.iterator();
    while (localIterator.hasNext())
    {
      i locali = (i)localIterator.next();
      locali.getClass();
      b.z("Filter %s returned null", parama, locali);
    }
    return parama;
  }
  
  public final void d()
  {
    b.I(b, "transportShutdown() must be called before transportTerminated().");
    c.j.b(d.a.b, "{0} Terminated", new Object[] { a.f() });
    Object localObject1 = c.h;
    Object localObject2 = a;
    c0.b(c, (e0)localObject2);
    localObject2 = c;
    localObject1 = a;
    l.execute(new j1((d1)localObject2, (x)localObject1, false));
    localObject1 = c.k.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (i)((Iterator)localObject1).next();
      a.getAttributes();
      localObject2.getClass();
    }
    c.l.execute(new c());
  }
  
  public final void e(boolean paramBoolean)
  {
    d1 locald1 = c;
    x localx = a;
    l.execute(new j1(locald1, localx, paramBoolean));
  }
  
  public final class a
    implements Runnable
  {
    public a() {}
    
    public final void run()
    {
      Object localObject1 = d1.e.this;
      d1 locald1 = c;
      o = null;
      Object localObject2;
      if (y != null)
      {
        boolean bool;
        if (w == null) {
          bool = true;
        } else {
          bool = false;
        }
        b.I(bool, "Unexpected non-null activeTransport");
        localObject2 = d1.e.this;
        a.c(c.y);
      }
      else
      {
        localObject2 = v;
        localObject1 = a;
        if (localObject2 == localObject1)
        {
          w = ((h2)localObject1);
          localObject2 = c;
          v = null;
          d1.b((d1)localObject2, n.b);
        }
      }
    }
  }
  
  public final class b
    implements Runnable
  {
    public b(eb.e1 parame1) {}
    
    public final void run()
    {
      if (c.x.a == n.e) {
        return;
      }
      Object localObject1 = c.w;
      Object localObject2 = d1.e.this;
      Object localObject3 = a;
      if (localObject1 == localObject3)
      {
        c.w = null;
        c.m.a();
        d1.b(c, n.d);
      }
      else
      {
        localObject1 = c;
        if (v == localObject3)
        {
          localObject1 = x.a;
          localObject3 = n.a;
          boolean bool1 = false;
          boolean bool2;
          if (localObject1 == localObject3) {
            bool2 = true;
          } else {
            bool2 = false;
          }
          b.G(c.x.a, "Expected state is CONNECTING, actual state is %s", bool2);
          localObject1 = c.m;
          localObject3 = (u)a.get(b);
          int i = c + 1;
          c = i;
          if (i >= a.size())
          {
            b += 1;
            c = 0;
          }
          localObject3 = c.m;
          if (b < a.size()) {
            i = 1;
          } else {
            i = 0;
          }
          if (i == 0)
          {
            localObject3 = c;
            v = null;
            m.a();
            localObject3 = c;
            localObject1 = parame1;
            l.d();
            b.s("The error status must not be OK", ((eb.e1)localObject1).e() ^ true);
            ((d1)localObject3).j(new o(n.c, (eb.e1)localObject1));
            if (o == null)
            {
              ((k0.a)d).getClass();
              o = new k0();
            }
            long l = ((k0)o).a();
            p localp = p;
            localObject2 = TimeUnit.NANOSECONDS;
            l -= localp.a((TimeUnit)localObject2);
            j.b(d.a.b, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", new Object[] { d1.k((eb.e1)localObject1), Long.valueOf(l) });
            bool2 = bool1;
            if (q == null) {
              bool2 = true;
            }
            b.I(bool2, "previous reconnectTask is not done");
            q = l.c(new e1((d1)localObject3), l, (TimeUnit)localObject2, g);
          }
          else
          {
            d1.i(c);
          }
        }
      }
    }
  }
  
  public final class c
    implements Runnable
  {
    public c() {}
    
    public final void run()
    {
      Object localObject = d1.e.this;
      c.t.remove(a);
      if ((c.x.a == n.e) && (c.t.isEmpty()))
      {
        localObject = c;
        l.execute(new i1((d1)localObject));
      }
    }
  }
}

/* Location:
 * Qualified Name:     gb.d1.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */