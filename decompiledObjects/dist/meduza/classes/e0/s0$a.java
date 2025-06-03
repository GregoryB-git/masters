package e0;

import android.util.Log;
import android.view.View;
import f;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

public final class s0$a
{
  public static Field a;
  public static Field b;
  public static Field c;
  public static boolean d;
  
  static
  {
    try
    {
      Object localObject1 = View.class.getDeclaredField("mAttachInfo");
      a = (Field)localObject1;
      ((AccessibleObject)localObject1).setAccessible(true);
      localObject1 = Class.forName("android.view.View$AttachInfo");
      localObject2 = ((Class)localObject1).getDeclaredField("mStableInsets");
      b = (Field)localObject2;
      ((AccessibleObject)localObject2).setAccessible(true);
      localObject1 = ((Class)localObject1).getDeclaredField("mContentInsets");
      c = (Field)localObject1;
      ((AccessibleObject)localObject1).setAccessible(true);
      d = true;
    }
    catch (ReflectiveOperationException localReflectiveOperationException)
    {
      Object localObject2 = f.l("Failed to get visible insets from AttachInfo ");
      ((StringBuilder)localObject2).append(localReflectiveOperationException.getMessage());
      Log.w("WindowInsetsCompat", ((StringBuilder)localObject2).toString(), localReflectiveOperationException);
    }
  }
}

/* Location:
 * Qualified Name:     e0.s0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */