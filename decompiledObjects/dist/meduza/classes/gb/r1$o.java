package gb;

import eb.a;
import eb.b0;
import eb.b0.a;
import eb.c0;
import eb.d;
import eb.e0;
import eb.e1;
import eb.f0;
import eb.h1.c;
import eb.k0.b;
import eb.k0.k;
import eb.u;
import f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import x6.b;

public final class r1$o
  extends e
{
  public final k0.b a;
  public final f0 b;
  public final n c;
  public final p d;
  public List<u> e;
  public d1 f;
  public boolean g;
  public boolean h;
  public h1.c i;
  
  public r1$o(r1 paramr1, k0.b paramb)
  {
    e = a;
    Object localObject = r1.e0;
    paramr1.getClass();
    a = paramb;
    localObject = paramr1.b();
    localObject = new f0(f0.d.incrementAndGet(), "Subchannel", (String)localObject);
    b = ((f0)localObject);
    long l = m.a();
    StringBuilder localStringBuilder = f.l("Subchannel for ");
    localStringBuilder.append(a);
    paramb = new p((f0)localObject, l, localStringBuilder.toString());
    d = paramb;
    c = new n(paramb, m);
  }
  
  public final List<u> b()
  {
    j.n.d();
    b.I(g, "not started");
    return e;
  }
  
  public final a c()
  {
    return a.b;
  }
  
  public final d d()
  {
    return c;
  }
  
  public final Object e()
  {
    b.I(g, "Subchannel is not started");
    return f;
  }
  
  public final void f()
  {
    j.n.d();
    b.I(g, "not started");
    f.a();
  }
  
  public final void g()
  {
    j.n.d();
    if (f == null)
    {
      h = true;
      return;
    }
    if (h)
    {
      if (j.J)
      {
        localObject = i;
        if (localObject != null)
        {
          ((h1.c)localObject).a();
          i = null;
          break label67;
        }
      }
    }
    else {
      h = true;
    }
    label67:
    Object localObject = j;
    if (!J)
    {
      i = n.c(new p1(new b()), 5L, TimeUnit.SECONDS, j.g.p0());
      return;
    }
    localObject = f;
    e1 locale1 = r1.h0;
    l.execute(new h1((d1)localObject, locale1));
  }
  
  public final void h(final k0.k paramk)
  {
    j.n.d();
    b.I(g ^ true, "already started");
    b.I(h ^ true, "already shutdown");
    b.I(j.J ^ true, "Channel is being terminated");
    g = true;
    Object localObject1 = a.a;
    Object localObject2 = j.b();
    j.getClass();
    Object localObject3 = j;
    Object localObject4 = t;
    localObject3 = g;
    ScheduledExecutorService localScheduledExecutorService = ((l)localObject3).p0();
    r1 localr1 = j;
    localObject1 = new d1((List)localObject1, (String)localObject2, (j.a)localObject4, (l)localObject3, localScheduledExecutorService, q, n, new a(paramk), Q, new m(M.a), d, b, c, j.v);
    localObject4 = j;
    localObject2 = O;
    paramk = b0.a.a;
    localObject4 = Long.valueOf(m.a());
    b.y(localObject4, "timestampNanos");
    ((p)localObject2).b(new b0("Child Subchannel started", paramk, ((Long)localObject4).longValue(), (e0)localObject1));
    f = ((d1)localObject1);
    c0.a(j.Q.b, (e0)localObject1);
    j.B.add(localObject1);
  }
  
  public final void i(List<u> paramList)
  {
    j.n.d();
    e = paramList;
    j.getClass();
    d1 locald1 = f;
    locald1.getClass();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext()) {
      b.y(localIterator.next(), "newAddressGroups contains null entry");
    }
    b.s("newAddressGroups is empty", paramList.isEmpty() ^ true);
    paramList = Collections.unmodifiableList(new ArrayList(paramList));
    l.execute(new g1(locald1, paramList));
  }
  
  public final String toString()
  {
    return b.toString();
  }
  
  public final class a
    extends d1.c
  {}
  
  public final class b
    implements Runnable
  {
    public b() {}
    
    public final void run()
    {
      d1 locald1 = f;
      e1 locale1 = r1.i0;
      l.execute(new h1(locald1, locale1));
    }
  }
}

/* Location:
 * Qualified Name:     gb.r1.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */