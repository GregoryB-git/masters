package o0;

import dc.l;
import ec.j;
import pc.b;
import pc.j.b;
import rb.h;

public final class n
  extends j
  implements l<Throwable, h>
{
  public n(r paramr, p paramp, s params)
  {
    super(1);
  }
  
  public final Object invoke(Object paramObject)
  {
    Throwable localThrowable = (Throwable)paramObject;
    a.invoke(localThrowable);
    b.c.d(localThrowable);
    do
    {
      paramObject = b.c.c();
      boolean bool = paramObject instanceof j.b;
      Object localObject = null;
      if (bool) {
        paramObject = null;
      }
      if (paramObject == null)
      {
        paramObject = localObject;
      }
      else
      {
        c.invoke(paramObject, localThrowable);
        paramObject = h.a;
      }
    } while (paramObject != null);
    return h.a;
  }
}

/* Location:
 * Qualified Name:     o0.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */