package g4;

import c4.h;
import c4.i;
import c4.j;
import c4.r;
import c4.s;
import c4.t.b;
import v5.u;

public final class b
  implements h
{
  public final u a = new u(4);
  public final u b = new u(9);
  public final u c = new u(11);
  public final u d = new u();
  public final c e = new c();
  public j f;
  public int g = 1;
  public boolean h;
  public long i;
  public int j;
  public int k;
  public int l;
  public long m;
  public boolean n;
  public a o;
  public e p;
  
  public final u a(i parami)
  {
    int i1 = l;
    u localu = d;
    byte[] arrayOfByte = a;
    if (i1 > arrayOfByte.length) {
      localu.E(new byte[Math.max(arrayOfByte.length * 2, i1)], 0);
    } else {
      localu.G(0);
    }
    d.F(l);
    parami.readFully(d.a, 0, l);
    return d;
  }
  
  public final void b(j paramj)
  {
    f = paramj;
  }
  
  public final int d(i parami, s params)
  {
    x6.b.K(f);
    int i4;
    label237:
    label331:
    label337:
    label354:
    do
    {
      int i2;
      int i3;
      for (;;)
      {
        int i1 = g;
        i2 = 0;
        i3 = 0;
        i4 = 0;
        if (i1 == 1) {
          break;
        }
        if (i1 != 2)
        {
          if (i1 != 3)
          {
            if (i1 == 4)
            {
              boolean bool = h;
              long l1 = 0L;
              long l2;
              if (bool) {
                l2 = i + m;
              } else if (e.b == -9223372036854775807L) {
                l2 = 0L;
              } else {
                l2 = m;
              }
              i4 = k;
              if ((i4 == 8) && (o != null))
              {
                if (!n)
                {
                  f.t(new t.b(-9223372036854775807L));
                  n = true;
                }
                params = o;
              }
              else
              {
                if ((i4 != 9) || (p == null)) {
                  break label237;
                }
                if (!n)
                {
                  f.t(new t.b(-9223372036854775807L));
                  n = true;
                }
                params = p;
              }
              u localu = a(parami);
              if ((params.a(localu)) && (params.b(l2, localu)))
              {
                i4 = 1;
                break label331;
                if ((i4 != 18) || (n)) {
                  break label337;
                }
                params = e;
                localu = a(parami);
                params.getClass();
                params.b(l2, localu);
                params = e;
                l2 = b;
                if (l2 != -9223372036854775807L)
                {
                  f.t(new r(d, c, l2));
                  n = true;
                }
              }
              i4 = 0;
              i2 = 1;
              break label354;
              parami.j(l);
              i4 = 0;
              i2 = i4;
              if ((!h) && (i4 != 0))
              {
                h = true;
                l2 = l1;
                if (e.b == -9223372036854775807L) {
                  l2 = -m;
                }
                i = l2;
              }
              j = 4;
              g = 2;
              if (i2 != 0) {
                return 0;
              }
            }
            else
            {
              throw new IllegalStateException();
            }
          }
          else
          {
            if (parami.b(c.a, 0, 11, true))
            {
              c.G(0);
              k = c.v();
              l = c.x();
              m = c.x();
              m = ((c.v() << 24 | m) * 1000L);
              c.H(3);
              g = 4;
              i4 = 1;
            }
            if (i4 == 0) {
              return -1;
            }
          }
        }
        else
        {
          parami.j(j);
          j = 0;
          g = 3;
        }
      }
      if (!parami.b(b.a, 0, 9, true))
      {
        i4 = i3;
      }
      else
      {
        b.G(0);
        b.H(4);
        i3 = b.v();
        if ((i3 & 0x4) != 0) {
          i4 = 1;
        } else {
          i4 = 0;
        }
        if ((i3 & 0x1) != 0) {
          i2 = 1;
        }
        if ((i4 != 0) && (o == null)) {
          o = new a(f.r(8, 1));
        }
        if ((i2 != 0) && (p == null)) {
          p = new e(f.r(9, 2));
        }
        f.m();
        j = (b.f() - 9 + 4);
        g = 2;
        i4 = 1;
      }
    } while (i4 != 0);
    return -1;
  }
  
  public final void f(long paramLong1, long paramLong2)
  {
    if (paramLong1 == 0L)
    {
      g = 1;
      h = false;
    }
    else
    {
      g = 3;
    }
    j = 0;
  }
  
  public final boolean i(i parami)
  {
    byte[] arrayOfByte = a.a;
    parami = (c4.e)parami;
    boolean bool = false;
    parami.c(arrayOfByte, 0, 3, false);
    a.G(0);
    if (a.x() != 4607062) {
      return false;
    }
    parami.c(a.a, 0, 2, false);
    a.G(0);
    if ((a.A() & 0xFA) != 0) {
      return false;
    }
    parami.c(a.a, 0, 4, false);
    a.G(0);
    int i1 = a.f();
    f = 0;
    parami.k(i1, false);
    parami.c(a.a, 0, 4, false);
    a.G(0);
    if (a.f() == 0) {
      bool = true;
    }
    return bool;
  }
  
  public final void release() {}
}

/* Location:
 * Qualified Name:     g4.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */