package androidx.constraintlayout.motion.widget;

import android.view.animation.Interpolator;
import androidx.constraintlayout.core.motion.utils.Easing;

class MotionScene$1
  implements Interpolator
{
  public MotionScene$1(MotionScene paramMotionScene, Easing paramEasing) {}
  
  public float getInterpolation(float paramFloat)
  {
    return (float)val$easing.get(paramFloat);
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.widget.MotionScene.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */