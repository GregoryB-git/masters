package e0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;
import f;
import g.h;
import java.lang.reflect.Field;
import x.b;

public final class d0$d
{
  public static void a(WindowInsets paramWindowInsets, View paramView)
  {
    View.OnApplyWindowInsetsListener localOnApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener)paramView.getTag(2131362044);
    if (localOnApplyWindowInsetsListener != null) {
      localOnApplyWindowInsetsListener.onApplyWindowInsets(paramView, paramWindowInsets);
    }
  }
  
  public static s0 b(View paramView, s0 params0, Rect paramRect)
  {
    WindowInsets localWindowInsets = params0.b();
    if (localWindowInsets != null) {
      return s0.c(paramView.computeSystemWindowInsets(localWindowInsets, paramRect), paramView);
    }
    paramRect.setEmpty();
    return params0;
  }
  
  public static boolean c(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return paramView.dispatchNestedFling(paramFloat1, paramFloat2, paramBoolean);
  }
  
  public static boolean d(View paramView, float paramFloat1, float paramFloat2)
  {
    return paramView.dispatchNestedPreFling(paramFloat1, paramFloat2);
  }
  
  public static boolean e(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    return paramView.dispatchNestedPreScroll(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2);
  }
  
  public static boolean f(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    return paramView.dispatchNestedScroll(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt);
  }
  
  public static ColorStateList g(View paramView)
  {
    return paramView.getBackgroundTintList();
  }
  
  public static PorterDuff.Mode h(View paramView)
  {
    return paramView.getBackgroundTintMode();
  }
  
  public static float i(View paramView)
  {
    return paramView.getElevation();
  }
  
  public static s0 j(View paramView)
  {
    if ((s0.a.d) && (paramView.isAttachedToWindow()))
    {
      Object localObject = paramView.getRootView();
      try
      {
        localObject = s0.a.a.get(localObject);
        if (localObject != null)
        {
          Rect localRect1 = (Rect)s0.a.b.get(localObject);
          Rect localRect2 = (Rect)s0.a.c.get(localObject);
          if ((localRect1 != null) && (localRect2 != null))
          {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30)
            {
              localObject = new e0/s0$d;
              ((s0.d)localObject).<init>();
            }
            else if (i >= 29)
            {
              localObject = new s0.c();
            }
            else
            {
              localObject = new s0.b();
            }
            ((s0.e)localObject).c(b.a(left, top, right, bottom));
            ((s0.e)localObject).d(b.a(left, top, right, bottom));
            localObject = ((s0.e)localObject).b();
            a.l((s0)localObject);
            paramView = paramView.getRootView();
            a.d(paramView);
            paramView = (View)localObject;
          }
        }
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        paramView = f.l("Failed to get insets from AttachInfo. ");
        paramView.append(localIllegalAccessException.getMessage());
        Log.w("WindowInsetsCompat", paramView.toString(), localIllegalAccessException);
      }
    }
    paramView = null;
    return paramView;
  }
  
  public static String k(View paramView)
  {
    return paramView.getTransitionName();
  }
  
  public static float l(View paramView)
  {
    return paramView.getTranslationZ();
  }
  
  public static float m(View paramView)
  {
    return paramView.getZ();
  }
  
  public static boolean n(View paramView)
  {
    return paramView.hasNestedScrollingParent();
  }
  
  public static boolean o(View paramView)
  {
    return paramView.isImportantForAccessibility();
  }
  
  public static boolean p(View paramView)
  {
    return paramView.isNestedScrollingEnabled();
  }
  
  public static void q(View paramView, ColorStateList paramColorStateList)
  {
    paramView.setBackgroundTintList(paramColorStateList);
  }
  
  public static void r(View paramView, PorterDuff.Mode paramMode)
  {
    paramView.setBackgroundTintMode(paramMode);
  }
  
  public static void s(View paramView, float paramFloat)
  {
    paramView.setElevation(paramFloat);
  }
  
  public static void t(View paramView, boolean paramBoolean)
  {
    paramView.setNestedScrollingEnabled(paramBoolean);
  }
  
  public static void u(View paramView, final t paramt)
  {
    if (Build.VERSION.SDK_INT < 30) {
      paramView.setTag(2131362036, paramt);
    }
    if (paramt == null)
    {
      paramView.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener)paramView.getTag(2131362044));
      return;
    }
    paramView.setOnApplyWindowInsetsListener(new a(paramt));
  }
  
  public static void v(View paramView, String paramString)
  {
    paramView.setTransitionName(paramString);
  }
  
  public static void w(View paramView, float paramFloat)
  {
    paramView.setTranslationZ(paramFloat);
  }
  
  public static void x(View paramView, float paramFloat)
  {
    paramView.setZ(paramFloat);
  }
  
  public static boolean y(View paramView, int paramInt)
  {
    return paramView.startNestedScroll(paramInt);
  }
  
  public static void z(View paramView)
  {
    paramView.stopNestedScroll();
  }
  
  public final class a
    implements View.OnApplyWindowInsetsListener
  {
    public s0 a = null;
    
    public WindowInsets onApplyWindowInsets(View paramView, WindowInsets paramWindowInsets)
    {
      s0 locals0 = s0.c(paramWindowInsets, paramView);
      int i = Build.VERSION.SDK_INT;
      if (i < 30)
      {
        d0.d.a(paramWindowInsets, b);
        if (locals0.equals(a)) {
          return ((h)paramt).a(paramView, locals0).b();
        }
      }
      a = locals0;
      paramWindowInsets = ((h)paramt).a(paramView, locals0);
      if (i >= 30) {
        return paramWindowInsets.b();
      }
      d0.c.c(paramView);
      return paramWindowInsets.b();
    }
  }
}

/* Location:
 * Qualified Name:     e0.d0.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */