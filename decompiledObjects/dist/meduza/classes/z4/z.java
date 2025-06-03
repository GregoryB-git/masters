package z4;

import a4.e;
import a4.g.a;
import a4.h;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import d;
import t5.c0;
import t5.d0;
import t5.k.a;
import t5.l0;
import v3.o0;
import v3.o0.f;
import v3.o0.g;
import v3.r1;
import v3.r1.b;
import v3.r1.c;

public final class z
  extends a
  implements y.b
{
  public l0 A;
  public final o0 p;
  public final o0.g q;
  public final k.a r;
  public final x.a s;
  public final h t;
  public final c0 u;
  public final int v;
  public boolean w;
  public long x;
  public boolean y;
  public boolean z;
  
  public z(o0 paramo0, k.a parama, x.a parama1, h paramh, c0 paramc0, int paramInt)
  {
    o0.g localg = b;
    localg.getClass();
    q = localg;
    p = paramo0;
    r = parama;
    s = parama1;
    t = paramh;
    u = paramc0;
    v = paramInt;
    w = true;
    x = -9223372036854775807L;
  }
  
  public final o0 f()
  {
    return p;
  }
  
  public final void g(r paramr)
  {
    y localy = (y)paramr;
    if (D) {
      for (Object localObject : A)
      {
        ((b0)localObject).h();
        e locale = h;
        if (locale != null)
        {
          locale.f(e);
          h = null;
          g = null;
        }
      }
    }
    s.e(localy);
    x.removeCallbacksAndMessages(null);
    y = null;
    T = true;
  }
  
  public final void h() {}
  
  public final r o(t.b paramb, t5.b paramb1, long paramLong)
  {
    t5.k localk = r.a();
    Object localObject = A;
    if (localObject != null) {
      localk.f((l0)localObject);
    }
    localObject = q.a;
    x.a locala = s;
    x6.b.K(o);
    return new y((Uri)localObject, localk, new r3.a0((c4.k)b), t, new g.a(d.c, 0, paramb), u, q(paramb), this, paramb1, q.e, v);
  }
  
  public final void t(l0 paraml0)
  {
    A = paraml0;
    paraml0 = t;
    Looper localLooper = Looper.myLooper();
    localLooper.getClass();
    w3.a0 locala0 = o;
    x6.b.K(locala0);
    paraml0.c(localLooper, locala0);
    t.a();
    x();
  }
  
  public final void w()
  {
    t.release();
  }
  
  public final void x()
  {
    g0 localg0 = new g0(x, y, z, p);
    Object localObject = localg0;
    if (w) {
      localObject = new a(localg0);
    }
    v((r1)localObject);
  }
  
  public final void y(long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    long l = paramLong;
    if (paramLong == -9223372036854775807L) {
      l = x;
    }
    if ((!w) && (x == l) && (y == paramBoolean1) && (z == paramBoolean2)) {
      return;
    }
    x = l;
    y = paramBoolean1;
    z = paramBoolean2;
    w = false;
    x();
  }
  
  public final class a
    extends l
  {
    public a()
    {
      super();
    }
    
    public final r1.b f(int paramInt, r1.b paramb, boolean paramBoolean)
    {
      b.f(paramInt, paramb, paramBoolean);
      f = true;
      return paramb;
    }
    
    public final r1.c n(int paramInt, r1.c paramc, long paramLong)
    {
      b.n(paramInt, paramc, paramLong);
      t = true;
      return paramc;
    }
  }
}

/* Location:
 * Qualified Name:     z4.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */