package androidx.core.widget;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import android.widget.ScrollView;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.core.view.accessibility.AccessibilityRecordCompat;

class NestedScrollView$AccessibilityDelegate
  extends AccessibilityDelegateCompat
{
  public void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
    paramView = (NestedScrollView)paramView;
    paramAccessibilityEvent.setClassName(ScrollView.class.getName());
    boolean bool;
    if (paramView.getScrollRange() > 0) {
      bool = true;
    } else {
      bool = false;
    }
    paramAccessibilityEvent.setScrollable(bool);
    paramAccessibilityEvent.setScrollX(paramView.getScrollX());
    paramAccessibilityEvent.setScrollY(paramView.getScrollY());
    AccessibilityRecordCompat.setMaxScrollX(paramAccessibilityEvent, paramView.getScrollX());
    AccessibilityRecordCompat.setMaxScrollY(paramAccessibilityEvent, paramView.getScrollRange());
  }
  
  public void onInitializeAccessibilityNodeInfo(View paramView, AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat)
  {
    super.onInitializeAccessibilityNodeInfo(paramView, paramAccessibilityNodeInfoCompat);
    paramView = (NestedScrollView)paramView;
    paramAccessibilityNodeInfoCompat.setClassName(ScrollView.class.getName());
    if (paramView.isEnabled())
    {
      int i = paramView.getScrollRange();
      if (i > 0)
      {
        paramAccessibilityNodeInfoCompat.setScrollable(true);
        if (paramView.getScrollY() > 0)
        {
          paramAccessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
          paramAccessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_UP);
        }
        if (paramView.getScrollY() < i)
        {
          paramAccessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
          paramAccessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_DOWN);
        }
      }
    }
  }
  
  public boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
  {
    if (super.performAccessibilityAction(paramView, paramInt, paramBundle)) {
      return true;
    }
    paramBundle = (NestedScrollView)paramView;
    if (!paramBundle.isEnabled()) {
      return false;
    }
    int i = paramBundle.getHeight();
    paramView = new Rect();
    int j = i;
    if (paramBundle.getMatrix().isIdentity())
    {
      j = i;
      if (paramBundle.getGlobalVisibleRect(paramView)) {
        j = paramView.height();
      }
    }
    if (paramInt != 4096) {
      if ((paramInt != 8192) && (paramInt != 16908344))
      {
        if (paramInt != 16908346) {
          return false;
        }
      }
      else
      {
        paramInt = paramBundle.getPaddingBottom();
        i = paramBundle.getPaddingTop();
        paramInt = Math.max(paramBundle.getScrollY() - (j - paramInt - i), 0);
        if (paramInt != paramBundle.getScrollY())
        {
          paramBundle.smoothScrollTo(0, paramInt, true);
          return true;
        }
        return false;
      }
    }
    i = paramBundle.getPaddingBottom();
    paramInt = paramBundle.getPaddingTop();
    paramInt = Math.min(paramBundle.getScrollY() + (j - i - paramInt), paramBundle.getScrollRange());
    if (paramInt != paramBundle.getScrollY())
    {
      paramBundle.smoothScrollTo(0, paramInt, true);
      return true;
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     androidx.core.widget.NestedScrollView.AccessibilityDelegate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */