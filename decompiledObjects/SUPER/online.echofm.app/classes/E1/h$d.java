package E1;

import T1.a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

public final class h$d
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
      return null;
    }
    finally
    {
      a.b((Throwable)paramObject, this);
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     E1.h.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */