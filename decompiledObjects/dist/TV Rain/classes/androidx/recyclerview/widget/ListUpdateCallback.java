package androidx.recyclerview.widget;

import androidx.annotation.Nullable;

public abstract interface ListUpdateCallback
{
  public abstract void onChanged(int paramInt1, int paramInt2, @Nullable Object paramObject);
  
  public abstract void onInserted(int paramInt1, int paramInt2);
  
  public abstract void onMoved(int paramInt1, int paramInt2);
  
  public abstract void onRemoved(int paramInt1, int paramInt2);
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.ListUpdateCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */