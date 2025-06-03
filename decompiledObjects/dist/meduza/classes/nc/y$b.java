package nc;

import dc.p;
import ec.j;
import ec.s;
import ub.h;
import ub.h.b;

public final class y$b
  extends j
  implements p<h, h.b, h>
{
  public y$b(s<h> params, boolean paramBoolean)
  {
    super(2);
  }
  
  public final Object invoke(Object paramObject1, Object paramObject2)
  {
    h localh = (h)paramObject1;
    paramObject1 = (h.b)paramObject2;
    if ((paramObject1 instanceof x)) {
      if (((h)a.a).get(((h.b)paramObject1).getKey()) == null)
      {
        boolean bool = b;
        paramObject2 = (x)paramObject1;
        paramObject1 = paramObject2;
        if (bool) {
          paramObject1 = ((x)paramObject2).b0();
        }
      }
      else
      {
        paramObject2 = a;
        a = ((h)a).minusKey(((h.b)paramObject1).getKey());
        paramObject1 = ((x)paramObject1).r0();
      }
    }
    return localh.plus((h)paramObject1);
  }
}

/* Location:
 * Qualified Name:     nc.y.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */