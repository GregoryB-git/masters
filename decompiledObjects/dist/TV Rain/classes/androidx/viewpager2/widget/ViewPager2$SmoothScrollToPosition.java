package androidx.viewpager2.widget;

import androidx.recyclerview.widget.RecyclerView;

class ViewPager2$SmoothScrollToPosition
  implements Runnable
{
  private final int mPosition;
  private final RecyclerView mRecyclerView;
  
  public ViewPager2$SmoothScrollToPosition(int paramInt, RecyclerView paramRecyclerView)
  {
    mPosition = paramInt;
    mRecyclerView = paramRecyclerView;
  }
  
  public void run()
  {
    mRecyclerView.smoothScrollToPosition(mPosition);
  }
}

/* Location:
 * Qualified Name:     androidx.viewpager2.widget.ViewPager2.SmoothScrollToPosition
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */