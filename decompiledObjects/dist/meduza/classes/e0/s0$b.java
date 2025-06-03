package e0;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import x.b;

public final class s0$b
  extends s0.e
{
  public static Field c;
  public static boolean d = false;
  public static Constructor<WindowInsets> e;
  public static boolean f = false;
  public WindowInsets a;
  public b b;
  
  public s0$b()
  {
    a = e();
  }
  
  public s0$b(s0 params0)
  {
    super(params0);
    a = params0.b();
  }
  
  private static WindowInsets e()
  {
    if (!d)
    {
      try
      {
        c = WindowInsets.class.getDeclaredField("CONSUMED");
      }
      catch (ReflectiveOperationException localReflectiveOperationException1)
      {
        Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", localReflectiveOperationException1);
      }
      d = true;
    }
    Object localObject1 = c;
    if (localObject1 != null) {
      try
      {
        localObject1 = (WindowInsets)((Field)localObject1).get(null);
        if (localObject1 != null)
        {
          localObject1 = new WindowInsets((WindowInsets)localObject1);
          return (WindowInsets)localObject1;
        }
      }
      catch (ReflectiveOperationException localReflectiveOperationException2)
      {
        Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", localReflectiveOperationException2);
      }
    }
    if (!f)
    {
      try
      {
        e = WindowInsets.class.getConstructor(new Class[] { Rect.class });
      }
      catch (ReflectiveOperationException localReflectiveOperationException3)
      {
        Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", localReflectiveOperationException3);
      }
      f = true;
    }
    Object localObject2 = e;
    if (localObject2 != null) {
      try
      {
        Rect localRect = new android/graphics/Rect;
        localRect.<init>();
        localObject2 = (WindowInsets)((Constructor)localObject2).newInstance(new Object[] { localRect });
        return (WindowInsets)localObject2;
      }
      catch (ReflectiveOperationException localReflectiveOperationException4)
      {
        Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", localReflectiveOperationException4);
      }
    }
    return null;
  }
  
  public s0 b()
  {
    a();
    s0 locals0 = s0.c(a, null);
    a.k(null);
    b localb = b;
    a.m(localb);
    return locals0;
  }
  
  public void c(b paramb)
  {
    b = paramb;
  }
  
  public void d(b paramb)
  {
    WindowInsets localWindowInsets = a;
    if (localWindowInsets != null) {
      a = localWindowInsets.replaceSystemWindowInsets(a, b, c, d);
    }
  }
}

/* Location:
 * Qualified Name:     e0.s0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */