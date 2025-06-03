package e2;

import dc.a;
import ec.i;
import ec.j;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public final class b
  extends j
  implements a<Boolean>
{
  public b(c paramc)
  {
    super(0);
  }
  
  public final Object invoke()
  {
    Object localObject = a.a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
    i.d(localObject, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
    boolean bool1 = false;
    localObject = ((Class)localObject).getDeclaredMethod("getWindowExtensions", new Class[0]);
    Class localClass = a.a.loadClass("androidx.window.extensions.WindowExtensions");
    i.d(localClass, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
    i.d(localObject, "getWindowExtensionsMethod");
    boolean bool2 = bool1;
    if (((Method)localObject).getReturnType().equals(localClass))
    {
      bool2 = bool1;
      if (Modifier.isPublic(((Method)localObject).getModifiers())) {
        bool2 = true;
      }
    }
    return Boolean.valueOf(bool2);
  }
}

/* Location:
 * Qualified Name:     e2.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */