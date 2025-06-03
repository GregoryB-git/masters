package androidx.viewpager2.widget;

class ViewPager2$2
  extends ViewPager2.OnPageChangeCallback
{
  public ViewPager2$2(ViewPager2 paramViewPager2) {}
  
  public void onPageScrollStateChanged(int paramInt)
  {
    if (paramInt == 0) {
      this$0.updateCurrentItem();
    }
  }
  
  public void onPageSelected(int paramInt)
  {
    ViewPager2 localViewPager2 = this$0;
    if (mCurrentItem != paramInt)
    {
      mCurrentItem = paramInt;
      mAccessibilityProvider.onSetNewCurrentItem();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.viewpager2.widget.ViewPager2.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */