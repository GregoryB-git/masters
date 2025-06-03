package L0;

import F0.H;
import F0.L;
import F0.M.b;
import F0.r;
import F0.s;
import F0.t;
import F0.x;
import g0.z;

public final class c
  implements r
{
  public static final x q = new b();
  public final z a = new z(4);
  public final z b = new z(9);
  public final z c = new z(11);
  public final z d = new z();
  public final d e = new d();
  public t f;
  public int g = 1;
  public boolean h;
  public long i;
  public int j;
  public int k;
  public int l;
  public long m;
  public boolean n;
  public a o;
  public f p;
  
  public void a(long paramLong1, long paramLong2)
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
  
  public void b(t paramt)
  {
    f = paramt;
  }
  
  public boolean e(s params)
  {
    byte[] arrayOfByte = a.e();
    boolean bool = false;
    params.n(arrayOfByte, 0, 3);
    a.T(0);
    if (a.J() != 4607062) {
      return false;
    }
    params.n(a.e(), 0, 2);
    a.T(0);
    if ((a.M() & 0xFA) != 0) {
      return false;
    }
    params.n(a.e(), 0, 4);
    a.T(0);
    int i1 = a.p();
    params.h();
    params.o(i1);
    params.n(a.e(), 0, 4);
    a.T(0);
    if (a.p() == 0) {
      bool = true;
    }
    return bool;
  }
  
  public final void f()
  {
    if (!n)
    {
      f.e(new M.b(-9223372036854775807L));
      n = true;
    }
  }
  
  public final long h()
  {
    long l1;
    if (h) {
      l1 = i + m;
    } else if (e.d() == -9223372036854775807L) {
      l1 = 0L;
    } else {
      l1 = m;
    }
    return l1;
  }
  
  public int i(s params, L paramL)
  {
    g0.a.h(f);
    do
    {
      for (;;)
      {
        int i1 = g;
        if (i1 == 1) {
          break;
        }
        if (i1 != 2)
        {
          if (i1 != 3)
          {
            if (i1 == 4)
            {
              if (m(params)) {
                return 0;
              }
            }
            else {
              throw new IllegalStateException();
            }
          }
          else if (!n(params)) {
            return -1;
          }
        }
        else {
          o(params);
        }
      }
    } while (l(params));
    return -1;
  }
  
  public final z k(s params)
  {
    if (l > d.b())
    {
      z localz = d;
      localz.R(new byte[Math.max(localz.b() * 2, l)], 0);
    }
    else
    {
      d.T(0);
    }
    d.S(l);
    params.readFully(d.e(), 0, l);
    return d;
  }
  
  public final boolean l(s params)
  {
    byte[] arrayOfByte = b.e();
    int i1 = 0;
    if (!params.d(arrayOfByte, 0, 9, true)) {
      return false;
    }
    b.T(0);
    b.U(4);
    int i2 = b.G();
    int i3;
    if ((i2 & 0x4) != 0) {
      i3 = 1;
    } else {
      i3 = 0;
    }
    if ((i2 & 0x1) != 0) {
      i1 = 1;
    }
    if ((i3 != 0) && (o == null)) {
      o = new a(f.a(8, 1));
    }
    if ((i1 != 0) && (p == null)) {
      p = new f(f.a(9, 2));
    }
    f.j();
    j = (b.p() - 5);
    g = 2;
    return true;
  }
  
  public final boolean m(s params)
  {
    long l1 = h();
    int i1 = k;
    Object localObject;
    if ((i1 == 8) && (o != null))
    {
      f();
      localObject = o;
      bool1 = ((e)localObject).a(k(params), l1);
    }
    for (;;)
    {
      bool2 = true;
      break label189;
      if ((i1 == 9) && (p != null))
      {
        f();
        localObject = p;
        break;
      }
      if ((i1 != 18) || (n)) {
        break label173;
      }
      bool2 = e.a(k(params), l1);
      l1 = e.d();
      bool1 = bool2;
      if (l1 != -9223372036854775807L)
      {
        f.e(new H(e.e(), e.f(), l1));
        n = true;
        bool1 = bool2;
      }
    }
    label173:
    params.i(l);
    boolean bool1 = false;
    boolean bool2 = false;
    label189:
    if ((!h) && (bool1))
    {
      h = true;
      if (e.d() == -9223372036854775807L) {
        l1 = -m;
      } else {
        l1 = 0L;
      }
      i = l1;
    }
    j = 4;
    g = 2;
    return bool2;
  }
  
  public final boolean n(s params)
  {
    if (!params.d(c.e(), 0, 11, true)) {
      return false;
    }
    c.T(0);
    k = c.G();
    l = c.J();
    m = c.J();
    m = ((c.G() << 24 | m) * 1000L);
    c.U(3);
    g = 4;
    return true;
  }
  
  public final void o(s params)
  {
    params.i(j);
    j = 0;
    g = 3;
  }
  
  public void release() {}
}

/* Location:
 * Qualified Name:     L0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */