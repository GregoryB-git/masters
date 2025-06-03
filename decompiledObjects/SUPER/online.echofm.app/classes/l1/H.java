package l1;

import F0.s;
import g0.E;
import g0.M;
import g0.z;

public final class H
{
  public final int a;
  public final E b;
  public final z c;
  public boolean d;
  public boolean e;
  public boolean f;
  public long g;
  public long h;
  public long i;
  
  public H(int paramInt)
  {
    a = paramInt;
    b = new E(0L);
    g = -9223372036854775807L;
    h = -9223372036854775807L;
    i = -9223372036854775807L;
    c = new z();
  }
  
  public final int a(s params)
  {
    c.Q(M.f);
    d = true;
    params.h();
    return 0;
  }
  
  public long b()
  {
    return i;
  }
  
  public E c()
  {
    return b;
  }
  
  public boolean d()
  {
    return d;
  }
  
  public int e(s params, F0.L paramL, int paramInt)
  {
    if (paramInt <= 0) {
      return a(params);
    }
    if (!f) {
      return h(params, paramL, paramInt);
    }
    if (h == -9223372036854775807L) {
      return a(params);
    }
    if (!e) {
      return f(params, paramL, paramInt);
    }
    long l = g;
    if (l == -9223372036854775807L) {
      return a(params);
    }
    l = b.b(l);
    i = (b.c(h) - l);
    return a(params);
  }
  
  public final int f(s params, F0.L paramL, int paramInt)
  {
    int j = (int)Math.min(a, params.a());
    long l1 = params.p();
    long l2 = 0;
    if (l1 != l2)
    {
      a = l2;
      return 1;
    }
    c.P(j);
    params.h();
    params.n(c.e(), 0, j);
    g = g(c, paramInt);
    e = true;
    return 0;
  }
  
  public final long g(z paramz, int paramInt)
  {
    int j = paramz.f();
    int k = paramz.g();
    while (j < k)
    {
      if (paramz.e()[j] == 71)
      {
        long l = L.c(paramz, j, paramInt);
        if (l != -9223372036854775807L) {
          return l;
        }
      }
      j++;
    }
    return -9223372036854775807L;
  }
  
  public final int h(s params, F0.L paramL, int paramInt)
  {
    long l = params.a();
    int j = (int)Math.min(a, l);
    l -= j;
    if (params.p() != l)
    {
      a = l;
      return 1;
    }
    c.P(j);
    params.h();
    params.n(c.e(), 0, j);
    h = i(c, paramInt);
    f = true;
    return 0;
  }
  
  public final long i(z paramz, int paramInt)
  {
    int j = paramz.f();
    int k = paramz.g();
    for (int m = k - 188; m >= j; m--) {
      if (L.b(paramz.e(), j, k, m))
      {
        long l = L.c(paramz, m, paramInt);
        if (l != -9223372036854775807L) {
          return l;
        }
      }
    }
    return -9223372036854775807L;
  }
}

/* Location:
 * Qualified Name:     l1.H
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */