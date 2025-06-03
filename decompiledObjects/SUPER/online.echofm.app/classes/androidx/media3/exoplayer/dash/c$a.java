package androidx.media3.exoplayer.dash;

import B0.f;
import B0.o;
import d0.q;
import i0.g;
import i0.g.a;
import java.util.List;
import l0.y1;
import n0.b;
import y0.d;
import y0.f.a;

public final class c$a
  implements a.a
{
  public final g.a a;
  public final int b;
  public final f.a c;
  
  public c$a(g.a parama)
  {
    this(parama, 1);
  }
  
  public c$a(g.a parama, int paramInt)
  {
    this(d.x, parama, paramInt);
  }
  
  public c$a(f.a parama, g.a parama1, int paramInt)
  {
    c = parama;
    a = parama1;
    b = paramInt;
  }
  
  public q b(q paramq)
  {
    return c.b(paramq);
  }
  
  public a c(o paramo, o0.c paramc, b paramb, int paramInt1, int[] paramArrayOfInt, A0.y paramy, int paramInt2, long paramLong, boolean paramBoolean, List paramList, d.c paramc1, i0.y paramy1, y1 paramy11, f paramf)
  {
    g localg = a.a();
    if (paramy1 != null) {
      localg.c(paramy1);
    }
    return new c(c, paramo, paramc, paramb, paramInt1, paramArrayOfInt, paramy, paramInt2, localg, paramLong, b, paramBoolean, paramList, paramc1, paramy11, paramf);
  }
  
  public a d(boolean paramBoolean)
  {
    c.a(paramBoolean);
    return this;
  }
}

/* Location:
 * Qualified Name:     androidx.media3.exoplayer.dash.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */