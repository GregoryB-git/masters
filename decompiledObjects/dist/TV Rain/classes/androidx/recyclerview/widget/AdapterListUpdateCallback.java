package androidx.recyclerview.widget;

import androidx.annotation.NonNull;

public final class AdapterListUpdateCallback
  implements ListUpdateCallback
{
  @NonNull
  private final RecyclerView.Adapter mAdapter;
  
  public AdapterListUpdateCallback(@NonNull RecyclerView.Adapter paramAdapter)
  {
    mAdapter = paramAdapter;
  }
  
  public void onChanged(int paramInt1, int paramInt2, Object paramObject)
  {
    mAdapter.notifyItemRangeChanged(paramInt1, paramInt2, paramObject);
  }
  
  public void onInserted(int paramInt1, int paramInt2)
  {
    mAdapter.notifyItemRangeInserted(paramInt1, paramInt2);
  }
  
  public void onMoved(int paramInt1, int paramInt2)
  {
    mAdapter.notifyItemMoved(paramInt1, paramInt2);
  }
  
  public void onRemoved(int paramInt1, int paramInt2)
  {
    mAdapter.notifyItemRangeRemoved(paramInt1, paramInt2);
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.AdapterListUpdateCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */