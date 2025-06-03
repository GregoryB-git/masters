package com.google.ads.interactivemedia.v3.internal;

import android.util.Log;

final class hb
  implements gz
{
  private final long a;
  private final int b;
  private final long c;
  private final long d;
  private final long e;
  private final long[] f;
  
  private hb(long paramLong1, int paramInt, long paramLong2)
  {
    this(paramLong1, paramInt, paramLong2, -1L, null);
  }
  
  private hb(long paramLong1, int paramInt, long paramLong2, long paramLong3, long[] paramArrayOfLong)
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
  
  private final long a(int paramInt)
  {
    return c * paramInt / 100L;
  }
  
  public static hb a(long paramLong1, long paramLong2, gc paramgc, vy paramvy)
  {
    int i = g;
    int j = d;
    int k = paramvy.l();
    if ((k & 0x1) == 1)
    {
      int m = paramvy.p();
      if (m != 0)
      {
        long l1 = wl.c(m, i * 1000000L, j);
        if ((k & 0x6) != 6) {
          return new hb(paramLong2, c, l1);
        }
        long l2 = paramvy.p();
        long[] arrayOfLong = new long[100];
        for (j = 0; j < 100; j++) {
          arrayOfLong[j] = paramvy.e();
        }
        if (paramLong1 != -1L)
        {
          long l3 = paramLong2 + l2;
          if (paramLong1 != l3)
          {
            paramvy = new StringBuilder(67);
            paramvy.append("XING data size mismatch: ");
            paramvy.append(paramLong1);
            paramvy.append(", ");
            paramvy.append(l3);
            Log.w("XingSeeker", paramvy.toString());
          }
        }
        return new hb(paramLong2, c, l1, l2, arrayOfLong);
      }
    }
    return null;
  }
  
  public final gh a(long paramLong)
  {
    if (!a()) {
      return new gh(new gj(0L, a + b));
    }
    long l = wl.a(paramLong, 0L, c);
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
        long[] arrayOfLong = (long[])rp.a(f);
        double d3 = arrayOfLong[i];
        if (i == 99) {
          d2 = 256.0D;
        } else {
          d2 = arrayOfLong[(i + 1)];
        }
        d2 = d3 + (d2 - d3) * (d1 - i);
      }
    }
    paramLong = wl.a(Math.round(d2 / 256.0D * d), b, d - 1L);
    return new gh(new gj(l, a + paramLong));
  }
  
  public final boolean a()
  {
    return f != null;
  }
  
  public final long b()
  {
    return c;
  }
  
  public final long b(long paramLong)
  {
    paramLong -= a;
    if ((a()) && (paramLong > b))
    {
      long[] arrayOfLong = (long[])rp.a(f);
      double d1 = paramLong * 256.0D / d;
      int i = wl.a(arrayOfLong, d1, true, true);
      long l1 = a(i);
      long l2 = arrayOfLong[i];
      int j = i + 1;
      long l3 = a(j);
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
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.hb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */