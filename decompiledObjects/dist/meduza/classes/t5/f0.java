package t5;

import android.net.Uri;
import java.util.Map;
import v5.e0;

public final class f0<T>
  implements d0.d
{
  public final long a;
  public final n b;
  public final int c;
  public final j0 d;
  public final a<? extends T> e;
  public volatile T f;
  
  public f0() {}
  
  public f0(k paramk, Uri paramUri, int paramInt, a<? extends T> parama) {}
  
  public final void a()
  {
    d.b = 0L;
    m localm = new m(d, b);
    try
    {
      localm.f();
      Uri localUri = d.l();
      localUri.getClass();
      f = e.a(localUri, localm);
      return;
    }
    finally
    {
      e0.g(localm);
    }
  }
  
  public final void b() {}
  
  public static abstract interface a<T>
  {
    public abstract Object a(Uri paramUri, m paramm);
  }
}

/* Location:
 * Qualified Name:     t5.f0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */