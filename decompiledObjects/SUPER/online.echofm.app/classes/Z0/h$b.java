package Z0;

import F0.T;
import d0.m;
import d0.q;
import d0.q.b;
import g0.M;
import g0.z;

public final class h$b
{
  public final T a;
  public final u b;
  public final z c;
  public v d;
  public d e;
  public int f;
  public int g;
  public int h;
  public int i;
  public final z j;
  public final z k;
  public boolean l;
  
  public h$b(T paramT, v paramv, d paramd)
  {
    a = paramT;
    d = paramv;
    e = paramd;
    b = new u();
    c = new z();
    j = new z(1);
    k = new z();
    j(paramv, paramd);
  }
  
  public int c()
  {
    int m;
    if (!l) {
      m = d.g[f];
    } else if (b.k[f] != 0) {
      m = 1;
    } else {
      m = 0;
    }
    int n = m;
    if (g() != null) {
      n = m | 0x40000000;
    }
    return n;
  }
  
  public long d()
  {
    long l1;
    if (!l) {
      l1 = d.c[f];
    } else {
      l1 = b.g[h];
    }
    return l1;
  }
  
  public long e()
  {
    long l1;
    if (!l) {
      l1 = d.f[f];
    } else {
      l1 = b.c(f);
    }
    return l1;
  }
  
  public int f()
  {
    int m;
    if (!l) {
      m = d.d[f];
    } else {
      m = b.i[f];
    }
    return m;
  }
  
  public t g()
  {
    boolean bool = l;
    Object localObject1 = null;
    if (!bool) {
      return null;
    }
    int m = ib.a)).a;
    t localt = b.n;
    if (localt == null) {
      localt = d.a.a(m);
    }
    Object localObject2 = localObject1;
    if (localt != null)
    {
      localObject2 = localObject1;
      if (a) {
        localObject2 = localt;
      }
    }
    return (t)localObject2;
  }
  
  public boolean h()
  {
    f += 1;
    if (!l) {
      return false;
    }
    int m = g + 1;
    g = m;
    int[] arrayOfInt = b.h;
    int n = h;
    if (m == arrayOfInt[n])
    {
      h = (n + 1);
      g = 0;
      return false;
    }
    return true;
  }
  
  public int i(int paramInt1, int paramInt2)
  {
    Object localObject1 = g();
    if (localObject1 == null) {
      return 0;
    }
    int m = d;
    if (m != 0)
    {
      localObject1 = b.o;
    }
    else
    {
      localObject2 = (byte[])M.i(e);
      k.R((byte[])localObject2, localObject2.length);
      localObject1 = k;
      m = localObject2.length;
    }
    boolean bool = b.g(f);
    int n;
    if ((!bool) && (paramInt2 == 0)) {
      n = 0;
    } else {
      n = 1;
    }
    Object localObject2 = j.e();
    int i1;
    if (n != 0) {
      i1 = 128;
    } else {
      i1 = 0;
    }
    localObject2[0] = ((byte)(byte)(i1 | m));
    j.T(0);
    a.a(j, 1, 1);
    a.a((z)localObject1, m, 1);
    if (n == 0) {
      return m + 1;
    }
    if (!bool)
    {
      c.P(8);
      localObject1 = c.e();
      localObject1[0] = ((byte)0);
      localObject1[1] = ((byte)1);
      localObject1[2] = ((byte)(byte)(paramInt2 >> 8 & 0xFF));
      localObject1[3] = ((byte)(byte)(paramInt2 & 0xFF));
      localObject1[4] = ((byte)(byte)(paramInt1 >> 24 & 0xFF));
      localObject1[5] = ((byte)(byte)(paramInt1 >> 16 & 0xFF));
      localObject1[6] = ((byte)(byte)(paramInt1 >> 8 & 0xFF));
      localObject1[7] = ((byte)(byte)(paramInt1 & 0xFF));
      a.a(c, 8, 1);
      return m + 9;
    }
    localObject2 = b.o;
    paramInt1 = ((z)localObject2).M();
    ((z)localObject2).U(-2);
    paramInt1 = paramInt1 * 6 + 2;
    localObject1 = localObject2;
    if (paramInt2 != 0)
    {
      c.P(paramInt1);
      localObject1 = c.e();
      ((z)localObject2).l((byte[])localObject1, 0, paramInt1);
      paramInt2 = ((localObject1[2] & 0xFF) << 8 | localObject1[3] & 0xFF) + paramInt2;
      localObject1[2] = ((byte)(byte)(paramInt2 >> 8 & 0xFF));
      localObject1[3] = ((byte)(byte)(paramInt2 & 0xFF));
      localObject1 = c;
    }
    a.a((z)localObject1, paramInt1, 1);
    return m + 1 + paramInt1;
  }
  
  public void j(v paramv, d paramd)
  {
    d = paramv;
    e = paramd;
    a.d(a.f);
    k();
  }
  
  public void k()
  {
    b.f();
    f = 0;
    h = 0;
    g = 0;
    i = 0;
    l = false;
  }
  
  public void l(long paramLong)
  {
    for (int m = f;; m++)
    {
      u localu = b;
      if ((m >= f) || (localu.c(m) > paramLong)) {
        break;
      }
      if (b.k[m] != 0) {
        i = m;
      }
    }
  }
  
  public void m()
  {
    t localt = g();
    if (localt == null) {
      return;
    }
    z localz = b.o;
    int m = d;
    if (m != 0) {
      localz.U(m);
    }
    if (b.g(f)) {
      localz.U(localz.M() * 6);
    }
  }
  
  public void n(m paramm)
  {
    Object localObject = d.a.a(ib.a)).a);
    if (localObject != null) {
      localObject = b;
    } else {
      localObject = null;
    }
    paramm = paramm.c((String)localObject);
    paramm = d.a.f.a().U(paramm).K();
    a.d(paramm);
  }
}

/* Location:
 * Qualified Name:     Z0.h.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */