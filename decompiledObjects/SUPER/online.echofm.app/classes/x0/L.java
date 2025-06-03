package x0;

import B0.b;
import B0.k;
import B0.m;
import android.os.Looper;
import d0.I;
import d0.I.b;
import d0.I.c;
import d0.u;
import d0.u.h;
import i0.g;
import i0.g.a;
import i0.y;
import p0.A;
import p0.l;

public final class L
  extends a
  implements K.c
{
  public final g.a h;
  public final F.a i;
  public final p0.x j;
  public final m k;
  public final int l;
  public boolean m;
  public long n;
  public boolean o;
  public boolean p;
  public y q;
  public u r;
  
  public L(u paramu, g.a parama, F.a parama1, p0.x paramx, m paramm, int paramInt)
  {
    r = paramu;
    h = parama;
    i = parama1;
    j = paramx;
    k = paramm;
    l = paramInt;
    m = true;
    n = -9223372036854775807L;
  }
  
  public void B()
  {
    j.release();
  }
  
  public final u.h C()
  {
    return (u.h)g0.a.e(ab);
  }
  
  public final void D()
  {
    V localV = new V(n, o, false, p, null, a());
    Object localObject = localV;
    if (m) {
      localObject = new a(localV);
    }
    A((I)localObject);
  }
  
  public u a()
  {
    try
    {
      u localu = r;
      return localu;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void e(v paramv)
  {
    ((K)paramv).g0();
  }
  
  public v f(x.b paramb, b paramb1, long paramLong)
  {
    g localg = h.a();
    Object localObject = q;
    if (localObject != null) {
      localg.c((y)localObject);
    }
    localObject = C();
    return new K(a, localg, i.a(x()), j, s(paramb), k, u(paramb), this, paramb1, e, l, g0.M.J0(i));
  }
  
  public void h() {}
  
  public void l(u paramu)
  {
    try
    {
      r = paramu;
      return;
    }
    finally
    {
      paramu = finally;
      throw paramu;
    }
  }
  
  public void q(long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    long l1 = paramLong;
    if (paramLong == -9223372036854775807L) {
      l1 = n;
    }
    if ((!m) && (n == l1) && (o == paramBoolean1) && (p == paramBoolean2)) {
      return;
    }
    n = l1;
    o = paramBoolean1;
    p = paramBoolean2;
    m = false;
    D();
  }
  
  public void z(y paramy)
  {
    q = paramy;
    j.a((Looper)g0.a.e(Looper.myLooper()), x());
    j.g();
    D();
  }
  
  public class a
    extends p
  {
    public a(I paramI)
    {
      super();
    }
    
    public I.b g(int paramInt, I.b paramb, boolean paramBoolean)
    {
      super.g(paramInt, paramb, paramBoolean);
      f = true;
      return paramb;
    }
    
    public I.c o(int paramInt, I.c paramc, long paramLong)
    {
      super.o(paramInt, paramc, paramLong);
      k = true;
      return paramc;
    }
  }
  
  public static final class b
    implements x.a
  {
    public final g.a a;
    public F.a b;
    public A c;
    public m d;
    public int e;
    
    public b(g.a parama, F0.x paramx)
    {
      this(parama, new M(paramx));
    }
    
    public b(g.a parama, F.a parama1)
    {
      this(parama, parama1, new l(), new k(), 1048576);
    }
    
    public b(g.a parama, F.a parama1, A paramA, m paramm, int paramInt)
    {
      a = parama;
      b = parama1;
      c = paramA;
      d = paramm;
      e = paramInt;
    }
    
    public L b(u paramu)
    {
      g0.a.e(b);
      return new L(paramu, a, b, c.a(paramu), d, e, null);
    }
  }
}

/* Location:
 * Qualified Name:     x0.L
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */