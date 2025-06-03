package l1;

import F0.T;
import F0.t;
import d0.q.b;
import g0.M;
import g0.a;
import g0.y;
import g0.z;
import java.util.List;

public final class u
  implements m
{
  public final z a = new z(new byte[15], 2);
  public final y b = new y();
  public final z c = new z();
  public int d = 0;
  public String e;
  public T f;
  public double g = -9.223372036854776E18D;
  public double h = -9.223372036854776E18D;
  public boolean i;
  public boolean j = true;
  public int k;
  public int l;
  public boolean m = true;
  public int n;
  public int o;
  public v.b p = new v.b();
  public int q = -2147483647;
  public int r = -1;
  public int s;
  public long t = -1L;
  public boolean u;
  
  private boolean k(z paramz)
  {
    int i1 = k;
    if ((i1 & 0x2) == 0)
    {
      paramz.T(paramz.g());
      return false;
    }
    if ((i1 & 0x4) == 0)
    {
      while (paramz.a() > 0)
      {
        i1 = l << 8;
        l = i1;
        i1 |= paramz.G();
        l = i1;
        if (v.e(i1))
        {
          paramz.T(paramz.f() - 3);
          l = 0;
          return true;
        }
      }
      return false;
    }
    return true;
  }
  
  public void a(z paramz)
  {
    a.h(f);
    while (paramz.a() > 0)
    {
      int i1 = d;
      Object localObject;
      if (i1 != 0) {
        if (i1 != 1) {
          if (i1 == 2)
          {
            if (j(p.a)) {
              f(paramz, c, true);
            }
            l(paramz);
            i1 = n;
            localObject = p;
            if (i1 != c) {
              continue;
            }
            i1 = a;
            if (i1 == 1) {
              h(new y(c.e()));
            } else if (i1 == 17) {
              s = v.f(new y(c.e()));
            } else if (i1 == 2) {
              g();
            }
          }
        }
      }
      for (;;)
      {
        d = 1;
        break;
        throw new IllegalStateException();
        f(paramz, a, false);
        if (a.a() == 0)
        {
          if (i())
          {
            a.T(0);
            localObject = f;
            z localz = a;
            ((T)localObject).e(localz, localz.g());
            a.P(2);
            c.P(p.c);
            m = true;
            d = 2;
            break;
          }
          if (a.g() >= 15) {
            break;
          }
          localObject = a;
          ((z)localObject).S(((z)localObject).g() + 1);
        }
        m = false;
        break;
        if (!k(paramz)) {
          break;
        }
      }
    }
  }
  
  public void b()
  {
    d = 0;
    l = 0;
    a.P(2);
    n = 0;
    o = 0;
    q = -2147483647;
    r = -1;
    s = 0;
    t = -1L;
    u = false;
    i = false;
    m = true;
    j = true;
    g = -9.223372036854776E18D;
    h = -9.223372036854776E18D;
  }
  
  public void c(boolean paramBoolean) {}
  
  public void d(long paramLong, int paramInt)
  {
    k = paramInt;
    if ((!j) && ((o != 0) || (!m))) {
      i = true;
    }
    if (paramLong != -9223372036854775807L)
    {
      boolean bool = i;
      double d1 = paramLong;
      if (bool) {
        h = d1;
      } else {
        g = d1;
      }
    }
  }
  
  public void e(t paramt, K.d paramd)
  {
    paramd.a();
    e = paramd.b();
    f = paramt.a(paramd.c(), 1);
  }
  
  public final void f(z paramz1, z paramz2, boolean paramBoolean)
  {
    int i1 = paramz1.f();
    int i2 = Math.min(paramz1.a(), paramz2.a());
    paramz1.l(paramz2.e(), paramz2.f(), i2);
    paramz2.U(i2);
    if (paramBoolean) {
      paramz1.T(i1);
    }
  }
  
  public final void g()
  {
    int i1;
    if (u)
    {
      j = false;
      i1 = 1;
    }
    else
    {
      i1 = 0;
    }
    double d1 = (r - s) * 1000000.0D / q;
    long l1 = Math.round(g);
    if (i)
    {
      i = false;
      g = h;
    }
    else
    {
      g += d1;
    }
    f.b(l1, i1, o, 0, null);
    u = false;
    s = 0;
    o = 0;
  }
  
  public final void h(y paramy)
  {
    Object localObject = v.h(paramy);
    q = b;
    r = c;
    long l1 = t;
    long l2 = p.b;
    if (l1 != l2)
    {
      t = l2;
      int i1 = a;
      paramy = "mhm1";
      if (i1 != -1)
      {
        paramy = new StringBuilder();
        paramy.append("mhm1");
        paramy.append(String.format(".%02X", new Object[] { Integer.valueOf(a) }));
        paramy = paramy.toString();
      }
      localObject = d;
      if ((localObject != null) && (localObject.length > 0)) {
        localObject = X2.v.a0(M.f, localObject);
      } else {
        localObject = null;
      }
      paramy = new q.b().a0(e).o0("audio/mhm1").p0(q).O(paramy).b0((List)localObject).K();
      f.d(paramy);
    }
    u = true;
  }
  
  public final boolean i()
  {
    int i1 = a.g();
    b.o(a.e(), i1);
    boolean bool = v.g(b, p);
    if (bool)
    {
      n = 0;
      o += p.c + i1;
    }
    return bool;
  }
  
  public final boolean j(int paramInt)
  {
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (paramInt != 1) {
      if (paramInt == 17) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
    }
    return bool2;
  }
  
  public final void l(z paramz)
  {
    int i1 = Math.min(paramz.a(), p.c - n);
    f.e(paramz, i1);
    n += i1;
  }
}

/* Location:
 * Qualified Name:     l1.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */