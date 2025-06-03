package rc;

import dc.p;
import ec.j;
import nc.j1;
import nc.j1.b;
import sc.s;
import ub.h;
import ub.h.b;
import ub.h.c;

public final class q
  extends j
  implements p<Integer, h.b, Integer>
{
  public q(o<?> paramo)
  {
    super(2);
  }
  
  public final Object invoke(Object paramObject1, Object paramObject2)
  {
    int i = ((Number)paramObject1).intValue();
    paramObject1 = (h.b)paramObject2;
    paramObject2 = ((h.b)paramObject1).getKey();
    Object localObject = a.b.get((h.c)paramObject2);
    int j = j1.k;
    if (paramObject2 != j1.b.a)
    {
      if (paramObject1 != localObject) {
        i = Integer.MIN_VALUE;
      } else {
        i++;
      }
    }
    else {
      label62:
      paramObject2 = (j1)localObject;
    }
    for (paramObject1 = (j1)paramObject1;; paramObject1 = ((j1)paramObject1).getParent())
    {
      if (paramObject1 == null) {
        paramObject1 = null;
      } else {
        if ((paramObject1 != paramObject2) && ((paramObject1 instanceof s))) {
          continue;
        }
      }
      if (paramObject1 == paramObject2)
      {
        if (paramObject2 != null) {
          break;
        }
        break label62;
        return Integer.valueOf(i);
      }
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of ");
      ((StringBuilder)localObject).append(paramObject1);
      ((StringBuilder)localObject).append(", expected child of ");
      ((StringBuilder)localObject).append(paramObject2);
      ((StringBuilder)localObject).append(".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'");
      throw new IllegalStateException(((StringBuilder)localObject).toString().toString());
    }
  }
}

/* Location:
 * Qualified Name:     rc.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */