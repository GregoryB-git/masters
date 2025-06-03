package androidx.core.view;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(16)
class ViewCompat$Api16Impl
{
  @DoNotInline
  public static AccessibilityNodeProvider getAccessibilityNodeProvider(View paramView)
  {
    return paramView.getAccessibilityNodeProvider();
  }
  
  @DoNotInline
  public static boolean getFitsSystemWindows(View paramView)
  {
    return paramView.getFitsSystemWindows();
  }
  
  @DoNotInline
  public static int getImportantForAccessibility(View paramView)
  {
    return paramView.getImportantForAccessibility();
  }
  
  @DoNotInline
  public static int getMinimumHeight(View paramView)
  {
    return paramView.getMinimumHeight();
  }
  
  @DoNotInline
  public static int getMinimumWidth(View paramView)
  {
    return paramView.getMinimumWidth();
  }
  
  @DoNotInline
  public static ViewParent getParentForAccessibility(View paramView)
  {
    return paramView.getParentForAccessibility();
  }
  
  @DoNotInline
  public static int getWindowSystemUiVisibility(View paramView)
  {
    return paramView.getWindowSystemUiVisibility();
  }
  
  @DoNotInline
  public static boolean hasOverlappingRendering(View paramView)
  {
    return paramView.hasOverlappingRendering();
  }
  
  @DoNotInline
  public static boolean hasTransientState(View paramView)
  {
    return paramView.hasTransientState();
  }
  
  @DoNotInline
  public static boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
  {
    return paramView.performAccessibilityAction(paramInt, paramBundle);
  }
  
  @DoNotInline
  public static void postInvalidateOnAnimation(View paramView)
  {
    paramView.postInvalidateOnAnimation();
  }
  
  @DoNotInline
  public static void postInvalidateOnAnimation(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramView.postInvalidateOnAnimation(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  @DoNotInline
  public static void postOnAnimation(View paramView, Runnable paramRunnable)
  {
    paramView.postOnAnimation(paramRunnable);
  }
  
  @DoNotInline
  public static void postOnAnimationDelayed(View paramView, Runnable paramRunnable, long paramLong)
  {
    paramView.postOnAnimationDelayed(paramRunnable, paramLong);
  }
  
  @DoNotInline
  public static void removeOnGlobalLayoutListener(ViewTreeObserver paramViewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener)
  {
    paramViewTreeObserver.removeOnGlobalLayoutListener(paramOnGlobalLayoutListener);
  }
  
  @DoNotInline
  public static void requestFitSystemWindows(View paramView)
  {
    paramView.requestFitSystemWindows();
  }
  
  @DoNotInline
  public static void setBackground(View paramView, Drawable paramDrawable)
  {
    paramView.setBackground(paramDrawable);
  }
  
  @DoNotInline
  public static void setHasTransientState(View paramView, boolean paramBoolean)
  {
    paramView.setHasTransientState(paramBoolean);
  }
  
  @DoNotInline
  public static void setImportantForAccessibility(View paramView, int paramInt)
  {
    paramView.setImportantForAccessibility(paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.ViewCompat.Api16Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */