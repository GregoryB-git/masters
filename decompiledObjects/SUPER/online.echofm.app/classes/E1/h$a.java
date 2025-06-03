package E1;

import T1.a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;

public final class h$a
  implements InvocationHandler
{
  public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    if (a.d(this)) {
      return null;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramObject, "proxy");
      Intrinsics.checkNotNullParameter(paramMethod, "m");
      if (Intrinsics.a(paramMethod.getName(), "onBillingSetupFinished")) {
        h.s.f().set(true);
      }
    }
    finally
    {
      break label85;
    }
    paramObject = paramMethod.getName();
    Intrinsics.checkNotNullExpressionValue(paramObject, "m.name");
    if (i.k((String)paramObject, "onBillingServiceDisconnected", false, 2, null)) {
      h.s.f().set(false);
    }
    return null;
    label85:
    a.b((Throwable)paramObject, this);
    return null;
  }
}

/* Location:
 * Qualified Name:     E1.h.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */