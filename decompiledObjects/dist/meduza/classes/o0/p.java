package o0;

import java.util.concurrent.atomic.AtomicInteger;
import nc.d0;
import nc.j1;
import nc.j1.b;
import pc.i;
import pc.j.a;
import pc.j.b;
import pc.m;
import ub.e;

public final class p<T>
{
  public final d0 a;
  public final dc.p<T, e<? super rb.h>, Object> b;
  public final pc.b c;
  public final AtomicInteger d;
  
  public p(d0 paramd0, r paramr, s params, t paramt)
  {
    a = paramd0;
    b = paramt;
    c = i.a(Integer.MAX_VALUE, null, 6);
    d = new AtomicInteger(0);
    paramd0 = (j1)paramd0.f().get(j1.b.a);
    if (paramd0 != null) {
      paramd0.invokeOnCompletion(new n(paramr, this, params));
    }
  }
  
  public final void a(q.a parama)
  {
    Object localObject = c.l(parama);
    boolean bool = localObject instanceof j.a;
    parama = null;
    if (bool)
    {
      if (bool) {
        localObject = (j.a)localObject;
      } else {
        localObject = null;
      }
      if (localObject != null) {
        parama = a;
      }
      localObject = parama;
      if (parama == null) {
        localObject = new m("Channel was closed normally");
      }
      throw ((Throwable)localObject);
    }
    if ((localObject instanceof j.b ^ true))
    {
      if (d.getAndIncrement() == 0) {
        x6.b.g0(a, null, new o(this, null), 3);
      }
      return;
    }
    throw new IllegalStateException("Check failed.".toString());
  }
}

/* Location:
 * Qualified Name:     o0.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */