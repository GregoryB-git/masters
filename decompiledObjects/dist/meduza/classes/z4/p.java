package z4;

import android.util.Pair;
import v3.o0;
import v3.r1;
import v3.r1.b;
import v3.r1.c;
import v5.e0;

public final class p
  extends l0
{
  public boolean A;
  public final boolean t;
  public final r1.c u;
  public final r1.b v;
  public a w;
  public o x;
  public boolean y;
  public boolean z;
  
  public p(t paramt, boolean paramBoolean)
  {
    super(paramt);
    if ((paramBoolean) && (paramt.i())) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    t = paramBoolean;
    u = new r1.c();
    v = new r1.b();
    r1 localr1 = paramt.j();
    if (localr1 != null)
    {
      w = new a(localr1, null, null);
      A = true;
    }
    else
    {
      w = new a(new b(paramt.f()), r1.c.z, a.e);
    }
  }
  
  public final t.b C(t.b paramb)
  {
    Object localObject1 = a;
    Object localObject2 = w.d;
    Object localObject3 = localObject1;
    if (localObject2 != null)
    {
      localObject3 = localObject1;
      if (localObject2.equals(localObject1)) {
        localObject3 = a.e;
      }
    }
    return paramb.b(localObject3);
  }
  
  public final void D(r1 paramr1)
  {
    Object localObject1;
    long l1;
    Object localObject2;
    long l2;
    if (z)
    {
      localObject1 = w;
      w = new a(paramr1, c, d);
      paramr1 = x;
      if (paramr1 != null) {
        G(o);
      }
    }
    else if (paramr1.p())
    {
      if (A)
      {
        localObject1 = w;
        paramr1 = new a(paramr1, c, d);
      }
      else
      {
        paramr1 = new a(paramr1, r1.c.z, a.e);
      }
      w = paramr1;
    }
    else
    {
      paramr1.m(0, u);
      localObject1 = u;
      l1 = u;
      localObject1 = a;
      localObject2 = x;
      if (localObject2 != null)
      {
        l2 = b;
        w.g(a.a, v);
        l2 = v.e + l2;
        if (l2 != w.m(0, u).u) {
          l1 = l2;
        }
      }
      localObject2 = paramr1.i(u, v, 0, l1);
      Object localObject3 = first;
      l1 = ((Long)second).longValue();
      if (A)
      {
        localObject1 = w;
        paramr1 = new a(paramr1, c, d);
      }
      else
      {
        paramr1 = new a(paramr1, localObject1, localObject3);
      }
      w = paramr1;
      paramr1 = x;
      if (paramr1 != null)
      {
        G(l1);
        localObject2 = a;
        localObject1 = a;
        paramr1 = (r1)localObject1;
        if (w.d != null)
        {
          paramr1 = (r1)localObject1;
          if (localObject1.equals(a.e)) {
            paramr1 = w.d;
          }
        }
        paramr1 = ((t.b)localObject2).b(paramr1);
        break label370;
      }
    }
    paramr1 = null;
    label370:
    A = true;
    z = true;
    v(w);
    if (paramr1 != null)
    {
      localObject1 = x;
      localObject1.getClass();
      l1 = b;
      l2 = o;
      if (l2 != -9223372036854775807L) {
        l1 = l2;
      }
      localObject2 = d;
      localObject2.getClass();
      paramr1 = ((t)localObject2).o(paramr1, c, l1);
      e = paramr1;
      if (f != null) {
        paramr1.n((r.a)localObject1, l1);
      }
    }
  }
  
  public final void E()
  {
    if (!t)
    {
      y = true;
      B(null, s);
    }
  }
  
  public final o F(t.b paramb, t5.b paramb1, long paramLong)
  {
    o localo = new o(paramb, paramb1, paramLong);
    Object localObject1 = s;
    boolean bool;
    if (d == null) {
      bool = true;
    } else {
      bool = false;
    }
    x6.b.H(bool);
    d = ((t)localObject1);
    if (z)
    {
      Object localObject2 = a;
      localObject1 = localObject2;
      if (w.d != null)
      {
        localObject1 = localObject2;
        if (localObject2.equals(a.e)) {
          localObject1 = w.d;
        }
      }
      localObject1 = paramb.b(localObject1);
      paramLong = localo.f(paramLong);
      paramb = d;
      paramb.getClass();
      paramb = paramb.o((t.b)localObject1, paramb1, paramLong);
      e = paramb;
      if (f != null) {
        paramb.n(localo, paramLong);
      }
    }
    else
    {
      x = localo;
      if (!y)
      {
        y = true;
        B(null, s);
      }
    }
    return localo;
  }
  
  public final void G(long paramLong)
  {
    o localo = x;
    int i = w.b(a.a);
    if (i == -1) {
      return;
    }
    a locala = w;
    r1.b localb = v;
    locala.f(i, localb, false);
    long l1 = d;
    long l2 = paramLong;
    if (l1 != -9223372036854775807L)
    {
      l2 = paramLong;
      if (paramLong >= l1) {
        l2 = Math.max(0L, l1 - 1L);
      }
    }
    o = l2;
  }
  
  public final void g(r paramr)
  {
    o localo = (o)paramr;
    if (e != null)
    {
      t localt = d;
      localt.getClass();
      localt.g(e);
    }
    if (paramr == x) {
      x = null;
    }
  }
  
  public final void h() {}
  
  public final void w()
  {
    z = false;
    y = false;
    super.w();
  }
  
  public static final class a
    extends l
  {
    public static final Object e = new Object();
    public final Object c;
    public final Object d;
    
    public a(r1 paramr1, Object paramObject1, Object paramObject2)
    {
      super();
      c = paramObject1;
      d = paramObject2;
    }
    
    public final int b(Object paramObject)
    {
      r1 localr1 = b;
      Object localObject1 = paramObject;
      if (e.equals(paramObject))
      {
        Object localObject2 = d;
        localObject1 = paramObject;
        if (localObject2 != null) {
          localObject1 = localObject2;
        }
      }
      return localr1.b(localObject1);
    }
    
    public final r1.b f(int paramInt, r1.b paramb, boolean paramBoolean)
    {
      b.f(paramInt, paramb, paramBoolean);
      if ((e0.a(b, d)) && (paramBoolean)) {
        b = e;
      }
      return paramb;
    }
    
    public final Object l(int paramInt)
    {
      Object localObject1 = b.l(paramInt);
      Object localObject2 = localObject1;
      if (e0.a(localObject1, d)) {
        localObject2 = e;
      }
      return localObject2;
    }
    
    public final r1.c n(int paramInt, r1.c paramc, long paramLong)
    {
      b.n(paramInt, paramc, paramLong);
      if (e0.a(a, c)) {
        a = r1.c.z;
      }
      return paramc;
    }
  }
  
  public static final class b
    extends r1
  {
    public final o0 b;
    
    public b(o0 paramo0)
    {
      b = paramo0;
    }
    
    public final int b(Object paramObject)
    {
      int i;
      if (paramObject == p.a.e) {
        i = 0;
      } else {
        i = -1;
      }
      return i;
    }
    
    public final r1.b f(int paramInt, r1.b paramb, boolean paramBoolean)
    {
      Object localObject = null;
      Integer localInteger;
      if (paramBoolean) {
        localInteger = Integer.valueOf(0);
      } else {
        localInteger = null;
      }
      if (paramBoolean) {
        localObject = p.a.e;
      }
      paramb.h(localInteger, localObject, 0, -9223372036854775807L, 0L, a5.a.o, true);
      return paramb;
    }
    
    public final int h()
    {
      return 1;
    }
    
    public final Object l(int paramInt)
    {
      return p.a.e;
    }
    
    public final r1.c n(int paramInt, r1.c paramc, long paramLong)
    {
      paramc.b(r1.c.z, b, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
      t = true;
      return paramc;
    }
    
    public final int o()
    {
      return 1;
    }
  }
}

/* Location:
 * Qualified Name:     z4.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */