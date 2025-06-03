package pc;

import ec.j;
import rb.h;
import ub.e;

public final class o$b
  extends j
  implements dc.l<Throwable, h>
{
  public o$b(nc.l paraml)
  {
    super(1);
  }
  
  public final Object invoke(Object paramObject)
  {
    paramObject = (Throwable)paramObject;
    paramObject = a;
    h localh = h.a;
    ((e)paramObject).resumeWith(localh);
    return localh;
  }
}

/* Location:
 * Qualified Name:     pc.o.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */