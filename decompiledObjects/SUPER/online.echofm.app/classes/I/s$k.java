package I;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import v.c;

public abstract class s$k
{
  public static void a(@NonNull WindowInsets paramWindowInsets, @NonNull View paramView)
  {
    View.OnApplyWindowInsetsListener localOnApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener)paramView.getTag(c.Q);
    if (localOnApplyWindowInsetsListener != null) {
      localOnApplyWindowInsetsListener.onApplyWindowInsets(paramView, paramWindowInsets);
    }
  }
  
  public static x b(@NonNull View paramView, @NonNull x paramx, @NonNull Rect paramRect)
  {
    WindowInsets localWindowInsets = paramx.r();
    if (localWindowInsets != null) {
      return x.t(paramView.computeSystemWindowInsets(localWindowInsets, paramRect), paramView);
    }
    paramRect.setEmpty();
    return paramx;
  }
  
  public static boolean c(@NonNull View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return paramView.dispatchNestedFling(paramFloat1, paramFloat2, paramBoolean);
  }
  
  public static boolean d(@NonNull View paramView, float paramFloat1, float paramFloat2)
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
  
  public static x j(@NonNull View paramView)
  {
    return x.a.a(paramView);
  }
  
  public static String k(View paramView)
  {
    return paramView.getTransitionName();
  }
  
  public static float l(View paramView)
  {
    return paramView.getTranslationZ();
  }
  
  public static float m(@NonNull View paramView)
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
  
  public static void u(@NonNull View paramView, o paramo)
  {
    if (Build.VERSION.SDK_INT < 30) {
      paramView.setTag(c.L, paramo);
    }
    if (paramo == null)
    {
      paramView.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener)paramView.getTag(c.Q));
      return;
    }
    paramView.setOnApplyWindowInsetsListener(new a(paramo));
  }
  
  public static void v(View paramView, String paramString)
  {
    paramView.setTransitionName(paramString);
  }
  
  public static void w(View paramView, float paramFloat)
  {
    paramView.setTranslationZ(paramFloat);
  }
  
  public static void x(@NonNull View paramView, float paramFloat)
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
  
  public class a
    implements View.OnApplyWindowInsetsListener
  {
    public x a = null;
    
    public WindowInsets onApplyWindowInsets(View paramView, WindowInsets paramWindowInsets)
    {
      paramView = x.t(paramWindowInsets, paramView);
      if (Build.VERSION.SDK_INT < 30)
      {
        s.k.a(paramWindowInsets, b);
        if (paramView.equals(a)) {
          throw null;
        }
      }
      a = paramView;
      throw null;
    }
  }
}

/* Location:
 * Qualified Name:     I.s.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */