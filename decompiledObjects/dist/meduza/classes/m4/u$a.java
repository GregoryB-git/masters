package m4;

import c4.a.e;
import c4.a.f;
import c4.i;
import v5.c0;
import v5.e0;

public final class u$a
  implements a.f
{
  public final c0 a;
  public final v5.u b;
  
  public u$a(c0 paramc0)
  {
    a = paramc0;
    b = new v5.u();
  }
  
  public final void a()
  {
    v5.u localu = b;
    byte[] arrayOfByte = e0.f;
    localu.getClass();
    localu.E(arrayOfByte, arrayOfByte.length);
  }
  
  public final a.e b(i parami, long paramLong)
  {
    long l1 = parami.getPosition();
    int i = (int)Math.min(20000L, parami.getLength() - l1);
    b.D(i);
    parami.m(b.a, 0, i);
    parami = b;
    int j = -1;
    int k = -1;
    long l2 = -9223372036854775807L;
    for (;;)
    {
      int m = c;
      i = b;
      if (m - i < 4) {
        break;
      }
      if (u.d(a, i) != 442)
      {
        parami.H(1);
      }
      else
      {
        parami.H(4);
        long l3 = v.c(parami);
        i = k;
        long l4 = l2;
        if (l3 != -9223372036854775807L)
        {
          l4 = a.b(l3);
          if (l4 > paramLong)
          {
            if (l2 == -9223372036854775807L) {
              return new a.e(-1, l4, l1);
            }
            paramLong = k;
          }
          else
          {
            if (100000L + l4 <= paramLong) {
              break label217;
            }
            paramLong = b;
          }
          return a.e.a(l1 + paramLong);
          label217:
          i = b;
        }
        k = c;
        if (k - b >= 10)
        {
          parami.H(9);
          j = parami.v() & 0x7;
          if (c - b >= j)
          {
            parami.H(j);
            m = c;
            j = b;
            if (m - j >= 4) {
              if (u.d(a, j) == 443)
              {
                parami.H(4);
                j = parami.A();
                if (c - b < j) {
                  break label436;
                }
                parami.H(j);
              }
            }
          }
        }
        for (;;)
        {
          m = c;
          j = b;
          if (m - j < 4) {
            break;
          }
          j = u.d(a, j);
          if ((j == 442) || (j == 441) || (j >>> 8 != 1)) {
            break;
          }
          parami.H(4);
          if (c - b < 2)
          {
            label436:
            parami.G(k);
            break;
          }
          j = parami.A();
          parami.G(Math.min(c, b + j));
        }
        j = b;
        k = i;
        l2 = l4;
      }
    }
    if (l2 != -9223372036854775807L) {
      parami = new a.e(-2, l2, l1 + j);
    } else {
      parami = a.e.d;
    }
    return parami;
  }
}

/* Location:
 * Qualified Name:     m4.u.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */