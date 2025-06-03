package androidx.viewpager.widget;

import androidx.annotation.Px;

public abstract interface ViewPager$OnPageChangeListener
{
  public abstract void onPageScrollStateChanged(int paramInt);
  
  public abstract void onPageScrolled(int paramInt1, float paramFloat, @Px int paramInt2);
  
  public abstract void onPageSelected(int paramInt);
}

/* Location:
 * Qualified Name:     androidx.viewpager.widget.ViewPager.OnPageChangeListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */