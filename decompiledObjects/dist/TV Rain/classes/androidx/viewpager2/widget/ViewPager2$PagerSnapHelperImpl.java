package androidx.viewpager2.widget;

import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;

class ViewPager2$PagerSnapHelperImpl
  extends PagerSnapHelper
{
  public ViewPager2$PagerSnapHelperImpl(ViewPager2 paramViewPager2) {}
  
  @Nullable
  public View findSnapView(RecyclerView.LayoutManager paramLayoutManager)
  {
    if (this$0.isFakeDragging()) {
      paramLayoutManager = null;
    } else {
      paramLayoutManager = super.findSnapView(paramLayoutManager);
    }
    return paramLayoutManager;
  }
}

/* Location:
 * Qualified Name:     androidx.viewpager2.widget.ViewPager2.PagerSnapHelperImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */