package l1;

import F0.e.e;
import F0.e.f;
import F0.s;
import g0.E;
import g0.M;

public final class z$b
  implements e.f
{
  public final E a;
  public final g0.z b;
  
  public z$b(E paramE)
  {
    a = paramE;
    b = new g0.z();
  }
  
  public static void d(g0.z paramz)
  {
    int i = paramz.g();
    if (paramz.a() < 10)
    {
      paramz.T(i);
      return;
    }
    paramz.U(9);
    int j = paramz.G() & 0x7;
    if (paramz.a() < j)
    {
      paramz.T(i);
      return;
    }
    paramz.U(j);
    if (paramz.a() < 4)
    {
      paramz.T(i);
      return;
    }
    if (z.j(paramz.e(), paramz.f()) == 443)
    {
      paramz.U(4);
      j = paramz.M();
      if (paramz.a() < j)
      {
        paramz.T(i);
        return;
      }
      paramz.U(j);
    }
    while (paramz.a() >= 4)
    {
      j = z.j(paramz.e(), paramz.f());
      if ((j == 442) || (j == 441) || (j >>> 8 != 1)) {
        break;
      }
      paramz.U(4);
      if (paramz.a() < 2)
      {
        paramz.T(i);
        return;
      }
      j = paramz.M();
      paramz.T(Math.min(paramz.g(), paramz.f() + j));
    }
  }
  
  public e.e a(s params, long paramLong)
  {
    long l = params.p();
    int i = (int)Math.min(20000L, params.a() - l);
    b.P(i);
    params.n(b.e(), 0, i);
    return c(b, paramLong, l);
  }
  
  public void b()
  {
    b.Q(M.f);
  }
  
  public final e.e c(g0.z paramz, long paramLong1, long paramLong2)
  {
    int i = -1;
    int j = -1;
    long l1 = -9223372036854775807L;
    while (paramz.a() >= 4) {
      if (z.j(paramz.e(), paramz.f()) != 442)
      {
        paramz.U(1);
      }
      else
      {
        paramz.U(4);
        long l2 = A.l(paramz);
        int k = j;
        long l3 = l1;
        if (l2 != -9223372036854775807L)
        {
          l3 = a.b(l2);
          if (l3 > paramLong1)
          {
            if (l1 == -9223372036854775807L) {
              return e.e.d(l3, paramLong2);
            }
            return e.e.e(paramLong2 + j);
          }
          if (100000L + l3 > paramLong1) {
            return e.e.e(paramLong2 + paramz.f());
          }
          k = paramz.f();
        }
        d(paramz);
        i = paramz.f();
        j = k;
        l1 = l3;
      }
    }
    if (l1 != -9223372036854775807L) {
      return e.e.f(l1, paramLong2 + i);
    }
    return e.e.d;
  }
}

/* Location:
 * Qualified Name:     l1.z.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */