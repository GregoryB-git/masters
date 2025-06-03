package y0;

import j0.i;
import k0.v0;
import x0.E.a;
import x0.P;
import x0.Q;

public final class h$a
  implements Q
{
  public final h o;
  public final P p;
  public final int q;
  public boolean r;
  
  public h$a(h paramh1, h paramh2, P paramP, int paramInt)
  {
    o = paramh2;
    p = paramP;
    q = paramInt;
  }
  
  public void a() {}
  
  public final void b()
  {
    if (!r)
    {
      h.A(s).h(h.x(s)[q], h.y(s)[q], 0, null, h.z(s));
      r = true;
    }
  }
  
  public void c()
  {
    g0.a.f(h.w(s)[q]);
    h.w(s)[q] = 0;
  }
  
  public boolean e()
  {
    boolean bool;
    if ((!s.I()) && (p.L(s.K))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int j(v0 paramv0, i parami, int paramInt)
  {
    if (s.I()) {
      return -3;
    }
    if ((h.v(s) != null) && (h.v(s).i(q + 1) <= p.D())) {
      return -3;
    }
    b();
    return p.T(paramv0, parami, paramInt, s.K);
  }
  
  public int m(long paramLong)
  {
    if (s.I()) {
      return 0;
    }
    int i = p.F(paramLong, s.K);
    int j = i;
    if (h.v(s) != null) {
      j = Math.min(i, h.v(s).i(q + 1) - p.D());
    }
    p.f0(j);
    if (j > 0) {
      b();
    }
    return j;
  }
}

/* Location:
 * Qualified Name:     y0.h.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */