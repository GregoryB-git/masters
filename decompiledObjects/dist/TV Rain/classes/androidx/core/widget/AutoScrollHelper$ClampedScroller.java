package androidx.core.widget;

import android.view.animation.AnimationUtils;

class AutoScrollHelper$ClampedScroller
{
  private long mDeltaTime = 0L;
  private int mDeltaX = 0;
  private int mDeltaY = 0;
  private int mEffectiveRampDown;
  private int mRampDownDuration;
  private int mRampUpDuration;
  private long mStartTime = Long.MIN_VALUE;
  private long mStopTime = -1L;
  private float mStopValue;
  private float mTargetVelocityX;
  private float mTargetVelocityY;
  
  private float getValueAt(long paramLong)
  {
    long l1 = mStartTime;
    if (paramLong < l1) {
      return 0.0F;
    }
    long l2 = mStopTime;
    if ((l2 >= 0L) && (paramLong >= l2))
    {
      float f = mStopValue;
      return AutoScrollHelper.constrain((float)(paramLong - l2) / mEffectiveRampDown, 0.0F, 1.0F) * f + (1.0F - f);
    }
    return AutoScrollHelper.constrain((float)(paramLong - l1) / mRampUpDuration, 0.0F, 1.0F) * 0.5F;
  }
  
  private float interpolateValue(float paramFloat)
  {
    return paramFloat * 4.0F + -4.0F * paramFloat * paramFloat;
  }
  
  public void computeScrollDelta()
  {
    if (mDeltaTime != 0L)
    {
      long l1 = AnimationUtils.currentAnimationTimeMillis();
      float f = interpolateValue(getValueAt(l1));
      long l2 = mDeltaTime;
      mDeltaTime = l1;
      f = (float)(l1 - l2) * f;
      mDeltaX = ((int)(mTargetVelocityX * f));
      mDeltaY = ((int)(f * mTargetVelocityY));
      return;
    }
    throw new RuntimeException("Cannot compute scroll delta before calling start()");
  }
  
  public int getDeltaX()
  {
    return mDeltaX;
  }
  
  public int getDeltaY()
  {
    return mDeltaY;
  }
  
  public int getHorizontalDirection()
  {
    float f = mTargetVelocityX;
    return (int)(f / Math.abs(f));
  }
  
  public int getVerticalDirection()
  {
    float f = mTargetVelocityY;
    return (int)(f / Math.abs(f));
  }
  
  public boolean isFinished()
  {
    boolean bool;
    if ((mStopTime > 0L) && (AnimationUtils.currentAnimationTimeMillis() > mStopTime + mEffectiveRampDown)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void requestStop()
  {
    long l = AnimationUtils.currentAnimationTimeMillis();
    mEffectiveRampDown = AutoScrollHelper.constrain((int)(l - mStartTime), 0, mRampDownDuration);
    mStopValue = getValueAt(l);
    mStopTime = l;
  }
  
  public void setRampDownDuration(int paramInt)
  {
    mRampDownDuration = paramInt;
  }
  
  public void setRampUpDuration(int paramInt)
  {
    mRampUpDuration = paramInt;
  }
  
  public void setTargetVelocity(float paramFloat1, float paramFloat2)
  {
    mTargetVelocityX = paramFloat1;
    mTargetVelocityY = paramFloat2;
  }
  
  public void start()
  {
    long l = AnimationUtils.currentAnimationTimeMillis();
    mStartTime = l;
    mStopTime = -1L;
    mDeltaTime = l;
    mStopValue = 0.5F;
    mDeltaX = 0;
    mDeltaY = 0;
  }
}

/* Location:
 * Qualified Name:     androidx.core.widget.AutoScrollHelper.ClampedScroller
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */