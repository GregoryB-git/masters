package t6;

import X5.g;
import X5.g.b;
import X5.g.c;
import g6.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import p6.q0;

public final class k$a
  extends l
  implements p
{
  public k$a(i parami)
  {
    super(2);
  }
  
  public final Integer a(int paramInt, g.b paramb)
  {
    Object localObject1 = paramb.getKey();
    Object localObject2 = o.p.b((g.c)localObject1);
    if (localObject1 != q0.n)
    {
      if (paramb != localObject2) {
        paramInt = Integer.MIN_VALUE;
      } else {
        paramInt++;
      }
      return Integer.valueOf(paramInt);
    }
    localObject1 = (q0)localObject2;
    Intrinsics.c(paramb, "null cannot be cast to non-null type kotlinx.coroutines.Job");
    paramb = k.b((q0)paramb, (q0)localObject1);
    if (paramb == localObject1)
    {
      if (localObject1 != null) {
        paramInt++;
      }
      return Integer.valueOf(paramInt);
    }
    localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of ");
    ((StringBuilder)localObject2).append(paramb);
    ((StringBuilder)localObject2).append(", expected child of ");
    ((StringBuilder)localObject2).append(localObject1);
    ((StringBuilder)localObject2).append(".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'");
    throw new IllegalStateException(((StringBuilder)localObject2).toString().toString());
  }
}

/* Location:
 * Qualified Name:     t6.k.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */