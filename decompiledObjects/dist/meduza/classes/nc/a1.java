package nc;

import dc.l;
import ec.j;
import ub.h.b;

public final class a1
  extends j
  implements l<h.b, b1>
{
  public static final a1 a = new a1();
  
  public a1()
  {
    super(1);
  }
  
  public final Object invoke(Object paramObject)
  {
    paramObject = (h.b)paramObject;
    if ((paramObject instanceof b1)) {
      paramObject = (b1)paramObject;
    } else {
      paramObject = null;
    }
    return paramObject;
  }
}

/* Location:
 * Qualified Name:     nc.a1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */