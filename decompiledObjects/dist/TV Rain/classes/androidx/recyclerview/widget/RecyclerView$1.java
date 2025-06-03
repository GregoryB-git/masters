package androidx.recyclerview.widget;

import android.view.View;

class RecyclerView$1
  implements Runnable
{
  public RecyclerView$1(RecyclerView paramRecyclerView) {}
  
  public void run()
  {
    RecyclerView localRecyclerView = this$0;
    if ((mFirstLayoutComplete) && (!localRecyclerView.isLayoutRequested()))
    {
      localRecyclerView = this$0;
      if (!mIsAttached)
      {
        localRecyclerView.requestLayout();
        return;
      }
      if (mLayoutSuppressed)
      {
        mLayoutWasDefered = true;
        return;
      }
      localRecyclerView.consumePendingUpdateOperations();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */