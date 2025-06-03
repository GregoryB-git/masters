package d2;

import b.a0;
import g.s;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import zc.a;

public final class j0$b
{
  public static final k0 a;
  
  static
  {
    try
    {
      a0 locala0;
      try
      {
        Object localObject = j0.a();
        localObject = new s((WebViewProviderFactoryBoundaryInterface)a.a(WebViewProviderFactoryBoundaryInterface.class, (InvocationHandler)localObject), 1);
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        throw new RuntimeException(localNoSuchMethodException);
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        locala0 = new a0();
      }
      a = locala0;
      return;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      throw new RuntimeException(localInvocationTargetException);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new RuntimeException(localIllegalAccessException);
    }
  }
}

/* Location:
 * Qualified Name:     d2.j0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */