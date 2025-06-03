package f4;

import c4.a.e;
import c4.a.f;
import c4.i;
import c4.l;
import c4.l.a;
import c4.o;
import v5.u;

public final class a$a
  implements a.f
{
  public final o a;
  public final int b;
  public final l.a c;
  
  public a$a(o paramo, int paramInt)
  {
    a = paramo;
    b = paramInt;
    c = new l.a();
  }
  
  public final a.e b(i parami, long paramLong)
  {
    long l1 = parami.getPosition();
    long l2 = c(parami);
    long l3 = parami.d();
    parami.e(Math.max(6, a.c));
    long l4 = c(parami);
    long l5 = parami.d();
    if ((l2 <= paramLong) && (l4 > paramLong)) {
      return a.e.a(l3);
    }
    if (l4 <= paramLong) {
      return new a.e(-2, l4, l5);
    }
    return new a.e(-1, l2, l1);
  }
  
  public final long c(i parami)
  {
    while (parami.d() < parami.getLength() - 6L)
    {
      o localo = a;
      int i = b;
      l.a locala = c;
      long l = parami.d();
      byte[] arrayOfByte = new byte[2];
      boolean bool = false;
      int j = 0;
      parami.m(arrayOfByte, 0, 2);
      if (((arrayOfByte[0] & 0xFF) << 8 | arrayOfByte[1] & 0xFF) != i)
      {
        parami.i();
        parami.e((int)(l - parami.getPosition()));
      }
      else
      {
        u localu = new u(16);
        System.arraycopy(arrayOfByte, 0, a, 0, 2);
        arrayOfByte = a;
        while (j < 14)
        {
          int k = parami.g(arrayOfByte, 2 + j, 14 - j);
          if (k == -1) {
            break;
          }
          j += k;
        }
        localu.F(j);
        parami.i();
        parami.e((int)(l - parami.getPosition()));
        bool = l.a(localu, localo, i, locala);
      }
      if (bool) {
        break;
      }
      parami.e(1);
    }
    if (parami.d() >= parami.getLength() - 6L)
    {
      parami.e((int)(parami.getLength() - parami.d()));
      return a.j;
    }
    return c.a;
  }
}

/* Location:
 * Qualified Name:     f4.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */