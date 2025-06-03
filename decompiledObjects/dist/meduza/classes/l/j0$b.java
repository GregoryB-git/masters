package l;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

public final class j0$b
{
  public static Method a;
  public static Method b;
  public static Method c;
  public static boolean d;
  
  static
  {
    try
    {
      Object localObject1 = Integer.TYPE;
      Object localObject2 = Boolean.TYPE;
      Class localClass = Float.TYPE;
      localObject2 = AbsListView.class.getDeclaredMethod("positionSelector", new Class[] { localObject1, View.class, localObject2, localClass, localClass });
      a = (Method)localObject2;
      ((AccessibleObject)localObject2).setAccessible(true);
      localObject2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", new Class[] { localObject1 });
      b = (Method)localObject2;
      ((AccessibleObject)localObject2).setAccessible(true);
      localObject1 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", new Class[] { localObject1 });
      c = (Method)localObject1;
      ((AccessibleObject)localObject1).setAccessible(true);
      d = true;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      localNoSuchMethodException.printStackTrace();
    }
  }
}

/* Location:
 * Qualified Name:     l.j0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */