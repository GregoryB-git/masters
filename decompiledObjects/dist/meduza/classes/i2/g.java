package i2;

import dc.a;
import e2.c;
import ec.i;
import ec.j;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public final class g
  extends j
  implements a<Boolean>
{
  public g(h paramh)
  {
    super(0);
  }
  
  public final Object invoke()
  {
    Object localObject = a.c.a.loadClass("androidx.window.extensions.WindowExtensions");
    i.d(localObject, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
    boolean bool1 = false;
    localObject = ((Class)localObject).getMethod("getWindowLayoutComponent", new Class[0]);
    Class localClass = a.a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
    i.d(localClass, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
    i.d(localObject, "getWindowLayoutComponentMethod");
    boolean bool2 = bool1;
    if (Modifier.isPublic(((Method)localObject).getModifiers()))
    {
      bool2 = bool1;
      if (((Method)localObject).getReturnType().equals(localClass)) {
        bool2 = true;
      }
    }
    return Boolean.valueOf(bool2);
  }
}

/* Location:
 * Qualified Name:     i2.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */