package b1;

import android.app.Application;
import ec.i;
import f;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import sb.k;
import va.a;

public final class l0
{
  public static final List<Class<?>> a = a.g(new Class[] { Application.class, e0.class });
  public static final List<Class<?>> b = a.f(e0.class);
  
  public static final <T> Constructor<T> a(Class<T> paramClass, List<? extends Class<?>> paramList)
  {
    i.e(paramList, "signature");
    Object localObject1 = paramClass.getConstructors();
    i.d(localObject1, "modelClass.constructors");
    int i = localObject1.length;
    for (int j = 0; j < i; j++)
    {
      Constructor<T> localConstructor = localObject1[j];
      Object localObject2 = localConstructor.getParameterTypes();
      i.d(localObject2, "constructor.parameterTypes");
      localObject2 = k.r((Object[])localObject2);
      if (i.a(paramList, localObject2)) {
        return localConstructor;
      }
      if ((paramList.size() == ((List)localObject2).size()) && (((List)localObject2).containsAll(paramList)))
      {
        localObject1 = f.l("Class ");
        ((StringBuilder)localObject1).append(paramClass.getSimpleName());
        ((StringBuilder)localObject1).append(" must have parameters in the proper order: ");
        ((StringBuilder)localObject1).append(paramList);
        throw new UnsupportedOperationException(((StringBuilder)localObject1).toString());
      }
    }
    return null;
  }
  
  public static final <T extends o0> T b(Class<T> paramClass, Constructor<T> paramConstructor, Object... paramVarArgs)
  {
    try
    {
      paramConstructor = (o0)paramConstructor.newInstance(Arrays.copyOf(paramVarArgs, paramVarArgs.length));
      return paramConstructor;
    }
    catch (InvocationTargetException paramVarArgs)
    {
      paramConstructor = new StringBuilder();
      paramConstructor.append("An exception happened in constructor of ");
      paramConstructor.append(paramClass);
      throw new RuntimeException(paramConstructor.toString(), paramVarArgs.getCause());
    }
    catch (InstantiationException paramConstructor)
    {
      paramVarArgs = new StringBuilder();
      paramVarArgs.append("A ");
      paramVarArgs.append(paramClass);
      paramVarArgs.append(" cannot be instantiated.");
      throw new RuntimeException(paramVarArgs.toString(), paramConstructor);
    }
    catch (IllegalAccessException paramVarArgs)
    {
      paramConstructor = new StringBuilder();
      paramConstructor.append("Failed to access ");
      paramConstructor.append(paramClass);
      throw new RuntimeException(paramConstructor.toString(), paramVarArgs);
    }
  }
}

/* Location:
 * Qualified Name:     b1.l0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */