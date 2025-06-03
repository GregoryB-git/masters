package androidx.media3.exoplayer.hls;

import B0.b;
import android.os.Looper;
import d0.u;
import d0.u.g;
import d0.u.g.a;
import d0.u.h;
import g0.M;
import i0.g.a;
import i0.y;
import java.util.List;
import p0.A;
import p0.l;
import p0.x;
import q0.h;
import q0.i;
import r0.e;
import r0.f.b;
import r0.f.d;
import r0.f.e;
import r0.f.f;
import r0.k.a;
import r0.k.e;
import x0.E.a;
import x0.V;
import x0.x.a;
import x0.x.b;

public final class HlsMediaSource
  extends x0.a
  implements k.e
{
  public final h h;
  public final q0.g i;
  public final x0.j j;
  public final x k;
  public final B0.m l;
  public final boolean m;
  public final int n;
  public final boolean o;
  public final r0.k p;
  public final long q;
  public final long r;
  public u.g s;
  public y t;
  public u u;
  
  static
  {
    d0.v.a("media3.exoplayer.hls");
  }
  
  public HlsMediaSource(u paramu, q0.g paramg, h paramh, x0.j paramj, B0.f paramf, x paramx, B0.m paramm, r0.k paramk, long paramLong1, boolean paramBoolean1, int paramInt, boolean paramBoolean2, long paramLong2)
  {
    u = paramu;
    s = d;
    i = paramg;
    h = paramh;
    j = paramj;
    k = paramx;
    l = paramm;
    p = paramk;
    q = paramLong1;
    m = paramBoolean1;
    n = paramInt;
    o = paramBoolean2;
    r = paramLong2;
  }
  
  public static f.b E(List paramList, long paramLong)
  {
    Object localObject1 = null;
    int i1 = 0;
    while (i1 < paramList.size())
    {
      Object localObject2 = (f.b)paramList.get(i1);
      long l1 = s;
      if ((l1 > paramLong) || (!z))
      {
        localObject2 = localObject1;
        if (l1 > paramLong) {
          break;
        }
      }
      i1++;
      localObject1 = localObject2;
    }
    return (f.b)localObject1;
  }
  
  public static f.d F(List paramList, long paramLong)
  {
    return (f.d)paramList.get(M.f(paramList, Long.valueOf(paramLong), true, true));
  }
  
  public static long I(r0.f paramf, long paramLong)
  {
    f.f localf = v;
    long l1 = e;
    if (l1 != -9223372036854775807L)
    {
      l1 = u - l1;
    }
    else
    {
      l1 = d;
      if ((l1 == -9223372036854775807L) || (n == -9223372036854775807L))
      {
        l1 = c;
        if (l1 == -9223372036854775807L) {
          l1 = m * 3L;
        }
      }
    }
    return l1 + paramLong;
  }
  
  public void B()
  {
    p.stop();
    k.release();
  }
  
  public final V C(r0.f paramf, long paramLong1, long paramLong2, i parami)
  {
    long l1 = h - p.m();
    long l2;
    if (o) {
      l2 = l1 + u;
    } else {
      l2 = -9223372036854775807L;
    }
    long l3 = G(paramf);
    long l4 = s.a;
    if (l4 != -9223372036854775807L) {}
    for (l4 = M.J0(l4);; l4 = I(paramf, l3)) {
      break;
    }
    J(paramf, M.q(l4, l3, u + l3));
    l4 = H(paramf, l3);
    boolean bool;
    if ((d == 2) && (f)) {
      bool = true;
    } else {
      bool = false;
    }
    return new V(paramLong1, paramLong2, -9223372036854775807L, l2, u, l1, l4, true, o ^ true, bool, parami, a(), s);
  }
  
  public final V D(r0.f paramf, long paramLong1, long paramLong2, i parami)
  {
    long l1;
    if ((e != -9223372036854775807L) && (!r.isEmpty())) {
      if (!g)
      {
        l1 = e;
        if (l1 != u) {
          l1 = Fr, l1).s;
        }
      }
    }
    for (;;)
    {
      break;
      l1 = e;
      continue;
      l1 = 0L;
    }
    long l2 = u;
    return new V(paramLong1, paramLong2, -9223372036854775807L, l2, l2, 0L, l1, true, false, true, parami, a(), null);
  }
  
  public final long G(r0.f paramf)
  {
    long l1;
    if (p) {
      l1 = M.J0(M.d0(q)) - paramf.e();
    } else {
      l1 = 0L;
    }
    return l1;
  }
  
  public final long H(r0.f paramf, long paramLong)
  {
    long l1 = e;
    if (l1 != -9223372036854775807L) {
      paramLong = l1;
    } else {
      paramLong = u + paramLong - M.J0(s.a);
    }
    if (g) {
      return paramLong;
    }
    Object localObject = E(s, paramLong);
    if (localObject != null) {
      return s;
    }
    if (r.isEmpty()) {
      return 0L;
    }
    localObject = F(r, paramLong);
    paramf = E(A, paramLong);
    if (paramf != null) {
      return s;
    }
    return s;
  }
  
  public final void J(r0.f paramf, long paramLong)
  {
    u.g localg = ad;
    if ((d == -3.4028235E38F) && (e == -3.4028235E38F))
    {
      paramf = v;
      if ((c == -9223372036854775807L) && (d == -9223372036854775807L))
      {
        i1 = 1;
        break label67;
      }
    }
    int i1 = 0;
    label67:
    paramf = new u.g.a().k(M.i1(paramLong));
    float f1 = 1.0F;
    float f2;
    if (i1 != 0) {
      f2 = 1.0F;
    } else {
      f2 = s.d;
    }
    paramf = paramf.j(f2);
    if (i1 != 0) {
      f2 = f1;
    } else {
      f2 = s.e;
    }
    s = paramf.h(f2).f();
  }
  
  public u a()
  {
    try
    {
      u localu = u;
      return localu;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void b(r0.f paramf)
  {
    long l1;
    if (p) {
      l1 = M.i1(h);
    } else {
      l1 = -9223372036854775807L;
    }
    int i1 = d;
    long l2;
    if ((i1 != 2) && (i1 != 1)) {
      l2 = -9223372036854775807L;
    } else {
      l2 = l1;
    }
    i locali = new i((r0.g)g0.a.e(p.b()), paramf);
    if (p.a()) {
      paramf = C(paramf, l2, l1, locali);
    } else {
      paramf = D(paramf, l2, l1, locali);
    }
    A(paramf);
  }
  
  public void e(x0.v paramv)
  {
    ((q0.m)paramv).D();
  }
  
  public x0.v f(x.b paramb, b paramb1, long paramLong)
  {
    E.a locala = u(paramb);
    paramb = s(paramb);
    return new q0.m(h, p, i, t, null, k, paramb, l, locala, paramb1, j, m, n, o, x(), r);
  }
  
  public void h()
  {
    p.f();
  }
  
  public void l(u paramu)
  {
    try
    {
      u = paramu;
      return;
    }
    finally
    {
      paramu = finally;
      throw paramu;
    }
  }
  
  public void z(y paramy)
  {
    t = paramy;
    k.a((Looper)g0.a.e(Looper.myLooper()), x());
    k.g();
    paramy = u(null);
    p.e(eab)).a, paramy, this);
  }
  
  public static final class Factory
    implements x.a
  {
    public final q0.g a;
    public h b;
    public r0.j c;
    public k.a d;
    public x0.j e;
    public A f;
    public B0.m g;
    public boolean h;
    public int i;
    public boolean j;
    public long k;
    public long l;
    
    public Factory(g.a parama)
    {
      this(new q0.c(parama));
    }
    
    public Factory(q0.g paramg)
    {
      a = ((q0.g)g0.a.e(paramg));
      f = new l();
      c = new r0.a();
      d = r0.c.D;
      b = h.a;
      g = new B0.k();
      e = new x0.m();
      i = 1;
      k = -9223372036854775807L;
      h = true;
      b(true);
    }
    
    public HlsMediaSource a(u paramu)
    {
      g0.a.e(b);
      Object localObject1 = c;
      Object localObject2 = b.d;
      if (!((List)localObject2).isEmpty()) {
        localObject1 = new e((r0.j)localObject1, (List)localObject2);
      }
      q0.g localg = a;
      h localh = b;
      localObject2 = e;
      x localx = f.a(paramu);
      B0.m localm = g;
      return new HlsMediaSource(paramu, localg, localh, (x0.j)localObject2, null, localx, localm, d.a(a, localm, (r0.j)localObject1), k, h, i, j, l, null);
    }
    
    public Factory b(boolean paramBoolean)
    {
      b.a(paramBoolean);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.media3.exoplayer.hls.HlsMediaSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */