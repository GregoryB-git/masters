package d1;

import c1.k;
import c1.l;
import c1.p;
import c1.q;
import g0.M;
import j0.i;
import j0.j.a;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

public abstract class e
  implements l
{
  public final ArrayDeque a = new ArrayDeque();
  public final ArrayDeque b;
  public final PriorityQueue c;
  public b d;
  public long e;
  public long f;
  public long g;
  
  public e()
  {
    int i = 0;
    for (int j = 0; j < 10; j++) {
      a.add(new b(null));
    }
    b = new ArrayDeque();
    for (j = i; j < 2; j++) {
      b.add(new c(new d(this)));
    }
    c = new PriorityQueue();
    g = -9223372036854775807L;
  }
  
  public final void c(long paramLong)
  {
    g = paramLong;
  }
  
  public void d(long paramLong)
  {
    e = paramLong;
  }
  
  public void flush()
  {
    f = 0L;
    e = 0L;
    while (!c.isEmpty()) {
      o((b)M.i((b)c.poll()));
    }
    b localb = d;
    if (localb != null)
    {
      o(localb);
      d = null;
    }
  }
  
  public abstract k g();
  
  public abstract void h(p paramp);
  
  public p i()
  {
    boolean bool;
    if (d == null) {
      bool = true;
    } else {
      bool = false;
    }
    g0.a.f(bool);
    if (a.isEmpty()) {
      return null;
    }
    b localb = (b)a.pollFirst();
    d = localb;
    return localb;
  }
  
  public q j()
  {
    if (b.isEmpty()) {
      return null;
    }
    while ((!c.isEmpty()) && (ic.peek())).t <= e))
    {
      b localb = (b)M.i((b)c.poll());
      q localq;
      if (localb.p())
      {
        localq = (q)M.i((q)b.pollFirst());
        localq.l(4);
      }
      for (;;)
      {
        o(localb);
        return localq;
        h(localb);
        if (!m()) {
          break;
        }
        k localk = g();
        localq = (q)M.i((q)b.pollFirst());
        localq.z(t, localk, Long.MAX_VALUE);
      }
      o(localb);
    }
    return null;
  }
  
  public final q k()
  {
    return (q)b.pollFirst();
  }
  
  public final long l()
  {
    return e;
  }
  
  public abstract boolean m();
  
  public void n(p paramp)
  {
    boolean bool;
    if (paramp == d) {
      bool = true;
    } else {
      bool = false;
    }
    g0.a.a(bool);
    paramp = (b)paramp;
    long l = g;
    if ((l != -9223372036854775807L) && (t < l))
    {
      o(paramp);
    }
    else
    {
      l = f;
      f = (1L + l);
      b.H(paramp, l);
      c.add(paramp);
    }
    d = null;
  }
  
  public final void o(b paramb)
  {
    paramb.m();
    a.add(paramb);
  }
  
  public void p(q paramq)
  {
    paramq.m();
    b.add(paramq);
  }
  
  public void release() {}
  
  public static final class b
    extends p
    implements Comparable
  {
    public long y;
    
    public int K(b paramb)
    {
      boolean bool1 = p();
      boolean bool2 = paramb.p();
      int i = -1;
      if (bool1 != bool2)
      {
        if (p()) {
          i = 1;
        }
        return i;
      }
      long l1 = t - t;
      long l2 = l1;
      if (l1 == 0L)
      {
        l1 = y - y;
        l2 = l1;
        if (l1 == 0L) {
          return 0;
        }
      }
      if (l2 > 0L) {
        i = 1;
      }
      return i;
    }
  }
  
  public static final class c
    extends q
  {
    public j.a u;
    
    public c(j.a parama)
    {
      u = parama;
    }
    
    public final void x()
    {
      u.a(this);
    }
  }
}

/* Location:
 * Qualified Name:     d1.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */