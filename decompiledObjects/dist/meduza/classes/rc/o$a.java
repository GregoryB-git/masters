package rc;

import dc.p;
import ec.j;
import ub.h.b;

public final class o$a
  extends j
  implements p<Integer, h.b, Integer>
{
  public static final a a = new a();
  
  public o$a()
  {
    super(2);
  }
  
  public final Object invoke(Object paramObject1, Object paramObject2)
  {
    int i = ((Number)paramObject1).intValue();
    paramObject1 = (h.b)paramObject2;
    return Integer.valueOf(i + 1);
  }
}

/* Location:
 * Qualified Name:     rc.o.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */