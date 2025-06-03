package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;

class ItemTouchHelper$5
  implements RecyclerView.ChildDrawingOrderCallback
{
  public ItemTouchHelper$5(ItemTouchHelper paramItemTouchHelper) {}
  
  public int onGetChildDrawingOrder(int paramInt1, int paramInt2)
  {
    ItemTouchHelper localItemTouchHelper = this$0;
    View localView = mOverdrawChild;
    if (localView == null) {
      return paramInt2;
    }
    int i = mOverdrawChildPosition;
    int j = i;
    if (i == -1)
    {
      j = mRecyclerView.indexOfChild(localView);
      this$0.mOverdrawChildPosition = j;
    }
    if (paramInt2 == paramInt1 - 1) {
      return j;
    }
    if (paramInt2 >= j) {
      paramInt2++;
    }
    return paramInt2;
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.ItemTouchHelper.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */