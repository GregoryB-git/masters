package androidx.media3.exoplayer.dash;

import B0.k;
import B0.p.a;
import d0.u;
import d0.u.h;
import g0.a;
import i0.g.a;
import java.util.List;
import o0.d;
import p0.A;
import p0.l;
import v0.b;
import x0.j;
import x0.x.a;

public final class DashMediaSource$Factory
  implements x.a
{
  public final a.a a;
  public final g.a b;
  public A c;
  public j d;
  public B0.m e;
  public long f;
  public long g;
  public p.a h;
  
  public DashMediaSource$Factory(a.a parama, g.a parama1)
  {
    a = ((a.a)a.e(parama));
    b = parama1;
    c = new l();
    e = new k();
    f = 30000L;
    g = 5000000L;
    d = new x0.m();
    b(true);
  }
  
  public DashMediaSource$Factory(g.a parama)
  {
    this(new c.a(parama), parama);
  }
  
  public DashMediaSource a(u paramu)
  {
    a.e(b);
    Object localObject1 = h;
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = new d();
    }
    localObject1 = b.d;
    if (!((List)localObject1).isEmpty()) {
      localObject2 = new b((p.a)localObject2, (List)localObject1);
    }
    return new DashMediaSource(paramu, null, b, (p.a)localObject2, a, d, null, c.a(paramu), e, f, g, null);
  }
  
  public Factory b(boolean paramBoolean)
  {
    a.a(paramBoolean);
    return this;
  }
}

/* Location:
 * Qualified Name:     androidx.media3.exoplayer.dash.DashMediaSource.Factory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */