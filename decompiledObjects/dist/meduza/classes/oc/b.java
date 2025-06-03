package oc;

import android.os.Build.VERSION;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import nc.b0;
import nc.b0.a;
import ub.a;
import ub.h;

public final class b
  extends a
  implements b0
{
  private volatile Object _preHandler = this;
  
  public b()
  {
    super(b0.a.a);
  }
  
  public void I(h paramh, Throwable paramThrowable)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 1;
    if ((26 <= i) && (i < 28)) {
      i = 1;
    } else {
      i = 0;
    }
    Thread.UncaughtExceptionHandler localUncaughtExceptionHandler;
    if (i != 0)
    {
      paramh = _preHandler;
      localUncaughtExceptionHandler = null;
      if (paramh != this) {
        paramh = (Method)paramh;
      }
    }
    try
    {
      paramh = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
      if (Modifier.isPublic(paramh.getModifiers()))
      {
        boolean bool = Modifier.isStatic(paramh.getModifiers());
        if (bool)
        {
          i = j;
          break label95;
        }
      }
      i = 0;
      label95:
      if (i == 0) {}
    }
    finally
    {
      for (;;) {}
    }
    paramh = null;
    _preHandler = paramh;
    if (paramh != null) {
      paramh = paramh.invoke(null, new Object[0]);
    } else {
      paramh = null;
    }
    if ((paramh instanceof Thread.UncaughtExceptionHandler)) {
      localUncaughtExceptionHandler = (Thread.UncaughtExceptionHandler)paramh;
    }
    if (localUncaughtExceptionHandler != null) {
      localUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), paramThrowable);
    }
  }
}

/* Location:
 * Qualified Name:     oc.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */