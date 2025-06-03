package l1;

import F0.T;
import F0.b;
import F0.b.b;
import F0.t;
import d0.q;
import d0.q.b;
import g0.M;
import g0.a;
import g0.y;
import g0.z;

public final class c
  implements m
{
  public final y a;
  public final z b;
  public final String c;
  public final int d;
  public String e;
  public T f;
  public int g;
  public int h;
  public boolean i;
  public long j;
  public q k;
  public int l;
  public long m;
  
  public c()
  {
    this(null, 0);
  }
  
  public c(String paramString, int paramInt)
  {
    y localy = new y(new byte['']);
    a = localy;
    b = new z(a);
    g = 0;
    m = -9223372036854775807L;
    c = paramString;
    d = paramInt;
  }
  
  public void a(z paramz)
  {
    a.h(f);
    while (paramz.a() > 0)
    {
      int n = g;
      boolean bool = true;
      if (n != 0)
      {
        if (n != 1)
        {
          if (n == 2)
          {
            n = Math.min(paramz.a(), l - h);
            f.e(paramz, n);
            n = h + n;
            h = n;
            if (n == l)
            {
              if (m == -9223372036854775807L) {
                bool = false;
              }
              a.f(bool);
              f.b(m, 1, l, 0, null);
              m += j;
              g = 0;
            }
          }
        }
        else if (f(paramz, b.e(), 128))
        {
          g();
          b.T(0);
          f.e(b, 128);
          g = 2;
        }
      }
      else if (h(paramz))
      {
        g = 1;
        b.e()[0] = ((byte)11);
        b.e()[1] = ((byte)119);
        h = 2;
      }
    }
  }
  
  public void b()
  {
    g = 0;
    h = 0;
    i = false;
    m = -9223372036854775807L;
  }
  
  public void c(boolean paramBoolean) {}
  
  public void d(long paramLong, int paramInt)
  {
    m = paramLong;
  }
  
  public void e(t paramt, K.d paramd)
  {
    paramd.a();
    e = paramd.b();
    f = paramt.a(paramd.c(), 1);
  }
  
  public final boolean f(z paramz, byte[] paramArrayOfByte, int paramInt)
  {
    int n = Math.min(paramz.a(), paramInt - h);
    paramz.l(paramArrayOfByte, h, n);
    n = h + n;
    h = n;
    boolean bool;
    if (n == paramInt) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void g()
  {
    a.p(0);
    b.b localb = b.f(a);
    Object localObject = k;
    if ((localObject == null) || (d != B) || (c != C) || (!M.c(a, n)))
    {
      localObject = new q.b().a0(e).o0(a).N(d).p0(c).e0(c).m0(d).j0(g);
      if ("audio/ac3".equals(a)) {
        ((q.b)localObject).M(g);
      }
      localObject = ((q.b)localObject).K();
      k = ((q)localObject);
      f.d((q)localObject);
    }
    l = e;
    j = (f * 1000000L / k.C);
  }
  
  public final boolean h(z paramz)
  {
    int n = paramz.a();
    boolean bool = false;
    if (n > 0)
    {
      if (!i) {
        if (paramz.G() != 11) {}
      }
      for (;;)
      {
        bool = true;
        do
        {
          i = bool;
          break;
          n = paramz.G();
          if (n == 119)
          {
            i = false;
            return true;
          }
        } while (n != 11);
      }
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     l1.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */