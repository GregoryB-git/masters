package l;

import I.s;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

public abstract class d0
{
  public static Method a;
  
  static
  {
    try
    {
      Method localMethod = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[] { Rect.class, Rect.class });
      a = localMethod;
      if (!localMethod.isAccessible()) {
        a.setAccessible(true);
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
    }
  }
  
  public static boolean a(View paramView)
  {
    int i = s.m(paramView);
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     l.d0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */