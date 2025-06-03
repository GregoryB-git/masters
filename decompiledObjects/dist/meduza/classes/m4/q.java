package m4;

import c4.v;
import v3.i0;
import v3.i0.a;
import v5.u;
import x3.y.a;
import x6.b;

public final class q
  implements j
{
  public final u a;
  public final y.a b;
  public final String c;
  public v d;
  public String e;
  public int f = 0;
  public int g;
  public boolean h;
  public boolean i;
  public long j;
  public int k;
  public long l;
  
  public q(String paramString)
  {
    u localu = new u(4);
    a = localu;
    a[0] = ((byte)-1);
    b = new y.a();
    l = -9223372036854775807L;
    c = paramString;
  }
  
  public final void a(u paramu)
  {
    b.K(d);
    for (;;)
    {
      int m = c;
      int n = b;
      int i1 = m - n;
      if (i1 <= 0) {
        break;
      }
      int i2 = f;
      Object localObject;
      if (i2 != 0)
      {
        long l1;
        if (i2 != 1)
        {
          if (i2 == 2)
          {
            n = Math.min(i1, k - g);
            d.b(n, paramu);
            i1 = g + n;
            g = i1;
            n = k;
            if (i1 >= n)
            {
              l1 = l;
              if (l1 != -9223372036854775807L)
              {
                d.c(l1, 1, n, 0, null);
                l += j;
              }
              g = 0;
              f = 0;
            }
          }
          else
          {
            throw new IllegalStateException();
          }
        }
        else
        {
          n = Math.min(i1, 4 - g);
          paramu.d(a.a, g, n);
          n = g + n;
          g = n;
          if (n >= 4)
          {
            a.G(0);
            if (!b.a(a.f()))
            {
              g = 0;
              f = 1;
            }
            else
            {
              y.a locala = b;
              k = c;
              if (!h)
              {
                l1 = g;
                n = d;
                j = (l1 * 1000000L / n);
                localObject = new i0.a();
                a = e;
                k = b;
                l = 4096;
                x = e;
                y = n;
                c = c;
                localObject = new i0((i0.a)localObject);
                d.d((i0)localObject);
                h = true;
              }
              a.G(0);
              d.b(4, a);
              f = 2;
            }
          }
        }
      }
      else
      {
        localObject = a;
        for (;;)
        {
          if (n >= m) {
            break label543;
          }
          i1 = localObject[n];
          boolean bool;
          if ((i1 & 0xFF) == 255) {
            bool = true;
          } else {
            bool = false;
          }
          if ((i) && ((i1 & 0xE0) == 224)) {
            i1 = 1;
          } else {
            i1 = 0;
          }
          i = bool;
          if (i1 != 0)
          {
            paramu.G(n + 1);
            i = false;
            a.a[1] = ((byte)localObject[n]);
            g = 2;
            f = 1;
            break;
          }
          n++;
        }
        label543:
        paramu.G(m);
      }
    }
  }
  
  public final void b()
  {
    f = 0;
    g = 0;
    i = false;
    l = -9223372036854775807L;
  }
  
  public final void c() {}
  
  public final void d(int paramInt, long paramLong)
  {
    if (paramLong != -9223372036854775807L) {
      l = paramLong;
    }
  }
  
  public final void e(c4.j paramj, d0.d paramd)
  {
    paramd.a();
    paramd.b();
    e = e;
    paramd.b();
    d = paramj.r(d, 1);
  }
}

/* Location:
 * Qualified Name:     m4.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */