package androidx.viewpager2.widget;

import android.view.View;

class ViewPager2$3
  extends ViewPager2.OnPageChangeCallback
{
  public ViewPager2$3(ViewPager2 paramViewPager2) {}
  
  public void onPageSelected(int paramInt)
  {
    this$0.clearFocus();
    if (this$0.hasFocus()) {
      this$0.mRecyclerView.requestFocus(2);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.viewpager2.widget.ViewPager2.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */