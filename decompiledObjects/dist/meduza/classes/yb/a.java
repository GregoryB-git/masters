package yb;

import ec.i;
import java.lang.reflect.Method;

public class a
{
  public void a(Throwable paramThrowable1, Throwable paramThrowable2)
  {
    i.e(paramThrowable1, "cause");
    i.e(paramThrowable2, "exception");
    Method localMethod = a.a;
    if (localMethod != null) {
      localMethod.invoke(paramThrowable1, new Object[] { paramThrowable2 });
    }
  }
  
  public static final class a
  {
    public static final Method a;
    
    static
    {
      Method[] arrayOfMethod = Throwable.class.getMethods();
      i.b(arrayOfMethod);
      int i = arrayOfMethod.length;
      int j = 0;
      Object localObject1;
      for (int k = 0;; k++)
      {
        localObject1 = null;
        Object localObject2 = null;
        if (k >= i) {
          break;
        }
        Method localMethod = arrayOfMethod[k];
        boolean bool = i.a(localMethod.getName(), "addSuppressed");
        m = 1;
        if (bool)
        {
          Class[] arrayOfClass = localMethod.getParameterTypes();
          i.d(arrayOfClass, "getParameterTypes(...)");
          localObject1 = localObject2;
          if (arrayOfClass.length == 1) {
            localObject1 = arrayOfClass[0];
          }
          if (i.a(localObject1, Throwable.class)) {}
        }
        else
        {
          m = 0;
        }
        if (m != 0)
        {
          localObject1 = localMethod;
          break;
        }
      }
      a = (Method)localObject1;
      int m = arrayOfMethod.length;
      for (k = j; (k < m) && (!i.a(arrayOfMethod[k].getName(), "getSuppressed")); k++) {}
    }
  }
}

/* Location:
 * Qualified Name:     yb.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */