package androidx.viewpager2.widget;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView.AdapterDataObserver;

abstract class ViewPager2$DataSetChangeObserver
  extends RecyclerView.AdapterDataObserver
{
  public abstract void onChanged();
  
  public final void onItemRangeChanged(int paramInt1, int paramInt2)
  {
    onChanged();
  }
  
  public final void onItemRangeChanged(int paramInt1, int paramInt2, @Nullable Object paramObject)
  {
    onChanged();
  }
  
  public final void onItemRangeInserted(int paramInt1, int paramInt2)
  {
    onChanged();
  }
  
  public final void onItemRangeMoved(int paramInt1, int paramInt2, int paramInt3)
  {
    onChanged();
  }
  
  public final void onItemRangeRemoved(int paramInt1, int paramInt2)
  {
    onChanged();
  }
}

/* Location:
 * Qualified Name:     androidx.viewpager2.widget.ViewPager2.DataSetChangeObserver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */