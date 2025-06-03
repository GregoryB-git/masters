package a1;

import F0.M.a;
import F0.N;
import F0.s;
import F0.u;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;

public final class a
  implements g
{
  public final f a;
  public final long b;
  public final long c;
  public final i d;
  public int e;
  public long f;
  public long g;
  public long h;
  public long i;
  public long j;
  public long k;
  public long l;
  
  public a(i parami, long paramLong1, long paramLong2, long paramLong3, long paramLong4, boolean paramBoolean)
  {
    boolean bool;
    if ((paramLong1 >= 0L) && (paramLong2 > paramLong1)) {
      bool = true;
    } else {
      bool = false;
    }
    g0.a.a(bool);
    d = parami;
    b = paramLong1;
    c = paramLong2;
    if ((paramLong3 != paramLong2 - paramLong1) && (!paramBoolean))
    {
      e = 0;
    }
    else
    {
      f = paramLong4;
      e = 4;
    }
    a = new f();
  }
  
  public void b(long paramLong)
  {
    h = g0.M.q(paramLong, 0L, f - 1L);
    e = 2;
    i = b;
    j = c;
    k = 0L;
    l = f;
  }
  
  public long c(s params)
  {
    int m = e;
    long l1;
    if (m != 0)
    {
      if (m != 1)
      {
        if (m != 2)
        {
          if (m != 3)
          {
            if (m == 4) {
              return -1L;
            }
            throw new IllegalStateException();
          }
        }
        else
        {
          l1 = i(params);
          if (l1 != -1L) {
            return l1;
          }
          e = 3;
        }
        k(params);
        e = 4;
        return -(k + 2L);
      }
    }
    else
    {
      l1 = params.p();
      g = l1;
      e = 1;
      long l2 = c - 65307L;
      if (l2 > l1) {
        return l2;
      }
    }
    f = j(params);
    e = 4;
    return g;
  }
  
  public b h()
  {
    long l1 = f;
    b localb = null;
    if (l1 != 0L) {
      localb = new b(null);
    }
    return localb;
  }
  
  public final long i(s params)
  {
    if (i == j) {
      return -1L;
    }
    long l1 = params.p();
    if (!a.d(params, j))
    {
      l2 = i;
      if (l2 != l1) {
        return l2;
      }
      throw new IOException("No ogg page can be found.");
    }
    a.a(params, false);
    params.h();
    long l2 = h;
    f localf = a;
    long l3 = c;
    l2 -= l3;
    int m = h + i;
    if ((0L <= l2) && (l2 < 72000L)) {
      return -1L;
    }
    boolean bool = l2 < 0L;
    if (bool)
    {
      j = l1;
      l = l3;
    }
    else
    {
      i = (params.p() + m);
      k = a.c;
    }
    l1 = j;
    l3 = i;
    if (l1 - l3 < 100000L)
    {
      j = l3;
      return l3;
    }
    l3 = m;
    if (!bool) {
      l1 = 2L;
    } else {
      l1 = 1L;
    }
    long l4 = params.p();
    long l5 = j;
    long l6 = i;
    return g0.M.q(l4 - l3 * l1 + l2 * (l5 - l6) / (l - k), l6, l5 - 1L);
  }
  
  public long j(s params)
  {
    a.b();
    if (a.c(params))
    {
      a.a(params, false);
      f localf = a;
      params.i(h + i);
      long l1;
      do
      {
        l1 = a.c;
        localf = a;
        if (((b & 0x4) == 4) || (!localf.c(params)) || (params.p() >= c) || (!a.a(params, true))) {
          break;
        }
        localf = a;
      } while (u.e(params, h + i));
      return l1;
    }
    throw new EOFException();
  }
  
  public final void k(s params)
  {
    for (;;)
    {
      a.c(params);
      a.a(params, false);
      f localf = a;
      if (c > h)
      {
        params.h();
        return;
      }
      params.i(h + i);
      i = params.p();
      k = a.c;
    }
  }
  
  public final class b
    implements F0.M
  {
    public b() {}
    
    public boolean h()
    {
      return true;
    }
    
    public M.a j(long paramLong)
    {
      long l = a.d(a.this).c(paramLong);
      return new M.a(new N(paramLong, g0.M.q(a.e(a.this) + BigInteger.valueOf(l).multiply(BigInteger.valueOf(a.g(a.this) - a.e(a.this))).divide(BigInteger.valueOf(a.f(a.this))).longValue() - 30000L, a.e(a.this), a.g(a.this) - 1L)));
    }
    
    public long l()
    {
      return a.d(a.this).b(a.f(a.this));
    }
  }
}

/* Location:
 * Qualified Name:     a1.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */