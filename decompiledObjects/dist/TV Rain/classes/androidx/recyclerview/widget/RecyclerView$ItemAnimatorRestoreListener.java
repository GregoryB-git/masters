package androidx.recyclerview.widget;

class RecyclerView$ItemAnimatorRestoreListener
  implements RecyclerView.ItemAnimator.ItemAnimatorListener
{
  public RecyclerView$ItemAnimatorRestoreListener(RecyclerView paramRecyclerView) {}
  
  public void onAnimationFinished(RecyclerView.ViewHolder paramViewHolder)
  {
    paramViewHolder.setIsRecyclable(true);
    if ((mShadowedHolder != null) && (mShadowingHolder == null)) {
      mShadowedHolder = null;
    }
    mShadowingHolder = null;
    if ((!paramViewHolder.shouldBeKeptAsChild()) && (!this$0.removeAnimatingView(itemView)) && (paramViewHolder.isTmpDetached())) {
      this$0.removeDetachedView(itemView, false);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.ItemAnimatorRestoreListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */