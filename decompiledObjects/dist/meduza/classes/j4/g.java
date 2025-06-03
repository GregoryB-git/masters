package j4;

import c4.t.a;
import c4.u;
import v5.e0;
import x6.b;

public final class g
  implements e
{
  public final long a;
  public final int b;
  public final long c;
  public final long d;
  public final long e;
  public final long[] f;
  
  public g(long paramLong1, int paramInt, long paramLong2, long paramLong3, long[] paramArrayOfLong)
  {
    a = paramLong1;
    b = paramInt;
    c = paramLong2;
    f = paramArrayOfLong;
    d = paramLong3;
    paramLong2 = -1L;
    if (paramLong3 == -1L) {
      paramLong1 = paramLong2;
    } else {
      paramLong1 += paramLong3;
    }
    e = paramLong1;
  }
  
  public final long a(long paramLong)
  {
    paramLong -= a;
    if ((e()) && (paramLong > b))
    {
      long[] arrayOfLong = f;
      b.K(arrayOfLong);
      double d1 = paramLong * 256.0D / d;
      int i = e0.f(arrayOfLong, d1, true);
      paramLong = c;
      long l1 = i * paramLong / 100L;
      long l2 = arrayOfLong[i];
      int j = i + 1;
      long l3 = paramLong * j / 100L;
      if (i == 99) {
        paramLong = 256L;
      } else {
        paramLong = arrayOfLong[j];
      }
      if (l2 == paramLong) {
        d1 = 0.0D;
      } else {
        d1 = (d1 - l2) / (paramLong - l2);
      }
      return Math.round(d1 * (l3 - l1)) + l1;
    }
    return 0L;
  }
  
  public final long c()
  {
    return e;
  }
  
  public final boolean e()
  {
    boolean bool;
    if (f != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final t.a g(long paramLong)
  {
    if (!e())
    {
      localObject = new u(0L, a + b);
      return new t.a((u)localObject, (u)localObject);
    }
    long l = e0.j(paramLong, 0L, c);
    double d1 = l * 100.0D / c;
    double d2 = 0.0D;
    if (d1 > 0.0D) {
      if (d1 >= 100.0D)
      {
        d2 = 256.0D;
      }
      else
      {
        int i = (int)d1;
        localObject = f;
        b.K(localObject);
        double d3 = localObject[i];
        if (i == 99) {
          d2 = 256.0D;
        } else {
          d2 = localObject[(i + 1)];
        }
        d2 = d3 + (d2 - d3) * (d1 - i);
      }
    }
    paramLong = e0.j(Math.round(d2 / 256.0D * d), b, d - 1L);
    Object localObject = new u(l, a + paramLong);
    return new t.a((u)localObject, (u)localObject);
  }
  
  public final long h()
  {
    return c;
  }
}

/* Location:
 * Qualified Name:     j4.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */