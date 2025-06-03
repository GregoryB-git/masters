package y1;

import android.view.animation.Animation;
import android.view.animation.Transformation;

public final class e$h
  extends Animation
{
  public e$h(e parame) {}
  
  public final void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    paramTransformation = a;
    float f = mStartingScale;
    paramTransformation.setAnimationProgress(-f * paramFloat + f);
    a.moveToStart(paramFloat);
  }
}

/* Location:
 * Qualified Name:     y1.e.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */