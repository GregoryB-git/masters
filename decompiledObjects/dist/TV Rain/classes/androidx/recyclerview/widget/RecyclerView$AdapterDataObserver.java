package androidx.recyclerview.widget;

import androidx.annotation.Nullable;

public abstract class RecyclerView$AdapterDataObserver
{
  public void onChanged() {}
  
  public void onItemRangeChanged(int paramInt1, int paramInt2) {}
  
  public void onItemRangeChanged(int paramInt1, int paramInt2, @Nullable Object paramObject)
  {
    onItemRangeChanged(paramInt1, paramInt2);
  }
  
  public void onItemRangeInserted(int paramInt1, int paramInt2) {}
  
  public void onItemRangeMoved(int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onItemRangeRemoved(int paramInt1, int paramInt2) {}
  
  public void onStateRestorationPolicyChanged() {}
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */