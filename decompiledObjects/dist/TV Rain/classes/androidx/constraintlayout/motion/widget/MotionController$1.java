package androidx.constraintlayout.motion.widget;

import android.view.animation.Interpolator;
import androidx.constraintlayout.core.motion.utils.Easing;

class MotionController$1
  implements Interpolator
{
  public MotionController$1(Easing paramEasing) {}
  
  public float getInterpolation(float paramFloat)
  {
    return (float)val$easing.get(paramFloat);
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.widget.MotionController.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */