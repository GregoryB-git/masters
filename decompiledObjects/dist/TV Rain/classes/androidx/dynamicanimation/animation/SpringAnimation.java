package androidx.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;

public final class SpringAnimation
  extends DynamicAnimation<SpringAnimation>
{
  private static final float UNSET = Float.MAX_VALUE;
  private boolean mEndRequested = false;
  private float mPendingPosition = Float.MAX_VALUE;
  private SpringForce mSpring = null;
  
  public SpringAnimation(FloatValueHolder paramFloatValueHolder)
  {
    super(paramFloatValueHolder);
  }
  
  public <K> SpringAnimation(K paramK, FloatPropertyCompat<K> paramFloatPropertyCompat)
  {
    super(paramK, paramFloatPropertyCompat);
  }
  
  public <K> SpringAnimation(K paramK, FloatPropertyCompat<K> paramFloatPropertyCompat, float paramFloat)
  {
    super(paramK, paramFloatPropertyCompat);
    mSpring = new SpringForce(paramFloat);
  }
  
  private void sanityCheck()
  {
    SpringForce localSpringForce = mSpring;
    if (localSpringForce != null)
    {
      double d = localSpringForce.getFinalPosition();
      if (d <= mMaxValue)
      {
        if (d >= mMinValue) {
          return;
        }
        throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
      }
      throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
    }
    throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
  }
  
  public void animateToFinalPosition(float paramFloat)
  {
    if (isRunning())
    {
      mPendingPosition = paramFloat;
    }
    else
    {
      if (mSpring == null) {
        mSpring = new SpringForce(paramFloat);
      }
      mSpring.setFinalPosition(paramFloat);
      start();
    }
  }
  
  public boolean canSkipToEnd()
  {
    boolean bool;
    if (mSpring.mDampingRatio > 0.0D) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public float getAcceleration(float paramFloat1, float paramFloat2)
  {
    return mSpring.getAcceleration(paramFloat1, paramFloat2);
  }
  
  public SpringForce getSpring()
  {
    return mSpring;
  }
  
  public boolean isAtEquilibrium(float paramFloat1, float paramFloat2)
  {
    return mSpring.isAtEquilibrium(paramFloat1, paramFloat2);
  }
  
  public SpringAnimation setSpring(SpringForce paramSpringForce)
  {
    mSpring = paramSpringForce;
    return this;
  }
  
  public void setValueThreshold(float paramFloat) {}
  
  public void skipToEnd()
  {
    if (canSkipToEnd())
    {
      if (Looper.myLooper() == Looper.getMainLooper())
      {
        if (mRunning) {
          mEndRequested = true;
        }
        return;
      }
      throw new AndroidRuntimeException("Animations may only be started on the main thread");
    }
    throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
  }
  
  public void start()
  {
    sanityCheck();
    mSpring.setValueThreshold(getValueThreshold());
    super.start();
  }
  
  public boolean updateValueAndVelocity(long paramLong)
  {
    if (mEndRequested)
    {
      f = mPendingPosition;
      if (f != Float.MAX_VALUE)
      {
        mSpring.setFinalPosition(f);
        mPendingPosition = Float.MAX_VALUE;
      }
      mValue = mSpring.getFinalPosition();
      mVelocity = 0.0F;
      mEndRequested = false;
      return true;
    }
    Object localObject;
    if (mPendingPosition != Float.MAX_VALUE)
    {
      mSpring.getFinalPosition();
      localObject = mSpring;
      double d1 = mValue;
      double d2 = mVelocity;
      paramLong /= 2L;
      localObject = ((SpringForce)localObject).updateValues(d1, d2, paramLong);
      mSpring.setFinalPosition(mPendingPosition);
      mPendingPosition = Float.MAX_VALUE;
      localObject = mSpring.updateValues(mValue, mVelocity, paramLong);
      mValue = mValue;
      mVelocity = mVelocity;
    }
    else
    {
      localObject = mSpring.updateValues(mValue, mVelocity, paramLong);
      mValue = mValue;
      mVelocity = mVelocity;
    }
    float f = Math.max(mValue, mMinValue);
    mValue = f;
    f = Math.min(f, mMaxValue);
    mValue = f;
    if (isAtEquilibrium(f, mVelocity))
    {
      mValue = mSpring.getFinalPosition();
      mVelocity = 0.0F;
      return true;
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     androidx.dynamicanimation.animation.SpringAnimation
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */