package androidx.coordinatorlayout.widget;

import android.view.View;
import android.view.ViewGroup.OnHierarchyChangeListener;

class CoordinatorLayout$HierarchyChangeListener
  implements ViewGroup.OnHierarchyChangeListener
{
  public CoordinatorLayout$HierarchyChangeListener(CoordinatorLayout paramCoordinatorLayout) {}
  
  public void onChildViewAdded(View paramView1, View paramView2)
  {
    ViewGroup.OnHierarchyChangeListener localOnHierarchyChangeListener = this$0.mOnHierarchyChangeListener;
    if (localOnHierarchyChangeListener != null) {
      localOnHierarchyChangeListener.onChildViewAdded(paramView1, paramView2);
    }
  }
  
  public void onChildViewRemoved(View paramView1, View paramView2)
  {
    this$0.onChildViewsChanged(2);
    ViewGroup.OnHierarchyChangeListener localOnHierarchyChangeListener = this$0.mOnHierarchyChangeListener;
    if (localOnHierarchyChangeListener != null) {
      localOnHierarchyChangeListener.onChildViewRemoved(paramView1, paramView2);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.coordinatorlayout.widget.CoordinatorLayout.HierarchyChangeListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */