package androidx.appcompat.widget;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.appcompat.app.ActionBar.Tab;

class ScrollingTabContainerView$TabClickListener
  implements View.OnClickListener
{
  public ScrollingTabContainerView$TabClickListener(ScrollingTabContainerView paramScrollingTabContainerView) {}
  
  public void onClick(View paramView)
  {
    ((ScrollingTabContainerView.TabView)paramView).getTab().select();
    int i = this$0.mTabLayout.getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = this$0.mTabLayout.getChildAt(j);
      boolean bool;
      if (localView == paramView) {
        bool = true;
      } else {
        bool = false;
      }
      localView.setSelected(bool);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ScrollingTabContainerView.TabClickListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */