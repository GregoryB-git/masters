package androidx.core.view.accessibility;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.RequiresApi;

@RequiresApi(26)
class AccessibilityNodeProviderCompat$AccessibilityNodeProviderApi26
  extends AccessibilityNodeProviderCompat.AccessibilityNodeProviderApi19
{
  public AccessibilityNodeProviderCompat$AccessibilityNodeProviderApi26(AccessibilityNodeProviderCompat paramAccessibilityNodeProviderCompat)
  {
    super(paramAccessibilityNodeProviderCompat);
  }
  
  public void addExtraDataToAccessibilityNodeInfo(int paramInt, AccessibilityNodeInfo paramAccessibilityNodeInfo, String paramString, Bundle paramBundle)
  {
    mCompat.addExtraDataToAccessibilityNodeInfo(paramInt, AccessibilityNodeInfoCompat.wrap(paramAccessibilityNodeInfo), paramString, paramBundle);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.accessibility.AccessibilityNodeProviderCompat.AccessibilityNodeProviderApi26
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */