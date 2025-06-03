package k0;

import B0.b;
import android.util.Pair;
import d0.I;
import g0.M;
import g0.k;
import g0.o;
import i0.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l0.y1;
import x0.E;
import x0.T;
import x0.T.a;
import x0.r;
import x0.s;
import x0.t;
import x0.x;
import x0.x.b;
import x0.x.c;

public final class T0
{
  public final y1 a;
  public final List b;
  public final IdentityHashMap c;
  public final Map d;
  public final d e;
  public final HashMap f;
  public final Set g;
  public final l0.a h;
  public final k i;
  public T j;
  public boolean k;
  public y l;
  
  public T0(d paramd, l0.a parama, k paramk, y1 paramy1)
  {
    a = paramy1;
    e = paramd;
    j = new T.a(0);
    c = new IdentityHashMap();
    d = new HashMap();
    b = new ArrayList();
    h = parama;
    i = paramk;
    f = new HashMap();
    g = new HashSet();
  }
  
  public static Object m(Object paramObject)
  {
    return a.v(paramObject);
  }
  
  public static x.b n(c paramc, x.b paramb)
  {
    for (int m = 0; m < c.size(); m++) {
      if (c.get(m)).d == d) {
        return paramb.a(p(paramc, a));
      }
    }
    return null;
  }
  
  public static Object o(Object paramObject)
  {
    return a.w(paramObject);
  }
  
  public static Object p(c paramc, Object paramObject)
  {
    return a.y(b, paramObject);
  }
  
  public static int s(c paramc, int paramInt)
  {
    return paramInt + d;
  }
  
  public I A(int paramInt1, int paramInt2, T paramT)
  {
    boolean bool;
    if ((paramInt1 >= 0) && (paramInt1 <= paramInt2) && (paramInt2 <= r())) {
      bool = true;
    } else {
      bool = false;
    }
    g0.a.a(bool);
    j = paramT;
    B(paramInt1, paramInt2);
    return i();
  }
  
  public final void B(int paramInt1, int paramInt2)
  {
    
    while (paramInt2 >= paramInt1)
    {
      c localc = (c)b.remove(paramInt2);
      d.remove(b);
      g(paramInt2, -a.Z().p());
      e = true;
      if (k) {
        v(localc);
      }
      paramInt2--;
    }
  }
  
  public I C(List paramList, T paramT)
  {
    B(0, b.size());
    return f(b.size(), paramList, paramT);
  }
  
  public I D(T paramT)
  {
    int m = r();
    T localT = paramT;
    if (paramT.a() != m) {
      localT = paramT.h().d(0, m);
    }
    j = localT;
    return i();
  }
  
  public I E(int paramInt1, int paramInt2, List paramList)
  {
    boolean bool1 = false;
    if ((paramInt1 >= 0) && (paramInt1 <= paramInt2) && (paramInt2 <= r())) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    g0.a.a(bool2);
    boolean bool2 = bool1;
    if (paramList.size() == paramInt2 - paramInt1) {
      bool2 = true;
    }
    g0.a.a(bool2);
    for (int m = paramInt1; m < paramInt2; m++) {
      b.get(m)).a.l((d0.u)paramList.get(m - paramInt1));
    }
    return i();
  }
  
  public I f(int paramInt, List paramList, T paramT)
  {
    if (!paramList.isEmpty())
    {
      j = paramT;
      for (int m = paramInt; m < paramList.size() + paramInt; m++)
      {
        paramT = (c)paramList.get(m - paramInt);
        c localc;
        I localI;
        if (m > 0)
        {
          localc = (c)b.get(m - 1);
          localI = a.Z();
        }
        for (int n = d + localI.p();; n = 0)
        {
          paramT.c(n);
          break;
        }
        g(m, a.Z().p());
        b.add(m, paramT);
        d.put(b, paramT);
        if (k)
        {
          x(paramT);
          if (c.isEmpty()) {
            g.add(paramT);
          } else {
            j(paramT);
          }
        }
      }
    }
    return i();
  }
  
  public final void g(int paramInt1, int paramInt2)
  {
    while (paramInt1 < b.size())
    {
      c localc = (c)b.get(paramInt1);
      d += paramInt2;
      paramInt1++;
    }
  }
  
  public x0.v h(x.b paramb, b paramb1, long paramLong)
  {
    Object localObject = o(a);
    paramb = paramb.a(m(a));
    localObject = (c)g0.a.e((c)d.get(localObject));
    l((c)localObject);
    c.add(paramb);
    paramb = a.W(paramb, paramb1, paramLong);
    c.put(paramb, localObject);
    k();
    return paramb;
  }
  
  public I i()
  {
    if (b.isEmpty()) {
      return I.a;
    }
    int m = 0;
    int n = 0;
    while (m < b.size())
    {
      c localc = (c)b.get(m);
      d = n;
      n += a.Z().p();
      m++;
    }
    return new W0(b, j);
  }
  
  public final void j(c paramc)
  {
    paramc = (b)f.get(paramc);
    if (paramc != null) {
      a.d(b);
    }
  }
  
  public final void k()
  {
    Iterator localIterator = g.iterator();
    while (localIterator.hasNext())
    {
      c localc = (c)localIterator.next();
      if (c.isEmpty())
      {
        j(localc);
        localIterator.remove();
      }
    }
  }
  
  public final void l(c paramc)
  {
    g.add(paramc);
    paramc = (b)f.get(paramc);
    if (paramc != null) {
      a.n(b);
    }
  }
  
  public T q()
  {
    return j;
  }
  
  public int r()
  {
    return b.size();
  }
  
  public boolean t()
  {
    return k;
  }
  
  public final void v(c paramc)
  {
    if ((e) && (c.isEmpty()))
    {
      b localb = (b)g0.a.e((b)f.remove(paramc));
      a.m(b);
      a.c(c);
      a.o(c);
      g.remove(paramc);
    }
  }
  
  public void w(y paramy)
  {
    g0.a.f(k ^ true);
    l = paramy;
    for (int m = 0; m < b.size(); m++)
    {
      paramy = (c)b.get(m);
      x(paramy);
      g.add(paramy);
    }
    k = true;
  }
  
  public final void x(c paramc)
  {
    t localt = a;
    G0 localG0 = new G0(this);
    a locala = new a(paramc);
    f.put(paramc, new b(localt, localG0, locala));
    localt.p(M.C(), locala);
    localt.k(M.C(), locala);
    localt.g(localG0, l, a);
  }
  
  public void y()
  {
    Iterator localIterator = f.values().iterator();
    while (localIterator.hasNext())
    {
      b localb = (b)localIterator.next();
      try
      {
        a.m(b);
      }
      catch (RuntimeException localRuntimeException)
      {
        o.d("MediaSourceList", "Failed to release child source.", localRuntimeException);
      }
      a.c(c);
      a.o(c);
    }
    f.clear();
    g.clear();
    k = false;
  }
  
  public void z(x0.v paramv)
  {
    c localc = (c)g0.a.e((c)c.remove(paramv));
    a.e(paramv);
    c.remove(o);
    if (!c.isEmpty()) {
      k();
    }
    v(localc);
  }
  
  public final class a
    implements E, p0.v
  {
    public final T0.c a;
    
    public a(T0.c paramc)
    {
      a = paramc;
    }
    
    public final Pair G(int paramInt, x.b paramb)
    {
      x.b localb = null;
      if (paramb != null)
      {
        localb = T0.c(a, paramb);
        if (localb == null) {
          return null;
        }
      }
      return Pair.create(Integer.valueOf(T0.d(a, paramInt)), localb);
    }
    
    public void K(int paramInt, x.b paramb, r paramr, x0.u paramu)
    {
      paramb = G(paramInt, paramb);
      if (paramb != null) {
        T0.b(T0.this).j(new K0(this, paramb, paramr, paramu));
      }
    }
    
    public void M(int paramInt1, x.b paramb, int paramInt2)
    {
      paramb = G(paramInt1, paramb);
      if (paramb != null) {
        T0.b(T0.this).j(new Q0(this, paramb, paramInt2));
      }
    }
    
    public void S(int paramInt, x.b paramb)
    {
      paramb = G(paramInt, paramb);
      if (paramb != null) {
        T0.b(T0.this).j(new J0(this, paramb));
      }
    }
    
    public void T(int paramInt, x.b paramb)
    {
      paramb = G(paramInt, paramb);
      if (paramb != null) {
        T0.b(T0.this).j(new O0(this, paramb));
      }
    }
    
    public void W(int paramInt, x.b paramb, x0.u paramu)
    {
      paramb = G(paramInt, paramb);
      if (paramb != null) {
        T0.b(T0.this).j(new L0(this, paramb, paramu));
      }
    }
    
    public void Z(int paramInt, x.b paramb, x0.u paramu)
    {
      paramb = G(paramInt, paramb);
      if (paramb != null) {
        T0.b(T0.this).j(new H0(this, paramb, paramu));
      }
    }
    
    public void a0(int paramInt, x.b paramb, r paramr, x0.u paramu, IOException paramIOException, boolean paramBoolean)
    {
      paramb = G(paramInt, paramb);
      if (paramb != null) {
        T0.b(T0.this).j(new R0(this, paramb, paramr, paramu, paramIOException, paramBoolean));
      }
    }
    
    public void d0(int paramInt, x.b paramb, Exception paramException)
    {
      paramb = G(paramInt, paramb);
      if (paramb != null) {
        T0.b(T0.this).j(new N0(this, paramb, paramException));
      }
    }
    
    public void g0(int paramInt, x.b paramb)
    {
      paramb = G(paramInt, paramb);
      if (paramb != null) {
        T0.b(T0.this).j(new S0(this, paramb));
      }
    }
    
    public void l0(int paramInt, x.b paramb)
    {
      paramb = G(paramInt, paramb);
      if (paramb != null) {
        T0.b(T0.this).j(new I0(this, paramb));
      }
    }
    
    public void m0(int paramInt, x.b paramb, r paramr, x0.u paramu)
    {
      paramb = G(paramInt, paramb);
      if (paramb != null) {
        T0.b(T0.this).j(new P0(this, paramb, paramr, paramu));
      }
    }
    
    public void p0(int paramInt, x.b paramb, r paramr, x0.u paramu)
    {
      paramb = G(paramInt, paramb);
      if (paramb != null) {
        T0.b(T0.this).j(new M0(this, paramb, paramr, paramu));
      }
    }
  }
  
  public static final class b
  {
    public final x a;
    public final x.c b;
    public final T0.a c;
    
    public b(x paramx, x.c paramc, T0.a parama)
    {
      a = paramx;
      b = paramc;
      c = parama;
    }
  }
  
  public static final class c
    implements F0
  {
    public final t a;
    public final Object b;
    public final List c;
    public int d;
    public boolean e;
    
    public c(x paramx, boolean paramBoolean)
    {
      a = new t(paramx, paramBoolean);
      c = new ArrayList();
      b = new Object();
    }
    
    public Object a()
    {
      return b;
    }
    
    public I b()
    {
      return a.Z();
    }
    
    public void c(int paramInt)
    {
      d = paramInt;
      e = false;
      c.clear();
    }
  }
  
  public static abstract interface d
  {
    public abstract void b();
  }
}

/* Location:
 * Qualified Name:     k0.T0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */