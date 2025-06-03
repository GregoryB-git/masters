package gb;

import eb.c;
import eb.e0;
import eb.f0;
import eb.h;
import eb.h.a;
import eb.h.b;
import eb.s0;
import eb.t0;
import x6.b;

public final class v0$e
  implements u
{
  public v0$e(h.a parama, u paramu) {}
  
  public final s d(t0<?, ?> paramt0, s0 params0, c paramc, h[] paramArrayOfh)
  {
    Object localObject = c.k;
    b.y(paramc, "callOptions cannot be null");
    boolean bool = false;
    localObject = new h.b(paramc, 0, false);
    localObject = a.a((h.b)localObject, params0);
    if (paramArrayOfh[(paramArrayOfh.length - 1)] == v0.o) {
      bool = true;
    }
    b.I(bool, "lb tracer already assigned");
    paramArrayOfh[(paramArrayOfh.length - 1)] = localObject;
    return b.d(paramt0, params0, paramc, paramArrayOfh);
  }
  
  public final f0 f()
  {
    return b.f();
  }
}

/* Location:
 * Qualified Name:     gb.v0.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */