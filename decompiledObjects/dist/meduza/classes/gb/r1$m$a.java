package gb;

import e9.a;
import eb.c;
import eb.e;
import eb.t0;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class r1$m$a
  extends a
{
  public r1$m$a(r1.m paramm) {}
  
  public final String b()
  {
    return b.c;
  }
  
  public final <RequestT, ResponseT> e<RequestT, ResponseT> v(t0<RequestT, ResponseT> paramt0, c paramc)
  {
    Object localObject1 = b.e;
    Object localObject2 = r1.e0;
    localObject1.getClass();
    localObject2 = b;
    if (localObject2 == null) {
      localObject2 = i;
    }
    localObject1 = b.e;
    r1.e locale = c0;
    if (K) {
      localObject1 = null;
    } else {
      localObject1 = b.e.g.p0();
    }
    paramt0 = new q(paramt0, (Executor)localObject2, paramc, locale, (ScheduledExecutorService)localObject1, b.e.N);
    b.e.getClass();
    q = false;
    paramc = b.e;
    r = o;
    s = p;
    return paramt0;
  }
}

/* Location:
 * Qualified Name:     gb.r1.m.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */