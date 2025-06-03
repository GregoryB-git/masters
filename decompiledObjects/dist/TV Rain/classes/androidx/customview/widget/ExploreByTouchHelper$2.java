package androidx.customview.widget;

import androidx.collection.SparseArrayCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

class ExploreByTouchHelper$2
  implements FocusStrategy.CollectionAdapter<SparseArrayCompat<AccessibilityNodeInfoCompat>, AccessibilityNodeInfoCompat>
{
  public AccessibilityNodeInfoCompat get(SparseArrayCompat<AccessibilityNodeInfoCompat> paramSparseArrayCompat, int paramInt)
  {
    return (AccessibilityNodeInfoCompat)paramSparseArrayCompat.valueAt(paramInt);
  }
  
  public int size(SparseArrayCompat<AccessibilityNodeInfoCompat> paramSparseArrayCompat)
  {
    return paramSparseArrayCompat.size();
  }
}

/* Location:
 * Qualified Name:     androidx.customview.widget.ExploreByTouchHelper.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */