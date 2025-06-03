package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

class RecyclerView$4
  implements ViewInfoStore.ProcessCallback
{
  public RecyclerView$4(RecyclerView paramRecyclerView) {}
  
  public void processAppeared(RecyclerView.ViewHolder paramViewHolder, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo1, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo2)
  {
    this$0.animateAppearance(paramViewHolder, paramItemHolderInfo1, paramItemHolderInfo2);
  }
  
  public void processDisappeared(RecyclerView.ViewHolder paramViewHolder, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo1, @Nullable RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo2)
  {
    this$0.mRecycler.unscrapView(paramViewHolder);
    this$0.animateDisappearance(paramViewHolder, paramItemHolderInfo1, paramItemHolderInfo2);
  }
  
  public void processPersistent(RecyclerView.ViewHolder paramViewHolder, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo1, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo2)
  {
    paramViewHolder.setIsRecyclable(false);
    RecyclerView localRecyclerView = this$0;
    if (mDataSetHasChangedAfterLayout)
    {
      if (mItemAnimator.animateChange(paramViewHolder, paramViewHolder, paramItemHolderInfo1, paramItemHolderInfo2)) {
        this$0.postAnimationRunner();
      }
    }
    else if (mItemAnimator.animatePersistence(paramViewHolder, paramItemHolderInfo1, paramItemHolderInfo2)) {
      this$0.postAnimationRunner();
    }
  }
  
  public void unused(RecyclerView.ViewHolder paramViewHolder)
  {
    RecyclerView localRecyclerView = this$0;
    mLayout.removeAndRecycleView(itemView, mRecycler);
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */