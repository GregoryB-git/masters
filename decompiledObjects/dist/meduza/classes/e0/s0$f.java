package e0;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import f;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import x.b;

public class s0$f
  extends s0.k
{
  public static boolean f = false;
  public static Method g;
  public static Class<?> h;
  public static Field i;
  public static Field j;
  public final WindowInsets c;
  public b d = null;
  public b e;
  
  public s0$f(s0 params0, WindowInsets paramWindowInsets)
  {
    super(params0);
    c = paramWindowInsets;
  }
  
  private b n(View paramView)
  {
    if (Build.VERSION.SDK_INT < 30)
    {
      if (!f) {
        o();
      }
      Object localObject1 = g;
      Object localObject2 = null;
      if ((localObject1 != null) && (h != null) && (i != null)) {
        try
        {
          paramView = ((Method)localObject1).invoke(paramView, new Object[0]);
          if (paramView == null)
          {
            paramView = new java/lang/NullPointerException;
            paramView.<init>();
            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", paramView);
            return null;
          }
          paramView = j.get(paramView);
          localObject1 = (Rect)i.get(paramView);
          paramView = (View)localObject2;
          if (localObject1 != null) {
            paramView = b.a(left, top, right, bottom);
          }
          return paramView;
        }
        catch (ReflectiveOperationException localReflectiveOperationException)
        {
          paramView = f.l("Failed to get visible insets. (Reflection error). ");
          paramView.append(localReflectiveOperationException.getMessage());
          Log.e("WindowInsetsCompat", paramView.toString(), localReflectiveOperationException);
        }
      }
      return null;
    }
    throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
  }
  
  private static void o()
  {
    try
    {
      g = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
      Class localClass = Class.forName("android.view.View$AttachInfo");
      h = localClass;
      i = localClass.getDeclaredField("mVisibleInsets");
      j = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
      i.setAccessible(true);
      j.setAccessible(true);
    }
    catch (ReflectiveOperationException localReflectiveOperationException)
    {
      StringBuilder localStringBuilder = f.l("Failed to get visible insets. (Reflection error). ");
      localStringBuilder.append(localReflectiveOperationException.getMessage());
      Log.e("WindowInsetsCompat", localStringBuilder.toString(), localReflectiveOperationException);
    }
    f = true;
  }
  
  public void d(View paramView)
  {
    b localb = n(paramView);
    paramView = localb;
    if (localb == null) {
      paramView = b.e;
    }
    p(paramView);
  }
  
  public boolean equals(Object paramObject)
  {
    if (!super.equals(paramObject)) {
      return false;
    }
    paramObject = (f)paramObject;
    return Objects.equals(e, e);
  }
  
  public final b g()
  {
    if (d == null) {
      d = b.a(c.getSystemWindowInsetLeft(), c.getSystemWindowInsetTop(), c.getSystemWindowInsetRight(), c.getSystemWindowInsetBottom());
    }
    return d;
  }
  
  public s0 h(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object localObject = s0.c(c, null);
    int k = Build.VERSION.SDK_INT;
    if (k >= 30) {
      localObject = new s0.d((s0)localObject);
    } else if (k >= 29) {
      localObject = new s0.c((s0)localObject);
    } else {
      localObject = new s0.b((s0)localObject);
    }
    ((s0.e)localObject).d(s0.a(g(), paramInt1, paramInt2, paramInt3, paramInt4));
    ((s0.e)localObject).c(s0.a(f(), paramInt1, paramInt2, paramInt3, paramInt4));
    return ((s0.e)localObject).b();
  }
  
  public boolean j()
  {
    return c.isRound();
  }
  
  public void k(b[] paramArrayOfb) {}
  
  public void l(s0 params0) {}
  
  public void p(b paramb)
  {
    e = paramb;
  }
}

/* Location:
 * Qualified Name:     e0.s0.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */