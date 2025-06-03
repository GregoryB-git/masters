package pc;

import java.util.concurrent.CancellationException;
import nc.k1;
import nc.o1;
import rc.j;
import ub.e;

public class g<E>
  extends nc.a<rb.h>
  implements f<E>
{
  public final f<E> d;
  
  public g(ub.h paramh, b paramb)
  {
    super(paramh, true);
    d = paramb;
  }
  
  public final void a(o.b paramb)
  {
    d.a(paramb);
  }
  
  public final Object c()
  {
    return d.c();
  }
  
  public final void cancel(CancellationException paramCancellationException)
  {
    if (isCancelled()) {
      return;
    }
    Object localObject = paramCancellationException;
    if (paramCancellationException == null) {
      localObject = new k1(u(), null, this);
    }
    s((CancellationException)localObject);
  }
  
  public final boolean d(Throwable paramThrowable)
  {
    return d.d(paramThrowable);
  }
  
  public final Object i(j paramj)
  {
    Object localObject = d.i(paramj);
    paramj = vb.a.a;
    return localObject;
  }
  
  public final h<E> iterator()
  {
    return d.iterator();
  }
  
  public final Object k(E paramE, e<? super rb.h> parame)
  {
    return d.k(paramE, parame);
  }
  
  public final Object l(E paramE)
  {
    return d.l(paramE);
  }
  
  public final boolean m()
  {
    return d.m();
  }
  
  public final void s(CancellationException paramCancellationException)
  {
    paramCancellationException = o1.W(this, paramCancellationException);
    d.cancel(paramCancellationException);
    r(paramCancellationException);
  }
}

/* Location:
 * Qualified Name:     pc.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */