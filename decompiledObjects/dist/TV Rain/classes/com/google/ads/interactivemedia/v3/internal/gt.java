package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

final class gt
{
  private final vy a = new vy(8);
  private int b;
  
  private final long b(fz paramfz)
    throws IOException, InterruptedException
  {
    byte[] arrayOfByte = a.a;
    int i = 0;
    paramfz.c(arrayOfByte, 0, 1);
    int j = a.a[0] & 0xFF;
    if (j == 0) {
      return Long.MIN_VALUE;
    }
    int k = 128;
    for (int m = 0; (j & k) == 0; m++) {
      k >>= 1;
    }
    k = j & k;
    paramfz.c(a.a, 1, m);
    while (i < m)
    {
      paramfz = a.a;
      i++;
      k = (paramfz[i] & 0xFF) + (k << 8);
    }
    b = (m + 1 + b);
    return k;
  }
  
  public final boolean a(fz paramfz)
    throws IOException, InterruptedException
  {
    long l1 = paramfz.d();
    boolean bool1 = l1 < -1L;
    long l2 = 1024L;
    long l3 = l2;
    if (bool1) {
      if (l1 > 1024L) {
        l3 = l2;
      } else {
        l3 = l1;
      }
    }
    int k = (int)l3;
    paramfz.c(a.a, 0, 4);
    l3 = a.j();
    b = 4;
    while (l3 != 440786851L)
    {
      int m = b + 1;
      b = m;
      if (m == k) {
        return false;
      }
      paramfz.c(a.a, 0, 1);
      l3 = l3 << 8 & 0xFFFFFFFFFFFFFF00 | a.a[0] & 0xFF;
    }
    l2 = b(paramfz);
    l3 = b;
    if ((l2 != Long.MIN_VALUE) && ((!bool1) || (l3 + l2 < l1)))
    {
      int j;
      for (;;)
      {
        int i = b;
        long l4 = i;
        l1 = l3 + l2;
        if (l4 >= l1) {
          break label287;
        }
        if (b(paramfz) == Long.MIN_VALUE) {
          return false;
        }
        l1 = b(paramfz);
        boolean bool2 = l1 < 0L;
        if ((bool2) || (l1 > 2147483647L)) {
          break;
        }
        if (bool2)
        {
          j = (int)l1;
          paramfz.c(j);
          b += j;
        }
      }
      return false;
      label287:
      if (j == l1) {
        return true;
      }
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.gt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */