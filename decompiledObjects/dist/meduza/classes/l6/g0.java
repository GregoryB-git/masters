package l6;

import android.os.Handler;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.a.c;
import j6.b;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import k6.a.f;

public final class g0
  implements a.c, r0
{
  public final a.f a;
  public final a b;
  public IAccountAccessor c = null;
  public Set d = null;
  public boolean e = false;
  
  public g0(d paramd, a.f paramf, a parama)
  {
    a = paramf;
    b = parama;
  }
  
  public final void a(b paramb)
  {
    f.v.post(new f0(this, paramb));
  }
  
  public final void b(b paramb)
  {
    d0 locald0 = (d0)f.r.get(b);
    if (locald0 != null) {
      locald0.p(paramb);
    }
  }
}

/* Location:
 * Qualified Name:     l6.g0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */