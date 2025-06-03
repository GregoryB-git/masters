package androidx.media3.exoplayer.smoothstreaming;

import B0.k;
import i0.g.a;
import p0.A;
import p0.l;
import w0.b;
import x0.j;
import x0.x.a;

public final class SsMediaSource$Factory
  implements x.a
{
  public final b a;
  public final g.a b;
  public j c;
  public A d;
  public B0.m e;
  public long f;
  
  public SsMediaSource$Factory(g.a parama)
  {
    this(new w0.a(parama), parama);
  }
  
  public SsMediaSource$Factory(b paramb, g.a parama)
  {
    a = ((b)g0.a.e(paramb));
    b = parama;
    d = new l();
    e = new k();
    f = 30000L;
    c = new x0.m();
    a(true);
  }
  
  public Factory a(boolean paramBoolean)
  {
    a.a(paramBoolean);
    return this;
  }
}

/* Location:
 * Qualified Name:     androidx.media3.exoplayer.smoothstreaming.SsMediaSource.Factory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */