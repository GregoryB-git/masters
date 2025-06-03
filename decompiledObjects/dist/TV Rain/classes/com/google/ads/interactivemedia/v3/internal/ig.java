package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

public final class ig
  implements fw
{
  private final int a = 0;
  private final ij b = new ij(true);
  private final vy c = new vy(2048);
  private final vy d;
  private final vz e;
  private fy f;
  private long g;
  private long h = -1L;
  private int i = -1;
  private boolean j;
  private boolean k;
  private boolean l;
  
  public ig()
  {
    this(0);
  }
  
  private ig(int paramInt)
  {
    vy localvy = new vy(10);
    d = localvy;
    e = new vz(a);
  }
  
  private final int b(fz paramfz)
    throws IOException, InterruptedException
  {
    int m = 0;
    for (;;)
    {
      paramfz.c(d.a, 0, 10);
      d.c(0);
      if (d.i() != 4801587) {
        break;
      }
      d.d(3);
      int n = d.o();
      m += n + 10;
      paramfz.c(n);
    }
    paramfz.a();
    paramfz.c(m);
    if (h == -1L) {
      h = m;
    }
    return m;
  }
  
  public final int a(fz paramfz, gf paramgf)
    throws IOException, InterruptedException
  {
    long l1 = paramfz.d();
    int m;
    if (((a & 0x1) != 0) && (l1 != -1L)) {
      m = 1;
    } else {
      m = 0;
    }
    long l3;
    int n;
    int i1;
    if ((m != 0) && (!j))
    {
      i = -1;
      paramfz.a();
      long l2 = paramfz.c();
      l3 = 0L;
      if (l2 == 0L) {
        b(paramfz);
      }
      n = 0;
      for (;;)
      {
        i1 = n;
        l2 = l3;
        if (!paramfz.b(d.a, 0, 2, true)) {
          break label251;
        }
        d.c(0);
        if (!ij.a(d.f()))
        {
          i1 = 0;
          l2 = l3;
          break label251;
        }
        i1 = n;
        l2 = l3;
        if (!paramfz.b(d.a, 0, 4, true)) {
          break label251;
        }
        e.a(14);
        i2 = e.c(13);
        if (i2 <= 6) {
          break;
        }
        l3 += i2;
        n++;
        i1 = n;
        l2 = l3;
        if (n == 1000) {
          break label251;
        }
        i1 = n;
        l2 = l3;
        if (!paramfz.a(i2 - 6, true)) {
          break label251;
        }
      }
      j = true;
      throw new ce("Malformed ADTS stream");
      label251:
      paramfz.a();
      if (i1 > 0) {
        i = ((int)(l2 / i1));
      } else {
        i = -1;
      }
      j = true;
    }
    int i2 = paramfz.a(c.a, 0, 2048);
    if (i2 == -1) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    if (!l)
    {
      if ((m != 0) && (i > 0)) {
        n = 1;
      } else {
        n = 0;
      }
      if ((n == 0) || (b.c() != -9223372036854775807L) || (i1 != 0))
      {
        paramfz = (fy)rp.a(f);
        if ((n != 0) && (b.c() != -9223372036854775807L))
        {
          n = i;
          l3 = b.c();
          n = (int)((n << 3) * 1000000L / l3);
          paramfz.a(new fu(l1, h, n, i));
        }
        else
        {
          paramfz.a(new gg(-9223372036854775807L));
        }
        l = true;
      }
    }
    if (i1 != 0) {
      return -1;
    }
    c.c(0);
    c.b(i2);
    if (!k)
    {
      b.a(g, 4);
      k = true;
    }
    b.a(c);
    return 0;
  }
  
  public final void a(long paramLong1, long paramLong2)
  {
    k = false;
    b.a();
    g = paramLong2;
  }
  
  public final void a(fy paramfy)
  {
    f = paramfy;
    b.a(paramfy, new jn(0, 1));
    paramfy.a();
  }
  
  public final boolean a(fz paramfz)
    throws IOException, InterruptedException
  {
    int m = b(paramfz);
    int n = m;
    int i1 = 0;
    int i2 = i1;
    for (;;)
    {
      paramfz.c(d.a, 0, 2);
      d.c(0);
      if (!ij.a(d.f()))
      {
        paramfz.a();
        n++;
        if (n - m >= 8192) {
          return false;
        }
        paramfz.c(n);
        break;
      }
      i1++;
      if ((i1 >= 4) && (i2 > 188)) {
        return true;
      }
      paramfz.c(d.a, 0, 4);
      e.a(14);
      int i3 = e.c(13);
      if (i3 <= 6) {
        return false;
      }
      paramfz.c(i3 - 6);
      i2 += i3;
    }
  }
  
  public final void c() {}
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ig
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */