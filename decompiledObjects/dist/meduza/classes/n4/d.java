package n4;

import c4.t;
import c4.t.a;
import c4.u;
import v5.e0;

public final class d
  implements t
{
  public final b a;
  public final int b;
  public final long c;
  public final long d;
  public final long e;
  
  public d(b paramb, int paramInt, long paramLong1, long paramLong2)
  {
    a = paramb;
    b = paramInt;
    c = paramLong1;
    paramLong1 = (paramLong2 - paramLong1) / c;
    d = paramLong1;
    e = b(paramLong1);
  }
  
  public final long b(long paramLong)
  {
    return e0.O(paramLong * b, 1000000L, a.b);
  }
  
  public final boolean e()
  {
    return true;
  }
  
  public final t.a g(long paramLong)
  {
    long l1 = e0.j(a.b * paramLong / (b * 1000000L), 0L, d - 1L);
    long l2 = c;
    long l3 = a.c;
    long l4 = b(l1);
    u localu = new u(l4, l3 * l1 + l2);
    if ((l4 < paramLong) && (l1 != d - 1L))
    {
      paramLong = l1 + 1L;
      l4 = c;
      l1 = a.c;
      return new t.a(localu, new u(b(paramLong), l1 * paramLong + l4));
    }
    return new t.a(localu, localu);
  }
  
  public final long h()
  {
    return e;
  }
}

/* Location:
 * Qualified Name:     n4.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */