package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import d;

@RequiresApi(33)
class AccessibilityNodeInfoCompat$Api33Impl
{
  @DoNotInline
  public static AccessibilityNodeInfo.ExtraRenderingInfo getExtraRenderingInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    return d.h(paramAccessibilityNodeInfo);
  }
  
  @DoNotInline
  public static boolean isTextSelectable(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    return paramAccessibilityNodeInfo.isTextSelectable();
  }
  
  @DoNotInline
  public static void setTextSelectable(AccessibilityNodeInfo paramAccessibilityNodeInfo, boolean paramBoolean)
  {
    paramAccessibilityNodeInfo.setTextSelectable(paramBoolean);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api33Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */