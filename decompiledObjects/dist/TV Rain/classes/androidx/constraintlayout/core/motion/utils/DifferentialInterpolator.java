package androidx.constraintlayout.core.motion.utils;

public abstract interface DifferentialInterpolator
{
  public abstract float getInterpolation(float paramFloat);
  
  public abstract float getVelocity();
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.DifferentialInterpolator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */