package m4;

import c4.v;
import v3.i0;
import v3.i0.a;
import v5.t;
import v5.u;
import x3.c;
import x3.c.a;
import x6.b;

public final class d
  implements j
{
  public final t a;
  public final u b;
  public final String c;
  public String d;
  public v e;
  public int f;
  public int g;
  public boolean h;
  public boolean i;
  public long j;
  public i0 k;
  public int l;
  public long m;
  
  public d(String paramString)
  {
    t localt = new t(new byte[16], 16);
    a = localt;
    b = new u(a);
    f = 0;
    g = 0;
    h = false;
    i = false;
    m = -9223372036854775807L;
    c = paramString;
  }
  
  public final void a(u paramu)
  {
    b.K(e);
    for (;;)
    {
      int n = c - b;
      if (n <= 0) {
        break;
      }
      int i1 = f;
      int i2 = 1;
      Object localObject1;
      if (i1 != 0)
      {
        if (i1 != 1)
        {
          if (i1 == 2)
          {
            i2 = Math.min(n, l - g);
            e.b(i2, paramu);
            i2 = g + i2;
            g = i2;
            i1 = l;
            if (i2 == i1)
            {
              long l1 = m;
              if (l1 != -9223372036854775807L)
              {
                e.c(l1, 1, i1, 0, null);
                m += j;
              }
              f = 0;
            }
          }
        }
        else
        {
          localObject1 = b.a;
          i1 = Math.min(n, 16 - g);
          paramu.d((byte[])localObject1, g, i1);
          i1 = g + i1;
          g = i1;
          if (i1 != 16) {
            i2 = 0;
          }
          if (i2 != 0)
          {
            a.k(0);
            localObject1 = c.b(a);
            Object localObject2 = k;
            if ((localObject2 == null) || (2 != G) || (a != H) || (!"audio/ac4".equals(t)))
            {
              localObject2 = new i0.a();
              a = d;
              k = "audio/ac4";
              x = 2;
              y = a;
              c = c;
              localObject2 = new i0((i0.a)localObject2);
              k = ((i0)localObject2);
              e.d((i0)localObject2);
            }
            l = b;
            j = (c * 1000000L / k.H);
            b.G(0);
            e.b(16, b);
            f = 2;
          }
        }
      }
      else
      {
        boolean bool;
        do
        {
          for (;;)
          {
            i2 = c;
            n = b;
            i1 = 65;
            if (i2 - n <= 0) {
              break label542;
            }
            if (h) {
              break;
            }
            if (paramu.v() == 172) {
              bool = true;
            } else {
              bool = false;
            }
            h = bool;
          }
          i2 = paramu.v();
          if (i2 == 172) {
            bool = true;
          } else {
            bool = false;
          }
          h = bool;
        } while ((i2 != 64) && (i2 != 65));
        if (i2 == 65) {
          bool = true;
        } else {
          bool = false;
        }
        i = bool;
        i2 = 1;
        break label545;
        label542:
        i2 = 0;
        label545:
        if (i2 != 0)
        {
          f = 1;
          localObject1 = b.a;
          localObject1[0] = ((byte)-84);
          if (i) {
            i2 = i1;
          } else {
            i2 = 64;
          }
          localObject1[1] = ((byte)(byte)i2);
          g = 2;
        }
      }
    }
  }
  
  public final void b()
  {
    f = 0;
    g = 0;
    h = false;
    i = false;
    m = -9223372036854775807L;
  }
  
  public final void c() {}
  
  public final void d(int paramInt, long paramLong)
  {
    if (paramLong != -9223372036854775807L) {
      m = paramLong;
    }
  }
  
  public final void e(c4.j paramj, d0.d paramd)
  {
    paramd.a();
    paramd.b();
    d = e;
    paramd.b();
    e = paramj.r(d, 1);
  }
}

/* Location:
 * Qualified Name:     m4.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */