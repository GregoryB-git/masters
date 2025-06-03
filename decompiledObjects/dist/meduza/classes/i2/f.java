package i2;

import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import dc.a;
import ec.i;
import ec.j;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public final class f
  extends j
  implements a<Boolean>
{
  public f(h paramh)
  {
    super(0);
  }
  
  public final Object invoke()
  {
    Object localObject = a.a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
    i.d(localObject, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
    boolean bool1 = false;
    Method localMethod = ((Class)localObject).getMethod("addWindowLayoutInfoListener", new Class[] { Context.class, Consumer.class });
    localObject = ((Class)localObject).getMethod("removeWindowLayoutInfoListener", new Class[] { Consumer.class });
    i.d(localMethod, "addListenerMethod");
    boolean bool2 = bool1;
    if (Modifier.isPublic(localMethod.getModifiers()))
    {
      i.d(localObject, "removeListenerMethod");
      bool2 = bool1;
      if (Modifier.isPublic(((Method)localObject).getModifiers())) {
        bool2 = true;
      }
    }
    return Boolean.valueOf(bool2);
  }
}

/* Location:
 * Qualified Name:     i2.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */