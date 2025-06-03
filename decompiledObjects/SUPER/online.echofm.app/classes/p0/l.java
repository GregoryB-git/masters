package p0;

import B0.m;
import X2.w;
import X2.y;
import a3.f;
import android.net.Uri;
import d0.u;
import d0.u.f;
import d0.u.h;
import g0.M;
import g0.a;
import i0.g.a;
import i0.m.b;
import java.util.Iterator;
import java.util.Map.Entry;

public final class l
  implements A
{
  public final Object a = new Object();
  public u.f b;
  public x c;
  public g.a d;
  public String e;
  public m f;
  
  public x a(u arg1)
  {
    a.e(b);
    u.f localf = b.c;
    if (localf == null) {
      return x.a;
    }
    synchronized (a)
    {
      if (!M.c(localf, b))
      {
        b = localf;
        c = b(localf);
      }
    }
    localx = (x)a.e(c);
    return localx;
  }
  
  public final x b(u.f paramf)
  {
    Object localObject1 = d;
    if (localObject1 == null) {
      localObject1 = new m.b().e(e);
    }
    Object localObject2 = c;
    if (localObject2 == null) {
      localObject2 = null;
    } else {
      localObject2 = ((Uri)localObject2).toString();
    }
    localObject1 = new O((String)localObject2, h, (g.a)localObject1);
    Object localObject3 = e.g().q();
    while (((Iterator)localObject3).hasNext())
    {
      localObject2 = (Map.Entry)((Iterator)localObject3).next();
      ((O)localObject1).e((String)((Map.Entry)localObject2).getKey(), (String)((Map.Entry)localObject2).getValue());
    }
    localObject3 = new h.b().f(a, N.d).c(f).d(g).e(f.n(j));
    localObject2 = f;
    if (localObject2 != null) {
      ((h.b)localObject3).b((m)localObject2);
    }
    localObject1 = ((h.b)localObject3).a((Q)localObject1);
    ((h)localObject1).F(0, paramf.c());
    return (x)localObject1;
  }
}

/* Location:
 * Qualified Name:     p0.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */