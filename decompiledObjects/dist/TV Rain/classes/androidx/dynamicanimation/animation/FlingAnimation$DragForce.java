package androidx.dynamicanimation.animation;

final class FlingAnimation$DragForce
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

/* Location:
 * Qualified Name:     androidx.dynamicanimation.animation.FlingAnimation.DragForce
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */