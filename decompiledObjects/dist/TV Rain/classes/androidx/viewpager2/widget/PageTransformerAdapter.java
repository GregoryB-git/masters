package androidx.viewpager2.widget;

import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import java.util.Locale;

final class PageTransformerAdapter
  extends ViewPager2.OnPageChangeCallback
{
  private final LinearLayoutManager mLayoutManager;
  private ViewPager2.PageTransformer mPageTransformer;
  
  public PageTransformerAdapter(LinearLayoutManager paramLinearLayoutManager)
  {
    mLayoutManager = paramLinearLayoutManager;
  }
  
  public ViewPager2.PageTransformer getPageTransformer()
  {
    return mPageTransformer;
  }
  
  public void onPageScrollStateChanged(int paramInt) {}
  
  public void onPageScrolled(int paramInt1, float paramFloat, int paramInt2)
  {
    if (mPageTransformer == null) {
      return;
    }
    float f = -paramFloat;
    paramInt2 = 0;
    while (paramInt2 < mLayoutManager.getChildCount())
    {
      View localView = mLayoutManager.getChildAt(paramInt2);
      if (localView != null)
      {
        paramFloat = mLayoutManager.getPosition(localView) - paramInt1;
        mPageTransformer.transformPage(localView, paramFloat + f);
        paramInt2++;
      }
      else
      {
        throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(mLayoutManager.getChildCount()) }));
      }
    }
  }
  
  public void onPageSelected(int paramInt) {}
  
  public void setPageTransformer(@Nullable ViewPager2.PageTransformer paramPageTransformer)
  {
    mPageTransformer = paramPageTransformer;
  }
}

/* Location:
 * Qualified Name:     androidx.viewpager2.widget.PageTransformerAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */