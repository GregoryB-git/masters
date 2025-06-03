package androidx.dynamicanimation.animation;

import androidx.annotation.FloatRange;

public final class FlingAnimation
  extends DynamicAnimation<FlingAnimation>
{
  private final DragForce mFlingForce;
  
  public FlingAnimation(FloatValueHolder paramFloatValueHolder)
  {
    super(paramFloatValueHolder);
    paramFloatValueHolder = new DragForce();
    mFlingForce = paramFloatValueHolder;
    paramFloatValueHolder.setValueThreshold(getValueThreshold());
  }
  
  public <K> FlingAnimation(K paramK, FloatPropertyCompat<K> paramFloatPropertyCompat)
  {
    super(paramK, paramFloatPropertyCompat);
    paramK = new DragForce();
    mFlingForce = paramK;
    paramK.setValueThreshold(getValueThreshold());
  }
  
  public float getAcceleration(float paramFloat1, float paramFloat2)
  {
    return mFlingForce.getAcceleration(paramFloat1, paramFloat2);
  }
  
  public float getFriction()
  {
    return mFlingForce.getFrictionScalar();
  }
  
  public boolean isAtEquilibrium(float paramFloat1, float paramFloat2)
  {
    boolean bool;
    if ((paramFloat1 < mMaxValue) && (paramFloat1 > mMinValue) && (!mFlingForce.isAtEquilibrium(paramFloat1, paramFloat2))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public FlingAnimation setFriction(@FloatRange(from=0.0D, fromInclusive=false) float paramFloat)
  {
    if (paramFloat > 0.0F)
    {
      mFlingForce.setFrictionScalar(paramFloat);
      return this;
    }
    throw new IllegalArgumentException("Friction must be positive");
  }
  
  public FlingAnimation setMaxValue(float paramFloat)
  {
    super.setMaxValue(paramFloat);
    return this;
  }
  
  public FlingAnimation setMinValue(float paramFloat)
  {
    super.setMinValue(paramFloat);
    return this;
  }
  
  public FlingAnimation setStartVelocity(float paramFloat)
  {
    super.setStartVelocity(paramFloat);
    return this;
  }
  
  public void setValueThreshold(float paramFloat)
  {
    mFlingForce.setValueThreshold(paramFloat);
  }
  
  public boolean updateValueAndVelocity(long paramLong)
  {
    DynamicAnimation.MassState localMassState = mFlingForce.updateValueAndVelocity(mValue, mVelocity, paramLong);
    float f1 = mValue;
    mValue = f1;
    float f2 = mVelocity;
    mVelocity = f2;
    float f3 = mMinValue;
    if (f1 < f3)
    {
      mValue = f3;
      return true;
    }
    f3 = mMaxValue;
    if (f1 > f3)
    {
      mValue = f3;
      return true;
    }
    return isAtEquilibrium(f1, f2);
  }
  
  public static final class DragForce
    implements Force
  {
    private static final float DEFAULT_FRICTION = -4.2F;
    private static final float VELOCITY_THRESHOLD_MULTIPLIER = 62.5F;
    private float mFriction = -4.2F;
    private final DynamicAnimation.MassState mMassState = new DynamicAnimation.MassState();
    private float mVelocityThreshold;
    
    public float getAcceleration(float paramFloat1, float paramFloat2)
    {
      return paramFloat2 * mFriction;
    }
    
    public float getFrictionScalar()
    {
      return mFriction / -4.2F;
    }
    
    public boolean isAtEquilibrium(float paramFloat1, float paramFloat2)
    {
      boolean bool;
      if (Math.abs(paramFloat2) < mVelocityThreshold) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public void setFrictionScalar(float paramFloat)
    {
      mFriction = (paramFloat * -4.2F);
    }
    
    public void setValueThreshold(float paramFloat)
    {
      mVelocityThreshold = (paramFloat * 62.5F);
    }
    
    public DynamicAnimation.MassState updateValueAndVelocity(float paramFloat1, float paramFloat2, long paramLong)
    {
      DynamicAnimation.MassState localMassState = mMassState;
      double d1 = paramFloat2;
      float f1 = (float)paramLong;
      mVelocity = ((float)(Math.exp(f1 / 1000.0F * mFriction) * d1));
      localMassState = mMassState;
      float f2 = mFriction;
      double d2 = paramFloat1 - paramFloat2 / f2;
      d1 = paramFloat2 / f2;
      mValue = ((float)(Math.exp(f2 * f1 / 1000.0F) * d1 + d2));
      localMassState = mMassState;
      if (isAtEquilibrium(mValue, mVelocity)) {
        mMassState.mVelocity = 0.0F;
      }
      return mMassState;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.dynamicanimation.animation.FlingAnimation
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */