package o2;

import dc.l;
import ec.j;
import java.util.concurrent.CancellationException;
import z2.a;
import z2.c;

public final class h
  extends j
  implements l<Throwable, rb.h>
{
  public h(i<Object> parami)
  {
    super(1);
  }
  
  public final Object invoke(Object paramObject)
  {
    Throwable localThrowable = (Throwable)paramObject;
    if (localThrowable == null)
    {
      if (!a.b.isDone()) {
        throw new IllegalArgumentException("Failed requirement.".toString());
      }
    }
    else if ((localThrowable instanceof CancellationException))
    {
      a.b.cancel(true);
    }
    else
    {
      c localc = a.b;
      paramObject = localThrowable.getCause();
      if (paramObject == null) {
        paramObject = localThrowable;
      }
      localc.j((Throwable)paramObject);
    }
    return rb.h.a;
  }
}

/* Location:
 * Qualified Name:     o2.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */