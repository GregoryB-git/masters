package androidx.customview.widget;

import android.graphics.Rect;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

class ExploreByTouchHelper$1
  implements FocusStrategy.BoundsAdapter<AccessibilityNodeInfoCompat>
{
  public void obtainBounds(AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat, Rect paramRect)
  {
    paramAccessibilityNodeInfoCompat.getBoundsInParent(paramRect);
  }
}

/* Location:
 * Qualified Name:     androidx.customview.widget.ExploreByTouchHelper.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */