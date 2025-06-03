package b1;

import c1.b;
import ec.i;
import java.lang.reflect.Constructor;

public class q0$c
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

/* Location:
 * Qualified Name:     b1.q0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */