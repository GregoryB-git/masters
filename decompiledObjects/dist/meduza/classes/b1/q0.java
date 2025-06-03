package b1;

import android.app.Application;
import c1.a.a;
import c1.b;
import ec.i;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;

public final class q0
{
  public final s0 a;
  public final b b;
  public final c1.a c;
  
  public q0(s0 params0, b paramb)
  {
    this(params0, paramb, a.a.b);
  }
  
  public q0(s0 params0, b paramb, c1.a parama)
  {
    a = params0;
    b = paramb;
    c = parama;
  }
  
  public final <T extends o0> T a(Class<T> paramClass)
  {
    String str = paramClass.getCanonicalName();
    if (str != null)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("androidx.lifecycle.ViewModelProvider.DefaultKey:");
      localStringBuilder.append(str);
      return b(paramClass, localStringBuilder.toString());
    }
    throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
  }
  
  public final o0 b(Class paramClass, String paramString)
  {
    i.e(paramString, "key");
    Object localObject = a;
    localObject.getClass();
    localObject = (o0)a.get(paramString);
    if (paramClass.isInstance(localObject))
    {
      paramClass = b;
      if ((paramClass instanceof d)) {
        paramClass = (d)paramClass;
      } else {
        paramClass = null;
      }
      if (paramClass != null)
      {
        i.b(localObject);
        paramClass.c((o0)localObject);
      }
      i.c(localObject, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
      return (o0)localObject;
    }
    b localb = new b(c);
    localObject = r0.a;
    a.put(localObject, paramString);
    try
    {
      localObject = b.b(paramClass, localb);
      paramClass = (Class)localObject;
    }
    catch (AbstractMethodError localAbstractMethodError)
    {
      paramClass = b.a(paramClass);
    }
    s0 locals0 = a;
    locals0.getClass();
    i.e(paramClass, "viewModel");
    paramString = (o0)a.put(paramString, paramClass);
    if (paramString != null) {
      paramString.b();
    }
    return paramClass;
  }
  
  public static final class a
    extends q0.c
  {
    public static a c;
    public final Application b;
    
    public a(Application paramApplication)
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
  
  public static abstract interface b
  {
    public abstract <T extends o0> T a(Class<T> paramClass);
    
    public abstract o0 b(Class paramClass, b paramb);
  }
  
  public static class c
    implements q0.b
  {
    public static c a;
    
    public <T extends o0> T a(Class<T> paramClass)
    {
      try
      {
        localObject = paramClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        i.d(localObject, "{\n                modelC…wInstance()\n            }");
        localObject = (o0)localObject;
        return (T)localObject;
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Cannot create an instance of ");
        ((StringBuilder)localObject).append(paramClass);
        throw new RuntimeException(((StringBuilder)localObject).toString(), localIllegalAccessException);
      }
      catch (InstantiationException localInstantiationException)
      {
        Object localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Cannot create an instance of ");
        ((StringBuilder)localObject).append(paramClass);
        throw new RuntimeException(((StringBuilder)localObject).toString(), localInstantiationException);
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Cannot create an instance of ");
        localStringBuilder.append(paramClass);
        throw new RuntimeException(localStringBuilder.toString(), localNoSuchMethodException);
      }
    }
    
    public o0 b(Class paramClass, b paramb)
    {
      return a(paramClass);
    }
  }
  
  public static class d
  {
    public void c(o0 paramo0) {}
  }
}

/* Location:
 * Qualified Name:     b1.q0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */