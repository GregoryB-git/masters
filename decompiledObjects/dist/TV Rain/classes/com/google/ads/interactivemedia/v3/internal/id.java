package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import z2;

public final class id
  implements fw
{
  private final bw a;
  private final vy b;
  private gi c;
  private int d;
  private int e;
  private long f;
  private int g;
  private int h;
  
  public id(bw parambw)
  {
    a = parambw;
    b = new vy(9);
    d = 0;
  }
  
  public final int a(fz paramfz, gf paramgf)
    throws IOException, InterruptedException
  {
    for (;;)
    {
      int i = d;
      int j = 0;
      int k = 1;
      if (i != 0)
      {
        if (i != 1)
        {
          if (i == 2)
          {
            while (g > 0)
            {
              b.a();
              paramfz.b(b.a, 0, 3);
              c.a(b, 3);
              h += 3;
              g -= 1;
            }
            k = h;
            if (k > 0) {
              c.a(f, 1, k, 0, null);
            }
            d = 1;
            return 0;
          }
          throw new IllegalStateException();
        }
        b.a();
        j = e;
        if (j == 0)
        {
          if (paramfz.a(b.a, 0, 5, true))
          {
            f = (b.j() * 1000L / 45L);
            break label234;
          }
        }
        else
        {
          if (j != 1) {
            break label270;
          }
          if (paramfz.a(b.a, 0, 9, true)) {
            break label223;
          }
        }
        k = 0;
        break label250;
        label223:
        f = b.m();
        label234:
        g = b.e();
        h = 0;
        label250:
        if (k != 0)
        {
          d = 2;
        }
        else
        {
          d = 0;
          return -1;
          label270:
          throw new ce(z2.k(39, "Unsupported version number: ", e));
        }
      }
      else
      {
        b.a();
        k = j;
        if (paramfz.a(b.a, 0, 8, true)) {
          if (b.l() == 1380139777)
          {
            e = b.e();
            k = 1;
          }
          else
          {
            throw new IOException("Input not RawCC");
          }
        }
        if (k == 0) {
          break;
        }
        d = 1;
      }
    }
    return -1;
  }
  
  public final void a(long paramLong1, long paramLong2)
  {
    d = 0;
  }
  
  public final void a(fy paramfy)
  {
    paramfy.a(new gg(-9223372036854775807L));
    c = paramfy.a(0, 3);
    paramfy.a();
    c.a(a);
  }
  
  public final boolean a(fz paramfz)
    throws IOException, InterruptedException
  {
    b.a();
    paramfz.c(b.a, 0, 8);
    return b.l() == 1380139777;
  }
  
  public final void c() {}
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.id
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */