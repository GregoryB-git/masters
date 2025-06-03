package androidx.recyclerview.widget;

import android.view.View;
import androidx.core.view.ViewCompat;

class ItemTouchHelper$1
  implements Runnable
{
  public ItemTouchHelper$1(ItemTouchHelper paramItemTouchHelper) {}
  
  public void run()
  {
    Object localObject = this$0;
    if ((mSelected != null) && (((ItemTouchHelper)localObject).scrollIfNecessary()))
    {
      ItemTouchHelper localItemTouchHelper = this$0;
      localObject = mSelected;
      if (localObject != null) {
        localItemTouchHelper.moveIfNecessary((RecyclerView.ViewHolder)localObject);
      }
      localObject = this$0;
      mRecyclerView.removeCallbacks(mScrollRunnable);
      ViewCompat.postOnAnimation(this$0.mRecyclerView, this);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.ItemTouchHelper.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */