package androidx.appcompat.widget;

import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

class ActivityChooserView$3
  extends View.AccessibilityDelegate
{
  public ActivityChooserView$3(ActivityChooserView paramActivityChooserView) {}
  
  public void onInitializeAccessibilityNodeInfo(View paramView, AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramView, paramAccessibilityNodeInfo);
    AccessibilityNodeInfoCompat.wrap(paramAccessibilityNodeInfo).setCanOpenPopup(true);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ActivityChooserView.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */