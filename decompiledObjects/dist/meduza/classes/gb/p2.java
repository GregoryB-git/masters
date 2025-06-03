package gb;

import b.k;
import eb.e1;
import eb.h1;
import eb.h1.b;
import eb.h1.c;
import eb.k0;
import eb.k0.b;
import eb.k0.b.a;
import eb.k0.d;
import eb.k0.e;
import eb.k0.f;
import eb.k0.g;
import eb.k0.h;
import eb.k0.i;
import eb.k0.j;
import eb.k0.k;
import eb.n;
import eb.o;
import eb.u;
import f;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;
import n7.g.a;
import n7.i;
import o7.c0;
import o7.l0;
import o7.t;
import o7.t.a;
import x6.b;

public final class p2
  extends k0
{
  public static final Logger o = Logger.getLogger(p2.class.getName());
  public final k0.e f;
  public final HashMap g = new HashMap();
  public c h;
  public int i;
  public boolean j;
  public h1.c k;
  public n l;
  public n m;
  public final boolean n;
  
  public p2(k0.e parame)
  {
    boolean bool1 = false;
    i = 0;
    j = true;
    Object localObject = n.d;
    l = ((n)localObject);
    m = ((n)localObject);
    localObject = v0.a;
    String str = System.getenv("GRPC_EXPERIMENTAL_XDS_DUALSTACK_ENDPOINTS");
    localObject = str;
    if (str == null) {
      localObject = System.getProperty("GRPC_EXPERIMENTAL_XDS_DUALSTACK_ENDPOINTS");
    }
    boolean bool2 = bool1;
    if (!i.a((String)localObject))
    {
      bool2 = bool1;
      if (Boolean.parseBoolean((String)localObject)) {
        bool2 = true;
      }
    }
    n = bool2;
    b.y(parame, "helper");
    f = parame;
  }
  
  public final e1 a(k0.h paramh)
  {
    Object localObject1 = n.a;
    n localn = n.b;
    if (l == n.e) {
      return e1.l.g("Already shut down");
    }
    Object localObject2 = a;
    if (((List)localObject2).isEmpty())
    {
      localObject2 = e1.n;
      localObject1 = f.l("NameResolver returned no usable address. addrs=");
      ((StringBuilder)localObject1).append(a);
      ((StringBuilder)localObject1).append(", attrs=");
      ((StringBuilder)localObject1).append(b);
      paramh = ((e1)localObject2).g(((StringBuilder)localObject1).toString());
      c(paramh);
      return paramh;
    }
    Object localObject3 = ((List)localObject2).iterator();
    while (((Iterator)localObject3).hasNext()) {
      if ((u)((Iterator)localObject3).next() == null)
      {
        localObject1 = e1.n;
        localObject2 = f.l("NameResolver returned address list with null endpoint. addrs=");
        ((StringBuilder)localObject2).append(a);
        ((StringBuilder)localObject2).append(", attrs=");
        ((StringBuilder)localObject2).append(b);
        paramh = ((e1)localObject1).g(((StringBuilder)localObject2).toString());
        c(paramh);
        return paramh;
      }
    }
    j = true;
    paramh = c;
    if ((paramh instanceof d)) {
      ((d)paramh).getClass();
    }
    paramh = t.b;
    paramh = new t.a();
    paramh.d((List)localObject2);
    paramh = paramh.e();
    localObject3 = h;
    SocketAddress localSocketAddress;
    if (localObject3 == null)
    {
      h = new c(paramh);
    }
    else if (l == localn)
    {
      localSocketAddress = ((c)localObject3).a();
      localObject3 = h;
      if (paramh != null)
      {
        localObject2 = paramh;
      }
      else
      {
        localObject3.getClass();
        localObject2 = Collections.emptyList();
      }
      a = ((List)localObject2);
      b = 0;
      c = 0;
      if (h.d(localSocketAddress)) {
        return e1.e;
      }
      localObject2 = h;
      b = 0;
      c = 0;
    }
    else
    {
      if (paramh != null) {
        localObject2 = paramh;
      } else {
        localObject2 = Collections.emptyList();
      }
      a = ((List)localObject2);
      b = 0;
      c = 0;
    }
    localObject2 = new HashSet(g.keySet());
    localObject3 = new HashSet();
    paramh = paramh.r(0);
    while (paramh.hasNext()) {
      ((Set)localObject3).addAll(nexta);
    }
    paramh = ((HashSet)localObject2).iterator();
    while (paramh.hasNext())
    {
      localSocketAddress = (SocketAddress)paramh.next();
      if (!((HashSet)localObject3).contains(localSocketAddress)) {
        g.remove(localSocketAddress)).a.g();
      }
    }
    if (((HashSet)localObject2).size() != 0)
    {
      paramh = l;
      if ((paramh != localObject1) && (paramh != localn))
      {
        localObject2 = n.d;
        if (paramh == localObject2)
        {
          i((n)localObject2, new f(this));
          break label599;
        }
        if (paramh != n.c) {
          break label599;
        }
        break label591;
      }
    }
    l = ((n)localObject1);
    i((n)localObject1, new e(k0.f.e));
    label591:
    g();
    e();
    label599:
    return e1.e;
  }
  
  public final void c(e1 parame1)
  {
    Iterator localIterator = g.values().iterator();
    while (localIterator.hasNext()) {
      nexta.g();
    }
    g.clear();
    i(n.c, new e(k0.f.a(parame1)));
  }
  
  public final void e()
  {
    Object localObject1 = h;
    if ((localObject1 != null) && (((c)localObject1).c()) && (l != n.e))
    {
      SocketAddress localSocketAddress = h.a();
      if (g.containsKey(localSocketAddress))
      {
        localObject1 = g.get(localSocketAddress)).a;
      }
      else
      {
        localObject2 = new b();
        Object localObject3 = f;
        localObject1 = new k0.b.a();
        ((k0.b.a)localObject1).b(c0.c(new u[] { new u(localSocketAddress) }));
        ((k0.b.a)localObject1).a((k0.k)localObject2);
        localObject1 = ((k0.e)localObject3).a(new k0.b(a, b, c));
        if (localObject1 == null) {
          break label324;
        }
        localObject3 = new g((k0.i)localObject1, (b)localObject2);
        b = ((g)localObject3);
        g.put(localSocketAddress, localObject3);
        if (((k0.i)localObject1).c().a(k0.d) == null) {
          a = o.a(n.b);
        }
        ((k0.i)localObject1).h(new o2(this, (k0.i)localObject1));
      }
      int i1 = g.get(localSocketAddress)).b.ordinal();
      if (i1 != 0)
      {
        if (i1 != 1)
        {
          if (i1 != 2)
          {
            if (i1 != 3) {
              break label323;
            }
            ((k0.i)localObject1).f();
            g.a((g)g.get(localSocketAddress), n.a);
          }
          else
          {
            h.b();
            e();
            break label323;
          }
        }
        else
        {
          o.warning("Requesting a connection even though we have a READY subchannel");
          break label323;
        }
      }
      else {
        if (!n) {
          break label319;
        }
      }
      h();
      break label323;
      label319:
      ((k0.i)localObject1).f();
      label323:
      return;
      label324:
      localObject1 = o;
      Object localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("Was not able to create subchannel for ");
      ((StringBuilder)localObject2).append(localSocketAddress);
      ((Logger)localObject1).warning(((StringBuilder)localObject2).toString());
      throw new IllegalStateException("Can't create subchannel");
    }
  }
  
  public final void f()
  {
    o.log(Level.FINE, "Shutting down, currently have {} subchannels created", Integer.valueOf(g.size()));
    Object localObject = n.e;
    l = ((n)localObject);
    m = ((n)localObject);
    g();
    localObject = g.values().iterator();
    while (((Iterator)localObject).hasNext()) {
      nexta.g();
    }
    g.clear();
  }
  
  public final void g()
  {
    h1.c localc = k;
    if (localc != null)
    {
      localc.a();
      k = null;
    }
  }
  
  public final void h()
  {
    if (n)
    {
      Object localObject = k;
      if (localObject != null)
      {
        localObject = a;
        int i1;
        if ((!c) && (!b)) {
          i1 = 1;
        } else {
          i1 = 0;
        }
        if (i1 != 0) {}
      }
      else
      {
        k = f.d().c(new a(), 250L, TimeUnit.MILLISECONDS, f.c());
      }
    }
  }
  
  public final void i(n paramn, k0.j paramj)
  {
    if ((paramn == m) && ((paramn == n.d) || (paramn == n.a))) {
      return;
    }
    m = paramn;
    f.f(paramn, paramj);
  }
  
  public final void j(g paramg)
  {
    n localn1 = b;
    n localn2 = n.b;
    if (localn1 != localn2) {
      return;
    }
    o localo = c.a;
    localn1 = a;
    if (localn1 == localn2)
    {
      i(localn2, new k0.d(k0.f.b(a, null)));
    }
    else
    {
      paramg = n.c;
      if (localn1 == paramg) {
        i(paramg, new e(k0.f.a(b)));
      } else if (m != paramg) {
        i(localn1, new e(k0.f.e));
      }
    }
  }
  
  public final class a
    implements Runnable
  {
    public a() {}
    
    public final void run()
    {
      p2 localp2 = p2.this;
      k = null;
      if (h.b()) {
        e();
      }
    }
  }
  
  public final class b
    implements k0.k
  {
    public o a = o.a(n.d);
    public p2.g b;
    
    public b() {}
    
    public final void a(o paramo)
    {
      p2.o.log(Level.FINE, "Received health status {0} for subchannel {1}", new Object[] { paramo, b.a });
      a = paramo;
      if (h.c())
      {
        paramo = p2.this;
        if (g.get(h.a())).c == this) {
          j(b);
        }
      }
    }
  }
  
  public static final class c
  {
    public List<u> a;
    public int b;
    public int c;
    
    public c(l0 paraml0)
    {
      if (paraml0 == null) {
        paraml0 = Collections.emptyList();
      }
      a = paraml0;
    }
    
    public final SocketAddress a()
    {
      if (c()) {
        return (SocketAddress)a.get(b)).a.get(c);
      }
      throw new IllegalStateException("Index is past the end of the address group list");
    }
    
    public final boolean b()
    {
      boolean bool1 = c();
      boolean bool2 = false;
      if (!bool1) {
        return false;
      }
      u localu = (u)a.get(b);
      int i = c + 1;
      c = i;
      if (i >= a.size())
      {
        i = b + 1;
        b = i;
        c = 0;
        if (i < a.size()) {
          bool2 = true;
        }
        return bool2;
      }
      return true;
    }
    
    public final boolean c()
    {
      boolean bool;
      if (b < a.size()) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final boolean d(SocketAddress paramSocketAddress)
    {
      int i = 0;
      while (i < a.size())
      {
        int j = a.get(i)).a.indexOf(paramSocketAddress);
        if (j == -1)
        {
          i++;
        }
        else
        {
          b = i;
          c = j;
          return true;
        }
      }
      return false;
    }
  }
  
  public static final class d {}
  
  public static final class e
    extends k0.j
  {
    public final k0.f a;
    
    public e(k0.f paramf)
    {
      b.y(paramf, "result");
      a = paramf;
    }
    
    public final k0.f a(k0.g paramg)
    {
      return a;
    }
    
    public final String toString()
    {
      g.a locala = new g.a(e.class.getSimpleName());
      locala.a(a, "result");
      return locala.toString();
    }
  }
  
  public final class f
    extends k0.j
  {
    public final p2 a;
    public final AtomicBoolean b = new AtomicBoolean(false);
    
    public f(p2 paramp2)
    {
      b.y(paramp2, "pickFirstLeafLoadBalancer");
      a = paramp2;
    }
    
    public final k0.f a(k0.g paramg)
    {
      if (b.compareAndSet(false, true))
      {
        h1 localh1 = f.d();
        paramg = a;
        Objects.requireNonNull(paramg);
        localh1.execute(new k(paramg, 18));
      }
      return k0.f.e;
    }
  }
  
  public static final class g
  {
    public final k0.i a;
    public n b;
    public final p2.b c;
    public boolean d = false;
    
    public g(k0.i parami, p2.b paramb)
    {
      a = parami;
      b = localn;
      c = paramb;
    }
    
    public static void a(g paramg, n paramn)
    {
      b = paramn;
      boolean bool;
      if ((paramn != n.b) && (paramn != n.c))
      {
        if (paramn != n.d) {
          return;
        }
        bool = false;
      }
      else
      {
        bool = true;
      }
      d = bool;
    }
  }
}

/* Location:
 * Qualified Name:     gb.p2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */