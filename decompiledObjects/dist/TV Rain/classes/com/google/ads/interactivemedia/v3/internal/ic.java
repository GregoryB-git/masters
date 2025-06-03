package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

public final class ic
  implements fw
{
  private final if a = new if();
  private final vy b = new vy(2786);
  private boolean c;
  
  public final int a(fz paramfz, gf paramgf)
    throws IOException, InterruptedException
  {
    int i = paramfz.a(b.a, 0, 2786);
    if (i == -1) {
      return -1;
    }
    b.c(0);
    b.b(i);
    if (!c)
    {
      a.a(0L, 4);
      c = true;
    }
    a.a(b);
    return 0;
  }
  
  public final void a(long paramLong1, long paramLong2)
  {
    c = false;
    a.a();
  }
  
  public final void a(fy paramfy)
  {
    a.a(paramfy, new jn(0, 1));
    paramfy.a();
    paramfy.a(new gg(-9223372036854775807L));
  }
  
  public final boolean a(fz paramfz)
    throws IOException, InterruptedException
  {
    vy localvy = new vy(10);
    int i = 0;
    for (;;)
    {
      paramfz.c(a, 0, 10);
      localvy.c(0);
      if (localvy.i() != 4801587) {
        break;
      }
      localvy.d(3);
      j = localvy.o();
      i += j + 10;
      paramfz.c(j);
    }
    paramfz.a();
    paramfz.c(i);
    int j = 0;
    int k = i;
    for (;;)
    {
      paramfz.c(a, 0, 6);
      localvy.c(0);
      if (localvy.f() != 2935)
      {
        paramfz.a();
        k++;
        if (k - i >= 8192) {
          return false;
        }
        paramfz.c(k);
        j = 0;
      }
      else
      {
        j++;
        if (j >= 4) {
          return true;
        }
        int m = dc.a(a);
        if (m == -1) {
          return false;
        }
        paramfz.c(m - 6);
      }
    }
  }
  
  public final void c() {}
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ic
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */