package androidx.coordinatorlayout.widget;

import android.view.ViewTreeObserver.OnPreDrawListener;

class CoordinatorLayout$OnPreDrawListener
  implements ViewTreeObserver.OnPreDrawListener
{
  public CoordinatorLayout$OnPreDrawListener(CoordinatorLayout paramCoordinatorLayout) {}
  
  public boolean onPreDraw()
  {
    this$0.onChildViewsChanged(0);
    return true;
  }
}

/* Location:
 * Qualified Name:     androidx.coordinatorlayout.widget.CoordinatorLayout.OnPreDrawListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */