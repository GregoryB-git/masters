package com.google.ads.interactivemedia.v3.internal;

import android.util.Pair;

final class gu
  implements gz
{
  private final long[] a;
  private final long[] b;
  private final long c;
  
  private gu(long[] paramArrayOfLong1, long[] paramArrayOfLong2)
  {
    a = paramArrayOfLong1;
    b = paramArrayOfLong2;
    c = av.b(paramArrayOfLong2[(paramArrayOfLong2.length - 1)]);
  }
  
  private static Pair<Long, Long> a(long paramLong, long[] paramArrayOfLong1, long[] paramArrayOfLong2)
  {
    int i = wl.a(paramArrayOfLong1, paramLong, true, true);
    long l1 = paramArrayOfLong1[i];
    long l2 = paramArrayOfLong2[i];
    i++;
    if (i == paramArrayOfLong1.length) {
      return Pair.create(Long.valueOf(l1), Long.valueOf(l2));
    }
    long l3 = paramArrayOfLong1[i];
    long l4 = paramArrayOfLong2[i];
    double d;
    if (l3 == l1) {
      d = 0.0D;
    } else {
      d = (paramLong - l1) / (l3 - l1);
    }
    return Pair.create(Long.valueOf(paramLong), Long.valueOf((d * (l4 - l2)) + l2));
  }
  
  public static gu a(long paramLong, lf paramlf)
  {
    int i = d.length;
    int j = i + 1;
    long[] arrayOfLong1 = new long[j];
    long[] arrayOfLong2 = new long[j];
    arrayOfLong1[0] = paramLong;
    long l = 0L;
    arrayOfLong2[0] = 0L;
    for (j = 1; j <= i; j++)
    {
      int k = a;
      int[] arrayOfInt = d;
      int m = j - 1;
      paramLong += k + arrayOfInt[m];
      l += b + e[m];
      arrayOfLong1[j] = paramLong;
      arrayOfLong2[j] = l;
    }
    return new gu(arrayOfLong1, arrayOfLong2);
  }
  
  public final gh a(long paramLong)
  {
    Pair localPair = a(av.a(wl.a(paramLong, 0L, c)), b, a);
    return new gh(new gj(av.b(((Long)first).longValue()), ((Long)second).longValue()));
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
    return av.b(((Long)aa, b).second).longValue());
  }
  
  public final long c()
  {
    return -1L;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.gu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */