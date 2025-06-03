package N0;

import F0.L;
import F0.M.b;
import F0.T;
import F0.r;
import F0.s;
import F0.t;
import Z0.m;
import c1.t.a;
import d0.q.b;
import d0.x;
import d0.x.b;
import g0.z;

public final class b
  implements r
{
  public final z a = new z(6);
  public t b;
  public int c;
  public int d;
  public int e;
  public long f = -1L;
  public U0.a g;
  public s h;
  public d i;
  public m j;
  
  public static U0.a h(String paramString, long paramLong)
  {
    if (paramLong == -1L) {
      return null;
    }
    paramString = f.a(paramString);
    if (paramString == null) {
      return null;
    }
    return paramString.a(paramLong);
  }
  
  private void m(s params)
  {
    if (d == 65505)
    {
      Object localObject = new z(e);
      params.readFully(((z)localObject).e(), 0, e);
      if ((g == null) && ("http://ns.adobe.com/xap/1.0/".equals(((z)localObject).A())))
      {
        localObject = ((z)localObject).A();
        if (localObject != null)
        {
          params = h((String)localObject, params.a());
          g = params;
          if (params != null) {
            f = r;
          }
        }
      }
    }
    else
    {
      params.i(e);
    }
    c = 0;
  }
  
  public void a(long paramLong1, long paramLong2)
  {
    if (paramLong1 == 0L)
    {
      c = 0;
      j = null;
    }
    else if (c == 5)
    {
      ((m)g0.a.e(j)).a(paramLong1, paramLong2);
    }
  }
  
  public void b(t paramt)
  {
    b = paramt;
  }
  
  public final void c(s params)
  {
    a.P(2);
    params.n(a.e(), 0, 2);
    params.o(a.M() - 2);
  }
  
  public boolean e(s params)
  {
    int k = k(params);
    boolean bool1 = false;
    if (k != 65496) {
      return false;
    }
    k = k(params);
    d = k;
    if (k == 65504)
    {
      c(params);
      d = k(params);
    }
    if (d != 65505) {
      return false;
    }
    params.o(2);
    a.P(6);
    params.n(a.e(), 0, 6);
    boolean bool2 = bool1;
    if (a.I() == 1165519206L)
    {
      bool2 = bool1;
      if (a.M() == 0) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public final void f()
  {
    ((t)g0.a.e(b)).j();
    b.e(new M.b(-9223372036854775807L));
    c = 6;
  }
  
  public int i(s params, L paramL)
  {
    int k = c;
    if (k != 0)
    {
      if (k != 1)
      {
        if (k != 2)
        {
          if (k != 4)
          {
            if (k != 5)
            {
              if (k == 6) {
                return -1;
              }
              throw new IllegalStateException();
            }
            if ((i == null) || (params != h))
            {
              h = params;
              i = new d(params, f);
            }
            k = ((m)g0.a.e(j)).i(i, paramL);
            if (k == 1) {
              a += f;
            }
            return k;
          }
          long l1 = params.p();
          long l2 = f;
          if (l1 != l2)
          {
            a = l2;
            return 1;
          }
          o(params);
          return 0;
        }
        m(params);
        return 0;
      }
      n(params);
      return 0;
    }
    l(params);
    return 0;
  }
  
  public final void j(U0.a parama)
  {
    ((t)g0.a.e(b)).a(1024, 4).d(new q.b().Q("image/jpeg").h0(new x(new x.b[] { parama })).K());
  }
  
  public final int k(s params)
  {
    a.P(2);
    params.n(a.e(), 0, 2);
    return a.M();
  }
  
  public final void l(s params)
  {
    a.P(2);
    params.readFully(a.e(), 0, 2);
    int k = a.M();
    d = k;
    if (k == 65498) {
      if (f == -1L) {}
    }
    for (k = 4;; k = 1)
    {
      c = k;
      break;
      f();
      break;
      if (((k >= 65488) && (k <= 65497)) || (k == 65281)) {
        break;
      }
    }
  }
  
  public final void n(s params)
  {
    a.P(2);
    params.readFully(a.e(), 0, 2);
    e = (a.M() - 2);
    c = 2;
  }
  
  public final void o(s params)
  {
    if (!params.l(a.e(), 0, 1, true)) {}
    do
    {
      f();
      break;
      params.h();
      if (j == null) {
        j = new m(t.a.a, 8);
      }
      params = new d(params, f);
      i = params;
    } while (!j.e(params));
    j.b(new e(f, (t)g0.a.e(b)));
    p();
  }
  
  public final void p()
  {
    j((U0.a)g0.a.e(g));
    c = 5;
  }
  
  public void release()
  {
    m localm = j;
    if (localm != null) {
      localm.release();
    }
  }
}

/* Location:
 * Qualified Name:     N0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */