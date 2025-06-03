package sc;

import dc.p;
import ec.j;
import nc.b2;
import ub.h.b;

public final class w$c
  extends j
  implements p<z, h.b, z>
{
  public static final c a = new c();
  
  public w$c()
  {
    super(2);
  }
  
  public final Object invoke(Object paramObject1, Object paramObject2)
  {
    paramObject1 = (z)paramObject1;
    paramObject2 = (h.b)paramObject2;
    if ((paramObject2 instanceof b2))
    {
      paramObject2 = (b2)paramObject2;
      Object localObject = ((b2)paramObject2).M(a);
      Object[] arrayOfObject = b;
      int i = d;
      arrayOfObject[i] = localObject;
      localObject = c;
      d = (i + 1);
      localObject[i] = paramObject2;
    }
    return paramObject1;
  }
}

/* Location:
 * Qualified Name:     sc.w.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */