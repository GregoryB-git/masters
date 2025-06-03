package sc;

import dc.p;
import ec.j;
import nc.b2;
import ub.h.b;

public final class w$a
  extends j
  implements p<Object, h.b, Object>
{
  public static final a a = new a();
  
  public w$a()
  {
    super(2);
  }
  
  public final Object invoke(Object paramObject1, Object paramObject2)
  {
    h.b localb = (h.b)paramObject2;
    paramObject2 = paramObject1;
    if ((localb instanceof b2))
    {
      if ((paramObject1 instanceof Integer)) {
        paramObject1 = (Integer)paramObject1;
      } else {
        paramObject1 = null;
      }
      int i;
      if (paramObject1 != null) {
        i = ((Integer)paramObject1).intValue();
      } else {
        i = 1;
      }
      if (i == 0) {
        paramObject2 = localb;
      } else {
        paramObject2 = Integer.valueOf(i + 1);
      }
    }
    return paramObject2;
  }
}

/* Location:
 * Qualified Name:     sc.w.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */