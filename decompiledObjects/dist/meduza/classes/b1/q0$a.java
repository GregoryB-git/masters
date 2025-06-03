package b1;

import android.app.Application;
import c1.b;
import ec.i;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;

public final class q0$a
  extends q0.c
{
  public static a c;
  public final Application b;
  
  public q0$a(Application paramApplication)
  {
    b = paramApplication;
  }
  
  public final <T extends o0> T a(Class<T> paramClass)
  {
    Application localApplication = b;
    if (localApplication != null) {
      return c(paramClass, localApplication);
    }
    throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
  }
  
  public final o0 b(Class paramClass, b paramb)
  {
    if (b != null)
    {
      paramClass = a(paramClass);
    }
    else
    {
      p0 localp0 = p0.a;
      paramb = (Application)a.get(localp0);
      if (paramb != null)
      {
        paramClass = c(paramClass, paramb);
      }
      else
      {
        if (a.class.isAssignableFrom(paramClass)) {
          break label63;
        }
        paramClass = super.a(paramClass);
      }
    }
    return paramClass;
    label63:
    throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
  }
  
  public final <T extends o0> T c(Class<T> paramClass, Application paramApplication)
  {
    if (a.class.isAssignableFrom(paramClass)) {
      try
      {
        paramApplication = (o0)paramClass.getConstructor(new Class[] { Application.class }).newInstance(new Object[] { paramApplication });
        i.d(paramApplication, "{\n                try {\n…          }\n            }");
        paramClass = paramApplication;
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        paramApplication = new StringBuilder();
        paramApplication.append("Cannot create an instance of ");
        paramApplication.append(paramClass);
        throw new RuntimeException(paramApplication.toString(), localInvocationTargetException);
      }
      catch (InstantiationException paramApplication)
      {
        localStringBuilder = new StringBuilder();
        localStringBuilder.append("Cannot create an instance of ");
        localStringBuilder.append(paramClass);
        throw new RuntimeException(localStringBuilder.toString(), paramApplication);
      }
      catch (IllegalAccessException paramApplication)
      {
        localStringBuilder = new StringBuilder();
        localStringBuilder.append("Cannot create an instance of ");
        localStringBuilder.append(paramClass);
        throw new RuntimeException(localStringBuilder.toString(), paramApplication);
      }
      catch (NoSuchMethodException paramApplication)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Cannot create an instance of ");
        localStringBuilder.append(paramClass);
        throw new RuntimeException(localStringBuilder.toString(), paramApplication);
      }
    } else {
      paramClass = super.a(paramClass);
    }
    return paramClass;
  }
}

/* Location:
 * Qualified Name:     b1.q0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */