package k3;

import h3.c;
import h3.f;
import h3.g;
import h3.h;
import java.util.HashMap;

public final class u<T>
  implements h<T>
{
  public final s a;
  public final String b;
  public final c c;
  public final g<T, byte[]> d;
  public final v e;
  
  public u(s params, String paramString, c paramc, g<T, byte[]> paramg, v paramv)
  {
    a = params;
    b = paramString;
    c = paramc;
    d = paramg;
    e = paramv;
  }
  
  public final void a(h3.a parama, h3.j paramj)
  {
    Object localObject1 = e;
    Object localObject2 = a;
    if (localObject2 != null)
    {
      Object localObject3 = b;
      if (localObject3 != null)
      {
        g localg = d;
        if (localg != null)
        {
          Object localObject4 = c;
          if (localObject4 != null)
          {
            parama = new i((s)localObject2, (String)localObject3, parama, localg, (c)localObject4);
            localObject1 = (w)localObject1;
            localObject2 = c;
            localObject3 = a.e(c.d());
            localObject4 = new h.a();
            f = new HashMap();
            d = Long.valueOf(a.a());
            e = Long.valueOf(b.a());
            ((h.a)localObject4).d(b);
            ((h.a)localObject4).c(new m(e, (byte[])d.apply(c.c())));
            b = c.a();
            if ((c.e() != null) && (c.e().a() != null)) {
              g = c.e().a();
            }
            c.b();
            ((p3.d)localObject2).a(paramj, ((h.a)localObject4).b(), (j)localObject3);
            return;
          }
          throw new NullPointerException("Null encoding");
        }
        throw new NullPointerException("Null transformer");
      }
      throw new NullPointerException("Null transportName");
    }
    throw new NullPointerException("Null transportContext");
  }
}

/* Location:
 * Qualified Name:     k3.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */