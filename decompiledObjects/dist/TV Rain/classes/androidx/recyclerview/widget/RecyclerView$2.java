package androidx.recyclerview.widget;

class RecyclerView$2
  implements Runnable
{
  public RecyclerView$2(RecyclerView paramRecyclerView) {}
  
  public void run()
  {
    RecyclerView.ItemAnimator localItemAnimator = this$0.mItemAnimator;
    if (localItemAnimator != null) {
      localItemAnimator.runPendingAnimations();
    }
    this$0.mPostedAnimatorRunner = false;
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */