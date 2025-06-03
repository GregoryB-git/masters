package nc;

import dc.p;
import ec.j;
import ub.h.b;

public final class z
  extends j
  implements p<Boolean, h.b, Boolean>
{
  public static final z a = new z();
  
  public z()
  {
    super(2);
  }
  
  public final Object invoke(Object paramObject1, Object paramObject2)
  {
    boolean bool = ((Boolean)paramObject1).booleanValue();
    paramObject1 = (h.b)paramObject2;
    if ((!bool) && (!(paramObject1 instanceof x))) {
      bool = false;
    } else {
      bool = true;
    }
    return Boolean.valueOf(bool);
  }
}

/* Location:
 * Qualified Name:     nc.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */