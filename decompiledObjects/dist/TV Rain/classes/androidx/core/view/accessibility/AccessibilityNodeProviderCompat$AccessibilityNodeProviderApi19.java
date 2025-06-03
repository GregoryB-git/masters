package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.RequiresApi;

@RequiresApi(19)
class AccessibilityNodeProviderCompat$AccessibilityNodeProviderApi19
  extends AccessibilityNodeProviderCompat.AccessibilityNodeProviderApi16
{
  public AccessibilityNodeProviderCompat$AccessibilityNodeProviderApi19(AccessibilityNodeProviderCompat paramAccessibilityNodeProviderCompat)
  {
    super(paramAccessibilityNodeProviderCompat);
  }
  
  public AccessibilityNodeInfo findFocus(int paramInt)
  {
    AccessibilityNodeInfoCompat localAccessibilityNodeInfoCompat = mCompat.findFocus(paramInt);
    if (localAccessibilityNodeInfoCompat == null) {
      return null;
    }
    return localAccessibilityNodeInfoCompat.unwrap();
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.accessibility.AccessibilityNodeProviderCompat.AccessibilityNodeProviderApi19
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */