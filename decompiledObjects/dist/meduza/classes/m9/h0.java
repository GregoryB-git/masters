package m9;

import eb.e1;
import g9.b0.a;
import g9.k0;
import i9.i1;
import i9.m1;
import i9.n;
import j9.f;
import j9.i;
import j9.o;
import j9.q;
import java.util.ArrayDeque;
import java.util.HashMap;
import k9.g;
import ka.a0.b;
import ka.a0.c;
import ka.s;
import ka.s.a;
import ma.n1;
import ma.w.a;
import ma.x;
import n9.a.c;
import t8.e;
import x6.b;

public final class h0
  implements o0.a
{
  public final f a;
  public final a b;
  public final n c;
  public final j d;
  public final h e;
  public final HashMap f;
  public final b0 g;
  public boolean h = false;
  public final p0 i;
  public final q0 j;
  public o0 k;
  public final ArrayDeque l;
  
  public h0(f paramf, b0.a parama, n paramn, j paramj, n9.a parama1, d paramd)
  {
    a = paramf;
    b = parama;
    c = paramn;
    d = paramj;
    e = paramd;
    f = new HashMap();
    l = new ArrayDeque();
    g = new b0(parama1, new aa.m0(parama, 10));
    paramf = new f0(this);
    i = new p0(c, b, a, paramf);
    paramf = new g0(this);
    j = new q0(c, b, a, paramf);
    paramd.a(new i1(1, this, parama1));
  }
  
  public final void a()
  {
    i0 locali0 = i0.a;
    Object localObject = i;
    if (((a)localObject).d()) {
      ((a)localObject).a(locali0, e1.e);
    }
    localObject = j;
    if (((a)localObject).d()) {
      ((a)localObject).a(locali0, e1.e);
    }
    if (!l.isEmpty())
    {
      p2.m0.y(1, "RemoteStore", "Stopping write stream with %d pending writes", new Object[] { Integer.valueOf(l.size()) });
      l.clear();
    }
    k = null;
  }
  
  public final void b()
  {
    h = true;
    q0 localq0 = j;
    ma.h localh = c.c.i();
    localq0.getClass();
    localh.getClass();
    v = localh;
    if (g()) {
      i();
    } else {
      g.c(g9.d0.a);
    }
    c();
  }
  
  public final void c()
  {
    if (l.isEmpty()) {
      m = -1;
    }
    g localg;
    for (int m = l.getLast()).a;; m = a)
    {
      boolean bool1 = h;
      boolean bool2 = true;
      int n;
      if ((bool1) && (l.size() < 10)) {
        n = 1;
      } else {
        n = 0;
      }
      if (n == 0) {
        break;
      }
      localg = c.c.f(m);
      q0 localq0;
      if (localg == null)
      {
        if (l.size() != 0) {
          break;
        }
        localq0 = j;
        if ((!localq0.c()) || (b != null)) {
          break;
        }
        b = f.b(g, a.p, e);
        break;
      }
      if ((!h) || (l.size() >= 10)) {
        bool2 = false;
      }
      b.Z("addToWritePipeline called when pipeline is full", bool2, new Object[0]);
      l.add(localg);
      if (j.c())
      {
        localq0 = j;
        if (u) {
          localq0.j(d);
        }
      }
    }
    if (h())
    {
      b.Z("startWriteStream() called when shouldStartWriteStream() is false.", h(), new Object[0]);
      j.g();
    }
  }
  
  public final void d(m1 paramm1)
  {
    Integer localInteger = Integer.valueOf(b);
    if (f.containsKey(localInteger)) {
      return;
    }
    f.put(localInteger, paramm1);
    if (g()) {
      i();
    } else if (i.c()) {
      f(paramm1);
    }
  }
  
  public final void e(int paramInt)
  {
    Object localObject = k.a(paramInt);
    a += 1;
    p0 localp0 = i;
    b.Z("Unwatching targets requires an open stream", localp0.c(), new Object[0]);
    s.a locala = s.L();
    localObject = t.b;
    locala.m();
    s.H((s)b, (String)localObject);
    locala.m();
    s.J((s)b, paramInt);
    localp0.i((s)locala.k());
  }
  
  public final void f(m1 paramm1)
  {
    Object localObject1 = k.a(b);
    a += 1;
    if (g.isEmpty())
    {
      localObject1 = paramm1;
      if (e.f(q.b) <= 0) {}
    }
    else
    {
      m = b;
      m = b.d(m).size();
      localObject1 = new m1(a, b, c, d, e, f, g, Integer.valueOf(m));
    }
    p0 localp0 = i;
    b.Z("Watching queries requires an open stream", localp0.c(), new Object[0]);
    s.a locala = s.L();
    paramm1 = t.b;
    locala.m();
    s.H((s)b, paramm1);
    Object localObject2 = t;
    localObject2.getClass();
    paramm1 = ka.a0.M();
    Object localObject3 = a;
    Object localObject4;
    if (((k0)localObject3).e())
    {
      localObject4 = a0.b.K();
      localObject3 = d;
      localObject2 = e0.m(a, (o)localObject3);
      ((w.a)localObject4).m();
      a0.b.G((a0.b)b, (String)localObject2);
      localObject4 = (a0.b)((w.a)localObject4).k();
      paramm1.m();
      ka.a0.H((ka.a0)b, (a0.b)localObject4);
    }
    else
    {
      localObject4 = ((e0)localObject2).l((k0)localObject3);
      paramm1.m();
      ka.a0.G((ka.a0)b, (a0.c)localObject4);
    }
    int m = b;
    paramm1.m();
    ka.a0.K((ka.a0)b, m);
    if ((g.isEmpty()) && (e.f(q.b) > 0))
    {
      localObject4 = e0.n(e.a);
      paramm1.m();
      ka.a0.J((ka.a0)b, (n1)localObject4);
    }
    else
    {
      localObject4 = g;
      paramm1.m();
      ka.a0.I((ka.a0)b, (ma.h)localObject4);
    }
    if ((h != null) && ((!g.isEmpty()) || (e.f(q.b) > 0)))
    {
      localObject4 = x.J();
      m = h.intValue();
      ((w.a)localObject4).m();
      x.G((x)b, m);
      paramm1.m();
      ka.a0.L((ka.a0)b, (x)((w.a)localObject4).k());
    }
    paramm1 = (ka.a0)paramm1.k();
    locala.m();
    s.I((s)b, paramm1);
    t.getClass();
    paramm1 = d;
    m = paramm1.ordinal();
    localObject1 = null;
    if (m != 0)
    {
      if (m != 1)
      {
        if (m != 2)
        {
          if (m == 3)
          {
            paramm1 = "limbo-document";
          }
          else
          {
            b.T("Unrecognized query purpose: %s", new Object[] { paramm1 });
            throw null;
          }
        }
        else {
          paramm1 = "existence-filter-mismatch-bloom";
        }
      }
      else {
        paramm1 = "existence-filter-mismatch";
      }
    }
    else {
      paramm1 = null;
    }
    if (paramm1 == null)
    {
      paramm1 = (m1)localObject1;
    }
    else
    {
      localObject1 = new HashMap(1);
      ((HashMap)localObject1).put("goog-listen-tags", paramm1);
      paramm1 = (m1)localObject1;
    }
    if (paramm1 != null)
    {
      locala.m();
      s.G((s)b).putAll(paramm1);
    }
    localp0.i((s)locala.k());
  }
  
  public final boolean g()
  {
    boolean bool;
    if ((h) && (!i.d()) && (!f.isEmpty())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean h()
  {
    boolean bool;
    if ((h) && (!j.d()) && (!l.isEmpty())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void i()
  {
    b.Z("startWatchStream() called when shouldStartWatchStream() is false.", g(), new Object[0]);
    k = new o0(a, this);
    i.g();
    b0 localb0 = g;
    if (b == 0)
    {
      localb0.b(g9.d0.a);
      boolean bool;
      if (c == null) {
        bool = true;
      } else {
        bool = false;
      }
      b.Z("onlineStateTimer shouldn't be started yet", bool, new Object[0]);
      c = e.b(a.c.f, 10000L, new u.a(localb0, 14));
    }
  }
  
  public final void j(int paramInt)
  {
    boolean bool;
    if ((m1)f.remove(Integer.valueOf(paramInt)) != null) {
      bool = true;
    } else {
      bool = false;
    }
    b.Z("stopListening called on target no currently watched: %d", bool, new Object[] { Integer.valueOf(paramInt) });
    if (i.c()) {
      e(paramInt);
    }
    if (f.isEmpty()) {
      if (i.c())
      {
        p0 localp0 = i;
        if ((localp0.c()) && (b == null)) {
          b = f.b(g, a.p, e);
        }
      }
      else if (h)
      {
        g.c(g9.d0.a);
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(k9.h paramh);
    
    public abstract void b(g9.d0 paramd0);
    
    public abstract void c(d0 paramd0);
    
    public abstract e<i> d(int paramInt);
    
    public abstract void e(int paramInt, e1 parame1);
    
    public abstract void f(int paramInt, e1 parame1);
  }
}

/* Location:
 * Qualified Name:     m9.h0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */