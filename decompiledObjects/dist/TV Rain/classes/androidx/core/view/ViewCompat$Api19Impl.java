package androidx.core.view;

import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(19)
class ViewCompat$Api19Impl
{
  @DoNotInline
  public static int getAccessibilityLiveRegion(View paramView)
  {
    return paramView.getAccessibilityLiveRegion();
  }
  
  @DoNotInline
  public static boolean isAttachedToWindow(@NonNull View paramView)
  {
    return paramView.isAttachedToWindow();
  }
  
  @DoNotInline
  public static boolean isLaidOut(@NonNull View paramView)
  {
    return paramView.isLaidOut();
  }
  
  @DoNotInline
  public static boolean isLayoutDirectionResolved(@NonNull View paramView)
  {
    return paramView.isLayoutDirectionResolved();
  }
  
  @DoNotInline
  public static void notifySubtreeAccessibilityStateChanged(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt)
  {
    paramViewParent.notifySubtreeAccessibilityStateChanged(paramView1, paramView2, paramInt);
  }
  
  @DoNotInline
  public static void setAccessibilityLiveRegion(View paramView, int paramInt)
  {
    paramView.setAccessibilityLiveRegion(paramInt);
  }
  
  @DoNotInline
  public static void setContentChangeTypes(AccessibilityEvent paramAccessibilityEvent, int paramInt)
  {
    paramAccessibilityEvent.setContentChangeTypes(paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.ViewCompat.Api19Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */