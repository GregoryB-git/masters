package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

final class jc
  implements fs
{
  private final wi a;
  private final vy b;
  private final int c;
  
  public jc(int paramInt, wi paramwi)
  {
    c = paramInt;
    a = paramwi;
    b = new vy();
  }
  
  public final ft a(fz paramfz, long paramLong)
    throws IOException, InterruptedException
  {
    long l1 = paramfz.c();
    int i = (int)Math.min(112800L, paramfz.d() - l1);
    b.a(i);
    paramfz.c(b.a, 0, i);
    paramfz = b;
    int j = paramfz.c();
    long l2 = -1L;
    long l3 = -1L;
    long l6;
    for (long l4 = -9223372036854775807L; paramfz.b() >= 188; l4 = l6)
    {
      int k = h.a(a, paramfz.d(), j);
      i = k + 188;
      if (i > j) {
        break;
      }
      l2 = h.a(paramfz, k, c);
      long l5 = l3;
      l6 = l4;
      if (l2 != -9223372036854775807L)
      {
        l6 = a.b(l2);
        if (l6 > paramLong)
        {
          if (l4 == -9223372036854775807L) {
            return ft.a(l6, l1);
          }
          return ft.a(l1 + l3);
        }
        if (100000L + l6 > paramLong) {
          return ft.a(l1 + k);
        }
        l5 = k;
      }
      paramfz.c(i);
      l2 = i;
      l3 = l5;
    }
    if (l4 != -9223372036854775807L) {
      return ft.b(l4, l1 + l2);
    }
    return ft.a;
  }
  
  public final void a()
  {
    vy localvy = b;
    byte[] arrayOfByte = wl.f;
    localvy.a(arrayOfByte, arrayOfByte.length);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.jc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */