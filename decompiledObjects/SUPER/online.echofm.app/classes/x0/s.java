package x0;

import A0.y;
import B0.b;
import g0.M;
import g0.a;
import k0.d1;
import k0.y0;

public final class s
  implements v, v.a
{
  public final x.b o;
  public final long p;
  public final b q;
  public x r;
  public v s;
  public v.a t;
  public long u;
  
  public s(x.b paramb, b paramb1, long paramLong)
  {
    o = paramb;
    q = paramb1;
    p = paramLong;
    u = -9223372036854775807L;
  }
  
  public void a(x.b paramb)
  {
    long l = t(p);
    paramb = ((x)a.e(r)).f(paramb, q, l);
    s = paramb;
    if (t != null) {
      paramb.u(this, l);
    }
  }
  
  public boolean b()
  {
    v localv = s;
    boolean bool;
    if ((localv != null) && (localv.b())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public long c()
  {
    return ((v)M.i(s)).c();
  }
  
  public long d(long paramLong, d1 paramd1)
  {
    return ((v)M.i(s)).d(paramLong, paramd1);
  }
  
  public long f()
  {
    return ((v)M.i(s)).f();
  }
  
  public boolean g(y0 paramy0)
  {
    v localv = s;
    boolean bool;
    if ((localv != null) && (localv.g(paramy0))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void h(long paramLong)
  {
    ((v)M.i(s)).h(paramLong);
  }
  
  public long i(y[] paramArrayOfy, boolean[] paramArrayOfBoolean1, Q[] paramArrayOfQ, boolean[] paramArrayOfBoolean2, long paramLong)
  {
    long l = u;
    if ((l != -9223372036854775807L) && (paramLong == p)) {
      paramLong = l;
    }
    u = -9223372036854775807L;
    return ((v)M.i(s)).i(paramArrayOfy, paramArrayOfBoolean1, paramArrayOfQ, paramArrayOfBoolean2, paramLong);
  }
  
  public long j()
  {
    return u;
  }
  
  public void k(v paramv)
  {
    ((v.a)M.i(t)).k(this);
  }
  
  public long l()
  {
    return ((v)M.i(s)).l();
  }
  
  public Z n()
  {
    return ((v)M.i(s)).n();
  }
  
  public void p()
  {
    Object localObject = s;
    if (localObject != null)
    {
      ((v)localObject).p();
    }
    else
    {
      localObject = r;
      if (localObject != null) {
        ((x)localObject).h();
      }
    }
  }
  
  public void q(long paramLong, boolean paramBoolean)
  {
    ((v)M.i(s)).q(paramLong, paramBoolean);
  }
  
  public long r()
  {
    return p;
  }
  
  public long s(long paramLong)
  {
    return ((v)M.i(s)).s(paramLong);
  }
  
  public final long t(long paramLong)
  {
    long l = u;
    if (l != -9223372036854775807L) {
      paramLong = l;
    }
    return paramLong;
  }
  
  public void u(v.a parama, long paramLong)
  {
    t = parama;
    parama = s;
    if (parama != null) {
      parama.u(this, t(p));
    }
  }
  
  public void v(v paramv)
  {
    ((v.a)M.i(t)).e(this);
  }
  
  public void w(long paramLong)
  {
    u = paramLong;
  }
  
  public void x()
  {
    if (s != null) {
      ((x)a.e(r)).e(s);
    }
  }
  
  public void y(x paramx)
  {
    boolean bool;
    if (r == null) {
      bool = true;
    } else {
      bool = false;
    }
    a.f(bool);
    r = paramx;
  }
}

/* Location:
 * Qualified Name:     x0.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */