package androidx.appcompat.widget;

import android.view.View;
import android.widget.HorizontalScrollView;

class ScrollingTabContainerView$1
  implements Runnable
{
  public ScrollingTabContainerView$1(ScrollingTabContainerView paramScrollingTabContainerView, View paramView) {}
  
  public void run()
  {
    int i = val$tabView.getLeft();
    int j = (this$0.getWidth() - val$tabView.getWidth()) / 2;
    this$0.smoothScrollTo(i - j, 0);
    this$0.mTabSelector = null;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ScrollingTabContainerView.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */