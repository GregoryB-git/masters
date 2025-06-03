package com.google.ads.interactivemedia.v3.internal;

import android.util.Log;

final class gy
  implements gz
{
  private final long[] a;
  private final long[] b;
  private final long c;
  private final long d;
  
  private gy(long[] paramArrayOfLong1, long[] paramArrayOfLong2, long paramLong1, long paramLong2)
  {
    a = paramArrayOfLong1;
    b = paramArrayOfLong2;
    c = paramLong1;
    d = paramLong2;
  }
  
  public static gy a(long paramLong1, long paramLong2, gc paramgc, vy paramvy)
  {
    paramvy.d(10);
    int i = paramvy.l();
    if (i <= 0) {
      return null;
    }
    int j = d;
    long l1 = i;
    if (j >= 32000) {
      i = 1152;
    } else {
      i = 576;
    }
    long l2 = wl.c(l1, 1000000L * i, j);
    int k = paramvy.f();
    j = paramvy.f();
    int m = paramvy.f();
    paramvy.d(2);
    long l3 = paramLong2 + c;
    paramgc = new long[k];
    long[] arrayOfLong = new long[k];
    int n = 0;
    l1 = paramLong2;
    paramLong2 = l3;
    while (n < k)
    {
      paramgc[n] = (n * l2 / k);
      arrayOfLong[n] = Math.max(l1, paramLong2);
      if (m != 1)
      {
        if (m != 2)
        {
          if (m != 3)
          {
            if (m != 4) {
              return null;
            }
            i = paramvy.p();
          }
          else
          {
            i = paramvy.i();
          }
        }
        else {
          i = paramvy.f();
        }
      }
      else {
        i = paramvy.e();
      }
      l1 += i * j;
      n++;
    }
    if ((paramLong1 != -1L) && (paramLong1 != l1))
    {
      paramvy = new StringBuilder(67);
      paramvy.append("VBRI data size mismatch: ");
      paramvy.append(paramLong1);
      paramvy.append(", ");
      paramvy.append(l1);
      Log.w("VbriSeeker", paramvy.toString());
    }
    return new gy(paramgc, arrayOfLong, l2, l1);
  }
  
  public final gh a(long paramLong)
  {
    int i = wl.a(a, paramLong, true, true);
    gj localgj = new gj(a[i], b[i]);
    if ((b < paramLong) && (i != a.length - 1))
    {
      long[] arrayOfLong = a;
      i++;
      return new gh(localgj, new gj(arrayOfLong[i], b[i]));
    }
    return new gh(localgj);
  }
  
  public final boolean a()
  {
    return true;
  }
  
  public final long b()
  {
    return c;
  }
  
  public final long b(long paramLong)
  {
    return a[wl.a(b, paramLong, true, true)];
  }
  
  public final long c()
  {
    return d;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.gy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */