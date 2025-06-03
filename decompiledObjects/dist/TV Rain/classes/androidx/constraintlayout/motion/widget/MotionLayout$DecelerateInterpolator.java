package androidx.constraintlayout.motion.widget;

class MotionLayout$DecelerateInterpolator
  extends MotionInterpolator
{
  public float currentP = 0.0F;
  public float initalV = 0.0F;
  public float maxA;
  
  public MotionLayout$DecelerateInterpolator(MotionLayout paramMotionLayout) {}
  
  public void config(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    initalV = paramFloat1;
    currentP = paramFloat2;
    maxA = paramFloat3;
  }
  
  public float getInterpolation(float paramFloat)
  {
    float f1 = initalV;
    if (f1 > 0.0F)
    {
      f2 = maxA;
      f3 = paramFloat;
      if (f1 / f2 < paramFloat) {
        f3 = f1 / f2;
      }
      this$0.mLastVelocity = (f1 - f2 * f3);
      return f1 * f3 - f2 * f3 * f3 / 2.0F + currentP;
    }
    float f4 = -f1;
    float f2 = maxA;
    float f3 = paramFloat;
    if (f4 / f2 < paramFloat) {
      f3 = -f1 / f2;
    }
    this$0.mLastVelocity = (f2 * f3 + f1);
    return f2 * f3 * f3 / 2.0F + f1 * f3 + currentP;
  }
  
  public float getVelocity()
  {
    return this$0.mLastVelocity;
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.widget.MotionLayout.DecelerateInterpolator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */