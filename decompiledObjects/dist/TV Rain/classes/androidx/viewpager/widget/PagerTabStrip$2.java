package androidx.viewpager.widget;

import android.view.View;
import android.view.View.OnClickListener;

class PagerTabStrip$2
  implements View.OnClickListener
{
  public PagerTabStrip$2(PagerTabStrip paramPagerTabStrip) {}
  
  public void onClick(View paramView)
  {
    paramView = this$0.mPager;
    paramView.setCurrentItem(paramView.getCurrentItem() + 1);
  }
}

/* Location:
 * Qualified Name:     androidx.viewpager.widget.PagerTabStrip.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */