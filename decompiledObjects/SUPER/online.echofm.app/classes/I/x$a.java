package I;

import A.f;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

public abstract class x$a
{
  public static Field a;
  public static Field b;
  public static Field c;
  public static boolean d;
  
  static
  {
    try
    {
      localObject = View.class.getDeclaredField("mAttachInfo");
      a = (Field)localObject;
      ((AccessibleObject)localObject).setAccessible(true);
      localObject = Class.forName("android.view.View$AttachInfo");
      Field localField = ((Class)localObject).getDeclaredField("mStableInsets");
      b = localField;
      localField.setAccessible(true);
      localObject = ((Class)localObject).getDeclaredField("mContentInsets");
      c = (Field)localObject;
      ((AccessibleObject)localObject).setAccessible(true);
      d = true;
    }
    catch (ReflectiveOperationException localReflectiveOperationException)
    {
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Failed to get visible insets from AttachInfo ");
      ((StringBuilder)localObject).append(localReflectiveOperationException.getMessage());
      Log.w("WindowInsetsCompat", ((StringBuilder)localObject).toString(), localReflectiveOperationException);
    }
  }
  
  public static x a(View paramView)
  {
    if ((d) && (paramView.isAttachedToWindow()))
    {
      Object localObject1 = paramView.getRootView();
      try
      {
        Object localObject2 = a.get(localObject1);
        if (localObject2 != null)
        {
          localObject1 = (Rect)b.get(localObject2);
          localObject2 = (Rect)c.get(localObject2);
          if ((localObject1 != null) && (localObject2 != null))
          {
            x.b localb = new I/x$b;
            localb.<init>();
            localObject1 = localb.b(f.c((Rect)localObject1)).c(f.c((Rect)localObject2)).a();
            ((x)localObject1).p((x)localObject1);
            ((x)localObject1).d(paramView.getRootView());
            return (x)localObject1;
          }
        }
      }
      catch (IllegalAccessException paramView)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("Failed to get insets from AttachInfo. ");
        ((StringBuilder)localObject1).append(paramView.getMessage());
        Log.w("WindowInsetsCompat", ((StringBuilder)localObject1).toString(), paramView);
      }
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     I.x.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */