package androidx.recyclerview.widget;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.GestureDetectorCompat;
import java.util.List;

class ItemTouchHelper$2
  implements RecyclerView.OnItemTouchListener
{
  public ItemTouchHelper$2(ItemTouchHelper paramItemTouchHelper) {}
  
  public boolean onInterceptTouchEvent(@NonNull RecyclerView paramRecyclerView, @NonNull MotionEvent paramMotionEvent)
  {
    this$0.mGestureDetector.onTouchEvent(paramMotionEvent);
    int i = paramMotionEvent.getActionMasked();
    boolean bool = true;
    if (i == 0)
    {
      this$0.mActivePointerId = paramMotionEvent.getPointerId(0);
      this$0.mInitialTouchX = paramMotionEvent.getX();
      this$0.mInitialTouchY = paramMotionEvent.getY();
      this$0.obtainVelocityTracker();
      paramRecyclerView = this$0;
      if (mSelected == null)
      {
        paramRecyclerView = paramRecyclerView.findAnimation(paramMotionEvent);
        if (paramRecyclerView != null)
        {
          ItemTouchHelper localItemTouchHelper = this$0;
          mInitialTouchX -= mX;
          mInitialTouchY -= mY;
          localItemTouchHelper.endRecoverAnimation(mViewHolder, true);
          if (this$0.mPendingCleanup.remove(mViewHolder.itemView))
          {
            localItemTouchHelper = this$0;
            mCallback.clearView(mRecyclerView, mViewHolder);
          }
          this$0.select(mViewHolder, mActionState);
          paramRecyclerView = this$0;
          paramRecyclerView.updateDxDy(paramMotionEvent, mSelectedFlags, 0);
        }
      }
    }
    else if ((i != 3) && (i != 1))
    {
      int j = this$0.mActivePointerId;
      if (j != -1)
      {
        j = paramMotionEvent.findPointerIndex(j);
        if (j >= 0) {
          this$0.checkSelectForSwipe(i, paramMotionEvent, j);
        }
      }
    }
    else
    {
      paramRecyclerView = this$0;
      mActivePointerId = -1;
      paramRecyclerView.select(null, 0);
    }
    paramRecyclerView = this$0.mVelocityTracker;
    if (paramRecyclerView != null) {
      paramRecyclerView.addMovement(paramMotionEvent);
    }
    if (this$0.mSelected == null) {
      bool = false;
    }
    return bool;
  }
  
  public void onRequestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    if (!paramBoolean) {
      return;
    }
    this$0.select(null, 0);
  }
  
  public void onTouchEvent(@NonNull RecyclerView paramRecyclerView, @NonNull MotionEvent paramMotionEvent)
  {
    this$0.mGestureDetector.onTouchEvent(paramMotionEvent);
    paramRecyclerView = this$0.mVelocityTracker;
    if (paramRecyclerView != null) {
      paramRecyclerView.addMovement(paramMotionEvent);
    }
    if (this$0.mActivePointerId == -1) {
      return;
    }
    int i = paramMotionEvent.getActionMasked();
    int j = paramMotionEvent.findPointerIndex(this$0.mActivePointerId);
    if (j >= 0) {
      this$0.checkSelectForSwipe(i, paramMotionEvent, j);
    }
    paramRecyclerView = this$0;
    RecyclerView.ViewHolder localViewHolder = mSelected;
    if (localViewHolder == null) {
      return;
    }
    int k = 0;
    if (i != 1) {
      if (i != 2)
      {
        if (i != 3)
        {
          if (i != 6) {
            return;
          }
          j = paramMotionEvent.getActionIndex();
          i = paramMotionEvent.getPointerId(j);
          paramRecyclerView = this$0;
          if (i != mActivePointerId) {
            return;
          }
          if (j == 0) {
            k = 1;
          }
          mActivePointerId = paramMotionEvent.getPointerId(k);
          paramRecyclerView = this$0;
          paramRecyclerView.updateDxDy(paramMotionEvent, mSelectedFlags, j);
          return;
        }
        paramRecyclerView = mVelocityTracker;
        if (paramRecyclerView != null) {
          paramRecyclerView.clear();
        }
      }
      else
      {
        if (j < 0) {
          return;
        }
        paramRecyclerView.updateDxDy(paramMotionEvent, mSelectedFlags, j);
        this$0.moveIfNecessary(localViewHolder);
        paramRecyclerView = this$0;
        mRecyclerView.removeCallbacks(mScrollRunnable);
        this$0.mScrollRunnable.run();
        this$0.mRecyclerView.invalidate();
        return;
      }
    }
    this$0.select(null, 0);
    this$0.mActivePointerId = -1;
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.ItemTouchHelper.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */