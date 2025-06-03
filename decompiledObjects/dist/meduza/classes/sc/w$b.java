package sc;

import dc.p;
import ec.j;
import nc.b2;
import ub.h.b;

public final class w$b
  extends j
  implements p<b2<?>, h.b, b2<?>>
{
  public static final b a = new b();
  
  public w$b()
  {
    super(2);
  }
  
  public final Object invoke(Object paramObject1, Object paramObject2)
  {
    paramObject1 = (b2)paramObject1;
    paramObject2 = (h.b)paramObject2;
    if (paramObject1 == null) {
      if ((paramObject2 instanceof b2)) {
        paramObject1 = (b2)paramObject2;
      } else {
        paramObject1 = null;
      }
    }
    return paramObject1;
  }
}

/* Location:
 * Qualified Name:     sc.w.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */