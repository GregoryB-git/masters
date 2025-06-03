package nc;

import dc.p;
import ec.j;
import ub.h;
import ub.h.b;

public final class y$a
  extends j
  implements p<h, h.b, h>
{
  public static final a a = new a();
  
  public y$a()
  {
    super(2);
  }
  
  public final Object invoke(Object paramObject1, Object paramObject2)
  {
    h localh = (h)paramObject1;
    paramObject2 = (h.b)paramObject2;
    paramObject1 = paramObject2;
    if ((paramObject2 instanceof x)) {
      paramObject1 = ((x)paramObject2).b0();
    }
    return localh.plus((h)paramObject1);
  }
}

/* Location:
 * Qualified Name:     nc.y.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */