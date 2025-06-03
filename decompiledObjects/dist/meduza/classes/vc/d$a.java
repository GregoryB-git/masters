package vc;

import d2.h0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import nc.a0;
import nc.i2;
import nc.k;
import sc.t;

public final class d$a
  implements k<rb.h>, i2
{
  public final nc.l<rb.h> a;
  public final Object b;
  
  public d$a(d paramd, nc.l paraml)
  {
    a = paraml;
    b = null;
  }
  
  public final void b(Object paramObject, dc.l paraml)
  {
    paramObject = (rb.h)paramObject;
    paraml = c;
    d.h.set(paraml, b);
    a.b(paramObject, new b(c, this));
  }
  
  public final void c(t<?> paramt, int paramInt)
  {
    a.c(paramt, paramInt);
  }
  
  public final boolean cancel(Throwable paramThrowable)
  {
    return a.cancel(paramThrowable);
  }
  
  public final h0 e(Throwable paramThrowable)
  {
    return a.e(paramThrowable);
  }
  
  public final ub.h getContext()
  {
    return a.e;
  }
  
  public final void h(a0 parama0, rb.h paramh)
  {
    a.h(parama0, paramh);
  }
  
  public final h0 j(Object paramObject, dc.l paraml)
  {
    paraml = (rb.h)paramObject;
    paramObject = c;
    paraml = a.D(paraml, new c((d)paramObject, this));
    if (paraml != null)
    {
      paramObject = c;
      d.h.set(paramObject, b);
    }
    return paraml;
  }
  
  public final void n(Object paramObject)
  {
    a.n(paramObject);
  }
  
  public final void resumeWith(Object paramObject)
  {
    a.resumeWith(paramObject);
  }
}

/* Location:
 * Qualified Name:     vc.d.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */