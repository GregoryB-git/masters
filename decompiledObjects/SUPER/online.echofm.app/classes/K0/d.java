package K0;

import F0.A;
import F0.B;
import F0.L;
import F0.M.b;
import F0.T;
import F0.e;
import F0.r;
import F0.s;
import F0.t;
import F0.y;
import F0.y.a;
import F0.z.a;
import g0.a;

public final class d
  implements r
{
  public static final F0.x o = new c();
  public final byte[] a = new byte[42];
  public final g0.z b = new g0.z(new byte[32768], 0);
  public final boolean c;
  public final y.a d;
  public t e;
  public T f;
  public int g;
  public d0.x h;
  public B i;
  public int j;
  public int k;
  public b l;
  public int m;
  public long n;
  
  public d()
  {
    this(0);
  }
  
  public d(int paramInt)
  {
    boolean bool = true;
    if ((paramInt & 0x1) == 0) {
      bool = false;
    }
    c = bool;
    d = new y.a();
    g = 0;
  }
  
  public void a(long paramLong1, long paramLong2)
  {
    long l1 = 0L;
    if (paramLong1 == 0L)
    {
      g = 0;
    }
    else
    {
      b localb = l;
      if (localb != null) {
        localb.h(paramLong2);
      }
    }
    if (paramLong2 == 0L) {
      paramLong1 = l1;
    } else {
      paramLong1 = -1L;
    }
    n = paramLong1;
    m = 0;
    b.P(0);
  }
  
  public void b(t paramt)
  {
    e = paramt;
    f = paramt.a(0, 1);
    paramt.j();
  }
  
  public boolean e(s params)
  {
    F0.z.c(params, false);
    return F0.z.a(params);
  }
  
  public final long f(g0.z paramz, boolean paramBoolean)
  {
    a.e(i);
    for (int i1 = paramz.f(); i1 <= paramz.g() - 16; i1++)
    {
      paramz.T(i1);
      if (y.d(paramz, i, k, d))
      {
        paramz.T(i1);
        return d.a;
      }
    }
    if (paramBoolean)
    {
      for (;;)
      {
        if (i1 > paramz.g() - j) {
          break label140;
        }
        paramz.T(i1);
        try
        {
          paramBoolean = y.d(paramz, i, k, d);
        }
        catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
        {
          paramBoolean = false;
        }
        if ((paramz.f() <= paramz.g()) && (paramBoolean)) {
          break;
        }
        i1++;
      }
      label140:
      paramz.T(paramz.g());
    }
    else
    {
      paramz.T(i1);
    }
    return -1L;
  }
  
  public final void h(s params)
  {
    k = F0.z.b(params);
    ((t)g0.M.i(e)).e(j(params.p(), params.a()));
    g = 5;
  }
  
  public int i(s params, L paramL)
  {
    int i1 = g;
    if (i1 != 0)
    {
      if (i1 != 1)
      {
        if (i1 != 2)
        {
          if (i1 != 3)
          {
            if (i1 != 4)
            {
              if (i1 == 5) {
                return n(params, paramL);
              }
              throw new IllegalStateException();
            }
            h(params);
            return 0;
          }
          p(params);
          return 0;
        }
        q(params);
        return 0;
      }
      k(params);
      return 0;
    }
    o(params);
    return 0;
  }
  
  public final F0.M j(long paramLong1, long paramLong2)
  {
    a.e(i);
    Object localObject = i;
    if (k != null) {
      return new A((B)localObject, paramLong1);
    }
    if ((paramLong2 != -1L) && (j > 0L))
    {
      localObject = new b((B)localObject, k, paramLong1, paramLong2);
      l = ((b)localObject);
      return ((e)localObject).b();
    }
    return new M.b(((B)localObject).f());
  }
  
  public final void k(s params)
  {
    byte[] arrayOfByte = a;
    params.n(arrayOfByte, 0, arrayOfByte.length);
    params.h();
    g = 2;
  }
  
  public final void m()
  {
    long l1 = n * 1000000L / ii)).e;
    ((T)g0.M.i(f)).b(l1, 1, m, 0, null);
  }
  
  public final int n(s params, L paramL)
  {
    a.e(f);
    a.e(i);
    b localb = l;
    if ((localb != null) && (localb.d())) {
      return l.c(params, paramL);
    }
    if (n == -1L)
    {
      n = y.i(params, i);
      return 0;
    }
    int i1 = b.g();
    boolean bool;
    if (i1 < 32768)
    {
      i2 = params.read(b.e(), i1, 32768 - i1);
      if (i2 == -1) {
        bool = true;
      } else {
        bool = false;
      }
      if (!bool)
      {
        b.S(i1 + i2);
      }
      else if (b.a() == 0)
      {
        m();
        return -1;
      }
    }
    else
    {
      bool = false;
    }
    int i2 = b.f();
    i1 = m;
    int i3 = j;
    if (i1 < i3)
    {
      params = b;
      params.U(Math.min(i3 - i1, params.a()));
    }
    long l1 = f(b, bool);
    i1 = b.f() - i2;
    b.T(i2);
    f.e(b, i1);
    m += i1;
    if (l1 != -1L)
    {
      m();
      m = 0;
      n = l1;
    }
    if (b.a() < 16)
    {
      i2 = b.a();
      System.arraycopy(b.e(), b.f(), b.e(), 0, i2);
      b.T(0);
      b.S(i2);
    }
    return 0;
  }
  
  public final void o(s params)
  {
    h = F0.z.d(params, c ^ true);
    g = 1;
  }
  
  public final void p(s params)
  {
    z.a locala = new z.a(i);
    boolean bool = false;
    while (!bool)
    {
      bool = F0.z.e(params, locala);
      i = ((B)g0.M.i(a));
    }
    a.e(i);
    j = Math.max(i.c, 6);
    ((T)g0.M.i(f)).d(i.g(a, h));
    g = 4;
  }
  
  public final void q(s params)
  {
    F0.z.i(params);
    g = 3;
  }
  
  public void release() {}
}

/* Location:
 * Qualified Name:     K0.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */