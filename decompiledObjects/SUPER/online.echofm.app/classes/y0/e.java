package y0;

import B0.n.e;
import android.net.Uri;
import d0.q;
import g0.a;
import i0.g;
import i0.k;
import i0.x;
import java.util.Map;
import x0.r;

public abstract class e
  implements n.e
{
  public final long a;
  public final k b;
  public final int c;
  public final q d;
  public final int e;
  public final Object f;
  public final long g;
  public final long h;
  public final x i;
  
  public e(g paramg, k paramk, int paramInt1, q paramq, int paramInt2, Object paramObject, long paramLong1, long paramLong2)
  {
    i = new x(paramg);
    b = ((k)a.e(paramk));
    c = paramInt1;
    d = paramq;
    e = paramInt2;
    f = paramObject;
    g = paramLong1;
    h = paramLong2;
    a = r.a();
  }
  
  public final long a()
  {
    return i.q();
  }
  
  public final long d()
  {
    return h - g;
  }
  
  public final Map e()
  {
    return i.s();
  }
  
  public final Uri f()
  {
    return i.r();
  }
}

/* Location:
 * Qualified Name:     y0.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */