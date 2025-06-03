package a1;

import F0.L;
import F0.M.b;
import F0.T;
import F0.s;
import F0.t;
import d0.q;
import g0.z;

public abstract class i
{
  public final e a = new e();
  public T b;
  public t c;
  public g d;
  public long e;
  public long f;
  public long g;
  public int h;
  public int i;
  public b j = new b();
  public long k;
  public boolean l;
  public boolean m;
  
  public final void a()
  {
    g0.a.h(b);
    g0.M.i(c);
  }
  
  public long b(long paramLong)
  {
    return paramLong * 1000000L / i;
  }
  
  public long c(long paramLong)
  {
    return i * paramLong / 1000000L;
  }
  
  public void d(t paramt, T paramT)
  {
    c = paramt;
    b = paramT;
    l(true);
  }
  
  public void e(long paramLong)
  {
    g = paramLong;
  }
  
  public abstract long f(z paramz);
  
  public final int g(s params, L paramL)
  {
    a();
    int n = h;
    if (n != 0)
    {
      if (n != 1)
      {
        if (n != 2)
        {
          if (n == 3) {
            return -1;
          }
          throw new IllegalStateException();
        }
        g0.M.i(d);
        return k(params, paramL);
      }
      params.i((int)f);
      h = 2;
      return 0;
    }
    return j(params);
  }
  
  public final boolean h(s params)
  {
    for (;;)
    {
      if (!a.d(params))
      {
        h = 3;
        return false;
      }
      k = (params.p() - f);
      if (!i(a.c(), f, j)) {
        break;
      }
      f = params.p();
    }
    return true;
  }
  
  public abstract boolean i(z paramz, long paramLong, b paramb);
  
  public final int j(s params)
  {
    if (!h(params)) {
      return -1;
    }
    Object localObject = j.a;
    i = C;
    if (!m)
    {
      b.d((q)localObject);
      m = true;
    }
    localObject = j.b;
    if (localObject != null) {}
    for (params = (s)localObject;; params = new c(null))
    {
      d = params;
      break label156;
      if (params.a() != -1L) {
        break;
      }
    }
    localObject = a.b();
    boolean bool;
    if ((b & 0x4) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    d = new a(this, f, params.a(), h + i, c, bool);
    label156:
    h = 2;
    a.f();
    return 0;
  }
  
  public final int k(s params, L paramL)
  {
    long l1 = d.c(params);
    if (l1 >= 0L)
    {
      a = l1;
      return 1;
    }
    if (l1 < -1L) {
      e(-(l1 + 2L));
    }
    if (!l)
    {
      paramL = (F0.M)g0.a.h(d.a());
      c.e(paramL);
      l = true;
    }
    if ((k <= 0L) && (!a.d(params)))
    {
      h = 3;
      return -1;
    }
    k = 0L;
    params = a.c();
    l1 = f(params);
    if (l1 >= 0L)
    {
      long l2 = g;
      if (l2 + l1 >= e)
      {
        l2 = b(l2);
        b.e(params, params.g());
        b.b(l2, 1, params.g(), 0, null);
        e = -1L;
      }
    }
    g += l1;
    return 0;
  }
  
  public void l(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      j = new b();
      f = 0L;
    }
    for (int n = 0;; n = 1)
    {
      h = n;
      break;
    }
    e = -1L;
    g = 0L;
  }
  
  public final void m(long paramLong1, long paramLong2)
  {
    a.e();
    if (paramLong1 == 0L)
    {
      l(l ^ true);
    }
    else if (h != 0)
    {
      e = c(paramLong2);
      ((g)g0.M.i(d)).b(e);
      h = 2;
    }
  }
  
  public static class b
  {
    public q a;
    public g b;
  }
  
  public static final class c
    implements g
  {
    public F0.M a()
    {
      return new M.b(-9223372036854775807L);
    }
    
    public void b(long paramLong) {}
    
    public long c(s params)
    {
      return -1L;
    }
  }
}

/* Location:
 * Qualified Name:     a1.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */