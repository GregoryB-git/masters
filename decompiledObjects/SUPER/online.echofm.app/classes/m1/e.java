package m1;

import F0.M.a;
import F0.N;

public final class e
  implements F0.M
{
  public final c a;
  public final int b;
  public final long c;
  public final long d;
  public final long e;
  
  public e(c paramc, int paramInt, long paramLong1, long paramLong2)
  {
    a = paramc;
    b = paramInt;
    c = paramLong1;
    paramLong1 = (paramLong2 - paramLong1) / e;
    d = paramLong1;
    e = a(paramLong1);
  }
  
  public final long a(long paramLong)
  {
    return g0.M.W0(paramLong * b, 1000000L, a.c);
  }
  
  public boolean h()
  {
    return true;
  }
  
  public M.a j(long paramLong)
  {
    long l1 = g0.M.q(a.c * paramLong / (b * 1000000L), 0L, d - 1L);
    long l2 = c;
    long l3 = a.e;
    long l4 = a(l1);
    N localN = new N(l4, l2 + l3 * l1);
    if ((l4 < paramLong) && (l1 != d - 1L))
    {
      l3 = l1 + 1L;
      paramLong = c;
      l1 = a.e;
      return new M.a(localN, new N(a(l3), paramLong + l1 * l3));
    }
    return new M.a(localN);
  }
  
  public long l()
  {
    return e;
  }
}

/* Location:
 * Qualified Name:     m1.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */