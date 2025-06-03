package m4;

import c4.v;
import v3.i0;
import v3.i0.a;
import v5.e0;
import v5.t;
import v5.u;

public final class b
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
  public long i;
  public i0 j;
  public int k;
  public long l;
  
  public b(String paramString)
  {
    t localt = new t(new byte[''], 128);
    a = localt;
    b = new u(a);
    f = 0;
    l = -9223372036854775807L;
    c = paramString;
  }
  
  public final void a(u paramu)
  {
    x6.b.K(e);
    for (;;)
    {
      int m = c - b;
      if (m <= 0) {
        break;
      }
      int n = f;
      Object localObject1;
      if (n != 0)
      {
        if (n != 1)
        {
          if (n == 2)
          {
            n = Math.min(m, k - g);
            e.b(n, paramu);
            n = g + n;
            g = n;
            m = k;
            if (n == m)
            {
              long l1 = l;
              if (l1 != -9223372036854775807L)
              {
                e.c(l1, 1, m, 0, null);
                l += i;
              }
              f = 0;
            }
          }
        }
        else
        {
          localObject1 = b.a;
          n = Math.min(m, 128 - g);
          paramu.d((byte[])localObject1, g, n);
          n = g + n;
          g = n;
          if (n == 128) {
            n = 1;
          } else {
            n = 0;
          }
          if (n != 0)
          {
            a.k(0);
            Object localObject2 = a;
            m = ((t)localObject2).e();
            ((t)localObject2).m(40);
            if (((t)localObject2).g(5) > 10) {
              n = 1;
            } else {
              n = 0;
            }
            ((t)localObject2).k(m);
            int i3;
            int i4;
            int i6;
            int i12;
            if (n != 0)
            {
              ((t)localObject2).m(16);
              n = ((t)localObject2).g(2);
              if (n != 0)
              {
                if (n != 1)
                {
                  if (n != 2) {
                    n = -1;
                  } else {
                    n = 2;
                  }
                }
                else {
                  n = 1;
                }
              }
              else {
                n = 0;
              }
              ((t)localObject2).m(3);
              int i1 = (((t)localObject2).g(11) + 1) * 2;
              int i2 = ((t)localObject2).g(2);
              if (i2 == 3)
              {
                m = x3.b.c[localObject2.g(2)];
                i3 = 3;
                i4 = 6;
              }
              else
              {
                i3 = ((t)localObject2).g(2);
                i4 = x3.b.a[i3];
                m = x3.b.b[i2];
              }
              int i5 = i4 * 256;
              i6 = i1 * m / (i4 * 32);
              int i7 = ((t)localObject2).g(3);
              int i8 = ((t)localObject2).f();
              int i9 = x3.b.d[i7];
              ((t)localObject2).m(10);
              if (((t)localObject2).f()) {
                ((t)localObject2).m(8);
              }
              if (i7 == 0)
              {
                ((t)localObject2).m(5);
                if (((t)localObject2).f()) {
                  ((t)localObject2).m(8);
                }
              }
              if ((n == 1) && (((t)localObject2).f())) {
                ((t)localObject2).m(16);
              }
              if (((t)localObject2).f())
              {
                if (i7 > 2) {
                  ((t)localObject2).m(2);
                }
                if (((i7 & 0x1) != 0) && (i7 > 2)) {
                  ((t)localObject2).m(6);
                }
                if ((i7 & 0x4) != 0) {
                  ((t)localObject2).m(6);
                }
                if ((i8 != 0) && (((t)localObject2).f())) {
                  ((t)localObject2).m(5);
                }
                if (n == 0)
                {
                  if (((t)localObject2).f()) {
                    ((t)localObject2).m(6);
                  }
                  if ((i7 == 0) && (((t)localObject2).f())) {
                    ((t)localObject2).m(6);
                  }
                  if (((t)localObject2).f()) {
                    ((t)localObject2).m(6);
                  }
                  i10 = ((t)localObject2).g(2);
                  if (i10 == 1)
                  {
                    ((t)localObject2).m(5);
                  }
                  else if (i10 == 2)
                  {
                    ((t)localObject2).m(12);
                  }
                  else if (i10 == 3)
                  {
                    i10 = ((t)localObject2).g(5);
                    if (((t)localObject2).f())
                    {
                      ((t)localObject2).m(5);
                      if (((t)localObject2).f()) {
                        ((t)localObject2).m(4);
                      }
                      if (((t)localObject2).f()) {
                        ((t)localObject2).m(4);
                      }
                      if (((t)localObject2).f()) {
                        ((t)localObject2).m(4);
                      }
                      if (((t)localObject2).f()) {
                        ((t)localObject2).m(4);
                      }
                      if (((t)localObject2).f()) {
                        ((t)localObject2).m(4);
                      }
                      if (((t)localObject2).f()) {
                        ((t)localObject2).m(4);
                      }
                      if (((t)localObject2).f()) {
                        ((t)localObject2).m(4);
                      }
                      if (((t)localObject2).f())
                      {
                        if (((t)localObject2).f()) {
                          ((t)localObject2).m(4);
                        }
                        if (((t)localObject2).f()) {
                          ((t)localObject2).m(4);
                        }
                      }
                    }
                    if (((t)localObject2).f())
                    {
                      ((t)localObject2).m(5);
                      if (((t)localObject2).f())
                      {
                        ((t)localObject2).m(7);
                        if (((t)localObject2).f()) {
                          ((t)localObject2).m(8);
                        }
                      }
                    }
                    ((t)localObject2).m((i10 + 2) * 8);
                    ((t)localObject2).c();
                  }
                  if (i7 < 2)
                  {
                    if (((t)localObject2).f()) {
                      ((t)localObject2).m(14);
                    }
                    if ((i7 == 0) && (((t)localObject2).f())) {
                      ((t)localObject2).m(14);
                    }
                  }
                  if (((t)localObject2).f()) {
                    if (i3 == 0) {
                      ((t)localObject2).m(5);
                    } else {
                      for (i10 = 0; i10 < i4; i10++) {
                        if (((t)localObject2).f()) {
                          ((t)localObject2).m(5);
                        }
                      }
                    }
                  }
                }
              }
              if (((t)localObject2).f())
              {
                ((t)localObject2).m(5);
                if (i7 == 2) {
                  ((t)localObject2).m(4);
                }
                if (i7 >= 6) {
                  ((t)localObject2).m(2);
                }
                if (((t)localObject2).f()) {
                  ((t)localObject2).m(8);
                }
                if ((i7 == 0) && (((t)localObject2).f())) {
                  ((t)localObject2).m(8);
                }
                if (i2 < 3) {
                  ((t)localObject2).l();
                }
              }
              if ((n == 0) && (i3 != 3)) {
                ((t)localObject2).l();
              }
              if ((n == 2) && ((i3 == 3) || (((t)localObject2).f()))) {
                ((t)localObject2).m(6);
              }
              if ((((t)localObject2).f()) && (((t)localObject2).g(6) == 1) && (((t)localObject2).g(8) == 1)) {
                localObject1 = "audio/eac3-joc";
              } else {
                localObject1 = "audio/eac3";
              }
              int i10 = i9 + i8;
              n = i1;
              i4 = i5;
              i3 = m;
            }
            else
            {
              ((t)localObject2).m(32);
              n = ((t)localObject2).g(2);
              if (n == 3) {
                localObject1 = null;
              } else {
                localObject1 = "audio/ac3";
              }
              m = ((t)localObject2).g(6);
              i3 = x3.b.e[(m / 2)];
              m = x3.b.a(n, m);
              ((t)localObject2).m(8);
              i4 = ((t)localObject2).g(3);
              if (((i4 & 0x1) != 0) && (i4 != 1)) {
                ((t)localObject2).m(2);
              }
              if ((i4 & 0x4) != 0) {
                ((t)localObject2).m(2);
              }
              if (i4 == 2) {
                ((t)localObject2).m(2);
              }
              int[] arrayOfInt = x3.b.b;
              if (n < 3) {
                n = arrayOfInt[n];
              } else {
                n = -1;
              }
              int i11 = ((t)localObject2).f();
              i4 = x3.b.d[i4];
              i12 = i4 + i11;
              i4 = 1536;
              i6 = i3 * 1000;
              i3 = n;
              n = m;
            }
            localObject2 = j;
            if ((localObject2 == null) || (i12 != G) || (i3 != H) || (!e0.a(localObject1, t)))
            {
              localObject2 = new i0.a();
              a = d;
              k = ((String)localObject1);
              x = i12;
              y = i3;
              c = c;
              g = i6;
              if ("audio/ac3".equals(localObject1)) {
                f = i6;
              }
              localObject1 = new i0((i0.a)localObject2);
              j = ((i0)localObject1);
              e.d((i0)localObject1);
            }
            k = n;
            i = (i4 * 1000000L / j.H);
            b.G(0);
            e.b(128, b);
            f = 2;
          }
        }
      }
      else
      {
        while (c - b > 0)
        {
          if (!h)
          {
            if (paramu.v() != 11) {
              break label1621;
            }
          }
          else
          {
            n = paramu.v();
            if (n == 119)
            {
              h = false;
              n = 1;
              break label1635;
            }
            if (n != 11) {
              break label1621;
            }
          }
          boolean bool = true;
          break label1624;
          label1621:
          bool = false;
          label1624:
          h = bool;
        }
        n = 0;
        label1635:
        if (n != 0)
        {
          f = 1;
          localObject1 = b.a;
          localObject1[0] = ((byte)11);
          localObject1[1] = ((byte)119);
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
    d = e;
    paramd.b();
    e = paramj.r(d, 1);
  }
}

/* Location:
 * Qualified Name:     m4.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */