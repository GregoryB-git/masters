package androidx.dynamicanimation.animation;

import androidx.annotation.FloatRange;
import androidx.annotation.RestrictTo;

public final class SpringForce
  implements Force
{
  public static final float DAMPING_RATIO_HIGH_BOUNCY = 0.2F;
  public static final float DAMPING_RATIO_LOW_BOUNCY = 0.75F;
  public static final float DAMPING_RATIO_MEDIUM_BOUNCY = 0.5F;
  public static final float DAMPING_RATIO_NO_BOUNCY = 1.0F;
  public static final float STIFFNESS_HIGH = 10000.0F;
  public static final float STIFFNESS_LOW = 200.0F;
  public static final float STIFFNESS_MEDIUM = 1500.0F;
  public static final float STIFFNESS_VERY_LOW = 50.0F;
  private static final double UNSET = Double.MAX_VALUE;
  private static final double VELOCITY_THRESHOLD_MULTIPLIER = 62.5D;
  private double mDampedFreq;
  public double mDampingRatio = 0.5D;
  private double mFinalPosition = Double.MAX_VALUE;
  private double mGammaMinus;
  private double mGammaPlus;
  private boolean mInitialized = false;
  private final DynamicAnimation.MassState mMassState = new DynamicAnimation.MassState();
  public double mNaturalFreq = Math.sqrt(1500.0D);
  private double mValueThreshold;
  private double mVelocityThreshold;
  
  public SpringForce() {}
  
  public SpringForce(float paramFloat)
  {
    mFinalPosition = paramFloat;
  }
  
  private void init()
  {
    if (mInitialized) {
      return;
    }
    if (mFinalPosition != Double.MAX_VALUE)
    {
      double d1 = mDampingRatio;
      double d3;
      if (d1 > 1.0D)
      {
        double d2 = -d1;
        d3 = mNaturalFreq;
        mGammaPlus = (Math.sqrt(d1 * d1 - 1.0D) * d3 + d2 * d3);
        d1 = mDampingRatio;
        d2 = -d1;
        d3 = mNaturalFreq;
        mGammaMinus = (d2 * d3 - Math.sqrt(d1 * d1 - 1.0D) * d3);
      }
      else if ((d1 >= 0.0D) && (d1 < 1.0D))
      {
        d3 = mNaturalFreq;
        mDampedFreq = (Math.sqrt(1.0D - d1 * d1) * d3);
      }
      mInitialized = true;
      return;
    }
    throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public float getAcceleration(float paramFloat1, float paramFloat2)
  {
    float f = getFinalPosition();
    double d1 = mNaturalFreq;
    double d2 = mDampingRatio;
    return (float)(-(d1 * d1) * (paramFloat1 - f) - d1 * 2.0D * d2 * paramFloat2);
  }
  
  public float getDampingRatio()
  {
    return (float)mDampingRatio;
  }
  
  public float getFinalPosition()
  {
    return (float)mFinalPosition;
  }
  
  public float getStiffness()
  {
    double d = mNaturalFreq;
    return (float)(d * d);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public boolean isAtEquilibrium(float paramFloat1, float paramFloat2)
  {
    return (Math.abs(paramFloat2) < mVelocityThreshold) && (Math.abs(paramFloat1 - getFinalPosition()) < mValueThreshold);
  }
  
  public SpringForce setDampingRatio(@FloatRange(from=0.0D) float paramFloat)
  {
    if (paramFloat >= 0.0F)
    {
      mDampingRatio = paramFloat;
      mInitialized = false;
      return this;
    }
    throw new IllegalArgumentException("Damping ratio must be non-negative");
  }
  
  public SpringForce setFinalPosition(float paramFloat)
  {
    mFinalPosition = paramFloat;
    return this;
  }
  
  public SpringForce setStiffness(@FloatRange(from=0.0D, fromInclusive=false) float paramFloat)
  {
    if (paramFloat > 0.0F)
    {
      mNaturalFreq = Math.sqrt(paramFloat);
      mInitialized = false;
      return this;
    }
    throw new IllegalArgumentException("Spring stiffness constant must be positive.");
  }
  
  public void setValueThreshold(double paramDouble)
  {
    paramDouble = Math.abs(paramDouble);
    mValueThreshold = paramDouble;
    mVelocityThreshold = (paramDouble * 62.5D);
  }
  
  public DynamicAnimation.MassState updateValues(double paramDouble1, double paramDouble2, long paramLong)
  {
    init();
    double d1 = paramLong / 1000.0D;
    paramDouble1 -= mFinalPosition;
    double d2 = mDampingRatio;
    double d3;
    double d4;
    double d5;
    if (d2 > 1.0D)
    {
      d3 = mGammaMinus;
      d2 = mGammaPlus;
      d4 = paramDouble1 - (d3 * paramDouble1 - paramDouble2) / (d3 - d2);
      paramDouble1 = (paramDouble1 * d3 - paramDouble2) / (d3 - d2);
      paramDouble2 = Math.pow(2.718281828459045D, d3 * d1);
      paramDouble2 = Math.pow(2.718281828459045D, mGammaPlus * d1) * paramDouble1 + paramDouble2 * d4;
      d3 = mGammaMinus;
      d2 = Math.pow(2.718281828459045D, d3 * d1);
      d5 = mGammaPlus;
      paramDouble1 = Math.pow(2.718281828459045D, d5 * d1) * (paramDouble1 * d5) + d2 * (d4 * d3);
    }
    else if (d2 == 1.0D)
    {
      d3 = mNaturalFreq;
      d4 = d3 * paramDouble1 + paramDouble2;
      paramDouble2 = d4 * d1 + paramDouble1;
      d3 = Math.pow(2.718281828459045D, -d3 * d1);
      d2 = Math.pow(2.718281828459045D, -mNaturalFreq * d1);
      paramDouble1 = mNaturalFreq;
      d5 = -paramDouble1;
      paramDouble1 = Math.pow(2.718281828459045D, -paramDouble1 * d1) * d4 + d2 * paramDouble2 * d5;
      paramDouble2 = d3 * paramDouble2;
    }
    else
    {
      d4 = 1.0D / mDampedFreq;
      d3 = mNaturalFreq;
      d4 = (d2 * d3 * paramDouble1 + paramDouble2) * d4;
      paramDouble2 = Math.pow(2.718281828459045D, -d2 * d3 * d1);
      d3 = Math.cos(mDampedFreq * d1);
      paramDouble2 = (Math.sin(mDampedFreq * d1) * d4 + d3 * paramDouble1) * paramDouble2;
      d5 = mNaturalFreq;
      d3 = -d5;
      d2 = mDampingRatio;
      d5 = Math.pow(2.718281828459045D, -d2 * d5 * d1);
      double d6 = mDampedFreq;
      double d7 = -d6;
      double d8 = Math.sin(d6 * d1);
      d6 = mDampedFreq;
      paramDouble1 = (Math.cos(d6 * d1) * (d4 * d6) + d8 * (d7 * paramDouble1)) * d5 + d3 * paramDouble2 * d2;
    }
    DynamicAnimation.MassState localMassState = mMassState;
    mValue = ((float)(paramDouble2 + mFinalPosition));
    mVelocity = ((float)paramDouble1);
    return localMassState;
  }
}

/* Location:
 * Qualified Name:     androidx.dynamicanimation.animation.SpringForce
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */