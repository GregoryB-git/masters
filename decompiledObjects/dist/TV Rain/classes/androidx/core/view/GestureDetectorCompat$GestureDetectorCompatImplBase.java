package androidx.core.view;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

class GestureDetectorCompat$GestureDetectorCompatImplBase
  implements GestureDetectorCompat.GestureDetectorCompatImpl
{
  private static final int DOUBLE_TAP_TIMEOUT = ViewConfiguration.getDoubleTapTimeout();
  private static final int LONG_PRESS = 2;
  private static final int SHOW_PRESS = 1;
  private static final int TAP = 3;
  private static final int TAP_TIMEOUT = ;
  private boolean mAlwaysInBiggerTapRegion;
  private boolean mAlwaysInTapRegion;
  public MotionEvent mCurrentDownEvent;
  public boolean mDeferConfirmSingleTap;
  public GestureDetector.OnDoubleTapListener mDoubleTapListener;
  private int mDoubleTapSlopSquare;
  private float mDownFocusX;
  private float mDownFocusY;
  private final Handler mHandler;
  private boolean mInLongPress;
  private boolean mIsDoubleTapping;
  private boolean mIsLongpressEnabled;
  private float mLastFocusX;
  private float mLastFocusY;
  public final GestureDetector.OnGestureListener mListener;
  private int mMaximumFlingVelocity;
  private int mMinimumFlingVelocity;
  private MotionEvent mPreviousUpEvent;
  public boolean mStillDown;
  private int mTouchSlopSquare;
  private VelocityTracker mVelocityTracker;
  
  public GestureDetectorCompat$GestureDetectorCompatImplBase(Context paramContext, GestureDetector.OnGestureListener paramOnGestureListener, Handler paramHandler)
  {
    if (paramHandler != null) {
      mHandler = new GestureHandler(paramHandler);
    } else {
      mHandler = new GestureHandler();
    }
    mListener = paramOnGestureListener;
    if ((paramOnGestureListener instanceof GestureDetector.OnDoubleTapListener)) {
      setOnDoubleTapListener((GestureDetector.OnDoubleTapListener)paramOnGestureListener);
    }
    init(paramContext);
  }
  
  private void cancel()
  {
    mHandler.removeMessages(1);
    mHandler.removeMessages(2);
    mHandler.removeMessages(3);
    mVelocityTracker.recycle();
    mVelocityTracker = null;
    mIsDoubleTapping = false;
    mStillDown = false;
    mAlwaysInTapRegion = false;
    mAlwaysInBiggerTapRegion = false;
    mDeferConfirmSingleTap = false;
    if (mInLongPress) {
      mInLongPress = false;
    }
  }
  
  private void cancelTaps()
  {
    mHandler.removeMessages(1);
    mHandler.removeMessages(2);
    mHandler.removeMessages(3);
    mIsDoubleTapping = false;
    mAlwaysInTapRegion = false;
    mAlwaysInBiggerTapRegion = false;
    mDeferConfirmSingleTap = false;
    if (mInLongPress) {
      mInLongPress = false;
    }
  }
  
  private void init(Context paramContext)
  {
    if (paramContext != null)
    {
      if (mListener != null)
      {
        mIsLongpressEnabled = true;
        paramContext = ViewConfiguration.get(paramContext);
        int i = paramContext.getScaledTouchSlop();
        int j = paramContext.getScaledDoubleTapSlop();
        mMinimumFlingVelocity = paramContext.getScaledMinimumFlingVelocity();
        mMaximumFlingVelocity = paramContext.getScaledMaximumFlingVelocity();
        mTouchSlopSquare = (i * i);
        mDoubleTapSlopSquare = (j * j);
        return;
      }
      throw new IllegalArgumentException("OnGestureListener must not be null");
    }
    throw new IllegalArgumentException("Context must not be null");
  }
  
  private boolean isConsideredDoubleTap(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, MotionEvent paramMotionEvent3)
  {
    boolean bool1 = mAlwaysInBiggerTapRegion;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    if (paramMotionEvent3.getEventTime() - paramMotionEvent2.getEventTime() > DOUBLE_TAP_TIMEOUT) {
      return false;
    }
    int i = (int)paramMotionEvent1.getX() - (int)paramMotionEvent3.getX();
    int j = (int)paramMotionEvent1.getY() - (int)paramMotionEvent3.getY();
    if (j * j + i * i < mDoubleTapSlopSquare) {
      bool2 = true;
    }
    return bool2;
  }
  
  public void dispatchLongPress()
  {
    mHandler.removeMessages(3);
    mDeferConfirmSingleTap = false;
    mInLongPress = true;
    mListener.onLongPress(mCurrentDownEvent);
  }
  
  public boolean isLongpressEnabled()
  {
    return mIsLongpressEnabled;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction();
    if (mVelocityTracker == null) {
      mVelocityTracker = VelocityTracker.obtain();
    }
    mVelocityTracker.addMovement(paramMotionEvent);
    int j = i & 0xFF;
    boolean bool2 = false;
    if (j == 6) {
      i = 1;
    } else {
      i = 0;
    }
    int k;
    if (i != 0) {
      k = paramMotionEvent.getActionIndex();
    } else {
      k = -1;
    }
    int m = paramMotionEvent.getPointerCount();
    int n = 0;
    float f1 = 0.0F;
    float f2 = f1;
    while (n < m)
    {
      if (k != n)
      {
        f1 += paramMotionEvent.getX(n);
        f2 += paramMotionEvent.getY(n);
      }
      n++;
    }
    if (i != 0) {
      i = m - 1;
    } else {
      i = m;
    }
    float f3 = i;
    f1 /= f3;
    f2 /= f3;
    boolean bool3;
    MotionEvent localMotionEvent;
    Object localObject;
    if (j != 0)
    {
      if (j != 1)
      {
        if (j != 2)
        {
          if (j != 3)
          {
            if (j != 5)
            {
              if (j != 6)
              {
                bool3 = bool2;
                break label1185;
              }
              mLastFocusX = f1;
              mDownFocusX = f1;
              mLastFocusY = f2;
              mDownFocusY = f2;
              mVelocityTracker.computeCurrentVelocity(1000, mMaximumFlingVelocity);
              k = paramMotionEvent.getActionIndex();
              i = paramMotionEvent.getPointerId(k);
              f1 = mVelocityTracker.getXVelocity(i);
              f3 = mVelocityTracker.getYVelocity(i);
              for (i = 0;; i++)
              {
                bool3 = bool2;
                if (i >= m) {
                  break;
                }
                if (i != k)
                {
                  n = paramMotionEvent.getPointerId(i);
                  f2 = mVelocityTracker.getXVelocity(n);
                  if (mVelocityTracker.getYVelocity(n) * f3 + f2 * f1 < 0.0F)
                  {
                    mVelocityTracker.clear();
                    bool3 = bool2;
                    break;
                  }
                }
              }
            }
            mLastFocusX = f1;
            mDownFocusX = f1;
            mLastFocusY = f2;
            mDownFocusY = f2;
            cancelTaps();
            bool3 = bool2;
            break label1185;
          }
          cancel();
          bool3 = bool2;
          break label1185;
        }
        if (mInLongPress)
        {
          bool3 = bool2;
          break label1185;
        }
        f3 = mLastFocusX - f1;
        float f4 = mLastFocusY - f2;
        if (mIsDoubleTapping)
        {
          bool3 = false | mDoubleTapListener.onDoubleTapEvent(paramMotionEvent);
          break label1185;
        }
        if (mAlwaysInTapRegion)
        {
          i = (int)(f1 - mDownFocusX);
          k = (int)(f2 - mDownFocusY);
          i = k * k + i * i;
          if (i > mTouchSlopSquare)
          {
            bool2 = mListener.onScroll(mCurrentDownEvent, paramMotionEvent, f3, f4);
            mLastFocusX = f1;
            mLastFocusY = f2;
            mAlwaysInTapRegion = false;
            mHandler.removeMessages(3);
            mHandler.removeMessages(1);
            mHandler.removeMessages(2);
          }
          else
          {
            bool2 = false;
          }
          bool3 = bool2;
          if (i > mTouchSlopSquare)
          {
            mAlwaysInBiggerTapRegion = false;
            bool3 = bool2;
          }
        }
        else
        {
          if (Math.abs(f3) < 1.0F)
          {
            bool3 = bool2;
            if (Math.abs(f4) < 1.0F) {
              break label1185;
            }
          }
          bool3 = mListener.onScroll(mCurrentDownEvent, paramMotionEvent, f3, f4);
          mLastFocusX = f1;
          mLastFocusY = f2;
          break label1185;
        }
      }
      else
      {
        mStillDown = false;
        localMotionEvent = MotionEvent.obtain(paramMotionEvent);
        if (mIsDoubleTapping)
        {
          bool3 = mDoubleTapListener.onDoubleTapEvent(paramMotionEvent) | false;
        }
        else
        {
          if (mInLongPress)
          {
            mHandler.removeMessages(3);
            mInLongPress = false;
          }
          else
          {
            if (mAlwaysInTapRegion)
            {
              bool3 = mListener.onSingleTapUp(paramMotionEvent);
              if (mDeferConfirmSingleTap)
              {
                localObject = mDoubleTapListener;
                if (localObject != null) {
                  ((GestureDetector.OnDoubleTapListener)localObject).onSingleTapConfirmed(paramMotionEvent);
                }
              }
              break label851;
            }
            localObject = mVelocityTracker;
            i = paramMotionEvent.getPointerId(0);
            ((VelocityTracker)localObject).computeCurrentVelocity(1000, mMaximumFlingVelocity);
            f1 = ((VelocityTracker)localObject).getYVelocity(i);
            f2 = ((VelocityTracker)localObject).getXVelocity(i);
            if ((Math.abs(f1) > mMinimumFlingVelocity) || (Math.abs(f2) > mMinimumFlingVelocity)) {
              break label831;
            }
          }
          bool3 = false;
          break label851;
          label831:
          bool3 = mListener.onFling(mCurrentDownEvent, paramMotionEvent, f2, f1);
        }
        label851:
        paramMotionEvent = mPreviousUpEvent;
        if (paramMotionEvent != null) {
          paramMotionEvent.recycle();
        }
        mPreviousUpEvent = localMotionEvent;
        paramMotionEvent = mVelocityTracker;
        if (paramMotionEvent != null)
        {
          paramMotionEvent.recycle();
          mVelocityTracker = null;
        }
        mIsDoubleTapping = false;
        mDeferConfirmSingleTap = false;
        mHandler.removeMessages(1);
        mHandler.removeMessages(2);
      }
    }
    else
    {
      boolean bool1;
      if (mDoubleTapListener != null)
      {
        bool3 = mHandler.hasMessages(3);
        if (bool3) {
          mHandler.removeMessages(3);
        }
        localObject = mCurrentDownEvent;
        if (localObject != null)
        {
          localMotionEvent = mPreviousUpEvent;
          if ((localMotionEvent != null) && (bool3) && (isConsideredDoubleTap((MotionEvent)localObject, localMotionEvent, paramMotionEvent)))
          {
            mIsDoubleTapping = true;
            bool1 = mDoubleTapListener.onDoubleTap(mCurrentDownEvent) | false | mDoubleTapListener.onDoubleTapEvent(paramMotionEvent);
            break label1036;
          }
        }
        mHandler.sendEmptyMessageDelayed(3, DOUBLE_TAP_TIMEOUT);
      }
      else
      {
        bool1 = false;
      }
      label1036:
      mLastFocusX = f1;
      mDownFocusX = f1;
      mLastFocusY = f2;
      mDownFocusY = f2;
      localMotionEvent = mCurrentDownEvent;
      if (localMotionEvent != null) {
        localMotionEvent.recycle();
      }
      mCurrentDownEvent = MotionEvent.obtain(paramMotionEvent);
      mAlwaysInTapRegion = true;
      mAlwaysInBiggerTapRegion = true;
      mStillDown = true;
      mInLongPress = false;
      mDeferConfirmSingleTap = false;
      if (mIsLongpressEnabled)
      {
        mHandler.removeMessages(2);
        mHandler.sendEmptyMessageAtTime(2, mCurrentDownEvent.getDownTime() + TAP_TIMEOUT + ViewConfiguration.getLongPressTimeout());
      }
      mHandler.sendEmptyMessageAtTime(1, mCurrentDownEvent.getDownTime() + TAP_TIMEOUT);
      bool3 = bool1 | mListener.onDown(paramMotionEvent);
    }
    label1185:
    return bool3;
  }
  
  public void setIsLongpressEnabled(boolean paramBoolean)
  {
    mIsLongpressEnabled = paramBoolean;
  }
  
  public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener paramOnDoubleTapListener)
  {
    mDoubleTapListener = paramOnDoubleTapListener;
  }
  
  public class GestureHandler
    extends Handler
  {
    public GestureHandler() {}
    
    public GestureHandler(Handler paramHandler)
    {
      super();
    }
    
    public void handleMessage(Message paramMessage)
    {
      int i = what;
      if (i != 1)
      {
        if (i != 2)
        {
          Object localObject;
          if (i == 3)
          {
            localObject = GestureDetectorCompat.GestureDetectorCompatImplBase.this;
            paramMessage = mDoubleTapListener;
            if (paramMessage != null) {
              if (!mStillDown) {
                paramMessage.onSingleTapConfirmed(mCurrentDownEvent);
              } else {
                mDeferConfirmSingleTap = true;
              }
            }
          }
          else
          {
            localObject = new StringBuilder();
            ((StringBuilder)localObject).append("Unknown message ");
            ((StringBuilder)localObject).append(paramMessage);
            throw new RuntimeException(((StringBuilder)localObject).toString());
          }
        }
        else
        {
          dispatchLongPress();
        }
      }
      else
      {
        paramMessage = GestureDetectorCompat.GestureDetectorCompatImplBase.this;
        mListener.onShowPress(mCurrentDownEvent);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.GestureDetectorCompat.GestureDetectorCompatImplBase
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */