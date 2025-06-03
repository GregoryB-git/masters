package androidx.recyclerview.widget;

import androidx.annotation.Nullable;

public abstract class DiffUtil$Callback
{
  public abstract boolean areContentsTheSame(int paramInt1, int paramInt2);
  
  public abstract boolean areItemsTheSame(int paramInt1, int paramInt2);
  
  @Nullable
  public Object getChangePayload(int paramInt1, int paramInt2)
  {
    return null;
  }
  
  public abstract int getNewListSize();
  
  public abstract int getOldListSize();
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.DiffUtil.Callback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */