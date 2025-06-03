package l1;

import F0.L;
import F0.M;
import F0.M.b;
import F0.r;
import F0.s;
import F0.t;
import F0.x;
import d0.A;
import g0.a;
import g0.y;
import g0.z;
import java.io.EOFException;

public final class h
  implements r
{
  public static final x m = new g();
  public final int a;
  public final i b;
  public final z c;
  public final z d;
  public final y e;
  public t f;
  public long g;
  public long h;
  public int i;
  public boolean j;
  public boolean k;
  public boolean l;
  
  public h()
  {
    this(0);
  }
  
  public h(int paramInt)
  {
    int n = paramInt;
    if ((paramInt & 0x2) != 0) {
      n = paramInt | 0x1;
    }
    a = n;
    b = new i(true);
    c = new z(2048);
    i = -1;
    h = -1L;
    z localz = new z(10);
    d = localz;
    e = new y(localz.e());
  }
  
  private static int h(int paramInt, long paramLong)
  {
    return (int)(paramInt * 8000000L / paramLong);
  }
  
  private M j(long paramLong, boolean paramBoolean)
  {
    int n = h(i, b.k());
    return new F0.i(paramLong, h, n, i, paramBoolean);
  }
  
  public void a(long paramLong1, long paramLong2)
  {
    k = false;
    b.b();
    g = paramLong2;
  }
  
  public void b(t paramt)
  {
    f = paramt;
    b.e(paramt, new K.d(0, 1));
    paramt.j();
  }
  
  public boolean e(s params)
  {
    int n = m(params);
    int i1 = n;
    int i2 = 0;
    int i3 = i2;
    int i4;
    do
    {
      params.n(d.e(), 0, 2);
      d.T(0);
      if (!i.m(d.M())) {}
      do
      {
        i4 = i1 + 1;
        params.h();
        params.o(i4);
        i1 = 0;
        i3 = i1;
        break;
        i2++;
        if ((i2 >= 4) && (i3 > 188)) {
          return true;
        }
        params.n(d.e(), 0, 4);
        e.p(14);
        i4 = e.h(13);
      } while (i4 <= 6);
      params.o(i4 - 6);
      i3 += i4;
      i4 = i1;
      i1 = i2;
      i2 = i1;
      i1 = i4;
    } while (i4 - n < 8192);
    return false;
  }
  
  public final void f(s params)
  {
    if (j) {
      return;
    }
    i = -1;
    params.h();
    l1 = params.p();
    long l2 = 0L;
    if (l1 == 0L) {
      m(params);
    }
    int n = 0;
    int i1 = 0;
    for (;;)
    {
      int i2 = i1;
      l1 = l2;
      int i3 = i1;
      long l3 = l2;
      try
      {
        if (params.l(d.e(), 0, 2, true))
        {
          i3 = i1;
          l3 = l2;
          d.T(0);
          i3 = i1;
          l3 = l2;
          if (!i.m(d.M()))
          {
            i1 = n;
            break label296;
          }
          i3 = i1;
          l3 = l2;
          if (!params.l(d.e(), 0, 4, true))
          {
            i2 = i1;
            l1 = l2;
          }
          else
          {
            i3 = i1;
            l3 = l2;
            e.p(14);
            i3 = i1;
            l3 = l2;
            int i4 = e.h(13);
            if (i4 > 6)
            {
              l1 = l2 + i4;
              i2 = i1 + 1;
              if (i2 != 1000)
              {
                i1 = i2;
                l2 = l1;
                i3 = i2;
                l3 = l1;
                if (params.j(i4 - 6, true)) {
                  continue;
                }
              }
            }
            else
            {
              i3 = i1;
              l3 = l2;
              j = true;
              i3 = i1;
              l3 = l2;
              throw A.a("Malformed ADTS stream", null);
            }
          }
        }
      }
      catch (EOFException localEOFException)
      {
        for (;;)
        {
          i2 = i3;
          l1 = l3;
        }
      }
    }
    i1 = i2;
    l2 = l1;
    label296:
    params.h();
    if (i1 > 0) {
      i = ((int)(l2 / i1));
    } else {
      i = -1;
    }
    j = true;
  }
  
  public int i(s params, L paramL)
  {
    a.h(f);
    long l1 = params.a();
    int n = a;
    if (((n & 0x2) != 0) || (((n & 0x1) != 0) && (l1 != -1L))) {
      f(params);
    }
    n = params.read(c.e(), 0, 2048);
    boolean bool;
    if (n == -1) {
      bool = true;
    } else {
      bool = false;
    }
    l(l1, bool);
    if (bool) {
      return -1;
    }
    c.T(0);
    c.S(n);
    if (!k)
    {
      b.d(g, 4);
      k = true;
    }
    b.a(c);
    return 0;
  }
  
  public final void l(long paramLong, boolean paramBoolean)
  {
    if (l) {
      return;
    }
    int n = a;
    boolean bool = false;
    if (((n & 0x1) != 0) && (i > 0)) {
      n = 1;
    } else {
      n = 0;
    }
    if ((n != 0) && (b.k() == -9223372036854775807L) && (!paramBoolean)) {
      return;
    }
    if ((n != 0) && (b.k() != -9223372036854775807L))
    {
      t localt = f;
      paramBoolean = bool;
      if ((a & 0x2) != 0) {
        paramBoolean = true;
      }
      localt.e(j(paramLong, paramBoolean));
    }
    else
    {
      f.e(new M.b(-9223372036854775807L));
    }
    l = true;
  }
  
  public final int m(s params)
  {
    int n = 0;
    for (;;)
    {
      params.n(d.e(), 0, 10);
      d.T(0);
      if (d.J() != 4801587)
      {
        params.h();
        params.o(n);
        if (h == -1L) {
          h = n;
        }
        return n;
      }
      d.U(3);
      int i1 = d.F();
      n += i1 + 10;
      params.o(i1);
    }
  }
  
  public void release() {}
}

/* Location:
 * Qualified Name:     l1.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */