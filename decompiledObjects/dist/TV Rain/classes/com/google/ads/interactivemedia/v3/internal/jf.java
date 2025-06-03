package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

final class jf
{
  private final wi a = new wi(0L);
  private final vy b = new vy();
  private boolean c;
  private boolean d;
  private boolean e;
  private long f = -9223372036854775807L;
  private long g = -9223372036854775807L;
  private long h = -9223372036854775807L;
  
  private final int a(fz paramfz)
  {
    vy localvy = b;
    byte[] arrayOfByte = wl.f;
    localvy.a(arrayOfByte, arrayOfByte.length);
    c = true;
    paramfz.a();
    return 0;
  }
  
  public final int a(fz paramfz, gf paramgf, int paramInt)
    throws IOException, InterruptedException
  {
    if (paramInt <= 0) {
      return a(paramfz);
    }
    boolean bool = e;
    long l1 = -9223372036854775807L;
    long l2;
    int i;
    int j;
    if (!bool)
    {
      l2 = paramfz.d();
      i = (int)Math.min(112800L, l2);
      l2 -= i;
      if (paramfz.c() != l2)
      {
        a = l2;
        return 1;
      }
      b.a(i);
      paramfz.a();
      paramfz.c(b.a, 0, i);
      paramfz = b;
      j = paramfz.d();
      for (i = paramfz.c() - 1;; i--)
      {
        l2 = l1;
        if (i < j) {
          break;
        }
        if (a[i] == 71)
        {
          l2 = h.a(paramfz, i, paramInt);
          if (l2 != -9223372036854775807L) {
            break;
          }
        }
      }
      g = l2;
      e = true;
      return 0;
    }
    if (g == -9223372036854775807L) {
      return a(paramfz);
    }
    if (!d)
    {
      i = (int)Math.min(112800L, paramfz.d());
      if (paramfz.c() != 0L)
      {
        a = 0L;
        return 1;
      }
      b.a(i);
      paramfz.a();
      paramfz.c(b.a, 0, i);
      paramfz = b;
      i = paramfz.d();
      j = paramfz.c();
      for (;;)
      {
        l2 = l1;
        if (i >= j) {
          break;
        }
        if (a[i] == 71)
        {
          l2 = h.a(paramfz, i, paramInt);
          if (l2 != -9223372036854775807L) {
            break;
          }
        }
        i++;
      }
      f = l2;
      d = true;
      return 0;
    }
    l1 = f;
    if (l1 == -9223372036854775807L) {
      return a(paramfz);
    }
    l1 = a.b(l1);
    h = (a.b(g) - l1);
    return a(paramfz);
  }
  
  public final boolean a()
  {
    return c;
  }
  
  public final long b()
  {
    return h;
  }
  
  public final wi c()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.jf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */