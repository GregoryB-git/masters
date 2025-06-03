package androidx.recyclerview.widget;

class FastScroller$2
  extends RecyclerView.OnScrollListener
{
  public FastScroller$2(FastScroller paramFastScroller) {}
  
  public void onScrolled(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    this$0.updateScrollPosition(paramRecyclerView.computeHorizontalScrollOffset(), paramRecyclerView.computeVerticalScrollOffset());
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.FastScroller.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */