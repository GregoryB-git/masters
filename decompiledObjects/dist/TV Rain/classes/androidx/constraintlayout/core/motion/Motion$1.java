package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.DifferentialInterpolator;
import androidx.constraintlayout.core.motion.utils.Easing;

final class Motion$1
  implements DifferentialInterpolator
{
  public float mX;
  
  public Motion$1(Easing paramEasing) {}
  
  public float getInterpolation(float paramFloat)
  {
    mX = paramFloat;
    return (float)val$easing.get(paramFloat);
  }
  
  public float getVelocity()
  {
    return (float)val$easing.getDiff(mX);
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.motion.Motion.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */