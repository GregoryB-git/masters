package b6;

import W5.g;
import j6.b;
import j6.c;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

public abstract class a
{
  public void a(Throwable paramThrowable1, Throwable paramThrowable2)
  {
    Intrinsics.checkNotNullParameter(paramThrowable1, "cause");
    Intrinsics.checkNotNullParameter(paramThrowable2, "exception");
    Method localMethod = a.b;
    if (localMethod != null) {
      localMethod.invoke(paramThrowable1, new Object[] { paramThrowable2 });
    }
  }
  
  public c b()
  {
    return new b();
  }
  
  public static final class a
  {
    public static final a a = new a();
    public static final Method b;
    public static final Method c;
    
    static
    {
      Method[] arrayOfMethod = Throwable.class.getMethods();
      Intrinsics.b(arrayOfMethod);
      int i = arrayOfMethod.length;
      int j = 0;
      Object localObject1;
      for (int k = 0;; k++)
      {
        localObject1 = null;
        if (k >= i) {
          break;
        }
        localObject2 = arrayOfMethod[k];
        if (Intrinsics.a(((Method)localObject2).getName(), "addSuppressed"))
        {
          Class[] arrayOfClass = ((Method)localObject2).getParameterTypes();
          Intrinsics.checkNotNullExpressionValue(arrayOfClass, "getParameterTypes(...)");
          if (Intrinsics.a(g.r(arrayOfClass), Throwable.class)) {
            break label92;
          }
        }
      }
      Object localObject2 = null;
      label92:
      b = (Method)localObject2;
      i = arrayOfMethod.length;
      for (k = j;; k++)
      {
        localObject2 = localObject1;
        if (k >= i) {
          break;
        }
        localObject2 = arrayOfMethod[k];
        if (Intrinsics.a(((Method)localObject2).getName(), "getSuppressed")) {
          break;
        }
      }
      c = (Method)localObject2;
    }
  }
}

/* Location:
 * Qualified Name:     b6.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */