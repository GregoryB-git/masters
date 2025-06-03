package gb;

import eb.a;
import eb.a0;
import eb.c;
import eb.c0;
import eb.d;
import eb.d.a;
import eb.e0;
import eb.f0;
import eb.h;
import eb.h1;
import eb.h1.c;
import eb.i;
import eb.k0.k;
import eb.o;
import eb.s0;
import eb.t0;
import java.net.SocketAddress;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import n7.g;
import n7.g.a;
import n7.q;
import x6.b;

public final class d1
  implements e0<Object>, q3
{
  public final f0 a;
  public final String b;
  public final String c;
  public final j.a d;
  public final c e;
  public final v f;
  public final ScheduledExecutorService g;
  public final c0 h;
  public final m i;
  public final d j;
  public final List<i> k;
  public final h1 l;
  public final d m;
  public volatile List<eb.u> n;
  public j o;
  public final n7.p p;
  public h1.c q;
  public h1.c r;
  public h2 s;
  public final ArrayList t = new ArrayList();
  public final a u = new a();
  public x v;
  public volatile h2 w;
  public volatile o x = o.a(eb.n.d);
  public eb.e1 y;
  
  public d1(List paramList, String paramString, j.a parama, l paraml, ScheduledExecutorService paramScheduledExecutorService, q paramq, h1 paramh1, r1.o.a parama1, c0 paramc0, m paramm, p paramp, f0 paramf0, n paramn, ArrayList paramArrayList)
  {
    b.y(paramList, "addressGroups");
    b.s("addressGroups is empty", paramList.isEmpty() ^ true);
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext()) {
      b.y(localIterator.next(), "addressGroups contains null entry");
    }
    paramList = Collections.unmodifiableList(new ArrayList(paramList));
    n = paramList;
    m = new d(paramList);
    b = paramString;
    c = null;
    d = parama;
    f = paraml;
    g = paramScheduledExecutorService;
    p = ((n7.p)paramq.get());
    l = paramh1;
    e = parama1;
    h = paramc0;
    i = paramm;
    b.y(paramp, "channelTracer");
    b.y(paramf0, "logId");
    a = paramf0;
    b.y(paramn, "channelLogger");
    j = paramn;
    k = paramArrayList;
  }
  
  public static void b(d1 paramd1, eb.n paramn)
  {
    l.d();
    paramd1.j(o.a(paramn));
  }
  
  public static void i(d1 paramd1)
  {
    l.d();
    if (q == null) {
      bool = true;
    } else {
      bool = false;
    }
    b.I(bool, "Should have no reconnectTask scheduled");
    Object localObject1 = m;
    int i1;
    if ((b == 0) && (c == 0)) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    if (i1 != 0)
    {
      localObject1 = p;
      b = false;
      ((n7.p)localObject1).b();
    }
    localObject1 = m;
    Object localObject2 = (SocketAddress)a.get(b)).a.get(c);
    boolean bool = localObject2 instanceof a0;
    Object localObject3 = null;
    localObject1 = localObject2;
    if (bool)
    {
      localObject3 = (a0)localObject2;
      localObject1 = b;
    }
    localObject2 = m;
    a locala = a.get(b)).b;
    localObject2 = (String)locala.a(eb.u.d);
    v.a locala1 = new v.a();
    if (localObject2 == null) {
      localObject2 = b;
    }
    b.y(localObject2, "authority");
    a = ((String)localObject2);
    b = locala;
    c = c;
    d = ((a0)localObject3);
    localObject3 = new f();
    a = a;
    localObject1 = new b(f.W((SocketAddress)localObject1, locala1, (f)localObject3), i);
    a = ((p0)localObject1).f();
    c0.a(h.c, (e0)localObject1);
    v = ((x)localObject1);
    t.add(localObject1);
    localObject1 = ((p0)localObject1).g(new e((b)localObject1));
    if (localObject1 != null) {
      l.b((Runnable)localObject1);
    }
    j.b(d.a.b, "Started transport {0}", new Object[] { a });
  }
  
  public static String k(eb.e1 parame1)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(a);
    if (b != null)
    {
      localStringBuilder.append("(");
      localStringBuilder.append(b);
      localStringBuilder.append(")");
    }
    if (c != null)
    {
      localStringBuilder.append("[");
      localStringBuilder.append(c);
      localStringBuilder.append("]");
    }
    return localStringBuilder.toString();
  }
  
  public final h2 a()
  {
    h2 localh2 = w;
    if (localh2 != null) {
      return localh2;
    }
    l.execute(new f1(this));
    return null;
  }
  
  public final f0 f()
  {
    return a;
  }
  
  public final void j(o paramo)
  {
    l.d();
    if (x.a != a)
    {
      Object localObject = x.a;
      eb.n localn = eb.n.e;
      boolean bool1 = true;
      boolean bool2;
      if (localObject != localn) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Cannot transition out of SHUTDOWN to ");
      ((StringBuilder)localObject).append(paramo);
      b.I(bool2, ((StringBuilder)localObject).toString());
      x = paramo;
      localObject = (r1.o.a)e;
      if (a != null) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
      b.I(bool2, "listener is null");
      a.a(paramo);
    }
  }
  
  public final String toString()
  {
    g.a locala = g.b(this);
    locala.b("logId", a.c);
    locala.a(n, "addressGroups");
    return locala.toString();
  }
  
  public final class a
    extends c1<x>
  {
    public a() {}
    
    public final void a()
    {
      d1 locald1 = d1.this;
      e).b.j.b0.c(locald1, true);
    }
    
    public final void b()
    {
      d1 locald1 = d1.this;
      e).b.j.b0.c(locald1, false);
    }
  }
  
  public static final class b
    extends p0
  {
    public final x a;
    public final m b;
    
    public b(x paramx, m paramm)
    {
      a = paramx;
      b = paramm;
    }
    
    public final x a()
    {
      return a;
    }
    
    public final s d(t0<?, ?> paramt0, s0 params0, c paramc, h[] paramArrayOfh)
    {
      return new a(a().d(paramt0, params0, paramc, paramArrayOfh));
    }
    
    public final class a
      extends n0
    {
      public a(s params) {}
      
      public final void l(final t paramt)
      {
        m localm = b;
        b.b();
        a.a();
        paramt = new a(paramt);
        a.l(paramt);
      }
      
      public final class a
        extends o0
      {
        public a(t paramt) {}
        
        public final void d(eb.e1 parame1, t.a parama, s0 params0)
        {
          Object localObject = b;
          if (parame1.e()) {
            localObject = c;
          } else {
            localObject = d;
          }
          ((q1)localObject).b();
          paramt.d(parame1, parama, params0);
        }
      }
    }
  }
  
  public static abstract class c {}
  
  public static final class d
  {
    public List<eb.u> a;
    public int b;
    public int c;
    
    public d(List<eb.u> paramList)
    {
      a = paramList;
    }
    
    public final void a()
    {
      b = 0;
      c = 0;
    }
  }
  
  public final class e
    implements h2.a
  {
    public final x a;
    public boolean b = false;
    
    public e(d1.b paramb)
    {
      a = paramb;
    }
    
    public final void a(final eb.e1 parame1)
    {
      d locald = j;
      d.a locala = d.a.b;
      f0 localf0 = a.f();
      getClass();
      locald.b(locala, "{0} SHUTDOWN with {1}", new Object[] { localf0, d1.k(parame1) });
      b = true;
      l.execute(new b(parame1));
    }
    
    public final void b()
    {
      j.a(d.a.b, "READY");
      l.execute(new a());
    }
    
    public final a c(a parama)
    {
      Iterator localIterator = k.iterator();
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
      j.b(d.a.b, "{0} Terminated", new Object[] { a.f() });
      Object localObject1 = h;
      Object localObject2 = a;
      c0.b(c, (e0)localObject2);
      localObject2 = d1.this;
      localObject1 = a;
      l.execute(new j1((d1)localObject2, (x)localObject1, false));
      localObject1 = k.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (i)((Iterator)localObject1).next();
        a.getAttributes();
        localObject2.getClass();
      }
      l.execute(new c());
    }
    
    public final void e(boolean paramBoolean)
    {
      d1 locald1 = d1.this;
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
            localObject2 = d1.this;
            v = null;
            d1.b((d1)localObject2, eb.n.b);
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
        if (x.a == eb.n.e) {
          return;
        }
        Object localObject1 = w;
        Object localObject2 = d1.e.this;
        Object localObject3 = a;
        if (localObject1 == localObject3)
        {
          c.w = null;
          m.a();
          d1.b(d1.this, eb.n.d);
        }
        else
        {
          localObject1 = c;
          if (v == localObject3)
          {
            localObject1 = x.a;
            localObject3 = eb.n.a;
            boolean bool1 = false;
            boolean bool2;
            if (localObject1 == localObject3) {
              bool2 = true;
            } else {
              bool2 = false;
            }
            b.G(x.a, "Expected state is CONNECTING, actual state is %s", bool2);
            localObject1 = m;
            localObject3 = (eb.u)a.get(b);
            int i = c + 1;
            c = i;
            if (i >= a.size())
            {
              b += 1;
              c = 0;
            }
            localObject3 = m;
            if (b < a.size()) {
              i = 1;
            } else {
              i = 0;
            }
            if (i == 0)
            {
              localObject3 = d1.this;
              v = null;
              m.a();
              localObject3 = d1.this;
              localObject1 = parame1;
              l.d();
              b.s("The error status must not be OK", ((eb.e1)localObject1).e() ^ true);
              ((d1)localObject3).j(new o(eb.n.c, (eb.e1)localObject1));
              if (o == null)
              {
                ((k0.a)d).getClass();
                o = new k0();
              }
              long l = ((k0)o).a();
              n7.p localp = p;
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
              d1.i(d1.this);
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
        if ((x.a == eb.n.e) && (t.isEmpty()))
        {
          localObject = d1.this;
          l.execute(new i1((d1)localObject));
        }
      }
    }
  }
  
  public static final class f
    extends d
  {
    public f0 a;
    
    public final void a(d.a parama, String paramString)
    {
      f0 localf0 = a;
      parama = n.c(parama);
      if (p.c.isLoggable(parama)) {
        p.a(localf0, parama, paramString);
      }
    }
    
    public final void b(d.a parama, String paramString, Object... paramVarArgs)
    {
      f0 localf0 = a;
      parama = n.c(parama);
      if (p.c.isLoggable(parama)) {
        p.a(localf0, parama, MessageFormat.format(paramString, paramVarArgs));
      }
    }
  }
}

/* Location:
 * Qualified Name:     gb.d1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */