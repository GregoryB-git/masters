package l1;

import F0.T;
import F0.c;
import F0.c.b;
import F0.t;
import d0.q;
import d0.q.b;
import g0.a;
import g0.y;
import g0.z;

public final class f
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
  public boolean j;
  public long k;
  public q l;
  public int m;
  public long n;
  
  public f()
  {
    this(null, 0);
  }
  
  public f(String paramString, int paramInt)
  {
    y localy = new y(new byte[16]);
    a = localy;
    b = new z(a);
    g = 0;
    h = 0;
    i = false;
    j = false;
    n = -9223372036854775807L;
    c = paramString;
    d = paramInt;
  }
  
  private boolean f(z paramz, byte[] paramArrayOfByte, int paramInt)
  {
    int i1 = Math.min(paramz.a(), paramInt - h);
    paramz.l(paramArrayOfByte, h, i1);
    i1 = h + i1;
    h = i1;
    boolean bool;
    if (i1 == paramInt) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void g()
  {
    a.p(0);
    c.b localb = c.d(a);
    q localq = l;
    if ((localq == null) || (c != B) || (b != C) || (!"audio/ac4".equals(n)))
    {
      localq = new q.b().a0(e).o0("audio/ac4").N(c).p0(b).e0(c).m0(d).K();
      l = localq;
      f.d(localq);
    }
    m = d;
    k = (e * 1000000L / l.C);
  }
  
  private boolean h(z paramz)
  {
    int i1;
    boolean bool1;
    do
    {
      for (;;)
      {
        i1 = paramz.a();
        bool1 = false;
        bool2 = false;
        if (i1 <= 0) {
          break label102;
        }
        if (i) {
          break;
        }
        if (paramz.G() == 172) {
          bool2 = true;
        }
        i = bool2;
      }
      i1 = paramz.G();
      if (i1 == 172) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      i = bool2;
    } while ((i1 != 64) && (i1 != 65));
    boolean bool2 = bool1;
    if (i1 == 65) {
      bool2 = true;
    }
    j = bool2;
    return true;
    label102:
    return false;
  }
  
  public void a(z paramz)
  {
    a.h(f);
    while (paramz.a() > 0)
    {
      int i1 = g;
      boolean bool = true;
      if (i1 != 0)
      {
        if (i1 != 1)
        {
          if (i1 == 2)
          {
            i1 = Math.min(paramz.a(), m - h);
            f.e(paramz, i1);
            i1 = h + i1;
            h = i1;
            if (i1 == m)
            {
              if (n == -9223372036854775807L) {
                bool = false;
              }
              a.f(bool);
              f.b(n, 1, m, 0, null);
              n += k;
              g = 0;
            }
          }
        }
        else if (f(paramz, b.e(), 16))
        {
          g();
          b.T(0);
          f.e(b, 16);
          g = 2;
        }
      }
      else if (h(paramz))
      {
        g = 1;
        b.e()[0] = ((byte)-84);
        byte[] arrayOfByte = b.e();
        if (j) {
          i1 = 65;
        } else {
          i1 = 64;
        }
        arrayOfByte[1] = ((byte)(byte)i1);
        h = 2;
      }
    }
  }
  
  public void b()
  {
    g = 0;
    h = 0;
    i = false;
    j = false;
    n = -9223372036854775807L;
  }
  
  public void c(boolean paramBoolean) {}
  
  public void d(long paramLong, int paramInt)
  {
    n = paramLong;
  }
  
  public void e(t paramt, K.d paramd)
  {
    paramd.a();
    e = paramd.b();
    f = paramt.a(paramd.c(), 1);
  }
}

/* Location:
 * Qualified Name:     l1.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */