package androidx.recyclerview.widget;

class SnapHelper$1
  extends RecyclerView.OnScrollListener
{
  public boolean mScrolled = false;
  
  public SnapHelper$1(SnapHelper paramSnapHelper) {}
  
  public void onScrollStateChanged(RecyclerView paramRecyclerView, int paramInt)
  {
    super.onScrollStateChanged(paramRecyclerView, paramInt);
    if ((paramInt == 0) && (mScrolled))
    {
      mScrolled = false;
      this$0.snapToTargetExistingView();
    }
  }
  
  public void onScrolled(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    if ((paramInt1 != 0) || (paramInt2 != 0)) {
      mScrolled = true;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.SnapHelper.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */