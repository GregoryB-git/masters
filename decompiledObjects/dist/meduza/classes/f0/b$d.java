package f0;

import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import java.time.Duration;

public final class b$d
{
  public static AccessibilityNodeInfo.AccessibilityAction a()
  {
    return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
  }
  
  public static void b(AccessibilityNodeInfo paramAccessibilityNodeInfo, Rect paramRect)
  {
    paramAccessibilityNodeInfo.getBoundsInWindow(paramRect);
  }
  
  public static CharSequence c(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    return paramAccessibilityNodeInfo.getContainerTitle();
  }
  
  public static long d(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    return paramAccessibilityNodeInfo.getMinDurationBetweenContentChanges().toMillis();
  }
  
  public static boolean e(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    return paramAccessibilityNodeInfo.hasRequestInitialAccessibilityFocus();
  }
  
  public static boolean f(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    return paramAccessibilityNodeInfo.isAccessibilityDataSensitive();
  }
  
  public static void g(AccessibilityNodeInfo paramAccessibilityNodeInfo, boolean paramBoolean)
  {
    paramAccessibilityNodeInfo.setAccessibilityDataSensitive(paramBoolean);
  }
  
  public static void h(AccessibilityNodeInfo paramAccessibilityNodeInfo, Rect paramRect)
  {
    paramAccessibilityNodeInfo.setBoundsInWindow(paramRect);
  }
  
  public static void i(AccessibilityNodeInfo paramAccessibilityNodeInfo, CharSequence paramCharSequence)
  {
    paramAccessibilityNodeInfo.setContainerTitle(paramCharSequence);
  }
  
  public static void j(AccessibilityNodeInfo paramAccessibilityNodeInfo, long paramLong)
  {
    paramAccessibilityNodeInfo.setMinDurationBetweenContentChanges(Duration.ofMillis(paramLong));
  }
  
  public static void k(AccessibilityNodeInfo paramAccessibilityNodeInfo, View paramView, boolean paramBoolean)
  {
    paramAccessibilityNodeInfo.setQueryFromAppProcessEnabled(paramView, paramBoolean);
  }
  
  public static void l(AccessibilityNodeInfo paramAccessibilityNodeInfo, boolean paramBoolean)
  {
    paramAccessibilityNodeInfo.setRequestInitialAccessibilityFocus(paramBoolean);
  }
}

/* Location:
 * Qualified Name:     f0.b.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */