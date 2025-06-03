package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.app.ActionBar.Tab;

class ScrollingTabContainerView$TabAdapter
  extends BaseAdapter
{
  public ScrollingTabContainerView$TabAdapter(ScrollingTabContainerView paramScrollingTabContainerView) {}
  
  public int getCount()
  {
    return this$0.mTabLayout.getChildCount();
  }
  
  public Object getItem(int paramInt)
  {
    return ((ScrollingTabContainerView.TabView)this$0.mTabLayout.getChildAt(paramInt)).getTab();
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null) {
      paramView = this$0.createTabView((ActionBar.Tab)getItem(paramInt), true);
    } else {
      ((ScrollingTabContainerView.TabView)paramView).bindTab((ActionBar.Tab)getItem(paramInt));
    }
    return paramView;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ScrollingTabContainerView.TabAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */