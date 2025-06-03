package m4;

import c4.e;
import c4.h;
import c4.i;
import c4.j;
import c4.s;
import c4.t.b;
import v5.u;

public final class a
  implements h
{
  public final b a = new b(null);
  public final u b = new u(2786);
  public boolean c;
  
  public final void b(j paramj)
  {
    a.e(paramj, new d0.d(0, 1));
    paramj.m();
    paramj.t(new t.b(-9223372036854775807L));
  }
  
  public final int d(i parami, s params)
  {
    int i = parami.read(b.a, 0, 2786);
    if (i == -1) {
      return -1;
    }
    b.G(0);
    b.F(i);
    if (!c)
    {
      a.d(4, 0L);
      c = true;
    }
    a.a(b);
    return 0;
  }
  
  public final void f(long paramLong1, long paramLong2)
  {
    c = false;
    a.b();
  }
  
  public final boolean i(i parami)
  {
    u localu = new u(10);
    int i = 0;
    for (;;)
    {
      byte[] arrayOfByte = a;
      e locale = (e)parami;
      locale.c(arrayOfByte, 0, 10, false);
      localu.G(0);
      if (localu.x() != 4801587)
      {
        f = 0;
        locale.k(i, false);
        j = 0;
        int k = i;
        for (;;)
        {
          locale.c(a, 0, 6, false);
          localu.G(0);
          if (localu.A() != 2935)
          {
            f = 0;
            k++;
            if (k - i >= 8192) {
              return false;
            }
            locale.k(k, false);
            j = 0;
          }
          else
          {
            int m = j + 1;
            if (m >= 4) {
              return true;
            }
            parami = a;
            if (parami.length < 6)
            {
              j = -1;
            }
            else
            {
              if ((parami[5] & 0xF8) >> 3 > 10) {
                j = 1;
              } else {
                j = 0;
              }
              if (j != 0)
              {
                j = (((parami[2] & 0x7) << 8 | parami[3] & 0xFF) + 1) * 2;
              }
              else
              {
                j = parami[4];
                j = x3.b.a((j & 0xC0) >> 6, j & 0x3F);
              }
            }
            if (j == -1) {
              return false;
            }
            locale.k(j - 6, false);
            j = m;
          }
        }
      }
      localu.H(3);
      int j = localu.u();
      i += j + 10;
      locale.k(j, false);
    }
  }
  
  public final void release() {}
}

/* Location:
 * Qualified Name:     m4.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */