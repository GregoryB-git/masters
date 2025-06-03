package q6;

import X5.a;
import X5.g;
import android.os.Build.VERSION;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import p6.G;

public final class b
  extends a
  implements G
{
  private volatile Object _preHandler = this;
  
  public b()
  {
    super(G.m);
  }
  
  public final Method E()
  {
    Object localObject1 = _preHandler;
    if (localObject1 != this) {
      return (Method)localObject1;
    }
    localObject4 = null;
    try
    {
      Method localMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
      localObject1 = localObject4;
      if (Modifier.isPublic(localMethod.getModifiers()))
      {
        boolean bool = Modifier.isStatic(localMethod.getModifiers());
        localObject1 = localObject4;
        if (bool) {
          localObject1 = localMethod;
        }
      }
    }
    finally
    {
      for (;;)
      {
        Object localObject3 = localObject4;
      }
    }
    _preHandler = localObject1;
    return (Method)localObject1;
  }
  
  public void h(g paramg, Throwable paramThrowable)
  {
    int i = Build.VERSION.SDK_INT;
    if ((26 <= i) && (i < 28))
    {
      paramg = E();
      Thread.UncaughtExceptionHandler localUncaughtExceptionHandler = null;
      if (paramg != null) {
        paramg = paramg.invoke(null, new Object[0]);
      } else {
        paramg = null;
      }
      if ((paramg instanceof Thread.UncaughtExceptionHandler)) {
        localUncaughtExceptionHandler = (Thread.UncaughtExceptionHandler)paramg;
      }
      if (localUncaughtExceptionHandler != null) {
        localUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), paramThrowable);
      }
    }
  }
}

/* Location:
 * Qualified Name:     q6.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */