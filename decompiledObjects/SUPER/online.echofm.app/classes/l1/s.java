package l1;

import F0.T;
import F0.a.b;
import F0.t;
import d0.A;
import d0.q;
import d0.q.b;
import g0.y;
import g0.z;
import java.util.Collections;

public final class s
  implements m
{
  public final String a;
  public final int b;
  public final z c;
  public final y d;
  public T e;
  public String f;
  public q g;
  public int h;
  public int i;
  public int j;
  public int k;
  public long l;
  public boolean m;
  public int n;
  public int o;
  public int p;
  public boolean q;
  public long r;
  public int s;
  public long t;
  public int u;
  public String v;
  
  public s(String paramString, int paramInt)
  {
    a = paramString;
    b = paramInt;
    paramString = new z(1024);
    c = paramString;
    d = new y(paramString.e());
    l = -9223372036854775807L;
  }
  
  public static long f(y paramy)
  {
    return paramy.h((paramy.h(2) + 1) * 8);
  }
  
  public void a(z paramz)
  {
    g0.a.h(e);
    while (paramz.a() > 0)
    {
      int i1 = h;
      if (i1 != 0)
      {
        if (i1 != 1) {
          if (i1 != 2) {
            if (i1 == 3)
            {
              i1 = Math.min(paramz.a(), j - i);
              paramz.l(d.a, i, i1);
              i1 = i + i1;
              i = i1;
              if (i1 != j) {
                continue;
              }
              d.p(0);
              g(d);
            }
          }
        }
        for (;;)
        {
          h = 0;
          break;
          throw new IllegalStateException();
          i1 = (k & 0xFF1F) << 8 | paramz.G();
          j = i1;
          if (i1 > c.e().length) {
            m(j);
          }
          i = 0;
          h = 3;
          break;
          i1 = paramz.G();
          if ((i1 & 0xE0) == 224)
          {
            k = i1;
            h = 2;
            break;
          }
          if (i1 == 86) {
            break;
          }
        }
      }
      else if (paramz.G() == 86)
      {
        h = 1;
      }
    }
  }
  
  public void b()
  {
    h = 0;
    l = -9223372036854775807L;
    m = false;
  }
  
  public void c(boolean paramBoolean) {}
  
  public void d(long paramLong, int paramInt)
  {
    l = paramLong;
  }
  
  public void e(t paramt, K.d paramd)
  {
    paramd.a();
    e = paramt.a(paramd.c(), 1);
    f = paramd.b();
  }
  
  public final void g(y paramy)
  {
    if (!paramy.g())
    {
      m = true;
      l(paramy);
    }
    else if (!m)
    {
      return;
    }
    if (n == 0)
    {
      if (o == 0)
      {
        k(paramy, j(paramy));
        if (q) {
          paramy.r((int)r);
        }
        return;
      }
      throw A.a(null, null);
    }
    throw A.a(null, null);
  }
  
  public final int h(y paramy)
  {
    int i1 = paramy.b();
    a.b localb = F0.a.d(paramy, true);
    v = c;
    s = a;
    u = b;
    return i1 - paramy.b();
  }
  
  public final void i(y paramy)
  {
    int i1 = paramy.h(3);
    p = i1;
    if (i1 != 0) {
      if (i1 != 1)
      {
        if ((i1 != 3) && (i1 != 4) && (i1 != 5))
        {
          if ((i1 != 6) && (i1 != 7)) {
            throw new IllegalStateException();
          }
          paramy.r(1);
          return;
        }
        paramy.r(6);
        return;
      }
    }
    for (i1 = 9;; i1 = 8)
    {
      paramy.r(i1);
      break;
    }
  }
  
  public final int j(y paramy)
  {
    if (p == 0)
    {
      int i1 = 0;
      int i2;
      int i3;
      do
      {
        i2 = paramy.h(8);
        i3 = i1 + i2;
        i1 = i3;
      } while (i2 == 255);
      return i3;
    }
    throw A.a(null, null);
  }
  
  public final void k(y paramy, int paramInt)
  {
    int i1 = paramy.e();
    boolean bool = false;
    if ((i1 & 0x7) == 0)
    {
      c.T(i1 >> 3);
    }
    else
    {
      paramy.i(c.e(), 0, paramInt * 8);
      c.T(0);
    }
    e.e(c, paramInt);
    if (l != -9223372036854775807L) {
      bool = true;
    }
    g0.a.f(bool);
    e.b(l, 1, paramInt, 0, null);
    l += t;
  }
  
  public final void l(y paramy)
  {
    int i1 = paramy.h(1);
    int i2;
    if (i1 == 1) {
      i2 = paramy.h(1);
    } else {
      i2 = 0;
    }
    n = i2;
    if (i2 == 0)
    {
      if (i1 == 1) {
        f(paramy);
      }
      if (paramy.g())
      {
        o = paramy.h(6);
        i2 = paramy.h(4);
        int i3 = paramy.h(3);
        if ((i2 == 0) && (i3 == 0))
        {
          if (i1 == 0)
          {
            i3 = paramy.e();
            i2 = h(paramy);
            paramy.p(i3);
            Object localObject = new byte[(i2 + 7) / 8];
            paramy.i((byte[])localObject, 0, i2);
            localObject = new q.b().a0(f).o0("audio/mp4a-latm").O(v).N(u).p0(s).b0(Collections.singletonList(localObject)).e0(a).m0(b).K();
            if (!((q)localObject).equals(g))
            {
              g = ((q)localObject);
              t = (1024000000L / C);
              e.d((q)localObject);
            }
          }
          else
          {
            paramy.r((int)f(paramy) - h(paramy));
          }
          i(paramy);
          boolean bool = paramy.g();
          q = bool;
          r = 0L;
          if (bool) {
            if (i1 == 1) {
              r = f(paramy);
            } else {
              do
              {
                bool = paramy.g();
                r = ((r << 8) + paramy.h(8));
              } while (bool);
            }
          }
          if (paramy.g()) {
            paramy.r(8);
          }
          return;
        }
        throw A.a(null, null);
      }
      throw A.a(null, null);
    }
    throw A.a(null, null);
  }
  
  public final void m(int paramInt)
  {
    c.P(paramInt);
    d.n(c.e());
  }
}

/* Location:
 * Qualified Name:     l1.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */