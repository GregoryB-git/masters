package androidx.dynamicanimation.animation;

abstract interface Force
{
  public abstract float getAcceleration(float paramFloat1, float paramFloat2);
  
  public abstract boolean isAtEquilibrium(float paramFloat1, float paramFloat2);
}

/* Location:
 * Qualified Name:     androidx.dynamicanimation.animation.Force
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */