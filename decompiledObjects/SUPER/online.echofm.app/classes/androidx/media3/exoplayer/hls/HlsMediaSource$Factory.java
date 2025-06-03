package androidx.media3.exoplayer.hls;

import B0.k;
import d0.u;
import d0.u.h;
import i0.g.a;
import java.util.List;
import p0.A;
import p0.l;
import p0.x;
import q0.g;
import q0.h;
import r0.e;
import r0.k.a;
import x0.x.a;

public final class HlsMediaSource$Factory
  implements x.a
{
  public final g a;
  public h b;
  public r0.j c;
  public k.a d;
  public x0.j e;
  public A f;
  public B0.m g;
  public boolean h;
  public int i;
  public boolean j;
  public long k;
  public long l;
  
  public HlsMediaSource$Factory(g.a parama)
  {
    this(new q0.c(parama));
  }
  
  public HlsMediaSource$Factory(g paramg)
  {
    a = ((g)g0.a.e(paramg));
    f = new l();
    c = new r0.a();
    d = r0.c.D;
    b = h.a;
    g = new k();
    e = new x0.m();
    i = 1;
    k = -9223372036854775807L;
    h = true;
    b(true);
  }
  
  public HlsMediaSource a(u paramu)
  {
    g0.a.e(b);
    Object localObject1 = c;
    Object localObject2 = b.d;
    if (!((List)localObject2).isEmpty()) {
      localObject1 = new e((r0.j)localObject1, (List)localObject2);
    }
    g localg = a;
    h localh = b;
    localObject2 = e;
    x localx = f.a(paramu);
    B0.m localm = g;
    return new HlsMediaSource(paramu, localg, localh, (x0.j)localObject2, null, localx, localm, d.a(a, localm, (r0.j)localObject1), k, h, i, j, l, null);
  }
  
  public Factory b(boolean paramBoolean)
  {
    b.a(paramBoolean);
    return this;
  }
}

/* Location:
 * Qualified Name:     androidx.media3.exoplayer.hls.HlsMediaSource.Factory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */