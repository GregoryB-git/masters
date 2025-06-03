package l1;

import F0.T;
import F0.t;
import d0.q.b;
import g0.a;
import g0.o;
import g0.z;

public final class r
  implements m
{
  public final z a = new z(10);
  public T b;
  public boolean c;
  public long d = -9223372036854775807L;
  public int e;
  public int f;
  
  public void a(z paramz)
  {
    a.h(b);
    if (!c) {
      return;
    }
    int i = paramz.a();
    int j = f;
    if (j < 10)
    {
      j = Math.min(i, 10 - j);
      System.arraycopy(paramz.e(), paramz.f(), a.e(), f, j);
      if (f + j == 10)
      {
        a.T(0);
        if ((73 == a.G()) && (68 == a.G()) && (51 == a.G()))
        {
          a.U(3);
          e = (a.F() + 10);
        }
        else
        {
          o.h("Id3Reader", "Discarding invalid ID3 tag");
          c = false;
          return;
        }
      }
    }
    i = Math.min(i, e - f);
    b.e(paramz, i);
    f += i;
  }
  
  public void b()
  {
    c = false;
    d = -9223372036854775807L;
  }
  
  public void c(boolean paramBoolean)
  {
    a.h(b);
    if (c)
    {
      int i = e;
      if ((i != 0) && (f == i))
      {
        if (d != -9223372036854775807L) {
          paramBoolean = true;
        } else {
          paramBoolean = false;
        }
        a.f(paramBoolean);
        b.b(d, 1, e, 0, null);
        c = false;
      }
    }
  }
  
  public void d(long paramLong, int paramInt)
  {
    if ((paramInt & 0x4) == 0) {
      return;
    }
    c = true;
    d = paramLong;
    e = 0;
    f = 0;
  }
  
  public void e(t paramt, K.d paramd)
  {
    paramd.a();
    paramt = paramt.a(paramd.c(), 5);
    b = paramt;
    paramt.d(new q.b().a0(paramd.b()).o0("application/id3").K());
  }
}

/* Location:
 * Qualified Name:     l1.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */