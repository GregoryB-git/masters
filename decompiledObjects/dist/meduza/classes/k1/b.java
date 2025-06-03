package k1;

import dc.l;
import ec.j;
import java.util.concurrent.CancellationException;
import nc.j0;
import rb.h;
import s.a;
import s.d;

public final class b
  extends j
  implements l<Throwable, h>
{
  public b(s.b<Object> paramb, j0<Object> paramj0)
  {
    super(1);
  }
  
  public final Object invoke(Object paramObject)
  {
    Object localObject = (Throwable)paramObject;
    int i = 0;
    int j = 0;
    int k = 0;
    s.b localb;
    int m;
    if (localObject != null)
    {
      if ((localObject instanceof CancellationException))
      {
        localb = a;
        d = true;
        paramObject = b;
        m = k;
        if (paramObject != null)
        {
          m = k;
          if (b.cancel(true)) {
            m = 1;
          }
        }
        if (m != 0)
        {
          a = null;
          b = null;
          c = null;
        }
      }
      else
      {
        localb = a;
        d = true;
        paramObject = b;
        m = i;
        if (paramObject != null)
        {
          m = i;
          if (b.q((Throwable)localObject)) {
            m = 1;
          }
        }
        if (m != 0)
        {
          a = null;
          b = null;
          c = null;
        }
      }
    }
    else
    {
      localb = a;
      localObject = b.getCompleted();
      d = true;
      paramObject = b;
      m = j;
      if (paramObject != null)
      {
        m = j;
        if (b.p(localObject)) {
          m = 1;
        }
      }
      if (m != 0)
      {
        a = null;
        b = null;
        c = null;
      }
    }
    return h.a;
  }
}

/* Location:
 * Qualified Name:     k1.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */