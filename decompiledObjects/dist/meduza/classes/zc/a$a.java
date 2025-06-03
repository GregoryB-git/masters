package zc;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface;

public final class a$a
  implements InvocationHandler
{
  public final Object a;
  
  public a$a(FeatureFlagHolderBoundaryInterface paramFeatureFlagHolderBoundaryInterface)
  {
    a = paramFeatureFlagHolderBoundaryInterface;
  }
  
  public final Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    paramObject = a.getClass().getClassLoader();
    try
    {
      paramObject = Class.forName(paramMethod.getDeclaringClass().getName(), true, (ClassLoader)paramObject);
      Class[] arrayOfClass = paramMethod.getParameterTypes();
      paramObject = ((Class)paramObject).getDeclaredMethod(paramMethod.getName(), arrayOfClass).invoke(a, paramArrayOfObject);
      return paramObject;
    }
    catch (ReflectiveOperationException paramArrayOfObject) {}catch (InvocationTargetException paramObject) {}
    paramObject = new StringBuilder();
    ((StringBuilder)paramObject).append("Reflection failed for method ");
    ((StringBuilder)paramObject).append(paramMethod);
    throw new RuntimeException(((StringBuilder)paramObject).toString(), paramArrayOfObject);
    throw ((InvocationTargetException)paramObject).getTargetException();
  }
}

/* Location:
 * Qualified Name:     zc.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */