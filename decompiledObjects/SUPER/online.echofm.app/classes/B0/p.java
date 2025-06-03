package B0;

import android.net.Uri;
import g0.M;
import g0.a;
import i0.g;
import i0.i;
import i0.k;
import i0.k.b;
import i0.x;
import java.io.InputStream;
import java.util.Map;
import x0.r;

public final class p
  implements n.e
{
  public final long a;
  public final k b;
  public final int c;
  public final x d;
  public final a e;
  public volatile Object f;
  
  public p(g paramg, Uri paramUri, int paramInt, a parama)
  {
    this(paramg, new k.b().i(paramUri).b(1).a(), paramInt, parama);
  }
  
  public p(g paramg, k paramk, int paramInt, a parama)
  {
    d = new x(paramg);
    b = paramk;
    c = paramInt;
    e = parama;
    a = r.a();
  }
  
  public long a()
  {
    return d.q();
  }
  
  public final void b()
  {
    d.t();
    i locali = new i(d, b);
    try
    {
      locali.b();
      Uri localUri = (Uri)a.e(d.k());
      f = e.a(localUri, locali);
      return;
    }
    finally
    {
      M.m(locali);
    }
  }
  
  public final void c() {}
  
  public Map d()
  {
    return d.s();
  }
  
  public final Object e()
  {
    return f;
  }
  
  public Uri f()
  {
    return d.r();
  }
  
  public static abstract interface a
  {
    public abstract Object a(Uri paramUri, InputStream paramInputStream);
  }
}

/* Location:
 * Qualified Name:     B0.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */