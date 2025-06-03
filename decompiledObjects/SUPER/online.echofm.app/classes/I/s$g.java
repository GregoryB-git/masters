package I;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.accessibility.AccessibilityNodeProvider;

public abstract class s$g
{
  public static AccessibilityNodeProvider a(View paramView)
  {
    return paramView.getAccessibilityNodeProvider();
  }
  
  public static boolean b(View paramView)
  {
    return paramView.getFitsSystemWindows();
  }
  
  public static int c(View paramView)
  {
    return paramView.getImportantForAccessibility();
  }
  
  public static int d(View paramView)
  {
    return paramView.getMinimumHeight();
  }
  
  public static int e(View paramView)
  {
    return paramView.getMinimumWidth();
  }
  
  public static ViewParent f(View paramView)
  {
    return paramView.getParentForAccessibility();
  }
  
  public static int g(View paramView)
  {
    return paramView.getWindowSystemUiVisibility();
  }
  
  public static boolean h(View paramView)
  {
    return paramView.hasOverlappingRendering();
  }
  
  public static boolean i(View paramView)
  {
    return paramView.hasTransientState();
  }
  
  public static boolean j(View paramView, int paramInt, Bundle paramBundle)
  {
    return paramView.performAccessibilityAction(paramInt, paramBundle);
  }
  
  public static void k(View paramView)
  {
    paramView.postInvalidateOnAnimation();
  }
  
  public static void l(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramView.postInvalidateOnAnimation(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static void m(View paramView, Runnable paramRunnable)
  {
    paramView.postOnAnimation(paramRunnable);
  }
  
  public static void n(View paramView, Runnable paramRunnable, long paramLong)
  {
    paramView.postOnAnimationDelayed(paramRunnable, paramLong);
  }
  
  public static void o(ViewTreeObserver paramViewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener)
  {
    paramViewTreeObserver.removeOnGlobalLayoutListener(paramOnGlobalLayoutListener);
  }
  
  public static void p(View paramView)
  {
    paramView.requestFitSystemWindows();
  }
  
  public static void q(View paramView, Drawable paramDrawable)
  {
    paramView.setBackground(paramDrawable);
  }
  
  public static void r(View paramView, boolean paramBoolean)
  {
    paramView.setHasTransientState(paramBoolean);
  }
  
  public static void s(View paramView, int paramInt)
  {
    paramView.setImportantForAccessibility(paramInt);
  }
}

/* Location:
 * Qualified Name:     I.s.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */