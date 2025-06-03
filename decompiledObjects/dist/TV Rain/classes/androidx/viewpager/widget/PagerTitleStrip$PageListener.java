package androidx.viewpager.widget;

import android.database.DataSetObserver;

class PagerTitleStrip$PageListener
  extends DataSetObserver
  implements ViewPager.OnPageChangeListener, ViewPager.OnAdapterChangeListener
{
  private int mScrollState;
  
  public PagerTitleStrip$PageListener(PagerTitleStrip paramPagerTitleStrip) {}
  
  public void onAdapterChanged(ViewPager paramViewPager, PagerAdapter paramPagerAdapter1, PagerAdapter paramPagerAdapter2)
  {
    this$0.updateAdapter(paramPagerAdapter1, paramPagerAdapter2);
  }
  
  public void onChanged()
  {
    PagerTitleStrip localPagerTitleStrip = this$0;
    localPagerTitleStrip.updateText(mPager.getCurrentItem(), this$0.mPager.getAdapter());
    localPagerTitleStrip = this$0;
    float f = mLastKnownPositionOffset;
    if (f < 0.0F) {
      f = 0.0F;
    }
    localPagerTitleStrip.updateTextPositions(mPager.getCurrentItem(), f, true);
  }
  
  public void onPageScrollStateChanged(int paramInt)
  {
    mScrollState = paramInt;
  }
  
  public void onPageScrolled(int paramInt1, float paramFloat, int paramInt2)
  {
    paramInt2 = paramInt1;
    if (paramFloat > 0.5F) {
      paramInt2 = paramInt1 + 1;
    }
    this$0.updateTextPositions(paramInt2, paramFloat, false);
  }
  
  public void onPageSelected(int paramInt)
  {
    if (mScrollState == 0)
    {
      PagerTitleStrip localPagerTitleStrip = this$0;
      localPagerTitleStrip.updateText(mPager.getCurrentItem(), this$0.mPager.getAdapter());
      localPagerTitleStrip = this$0;
      float f = mLastKnownPositionOffset;
      if (f < 0.0F) {
        f = 0.0F;
      }
      localPagerTitleStrip.updateTextPositions(mPager.getCurrentItem(), f, true);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.viewpager.widget.PagerTitleStrip.PageListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */