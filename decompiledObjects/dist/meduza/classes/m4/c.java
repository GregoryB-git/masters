package m4;

import c4.e;
import c4.h;
import c4.i;
import c4.j;
import c4.s;
import c4.t.b;
import v5.u;

public final class c
  implements h
{
  public final d a = new d(null);
  public final u b = new u(16384);
  public boolean c;
  
  public final void b(j paramj)
  {
    a.e(paramj, new d0.d(0, 1));
    paramj.m();
    paramj.t(new t.b(-9223372036854775807L));
  }
  
  public final int d(i parami, s params)
  {
    int i = parami.read(b.a, 0, 16384);
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
          parami = a;
          int m = 7;
          locale.c(parami, 0, 7, false);
          localu.G(0);
          int n = localu.A();
          if ((n != 44096) && (n != 44097))
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
            int i1 = j + 1;
            if (i1 >= 4) {
              return true;
            }
            parami = a;
            if (parami.length < 7)
            {
              j = -1;
            }
            else
            {
              j = (parami[2] & 0xFF) << 8 | parami[3] & 0xFF;
              if (j == 65535)
              {
                i2 = (parami[4] & 0xFF) << 16 | (parami[5] & 0xFF) << 8 | parami[6] & 0xFF;
                j = m;
                m = i2;
              }
              else
              {
                i2 = 4;
                m = j;
                j = i2;
              }
              int i2 = j;
              if (n == 44097) {
                i2 = j + 2;
              }
              j = m + i2;
            }
            if (j == -1) {
              return false;
            }
            locale.k(j - 7, false);
            j = i1;
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
 * Qualified Name:     m4.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */