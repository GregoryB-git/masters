package androidx.constraintlayout.motion.widget;

import android.view.animation.Interpolator;

public abstract class MotionInterpolator
  implements Interpolator
{
  public abstract float getInterpolation(float paramFloat);
  
  public abstract float getVelocity();
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.widget.MotionInterpolator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */