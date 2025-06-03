package f2;

import android.app.Activity;
import dc.l;
import ec.d;
import ec.i;
import f;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import rb.h;

public final class b
{
  public final ClassLoader a;
  
  public b(ClassLoader paramClassLoader)
  {
    a = paramClassLoader;
  }
  
  public final c a(Object paramObject, d paramd, Activity paramActivity, k2.b paramb)
  {
    i.e(paramObject, "obj");
    i.e(paramActivity, "activity");
    paramd = new a(paramd, paramb);
    paramd = Proxy.newProxyInstance(a, new Class[] { b() }, paramd);
    i.d(paramd, "newProxyInstance(loader,…onsumerClass()), handler)");
    paramObject.getClass().getMethod("addWindowLayoutInfoListener", new Class[] { Activity.class, b() }).invoke(paramObject, new Object[] { paramActivity, paramd });
    return new c(paramObject.getClass().getMethod("removeWindowLayoutInfoListener", new Class[] { b() }), paramObject, paramd);
  }
  
  public final Class<?> b()
  {
    Class localClass = a.loadClass("java.util.function.Consumer");
    i.d(localClass, "loader.loadClass(\"java.util.function.Consumer\")");
    return localClass;
  }
  
  public static final class a<T>
    implements InvocationHandler
  {
    public final jc.c<T> a;
    public final l<T, h> b;
    
    public a(d paramd, k2.b paramb)
    {
      a = paramd;
      b = paramb;
    }
    
    public final Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
    {
      i.e(paramObject, "obj");
      i.e(paramMethod, "method");
      boolean bool1 = i.a(paramMethod.getName(), "accept");
      int i = 1;
      boolean bool2 = true;
      if (bool1)
      {
        if ((paramArrayOfObject != null) && (paramArrayOfObject.length == 1)) {
          j = 1;
        } else {
          j = 0;
        }
        if (j != 0)
        {
          j = 1;
          break label67;
        }
      }
      int j = 0;
      label67:
      Object localObject = null;
      StringBuilder localStringBuilder = null;
      if (j != 0)
      {
        paramMethod = a;
        paramObject = localStringBuilder;
        if (paramArrayOfObject != null) {
          paramObject = paramArrayOfObject[0];
        }
        i.e(paramMethod, "<this>");
        if (paramMethod.c(paramObject))
        {
          i.c(paramObject, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
          b.invoke(paramObject);
          paramObject = h.a;
        }
        else
        {
          paramObject = f.l("Value cannot be cast to ");
          ((StringBuilder)paramObject).append(paramMethod.b());
          throw new ClassCastException(((StringBuilder)paramObject).toString());
        }
      }
      else
      {
        if ((i.a(paramMethod.getName(), "equals")) && (paramMethod.getReturnType().equals(Boolean.TYPE)))
        {
          if ((paramArrayOfObject != null) && (paramArrayOfObject.length == 1)) {
            j = 1;
          } else {
            j = 0;
          }
          if (j != 0)
          {
            j = 1;
            break label221;
          }
        }
        j = 0;
        label221:
        if (j != 0)
        {
          paramMethod = (Method)localObject;
          if (paramArrayOfObject != null) {
            paramMethod = paramArrayOfObject[0];
          }
          if (paramObject != paramMethod) {
            bool2 = false;
          }
          paramObject = Boolean.valueOf(bool2);
        }
        else
        {
          if ((i.a(paramMethod.getName(), "hashCode")) && (paramMethod.getReturnType().equals(Integer.TYPE)) && (paramArrayOfObject == null)) {
            j = 1;
          } else {
            j = 0;
          }
          if (j != 0)
          {
            paramObject = Integer.valueOf(b.hashCode());
          }
          else
          {
            if ((i.a(paramMethod.getName(), "toString")) && (paramMethod.getReturnType().equals(String.class)) && (paramArrayOfObject == null)) {
              j = i;
            } else {
              j = 0;
            }
            if (j == 0) {
              break label367;
            }
            paramObject = b.toString();
          }
        }
      }
      return paramObject;
      label367:
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("Unexpected method call object:");
      localStringBuilder.append(paramObject);
      localStringBuilder.append(", method: ");
      localStringBuilder.append(paramMethod);
      localStringBuilder.append(", args: ");
      localStringBuilder.append(paramArrayOfObject);
      throw new UnsupportedOperationException(localStringBuilder.toString());
    }
  }
  
  public static abstract interface b
  {
    public abstract void dispose();
  }
}

/* Location:
 * Qualified Name:     f2.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */