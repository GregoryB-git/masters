package com.google.ads.interactivemedia.v3.internal;

import java.util.List;

public final class sl
  extends sn
{
  private final so c;
  private final long d;
  private final long e;
  private final long f;
  private final float g;
  private final long h;
  private final vh i;
  private float j;
  private int k;
  private int l;
  private long m;
  
  private sl(od paramod, int[] paramArrayOfInt, so paramso, long paramLong1, long paramLong2, long paramLong3, float paramFloat, long paramLong4, vh paramvh)
  {
    super(paramod, paramArrayOfInt);
    c = paramso;
    d = (paramLong1 * 1000L);
    e = (paramLong2 * 1000L);
    f = (paramLong3 * 1000L);
    g = paramFloat;
    h = paramLong4;
    i = paramvh;
    j = 1.0F;
    l = 0;
    m = -9223372036854775807L;
  }
  
  private final int a(long paramLong)
  {
    long l1 = c.a();
    int n = 0;
    int i1 = n;
    while (n < a)
    {
      if ((paramLong == Long.MIN_VALUE) || (!b(n, paramLong)))
      {
        i1 = ae;
        float f1 = j;
        if (Math.round(i1 * f1) <= l1) {
          i1 = 1;
        } else {
          i1 = 0;
        }
        if (i1 != 0) {
          return n;
        }
        i1 = n;
      }
      n++;
    }
    return i1;
  }
  
  private static void a(long[][][] paramArrayOfLong, int paramInt, long[][] paramArrayOfLong1, int[] paramArrayOfInt)
  {
    long l1 = 0L;
    for (int n = 0; n < paramArrayOfLong.length; n++)
    {
      long[] arrayOfLong = paramArrayOfLong[n][paramInt];
      long l2 = paramArrayOfLong1[n][paramArrayOfInt[n]];
      arrayOfLong[1] = l2;
      l1 += l2;
    }
    int i1 = paramArrayOfLong.length;
    for (n = 0; n < i1; n++) {
      paramArrayOfLong[n][paramInt][0] = l1;
    }
  }
  
  private static long[][][] c(long[][] paramArrayOfLong)
  {
    int n = paramArrayOfLong.length;
    Object localObject1 = new double[n][];
    double d1;
    for (int i1 = 0; i1 < paramArrayOfLong.length; i1++)
    {
      localObject1[i1] = new double[paramArrayOfLong[i1].length];
      for (i2 = 0;; i2++)
      {
        localObject2 = paramArrayOfLong[i1];
        if (i2 >= localObject2.length) {
          break;
        }
        localObject3 = localObject1[i1];
        long l1 = localObject2[i2];
        if (l1 == -1L) {
          d1 = 0.0D;
        } else {
          d1 = Math.log(l1);
        }
        localObject3[i2] = d1;
      }
    }
    Object localObject2 = new double[n][];
    double d2;
    int i3;
    double d3;
    for (i1 = 0; i1 < n; i1++)
    {
      localObject3 = new double[localObject1[i1].length - 1];
      localObject2[i1] = localObject3;
      if (localObject3.length != 0)
      {
        localObject3 = localObject1[i1];
        d2 = localObject3[(localObject3.length - 1)] - localObject3[0];
        for (i2 = 0;; i2 = i3)
        {
          arrayOfInt = localObject1[i1];
          if (i2 >= arrayOfInt.length - 1) {
            break;
          }
          d1 = arrayOfInt[i2];
          i3 = i2 + 1;
          d3 = arrayOfInt[i3];
          localObject3 = localObject2[i1];
          if (d2 == 0.0D) {
            d1 = 1.0D;
          } else {
            d1 = ((d1 + d3) * 0.5D - arrayOfInt[0]) / d2;
          }
          localObject3[i2] = d1;
        }
      }
    }
    i1 = 0;
    int i2 = i1;
    while (i1 < n)
    {
      i2 += localObject2[i1].length;
      i1++;
    }
    int i4 = i2 + 3;
    Object localObject3 = new long[n][i4][2];
    int[] arrayOfInt = new int[n];
    a((long[][][])localObject3, 1, paramArrayOfLong, arrayOfInt);
    for (i2 = 2;; i2++)
    {
      i3 = i4 - 1;
      if (i2 >= i3) {
        break;
      }
      d2 = Double.MAX_VALUE;
      i1 = 0;
      int i6;
      for (i3 = i1; i1 < n; i3 = i6)
      {
        int i5 = arrayOfInt[i1];
        d1 = d2;
        i6 = i3;
        if (i5 + 1 != localObject1[i1].length)
        {
          d3 = localObject2[i1][i5];
          d1 = d2;
          i6 = i3;
          if (d3 < d2)
          {
            i6 = i1;
            d1 = d3;
          }
        }
        i1++;
        d2 = d1;
      }
      arrayOfInt[i3] += 1;
      a((long[][][])localObject3, i2, paramArrayOfLong, arrayOfInt);
    }
    i2 = localObject3.length;
    for (i1 = 0; i1 < i2; i1++)
    {
      localObject1 = localObject3[i1];
      paramArrayOfLong = localObject1[i3];
      localObject1 = localObject1[(i4 - 2)];
      localObject1[0] *= 2L;
      localObject1[1] *= 2L;
    }
    return (long[][][])localObject3;
  }
  
  public final int a()
  {
    return k;
  }
  
  public final int a(long paramLong, List<? extends ow> paramList)
  {
    long l1 = i.a();
    long l2 = m;
    int n = 0;
    if ((l2 != -9223372036854775807L) && (l1 - l2 < h)) {
      i1 = 0;
    } else {
      i1 = 1;
    }
    if (i1 == 0) {
      return paramList.size();
    }
    m = l1;
    if (paramList.isEmpty()) {
      return 0;
    }
    int i2 = paramList.size();
    l2 = wl.b(get1h - paramLong, j);
    long l3 = f;
    if (l2 < l3) {
      return i2;
    }
    bw localbw1 = a(a(l1));
    for (int i1 = n; i1 < i2; i1++)
    {
      ow localow = (ow)paramList.get(i1);
      bw localbw2 = e;
      if ((wl.b(h - paramLong, j) >= l3) && (e < e))
      {
        int i3 = o;
        if ((i3 != -1) && (i3 < 720))
        {
          n = n;
          if ((n != -1) && (n < 1280) && (i3 < o)) {
            return i1;
          }
        }
      }
    }
    return i2;
  }
  
  public final void a(float paramFloat)
  {
    j = paramFloat;
  }
  
  public final void a(long paramLong1, long paramLong2, long paramLong3, List<? extends ow> paramList, oz[] paramArrayOfoz)
  {
    paramLong1 = i.a();
    int n = l;
    int i1 = 1;
    if (n == 0)
    {
      l = 1;
      k = a(paramLong1);
      return;
    }
    n = k;
    int i2 = a(paramLong1);
    k = i2;
    if (i2 == n) {
      return;
    }
    if (!b(n, paramLong1))
    {
      paramList = a(n);
      i2 = ak).e;
      int i3 = e;
      if (i2 > i3)
      {
        if ((paramLong3 == -9223372036854775807L) || (paramLong3 > d)) {
          i1 = 0;
        }
        if (i1 != 0) {
          paramLong1 = ((float)paramLong3 * g);
        } else {
          paramLong1 = d;
        }
        if (paramLong2 < paramLong1)
        {
          k = n;
          break label196;
        }
      }
      if ((i2 < i3) && (paramLong2 >= e)) {
        k = n;
      }
    }
    label196:
    if (k != n) {
      l = 3;
    }
  }
  
  public final void a(long[][] paramArrayOfLong)
  {
    c.a(paramArrayOfLong);
  }
  
  public final int b()
  {
    return l;
  }
  
  public final Object c()
  {
    return null;
  }
  
  public final void d()
  {
    m = -9223372036854775807L;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.sl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */