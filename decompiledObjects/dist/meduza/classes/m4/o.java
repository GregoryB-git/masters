package m4;

import c4.v;
import v3.i0;
import v3.i0.a;
import v5.m;
import v5.u;
import x6.b;

public final class o
  implements j
{
  public final u a = new u(10);
  public v b;
  public boolean c;
  public long d = -9223372036854775807L;
  public int e;
  public int f;
  
  public final void a(u paramu)
  {
    b.K(b);
    if (!c) {
      return;
    }
    int i = c - b;
    int j = f;
    if (j < 10)
    {
      j = Math.min(i, 10 - j);
      System.arraycopy(a, b, a.a, f, j);
      if (f + j == 10)
      {
        a.G(0);
        if ((73 == a.v()) && (68 == a.v()) && (51 == a.v()))
        {
          a.H(3);
          e = (a.u() + 10);
        }
        else
        {
          m.f("Id3Reader", "Discarding invalid ID3 tag");
          c = false;
          return;
        }
      }
    }
    i = Math.min(i, e - f);
    b.b(i, paramu);
    f += i;
  }
  
  public final void b()
  {
    c = false;
    d = -9223372036854775807L;
  }
  
  public final void c()
  {
    b.K(b);
    if (c)
    {
      int i = e;
      if ((i != 0) && (f == i))
      {
        long l = d;
        if (l != -9223372036854775807L) {
          b.c(l, 1, i, 0, null);
        }
        c = false;
      }
    }
  }
  
  public final void d(int paramInt, long paramLong)
  {
    if ((paramInt & 0x4) == 0) {
      return;
    }
    c = true;
    if (paramLong != -9223372036854775807L) {
      d = paramLong;
    }
    e = 0;
    f = 0;
  }
  
  public final void e(c4.j paramj, d0.d paramd)
  {
    paramd.a();
    paramd.b();
    paramj = paramj.r(d, 5);
    b = paramj;
    i0.a locala = new i0.a();
    paramd.b();
    a = e;
    k = "application/id3";
    paramj.d(new i0(locala));
  }
}

/* Location:
 * Qualified Name:     m4.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */