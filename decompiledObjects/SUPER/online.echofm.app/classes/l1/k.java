package l1;

import F0.T;
import F0.p;
import F0.p.b;
import F0.t;
import a3.f;
import d0.q;
import d0.q.b;
import g0.M;
import g0.a;
import g0.z;
import java.util.concurrent.atomic.AtomicInteger;

public final class k
  implements m
{
  public final z a;
  public final AtomicInteger b;
  public final String c;
  public final int d;
  public String e;
  public T f;
  public int g;
  public int h;
  public int i;
  public long j;
  public q k;
  public int l;
  public int m;
  public int n;
  public int o;
  public long p;
  
  public k(String paramString, int paramInt1, int paramInt2)
  {
    a = new z(new byte[paramInt2]);
    g = 0;
    p = -9223372036854775807L;
    b = new AtomicInteger();
    n = -1;
    o = -1;
    c = paramString;
    d = paramInt1;
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
  
  public void a(z paramz)
  {
    a.h(f);
    while (paramz.a() > 0)
    {
      int i1;
      Object localObject;
      T localT;
      switch (g)
      {
      default: 
        throw new IllegalStateException();
      case 6: 
        i1 = Math.min(paramz.a(), l - h);
        f.e(paramz, i1);
        i1 = h + i1;
        h = i1;
        if (i1 == l)
        {
          boolean bool;
          if (p != -9223372036854775807L) {
            bool = true;
          } else {
            bool = false;
          }
          a.f(bool);
          localObject = f;
          long l1 = p;
          if (m == 4) {
            i1 = 0;
          } else {
            i1 = 1;
          }
          ((T)localObject).b(l1, i1, l, 0, null);
          p += j;
          g = 0;
        }
        break;
      case 5: 
        if (f(paramz, a.e(), o))
        {
          i();
          a.T(0);
          localT = f;
          localObject = a;
          i1 = o;
          localT.e((z)localObject, i1);
          g = 6;
        }
        break;
      case 4: 
        if (f(paramz, a.e(), 6))
        {
          int i2 = p.l(a.e());
          o = i2;
          i1 = h;
          if (i1 > i2)
          {
            i2 = i1 - i2;
            h = (i1 - i2);
            paramz.T(paramz.f() - i2);
          }
        }
        break;
      case 3: 
      case 2: 
      case 1: 
      case 0: 
        label250:
        label260:
        for (i1 = 5;; i1 = 2)
        {
          g = i1;
          break;
          if (!f(paramz, a.e(), n)) {
            break;
          }
          h();
          a.T(0);
          localT = f;
          localObject = a;
          i1 = n;
          break label250;
          if (!f(paramz, a.e(), 7)) {
            break;
          }
          n = p.j(a.e());
          g = 3;
          break;
          if (!f(paramz, a.e(), 18)) {
            break;
          }
          g();
          a.T(0);
          f.e(a, 18);
          break label260;
          if (!j(paramz)) {
            break;
          }
          i1 = m;
          if ((i1 == 3) || (i1 == 4)) {
            break label531;
          }
          if (i1 == 1)
          {
            g = 1;
            break;
          }
        }
        label531:
        g = 4;
      }
    }
  }
  
  public void b()
  {
    g = 0;
    h = 0;
    i = 0;
    p = -9223372036854775807L;
    b.set(0);
  }
  
  public void c(boolean paramBoolean) {}
  
  public void d(long paramLong, int paramInt)
  {
    p = paramLong;
  }
  
  public void e(t paramt, K.d paramd)
  {
    paramd.a();
    e = paramd.b();
    f = paramt.a(paramd.c(), 1);
  }
  
  public final void g()
  {
    byte[] arrayOfByte = a.e();
    if (k == null)
    {
      q localq = p.h(arrayOfByte, e, c, d, null);
      k = localq;
      f.d(localq);
    }
    l = p.b(arrayOfByte);
    j = f.d(M.V0(p.g(arrayOfByte), k.C));
  }
  
  public final void h()
  {
    p.b localb = p.i(a.e());
    k(localb);
    l = d;
    long l1 = e;
    long l2 = l1;
    if (l1 == -9223372036854775807L) {
      l2 = 0L;
    }
    j = l2;
  }
  
  public final void i()
  {
    p.b localb = p.k(a.e(), b);
    if (m == 3) {
      k(localb);
    }
    l = d;
    long l1 = e;
    long l2 = l1;
    if (l1 == -9223372036854775807L) {
      l2 = 0L;
    }
    j = l2;
  }
  
  public final boolean j(z paramz)
  {
    while (paramz.a() > 0)
    {
      int i1 = i << 8;
      i = i1;
      i1 |= paramz.G();
      i = i1;
      i1 = p.c(i1);
      m = i1;
      if (i1 != 0)
      {
        paramz = a.e();
        i1 = i;
        paramz[0] = ((byte)(byte)(i1 >> 24 & 0xFF));
        paramz[1] = ((byte)(byte)(i1 >> 16 & 0xFF));
        paramz[2] = ((byte)(byte)(i1 >> 8 & 0xFF));
        paramz[3] = ((byte)(byte)(i1 & 0xFF));
        h = 4;
        i = 0;
        return true;
      }
    }
    return false;
  }
  
  public final void k(p.b paramb)
  {
    int i1 = b;
    if (i1 != -2147483647)
    {
      int i2 = c;
      if (i2 != -1)
      {
        Object localObject = k;
        if ((localObject == null) || (i2 != B) || (i1 != C) || (!M.c(a, n)))
        {
          localObject = k;
          if (localObject == null) {
            localObject = new q.b();
          } else {
            localObject = ((q)localObject).a();
          }
          paramb = ((q.b)localObject).a0(e).o0(a).N(c).p0(b).e0(c).m0(d).K();
          k = paramb;
          f.d(paramb);
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     l1.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */