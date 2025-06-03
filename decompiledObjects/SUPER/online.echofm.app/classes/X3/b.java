package X3;

import V3.k;
import Y3.m;
import c4.c;
import d4.n;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;

public class b
  implements e
{
  public final f a;
  public final i b;
  public final c c;
  public final a d;
  public long e = 0L;
  
  public b(V3.f paramf, f paramf1, a parama)
  {
    this(paramf, paramf1, parama, new Y3.b());
  }
  
  public b(V3.f paramf, f paramf1, a parama, Y3.a parama1)
  {
    a = paramf1;
    paramf = paramf.q("Persistence");
    c = paramf;
    b = new i(paramf1, paramf, parama1);
    d = parama;
  }
  
  public void a()
  {
    a.a();
  }
  
  public void b(long paramLong)
  {
    a.b(paramLong);
  }
  
  public void c(k paramk, V3.b paramb, long paramLong)
  {
    a.c(paramk, paramb, paramLong);
  }
  
  public List d()
  {
    return a.d();
  }
  
  public void e(k paramk, n paramn, long paramLong)
  {
    a.e(paramk, paramn, paramLong);
  }
  
  public void f(k paramk, V3.b paramb)
  {
    a.o(paramk, paramb);
    q();
  }
  
  public Object g(Callable paramCallable)
  {
    a.g();
    try
    {
      paramCallable = paramCallable.call();
      a.p();
      a.f();
      return paramCallable;
    }
    finally
    {
      try
      {
        c.c("Caught Throwable.", paramCallable);
        RuntimeException localRuntimeException = new java/lang/RuntimeException;
        localRuntimeException.<init>(paramCallable);
        throw localRuntimeException;
      }
      finally
      {
        a.f();
      }
    }
  }
  
  public void h(k paramk, V3.b paramb)
  {
    Iterator localIterator = paramb.iterator();
    while (localIterator.hasNext())
    {
      paramb = (Map.Entry)localIterator.next();
      n(paramk.T((k)paramb.getKey()), (n)paramb.getValue());
    }
  }
  
  public void i(a4.i parami)
  {
    b.x(parami);
  }
  
  public void j(a4.i parami, n paramn)
  {
    if (parami.g()) {
      a.t(parami.e(), paramn);
    } else {
      a.s(parami.e(), paramn);
    }
    p(parami);
    q();
  }
  
  public a4.a k(a4.i parami)
  {
    Object localObject1;
    boolean bool;
    if (b.n(parami))
    {
      localObject1 = b.i(parami);
      if ((!parami.g()) && (localObject1 != null) && (d)) {
        localObject1 = a.i(a);
      } else {
        localObject1 = null;
      }
      bool = true;
    }
    else
    {
      localObject1 = b.j(parami.e());
      bool = false;
    }
    n localn = a.q(parami.e());
    if (localObject1 != null)
    {
      Object localObject2 = d4.g.W();
      Iterator localIterator = ((Set)localObject1).iterator();
      for (localObject1 = localObject2; localIterator.hasNext(); localObject1 = ((n)localObject1).N((d4.b)localObject2, localn.v((d4.b)localObject2))) {
        localObject2 = (d4.b)localIterator.next();
      }
      return new a4.a(d4.i.f((n)localObject1, parami.c()), bool, true);
    }
    return new a4.a(d4.i.f(localn, parami.c()), bool, false);
  }
  
  public void l(a4.i parami, Set paramSet1, Set paramSet2)
  {
    boolean bool1 = parami.g();
    boolean bool2 = true;
    m.g(bool1 ^ true, "We should only track keys for filtered queries.");
    parami = b.i(parami);
    if ((parami == null) || (!e)) {
      bool2 = false;
    }
    m.g(bool2, "We only expect tracked keys for currently-active queries.");
    a.r(a, paramSet1, paramSet2);
  }
  
  public void m(a4.i parami)
  {
    b.u(parami);
  }
  
  public void n(k paramk, n paramn)
  {
    if (!b.l(paramk))
    {
      a.t(paramk, paramn);
      b.g(paramk);
    }
  }
  
  public void o(a4.i parami, Set paramSet)
  {
    boolean bool1 = parami.g();
    boolean bool2 = true;
    m.g(bool1 ^ true, "We should only track keys for filtered queries.");
    parami = b.i(parami);
    if ((parami == null) || (!e)) {
      bool2 = false;
    }
    m.g(bool2, "We only expect tracked keys for currently-active queries.");
    a.k(a, paramSet);
  }
  
  public void p(a4.i parami)
  {
    if (parami.g()) {
      b.t(parami.e());
    } else {
      b.w(parami);
    }
  }
  
  public final void q()
  {
    long l1 = e + 1L;
    e = l1;
    if (d.d(l1))
    {
      if (c.f()) {
        c.b("Reached prune check threshold.", new Object[0]);
      }
      e = 0L;
      l1 = a.l();
      c localc;
      Object localObject;
      if (c.f())
      {
        localc = c;
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Cache size: ");
        ((StringBuilder)localObject).append(l1);
        localc.b(((StringBuilder)localObject).toString(), new Object[0]);
      }
      int i = 1;
      while ((i != 0) && (d.a(l1, b.f())))
      {
        localObject = b.p(d);
        int j;
        if (((g)localObject).e())
        {
          a.m(k.Y(), (g)localObject);
          j = i;
        }
        else
        {
          j = 0;
        }
        long l2 = a.l();
        i = j;
        l1 = l2;
        if (c.f())
        {
          localc = c;
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("Cache size after prune: ");
          ((StringBuilder)localObject).append(l2);
          localc.b(((StringBuilder)localObject).toString(), new Object[0]);
          i = j;
          l1 = l2;
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     X3.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */