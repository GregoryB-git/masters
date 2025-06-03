package com.facebook.drawee.gestures;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.facebook.common.internal.VisibleForTesting;

public class GestureDetector
{
  @VisibleForTesting
  public long mActionDownTime;
  @VisibleForTesting
  public float mActionDownX;
  @VisibleForTesting
  public float mActionDownY;
  @VisibleForTesting
  public ClickListener mClickListener;
  @VisibleForTesting
  public boolean mIsCapturingGesture;
  @VisibleForTesting
  public boolean mIsClickCandidate;
  @VisibleForTesting
  public final float mSingleTapSlopPx;
  
  public GestureDetector(Context paramContext)
  {
    mSingleTapSlopPx = ViewConfiguration.get(paramContext).getScaledTouchSlop();
    init();
  }
  
  public static GestureDetector newInstance(Context paramContext)
  {
    return new GestureDetector(paramContext);
  }
  
  public void init()
  {
    mClickListener = null;
    reset();
  }
  
  public boolean isCapturingGesture()
  {
    return mIsCapturingGesture;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction();
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i == 3)
          {
            mIsCapturingGesture = false;
            mIsClickCandidate = false;
          }
        }
        else if ((Math.abs(paramMotionEvent.getX() - mActionDownX) > mSingleTapSlopPx) || (Math.abs(paramMotionEvent.getY() - mActionDownY) > mSingleTapSlopPx)) {
          mIsClickCandidate = false;
        }
      }
      else
      {
        mIsCapturingGesture = false;
        if ((Math.abs(paramMotionEvent.getX() - mActionDownX) > mSingleTapSlopPx) || (Math.abs(paramMotionEvent.getY() - mActionDownY) > mSingleTapSlopPx)) {
          mIsClickCandidate = false;
        }
        if ((mIsClickCandidate) && (paramMotionEvent.getEventTime() - mActionDownTime <= ViewConfiguration.getLongPressTimeout()))
        {
          paramMotionEvent = mClickListener;
          if (paramMotionEvent != null) {
            paramMotionEvent.onClick();
          }
        }
        mIsClickCandidate = false;
      }
    }
    else
    {
      mIsCapturingGesture = true;
      mIsClickCandidate = true;
      mActionDownTime = paramMotionEvent.getEventTime();
      mActionDownX = paramMotionEvent.getX();
      mActionDownY = paramMotionEvent.getY();
    }
    return true;
  }
  
  public void reset()
  {
    mIsCapturingGesture = false;
    mIsClickCandidate = false;
  }
  
  public void setClickListener(ClickListener paramClickListener)
  {
    mClickListener = paramClickListener;
  }
  
  public static abstract interface ClickListener
  {
    public abstract boolean onClick();
  }
}

/* Location:
 * Qualified Name:     com.facebook.drawee.gestures.GestureDetector
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */