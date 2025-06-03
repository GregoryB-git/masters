package x0;

import B0.b;
import android.util.Pair;
import d0.I;
import d0.I.b;
import d0.I.c;
import d0.u;
import g0.M;

public final class t
  extends b0
{
  public final boolean m;
  public final I.c n;
  public final I.b o;
  public a p;
  public s q;
  public boolean r;
  public boolean s;
  public boolean t;
  
  public t(x paramx, boolean paramBoolean)
  {
    super(paramx);
    if ((paramBoolean) && (paramx.i())) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    m = paramBoolean;
    n = new I.c();
    o = new I.b();
    I localI = paramx.j();
    if (localI != null)
    {
      p = a.v(localI, null, null);
      t = true;
    }
    else
    {
      p = a.u(paramx.a());
    }
  }
  
  public void B()
  {
    s = false;
    r = false;
    super.B();
  }
  
  public x.b N(x.b paramb)
  {
    return paramb.a(X(a));
  }
  
  public void S(I paramI)
  {
    if (s)
    {
      p = p.t(paramI);
      paramI = q;
      if (paramI != null) {
        a0(paramI.j());
      }
    }
    else if (paramI.q())
    {
      if (t) {
        paramI = p.t(paramI);
      } else {
        paramI = a.v(paramI, I.c.q, a.h);
      }
      p = paramI;
    }
    else
    {
      paramI.n(0, n);
      long l1 = n.c();
      Object localObject1 = n.a;
      Object localObject2 = q;
      if (localObject2 != null)
      {
        long l2 = ((s)localObject2).r();
        p.h(q.o.a, o);
        l2 = o.n() + l2;
        if (l2 != p.n(0, n).c()) {
          l1 = l2;
        }
      }
      localObject2 = paramI.j(n, o, 0, l1);
      Object localObject3 = first;
      l1 = ((Long)second).longValue();
      if (t) {
        paramI = p.t(paramI);
      } else {
        paramI = a.v(paramI, localObject1, localObject3);
      }
      p = paramI;
      paramI = q;
      if ((paramI != null) && (a0(l1)))
      {
        paramI = o;
        paramI = paramI.a(Y(a));
        break label299;
      }
    }
    paramI = null;
    label299:
    t = true;
    s = true;
    A(p);
    if (paramI != null) {
      ((s)g0.a.e(q)).a(paramI);
    }
  }
  
  public void V()
  {
    if (!m)
    {
      r = true;
      U();
    }
  }
  
  public s W(x.b paramb, b paramb1, long paramLong)
  {
    paramb1 = new s(paramb, paramb1, paramLong);
    paramb1.y(k);
    if (s)
    {
      paramb1.a(paramb.a(Y(a)));
    }
    else
    {
      q = paramb1;
      if (!r)
      {
        r = true;
        U();
      }
    }
    return paramb1;
  }
  
  public final Object X(Object paramObject)
  {
    Object localObject = paramObject;
    if (a.s(p) != null)
    {
      localObject = paramObject;
      if (a.s(p).equals(paramObject)) {
        localObject = a.h;
      }
    }
    return localObject;
  }
  
  public final Object Y(Object paramObject)
  {
    Object localObject = paramObject;
    if (a.s(p) != null)
    {
      localObject = paramObject;
      if (paramObject.equals(a.h)) {
        localObject = a.s(p);
      }
    }
    return localObject;
  }
  
  public I Z()
  {
    return p;
  }
  
  public final boolean a0(long paramLong)
  {
    s locals = q;
    int i = p.b(o.a);
    if (i == -1) {
      return false;
    }
    long l1 = p.f(i, o).d;
    long l2 = paramLong;
    if (l1 != -9223372036854775807L)
    {
      l2 = paramLong;
      if (paramLong >= l1) {
        l2 = Math.max(0L, l1 - 1L);
      }
    }
    locals.w(l2);
    return true;
  }
  
  public void e(v paramv)
  {
    ((s)paramv).x();
    if (paramv == q) {
      q = null;
    }
  }
  
  public void h() {}
  
  public void l(u paramu)
  {
    if (t) {}
    for (a locala = p.t(new X(p.e, paramu));; locala = a.u(paramu))
    {
      p = locala;
      break;
    }
    k.l(paramu);
  }
  
  public static final class a
    extends p
  {
    public static final Object h = new Object();
    public final Object f;
    public final Object g;
    
    public a(I paramI, Object paramObject1, Object paramObject2)
    {
      super();
      f = paramObject1;
      g = paramObject2;
    }
    
    public static a u(u paramu)
    {
      return new a(new t.b(paramu), I.c.q, h);
    }
    
    public static a v(I paramI, Object paramObject1, Object paramObject2)
    {
      return new a(paramI, paramObject1, paramObject2);
    }
    
    public int b(Object paramObject)
    {
      I localI = e;
      Object localObject1 = paramObject;
      if (h.equals(paramObject))
      {
        Object localObject2 = g;
        localObject1 = paramObject;
        if (localObject2 != null) {
          localObject1 = localObject2;
        }
      }
      return localI.b(localObject1);
    }
    
    public I.b g(int paramInt, I.b paramb, boolean paramBoolean)
    {
      e.g(paramInt, paramb, paramBoolean);
      if ((M.c(b, g)) && (paramBoolean)) {
        b = h;
      }
      return paramb;
    }
    
    public Object m(int paramInt)
    {
      Object localObject1 = e.m(paramInt);
      Object localObject2 = localObject1;
      if (M.c(localObject1, g)) {
        localObject2 = h;
      }
      return localObject2;
    }
    
    public I.c o(int paramInt, I.c paramc, long paramLong)
    {
      e.o(paramInt, paramc, paramLong);
      if (M.c(a, f)) {
        a = I.c.q;
      }
      return paramc;
    }
    
    public a t(I paramI)
    {
      return new a(paramI, f, g);
    }
  }
  
  public static final class b
    extends I
  {
    public final u e;
    
    public b(u paramu)
    {
      e = paramu;
    }
    
    public int b(Object paramObject)
    {
      int i;
      if (paramObject == t.a.h) {
        i = 0;
      } else {
        i = -1;
      }
      return i;
    }
    
    public I.b g(int paramInt, I.b paramb, boolean paramBoolean)
    {
      Object localObject = null;
      Integer localInteger;
      if (paramBoolean) {
        localInteger = Integer.valueOf(0);
      } else {
        localInteger = null;
      }
      if (paramBoolean) {
        localObject = t.a.h;
      }
      paramb.t(localInteger, localObject, 0, -9223372036854775807L, 0L, d0.a.g, true);
      return paramb;
    }
    
    public int i()
    {
      return 1;
    }
    
    public Object m(int paramInt)
    {
      return t.a.h;
    }
    
    public I.c o(int paramInt, I.c paramc, long paramLong)
    {
      paramc.g(I.c.q, e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
      k = true;
      return paramc;
    }
    
    public int p()
    {
      return 1;
    }
  }
}

/* Location:
 * Qualified Name:     x0.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */