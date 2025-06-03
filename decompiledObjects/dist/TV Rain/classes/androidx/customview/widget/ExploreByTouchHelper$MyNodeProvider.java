package androidx.customview.widget;

import android.os.Bundle;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;

class ExploreByTouchHelper$MyNodeProvider
  extends AccessibilityNodeProviderCompat
{
  public ExploreByTouchHelper$MyNodeProvider(ExploreByTouchHelper paramExploreByTouchHelper) {}
  
  public AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int paramInt)
  {
    return AccessibilityNodeInfoCompat.obtain(this$0.obtainAccessibilityNodeInfo(paramInt));
  }
  
  public AccessibilityNodeInfoCompat findFocus(int paramInt)
  {
    if (paramInt == 2) {
      paramInt = this$0.mAccessibilityFocusedVirtualViewId;
    } else {
      paramInt = this$0.mKeyboardFocusedVirtualViewId;
    }
    if (paramInt == Integer.MIN_VALUE) {
      return null;
    }
    return createAccessibilityNodeInfo(paramInt);
  }
  
  public boolean performAction(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    return this$0.performAction(paramInt1, paramInt2, paramBundle);
  }
}

/* Location:
 * Qualified Name:     androidx.customview.widget.ExploreByTouchHelper.MyNodeProvider
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */