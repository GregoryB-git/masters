package Y0;

import F0.I.a;
import F0.M.a;
import F0.N;
import g0.M;
import g0.a;

public final class j
  implements g
{
  public final long a;
  public final int b;
  public final long c;
  public final int d;
  public final long e;
  public final long f;
  public final long[] g;
  
  public j(long paramLong1, int paramInt1, long paramLong2, int paramInt2)
  {
    this(paramLong1, paramInt1, paramLong2, paramInt2, -1L, null);
  }
  
  public j(long paramLong1, int paramInt1, long paramLong2, int paramInt2, long paramLong3, long[] paramArrayOfLong)
  {
    a = paramLong1;
    b = paramInt1;
    c = paramLong2;
    d = paramInt2;
    e = paramLong3;
    g = paramArrayOfLong;
    paramLong2 = -1L;
    if (paramLong3 == -1L) {
      paramLong1 = paramLong2;
    } else {
      paramLong1 += paramLong3;
    }
    f = paramLong1;
  }
  
  public static j a(i parami, long paramLong)
  {
    long l1 = parami.a();
    if (l1 == -9223372036854775807L) {
      return null;
    }
    long l2 = c;
    if (l2 != -1L)
    {
      long[] arrayOfLong = f;
      if (arrayOfLong != null)
      {
        parami = a;
        return new j(paramLong, c, l1, f, l2, arrayOfLong);
      }
    }
    parami = a;
    return new j(paramLong, c, l1, f);
  }
  
  public final long b(int paramInt)
  {
    return c * paramInt / 100L;
  }
  
  public long c(long paramLong)
  {
    paramLong -= a;
    if ((h()) && (paramLong > b))
    {
      long[] arrayOfLong = (long[])a.h(g);
      double d1 = paramLong * 256.0D / e;
      int i = M.h(arrayOfLong, d1, true, true);
      long l1 = b(i);
      long l2 = arrayOfLong[i];
      int j = i + 1;
      long l3 = b(j);
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
      return l1 + Math.round(d1 * (l3 - l1));
    }
    return 0L;
  }
  
  public long f()
  {
    return f;
  }
  
  public boolean h()
  {
    boolean bool;
    if (g != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public M.a j(long paramLong)
  {
    if (!h()) {
      return new M.a(new N(0L, a + b));
    }
    long l = M.q(paramLong, 0L, c);
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
        long[] arrayOfLong = (long[])a.h(g);
        double d3 = arrayOfLong[i];
        if (i == 99) {
          d2 = 256.0D;
        } else {
          d2 = arrayOfLong[(i + 1)];
        }
        d2 = d3 + (d1 - i) * (d2 - d3);
      }
    }
    paramLong = M.q(Math.round(d2 / 256.0D * e), b, e - 1L);
    return new M.a(new N(l, a + paramLong));
  }
  
  public int k()
  {
    return d;
  }
  
  public long l()
  {
    return c;
  }
}

/* Location:
 * Qualified Name:     Y0.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */