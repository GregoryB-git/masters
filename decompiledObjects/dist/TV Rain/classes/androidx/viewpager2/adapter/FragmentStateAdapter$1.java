package androidx.viewpager2.adapter;

import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.widget.FrameLayout;

class FragmentStateAdapter$1
  implements View.OnLayoutChangeListener
{
  public FragmentStateAdapter$1(FragmentStateAdapter paramFragmentStateAdapter, FrameLayout paramFrameLayout, FragmentViewHolder paramFragmentViewHolder) {}
  
  public void onLayoutChange(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    if (val$container.getParent() != null)
    {
      val$container.removeOnLayoutChangeListener(this);
      this$0.placeFragmentInViewHolder(val$holder);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.viewpager2.adapter.FragmentStateAdapter.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */