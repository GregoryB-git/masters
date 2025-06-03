package androidx.recyclerview.widget;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;

class ItemTouchHelper$ItemTouchHelperGestureListener
  extends GestureDetector.SimpleOnGestureListener
{
  private boolean mShouldReactToLongPress = true;
  
  public ItemTouchHelper$ItemTouchHelperGestureListener(ItemTouchHelper paramItemTouchHelper) {}
  
  public void doNotReactToLongPress()
  {
    mShouldReactToLongPress = false;
  }
  
  public boolean onDown(MotionEvent paramMotionEvent)
  {
    return true;
  }
  
  public void onLongPress(MotionEvent paramMotionEvent)
  {
    if (!mShouldReactToLongPress) {
      return;
    }
    Object localObject = this$0.findChildView(paramMotionEvent);
    if (localObject != null)
    {
      localObject = this$0.mRecyclerView.getChildViewHolder((View)localObject);
      if (localObject != null)
      {
        ItemTouchHelper localItemTouchHelper = this$0;
        if (!mCallback.hasDragFlag(mRecyclerView, (RecyclerView.ViewHolder)localObject)) {
          return;
        }
        int i = paramMotionEvent.getPointerId(0);
        int j = this$0.mActivePointerId;
        if (i == j)
        {
          j = paramMotionEvent.findPointerIndex(j);
          float f1 = paramMotionEvent.getX(j);
          float f2 = paramMotionEvent.getY(j);
          paramMotionEvent = this$0;
          mInitialTouchX = f1;
          mInitialTouchY = f2;
          mDy = 0.0F;
          mDx = 0.0F;
          if (mCallback.isLongPressDragEnabled()) {
            this$0.select((RecyclerView.ViewHolder)localObject, 2);
          }
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.ItemTouchHelper.ItemTouchHelperGestureListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */