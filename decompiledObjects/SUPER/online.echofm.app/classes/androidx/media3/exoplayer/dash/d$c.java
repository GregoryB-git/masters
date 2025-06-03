package androidx.media3.exoplayer.dash;

import F0.T;
import F0.T.a;
import O0.c;
import Q0.a;
import android.os.Handler;
import d0.q;
import d0.x;
import g0.z;
import k0.v0;
import x0.P;
import y0.e;

public final class d$c
  implements T
{
  public final P a;
  public final v0 b;
  public final O0.b c;
  public long d;
  
  public d$c(d paramd, B0.b paramb)
  {
    a = P.l(paramb);
    b = new v0();
    c = new O0.b();
    d = -9223372036854775807L;
  }
  
  public void a(z paramz, int paramInt1, int paramInt2)
  {
    a.e(paramz, paramInt1);
  }
  
  public void b(long paramLong, int paramInt1, int paramInt2, int paramInt3, T.a parama)
  {
    a.b(paramLong, paramInt1, paramInt2, paramInt3, parama);
    l();
  }
  
  public int c(d0.i parami, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    return a.f(parami, paramInt1, paramBoolean);
  }
  
  public void d(q paramq)
  {
    a.d(paramq);
  }
  
  public final O0.b g()
  {
    c.m();
    if (a.T(b, c, 0, false) == -4)
    {
      c.C();
      return c;
    }
    return null;
  }
  
  public boolean h(long paramLong)
  {
    return e.j(paramLong);
  }
  
  public void i(e parame)
  {
    long l = d;
    if ((l == -9223372036854775807L) || (h > l)) {
      d = h;
    }
    e.m(parame);
  }
  
  public boolean j(e parame)
  {
    long l = d;
    boolean bool;
    if ((l != -9223372036854775807L) && (l < g)) {
      bool = true;
    } else {
      bool = false;
    }
    return e.n(bool);
  }
  
  public final void k(long paramLong1, long paramLong2)
  {
    d.a locala = new d.a(paramLong1, paramLong2);
    d.d(e).sendMessage(d.d(e).obtainMessage(1, locala));
  }
  
  public final void l()
  {
    while (a.L(false))
    {
      Object localObject = g();
      if (localObject != null)
      {
        long l = t;
        localObject = d.a(e).a((O0.b)localObject);
        if (localObject != null)
        {
          localObject = (a)((x)localObject).d(0);
          if (d.b(o, p)) {
            m(l, (a)localObject);
          }
        }
      }
    }
    a.s();
  }
  
  public final void m(long paramLong, a parama)
  {
    long l = d.c(parama);
    if (l == -9223372036854775807L) {
      return;
    }
    k(paramLong, l);
  }
  
  public void n()
  {
    a.U();
  }
}

/* Location:
 * Qualified Name:     androidx.media3.exoplayer.dash.d.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */