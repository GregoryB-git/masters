package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
class AccessibilityWindowInfoCompat$Api21Impl
{
  @DoNotInline
  public static void getBoundsInScreen(AccessibilityWindowInfo paramAccessibilityWindowInfo, Rect paramRect)
  {
    paramAccessibilityWindowInfo.getBoundsInScreen(paramRect);
  }
  
  @DoNotInline
  public static AccessibilityWindowInfo getChild(AccessibilityWindowInfo paramAccessibilityWindowInfo, int paramInt)
  {
    return paramAccessibilityWindowInfo.getChild(paramInt);
  }
  
  @DoNotInline
  public static int getChildCount(AccessibilityWindowInfo paramAccessibilityWindowInfo)
  {
    return paramAccessibilityWindowInfo.getChildCount();
  }
  
  @DoNotInline
  public static int getId(AccessibilityWindowInfo paramAccessibilityWindowInfo)
  {
    return paramAccessibilityWindowInfo.getId();
  }
  
  @DoNotInline
  public static int getLayer(AccessibilityWindowInfo paramAccessibilityWindowInfo)
  {
    return paramAccessibilityWindowInfo.getLayer();
  }
  
  @DoNotInline
  public static AccessibilityWindowInfo getParent(AccessibilityWindowInfo paramAccessibilityWindowInfo)
  {
    return paramAccessibilityWindowInfo.getParent();
  }
  
  @DoNotInline
  public static AccessibilityNodeInfo getRoot(AccessibilityWindowInfo paramAccessibilityWindowInfo)
  {
    return paramAccessibilityWindowInfo.getRoot();
  }
  
  @DoNotInline
  public static int getType(AccessibilityWindowInfo paramAccessibilityWindowInfo)
  {
    return paramAccessibilityWindowInfo.getType();
  }
  
  @DoNotInline
  public static boolean isAccessibilityFocused(AccessibilityWindowInfo paramAccessibilityWindowInfo)
  {
    return paramAccessibilityWindowInfo.isAccessibilityFocused();
  }
  
  @DoNotInline
  public static boolean isActive(AccessibilityWindowInfo paramAccessibilityWindowInfo)
  {
    return paramAccessibilityWindowInfo.isActive();
  }
  
  @DoNotInline
  public static boolean isFocused(AccessibilityWindowInfo paramAccessibilityWindowInfo)
  {
    return paramAccessibilityWindowInfo.isFocused();
  }
  
  @DoNotInline
  public static AccessibilityWindowInfo obtain()
  {
    return AccessibilityWindowInfo.obtain();
  }
  
  @DoNotInline
  public static AccessibilityWindowInfo obtain(AccessibilityWindowInfo paramAccessibilityWindowInfo)
  {
    return AccessibilityWindowInfo.obtain(paramAccessibilityWindowInfo);
  }
  
  @DoNotInline
  public static void recycle(AccessibilityWindowInfo paramAccessibilityWindowInfo)
  {
    paramAccessibilityWindowInfo.recycle();
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api21Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */