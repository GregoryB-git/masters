package m4;

import c4.d;
import c4.h;
import c4.i;
import c4.j;
import c4.s;
import c4.t.b;
import java.io.EOFException;
import v3.a1;
import v5.t;
import v5.u;
import x6.b;

public final class e
  implements h
{
  public final int a;
  public final f b;
  public final u c;
  public final u d;
  public final t e;
  public j f;
  public long g;
  public long h;
  public int i;
  public boolean j;
  public boolean k;
  public boolean l;
  
  public e(int paramInt)
  {
    int m = paramInt;
    if ((paramInt & 0x2) != 0) {
      m = paramInt | 0x1;
    }
    a = m;
    b = new f(null, true);
    c = new u(2048);
    i = -1;
    h = -1L;
    Object localObject = new u(10);
    d = ((u)localObject);
    localObject = a;
    e = new t((byte[])localObject, localObject.length);
  }
  
  public final int a(i parami)
  {
    int m = 0;
    for (;;)
    {
      parami.m(d.a, 0, 10);
      d.G(0);
      if (d.x() != 4801587)
      {
        parami.i();
        parami.e(m);
        if (h == -1L) {
          h = m;
        }
        return m;
      }
      d.H(3);
      int n = d.u();
      m += n + 10;
      parami.e(n);
    }
  }
  
  public final void b(j paramj)
  {
    f = paramj;
    b.e(paramj, new d0.d(0, 1));
    paramj.m();
  }
  
  public final int d(i parami, s params)
  {
    b.K(f);
    long l1 = parami.getLength();
    int m = a;
    if (((m & 0x2) == 0) && (((m & 0x1) == 0) || (l1 == -1L))) {
      m = 0;
    } else {
      m = 1;
    }
    long l3;
    if ((m != 0) && (!j))
    {
      i = -1;
      parami.i();
      l2 = parami.getPosition();
      l3 = 0L;
      if (l2 == 0L) {
        a(parami);
      }
      m = 0;
    }
    for (;;)
    {
      int n = m;
      long l4 = l3;
      int i1 = m;
      l2 = l3;
      try
      {
        if (parami.c(d.a, 0, 2, true))
        {
          i1 = m;
          l2 = l3;
          d.G(0);
          i1 = m;
          l2 = l3;
          if ((d.A() & 0xFFF6) == 65520) {
            n = 1;
          } else {
            n = 0;
          }
          if (n == 0)
          {
            n = 0;
            l4 = l3;
          }
          else
          {
            i1 = m;
            l2 = l3;
            if (!parami.c(d.a, 0, 4, true))
            {
              n = m;
              l4 = l3;
            }
            else
            {
              i1 = m;
              l2 = l3;
              e.k(14);
              i1 = m;
              l2 = l3;
              n = e.g(13);
              if (n > 6)
              {
                l3 += n;
                m++;
                if (m == 1000)
                {
                  n = m;
                  l4 = l3;
                }
                else
                {
                  i1 = m;
                  l2 = l3;
                  if (!parami.k(n - 6, true))
                  {
                    n = m;
                    l4 = l3;
                  }
                }
              }
              else
              {
                i1 = m;
                l2 = l3;
                j = true;
                i1 = m;
                l2 = l3;
                throw a1.a("Malformed ADTS stream", null);
              }
            }
          }
        }
      }
      catch (EOFException params)
      {
        for (;;)
        {
          int i2;
          boolean bool;
          n = i1;
          l4 = l2;
        }
      }
    }
    parami.i();
    if (n > 0) {
      m = (int)(l4 / n);
    } else {
      m = -1;
    }
    i = m;
    j = true;
    i1 = parami.read(c.a, 0, 2048);
    if (i1 == -1) {
      m = 1;
    } else {
      m = 0;
    }
    if (!l)
    {
      i2 = a;
      if (((i2 & 0x1) != 0) && (i > 0)) {
        n = 1;
      } else {
        n = 0;
      }
      if ((n == 0) || (b.q != -9223372036854775807L) || (m != 0))
      {
        if (n != 0)
        {
          l3 = b.q;
          if (l3 != -9223372036854775807L)
          {
            parami = f;
            if ((0x2 & i2) != 0) {
              bool = true;
            } else {
              bool = false;
            }
            n = i;
            parami.t(new d((int)(n * 8L * 1000000L / l3), n, l1, h, bool));
            break label627;
          }
        }
        f.t(new t.b(-9223372036854775807L));
        label627:
        l = true;
      }
    }
    if (m != 0) {
      return -1;
    }
    c.G(0);
    c.F(i1);
    if (!k)
    {
      b.d(4, g);
      k = true;
    }
    b.a(c);
    return 0;
  }
  
  public final void f(long paramLong1, long paramLong2)
  {
    k = false;
    b.b();
    g = paramLong2;
  }
  
  public final boolean i(i parami)
  {
    int m = a(parami);
    int n = m;
    int i1 = 0;
    int i2 = i1;
    int i3;
    label201:
    do
    {
      byte[] arrayOfByte = d.a;
      c4.e locale = (c4.e)parami;
      locale.c(arrayOfByte, 0, 2, false);
      d.G(0);
      if ((d.A() & 0xFFF6) == 65520) {
        i3 = 1;
      } else {
        i3 = 0;
      }
      if (i3 != 0)
      {
        i1++;
        if ((i1 >= 4) && (i2 > 188)) {
          return true;
        }
        locale.c(d.a, 0, 4, false);
        e.k(14);
        i3 = e.g(13);
        if (i3 > 6) {}
      }
      else
      {
        i3 = n + 1;
        f = 0;
        locale.k(i3, false);
        i2 = 0;
        n = i2;
        break label201;
      }
      locale.k(i3 - 6, false);
      i2 += i3;
      i3 = n;
      n = i2;
      i2 = i1;
      i1 = i2;
      i2 = n;
      n = i3;
    } while (i3 - m < 8192);
    return false;
  }
  
  public final void release() {}
}

/* Location:
 * Qualified Name:     m4.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */