package a1;

import F0.L;
import F0.T;
import F0.r;
import F0.s;
import F0.t;
import F0.x;
import d0.A;
import g0.a;
import g0.z;

public class d
  implements r
{
  public static final x d = new c();
  public t a;
  public i b;
  public boolean c;
  
  public static z h(z paramz)
  {
    paramz.T(0);
    return paramz;
  }
  
  public void a(long paramLong1, long paramLong2)
  {
    i locali = b;
    if (locali != null) {
      locali.m(paramLong1, paramLong2);
    }
  }
  
  public void b(t paramt)
  {
    a = paramt;
  }
  
  public boolean e(s params)
  {
    try
    {
      boolean bool = j(params);
      return bool;
    }
    catch (A params) {}
    return false;
  }
  
  public int i(s params, L paramL)
  {
    a.h(a);
    if (b == null) {
      if (j(params)) {
        params.h();
      } else {
        throw A.a("Failed to determine bitstream type", null);
      }
    }
    if (!c)
    {
      T localT = a.a(0, 1);
      a.j();
      b.d(a, localT);
      c = true;
    }
    return b.g(params, paramL);
  }
  
  public final boolean j(s params)
  {
    Object localObject = new f();
    if ((((f)localObject).a(params, true)) && ((b & 0x2) == 2))
    {
      int i = Math.min(i, 8);
      localObject = new z(i);
      params.n(((z)localObject).e(), 0, i);
      if (b.p(h((z)localObject))) {
        params = new b();
      }
      for (;;)
      {
        b = params;
        break;
        if (j.r(h((z)localObject)))
        {
          params = new j();
        }
        else
        {
          if (!h.o(h((z)localObject))) {
            break label131;
          }
          params = new h();
        }
      }
      return true;
    }
    label131:
    return false;
  }
  
  public void release() {}
}

/* Location:
 * Qualified Name:     a1.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */