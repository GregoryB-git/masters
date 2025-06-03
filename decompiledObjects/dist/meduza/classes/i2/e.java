package i2;

import android.app.Activity;
import dc.a;
import ec.i;
import ec.j;
import f2.b;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public final class e
  extends j
  implements a<Boolean>
{
  public e(h paramh)
  {
    super(0);
  }
  
  public final Object invoke()
  {
    Object localObject1 = a.b;
    localObject1.getClass();
    Object localObject2;
    try
    {
      localObject1 = ((b)localObject1).b();
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      localObject2 = null;
    }
    if (localObject2 == null)
    {
      localObject2 = Boolean.FALSE;
    }
    else
    {
      Class localClass = a.a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
      i.d(localClass, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
      boolean bool1 = false;
      Method localMethod = localClass.getMethod("addWindowLayoutInfoListener", new Class[] { Activity.class, localObject2 });
      localObject2 = localClass.getMethod("removeWindowLayoutInfoListener", new Class[] { localObject2 });
      i.d(localMethod, "addListenerMethod");
      boolean bool2 = bool1;
      if (Modifier.isPublic(localMethod.getModifiers()))
      {
        i.d(localObject2, "removeListenerMethod");
        bool2 = bool1;
        if (Modifier.isPublic(((Method)localObject2).getModifiers())) {
          bool2 = true;
        }
      }
      localObject2 = Boolean.valueOf(bool2);
    }
    return localObject2;
  }
}

/* Location:
 * Qualified Name:     i2.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */