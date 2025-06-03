package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener;

class ViewPager2$4
  implements RecyclerView.OnChildAttachStateChangeListener
{
  public ViewPager2$4(ViewPager2 paramViewPager2) {}
  
  public void onChildViewAttachedToWindow(@NonNull View paramView)
  {
    paramView = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    if ((width == -1) && (height == -1)) {
      return;
    }
    throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
  }
  
  public void onChildViewDetachedFromWindow(@NonNull View paramView) {}
}

/* Location:
 * Qualified Name:     androidx.viewpager2.widget.ViewPager2.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */