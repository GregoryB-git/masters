package I;

import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;

public abstract class s$i
{
  public static int a(View paramView)
  {
    return paramView.getAccessibilityLiveRegion();
  }
  
  public static boolean b(@NonNull View paramView)
  {
    return paramView.isAttachedToWindow();
  }
  
  public static boolean c(@NonNull View paramView)
  {
    return paramView.isLaidOut();
  }
  
  public static boolean d(@NonNull View paramView)
  {
    return paramView.isLayoutDirectionResolved();
  }
  
  public static void e(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt)
  {
    paramViewParent.notifySubtreeAccessibilityStateChanged(paramView1, paramView2, paramInt);
  }
  
  public static void f(View paramView, int paramInt)
  {
    paramView.setAccessibilityLiveRegion(paramInt);
  }
  
  public static void g(AccessibilityEvent paramAccessibilityEvent, int paramInt)
  {
    paramAccessibilityEvent.setContentChangeTypes(paramInt);
  }
}

/* Location:
 * Qualified Name:     I.s.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */