package l1;

import F0.I.a;
import F0.T;
import d0.q.b;
import g0.a;
import g0.z;

public final class t
  implements m
{
  public final z a;
  public final I.a b;
  public final String c;
  public final int d;
  public T e;
  public String f;
  public int g = 0;
  public int h;
  public boolean i;
  public boolean j;
  public long k;
  public int l;
  public long m;
  
  public t()
  {
    this(null, 0);
  }
  
  public t(String paramString, int paramInt)
  {
    z localz = new z(4);
    a = localz;
    localz.e()[0] = ((byte)-1);
    b = new I.a();
    m = -9223372036854775807L;
    c = paramString;
    d = paramInt;
  }
  
  public void a(z paramz)
  {
    a.h(e);
    while (paramz.a() > 0)
    {
      int n = g;
      if (n != 0)
      {
        if (n != 1)
        {
          if (n == 2) {
            g(paramz);
          } else {
            throw new IllegalStateException();
          }
        }
        else {
          h(paramz);
        }
      }
      else {
        f(paramz);
      }
    }
  }
  
  public void b()
  {
    g = 0;
    h = 0;
    j = false;
    m = -9223372036854775807L;
  }
  
  public void c(boolean paramBoolean) {}
  
  public void d(long paramLong, int paramInt)
  {
    m = paramLong;
  }
  
  public void e(F0.t paramt, K.d paramd)
  {
    paramd.a();
    f = paramd.b();
    e = paramt.a(paramd.c(), 1);
  }
  
  public final void f(z paramz)
  {
    byte[] arrayOfByte = paramz.e();
    int n = paramz.f();
    int i1 = paramz.g();
    while (n < i1)
    {
      int i2 = arrayOfByte[n];
      boolean bool;
      if ((i2 & 0xFF) == 255) {
        bool = true;
      } else {
        bool = false;
      }
      if ((j) && ((i2 & 0xE0) == 224)) {
        i2 = 1;
      } else {
        i2 = 0;
      }
      j = bool;
      if (i2 != 0)
      {
        paramz.T(n + 1);
        j = false;
        a.e()[1] = ((byte)arrayOfByte[n]);
        h = 2;
        g = 1;
        return;
      }
      n++;
    }
    paramz.T(i1);
  }
  
  public final void g(z paramz)
  {
    int n = Math.min(paramz.a(), l - h);
    e.e(paramz, n);
    n = h + n;
    h = n;
    if (n < l) {
      return;
    }
    boolean bool;
    if (m != -9223372036854775807L) {
      bool = true;
    } else {
      bool = false;
    }
    a.f(bool);
    e.b(m, 1, l, 0, null);
    m += k;
    h = 0;
    g = 0;
  }
  
  public final void h(z paramz)
  {
    int n = Math.min(paramz.a(), 4 - h);
    paramz.l(a.e(), h, n);
    n = h + n;
    h = n;
    if (n < 4) {
      return;
    }
    a.T(0);
    if (!b.a(a.p()))
    {
      h = 0;
      g = 1;
      return;
    }
    paramz = b;
    l = c;
    if (!i)
    {
      k = (g * 1000000L / d);
      paramz = new q.b().a0(f).o0(b.b).f0(4096).N(b.e).p0(b.d).e0(c).m0(d).K();
      e.d(paramz);
      i = true;
    }
    a.T(0);
    e.e(a, 4);
    g = 2;
  }
}

/* Location:
 * Qualified Name:     l1.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */