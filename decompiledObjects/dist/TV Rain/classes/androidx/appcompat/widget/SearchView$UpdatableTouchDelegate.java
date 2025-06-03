package androidx.appcompat.widget;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

class SearchView$UpdatableTouchDelegate
  extends TouchDelegate
{
  private final Rect mActualBounds;
  private boolean mDelegateTargeted;
  private final View mDelegateView;
  private final int mSlop;
  private final Rect mSlopBounds;
  private final Rect mTargetBounds;
  
  public SearchView$UpdatableTouchDelegate(Rect paramRect1, Rect paramRect2, View paramView)
  {
    super(paramRect1, paramView);
    mSlop = ViewConfiguration.get(paramView.getContext()).getScaledTouchSlop();
    mTargetBounds = new Rect();
    mSlopBounds = new Rect();
    mActualBounds = new Rect();
    setBounds(paramRect1, paramRect2);
    mDelegateView = paramView;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = (int)paramMotionEvent.getX();
    int j = (int)paramMotionEvent.getY();
    int k = paramMotionEvent.getAction();
    boolean bool1 = true;
    boolean bool2 = false;
    if (k != 0)
    {
      if ((k != 1) && (k != 2))
      {
        if (k != 3) {
          break label134;
        }
        bool1 = mDelegateTargeted;
        mDelegateTargeted = false;
      }
      else
      {
        bool3 = mDelegateTargeted;
        bool1 = bool3;
        if (bool3)
        {
          bool1 = bool3;
          if (!mSlopBounds.contains(i, j))
          {
            bool1 = bool3;
            k = 0;
            break label140;
          }
        }
      }
      k = 1;
      break label140;
    }
    else if (mTargetBounds.contains(i, j))
    {
      mDelegateTargeted = true;
      k = 1;
      break label140;
    }
    label134:
    k = 1;
    bool1 = false;
    label140:
    boolean bool3 = bool2;
    if (bool1)
    {
      if ((k != 0) && (!mActualBounds.contains(i, j)))
      {
        paramMotionEvent.setLocation(mDelegateView.getWidth() / 2, mDelegateView.getHeight() / 2);
      }
      else
      {
        Rect localRect = mActualBounds;
        paramMotionEvent.setLocation(i - left, j - top);
      }
      bool3 = mDelegateView.dispatchTouchEvent(paramMotionEvent);
    }
    return bool3;
  }
  
  public void setBounds(Rect paramRect1, Rect paramRect2)
  {
    mTargetBounds.set(paramRect1);
    mSlopBounds.set(paramRect1);
    paramRect1 = mSlopBounds;
    int i = mSlop;
    paramRect1.inset(-i, -i);
    mActualBounds.set(paramRect2);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.SearchView.UpdatableTouchDelegate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */