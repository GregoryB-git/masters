package D0;

import android.content.Context;
import android.view.Surface;
import d0.P;
import d0.q.b;
import d0.r.b;
import g0.A;
import g0.M;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import k0.u;

public final class d$h
  implements F, d.d
{
  public final Context a;
  public final int b;
  public final ArrayList c;
  public d0.q d;
  public int e;
  public long f;
  public long g;
  public boolean h;
  public long i;
  public long j;
  public boolean k;
  public long l;
  public F.a m;
  public Executor n;
  
  public d$h(d paramd, Context paramContext)
  {
    a = paramContext;
    b = M.b0(paramContext);
    c = new ArrayList();
    i = -9223372036854775807L;
    j = -9223372036854775807L;
    m = F.a.a;
    n = d.r();
  }
  
  public void A(boolean paramBoolean)
  {
    if (!J())
    {
      k = false;
      i = -9223372036854775807L;
      j = -9223372036854775807L;
      d.e(o);
      if (paramBoolean) {
        d.s(o).m();
      }
      return;
    }
    throw null;
  }
  
  public void B()
  {
    d.s(o).l();
  }
  
  public void C(List paramList)
  {
    if (c.equals(paramList)) {
      return;
    }
    o(paramList);
    n();
  }
  
  public void D(long paramLong1, long paramLong2)
  {
    boolean bool1 = h;
    boolean bool2;
    if ((f == paramLong1) && (g == paramLong2)) {
      bool2 = false;
    } else {
      bool2 = true;
    }
    h = (bool1 | bool2);
    f = paramLong1;
    g = paramLong2;
  }
  
  public boolean E()
  {
    return M.B0(a);
  }
  
  public void F(F.a parama, Executor paramExecutor)
  {
    m = parama;
    n = paramExecutor;
  }
  
  public void G(int paramInt, d0.q paramq)
  {
    g0.a.f(J());
    boolean bool = true;
    if ((paramInt != 1) && (paramInt != 2))
    {
      paramq = new StringBuilder();
      paramq.append("Unsupported input type ");
      paramq.append(paramInt);
      throw new UnsupportedOperationException(paramq.toString());
    }
    d.s(o).p(v);
    if ((paramInt == 1) && (M.a < 21))
    {
      int i1 = w;
      if ((i1 != -1) && (i1 != 0)) {
        d.g.a(i1);
      }
    }
    e = paramInt;
    d = paramq;
    if (!k)
    {
      n();
      k = true;
      l = -9223372036854775807L;
    }
    else
    {
      if (j == -9223372036854775807L) {
        bool = false;
      }
      g0.a.f(bool);
      l = j;
    }
  }
  
  public void H(d0.q paramq)
  {
    g0.a.f(J() ^ true);
    d.t(o, paramq);
  }
  
  public void I(Surface paramSurface, A paramA)
  {
    o.H(paramSurface, paramA);
  }
  
  public boolean J()
  {
    return false;
  }
  
  public void K(boolean paramBoolean)
  {
    d.s(o).h(paramBoolean);
  }
  
  public void L()
  {
    d.s(o).g();
  }
  
  public void a(d paramd)
  {
    paramd = m;
    n.execute(new g(this, paramd));
  }
  
  public void b(d paramd, P paramP)
  {
    paramd = m;
    n.execute(new f(this, paramd, paramP));
  }
  
  public boolean c()
  {
    if (J())
    {
      long l1 = i;
      if ((l1 != -9223372036854775807L) && (d.g(o, l1))) {
        return true;
      }
    }
    boolean bool = false;
    return bool;
  }
  
  public void d(d paramd)
  {
    paramd = m;
    n.execute(new h(this, paramd));
  }
  
  public boolean e()
  {
    boolean bool;
    if ((J()) && (d.f(o))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void f(long paramLong1, long paramLong2)
  {
    try
    {
      o.G(paramLong1, paramLong2);
      return;
    }
    catch (u localu)
    {
      d0.q localq = d;
      if (localq == null) {
        localq = new q.b().K();
      }
      throw new F.b(localu, localq);
    }
  }
  
  public void j()
  {
    d.s(o).a();
  }
  
  public final void n()
  {
    if (d == null) {
      return;
    }
    new ArrayList().addAll(c);
    d0.q localq = (d0.q)g0.a.e(d);
    android.support.v4.media.a.a(g0.a.h(null));
    new r.b(d.j(A), t, u).b(x).a();
    throw null;
  }
  
  public void o(List paramList)
  {
    c.clear();
    c.addAll(paramList);
  }
  
  public void release()
  {
    o.F();
  }
  
  public void u(float paramFloat)
  {
    d.i(o, paramFloat);
  }
  
  public void v()
  {
    o.v();
  }
  
  public long w(long paramLong, boolean paramBoolean)
  {
    g0.a.f(J());
    if (b != -1) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    g0.a.f(paramBoolean);
    paramLong = l;
    if (paramLong != -9223372036854775807L)
    {
      if (!d.g(o, paramLong)) {
        return -9223372036854775807L;
      }
      n();
      l = -9223372036854775807L;
    }
    android.support.v4.media.a.a(g0.a.h(null));
    throw null;
  }
  
  public Surface x()
  {
    g0.a.f(J());
    android.support.v4.media.a.a(g0.a.h(null));
    throw null;
  }
  
  public void y()
  {
    d.s(o).k();
  }
  
  public void z(p paramp)
  {
    d.h(o, paramp);
  }
}

/* Location:
 * Qualified Name:     D0.d.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */