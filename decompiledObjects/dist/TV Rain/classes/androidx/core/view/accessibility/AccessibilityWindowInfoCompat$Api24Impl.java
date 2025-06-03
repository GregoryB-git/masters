package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(24)
class AccessibilityWindowInfoCompat$Api24Impl
{
  @DoNotInline
  public static AccessibilityNodeInfo getAnchor(AccessibilityWindowInfo paramAccessibilityWindowInfo)
  {
    return paramAccessibilityWindowInfo.getAnchor();
  }
  
  @DoNotInline
  public static CharSequence getTitle(AccessibilityWindowInfo paramAccessibilityWindowInfo)
  {
    return paramAccessibilityWindowInfo.getTitle();
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api24Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */