package o0;

import dc.p;
import ec.i;
import ec.j;
import java.util.concurrent.CancellationException;
import nc.r;
import rb.h;

public final class s
  extends j
  implements p<q.a<Object>, Throwable, h>
{
  public static final s a = new s();
  
  public s()
  {
    super(2);
  }
  
  public final Object invoke(Object paramObject1, Object paramObject2)
  {
    paramObject1 = (q.a)paramObject1;
    paramObject2 = (Throwable)paramObject2;
    i.e(paramObject1, "msg");
    if ((paramObject1 instanceof q.a.b))
    {
      r localr = b;
      paramObject1 = paramObject2;
      if (paramObject2 == null) {
        paramObject1 = new CancellationException("DataStore scope was cancelled before updateData could complete");
      }
      localr.h0((Throwable)paramObject1);
    }
    return h.a;
  }
}

/* Location:
 * Qualified Name:     o0.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */