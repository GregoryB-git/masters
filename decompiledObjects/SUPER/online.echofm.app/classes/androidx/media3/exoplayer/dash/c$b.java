package androidx.media3.exoplayer.dash;

import g0.a;
import n0.g;
import o0.i;
import o0.j;
import y0.f;

public final class c$b
{
  public final f a;
  public final j b;
  public final o0.b c;
  public final g d;
  public final long e;
  public final long f;
  
  public c$b(long paramLong1, j paramj, o0.b paramb, f paramf, long paramLong2, g paramg)
  {
    e = paramLong1;
    b = paramj;
    c = paramb;
    f = paramLong2;
    a = paramf;
    d = paramg;
  }
  
  public b b(long paramLong, j paramj)
  {
    g localg1 = b.l();
    g localg2 = paramj.l();
    if (localg1 == null) {
      return new b(paramLong, paramj, c, a, f, localg1);
    }
    if (!localg1.g()) {
      return new b(paramLong, paramj, c, a, f, localg2);
    }
    long l1 = localg1.i(paramLong);
    if (l1 == 0L) {
      return new b(paramLong, paramj, c, a, f, localg2);
    }
    a.h(localg2);
    long l2 = localg1.h();
    long l3 = localg1.c(l2);
    l1 += l2;
    long l4 = l1 - 1L;
    long l5 = localg1.c(l4);
    long l6 = localg1.b(l4, paramLong);
    long l7 = localg2.h();
    long l8 = localg2.c(l7);
    l4 = f;
    boolean bool = l5 + l6 < l8;
    if (!bool) {}
    for (;;)
    {
      for (l1 = l4 + (l1 - l7);; l1 = l4 - (localg2.a(l3, paramLong) - l2))
      {
        break label284;
        if (bool) {
          break label306;
        }
        if (l8 >= l3) {
          break;
        }
      }
      l1 = localg1.a(l8, paramLong);
    }
    label284:
    return new b(paramLong, paramj, c, a, l1, localg2);
    label306:
    throw new x0.b();
  }
  
  public b c(g paramg)
  {
    return new b(e, b, c, a, f, paramg);
  }
  
  public b d(o0.b paramb)
  {
    return new b(e, b, paramb, a, f, d);
  }
  
  public long e(long paramLong)
  {
    return ((g)a.h(d)).d(e, paramLong) + f;
  }
  
  public long f()
  {
    return ((g)a.h(d)).h() + f;
  }
  
  public long g(long paramLong)
  {
    return e(paramLong) + ((g)a.h(d)).j(e, paramLong) - 1L;
  }
  
  public long h()
  {
    return ((g)a.h(d)).i(e);
  }
  
  public long i(long paramLong)
  {
    return k(paramLong) + ((g)a.h(d)).b(paramLong - f, e);
  }
  
  public long j(long paramLong)
  {
    return ((g)a.h(d)).a(paramLong, e) + f;
  }
  
  public long k(long paramLong)
  {
    return ((g)a.h(d)).c(paramLong - f);
  }
  
  public i l(long paramLong)
  {
    return ((g)a.h(d)).f(paramLong - f);
  }
  
  public boolean m(long paramLong1, long paramLong2)
  {
    boolean bool1 = ((g)a.h(d)).g();
    boolean bool2 = true;
    if (bool1) {
      return true;
    }
    bool1 = bool2;
    if (paramLong2 != -9223372036854775807L) {
      if (i(paramLong1) <= paramLong2) {
        bool1 = bool2;
      } else {
        bool1 = false;
      }
    }
    return bool1;
  }
}

/* Location:
 * Qualified Name:     androidx.media3.exoplayer.dash.c.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */