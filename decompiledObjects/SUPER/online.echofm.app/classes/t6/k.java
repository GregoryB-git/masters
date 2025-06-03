package t6;

import X5.g;
import X5.g.b;
import X5.g.c;
import g6.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import p6.q0;
import u6.B;

public abstract class k
{
  public static final void a(i parami, g paramg)
  {
    if (((Number)paramg.u(Integer.valueOf(0), new a(parami))).intValue() == q) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Flow invariant is violated:\n\t\tFlow was collected in ");
    localStringBuilder.append(p);
    localStringBuilder.append(",\n\t\tbut emission happened in ");
    localStringBuilder.append(paramg);
    localStringBuilder.append(".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead");
    throw new IllegalStateException(localStringBuilder.toString().toString());
  }
  
  public static final q0 b(q0 paramq01, q0 paramq02)
  {
    for (;;)
    {
      if (paramq01 == null) {
        return null;
      }
      if (paramq01 == paramq02) {
        return paramq01;
      }
      if (!(paramq01 instanceof B)) {
        return paramq01;
      }
      paramq01 = paramq01.getParent();
    }
  }
  
  public static final class a
    extends l
    implements p
  {
    public a(i parami)
    {
      super();
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
}

/* Location:
 * Qualified Name:     t6.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */