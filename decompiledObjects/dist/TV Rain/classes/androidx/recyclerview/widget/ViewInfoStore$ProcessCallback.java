package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

abstract interface ViewInfoStore$ProcessCallback
{
  public abstract void processAppeared(RecyclerView.ViewHolder paramViewHolder, @Nullable RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo1, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo2);
  
  public abstract void processDisappeared(RecyclerView.ViewHolder paramViewHolder, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo1, @Nullable RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo2);
  
  public abstract void processPersistent(RecyclerView.ViewHolder paramViewHolder, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo1, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo2);
  
  public abstract void unused(RecyclerView.ViewHolder paramViewHolder);
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.ViewInfoStore.ProcessCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */