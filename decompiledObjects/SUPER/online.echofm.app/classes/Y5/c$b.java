package Y5;

import V5.o;
import X5.g;
import g6.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.y;

public final class c$b
  extends Z5.d
{
  public int o;
  
  public c$b(X5.d paramd, g paramg, p paramp, Object paramObject)
  {
    super(paramd, paramg);
  }
  
  public Object invokeSuspend(Object paramObject)
  {
    int i = o;
    if (i != 0)
    {
      if (i == 1)
      {
        o = 2;
        o.b(paramObject);
      }
      else
      {
        throw new IllegalStateException("This coroutine had already completed".toString());
      }
    }
    else
    {
      o = 1;
      o.b(paramObject);
      Intrinsics.c(p, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
      paramObject = ((p)y.b(p, 2)).invoke(q, this);
    }
    return paramObject;
  }
}

/* Location:
 * Qualified Name:     Y5.c.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */