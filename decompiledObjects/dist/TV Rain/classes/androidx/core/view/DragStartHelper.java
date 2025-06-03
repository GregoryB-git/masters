package androidx.core.view;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import androidx.annotation.NonNull;
import d1;
import e1;

public class DragStartHelper
{
  private boolean mDragging;
  private int mLastTouchX;
  private int mLastTouchY;
  private final OnDragStartListener mListener;
  private final View.OnLongClickListener mLongClickListener = new d1(this);
  private final View.OnTouchListener mTouchListener = new e1(this);
  private final View mView;
  
  public DragStartHelper(@NonNull View paramView, @NonNull OnDragStartListener paramOnDragStartListener)
  {
    mView = paramView;
    mListener = paramOnDragStartListener;
  }
  
  public void attach()
  {
    mView.setOnLongClickListener(mLongClickListener);
    mView.setOnTouchListener(mTouchListener);
  }
  
  public void detach()
  {
    mView.setOnLongClickListener(null);
    mView.setOnTouchListener(null);
  }
  
  public void getTouchPosition(@NonNull Point paramPoint)
  {
    paramPoint.set(mLastTouchX, mLastTouchY);
  }
  
  public boolean onLongClick(@NonNull View paramView)
  {
    return mListener.onDragStart(paramView, this);
  }
  
  public boolean onTouch(@NonNull View paramView, @NonNull MotionEvent paramMotionEvent)
  {
    int i = (int)paramMotionEvent.getX();
    int j = (int)paramMotionEvent.getY();
    int k = paramMotionEvent.getAction();
    if (k != 0)
    {
      if (k != 1) {
        if (k != 2)
        {
          if (k != 3) {
            break label149;
          }
        }
        else
        {
          if ((!MotionEventCompat.isFromSource(paramMotionEvent, 8194)) || ((paramMotionEvent.getButtonState() & 0x1) == 0) || (mDragging) || ((mLastTouchX == i) && (mLastTouchY == j))) {
            break label149;
          }
          mLastTouchX = i;
          mLastTouchY = j;
          boolean bool = mListener.onDragStart(paramView, this);
          mDragging = bool;
          return bool;
        }
      }
      mDragging = false;
    }
    else
    {
      mLastTouchX = i;
      mLastTouchY = j;
    }
    label149:
    return false;
  }
  
  public static abstract interface OnDragStartListener
  {
    public abstract boolean onDragStart(@NonNull View paramView, @NonNull DragStartHelper paramDragStartHelper);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.DragStartHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */