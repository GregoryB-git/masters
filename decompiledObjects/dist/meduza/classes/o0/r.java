package o0;

import dc.l;
import java.io.File;
import java.util.Set;
import qc.t;
import rb.h;

public final class r
  extends ec.j
  implements l<Throwable, h>
{
  public r(q<Object> paramq)
  {
    super(1);
  }
  
  public final Object invoke(Object paramObject)
  {
    paramObject = (Throwable)paramObject;
    if (paramObject != null) {
      a.h.setValue(new j((Throwable)paramObject));
    }
    paramObject = q.l;
    q localq = a;
    try
    {
      q.k.remove(localq.c().getAbsolutePath());
      return h.a;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}

/* Location:
 * Qualified Name:     o0.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */