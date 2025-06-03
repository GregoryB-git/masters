package I;

import A.f;
import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class x$c
  extends x.f
{
  public static Field e;
  public static boolean f = false;
  public static Constructor g;
  public static boolean h = false;
  public WindowInsets c;
  public f d;
  
  public x$c()
  {
    c = h();
  }
  
  public x$c(@NonNull x paramx)
  {
    super(paramx);
    c = paramx.r();
  }
  
  private static WindowInsets h()
  {
    if (!f)
    {
      try
      {
        e = WindowInsets.class.getDeclaredField("CONSUMED");
      }
      catch (ReflectiveOperationException localReflectiveOperationException1)
      {
        Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", localReflectiveOperationException1);
      }
      f = true;
    }
    Object localObject1 = e;
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
    if (!h)
    {
      try
      {
        g = WindowInsets.class.getConstructor(new Class[] { Rect.class });
      }
      catch (ReflectiveOperationException localReflectiveOperationException3)
      {
        Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", localReflectiveOperationException3);
      }
      h = true;
    }
    Constructor localConstructor = g;
    if (localConstructor != null) {
      try
      {
        Object localObject2 = new android/graphics/Rect;
        ((Rect)localObject2).<init>();
        localObject2 = (WindowInsets)localConstructor.newInstance(new Object[] { localObject2 });
        return (WindowInsets)localObject2;
      }
      catch (ReflectiveOperationException localReflectiveOperationException4)
      {
        Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", localReflectiveOperationException4);
      }
    }
    return null;
  }
  
  @NonNull
  public x b()
  {
    a();
    x localx = x.s(c);
    localx.n(b);
    localx.q(d);
    return localx;
  }
  
  public void d(f paramf)
  {
    d = paramf;
  }
  
  public void f(@NonNull f paramf)
  {
    WindowInsets localWindowInsets = c;
    if (localWindowInsets != null) {
      c = localWindowInsets.replaceSystemWindowInsets(a, b, c, d);
    }
  }
}

/* Location:
 * Qualified Name:     I.x.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */