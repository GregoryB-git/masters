package androidx.slidingpanelayout.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

class SlidingPaneLayout$AccessibilityDelegate
  extends AccessibilityDelegateCompat
{
  private final Rect mTmpRect = new Rect();
  
  public SlidingPaneLayout$AccessibilityDelegate(SlidingPaneLayout paramSlidingPaneLayout) {}
  
  private void copyNodeInfoNoChildren(AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat1, AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat2)
  {
    Rect localRect = mTmpRect;
    paramAccessibilityNodeInfoCompat2.getBoundsInParent(localRect);
    paramAccessibilityNodeInfoCompat1.setBoundsInParent(localRect);
    paramAccessibilityNodeInfoCompat2.getBoundsInScreen(localRect);
    paramAccessibilityNodeInfoCompat1.setBoundsInScreen(localRect);
    paramAccessibilityNodeInfoCompat1.setVisibleToUser(paramAccessibilityNodeInfoCompat2.isVisibleToUser());
    paramAccessibilityNodeInfoCompat1.setPackageName(paramAccessibilityNodeInfoCompat2.getPackageName());
    paramAccessibilityNodeInfoCompat1.setClassName(paramAccessibilityNodeInfoCompat2.getClassName());
    paramAccessibilityNodeInfoCompat1.setContentDescription(paramAccessibilityNodeInfoCompat2.getContentDescription());
    paramAccessibilityNodeInfoCompat1.setEnabled(paramAccessibilityNodeInfoCompat2.isEnabled());
    paramAccessibilityNodeInfoCompat1.setClickable(paramAccessibilityNodeInfoCompat2.isClickable());
    paramAccessibilityNodeInfoCompat1.setFocusable(paramAccessibilityNodeInfoCompat2.isFocusable());
    paramAccessibilityNodeInfoCompat1.setFocused(paramAccessibilityNodeInfoCompat2.isFocused());
    paramAccessibilityNodeInfoCompat1.setAccessibilityFocused(paramAccessibilityNodeInfoCompat2.isAccessibilityFocused());
    paramAccessibilityNodeInfoCompat1.setSelected(paramAccessibilityNodeInfoCompat2.isSelected());
    paramAccessibilityNodeInfoCompat1.setLongClickable(paramAccessibilityNodeInfoCompat2.isLongClickable());
    paramAccessibilityNodeInfoCompat1.addAction(paramAccessibilityNodeInfoCompat2.getActions());
    paramAccessibilityNodeInfoCompat1.setMovementGranularities(paramAccessibilityNodeInfoCompat2.getMovementGranularities());
  }
  
  public boolean filter(View paramView)
  {
    return this$0.isDimmed(paramView);
  }
  
  public void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
  }
  
  public void onInitializeAccessibilityNodeInfo(View paramView, AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat)
  {
    AccessibilityNodeInfoCompat localAccessibilityNodeInfoCompat = AccessibilityNodeInfoCompat.obtain(paramAccessibilityNodeInfoCompat);
    super.onInitializeAccessibilityNodeInfo(paramView, localAccessibilityNodeInfoCompat);
    copyNodeInfoNoChildren(paramAccessibilityNodeInfoCompat, localAccessibilityNodeInfoCompat);
    localAccessibilityNodeInfoCompat.recycle();
    paramAccessibilityNodeInfoCompat.setClassName(SlidingPaneLayout.class.getName());
    paramAccessibilityNodeInfoCompat.setSource(paramView);
    paramView = ViewCompat.getParentForAccessibility(paramView);
    if ((paramView instanceof View)) {
      paramAccessibilityNodeInfoCompat.setParent((View)paramView);
    }
    int i = this$0.getChildCount();
    for (int j = 0; j < i; j++)
    {
      paramView = this$0.getChildAt(j);
      if ((!filter(paramView)) && (paramView.getVisibility() == 0))
      {
        ViewCompat.setImportantForAccessibility(paramView, 1);
        paramAccessibilityNodeInfoCompat.addChild(paramView);
      }
    }
  }
  
  public boolean onRequestSendAccessibilityEvent(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    if (!filter(paramView)) {
      return super.onRequestSendAccessibilityEvent(paramViewGroup, paramView, paramAccessibilityEvent);
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     androidx.slidingpanelayout.widget.SlidingPaneLayout.AccessibilityDelegate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */