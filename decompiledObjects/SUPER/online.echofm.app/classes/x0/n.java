package x0;

import F0.x;
import android.content.Context;
import c1.h;
import c1.t.a;
import i0.g.a;
import i0.l.a;
import java.util.HashMap;
import java.util.Map;

public final class n
  implements x.a
{
  public final a a;
  public g.a b;
  public t.a c;
  public long d;
  public long e;
  public long f;
  public float g;
  public float h;
  public boolean i;
  
  public n(Context paramContext, x paramx)
  {
    this(new l.a(paramContext), paramx);
  }
  
  public n(g.a parama, x paramx)
  {
    b = parama;
    h localh = new h();
    c = localh;
    paramx = new a(paramx, localh);
    a = paramx;
    paramx.a(parama);
    d = -9223372036854775807L;
    e = -9223372036854775807L;
    f = -9223372036854775807L;
    g = -3.4028235E38F;
    h = -3.4028235E38F;
    i = true;
  }
  
  public static final class a
  {
    public final x a;
    public final Map b;
    public final Map c;
    public g.a d;
    public boolean e;
    public t.a f;
    
    public a(x paramx, t.a parama)
    {
      a = paramx;
      f = parama;
      b = new HashMap();
      c = new HashMap();
      e = true;
    }
    
    public void a(g.a parama)
    {
      if (parama != d)
      {
        d = parama;
        b.clear();
        c.clear();
      }
    }
  }
}

/* Location:
 * Qualified Name:     x0.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */