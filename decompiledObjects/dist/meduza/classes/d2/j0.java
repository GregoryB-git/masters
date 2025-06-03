package d2;

import android.os.Build.VERSION;
import android.webkit.WebView;
import b.a0;
import g.s;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import zc.a;

public final class j0
{
  public static InvocationHandler a()
  {
    Object localObject;
    if (Build.VERSION.SDK_INT >= 28) {
      localObject = l.b();
    }
    try
    {
      localObject = WebView.class.getDeclaredMethod("getFactory", new Class[0]);
      ((AccessibleObject)localObject).setAccessible(true);
      localObject = ((Method)localObject).invoke(null, new Object[0]);
      localObject = localObject.getClass().getClassLoader();
      return (InvocationHandler)Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, (ClassLoader)localObject).getDeclaredMethod("createWebViewProviderFactory", new Class[0]).invoke(null, new Object[0]);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new RuntimeException(localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      throw new RuntimeException(localInvocationTargetException);
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      throw new RuntimeException(localNoSuchMethodException);
    }
  }
  
  public static final class a
  {
    public static final h0 a = new h0(j0.b.a.getWebkitToCompatConverter(), 1);
  }
  
  public static final class b
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
}

/* Location:
 * Qualified Name:     d2.j0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */